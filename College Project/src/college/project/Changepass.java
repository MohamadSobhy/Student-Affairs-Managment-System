package college.project;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Changepass extends javax.swing.JFrame {

    Connection con;

    public Changepass() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(Changepass.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Admin Settings");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        currentUsername = new javax.swing.JLabel();
        currentUsernameField = new javax.swing.JTextField();
        currentPassword = new javax.swing.JLabel();
        newUsername = new javax.swing.JLabel();
        newUsernameField = new javax.swing.JTextField();
        newPassword = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JLabel();
        saveChanges = new javax.swing.JButton();
        back = new javax.swing.JButton();
        currentPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        saveChanges1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        currentUsername.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        currentUsername.setText("Current Username :");

        currentUsernameField.setBackground(new java.awt.Color(204, 204, 204));
        currentUsernameField.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        currentUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentUsernameFieldActionPerformed(evt);
            }
        });

        currentPassword.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        currentPassword.setText("Current Password :");

        newUsername.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        newUsername.setText("New Username :");

        newUsernameField.setBackground(new java.awt.Color(204, 204, 204));
        newUsernameField.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        newUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUsernameFieldActionPerformed(evt);
            }
        });

        newPassword.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        newPassword.setText("New Password :");

        confirmPassword.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        confirmPassword.setText("Confirm Password :");

        saveChanges.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        saveChanges.setText("Save Changes");
        saveChanges.setToolTipText("Change Username or Password to the New Username and Password");
        saveChanges.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        back.setText("Back");
        back.setToolTipText("Back to Login Page");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        currentPasswordField.setBackground(new java.awt.Color(204, 204, 204));
        currentPasswordField.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        currentPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPasswordFieldActionPerformed(evt);
            }
        });

        newPasswordField.setBackground(new java.awt.Color(204, 204, 204));
        newPasswordField.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        newPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordFieldActionPerformed(evt);
            }
        });

        confirmPasswordField.setBackground(new java.awt.Color(204, 204, 204));
        confirmPasswordField.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        confirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFieldActionPerformed(evt);
            }
        });

        saveChanges1.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        saveChanges1.setText("New User");
        saveChanges1.setToolTipText("Add New Admin");
        saveChanges1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveChanges1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChanges1ActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        delete.setText("Delete User");
        delete.setToolTipText("Back to Login Page");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(currentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(currentUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                            .addComponent(newUsernameField)
                            .addComponent(currentPasswordField)
                            .addComponent(newPasswordField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(saveChanges1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveChanges)
                .addGap(18, 18, 18)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currentPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(currentPasswordField))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveChanges1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currentUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentUsernameFieldActionPerformed

    private void newUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUsernameFieldActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        new Login2().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void saveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesActionPerformed

        try {

            boolean check = false;

            PreparedStatement stmt2 = con.prepareStatement("select * from admin");
            ResultSet result = stmt2.executeQuery();

            while (result.next()) {
                if (result.getString(1).equals(currentUsernameField.getText()) && result.getString(2).equals(String.valueOf(currentPasswordField.getPassword()))) {
                    check = true;
                    break;
                }
            }
            if (check) {

                if (String.valueOf(newPasswordField.getPassword()).equals(String.valueOf(confirmPasswordField.getPassword()))) {

                    PreparedStatement stmt = con.prepareStatement("update admin set Username=? ,Password=? where Username=? and Password=?");
                    stmt.setString(1, newUsernameField.getText());
                    stmt.setString(2, String.valueOf(newPasswordField.getPassword()));
                    stmt.setString(3, currentUsernameField.getText());
                    stmt.setString(4, String.valueOf(currentPasswordField.getPassword()));

                    stmt.executeUpdate();

                    currentUsernameField.setText("");
                    newUsernameField.setText("");
                    currentPasswordField.setText("");
                    newPasswordField.setText("");
                    confirmPasswordField.setText("");

                    JOptionPane.showMessageDialog(this, "Changes Saved Successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error .. Password Not Matches");
                }
            } else {
                //JOptionPane.showMessageDialog(this,"Invalid Username Or Password.");
                JOptionPane.showMessageDialog(this, "Invalid Username Or Password.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Changepass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveChangesActionPerformed

    private void newPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPasswordFieldActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    private void currentPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentPasswordFieldActionPerformed

    private void saveChanges1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChanges1ActionPerformed

        try {
            boolean check = false;

            PreparedStatement stmt2 = con.prepareStatement("select * from admin");
            ResultSet result = stmt2.executeQuery();

            while (result.next()) {
                if (result.getString(1).equals(currentUsernameField.getText()) && result.getString(2).equals(String.valueOf(currentPasswordField.getPassword()))) {
                    check = true;
                    break;
                }
            }
            if (check) {
                if (String.valueOf(newPasswordField.getPassword()).equals(String.valueOf(confirmPasswordField.getPassword()))) {

                    PreparedStatement stmt3 = con.prepareStatement("select * from admin");
                    ResultSet result2 = stmt3.executeQuery();

                    while (result2.next()) {
                        if (result2.getString(1).equals(newUsernameField.getText()) && result2.getString(2).equals(String.valueOf(newPasswordField.getPassword()))) {

                            JOptionPane.showMessageDialog(this, "This new Username and Password is already exist.");
                            break;

                        } else {
                            PreparedStatement stmt = con.prepareStatement("insert into admin (Username,Password) values(?,?)");
                            stmt.setString(1, newUsernameField.getText());
                            stmt.setString(2, String.valueOf(newPasswordField.getPassword()));
                            stmt.executeUpdate();
                            JOptionPane.showMessageDialog(this, "New User Added Successfully");

                            currentUsernameField.setText("");
                            newUsernameField.setText("");
                            currentPasswordField.setText("");
                            newPasswordField.setText("");
                            confirmPasswordField.setText("");
                            break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error .. Password Not Matches");
                }
            } else {

                JOptionPane.showMessageDialog(this, "Invalid Username Or Password.", "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Changepass.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_saveChanges1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try {

            boolean check = false;
            int count = 0;

            PreparedStatement stmt2 = con.prepareStatement("select * from admin");
            ResultSet result = stmt2.executeQuery();

            while (result.next()) {
                if (result.getString(1).equals(currentUsernameField.getText()) && result.getString(2).equals(String.valueOf(currentPasswordField.getPassword()))) {
                    check = true;
                    break;
                }
            }
            if (check) {

                if (String.valueOf(newPasswordField.getPassword()).equals(String.valueOf(confirmPasswordField.getPassword()))) {

                    PreparedStatement stmt3 = con.prepareStatement("select * from admin");
                    ResultSet result2 = stmt3.executeQuery();
                    while (result2.next()) {
                        count++;
                    }
                    if (count == 1) {
                        JOptionPane.showMessageDialog(this, "He is the only admin. you can't delete him.");
                        return;
                    }

                    PreparedStatement stmt = con.prepareStatement("delete from admin where Username=? and Password=?");

                    stmt.setString(1, currentUsernameField.getText());
                    stmt.setString(2, String.valueOf(currentPasswordField.getPassword()));

                    stmt.executeUpdate();

                    currentUsernameField.setText("");
                    newUsernameField.setText("");
                    currentPasswordField.setText("");
                    newPasswordField.setText("");
                    confirmPasswordField.setText("");

                    JOptionPane.showMessageDialog(this, "Changes Deleted Successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error .. Password Not Matches");
                }
            } else {
                //JOptionPane.showMessageDialog(this,"Invalid Username Or Password.");
                JOptionPane.showMessageDialog(this, "Invalid Username Or Password.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Changepass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Changepass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel currentPassword;
    private javax.swing.JPasswordField currentPasswordField;
    private javax.swing.JLabel currentUsername;
    private javax.swing.JTextField currentUsernameField;
    private javax.swing.JButton delete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newPassword;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newUsername;
    private javax.swing.JTextField newUsernameField;
    private javax.swing.JButton saveChanges;
    private javax.swing.JButton saveChanges1;
    // End of variables declaration//GEN-END:variables
}
