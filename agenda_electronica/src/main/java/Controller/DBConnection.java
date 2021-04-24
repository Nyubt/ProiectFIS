/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.text.SimpleDateFormat;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;

/**
 *
 * @author Elena
 */
public class DBConnection {

      public static void main(String[] args) throws ParseException
      {
        try{
            Class.forName("org.sqlite.JDBC");
            //DriverManager.registerDriver(new org.sqlite.JDBC());
        } catch(Exception e){
            System.out.println("Message 1 " + e.getMessage());
        }
        Connection connection = null;
        try
        {
          // create a database connection
          connection = DriverManager.getConnection("jdbc:sqlite:" + System.getProperty("user.dir") + "\\src\\main\\resources\\CalendarDB.s3db");
          Statement statement = connection.createStatement();
          Statement statement2 = connection.createStatement();
          statement.setQueryTimeout(30);  // set timeout to 30 sec.

          ResultSet rs = statement.executeQuery("select * from Events");
          while(rs.next())
          {
            // read the result set
            ResultSet al = statement2.executeQuery("select * from Alarms where AlarmId=" + rs.getString("AlarmId"));
            SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
            Date date=formatter1.parse(rs.getString("StartDate") + " " + rs.getString("StartTime"));  
            System.out.println("title = " + rs.getString("Title"));
            System.out.println("id = " + rs.getInt("EventId"));
            System.out.println("Date = " + rs.getString("StartDate"));
            System.out.println("Time = " + rs.getString("StartTime"));
            System.out.println("DateTime = " + date.toString());
            System.out.println("Activa = " + rs.getString("AlarmActive"));
            System.out.println("Activa = " + (rs.getObject("AlarmActive") == null ? "false" : "true"));
            System.out.println("Inactive = " + rs.getString("Inactive"));
            System.out.println("Inactive = " + (rs.getObject("Inactive") == null ? "false" : "true"));
            System.out.println("Alarma snooze = " + al.getInt("Snooze"));
            System.out.println("Alarma ReminderMinutes = " + al.getInt("ReminderMinutes"));
            System.out.println();
          }
        }
        catch(SQLException e)
        {
          // if the error message is "out of memory",
          // it probably means no database file is found
          System.err.println("Message 2 " + e.getMessage());
        }
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e.getMessage());
          }
        }
      }
}
