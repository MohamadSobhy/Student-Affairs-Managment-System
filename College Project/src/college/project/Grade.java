package college.project;

import java.awt.print.PrinterException;
import java.sql.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Grade extends javax.swing.JFrame {

    Connection con = null;

    private void update_Table(String s) {
        try {

            StudentTable.setShowHorizontalLines(true);
            StudentTable.setShowVerticalLines(true);

            PreparedStatement stmt = con.prepareStatement(s);
            ResultSet result = stmt.executeQuery();
            StudentTable.setModel(DbUtils.resultSetToTableModel(result));
            StudentTable.setEnabled(false);
            StudentTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            StudentTable.getColumnModel().getColumn(4).setPreferredWidth(20);
            StudentTable.getColumnModel().getColumn(8).setMaxWidth(60);
            
        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Grade() {
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Students Affairs Management System");
        
        update_Table("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID order by student.Fname,student.Sname,student.Lname , doctor.Fname,doctor.Sname,student.Lname");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        Yearlist = new javax.swing.JComboBox<>();
        searchbylist = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        YearSearchbyLabel = new javax.swing.JLabel();
        variableLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        back = new javax.swing.JButton();
        tablePanel = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 867));

        searchPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchPanel.setPreferredSize(new java.awt.Dimension(1100, 100));

        Yearlist.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        Yearlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Year", "Second Year", "Third Year", "Forth Year" }));
        Yearlist.setSelectedIndex(-1);
        Yearlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Yearlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearlistActionPerformed(evt);
            }
        });

        searchbylist.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        searchbylist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stud_ID", "  Name" }));
        searchbylist.setSelectedIndex(-1);
        searchbylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbylistActionPerformed(evt);
            }
        });

        searchField.setBackground(new java.awt.Color(204, 204, 204));
        searchField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        YearSearchbyLabel.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        YearSearchbyLabel.setText("              Year                        Search by");

        variableLabel.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N

        searchButton.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        printButton.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        printButton.setText("Print");
        printButton.setToolTipText("Print this Table");
        printButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/back2.png"))); // NOI18N
        back.setToolTipText("Back to Previous Page");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(YearSearchbyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(variableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(Yearlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchbylist, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YearSearchbyLabel)
                            .addComponent(variableLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Yearlist, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchbylist, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        StudentTable.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null},
                {"", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student Name", "Course Name", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentTable.setDragEnabled(true);
        StudentTable.setRowHeight(30);
        StudentTable.setRowSelectionAllowed(false);
        StudentTable.getTableHeader().setReorderingAllowed(false);
        tablePanel.setViewportView(StudentTable);
        if (StudentTable.getColumnModel().getColumnCount() > 0) {
            StudentTable.getColumnModel().getColumn(0).setResizable(false);
            StudentTable.getColumnModel().getColumn(1).setResizable(false);
            StudentTable.getColumnModel().getColumn(2).setResizable(false);
        }

        editButton.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        editButton.setText("Edit");
        editButton.setToolTipText("Add, Update, Delete Degrees");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.setToolTipText("Refresh Table");
        refreshButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton.setPreferredSize(new java.awt.Dimension(73, 31));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tablePanel)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addGap(53, 53, 53))
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

    private void searchbylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbylistActionPerformed
        if (searchbylist.getSelectedItem().equals("Section")) {
            variableLabel.setText("Section Number :");
        } else if (searchbylist.getSelectedItem().equals("Stud_ID")) {
            variableLabel.setText("Student ID :");
        } else if (searchbylist.getSelectedItem().equals("  Name")) {
            variableLabel.setText("Student Name :");
        }
    }//GEN-LAST:event_searchbylistActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        MessageFormat header = new MessageFormat("Student Degrees");
        MessageFormat footer = new MessageFormat("Page : {0}");
        
        try {
            StudentTable.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_printButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        new AdminMenu().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        //dispose();
        new EditGrade().setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        update_Table("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID order by student.Fname,student.Sname,student.Lname , doctor.Fname,doctor.Sname,student.Lname");
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        /********
         * 
         * 
         */
        
        
        boolean z = false, y = false;
        if ((searchbylist.getSelectedIndex() == -1) || (searchField.getText().equals("")) || (Yearlist.getSelectedIndex() == -1)) {
            JOptionPane.showMessageDialog(this, "Invalid Input .. Fill all Search Fields.");
            z = true;
        }
        if (searchField.getText().charAt(0) == ' ') {
            if (!z) {
                JOptionPane.showMessageDialog(this, "Invalid Input .. Student Name or ID can't begin with space.");
                y = true;
            }
        }

        String year;
        if (Yearlist.getSelectedItem().equals("First Year")) {
            year = "First Year";
        } else if (Yearlist.getSelectedItem().equals("Second Year")) {
            year = "Second Year";
        } else if (Yearlist.getSelectedItem().equals("Third Year")) {
            year = "Third Year";
        } else {
            year = "Fourth Year";
        }

        if (searchbylist.getSelectedIndex() == 1) {
            int count[] = new int[3];
            count[0] = 0;
            count[1] = 0;
            count[2] = 0;
            int x = 0;

            for (int i = 0; i < (searchField.getText().length()); i++) {
                if (searchField.getText().charAt(i) == ' ') {
                    x++;
                    if (searchField.getText().charAt(i - 1) == ' ') {
                        x--;
                    }
                    continue;
                }
                count[x]++;
            }

            if (x == 2) {
                char[] Fname = new char[count[0]];
                char[] Sname = new char[count[1]];
                char[] Lname = new char[count[2]];

                if (count[2] == 0) {
                    JOptionPane.showMessageDialog(this, "Invalid Input .. there is an space on the end of th name");
                }
                int counter = 0;
                int m = 0;
                for (int i = 0; i < (searchField.getText().length()); i++) {
                    if (searchField.getText().charAt(i) == ' ') {
                        if (searchField.getText().charAt(i - 1) == ' ') {
                            continue;
                        }
                        counter++;
                        m = 0;
                        continue;
                    }
                    if (counter == 0) {
                        Fname[m] = searchField.getText().charAt(i);
                    }
                    if (counter == 1) {
                        Sname[m] = searchField.getText().charAt(i);
                    }
                    if (counter == 2) {
                        Lname[m] = searchField.getText().charAt(i);
                    }
                    m++;
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();

                    while (result2.next()) {
                        if (result2.getString(2).equals(String.valueOf(Fname)) && result2.getString(3).equals(String.valueOf(Sname)) && result2.getString(4).equals(String.valueOf(Lname))) {
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND student.Fname = ? And student.Sname = ? And student.Lname = ? AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname ");
                        stmt.setString(1, String.valueOf(Fname));
                        stmt.setString(2, String.valueOf(Sname));
                        stmt.setString(3, String.valueOf(Lname));
                        stmt.setString(4, year);

                        ResultSet result = stmt.executeQuery();

                        StudentTable.setModel(DbUtils.resultSetToTableModel(result));
                        StudentTable.setEnabled(false);
                    } else if (count[2] != 0) {
                        JOptionPane.showMessageDialog(this, "Record Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (x == 1) {

                char[] Fname = new char[count[0]];
                char[] Sname = new char[count[1]];

                if (count[1] == 0) {
                    JOptionPane.showMessageDialog(this, "Invalid Input .. there is an space on the end of th name");
                }

                int counter = 0;
                int m = 0;
                for (int i = 0; i < (searchField.getText().length()); i++) {
                    if (searchField.getText().charAt(i) == ' ') {
                        if (searchField.getText().charAt(i - 1) == ' ') {
                            continue;
                        }
                        counter++;
                        m = 0;
                        continue;
                    }
                    if (counter == 0) {
                        Fname[m] = searchField.getText().charAt(i);
                    }
                    if (counter == 1) {
                        Sname[m] = searchField.getText().charAt(i);
                    }

                    m++;
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(2).equals(String.valueOf(Fname)) && result2.getString(3).equals(String.valueOf(Sname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND student.Fname = ? And student.Sname = ? AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname ");
                        stmt.setString(1, String.valueOf(Fname));
                        stmt.setString(2, String.valueOf(Sname));
                        stmt.setString(3, year);
                        ResultSet result = stmt.executeQuery();

                        StudentTable.setModel(DbUtils.resultSetToTableModel(result));
                        StudentTable.setEnabled(false);
                    } else if (count[1] != 0) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (x == 0) {

                char[] Fname = new char[count[0]];

                for (int i = 0; i < (searchField.getText().length()); i++) {
                    if (searchField.getText().charAt(i) == ' ') {
                        break;
                    }
                    Fname[i] = searchField.getText().charAt(i);
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(2).equals(String.valueOf(Fname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND student.Fname = ? AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                        stmt.setString(1, String.valueOf(String.valueOf(Fname)));
                        stmt.setString(2, year);
                        ResultSet result = stmt.executeQuery();

                        StudentTable.setModel(DbUtils.resultSetToTableModel(result));
                        StudentTable.setEnabled(false);
                    } else if (!searchField.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Input.");
            }

        } else if (searchbylist.getSelectedIndex() == 0) {

            int x = 0;
            try {
                x = Integer.parseInt(searchField.getText());
            } catch (Exception e) {
                if (!y) {
                    JOptionPane.showMessageDialog(this, "Invalid ID .. there is an character in ID.");
                }
                y = true;
            }

            try {

                boolean check = false;
                PreparedStatement stmt2 = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                stmt2.setString(1, year);
                ResultSet result2 = stmt2.executeQuery();
                while (result2.next()) {
                    if (result2.getInt(1) == x) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    PreparedStatement stmt = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Student_ID = ? AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname ");
                    stmt.setInt(1, x);
                    stmt.setString(2, year);
                    ResultSet result = stmt.executeQuery();

                    StudentTable.setModel(DbUtils.resultSetToTableModel(result));
                    StudentTable.setEnabled(false);
                    StudentTable.setShowHorizontalLines(true);
                    StudentTable.setShowVerticalLines(true);

                } else if (!searchField.getText().equals("")) {
                    if (!y) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
            }
        
           
        }


        
        
        
        
        
        /********
         * 
         * 
         * 
         * 
         */
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
       
        boolean z = false, y = false;
        if ((searchbylist.getSelectedIndex() == -1) || (searchField.getText().equals("")) || (Yearlist.getSelectedIndex() == -1)) {
            JOptionPane.showMessageDialog(this, "Invalid Input .. Fill all Search Fields.");
            z = true;
        }
        if (searchField.getText().charAt(0) == ' ') {
            if (!z) {
                JOptionPane.showMessageDialog(this, "Invalid Input .. Student Name or ID can't begin with space.");
                y = true;
            }
        }

        String year;
        if (Yearlist.getSelectedItem().equals("First Year")) {
            year = "First Year";
        } else if (Yearlist.getSelectedItem().equals("Second Year")) {
            year = "Second Year";
        } else if (Yearlist.getSelectedItem().equals("Third Year")) {
            year = "Third Year";
        } else {
            year = "Fourth Year";
        }

        if (searchbylist.getSelectedIndex() == 1) {
            int count[] = new int[3];
            count[0] = 0;
            count[1] = 0;
            count[2] = 0;
            int x = 0;

            for (int i = 0; i < (searchField.getText().length()); i++) {
                if (searchField.getText().charAt(i) == ' ') {
                    x++;
                    if (searchField.getText().charAt(i - 1) == ' ') {
                        x--;
                    }
                    continue;
                }
                count[x]++;
            }

            if (x == 2) {
                char[] Fname = new char[count[0]];
                char[] Sname = new char[count[1]];
                char[] Lname = new char[count[2]];

                if (count[2] == 0) {
                    JOptionPane.showMessageDialog(this, "Invalid Input .. there is an space on the end of th name");
                }
                int counter = 0;
                int m = 0;
                for (int i = 0; i < (searchField.getText().length()); i++) {
                    if (searchField.getText().charAt(i) == ' ') {
                        if (searchField.getText().charAt(i - 1) == ' ') {
                            continue;
                        }
                        counter++;
                        m = 0;
                        continue;
                    }
                    if (counter == 0) {
                        Fname[m] = searchField.getText().charAt(i);
                    }
                    if (counter == 1) {
                        Sname[m] = searchField.getText().charAt(i);
                    }
                    if (counter == 2) {
                        Lname[m] = searchField.getText().charAt(i);
                    }
                    m++;
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();

                    while (result2.next()) {
                        if (result2.getString(2).equals(String.valueOf(Fname)) && result2.getString(3).equals(String.valueOf(Sname)) && result2.getString(4).equals(String.valueOf(Lname))) {
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND student.Fname = ? And student.Sname = ? And student.Lname = ? AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname ");
                        stmt.setString(1, String.valueOf(Fname));
                        stmt.setString(2, String.valueOf(Sname));
                        stmt.setString(3, String.valueOf(Lname));
                        stmt.setString(4, year);

                        ResultSet result = stmt.executeQuery();

                        StudentTable.setModel(DbUtils.resultSetToTableModel(result));
                        StudentTable.setEnabled(false);
                    } else if (count[2] != 0) {
                        JOptionPane.showMessageDialog(this, "Record Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (x == 1) {

                char[] Fname = new char[count[0]];
                char[] Sname = new char[count[1]];

                if (count[1] == 0) {
                    JOptionPane.showMessageDialog(this, "Invalid Input .. there is an space on the end of th name");
                }

                int counter = 0;
                int m = 0;
                for (int i = 0; i < (searchField.getText().length()); i++) {
                    if (searchField.getText().charAt(i) == ' ') {
                        if (searchField.getText().charAt(i - 1) == ' ') {
                            continue;
                        }
                        counter++;
                        m = 0;
                        continue;
                    }
                    if (counter == 0) {
                        Fname[m] = searchField.getText().charAt(i);
                    }
                    if (counter == 1) {
                        Sname[m] = searchField.getText().charAt(i);
                    }

                    m++;
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(2).equals(String.valueOf(Fname)) && result2.getString(3).equals(String.valueOf(Sname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND student.Fname = ? And student.Sname = ? AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname ");
                        stmt.setString(1, String.valueOf(Fname));
                        stmt.setString(2, String.valueOf(Sname));
                        stmt.setString(3, year);
                        ResultSet result = stmt.executeQuery();

                        StudentTable.setModel(DbUtils.resultSetToTableModel(result));
                        StudentTable.setEnabled(false);
                    } else if (count[1] != 0) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (x == 0) {

                char[] Fname = new char[count[0]];

                for (int i = 0; i < (searchField.getText().length()); i++) {
                    if (searchField.getText().charAt(i) == ' ') {
                        break;
                    }
                    Fname[i] = searchField.getText().charAt(i);
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(2).equals(String.valueOf(Fname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND student.Fname = ? AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                        stmt.setString(1, String.valueOf(String.valueOf(Fname)));
                        stmt.setString(2, year);
                        ResultSet result = stmt.executeQuery();

                        StudentTable.setModel(DbUtils.resultSetToTableModel(result));
                        StudentTable.setEnabled(false);
                    } else if (!searchField.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Input.");
            }

        } else if (searchbylist.getSelectedIndex() == 0) {

            int x = 0;
            try {
                x = Integer.parseInt(searchField.getText());
            } catch (Exception e) {
                if (!y) {
                    JOptionPane.showMessageDialog(this, "Invalid ID .. there is an character in ID.");
                }
                y = true;
            }

            try {

                boolean check = false;
                PreparedStatement stmt2 = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname");
                stmt2.setString(1, year);
                ResultSet result2 = stmt2.executeQuery();
                while (result2.next()) {
                    if (result2.getInt(1) == x) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    PreparedStatement stmt = con.prepareStatement("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Student_ID = ? AND Stu_year = ?  order by student.Fname,student.Sname,student.Lname ");
                    stmt.setInt(1, x);
                    stmt.setString(2, year);
                    ResultSet result = stmt.executeQuery();

                    StudentTable.setModel(DbUtils.resultSetToTableModel(result));
                    StudentTable.setEnabled(false);
                    StudentTable.setShowHorizontalLines(true);
                    StudentTable.setShowVerticalLines(true);

                } else if (!searchField.getText().equals("")) {
                    if (!y) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
            }
        
           
        }
        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void YearlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearlistActionPerformed
       
        if (Yearlist.getSelectedItem().equals("First Year")) {
            update_Table("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = 'First Year' order by student.Fname,student.Sname,student.Lname , doctor.Fname,doctor.Sname,student.Lname ");
        } else if (Yearlist.getSelectedItem().equals("Second Year")) {
            update_Table("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = 'Second Year' order by student.Fname,student.Sname,student.Lname , doctor.Fname,doctor.Sname,student.Lname ");
        } else if (Yearlist.getSelectedItem().equals("Third Year")) {
            update_Table("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = 'Third Year' order by student.Fname,student.Sname,student.Lname , doctor.Fname,doctor.Sname,student.Lname ");
        } else {
            update_Table("SELECT Student_ID,student.Fname, student.Sname, student.Lname,  Doctor_ID, doctor.Fname , doctor.Sname, Course_name, Degree FROM student,doctor,courses, relation WHERE Cor_code = Course_code  AND Stu_ID = Student_ID AND Doc_ID = Doctor_ID AND Stu_year = 'Fourth Year' order by student.Fname,student.Sname,student.Lname , doctor.Fname,doctor.Sname,student.Lname ");
        }
        
    }//GEN-LAST:event_YearlistActionPerformed

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
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StudentTable;
    private javax.swing.JLabel YearSearchbyLabel;
    private javax.swing.JComboBox<String> Yearlist;
    private javax.swing.JButton back;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton printButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JComboBox<String> searchbylist;
    private javax.swing.JScrollPane tablePanel;
    private javax.swing.JLabel variableLabel;
    // End of variables declaration//GEN-END:variables
}
