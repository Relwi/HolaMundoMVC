/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iker
 */
public class ServerModelImplementation implements Model {
    private Connection con;
    private ResourceBundle rb = ResourceBundle.getBundle("config.config");
    private String getGreetingServer = "SELECT text FROM hola_mundo";
    
    private void openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Properties connectionProps = new Properties();
            connectionProps.put("user", rb.getString("user"));
            connectionProps.put("password", rb.getString("password"));
            this.con = DriverManager.getConnection(rb.getString("host"), connectionProps);
        } catch (SQLException ex) {
            Logger.getLogger(ServerModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServerModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void closeConnection() throws SQLException {
        con.close();
    }
    
    @Override
    public String getGreeting(){
        String greeting = null;
      
        try {
            this.openConnection();
            Statement s = con.createStatement ();
            s.executeQuery (getGreetingServer);
            ResultSet rs = s.getResultSet ();
            while (rs.next ()) {
               greeting = rs.getString("text");
            }
            rs.close();
            s.close();
            this.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ServerModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return greeting;
    }
}
