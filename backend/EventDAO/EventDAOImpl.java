import java.sql.SQLException;
import java.util.List;

public class EventDAOImpl implements EventDAO{
    @Override
    public Event get(int id) throws SQLException {
        Connection con=Database.getConnection();
        Event event=null;
        String sql ="SELECT EventID,Name,EventPicture FROM [dbo].[Event] WHERE EventID=?;";
        PreparedStatement ps =con.prepareStatement(sql);
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
user
        if(rs.next()){
            int eventID_=rs.getInt("EventId");
            String Name_=rs.getString("Name");
            byte[] profilePicture_;
            profilePicture_ = rs.getBytes("EventPicture");
            event=new Event(eventID_,Name_,EventPicture_);
        }

        JSONObject jo= null;
        if (event != null) {
            jo = new JSONObject(event);
            String myJson=jo.toString();
            System.out.print(myJson);
        }
        return event;
    }

    @Override
    public List<Event> getAll() throws SQLException {
        return List.of();
    }

    @Override
    public int save(Event event) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Event event) throws SQLException {
        Connection con=Database.getConnection();
        String sql="INSERT INTO [dbo].[Event] (EventID,Name,EventPicture) VALUES(?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);

        int i=event.getEventId();
        EventDAO eventDAO=new EventDAOImpl();
        Event event1=eventDAO.get(i);
        if(event1!=null){
            return 0;
        }
        ps.setInt(1,event.getEventId());
        ps.setString(2,event.getName());
        ps.setBytes(3, event.getEventPicture());

        int result=ps.executeUpdate();
        Database.closePreparedStatement(ps);
        Database.closeConnection(con);

        return result;
    }

    @Override
    public int update(Event event) throws SQLException {
        Connection con=Database.getConnection();
        String sql="UPDATE [dbo].[Event] set EventID=?,Name=?,EventPicture=? WHERE EventID=?";

        PreparedStatement ps=con.prepareStatement(sql);
        ps.setInt(1,event.getEventId());
        ps.setString(2,event.getName());
        ps.setBytes(3,event.getEventPicture());
        ps.setInt(4,event.getEventId());

        int result = ps.executeUpdate();
        Database.closePreparedStatement(ps);
        Database.closeConnection(con);
        return result;
    }

    @Override
    public int delete(Event event) throws SQLException {
        Connection connection = Database.getConnection();

        String sql = "DELETE FROM [dbo].[Event] WHERE EventID = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1, event.getEventId());

        int result = ps.executeUpdate();

        Database.closePreparedStatement(ps);
        Database.closeConnection(connection);

        return result;

    }
}
