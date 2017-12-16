package college.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Doctor extends javax.swing.JFrame {

    Connection con;

    public Doctor() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Students Affairs Management System");
        buttonGroup1.add(male);
         buttonGroup1.add(female);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        firstName = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        secondName = new javax.swing.JLabel();
        secondNameField = new javax.swing.JTextField();
        lastName = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        studentID = new javax.swing.JLabel();
        studentIDField = new javax.swing.JTextField();
        birthDate = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        dayMonthYear = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        gender = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        phoneNumber = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        mailField = new javax.swing.JTextField();
        fcimail = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        SSN = new javax.swing.JLabel();
        SSNField = new javax.swing.JTextField();
        buttonsPanel = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1319, 867));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabel1.setText("                          D o c t o r    I n f o r m a t i o n");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)));

        firstName.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        firstName.setText("First Name  :");

        firstNameField.setBackground(new java.awt.Color(204, 204, 204));
        firstNameField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        secondName.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        secondName.setText("Second Name  :");

        secondNameField.setBackground(new java.awt.Color(204, 204, 204));
        secondNameField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        lastName.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        lastName.setText("Last Name  :");
        lastName.setMaximumSize(new java.awt.Dimension(144, 22));
        lastName.setMinimumSize(new java.awt.Dimension(144, 22));

        lastNameField.setBackground(new java.awt.Color(204, 204, 204));
        lastNameField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        studentID.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        studentID.setText("Doctor_ID  :");
        studentID.setMaximumSize(new java.awt.Dimension(144, 22));
        studentID.setMinimumSize(new java.awt.Dimension(144, 22));

        studentIDField.setBackground(new java.awt.Color(204, 204, 204));
        studentIDField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        birthDate.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        birthDate.setText("Birth date  :");
        birthDate.setMaximumSize(new java.awt.Dimension(144, 22));
        birthDate.setMinimumSize(new java.awt.Dimension(144, 22));

        day.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setSelectedIndex(-1);
        day.setToolTipText("");
        day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        day.setName("Day"); // NOI18N
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        dayMonthYear.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        dayMonthYear.setText("   Day                   Month                     Year");

        month.setFont(new java.awt.Font("Bookman Old Style", 3, 15)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "  March", "   April", "   May", "   June", "   July", " August", "September", " October", "November", "December" }));
        month.setSelectedIndex(-1);
        month.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        year.setSelectedIndex(-1);
        year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        gender.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        gender.setText("Gender  :");
        gender.setMaximumSize(new java.awt.Dimension(144, 22));
        gender.setMinimumSize(new java.awt.Dimension(144, 22));
        gender.setPreferredSize(new java.awt.Dimension(116, 22));

        male.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        female.setText("Female");

        phoneNumber.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        phoneNumber.setText("Phone Number :");

        phoneNumberField.setBackground(new java.awt.Color(204, 204, 204));
        phoneNumberField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        phoneNumberField.setPreferredSize(new java.awt.Dimension(304, 28));

        email.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        email.setText("E-Mail :");

        mailField.setBackground(new java.awt.Color(204, 204, 204));
        mailField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N

        fcimail.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        fcimail.setText("@fci.bu.edu.eg");

        address.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        address.setText("Address :");

        addressField.setBackground(new java.awt.Color(204, 204, 204));
        addressField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        addressField.setPreferredSize(new java.awt.Dimension(69, 37));
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        SSN.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        SSN.setText("SSN :");

        SSNField.setBackground(new java.awt.Color(204, 204, 204));
        SSNField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        SSNField.setPreferredSize(new java.awt.Dimension(69, 37));

        buttonsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        add.setText("Add");
        add.setToolTipText("Add New Record");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(204, 204, 204));
        update.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        update.setText("Update");
        update.setToolTipText("Update Selected Record");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        delete.setText("Delete");
        delete.setToolTipText("Delete Selected Record");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
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

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        searchButton.setFont(new java.awt.Font("Bookman Old Style", 3, 16)); // NOI18N
        searchButton.setText("Search");
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchField.setBackground(new java.awt.Color(204, 204, 204));
        searchField.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchLabel.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        searchLabel.setText("Doctor ID");

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/back2.png"))); // NOI18N
        back.setToolTipText("Back to Previous Page");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/back.png"))); // NOI18N
        logout.setToolTipText("Logout");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(birthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(studentID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(secondName, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lastNameField)
                                            .addComponent(secondNameField)
                                            .addComponent(studentIDField)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(day, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(dayMonthYear, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(phoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(SSN, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SSNField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mailField)
                                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(fcimail)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secondName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(dayMonthYear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(birthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(year)
                            .addComponent(month)
                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fcimail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SSNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SSN, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        try {
            boolean check = false;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
            PreparedStatement stmt = con.prepareStatement("insert into doctor (Doctor_ID,Fname,Sname,Lname,Address,E_Mail,Phone_Num,Gender,Birth_Date,SSN) values(?,?,?,?,?,?,?,?,?,?)");

            boolean test = false;

            if (firstNameField.getText().equals("") || secondNameField.getText().equals("") || lastNameField.getText().equals("") || studentIDField.getText().equals("") || day.getSelectedIndex() == -1 || month.getSelectedIndex() == -1 || year.getSelectedIndex() == -1 || (!(male.isSelected()) && !(female.isSelected())) || phoneNumberField.getText().equals("") || addressField.getText().equals("") || SSNField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Input Error... Fill All Fields.");
                test = true;
            }
            if (!test) {
                try {
                    int x;
                    x = Integer.parseInt(studentIDField.getText());
                    x = Integer.parseInt(phoneNumberField.getText());
                }//catch(NumberFormatException e1)
//                {
//                    //JOptionPane.showMessageDialog(this, "Invalid Phone number.");
//                    JOptionPane.showMessageDialog(this, "Error .. ID and Phone Number must be integers not Characters.");S
//                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error .. ID and Phone Number must be integers not Characters.");
                }
            

            do {
                check = false;
                PreparedStatement stmt2 = con.prepareStatement("select Doctor_ID from doctor ");
                ResultSet result = stmt2.executeQuery();
                while (result.next()) {
                    if (result.getInt(1) == Integer.parseInt(studentIDField.getText())) {
                        JOptionPane.showMessageDialog(this, "this ID is already exsist ... Enter another ID.");
                        check = true;
                        break;
                    }
                }
                if (check) {
                    studentIDField.setText("");
                }
            } while (check);

            stmt.setInt(1, Integer.parseInt(studentIDField.getText()));
            stmt.setString(2, firstNameField.getText());
            stmt.setString(3, secondNameField.getText());
            stmt.setString(4, lastNameField.getText());
            stmt.setString(5, addressField.getText());
            stmt.setString(6, mailField.getText());
            stmt.setInt(7, Integer.parseInt(phoneNumberField.getText()));
            String gender = "";
            if (male.isSelected()) {
                gender = "male";
            } else if (female.isSelected()) {
                gender = "female";
            }
            stmt.setString(8, gender);

            String m = "";
            if (month.getSelectedItem().equals("January")) {
                m = "01";
            } else if (month.getSelectedItem().equals("February")) {
                m = "02";
            } else if (month.getSelectedItem().equals("  March")) {
                m = "03";
            } else if (month.getSelectedItem().equals("   April")) {
                m = "04";
            } else if (month.getSelectedItem().equals("   May")) {
                m = "05";
            } else if (month.getSelectedItem().equals("   June")) {
                m = "06";
            } else if (month.getSelectedItem().equals("   July")) {
                m = "07";
            } else if (month.getSelectedItem().equals(" August")) {
                m = "08";
            } else if (month.getSelectedItem().equals("September")) {
                m = "09";
            } else if (month.getSelectedItem().equals(" October")) {
                m = "10";
            } else if (month.getSelectedItem().equals("November")) {
                m = "11";
            } else if (month.getSelectedItem().equals("December")) {
                m = "12";
            }

            stmt.setString(9, day.getSelectedItem() + "/" + m + "/" + year.getSelectedItem());

            stmt.setString(10, SSNField.getText());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Saved Successfully.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        PreparedStatement stmt;
        
        
        boolean test = false;
        if (firstNameField.getText().equals("") || secondNameField.getText().equals("") || lastNameField.getText().equals("") || studentIDField.getText().equals("") || day.getSelectedIndex() == -1 || month.getSelectedIndex() == -1 || year.getSelectedIndex() == -1 || (!(male.isSelected()) && !(female.isSelected())) || phoneNumberField.getText().equals("") || addressField.getText().equals("") || SSNField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Input Error... Fill All Fields.");
                test = true;
            }
            if (!test) {
                try {
                    int x;
                    x = Integer.parseInt(studentIDField.getText());
                    x = Integer.parseInt(phoneNumberField.getText());
                    
                }catch(NumberFormatException e1)
                {
                    JOptionPane.showMessageDialog(this, "Invalid Phone number or Invalid ID.");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error .. ID and Phone Number must be integers not Characters.");
                }
            }
        
            
        try {
          
            stmt = con.prepareStatement("update doctor set Doctor_ID=? ,Fname=? ,Sname=? ,Lname=? ,Address=? ,E_Mail=? ,Phone_Num=? ,Gender=? ,Birth_Date=? ,SSN=? where Doctor_ID=?");

            stmt.setInt(1, Integer.parseInt(studentIDField.getText()));
            stmt.setString(2, firstNameField.getText());
            stmt.setString(3, secondNameField.getText());
            stmt.setString(4, lastNameField.getText());
            stmt.setString(5, addressField.getText());
            stmt.setString(6, mailField.getText());
            stmt.setInt(7, Integer.parseInt(phoneNumberField.getText()));
            String gender = "";
            if (male.isSelected()) {
                gender = "male";
            } else if (female.isSelected()) {
                gender = "female";
            }
            stmt.setString(8, gender);

            String m = "";
            if (month.getSelectedItem().equals("January")) {
                m = "01";
            } else if (month.getSelectedItem().equals("February")) {
                m = "02";
            } else if (month.getSelectedItem().equals("  March")) {
                m = "03";
            } else if (month.getSelectedItem().equals("   April")) {
                m = "04";
            } else if (month.getSelectedItem().equals("   May")) {
                m = "05";
            } else if (month.getSelectedItem().equals("   June")) {
                m = "06";
            } else if (month.getSelectedItem().equals("   July")) {
                m = "07";
            } else if (month.getSelectedItem().equals(" August")) {
                m = "08";
            } else if (month.getSelectedItem().equals("September")) {
                m = "09";
            } else if (month.getSelectedItem().equals(" October")) {
                m = "10";
            } else if (month.getSelectedItem().equals("November")) {
                m = "11";
            } else if (month.getSelectedItem().equals("December")) {
                m = "12";
            }

            stmt.setString(9, day.getSelectedItem() + "/" + m + "/" + year.getSelectedItem());

            stmt.setString(10, SSNField.getText());
            stmt.setInt(11, Integer.parseInt(searchField.getText()));

            boolean z=false;
            try {
                stmt.executeUpdate(); 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error .. this ID is already exists.");
                z=true;
            }

            if(!z)

            JOptionPane.showMessageDialog(this, "Recoed Updated Successfully");

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        PreparedStatement stmt, stmt2;
        boolean check = false;
        try {

            if (searchField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "No Record to be Deleted.");
            }

            stmt2 = con.prepareStatement("select Doctor_ID from doctor");
            ResultSet result = stmt2.executeQuery();
            while (result.next()) {
                if (result.getInt(1) == Integer.parseInt(searchField.getText())) {
                    check = true;
                }
            }
            if (check) {
                stmt = con.prepareStatement("delete from doctor where Doctor_ID = " + Integer.parseInt(searchField.getText()) + ";");
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

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        firstNameField.setText("");
        secondNameField.setText("");
        lastNameField.setText("");
        studentIDField.setText("");
        day.setSelectedIndex(-1);
        month.setSelectedIndex(-1);
        year.setSelectedIndex(-1);

        male.setSelected(false);
        female.setSelected(false);
        phoneNumberField.setText("");
        mailField.setText("");
        searchField.setText("");
        addressField.setText("");
        SSNField.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        new AdminMenu().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        try {
            boolean check = false;
            PreparedStatement stmt = con.prepareStatement("select * from doctor ");
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                if (result.getInt(1) == Integer.parseInt(searchField.getText())) {
                    check = true;
                    break;
                }

            }
            if (check) {
                firstNameField.setText(result.getString(2));
                secondNameField.setText(result.getString(3));
                lastNameField.setText(result.getString(4));
                studentIDField.setText(searchField.getText());
                day.setSelectedIndex(Integer.parseInt((result.getString(9).charAt(0) + "" + result.getString(9).charAt(1))) - 1);
                month.setSelectedIndex(Integer.parseInt((result.getString(9).charAt(3) + "" + result.getString(9).charAt(4))) - 1);
                year.setSelectedIndex(Integer.parseInt((result.getString(9).charAt(6) + "" + result.getString(9).charAt(7)) + "" + result.getString(9).charAt(8) + "" + result.getString(9).charAt(9)) - 1960);
                if (result.getString(8).equals("male")) {
                    male.setSelected(true);
                }
                if (result.getString(8).equals("female")) {
                    female.setSelected(true);
                }
                phoneNumberField.setText(String.valueOf(result.getInt(7)));
                mailField.setText(result.getString(6));
                addressField.setText(result.getString(5));
                SSNField.setText(result.getString(10));
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
       try {
            boolean check = false;
            PreparedStatement stmt = con.prepareStatement("select * from doctor ");
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                if (result.getInt(1) == Integer.parseInt(searchField.getText())) {
                    check = true;
                    break;
                }

            }
            if (check) {
                firstNameField.setText(result.getString(2));
                secondNameField.setText(result.getString(3));
                lastNameField.setText(result.getString(4));
                studentIDField.setText(searchField.getText());
                day.setSelectedIndex(Integer.parseInt((result.getString(9).charAt(0) + "" + result.getString(9).charAt(1))) - 1);
                month.setSelectedIndex(Integer.parseInt((result.getString(9).charAt(3) + "" + result.getString(9).charAt(4))) - 1);
                year.setSelectedIndex(Integer.parseInt((result.getString(9).charAt(6) + "" + result.getString(9).charAt(7)) + "" + result.getString(9).charAt(8) + "" + result.getString(9).charAt(9)) - 1960);
                if (result.getString(8).equals("male")) {
                    male.setSelected(true);
                }
                if (result.getString(8).equals("female")) {
                    female.setSelected(true);
                }
                phoneNumberField.setText(String.valueOf(result.getInt(7)));
                mailField.setText(result.getString(6));
                addressField.setText(result.getString(5));
                SSNField.setText(result.getString(10));
            } else {
                JOptionPane.showMessageDialog(this, "Record Not Found.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SSN;
    private javax.swing.JTextField SSNField;
    private javax.swing.JButton add;
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton back;
    private javax.swing.JLabel birthDate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JLabel dayMonthYear;
    private javax.swing.JButton delete;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fcimail;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton logout;
    private javax.swing.JTextField mailField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel secondName;
    private javax.swing.JTextField secondNameField;
    private javax.swing.JLabel studentID;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JButton update;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
