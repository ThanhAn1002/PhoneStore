/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login_Register_2;

import javax.swing.JOptionPane;
import Menu_Admin_3.Menu_admin;
import Menu_Staff_4.Menu_Staff;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoàng Thanh An
 */
public class FormLogin extends javax.swing.JFrame {

    private String captcha;

    public FormLogin() {
        initComponents();
        generateCaptcha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTendangnhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jShowPass = new javax.swing.JCheckBox();
        jButtonDangnhap = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        button1 = new Menu_Admin_3.HeThong.Button();
        jLabel6 = new javax.swing.JLabel();
        jCaptcha = new javax.swing.JTextField();
        nhapcaptcha = new javax.swing.JTextField();
        button2 = new Menu_Admin_3.HeThong.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cửa hàng PHONE STORE ");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo login.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("User name :");

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password :");

        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ảnh đăng nhập, đăng kí.jpg"))); // NOI18N

        jShowPass.setBackground(new java.awt.Color(255, 255, 255));
        jShowPass.setForeground(new java.awt.Color(102, 102, 102));
        jShowPass.setText("Show password");
        jShowPass.setFocusable(false);
        jShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowPassActionPerformed(evt);
            }
        });

        jButtonDangnhap.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDangnhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonDangnhap.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDangnhap.setText("Login");
        jButtonDangnhap.setFocusable(false);
        jButtonDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDangnhapActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Create new account ?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        button1.setBackground(new java.awt.Color(0, 0, 0));
        button1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button1.setForeground(new java.awt.Color(242, 242, 242));
        button1.setText("X");
        button1.setFocusable(false);
        button1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Captcha :");

        jCaptcha.setEditable(false);
        jCaptcha.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jCaptcha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jCaptcha.setFocusable(false);
        jCaptcha.setPreferredSize(new java.awt.Dimension(70, 32));
        jCaptcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCaptchaActionPerformed(evt);
            }
        });
        jCaptcha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCaptchaKeyPressed(evt);
            }
        });

        nhapcaptcha.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        nhapcaptcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapcaptchaActionPerformed(evt);
            }
        });
        nhapcaptcha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nhapcaptchaKeyPressed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(0, 0, 0));
        button2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button2.setForeground(new java.awt.Color(242, 242, 242));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/undo.png"))); // NOI18N
        button2.setFocusable(false);
        button2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        button2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jShowPass))
                                    .addComponent(jPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonDangnhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTendangnhap, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(nhapcaptcha, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(136, 136, 136))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(jLabel4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCaptcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nhapcaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jShowPass)
                .addGap(15, 15, 15)
                .addComponent(jButtonDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(35, 35, 35))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private void generateCaptcha() {
        Random random = new Random();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        captcha = sb.toString();
        jCaptcha.setText(captcha);

    }
    private void jTendangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTendangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTendangnhapActionPerformed
    private void loginToAdmin(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("taikhoan.txt"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String savedUsername = parts[0];
                String savedPassword = parts[1];

                if (savedUsername.equals(username) && savedPassword.equals(hashPassword(password))) {
                    found = true;
                    break;
                }
            }

            if (found) {
                Menu_admin m = new Menu_admin();
                m.setVisible(true);
                m.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid account name or password!", "Login unsuccessful", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading account information!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            return password;
        }
    }
    private void jButtonDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDangnhapActionPerformed
        String email = jTendangnhap.getText();
        String password = new String(jPassword.getPassword());
        String enteredCaptcha = nhapcaptcha.getText();
        StringBuilder sb = new StringBuilder();
        if (email.equals("")) {
            sb.append("User name cannot be blank!");
        } else if (password.equals("")) {
            sb.append("Password can not be blank!");
        } else if (enteredCaptcha.equals("")) {
            sb.append("The captcha code cannot be blank!");
        } else if (!validateCaptchaFormat(enteredCaptcha, captcha)) {
            sb.append("Wrong captcha code. Type again!");
            generateCaptcha();
            nhapcaptcha.setText("");
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (email.equals("nhanvien") && password.equals("1")) {

            Menu_Staff m = new Menu_Staff();
            m.setVisible(true);
            m.setLocationRelativeTo(null);
            this.dispose();
        } else {
            loginToAdmin(email, password);
        }

    }//GEN-LAST:event_jButtonDangnhapActionPerformed
    private boolean validateCaptchaFormat(String enteredCaptcha, String captcha) {
        if (enteredCaptcha.length() != captcha.length()) {
            return false;
        }

        for (int i = 0; i < captcha.length(); i++) {
            char expectedChar = captcha.charAt(i);

            boolean isUpperCase = Character.isUpperCase(expectedChar);
            boolean isLowerCase = Character.isLowerCase(expectedChar);
            boolean isNumber = Character.isDigit(expectedChar);

            char actualChar = enteredCaptcha.charAt(i);
            if (!(isUpperCase && Character.isUpperCase(actualChar)
                    || isLowerCase && Character.isLowerCase(actualChar)
                    || isNumber && Character.isDigit(actualChar))) {
                return false;
            }
        }

        return true;
    }
    private void jShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowPassActionPerformed
        // TODO add your handling code here:
        if (jShowPass.isSelected()) {
            jPassword.setEchoChar((char) 0);
        } else {
            jPassword.setEchoChar('●');
        }
    }//GEN-LAST:event_jShowPassActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        FormRegister fdk = new FormRegister();
        fdk.setVisible(true);
        fdk.pack();
        fdk.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String email = jTendangnhap.getText();
            String password = new String(jPassword.getPassword());
            String enteredCaptcha = nhapcaptcha.getText();
            StringBuilder sb = new StringBuilder();
            if (email.equals("")) {
                sb.append("User name cannot be blank!");
            } else if (password.equals("")) {
                sb.append("Password can not be blank!");
            } else if (enteredCaptcha.equals("")) {
                sb.append("The captcha code cannot be blank!");
            } else if (!validateCaptchaFormat(enteredCaptcha, captcha)) {
                sb.append("Wrong captcha code. Type again!");
                generateCaptcha();
                nhapcaptcha.setText("");
            }

            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (email.equals("nhanvien") && password.equals("1")) {

                Menu_Staff m = new Menu_Staff();
                m.setVisible(true);
                m.setLocationRelativeTo(null);
                this.dispose();
            } else {
                loginToAdmin(email, password);
            }
        }
    }//GEN-LAST:event_jPasswordKeyPressed

    private void jTendangnhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTendangnhapKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String email = jTendangnhap.getText();
            String password = new String(jPassword.getPassword());
            String enteredCaptcha = nhapcaptcha.getText();
            StringBuilder sb = new StringBuilder();
            if (email.equals("")) {
                sb.append("User name cannot be blank!");
            } else if (password.equals("")) {
                sb.append("Password can not be blank!");
            } else if (enteredCaptcha.equals("")) {
                sb.append("The captcha code cannot be blank!");
            } else if (!validateCaptchaFormat(enteredCaptcha, captcha)) {
                sb.append("Wrong captcha code. Type again!");
                generateCaptcha();
                nhapcaptcha.setText("");
            }

            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (email.equals("nhanvien") && password.equals("1")) {

                Menu_Staff m = new Menu_Staff();
                m.setVisible(true);
                m.setLocationRelativeTo(null);
                this.dispose();
            } else {
                loginToAdmin(email, password);
            }
        }

    }//GEN-LAST:event_jTendangnhapKeyPressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_button1ActionPerformed

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

    private void jCaptchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCaptchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCaptchaActionPerformed

    private void jCaptchaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCaptchaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCaptchaKeyPressed

    private void nhapcaptchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapcaptchaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhapcaptchaActionPerformed

    private void nhapcaptchaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nhapcaptchaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String email = jTendangnhap.getText();
            String password = new String(jPassword.getPassword());
            String enteredCaptcha = nhapcaptcha.getText();
            StringBuilder sb = new StringBuilder();
            if (email.equals("")) {
                sb.append("User name cannot be blank!");
            } else if (password.equals("")) {
                sb.append("Password can not be blank!");
            } else if (enteredCaptcha.equals("")) {
                sb.append("The captcha code cannot be blank!");
            } else if (!validateCaptchaFormat(enteredCaptcha, captcha)) {
                sb.append("Wrong captcha code. Type again!");
                generateCaptcha();
                nhapcaptcha.setText("");
            }

            if (sb.length() > 0) {
                JOptionPane.showMessageDialog(this, sb.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (email.equals("nhanvien") && password.equals("1")) {

                Menu_Staff m = new Menu_Staff();
                m.setVisible(true);
                m.setLocationRelativeTo(null);
                this.dispose();
            } else {
                loginToAdmin(email, password);
            }
        }
    }//GEN-LAST:event_nhapcaptchaKeyPressed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        generateCaptcha();
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Menu_Admin_3.HeThong.Button button1;
    private Menu_Admin_3.HeThong.Button button2;
    private javax.swing.JButton jButtonDangnhap;
    private javax.swing.JTextField jCaptcha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JCheckBox jShowPass;
    private javax.swing.JTextField jTendangnhap;
    private javax.swing.JTextField nhapcaptcha;
    // End of variables declaration//GEN-END:variables
}
