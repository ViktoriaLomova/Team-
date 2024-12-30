package DAO;

import DBObjects.User;
//import org.json.JSONObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements UserDAO{
    @Override
    public User get(int id) throws SQLException {
        Connection con=Database.getConnection();
        User user=null;
        String sql ="SELECT UserID,Name,Email,Password,ProfilePicture FROM [dbo].[User] WHERE UserID=?;";
        PreparedStatement ps =con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();

        if(rs.next()){
            int userID_=rs.getInt("UserId");
            String Name_=rs.getString("Name");
            String Email_=rs.getString("Email");
            String Password_=rs.getString("Password");
            byte[] profilePicture_;
            profilePicture_ = rs.getBytes("ProfilePicture");
            user=new User(userID_,Name_,Email_,Password_,profilePicture_);
        }

 //       JSONObject jo= null;
   //     if (user != null) {
  //          jo = new JSONObject(user);
  //          String myJson=jo.toString();
  //          System.out.print(myJson);
   //     }
        return user;
    }

    @Override
    public List<User> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(User user) throws SQLException {
        return 0;
    }

    @Override
    public int insert(User user) throws SQLException {
        Connection con=Database.getConnection();
        String sql="INSERT INTO [dbo].[User] (UserID,Name, Email, Password, ProfilePicture) VALUES(?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);

        int i=user.getUserId();
        UserDAO userDAO=new UserDAOImpl();
        User user1=userDAO.get(i);
        if(user1!=null){
            return 0;
        }
        ps.setInt(1,user.getUserId());
        ps.setString(2,user.getName());
        ps.setString(3,user.getEmail());
        ps.setString(4,user.getPassword());
        ps.setBytes(5, user.getProfilePicture());

        int result=ps.executeUpdate();
        Database.closePreparedStatement(ps);
        Database.closeConnection(con);

        return result;
    }

    @Override
    public int update(User user) throws SQLException {
        Connection con=Database.getConnection();
        String sql="UPDATE [dbo].[User] set UserID=?,Name=?, Email=?, Password=?, ProfilePicture=? WHERE UserID=?";

        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,user.getUserId());
        ps.setString(2,user.getName());
        ps.setString(3,user.getEmail());
        ps.setString(4,user.getPassword());
        ps.setBytes(5,user.getProfilePicture());
        ps.setInt(6,user.getUserId());

        int result = ps.executeUpdate();
        Database.closePreparedStatement(ps);
        Database.closeConnection(con);
        return result;
    }

    @Override
    public int delete(User user) throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "DELETE FROM [dbo].[User] WHERE userID = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, user.getUserId());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return result;

    }
}
