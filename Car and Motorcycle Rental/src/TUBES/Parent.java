/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUBES;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Parent implements Pilihan{

    
    public void register(String fname, String lname, String uname, String pass, String pass1) {

        Connection conn = new OurConnection().getConnection();

        if (uname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the username!");
        } else if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the password!");
        } else if (!pass.equals(pass1)) {
            JOptionPane.showMessageDialog(null, "Password don't match!");
        } else {

            String query = "INSERT INTO logindata(u_fname, u_lname, u_uname, u_pass) VALUES ('" + fname + "','" + lname + "','" + uname + "','" + pass + "');";

            JOptionPane.showMessageDialog(null, "Account has been created");
            try {
                Statement st = conn.createStatement();
                st.executeUpdate(query);

            } catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void addMotorr(String n_motor, String name_motor, String tahun_motor, String harga_motor){
        PreparedStatement ps;
        if (n_motor.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the field!");
        } else if (name_motor.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the field!");
        } else if (tahun_motor.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the field!");
        } else if (harga_motor.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the field!");
        } else {
            String query = "INSERT INTO `motor`(`id_motor`, `nama_motor`, `tahun_motor`, `harga_motor`) VALUES (?,?,?,?)";

            try {
                Connection conn = new OurConnection().getConnection();
                ps = conn.prepareStatement(query);

                ps.setString(1, n_motor);
                ps.setString(2, name_motor);
                ps.setString(3, tahun_motor);
                ps.setString(4, harga_motor);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Data motor ditambahkan!");
                    Admin adm = new Admin();
                    adm.setVisible(true);
                    adm.pack();
                    adm.setLocationRelativeTo(null);
                    adm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }

            } catch (SQLException ex) {
                Logger.getLogger(AddMotor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void addMobill(String n_mobil, String name_mobil, String tahun_mobil, String harga_mobil){
        PreparedStatement ps;
        if (n_mobil.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the field!");
        } else if (name_mobil.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the field!");
        } else if (tahun_mobil.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the field!");
        } else if (harga_mobil.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the field!");
        } else {

            String query = "INSERT INTO mobil(id_mobil, nama_mobil, tahun_mobil, harga_mobil) VALUES (?,?,?,?);";

            try {
                Connection conn = new OurConnection().getConnection();
                ps = conn.prepareStatement(query);

                ps.setString(1, n_mobil);
                ps.setString(2, name_mobil);
                ps.setString(3, tahun_mobil);
                ps.setString(4, harga_mobil);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Data Mobil telah ditambahkan!");
                    Admin a = new Admin();
                    a.setVisible(true);
                    a.pack();
                    a.setLocationRelativeTo(null);
                    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddMobil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void tableUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tablePemesanan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tableMobil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tableMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
