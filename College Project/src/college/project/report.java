package college.project;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import sun.swing.SwingUtilities2.Section;

public class report extends javax.swing.JFrame {

    Connection con;

    private void update_Table(String s) {
        try {

//            StudentTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
//            StudentTable.getColumnModel().getColumn(0).setMinWidth(20);
//            StudentTable.getColumnModel().getColumn(1).setMinWidth(40);
//            StudentTable.getColumnModel().getColumn(2).setMinWidth(40);
            StudentTable.setShowHorizontalLines(true);
            StudentTable.setShowVerticalLines(true);

            PreparedStatement stmt = con.prepareStatement(s);
            ResultSet result = stmt.executeQuery();
            StudentTable.setModel(DbUtils.resultSetToTableModel(result));
            StudentTable.setEnabled(false);
            StudentTable.getColumnModel().getColumn(0).setMaxWidth(80);
//            StudentTable.getColumnModel().getColumn(5).setMaxWidth(180);
            StudentTable.getColumnModel().getColumn(7).setMaxWidth(60);
//            StudentTable.getColumnModel().getColumn(8).setPreferredWidth(80);

        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void update_Table2(String s) {
        try {

            PreparedStatement stmt2 = con.prepareStatement(s);
            ResultSet result2 = stmt2.executeQuery();
            DoctorTable.setModel(DbUtils.resultSetToTableModel(result2));
            DoctorTable.setEnabled(false);

            DoctorTable.setShowHorizontalLines(true);
            DoctorTable.setShowVerticalLines(true);
            DoctorTable.getColumnModel().getColumn(0).setMaxWidth(80);
            DoctorTable.getColumnModel().getColumn(7).setMaxWidth(60);

        } catch (SQLException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public report() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");

        } catch (SQLException ex) {
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Students Affairs Management System");
        StudentTable.setRowHeight(30);
        DoctorTable.setRowHeight(30);
        update_Table("SELECT * from student order by Fname,Sname,Lname");
        update_Table2("select * from doctor order by Fname,Sname,Lname");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        StudentDoctorTabbed = new javax.swing.JTabbedPane();
        StudentPanel = new javax.swing.JPanel();
        innerPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        Yearlist = new javax.swing.JComboBox<>();
        searchbylist = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();
        YearSearchbyLabel = new javax.swing.JLabel();
        variableLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tablePanel = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        StudentPanel2 = new javax.swing.JPanel();
        innerPanel2 = new javax.swing.JPanel();
        searchPanel2 = new javax.swing.JPanel();
        searchbylist2 = new javax.swing.JComboBox<>();
        searchField2 = new javax.swing.JTextField();
        YearSearchbyLabel2 = new javax.swing.JLabel();
        variableLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        print = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tablePanel2 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 867));

        StudentDoctorTabbed.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N

        innerPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)));

        searchPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchPanel.setPreferredSize(new java.awt.Dimension(1100, 100));

        Yearlist.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        Yearlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Year", "Second Year", "Third Year", "Fourth Year" }));
        Yearlist.setSelectedIndex(-1);
        Yearlist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Yearlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearlistActionPerformed(evt);
            }
        });

        searchbylist.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        searchbylist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section", "Stud_ID", "  Name" }));
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

        clear.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.setToolTipText("Clear all changes");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(Yearlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchbylist, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(YearSearchbyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(variableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearSearchbyLabel)
                    .addComponent(variableLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yearlist, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbylist, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        StudentTable.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "SSN", "Birthdate", "E-Mail", "Gender", "Year", "Phone", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StudentTable.getTableHeader().setReorderingAllowed(false);
        tablePanel.setViewportView(StudentTable);
        if (StudentTable.getColumnModel().getColumnCount() > 0) {
            StudentTable.getColumnModel().getColumn(0).setResizable(false);
            StudentTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            StudentTable.getColumnModel().getColumn(0).setHeaderValue("Student ID");
            StudentTable.getColumnModel().getColumn(1).setResizable(false);
            StudentTable.getColumnModel().getColumn(1).setHeaderValue("Name");
            StudentTable.getColumnModel().getColumn(2).setResizable(false);
            StudentTable.getColumnModel().getColumn(2).setHeaderValue("SSN");
            StudentTable.getColumnModel().getColumn(3).setResizable(false);
            StudentTable.getColumnModel().getColumn(3).setHeaderValue("Birthdate");
            StudentTable.getColumnModel().getColumn(4).setResizable(false);
            StudentTable.getColumnModel().getColumn(4).setHeaderValue("E-Mail");
            StudentTable.getColumnModel().getColumn(5).setResizable(false);
            StudentTable.getColumnModel().getColumn(5).setHeaderValue("Gender");
            StudentTable.getColumnModel().getColumn(6).setResizable(false);
            StudentTable.getColumnModel().getColumn(6).setHeaderValue("Year");
            StudentTable.getColumnModel().getColumn(7).setResizable(false);
            StudentTable.getColumnModel().getColumn(7).setHeaderValue("Phone");
            StudentTable.getColumnModel().getColumn(8).setResizable(false);
            StudentTable.getColumnModel().getColumn(8).setHeaderValue("Address");
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1244, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout innerPanelLayout = new javax.swing.GroupLayout(innerPanel);
        innerPanel.setLayout(innerPanelLayout);
        innerPanelLayout.setHorizontalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        innerPanelLayout.setVerticalGroup(
            innerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout StudentPanelLayout = new javax.swing.GroupLayout(StudentPanel);
        StudentPanel.setLayout(StudentPanelLayout);
        StudentPanelLayout.setHorizontalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        StudentPanelLayout.setVerticalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        StudentDoctorTabbed.addTab("Student", StudentPanel);

        innerPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)));

        searchPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchPanel2.setPreferredSize(new java.awt.Dimension(1100, 100));

        searchbylist2.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        searchbylist2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doct_ID", "  Name" }));
        searchbylist2.setSelectedIndex(-1);
        searchbylist2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchbylist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbylist2ActionPerformed(evt);
            }
        });

        searchField2.setBackground(new java.awt.Color(204, 204, 204));
        searchField2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        searchField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchField2ActionPerformed(evt);
            }
        });

        YearSearchbyLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        YearSearchbyLabel2.setText("    Search by");

        variableLabel2.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N

        search.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        print.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        print.setText("Print");
        print.setToolTipText("Print Table");
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        clear1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        clear1.setText("Clear");
        clear1.setToolTipText("Clear all Changes");
        clear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanel2Layout = new javax.swing.GroupLayout(searchPanel2);
        searchPanel2.setLayout(searchPanel2Layout);
        searchPanel2Layout.setHorizontalGroup(
            searchPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(clear1)
                .addGap(49, 49, 49)
                .addGroup(searchPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbylist2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(YearSearchbyLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(searchPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanel2Layout.createSequentialGroup()
                        .addComponent(searchField2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(variableLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        searchPanel2Layout.setVerticalGroup(
            searchPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YearSearchbyLabel2)
                    .addComponent(variableLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchbylist2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DoctorTable.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Name", "SSN", "Birthdate", "E-Mail", "Gender", "Phone", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DoctorTable.setDragEnabled(true);
        DoctorTable.setEnabled(false);
        DoctorTable.setRowSelectionAllowed(false);
        DoctorTable.getTableHeader().setReorderingAllowed(false);
        tablePanel2.setViewportView(DoctorTable);
        if (DoctorTable.getColumnModel().getColumnCount() > 0) {
            DoctorTable.getColumnModel().getColumn(0).setResizable(false);
            DoctorTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            DoctorTable.getColumnModel().getColumn(1).setResizable(false);
            DoctorTable.getColumnModel().getColumn(2).setResizable(false);
            DoctorTable.getColumnModel().getColumn(3).setResizable(false);
            DoctorTable.getColumnModel().getColumn(4).setResizable(false);
            DoctorTable.getColumnModel().getColumn(5).setResizable(false);
            DoctorTable.getColumnModel().getColumn(6).setResizable(false);
            DoctorTable.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePanel2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout innerPanel2Layout = new javax.swing.GroupLayout(innerPanel2);
        innerPanel2.setLayout(innerPanel2Layout);
        innerPanel2Layout.setHorizontalGroup(
            innerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(searchPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(innerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        innerPanel2Layout.setVerticalGroup(
            innerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout StudentPanel2Layout = new javax.swing.GroupLayout(StudentPanel2);
        StudentPanel2.setLayout(StudentPanel2Layout);
        StudentPanel2Layout.setHorizontalGroup(
            StudentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        StudentPanel2Layout.setVerticalGroup(
            StudentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(innerPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1324, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(StudentPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1224, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(StudentPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        StudentDoctorTabbed.addTab("Doctor", jPanel2);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentDoctorTabbed)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentDoctorTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 867, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        MessageFormat header = new MessageFormat("Students Information");
        MessageFormat footer = new MessageFormat("Page : {0}");

        try {
            StudentTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_printButtonActionPerformed

    private void searchbylist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbylist2ActionPerformed
        if (searchbylist2.getSelectedItem().equals("Doct_ID")) {
            variableLabel2.setText("Doctor ID :");
        } else if (searchbylist2.getSelectedItem().equals("  Name")) {
            variableLabel2.setText("Doctor Name :");
        }

    }//GEN-LAST:event_searchbylist2ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed

        MessageFormat header = new MessageFormat("Doctors Information");
        MessageFormat footer = new MessageFormat("Page : {0}");

        try {
            DoctorTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_printActionPerformed

    private void YearlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearlistActionPerformed
        if (Yearlist.getSelectedItem().equals("First Year")) {
            update_Table("SELECT * from student WHERE Stu_year = 'First Year' order by Fname,Sname,Lname");
        } else if (Yearlist.getSelectedItem().equals("Second Year")) {
            update_Table("SELECT * from student WHERE Stu_year = 'Second Year' order by Fname,Sname,Lname");
        } else if (Yearlist.getSelectedItem().equals("Third Year")) {
            update_Table("SELECT * from student WHERE Stu_year = 'Third Year'order by Fname,Sname,Lname");
        } else {
            update_Table("SELECT * from student WHERE Stu_year = 'Fourth Year'order by Fname,Sname,Lname");
        }
    }//GEN-LAST:event_YearlistActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        update_Table("SELECT * from student order by Fname,Sname,Lname");
        try {
            searchbylist.setSelectedIndex(-1);
        } catch (Exception e) {

        }
        searchField.setText("");
        variableLabel.setText("");
        Yearlist.setSelectedIndex(-1);

    }//GEN-LAST:event_clearActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

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

        if (searchbylist.getSelectedIndex() == 2) {
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
                    PreparedStatement stmt2 = con.prepareStatement("select Fname,Sname,Lname from student where Stu_year = ? order by Fname,Sname,Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();

                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname)) && result2.getString(2).equals(String.valueOf(Sname)) && result2.getString(3).equals(String.valueOf(Lname))) {
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from student WHERE Fname = ? And Sname = ? And Lname = ? AND Stu_year = ? order by Fname,Sname,Lname");
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
                    PreparedStatement stmt2 = con.prepareStatement("select Fname,Sname from student where Stu_year = ? order by Fname,Sname,Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname)) && result2.getString(2).equals(String.valueOf(Sname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from student WHERE Fname = ? AND Sname = ? AND Stu_year = ? order by Fname,Sname,Lname");
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
                    PreparedStatement stmt2 = con.prepareStatement("select Fname from student where Stu_year = ? order by Fname,Sname,Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from student WHERE Fname = ? AND Stu_year = ? order by Fname,Sname,Lname");
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

        } else if (searchbylist.getSelectedIndex() == 1) {

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
                PreparedStatement stmt2 = con.prepareStatement("select Student_ID from student where Stu_year = ? order by Fname,Sname,Lname");
                stmt2.setString(1, year);
                ResultSet result2 = stmt2.executeQuery();
                while (result2.next()) {
                    if (result2.getInt(1) == x) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    PreparedStatement stmt = con.prepareStatement("select * from student where Student_ID = ? AND Stu_year = ? order by Fname,Sname,Lname");
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
        } else {
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
                PreparedStatement stmt = con.prepareStatement("select * from student where Stu_year = ? order by Fname,Sname,Lname");
                stmt.setString(1, year);
                ResultSet result = stmt.executeQuery();
                for (int i = 1; result.next(); i++) {

                    if (x == 1 && i <= 20) {
                        PreparedStatement stmt2 = con.prepareStatement("select * from student where Stu_year = ?   order by Fname,Sname,Lname");
                        stmt2.setString(1, year);
                        ResultSet res = stmt2.executeQuery();
                        StudentTable.setModel(DbUtils.resultSetToTableModel(res));
                        StudentTable.setEnabled(false);
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);
                    } else if (x == 2 && (i > 20 || i <= 40)) {
                        PreparedStatement stmt2 = con.prepareStatement("select * from student where Stu_year = ? AND Student_ID > ? AND Student_ID <= ? order by Fname,Sname,Lname");
                        stmt2.setString(1, year);
                        stmt2.setInt(2, 20);
                        stmt2.setInt(3, 40);
                        ResultSet res = stmt2.executeQuery();
                        StudentTable.setModel(DbUtils.resultSetToTableModel(res));
                        StudentTable.setEnabled(false);
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);
                    } else if (x == 3 && (i > 40 || i <= 60)) {
                        PreparedStatement stmt2 = con.prepareStatement("select * from student where Stu_year = ? AND Student_ID > ? AND Student_ID <= ? order by Fname,Sname,Lname");
                        stmt2.setString(1, year);
                        stmt2.setInt(2, 40);
                        stmt2.setInt(3, 60);
                        ResultSet res = stmt2.executeQuery();
                        StudentTable.setModel(DbUtils.resultSetToTableModel(res));
                        StudentTable.setEnabled(false);
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);
                    }
                    //and soo on
                }
            } catch (SQLException ex) {
                Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:

        boolean z = false, y = false;
        if ((searchbylist2.getSelectedIndex() == -1) || (searchField2.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Invalid Input .. Fill all Search Fields.");
            z = true;
        }
        if (searchField2.getText().charAt(0) == ' ') {
            if (!z) {
                JOptionPane.showMessageDialog(this, "Invalid Input .. Doctor Name ot ID can't begin with space.");
                y = true;
            }
        }

        if (searchbylist2.getSelectedIndex() == 1) {
            int count[] = new int[3];
            count[0] = 0;
            count[1] = 0;
            count[2] = 0;
            int x = 0;

            for (int i = 0; i < (searchField2.getText().length()); i++) {
                if (searchField2.getText().charAt(i) == ' ') {
                    x++;
                    if (searchField2.getText().charAt(i - 1) == ' ') {
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
                for (int i = 0; i < (searchField2.getText().length()); i++) {
                    if (searchField2.getText().charAt(i) == ' ') {
                        if (searchField2.getText().charAt(i - 1) == ' ') {
                            continue;
                        }
                        counter++;
                        m = 0;
                        continue;
                    }
                    if (counter == 0) {
                        Fname[m] = searchField2.getText().charAt(i);
                    }
                    if (counter == 1) {
                        Sname[m] = searchField2.getText().charAt(i);
                    }
                    if (counter == 2) {
                        Lname[m] = searchField2.getText().charAt(i);
                    }
                    m++;
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("select Fname,Sname,Lname from doctor order by Fname,Sname,Lname");

                    ResultSet result2 = stmt2.executeQuery();

                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname)) && result2.getString(2).equals(String.valueOf(Sname)) && result2.getString(3).equals(String.valueOf(Lname))) {
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        DoctorTable.setShowHorizontalLines(true);
                        DoctorTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from doctor WHERE Fname = ? And Sname = ? And Lname = ? order by Fname,Sname,Lname");
                        stmt.setString(1, String.valueOf(Fname));
                        stmt.setString(2, String.valueOf(Sname));
                        stmt.setString(3, String.valueOf(Lname));

                        ResultSet result = stmt.executeQuery();

                        DoctorTable.setModel(DbUtils.resultSetToTableModel(result));
                        DoctorTable.setEnabled(false);
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
                for (int i = 0; i < (searchField2.getText().length()); i++) {
                    if (searchField2.getText().charAt(i) == ' ') {
                        if (searchField2.getText().charAt(i - 1) == ' ') {
                            continue;
                        }
                        counter++;
                        m = 0;
                        continue;
                    }
                    if (counter == 0) {
                        Fname[m] = searchField2.getText().charAt(i);
                    }
                    if (counter == 1) {
                        Sname[m] = searchField2.getText().charAt(i);
                    }

                    m++;
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("select Fname,Sname from doctor order by Fname,Sname,Lname");

                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname)) && result2.getString(2).equals(String.valueOf(Sname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        DoctorTable.setShowHorizontalLines(true);
                        DoctorTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from doctor WHERE Fname = ? AND Sname = ? order by Fname,Sname,Lname");
                        stmt.setString(1, String.valueOf(Fname));
                        stmt.setString(2, String.valueOf(Sname));

                        ResultSet result = stmt.executeQuery();

                        DoctorTable.setModel(DbUtils.resultSetToTableModel(result));
                        DoctorTable.setEnabled(false);
                    } else if (count[1] != 0) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (x == 0) {

                char[] Fname = new char[count[0]];

                for (int i = 0; i < (searchField2.getText().length()); i++) {
                    if (searchField2.getText().charAt(i) == ' ') {
                        break;
                    }
                    Fname[i] = searchField2.getText().charAt(i);
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("select Fname from doctor order by Fname,Sname,Lname");

                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        DoctorTable.setShowHorizontalLines(true);
                        DoctorTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from doctor WHERE Fname = ? order by Fname,Sname,Lname");
                        stmt.setString(1, String.valueOf(String.valueOf(Fname)));

                        ResultSet result = stmt.executeQuery();

                        DoctorTable.setModel(DbUtils.resultSetToTableModel(result));
                        DoctorTable.setEnabled(false);
                    } else if (!searchField2.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Input.");
            }

        } else if (searchbylist2.getSelectedIndex() == 0) {

            int x = 0;
            try {
                x = Integer.parseInt(searchField2.getText());
            } catch (Exception e) {
                if (!y) {
                    JOptionPane.showMessageDialog(this, "Invalid ID .. there is an character in ID.");
                }
                y = true;
            }
            try {

                boolean check = false;
                PreparedStatement stmt2 = con.prepareStatement("select Doctor_ID from doctor order by Fname,Sname,Lname");

                ResultSet result2 = stmt2.executeQuery();
                while (result2.next()) {
                    if (result2.getInt(1) == x) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    PreparedStatement stmt = con.prepareStatement("select * from doctor where Doctor_ID = ? order by Fname,Sname,Lname");
                    stmt.setInt(1, x);

                    ResultSet result = stmt.executeQuery();

                    DoctorTable.setModel(DbUtils.resultSetToTableModel(result));
                    DoctorTable.setEnabled(false);
                    DoctorTable.setShowHorizontalLines(true);
                    DoctorTable.setShowVerticalLines(true);

                } else if (!searchField2.getText().equals("")) {
                    if (!y) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_searchActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed

        update_Table2("SELECT * from doctor order by Fname,Sname,Lname");
        try {
            searchbylist2.setSelectedIndex(-1);
        } catch (Exception e) {

        }
        searchField2.setText("");
        variableLabel2.setText("");


    }//GEN-LAST:event_clear1ActionPerformed

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

        if (searchbylist.getSelectedIndex() == 2) {
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
                    PreparedStatement stmt2 = con.prepareStatement("select Fname,Sname,Lname from student where Stu_year = ? order by Fname,Sname,Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();

                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname)) && result2.getString(2).equals(String.valueOf(Sname)) && result2.getString(3).equals(String.valueOf(Lname))) {
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from student WHERE Fname = ? And Sname = ? And Lname = ? AND Stu_year = ? order by Fname,Sname,Lname");
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
                    PreparedStatement stmt2 = con.prepareStatement("select Fname,Sname from student where Stu_year = ? order by Fname,Sname,Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname)) && result2.getString(2).equals(String.valueOf(Sname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from student WHERE Fname = ? AND Sname = ? AND Stu_year = ? order by Fname,Sname,Lname");
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
                    PreparedStatement stmt2 = con.prepareStatement("select Fname from student where Stu_year = ? order by Fname,Sname,Lname");
                    stmt2.setString(1, year);
                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from student WHERE Fname = ? AND Stu_year = ? order by Fname,Sname,Lname");
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

        } else if (searchbylist.getSelectedIndex() == 1) {

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
                PreparedStatement stmt2 = con.prepareStatement("select Student_ID from student where Stu_year = ? order by Fname,Sname,Lname");
                stmt2.setString(1, year);
                ResultSet result2 = stmt2.executeQuery();
                while (result2.next()) {
                    if (result2.getInt(1) == x) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    PreparedStatement stmt = con.prepareStatement("select * from student where Student_ID = ? AND Stu_year = ? order by Fname,Sname,Lname");
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
        } else {
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
                PreparedStatement stmt = con.prepareStatement("select * from student where Stu_year = ? order by Fname,Sname,Lname");
                stmt.setString(1, year);
                ResultSet result = stmt.executeQuery();
                for (int i = 1; result.next(); i++) {

                    if (x == 1 && i <= 20) {
                        PreparedStatement stmt2 = con.prepareStatement("select * from student where Stu_year = ?   order by Fname,Sname,Lname");
                        stmt2.setString(1, year);
                        ResultSet res = stmt2.executeQuery();
                        StudentTable.setModel(DbUtils.resultSetToTableModel(res));
                        StudentTable.setEnabled(false);
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);
                    } else if (x == 2 && (i > 20 || i <= 40)) {
                        PreparedStatement stmt2 = con.prepareStatement("select * from student where Stu_year = ? AND Student_ID > ? AND Student_ID <= ? order by Fname,Sname,Lname");
                        stmt2.setString(1, year);
                        stmt2.setInt(2, 20);
                        stmt2.setInt(3, 40);
                        ResultSet res = stmt2.executeQuery();
                        StudentTable.setModel(DbUtils.resultSetToTableModel(res));
                        StudentTable.setEnabled(false);
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);
                    } else if (x == 3 && (i > 40 || i <= 60)) {
                        PreparedStatement stmt2 = con.prepareStatement("select * from student where Stu_year = ? AND Student_ID > ? AND Student_ID <= ? order by Fname,Sname,Lname");
                        stmt2.setString(1, year);
                        stmt2.setInt(2, 40);
                        stmt2.setInt(3, 60);
                        ResultSet res = stmt2.executeQuery();
                        StudentTable.setModel(DbUtils.resultSetToTableModel(res));
                        StudentTable.setEnabled(false);
                        StudentTable.setShowHorizontalLines(true);
                        StudentTable.setShowVerticalLines(true);
                    }
                    //and soo on
                }
            } catch (SQLException ex) {
                Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchField2ActionPerformed
        
        boolean z = false, y = false;
        if ((searchbylist2.getSelectedIndex() == -1) || (searchField2.getText().equals(""))) {
            JOptionPane.showMessageDialog(this, "Invalid Input .. Fill all Search Fields.");
            z = true;
        }
        if (searchField2.getText().charAt(0) == ' ') {
            if (!z) {
                JOptionPane.showMessageDialog(this, "Invalid Input .. Doctor Name ot ID can't begin with space.");
                y = true;
            }
        }

        if (searchbylist2.getSelectedIndex() == 1) {
            int count[] = new int[3];
            count[0] = 0;
            count[1] = 0;
            count[2] = 0;
            int x = 0;

            for (int i = 0; i < (searchField2.getText().length()); i++) {
                if (searchField2.getText().charAt(i) == ' ') {
                    x++;
                    if (searchField2.getText().charAt(i - 1) == ' ') {
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
                for (int i = 0; i < (searchField2.getText().length()); i++) {
                    if (searchField2.getText().charAt(i) == ' ') {
                        if (searchField2.getText().charAt(i - 1) == ' ') {
                            continue;
                        }
                        counter++;
                        m = 0;
                        continue;
                    }
                    if (counter == 0) {
                        Fname[m] = searchField2.getText().charAt(i);
                    }
                    if (counter == 1) {
                        Sname[m] = searchField2.getText().charAt(i);
                    }
                    if (counter == 2) {
                        Lname[m] = searchField2.getText().charAt(i);
                    }
                    m++;
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("select Fname,Sname,Lname from doctor order by Fname,Sname,Lname");

                    ResultSet result2 = stmt2.executeQuery();

                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname)) && result2.getString(2).equals(String.valueOf(Sname)) && result2.getString(3).equals(String.valueOf(Lname))) {
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        DoctorTable.setShowHorizontalLines(true);
                        DoctorTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from doctor WHERE Fname = ? And Sname = ? And Lname = ? order by Fname,Sname,Lname");
                        stmt.setString(1, String.valueOf(Fname));
                        stmt.setString(2, String.valueOf(Sname));
                        stmt.setString(3, String.valueOf(Lname));

                        ResultSet result = stmt.executeQuery();

                        DoctorTable.setModel(DbUtils.resultSetToTableModel(result));
                        DoctorTable.setEnabled(false);
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
                for (int i = 0; i < (searchField2.getText().length()); i++) {
                    if (searchField2.getText().charAt(i) == ' ') {
                        if (searchField2.getText().charAt(i - 1) == ' ') {
                            continue;
                        }
                        counter++;
                        m = 0;
                        continue;
                    }
                    if (counter == 0) {
                        Fname[m] = searchField2.getText().charAt(i);
                    }
                    if (counter == 1) {
                        Sname[m] = searchField2.getText().charAt(i);
                    }

                    m++;
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("select Fname,Sname from doctor order by Fname,Sname,Lname");

                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname)) && result2.getString(2).equals(String.valueOf(Sname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        DoctorTable.setShowHorizontalLines(true);
                        DoctorTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from doctor WHERE Fname = ? AND Sname = ? order by Fname,Sname,Lname");
                        stmt.setString(1, String.valueOf(Fname));
                        stmt.setString(2, String.valueOf(Sname));

                        ResultSet result = stmt.executeQuery();

                        DoctorTable.setModel(DbUtils.resultSetToTableModel(result));
                        DoctorTable.setEnabled(false);
                    } else if (count[1] != 0) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (x == 0) {

                char[] Fname = new char[count[0]];

                for (int i = 0; i < (searchField2.getText().length()); i++) {
                    if (searchField2.getText().charAt(i) == ' ') {
                        break;
                    }
                    Fname[i] = searchField2.getText().charAt(i);
                }

                try {

                    boolean check = false;
                    PreparedStatement stmt2 = con.prepareStatement("select Fname from doctor order by Fname,Sname,Lname");

                    ResultSet result2 = stmt2.executeQuery();
                    while (result2.next()) {
                        if (result2.getString(1).equals(String.valueOf(Fname))) {
                            check = true;
                            break;
                        }
                    }

                    if (check) {
                        DoctorTable.setShowHorizontalLines(true);
                        DoctorTable.setShowVerticalLines(true);

                        PreparedStatement stmt = con.prepareStatement("SELECT * from doctor WHERE Fname = ? order by Fname,Sname,Lname");
                        stmt.setString(1, String.valueOf(String.valueOf(Fname)));

                        ResultSet result = stmt.executeQuery();

                        DoctorTable.setModel(DbUtils.resultSetToTableModel(result));
                        DoctorTable.setEnabled(false);
                    } else if (!searchField2.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Grade.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Invalid Input.");
            }

        } else if (searchbylist2.getSelectedIndex() == 0) {

            int x = 0;
            try {
                x = Integer.parseInt(searchField2.getText());
            } catch (Exception e) {
                if (!y) {
                    JOptionPane.showMessageDialog(this, "Invalid ID .. there is an character in ID.");
                }
                y = true;
            }
            try {

                boolean check = false;
                PreparedStatement stmt2 = con.prepareStatement("select Doctor_ID from doctor order by Fname,Sname,Lname");

                ResultSet result2 = stmt2.executeQuery();
                while (result2.next()) {
                    if (result2.getInt(1) == x) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    PreparedStatement stmt = con.prepareStatement("select * from doctor where Doctor_ID = ? order by Fname,Sname,Lname");
                    stmt.setInt(1, x);

                    ResultSet result = stmt.executeQuery();

                    DoctorTable.setModel(DbUtils.resultSetToTableModel(result));
                    DoctorTable.setEnabled(false);
                    DoctorTable.setShowHorizontalLines(true);
                    DoctorTable.setShowVerticalLines(true);

                } else if (!searchField2.getText().equals("")) {
                    if (!y) {
                        JOptionPane.showMessageDialog(this, "Recoed Not Found.");
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_searchField2ActionPerformed

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
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JTabbedPane StudentDoctorTabbed;
    private javax.swing.JPanel StudentPanel;
    private javax.swing.JPanel StudentPanel2;
    private javax.swing.JTable StudentTable;
    private javax.swing.JLabel YearSearchbyLabel;
    private javax.swing.JLabel YearSearchbyLabel2;
    private javax.swing.JComboBox<String> Yearlist;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JPanel innerPanel;
    private javax.swing.JPanel innerPanel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton print;
    private javax.swing.JButton printButton;
    private javax.swing.JButton search;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField searchField2;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel searchPanel2;
    private javax.swing.JComboBox<String> searchbylist;
    private javax.swing.JComboBox<String> searchbylist2;
    private javax.swing.JScrollPane tablePanel;
    private javax.swing.JScrollPane tablePanel2;
    private javax.swing.JLabel variableLabel;
    private javax.swing.JLabel variableLabel2;
    // End of variables declaration//GEN-END:variables
}
