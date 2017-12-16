package college.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditGrade extends javax.swing.JFrame {

    Connection con;

    public EditGrade() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(EditGrade.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Students Affairs Management System");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        studentID = new javax.swing.JLabel();
        studentIDField = new javax.swing.JTextField();
        doctorID = new javax.swing.JLabel();
        doctorIDField = new javax.swing.JTextField();
        courseID = new javax.swing.JLabel();
        courseIDField = new javax.swing.JTextField();
        degree = new javax.swing.JLabel();
        degreeField = new javax.swing.JTextField();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        searchField1 = new javax.swing.JTextField();
        searchField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        studentID.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        studentID.setText("Student ID :");

        studentIDField.setBackground(new java.awt.Color(204, 204, 204));
        studentIDField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        doctorID.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        doctorID.setText("Doctor ID :");

        doctorIDField.setBackground(new java.awt.Color(204, 204, 204));
        doctorIDField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        courseID.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        courseID.setText("Course code :");

        courseIDField.setBackground(new java.awt.Color(204, 204, 204));
        courseIDField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        degree.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        degree.setText("Degree :");

        degreeField.setBackground(new java.awt.Color(204, 204, 204));
        degreeField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        degreeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeFieldActionPerformed(evt);
            }
        });

        searchField.setBackground(new java.awt.Color(204, 204, 204));
        searchField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(204, 204, 204));
        searchButton.setFont(new java.awt.Font("Bookman Old Style", 3, 16)); // NOI18N
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setPreferredSize(new java.awt.Dimension(91, 28));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        add.setText("Add");
        add.setToolTipText("Add Degree");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        delete.setText("Delete");
        delete.setToolTipText("Delete Degree");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(204, 204, 204));
        update.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        update.setText("Update");
        update.setToolTipText("Update Degree");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(204, 204, 204));
        clear.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        clear.setText("Clear");
        clear.setToolTipText("Clear all Fields");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        searchField1.setBackground(new java.awt.Color(204, 204, 204));
        searchField1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        searchField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchField1ActionPerformed(evt);
            }
        });

        searchField2.setBackground(new java.awt.Color(204, 204, 204));
        searchField2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        searchField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 2, 13)); // NOI18N
        jLabel1.setText("  Student ID                   doctor ID                Course code");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("codes");
        jButton1.setToolTipText("View all Courses Codes");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(degreeField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(courseID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(courseIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(doctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(doctorIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(searchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchField2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(566, 566, 566)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(doctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(degreeField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        try {
            boolean check = false;

            if (searchField.getText().equals("") || searchField1.getText().equals("") || searchField2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Error Input .. Fill all search Fields.");
            }

            PreparedStatement stmt = con.prepareStatement("select * from relation ");
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                if (result.getInt(1) == Integer.parseInt(searchField.getText()) && result.getInt(2) == Integer.parseInt(searchField1.getText()) && result.getString(3).equals(searchField2.getText())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                degreeField.setText(String.valueOf(result.getInt(4)));
                courseIDField.setText(result.getString(3));
                doctorIDField.setText(String.valueOf(result.getInt(2)));
                studentIDField.setText(searchField.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        try {
            boolean check = false;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
            PreparedStatement stmt = con.prepareStatement("insert into relation (Stu_ID,Doc_ID,Cor_code,Degree) values(?,?,?,?)");

            boolean test = false;

            if (doctorIDField.getText().equals("") || courseIDField.getText().equals("") || studentIDField.getText().equals("") || degreeField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Input Error... Fill All Fields.");
                test = true;
            }
            if (!test) {
                try {
                    int x;
                    x = Integer.parseInt(studentIDField.getText());
                    x = Integer.parseInt(doctorIDField.getText());
                    x = Integer.parseInt(degreeField.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error .. ID and Degree must be integers not Characters.");
                }
            }

            do {
                check = false;
                PreparedStatement stmt2 = con.prepareStatement("select Stu_ID,Doc_ID,Cor_code from relation ");
                ResultSet result = stmt2.executeQuery();
                while (result.next()) {
                    if (result.getInt(1) == Integer.parseInt(studentIDField.getText()) && result.getInt(2) == Integer.parseInt(doctorIDField.getText()) && result.getString(3).equals(courseIDField.getText())) {
                        JOptionPane.showMessageDialog(this, "this ID is already exsist ... Enter another ID.");
                        check = true;
                        break;
                    }
                }
                if (check) {
                    studentIDField.setText("");
                    doctorIDField.setText("");
                    courseIDField.setText("");
                }
            } while (check);

            stmt.setInt(1, Integer.parseInt(studentIDField.getText()));
            stmt.setString(2, doctorIDField.getText());
            stmt.setString(3, courseIDField.getText());
            stmt.setInt(4, Integer.parseInt(degreeField.getText()));

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Saved Successfully.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"IDs or Course Code  Not Found");
        }

    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        PreparedStatement stmt, stmt2;
        boolean check = false;
        try {

            if (searchField.getText().equals("") || searchField1.getText().equals("") || searchField2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "No Selected Record to be Deleted.");
            }

            stmt2 = con.prepareStatement("select * from relation");
            ResultSet result = stmt2.executeQuery();
            while (result.next()) {
                if (result.getInt(1) == Integer.parseInt(searchField.getText()) && result.getInt(2) == Integer.parseInt(searchField1.getText()) && result.getString(3).equals(searchField2.getText())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                /*stmt = con.prepareStatement("delete from relation where Stu_ID = "+Integer.parseInt(searchField.getText())+";");
                stmt.executeUpdate();*/

                stmt = con.prepareStatement("delete from relation where Stu_ID=? and Doc_ID=? and Cor_code =? ");

                stmt.setInt(1, Integer.parseInt(searchField.getText()));
                stmt.setInt(2, Integer.parseInt(searchField1.getText()));
                stmt.setString(3, searchField2.getText());

                stmt.executeUpdate();

                clearActionPerformed(evt);

                JOptionPane.showMessageDialog(this, "Record Deleted Successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Record not found.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        PreparedStatement stmt;
        try {

            if (searchField.getText().equals("") || searchField1.getText().equals("") || searchField2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "No Selected Recoed to be Updated.");
            }

            /*   stmt = con.prepareStatement("delete from relation where Stu_ID = "+Integer.parseInt(searchField.getText())+";");
            stmt.executeUpdate();

            addActionPerformed(evt);*/
            stmt = con.prepareStatement("update relation set Stu_ID =? , Doc_ID =?  ,Cor_code =? ,Degree =? where Stu_ID =? and Doc_ID=? and Cor_code=?");

            stmt.setInt(1, Integer.parseInt(studentIDField.getText()));
            stmt.setInt(2, Integer.parseInt(doctorIDField.getText()));
            stmt.setString(3, courseIDField.getText());
            stmt.setInt(4, Integer.parseInt(degreeField.getText()));
            stmt.setInt(5, +Integer.parseInt(searchField.getText()));
            stmt.setInt(6, Integer.parseInt(searchField1.getText()));
            stmt.setString(7, searchField2.getText());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Recoed Updated Successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"IDs or Course Code  Not Found");
        }

    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        doctorIDField.setText("");
        courseIDField.setText("");
        degreeField.setText("");
        studentIDField.setText("");
        searchField.setText("");
        searchField1.setText("");
        searchField2.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void degreeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degreeFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Codes().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        try {
            boolean check = false;

            if (searchField.getText().equals("") || searchField1.getText().equals("") || searchField2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Error Input .. Fill all search Fields.");
            }

            PreparedStatement stmt = con.prepareStatement("select * from relation ");
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                if (result.getInt(1) == Integer.parseInt(searchField.getText()) && result.getInt(2) == Integer.parseInt(searchField1.getText()) && result.getString(3).equals(searchField2.getText())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                degreeField.setText(String.valueOf(result.getInt(4)));
                courseIDField.setText(result.getString(3));
                doctorIDField.setText(String.valueOf(result.getInt(2)));
                studentIDField.setText(searchField.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchField1ActionPerformed
       try {
            boolean check = false;

            if (searchField.getText().equals("") || searchField1.getText().equals("") || searchField2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Error Input .. Fill all search Fields.");
            }

            PreparedStatement stmt = con.prepareStatement("select * from relation ");
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                if (result.getInt(1) == Integer.parseInt(searchField.getText()) && result.getInt(2) == Integer.parseInt(searchField1.getText()) && result.getString(3).equals(searchField2.getText())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                degreeField.setText(String.valueOf(result.getInt(4)));
                courseIDField.setText(result.getString(3));
                doctorIDField.setText(String.valueOf(result.getInt(2)));
                studentIDField.setText(searchField.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchField1ActionPerformed

    private void searchField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchField2ActionPerformed
        try {
            boolean check = false;

            if (searchField.getText().equals("") || searchField1.getText().equals("") || searchField2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Error Input .. Fill all search Fields.");
            }

            PreparedStatement stmt = con.prepareStatement("select * from relation ");
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                if (result.getInt(1) == Integer.parseInt(searchField.getText()) && result.getInt(2) == Integer.parseInt(searchField1.getText()) && result.getString(3).equals(searchField2.getText())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                degreeField.setText(String.valueOf(result.getInt(4)));
                courseIDField.setText(result.getString(3));
                doctorIDField.setText(String.valueOf(result.getInt(2)));
                studentIDField.setText(searchField.getText());
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchField2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditGrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JLabel courseID;
    private javax.swing.JTextField courseIDField;
    private javax.swing.JLabel degree;
    private javax.swing.JTextField degreeField;
    private javax.swing.JButton delete;
    private javax.swing.JLabel doctorID;
    private javax.swing.JTextField doctorIDField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField searchField1;
    private javax.swing.JTextField searchField2;
    private javax.swing.JLabel studentID;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
