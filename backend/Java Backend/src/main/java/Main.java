//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import DAO.Database;
import DAO.UserDAO;
import DAO.UserDAOImpl;
import DBObjects.User;
import org.json.JSONObject;
import netscape.javascript.JSObject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*Connection con= Database.getConnection();
        if (con!=null){
            System.out.print("Connection established");
        }
        UserDAO userDAO=new UserDAOImpl();
        User user=userDAO.get(1);
        System.out.print(user.toString());*/

        UserDAO userDAO=new UserDAOImpl();//create
        int result;
        User user=new User(3,"Maggie Smith","smithmail1993@gmail.com","superdupersequrepassword",null);
        userDAO.insert(user);
        //System.out.print(userDAO.get(3).toString());//read
        //User user1=new User(3,"Maggie Smith","smithmail1993@gmail.com","superdupersequrepassword123",null);
        //userDAO.update(user1);//update
        //userDAO.delete(user1);//delete

    }//тестирование, логирование ,Jwt, java web socket
}