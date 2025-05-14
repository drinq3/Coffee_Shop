package coffee_shop;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

public class loginFrame extends javax.swing.JFrame {

    Connection conn = null;

    public loginFrame() {
        initComponents();
        conn = javaConnection.database();
        setupDatabase();
        createTable();
        hover(signUp);

    }

    void createTable() {
        try (PreparedStatement pst = conn.prepareStatement("CREATE TABLE IF NOT EXISTS users ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "username VARCHAR(100), "
                + "password VARCHAR(100))")) {
            pst.executeUpdate();
            System.out.println("Successfully created users table");
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

  void setupDatabase() {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS CoffeeDatabase");
            stmt.executeUpdate("USE CoffeeDatabase");

            try (PreparedStatement pstPreviousTable = conn.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS PreviousCoffeeTable ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "item_name VARCHAR(100) NOT NULL, "
                    + "item_quantity VARCHAR(100) NOT NULL, "
                    + "item_amount VARCHAR(100) NOT NULL, "
                    + "order_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP)")) {
                pstPreviousTable.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }


    void hover(JLabel main) {

        main.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                main.setBorder(new MatteBorder(0, 0, 2, 0, Color.white));

            }

            @Override
            public void mouseExited(MouseEvent e) {
                main.setBorder(null);

            }

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JPasswordField();
        signUp = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        main.setBackground(new java.awt.Color(243, 233, 220));
        main.setForeground(new java.awt.Color(243, 233, 220));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\frances claire\\Downloads\\495049734_1392593778595957_1263294116369072733_n-removebg-preview.png")); // NOI18N
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, -1, 360));

        t1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        main.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 200, 30));

        t2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        main.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 200, 30));

        signUp.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        signUp.setForeground(new java.awt.Color(137, 87, 55));
        signUp.setText("Sign Up");
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpMousePressed(evt);
            }
        });
        main.add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 50, 20));

        a1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        a1.setForeground(new java.awt.Color(137, 87, 55));
        a1.setText("Username");
        main.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 150, 20));

        jLabel4.setFont(a1.getFont());
        jLabel4.setForeground(a1.getForeground());
        jLabel4.setText("Password");
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, 20));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(137, 87, 55));
        jLabel5.setText("Don't have an account?");
        main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 130, 20));

        jButton1.setBackground(new java.awt.Color(94, 48, 35));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(243, 233, 220));
        jButton1.setText("Login");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        main.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 100, 30));

        jPanel1.setBackground(new java.awt.Color(137, 87, 55));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 233, 220));
        jLabel3.setText("EST.2025");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\frances claire\\Downloads\\489730969_712958511277271_8778384744056085055_n-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, 440, -1));

        main.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 380, 500));

        getContentPane().add(main, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(814, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sign_in();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void signUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMousePressed
        new registerFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signUpMousePressed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        sign_in();
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        sign_in();
    }//GEN-LAST:event_t2ActionPerformed

    void sign_in() {
        String user = t1.getText();
        String password = new String(t2.getPassword());

        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill the username field");
            t1.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill the password field");
            t2.requestFocus();
            return;
        }

        try (PreparedStatement pst = conn.prepareStatement("SELECT * FROM users WHERE username = ?")) {
            pst.setString(1, user);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {

                    String storedPassword = rs.getString("password");
                    if (password.equals(storedPassword)) {

                        JOptionPane.showMessageDialog(null, "Login Successfully");
                        new home().setVisible(true);
                        this.dispose();
                    } else {

                        JOptionPane.showMessageDialog(null, "Wrong password for the username");
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "Username doesn't exist");
                }
            }
        } catch (SQLException e) {
            System.err.println(e);

        }
    }

    public static void main(String args[]) {
        FlatLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new loginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel main;
    private javax.swing.JLabel signUp;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
