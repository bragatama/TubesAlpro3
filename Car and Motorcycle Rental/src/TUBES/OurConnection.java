/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUBES;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Braga
 */
public class OurConnection {
    
    public Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tubesalpro?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
