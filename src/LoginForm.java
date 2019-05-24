
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Toolkit;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class LoginForm extends javax.swing.JFrame {


    public LoginForm() {
        
        initComponents();
        lbl_U.setVisible(false);
        lbl_P.setVisible(false);
       /* LoginForm lf=new LoginForm();
       
         lf.setLocationRelativeTo(null);
         lf.setVisible(true); */  
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        TextField_username = new javax.swing.JTextField();
        TextField_password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_U = new javax.swing.JLabel();
        lbl_P = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(558, 240));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Login Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 48));

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText(" Username:");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 65, 23));

        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password:");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 65, 23));

        TextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 116, 23));
        jPanel1.add(TextField_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 116, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setText("Film Seçme");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.setText("Log In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 93, 30));

        lbl_U.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_U.setText("*");
        jPanel1.add(lbl_U, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 10, -1));

        lbl_P.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_P.setText("*");
        jPanel1.add(lbl_P, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("Sinema Otomasyonu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 200, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 380, 360);

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PACKERDBELL\\Desktop\\sinema.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 0, 340, 360);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 20, 320, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_usernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lbl_U.setVisible(false);
        lbl_P.setVisible(false);
        if(TextField_username.getText().equals(""))
        {   lbl_U.setVisible(true); }
        if(String.valueOf(TextField_password.getPassword()).equals(""))
        
        {lbl_P.setVisible(true);        }        
        else{
        Connection con =MyConnection.getConnection();
        
        PreparedStatement ps;
            try {
                ps=con.prepareStatement("Select * from users where username=? and password= ?");
                ps.setString(1,TextField_username.getText());
                ps.setString(2, String.valueOf(TextField_password.getPassword()));
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                FilmEkleme mf=new FilmEkleme();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                FilmEkleme.username.setText(TextField_username.getText()+" olarak oturum açtınız.");
                this.dispose(); }
                else{
                    
         JOptionPane.showMessageDialog(null, "Kullanıcı adı veya şifresi yanlış.","HATA!",1);
                }                
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        
        
        
        
        FilmSecme rs=new FilmSecme();
       
                rs.setVisible(true);
                rs.pack();
                rs.setLocationRelativeTo(null);         
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TextField_password;
    private javax.swing.JTextField TextField_username;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_P;
    private javax.swing.JLabel lbl_U;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
