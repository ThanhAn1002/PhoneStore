package Login_Register_2;

import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormRegister extends javax.swing.JFrame {

    public FormRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonDangKi = new javax.swing.JButton();
        jButtonQuayLai = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTendangnhap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jPassword1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jShowPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cửa hàng PHONE STORE ");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ảnh đăng nhập, đăng kí.jpg"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo login.jpg"))); // NOI18N

        jButtonDangKi.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDangKi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonDangKi.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDangKi.setText("Sign Up");
        jButtonDangKi.setFocusable(false);
        jButtonDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangKiActionPerformed(evt);
            }
        });

        jButtonQuayLai.setBackground(new java.awt.Color(242, 242, 242));
        jButtonQuayLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonQuayLai.setText("Back");
        jButtonQuayLai.setFocusable(false);
        jButtonQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuayLaiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("User name :");

        jTendangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTendangnhapActionPerformed(evt);
            }
        });
        jTendangnhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTendangnhapKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password :");

        jPassword.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });

        jPassword1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassword1ActionPerformed(evt);
            }
        });
        jPassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPassword1KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Re-type password :");

        jShowPass.setBackground(new java.awt.Color(255, 255, 255));
        jShowPass.setForeground(new java.awt.Color(102, 102, 102));
        jShowPass.setText("Show password");
        jShowPass.setFocusable(false);
        jShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jShowPass))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jShowPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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
private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    private void jButtonDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangKiActionPerformed
        StringBuilder sb = new StringBuilder();
        String username = jTendangnhap.getText().trim();
        String password = new String(jPassword.getPassword());
        String confirm = new String(jPassword1.getPassword());

        if (username.isEmpty() && password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and Password cannot be blank!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username cannot be blank!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password cannot be blank!", "Error", JOptionPane.ERROR_MESSAGE);
            jPassword.requestFocus();
            return;
        }

        if (!password.equals(confirm)) {
            JOptionPane.showMessageDialog(this, "The entered password does not match! Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            jPassword.requestFocus();
            return;
        }

        String hashedPassword = hashPassword(password);

        if (hashedPassword == null) {
            JOptionPane.showMessageDialog(this, "Error occurred while hashing the password!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ghi thông tin vào tập tin
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("taikhoan.txt", true))) {
            writer.write(username + ":" + hashedPassword); // Ghi thông tin tài khoản dưới dạng "username:hashedPassword"
            writer.newLine(); // Xuống dòng cho tài khoản tiếp theo
            writer.close(); // Đóng tập tin sau khi ghi
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred while saving account information!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println("Sign Up Success! User name: " + username + ", Password: " + hashedPassword);
        JOptionPane.showMessageDialog(this, "Sign Up Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
        jTendangnhap.setText("");
        jPassword.setText("");
        jPassword1.setText("");
    }//GEN-LAST:event_jButtonDangKiActionPerformed

    private void jButtonQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuayLaiActionPerformed
        FormLogin frm = new FormLogin();
        frm.setVisible(true);
        frm.pack();
        frm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonQuayLaiActionPerformed

    private void jTendangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTendangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTendangnhapActionPerformed

    private void jPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassword1ActionPerformed

    private void jShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowPassActionPerformed
        // TODO add your handling code here:
        if (jShowPass.isSelected()) {
            jPassword.setEchoChar((char) 0);
            jPassword1.setEchoChar((char) 0);
        } else {
            jPassword.setEchoChar('●');
            jPassword1.setEchoChar('●');

        }
    }//GEN-LAST:event_jShowPassActionPerformed

    private void jPassword1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassword1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            StringBuilder sb = new StringBuilder();
            String username = jTendangnhap.getText().trim();
            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username cannot be blank!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String password = new String(jPassword.getPassword());
            if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Password cannot be blank!", "Error", JOptionPane.ERROR_MESSAGE);
                jPassword.requestFocus();
                return;
            }
            String confirm = new String(jPassword1.getPassword());
            if (!password.equals(confirm)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match! Please retry.", "Error", JOptionPane.ERROR_MESSAGE);
                jPassword.requestFocus();
                return;
            }
            System.out.println("Registration successful! Username: " + username + ", Password: " + password);
            JOptionPane.showMessageDialog(this, "Sign Up Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
            jTendangnhap.setText("");
            jPassword.setText("");
            jPassword1.setText("");
    }//GEN-LAST:event_jPassword1KeyPressed
    }
    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            StringBuilder sb = new StringBuilder();
            String username = jTendangnhap.getText().trim();
            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username cannot be blank!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String password = new String(jPassword.getPassword());
            if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Password cannot be blank!", "Error", JOptionPane.ERROR_MESSAGE);
                jPassword.requestFocus();
                return;
            }
            String confirm = new String(jPassword1.getPassword());
            if (!password.equals(confirm)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match! Please retry.", "Error", JOptionPane.ERROR_MESSAGE);
                jPassword.requestFocus();
                return;
            }
            System.out.println("Registration successful! Username: " + username + ", Password: " + password);
            JOptionPane.showMessageDialog(this, "Sign Up Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
            jTendangnhap.setText("");
            jPassword.setText("");
            jPassword1.setText("");
        }
    }//GEN-LAST:event_jPasswordKeyPressed

    private void jTendangnhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTendangnhapKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            StringBuilder sb = new StringBuilder();
            String username = jTendangnhap.getText().trim();
            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username cannot be blank!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String password = new String(jPassword.getPassword());
            if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Password cannot be blank!", "Error", JOptionPane.ERROR_MESSAGE);
                jPassword.requestFocus();
                return;
            }
            String confirm = new String(jPassword1.getPassword());
            if (!password.equals(confirm)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match! Please retry.", "Error", JOptionPane.ERROR_MESSAGE);
                jPassword.requestFocus();
                return;
            }
            System.out.println("Registration successful! Username: " + username + ", Password: " + password);
            JOptionPane.showMessageDialog(this, "Sign Up Success!", "Success", JOptionPane.INFORMATION_MESSAGE);
            jTendangnhap.setText("");
            jPassword.setText("");
            jPassword1.setText("");
        }
    }//GEN-LAST:event_jTendangnhapKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String s = i + "";
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormRegister().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDangKi;
    private javax.swing.JButton jButtonQuayLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JCheckBox jShowPass;
    private javax.swing.JTextField jTendangnhap;
    // End of variables declaration//GEN-END:variables
}
