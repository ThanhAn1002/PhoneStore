package Menu_Admin_3.NhanVien;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Form_Nhan_Vien extends javax.swing.JPanel {

    public Form_Nhan_Vien() {
        initComponents();
        setOpaque(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollBarCustom2 = new ScrollBar.ScrollBarCustom();
        panelRound1 = new Menu_Admin_3.DoanhThu.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        button1 = new Menu_Admin_3.HeThong.Button();
        button2 = new Menu_Admin_3.HeThong.Button();
        button3 = new Menu_Admin_3.HeThong.Button();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Menu_Admin_3.DoanhThu.TableColumn();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchText1 = new Menu_Admin_3.NhanVien.SearchText();
        jComboBox1 = new javax.swing.JComboBox<>();
        button4 = new Menu_Admin_3.HeThong.Button();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Full Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Gender:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Data of Birth:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Phone Number:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Address:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("User Name:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/more staff.png"))); // NOI18N

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        button1.setBackground(new java.awt.Color(0, 102, 153));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Edit");
        button1.setFocusable(false);
        button1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
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

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye.png"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(jTextField4)))
                        .addGap(84, 84, 84)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBar(scrollBarCustom2);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Full Name", "Gender", "Date of Birth", "Phone Number", "Address", "User Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(79, 79, 79));
        jLabel2.setText("Staff List");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 1, 1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N

        searchText1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchText1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchText1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchText1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchText1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jComboBox1.setBackground(new java.awt.Color(242, 242, 242));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by Id", "Sort by Name", "Sort by Phone Number" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(242, 242, 242));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        button4.setFocusable(false);
        button4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollBarCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollBarCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth() - 25, getHeight() - 25, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }
    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void searchText1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText1KeyReleased
        // TODO add your handling code here:
//        DefaultTableModel obj = (DefaultTableModel) table.getModel();
//        TableRowSorter<DefaultTableModel> objl = new TableRowSorter<>(obj);
//        table.setRowSorter(objl);
//        objl.setRowFilter(RowFilter.regexFilter(searchText1.getText()));
    }//GEN-LAST:event_searchText1KeyReleased

    private void searchText1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchText1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DefaultTableModel obj = (DefaultTableModel) table.getModel();
            TableRowSorter<DefaultTableModel> objl = new TableRowSorter<>(obj);
            table.setRowSorter(objl);
            objl.setRowFilter(RowFilter.regexFilter(searchText1.getText()));
        }
    }//GEN-LAST:event_searchText1KeyPressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex != -1) {
            int filledFieldsCount = 0;
            if (!jTextField3.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField4.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField5.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField6.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField7.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jTextField8.getText().isEmpty()) {
                filledFieldsCount++;
            }
            if (!jPasswordField1.getText().isEmpty()) {
                filledFieldsCount++;
            }

            if (filledFieldsCount == 7) {
                try {
                    File inputFile = new File("nhanvien.txt");
                    File tempFile = new File("nhanvien_temp.txt");
                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
                    String line;
                    int lineNumber = 0;
                    while ((line = reader.readLine()) != null) {
                        if (lineNumber == selectedRowIndex) {
                            String[] parts = line.split(",");
                            parts[1] = jTextField3.getText();
                            parts[2] = jTextField4.getText();
                            parts[3] = jTextField5.getText();
                            parts[4] = jTextField6.getText();
                            parts[5] = jTextField7.getText();
                            parts[6] = jTextField8.getText();
                            parts[7] = jPasswordField1.getText();
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
                        jTextField3.setText("");
                        jTextField4.setText("");
                        jTextField5.setText("");
                        jTextField6.setText("");
                        jTextField7.setText("");
                        jTextField8.setText("");
                        jPasswordField1.setText("");
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

    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        String fullname = jTextField3.getText();
        String gender = jTextField4.getText();
        String dateofbirth = jTextField5.getText();
        String phonenumber = jTextField6.getText();
        String address = jTextField7.getText();
        String username = jTextField8.getText();
        String password = new String(jPasswordField1.getPassword());
        if (fullname.isEmpty() || gender.isEmpty() || dateofbirth.isEmpty() || phonenumber.isEmpty() || address.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all fields!", "Try again!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean duplicatePhone = isDuplicatePhoneNumber(phonenumber);
        boolean duplicateUsername = isDuplicateUsername(username);
        if (duplicatePhone && duplicateUsername) {
            JOptionPane.showMessageDialog(this, "Phone number and username already exist!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (duplicatePhone) {
            JOptionPane.showMessageDialog(this, "Phone number already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (duplicateUsername) {
            JOptionPane.showMessageDialog(this, "Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        List<String[]> data = readDataFromFile();
        int nextID = findNextAvailableID(data);
        String newRecord = String.format("%d,%s,%s,%s,%s,%s,%s,%s\n", nextID, fullname, gender, dateofbirth, phonenumber, address, username, password);
        try (FileWriter writer = new FileWriter("nhanvien.txt", true)) {
            writer.write(newRecord);
            JOptionPane.showMessageDialog(this, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving data to file!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //an password
        ((DefaultTableModel) table.getModel()).addRow(new Object[]{nextID, fullname, gender, dateofbirth, phonenumber, address, username, "***"});
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jPasswordField1.setText("");
    }

    private List<String[]> readDataFromFile() {
        List<String[]> data = new ArrayList<>();
        try (FileReader reader = new FileReader("nhanvien.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                data.add(line.split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private int findNextAvailableID(List<String[]> data) {
        int maxID = 0;
        Set<Integer> usedIDs = new HashSet<>();

        for (String[] record : data) {
            if (record.length > 0) {
                try {
                    int currentID = Integer.parseInt(record[0]);
                    maxID = Math.max(maxID, currentID);
                    usedIDs.add(currentID);
                } catch (NumberFormatException e) {
                }
            }
        }
        for (int i = maxID + 1;; i++) {
            if (!usedIDs.contains(i)) {
                return i;
            }
        }
    }

    private boolean isDuplicatePhoneNumber(String phoneNumber) {
        for (String[] record : readDataFromFile()) {
            if (record.length > 4 && record[4].equals(phoneNumber)) {
                return true;
            }
        }
        return false;
    }

    private boolean isDuplicateUsername(String username) {
        for (String[] record : readDataFromFile()) {
            if (record.length > 6 && record[6].equals(username)) {
                return true;
            }
        }
        return false;
    }//GEN-LAST:event_button3ActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
//        try (FileReader reader = new FileReader("nhanvien.txt")) {
//            BufferedReader br = new BufferedReader(reader);
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] data = line.split(",");
//                String id = data[0];
//                String fullname = data[1];
//                String gender = data[2];
//                String dateofbirth = data[3];
//                String phonenumber = data[4];
//                String address = data[5];
//                String username = data[6];
//                String password = "***"; //an password
//                DefaultTableModel model = (DefaultTableModel) table.getModel();
//                model.addRow(new Object[]{id, fullname, gender, dateofbirth, phonenumber, address, username, password});
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(this,
//                    "Error loading data from file!",
//                    "Error",
//                    JOptionPane.ERROR_MESSAGE);
//        }
        try (FileReader reader = new FileReader("nhanvien.txt")) {
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8) {
                    String id = data[0];
                    String name = data[1];
                    String gender = data[2];
                    String dateofbirth = data[3];
                    String phone = data[4];
                    String address = data[5];
                    String username = data[6];
                    String password = "******";
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.addRow(new Object[]{id, name, gender, dateofbirth, phone, address, username, password});
                }
            }
            table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent event) {
                    if (!event.getValueIsAdjusting()) {
                        int selectedRowIndex = table.getSelectedRow();
                        if (selectedRowIndex != -1) {
                            try (BufferedReader reader = new BufferedReader(new FileReader("nhanvien.txt"))) {
                                String line;
                                int lineNumber = 0;
                                while ((line = reader.readLine()) != null) {
                                    if (lineNumber == selectedRowIndex) {
                                        String[] data = line.split(",");
                                        if (data.length >= 8) {
                                            String name = data[1];
                                            String gender = data[2];
                                            String dateofbirth = data[3];
                                            String phone = data[4];
                                            String address = data[5];
                                            String username = data[6];
                                            String password = data[7];

                                            jTextField3.setText(name);
                                            jTextField4.setText(gender);
                                            jTextField5.setText(dateofbirth);
                                            jTextField6.setText(phone);
                                            jTextField7.setText(address);
                                            jTextField8.setText(username);
                                            jPasswordField1.setText(password);
                                            break;
                                        }
                                    }
                                    lineNumber++;
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(Form_Nhan_Vien.this, "Error reading data from file!", "Error", JOptionPane.ERROR_MESSAGE);
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
            case "Sort by Id":
                Collections.sort(rows, new Comparator<Object[]>() {
                    @Override
                    public int compare(Object[] row1, Object[] row2) {
                        Integer id1 = Integer.parseInt(String.valueOf(row1[0]));
                        Integer id2 = Integer.parseInt(String.valueOf(row2[0]));
                        return id1.compareTo(id2);
                    }
                });
                break;
            case "Sort by Phone Number":
                Collections.sort(rows, new Comparator<Object[]>() {
                    @Override
                    public int compare(Object[] row1, Object[] row2) {
                        String phone1 = ((String) row1[4]).replaceAll("[^\\d]", "");
                        String phone2 = ((String) row2[4]).replaceAll("[^\\d]", "");
                        return phone1.compareTo(phone2);
                    }
                });
                break;
            case "Sort by Name":
                Collections.sort(rows, new Comparator<Object[]>() {
                    @Override
                    public int compare(Object[] row1, Object[] row2) {
                        return ((String) row1[1]).compareTo((String) row2[1]);
                    }
                });
                break;
        }
        tableModel.setRowCount(0);
        for (Object[] row : rows) {
            tableModel.addRow(row);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table.getSelectedRow();
        if (selectedRowIndex != -1) {
            try (BufferedReader reader = new BufferedReader(new FileReader("nhanvien.txt")); BufferedWriter writer = new BufferedWriter(new FileWriter("nhanvien_temp.txt"))) {
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

            File dataFile = new File("nhanvien.txt");
            File tempFile = new File("nhanvien_temp.txt");
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

    }//GEN-LAST:event_button4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('●');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Menu_Admin_3.HeThong.Button button1;
    private Menu_Admin_3.HeThong.Button button2;
    private Menu_Admin_3.HeThong.Button button3;
    private Menu_Admin_3.HeThong.Button button4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private Menu_Admin_3.DoanhThu.PanelRound panelRound1;
    private ScrollBar.ScrollBarCustom scrollBarCustom2;
    private Menu_Admin_3.NhanVien.SearchText searchText1;
    private Menu_Admin_3.DoanhThu.TableColumn table;
    // End of variables declaration//GEN-END:variables
}
