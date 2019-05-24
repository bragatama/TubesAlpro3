/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUBES;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Child extends Parent {

    @Override
    public void addMobill(String n_mobil, String name_mobil, String tahun_mobil, String harga_mobil) {
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
    public void addMotorr(String n_motor, String name_motor, String tahun_motor, String harga_motor) {
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
}
