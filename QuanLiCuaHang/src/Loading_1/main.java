/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Loading_1;

import Login_Register_2.FormLogin;
import Loading_1.Loading;

/**
 *
 * @author Hoàng Thanh An
 */
public class main {

    public static void main(String[] args) {
        Loading ld = new Loading();
        ld.setVisible(true);
        FormLogin frm = new FormLogin();
        frm.setLocationRelativeTo(null);
        try {
            for(int i=0; i<=100; i++){
                Thread.sleep(10);
                ld.ProgressBar.setValue(i);
                ld.pro.setText(Integer.toString(i)+"%");
                if (i==100) {
                    ld.setVisible(false);
                    frm.setVisible(true);
                }
            }
        } catch (InterruptedException e) {
        }
    }
    
}
