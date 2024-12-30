package main.java;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import DBObjects.User;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class HelloWorld extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username"); // Ensure your form field name is "email"
        String password = request.getParameter("password"); // Ensure your form field name is "password"

        // Create a User entity
        User user = new User(2, "JaneDoe", username, password, null);

        // Here you can save the user to a database, send it back to the client, etc.
        // For example, you might want to print the user object's state to the console
        System.out.println("User logged in with email: " + user.getEmail());

        // Set response attributes or redirect as needed
        response.setContentType("text/html");
        response.getWriter().println("User logged in successfully!");
    }
}
