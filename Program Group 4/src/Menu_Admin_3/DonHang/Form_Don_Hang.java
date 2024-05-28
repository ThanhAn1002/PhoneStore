package Menu_Admin_3.DonHang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;

public class Form_Don_Hang extends javax.swing.JPanel {

    public Form_Don_Hang() {
        initComponents();
        table.fixTable(jScrollPane1);
        setOpaque(false);
        initData();
    }

    private void initData() {
        initCardData();
        initTableData();
    }

    private void initCardData() {

        card16.setData(new ModelCard("Total Order", 5100, 90, null));
        card7.setData(new ModelCard("Error Order", 1000, 10, null));
        card1.setData(new ModelCard("Successful Order", 4100, 80, null));
    }

    private void initTableData() {
        EventAction eventAction = new EventAction() {
            @Override
            public void delete(ModelStudent student) {

            }

            @Override
            public void update(ModelStudent student) {

            }
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        card16 = new Menu_Admin_3.DonHang.Card();
        card7 = new Menu_Admin_3.DonHang.Card();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Menu_Admin_3.DonHang.Table();
        card1 = new Menu_Admin_3.DonHang.Card();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        button3 = new Menu_Admin_3.HeThong.Button();
        button2 = new Menu_Admin_3.HeThong.Button();
        button4 = new Menu_Admin_3.HeThong.Button();
        jLabel10 = new javax.swing.JLabel();
        txtVerOTP = new javax.swing.JTextField();
        button5 = new Menu_Admin_3.HeThong.Button();
        jComboBox1 = new javax.swing.JComboBox<>();
        button1 = new Menu_Admin_3.HeThong.Button();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        card16.setBackground(new java.awt.Color(0, 153, 255));
        card16.setColorGradient(new java.awt.Color(211, 28, 215));

        card7.setBackground(new java.awt.Color(0, 153, 255));
        card7.setColorGradient(new java.awt.Color(255, 212, 99));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Product", "Total Amount", "Purchase Time "
            }
        ));
        jScrollPane1.setViewportView(table);

        card1.setBackground(new java.awt.Color(0, 153, 255));
        card1.setColorGradient(new java.awt.Color(208, 255, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 76, 76));
        jLabel5.setText("Create order");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Gender:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Phone Number:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Product:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText(" Price:");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField5.setText("$ ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Address:");

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Email:");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        button3.setBackground(new java.awt.Color(0, 102, 153));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Add");
        button3.setFocusable(false);
        button3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(0, 102, 153));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Clean");
        button2.setFocusable(false);
        button2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(0, 0, 0));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Verification");
        button4.setFocusable(false);
        button4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Enter OTP:");

        txtVerOTP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        button5.setBackground(new java.awt.Color(0, 102, 153));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Edit");
        button5.setFocusable(false);
        button5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(24, 227, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtVerOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtVerOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jComboBox1.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort up/down by total amount" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(242, 242, 242));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        button1.setFocusable(false);
        button1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card16, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        String name = jTextField1.getText();
        String gender = jTextField2.getText();
        String email = jTextField8.getText();
        String phone = txtPhone.getText();
        String address = jTextField4.getText();
        String product = jTextField7.getText();
        String price = jTextField5.getText();
        String OTP = txtVerOTP.getText();
//      String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss  dd/MM/yyyy");
        String time = LocalDateTime.now().format(formatter);

        if (name.isEmpty() || gender.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty() || product.isEmpty() || price.isEmpty() || OTP.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter all fields!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean emailExists = false;
        boolean phoneExists = false;
        int nextID = 1;

        // Check for duplicate phone number and email
        try (BufferedReader reader = new BufferedReader(new FileReader("khachhang.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 9) {
                    int existingID = Integer.parseInt(parts[0]);
                    String existingEmail = parts[3];
                    String existingPhone = parts[4];

                    if (existingEmail.equals(email) && existingPhone.equals(phone)) {
                        emailExists = true;
                        phoneExists = true;
                        break;
                    } else if (existingEmail.equals(email)) {
                        emailExists = true;
                    } else if (existingPhone.equals(phone)) {
                        phoneExists = true;
                    }
                    if (existingID >= nextID) {
                        nextID = existingID + 1;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error reading data from file!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (emailExists && phoneExists) {
            JOptionPane.showMessageDialog(this,
                    "Both email and phone number already exist!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (emailExists) {
            JOptionPane.showMessageDialog(this,
                    "Email already exists!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (phoneExists) {
            JOptionPane.showMessageDialog(this,
                    "Phone number already exists!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            try (FileWriter writer = new FileWriter("khachhang.txt", true)) {
                writer.write(String.format("%d,%s,%s,%s,%s,%s,%s,%s,%s\n", nextID, name, gender, email, phone, address, product, price, time));
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this,
                        "Error saving data to file!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{nextID, name, product, price, time});
            JOptionPane.showMessageDialog(this,
                    "Data added successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField8.setText("");
            txtPhone.setText("");
            jTextField4.setText("");
            jTextField7.setText("");
            jTextField5.setText("$ ");
            txtVerOTP.setText("");
        }

    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField8.setText("");
        txtPhone.setText("");
        jTextField4.setText("");
        jTextField7.setText("");
        jTextField5.setText("$ ");
        txtVerOTP.setText("");
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex != -1) {
            try (BufferedReader reader = new BufferedReader(new FileReader("khachhang.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("khachhang_temp.txt"))) {
                String line;
                int lineNumber = 0;
                while ((line = reader.readLine()) != null) {
                    if (lineNumber != selectedRowIndex) {
                        writer.write(line + "\n");
                    }
                    lineNumber++;
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error deleting data!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            File dataFile = new File("khachhang.txt");
            File tempFile = new File("khachhang_temp.txt");
            if (dataFile.delete() && tempFile.renameTo(dataFile)) {
                // Data deleted and temporary file renamed successfully
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(selectedRowIndex);
                JOptionPane.showMessageDialog(this, "Data deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error deleting data!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField8.setText("");
        txtPhone.setText("");
        jTextField4.setText("");
        jTextField7.setText("");
        jTextField5.setText("$ ");
        txtVerOTP.setText("");
    }//GEN-LAST:event_button1ActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
        try (FileReader reader = new FileReader("khachhang.txt")) {
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 9) {
                    String id = data[0];
                    String name = data[1];
                    String product = data[6];
                    String price = data[7];
                    String time = data[8];
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.addRow(new Object[]{id, name, product, price, time});
                }
            }
            table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent event) {
                    if (!event.getValueIsAdjusting()) {
                        int selectedRowIndex = table.getSelectedRow();
                        if (selectedRowIndex != -1) {
                            try (BufferedReader reader = new BufferedReader(new FileReader("khachhang.txt"))) {
                                String line;
                                int lineNumber = 0;
                                while ((line = reader.readLine()) != null) {
                                    if (lineNumber == selectedRowIndex) {
                                        String[] data = line.split(",");
                                        if (data.length >= 9) {
                                            String name = data[1];
                                            String gender = data[2];
                                            String email = data[3];
                                            String phone = data[4];
                                            String address = data[5];
                                            String product = data[6];
                                            String price = data[7];
                                            String OTP = ""; // You might need to adjust this if OTP is present in the file
                                            // String time = data[8]; // Assuming time is already set when adding rows

                                            // Set values to JTextFields
                                            jTextField1.setText(name);
                                            jTextField2.setText(gender);
                                            jTextField8.setText(email);
                                            txtPhone.setText(phone);
                                            jTextField4.setText(address);
                                            jTextField7.setText(product);
                                            jTextField5.setText(price);
                                            txtVerOTP.setText(OTP);
                                            break;
                                        }
                                    }
                                    lineNumber++;
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(Form_Don_Hang.this, "Error reading data from file!", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error loading data from file!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formAncestorAdded
    private boolean sortAscending = true;
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedOption = (String) jComboBox1.getSelectedItem();
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        List<Object[]> rows = new ArrayList<>();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            Object[] rowValues = new Object[tableModel.getColumnCount()];
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                rowValues[j] = tableModel.getValueAt(i, j);
            }
            rows.add(rowValues);
        }
        switch (selectedOption) {
            case "Sort up/down by total amount":
                Collections.sort(rows, new Comparator<Object[]>() {
                    @Override
                    public int compare(Object[] row1, Object[] row2) {
                        Double amount1 = Double.valueOf(row1[3].toString().replace("$ ", " "));
                        Double amount2 = Double.valueOf(row2[3].toString().replace("$ ", " "));
                        if (sortAscending) {
                            return amount1.compareTo(amount2);
                        } else {
                            return amount2.compareTo(amount1);
                        }
                    }
                });
                sortAscending = !sortAscending;
                break;
        }
        tableModel.setRowCount(0);
        for (Object[] row : rows) {
            tableModel.addRow(row);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed

    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex != -1) {
            int filledFieldsCount = 0;
            if (!jTextField1.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField2.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField8.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!txtPhone.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField4.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField7.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField5.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!txtVerOTP.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (filledFieldsCount == 8) {
                try {
                    File inputFile = new File("khachhang.txt");
                    File tempFile = new File("khachhang_temp.txt");
                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
                    String line;
                    int lineNumber = 0;
                    while ((line = reader.readLine()) != null) {
                        if (lineNumber == selectedRowIndex) {
                            String[] parts = line.split(",");
                            parts[1] = jTextField1.getText();
                            parts[2] = jTextField2.getText();
                            parts[3] = jTextField8.getText();
                            parts[4] = txtPhone.getText();
                            parts[5] = jTextField4.getText();
                            parts[6] = jTextField7.getText();
                            parts[7] = jTextField5.getText();
                            String editedLine = String.join(",", parts);
                            writer.write(editedLine + "\n");
                        } else {
                            writer.write(line + "\n");
                        }
                        lineNumber++;
                    }

                    reader.close();
                    writer.close();
                    if (inputFile.delete() && tempFile.renameTo(inputFile)) {
                        JOptionPane.showMessageDialog(this, "Data edited and saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField8.setText("");
                        txtPhone.setText("");
                        jTextField4.setText("");
                        jTextField7.setText("");
                        jTextField5.setText("$ ");
                        txtVerOTP.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error saving edited data!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error editing data!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to edit!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_button5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Menu_Admin_3.HeThong.Button button1;
    private Menu_Admin_3.HeThong.Button button2;
    private Menu_Admin_3.HeThong.Button button3;
    private Menu_Admin_3.HeThong.Button button4;
    private Menu_Admin_3.HeThong.Button button5;
    private Menu_Admin_3.DonHang.Card card1;
    private Menu_Admin_3.DonHang.Card card16;
    private Menu_Admin_3.DonHang.Card card7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private Menu_Admin_3.DonHang.Table table;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtVerOTP;
    // End of variables declaration//GEN-END:variables
}
