/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author PACKERDBELL
 */
public class FilmEkleme extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public FilmEkleme() {
        initComponents();
        
        label_sayı.setText( "Vizyondaki Film Sayısı: "+Integer.toString(CountData("filmekle")));
         //Salon  
                        comboBox.addItem("1");
		  	comboBox.addItem("2");
		  	comboBox.addItem("3");
		  	comboBox.addItem("4");
		  	comboBox.addItem("5");

       //seans
                        ComboBox_1.addItem("09:30");
			ComboBox_1.addItem("11:30");
			ComboBox_1.addItem("13:30");
			ComboBox_1.addItem("15:30");
			ComboBox_1.addItem("17:30");
			ComboBox_1.addItem("19:30");
			ComboBox_1.addItem("21:30");
			ComboBox_1.addItem("23:30");         
       //geçici kod alanı 
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        label_sayı = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextFieldfilmadi = new javax.swing.JTextField();
        Cıkıs = new javax.swing.JButton();
        Ekle = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        ComboBox_1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        username.setBackground(new java.awt.Color(255, 51, 153));
        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.setText(" ");
        getContentPane().add(username);
        username.setBounds(540, 300, 349, 54);

        label_sayı.setBackground(new java.awt.Color(0, 153, 153));
        label_sayı.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_sayı.setText("Film Sayısı: ");
        getContentPane().add(label_sayı);
        label_sayı.setBounds(18, 255, 207, 52);

        jLabel1.setText("Film Adı :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 90, 90, 30);

        jLabel2.setText("Seans:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 120, 80, 30);

        jLabel3.setText("Salon:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 160, 60, 30);

        TextFieldfilmadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldfilmadiActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldfilmadi);
        TextFieldfilmadi.setBounds(190, 90, 130, 30);

        Cıkıs.setText("Çıkış");
        Cıkıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CıkısActionPerformed(evt);
            }
        });
        getContentPane().add(Cıkıs);
        Cıkıs.setBounds(90, 200, 100, 30);

        Ekle.setText("Ekle");
        Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleActionPerformed(evt);
            }
        });
        getContentPane().add(Ekle);
        Ekle.setBounds(270, 200, 100, 30);

        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(comboBox);
        comboBox.setBounds(190, 160, 100, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(190, 120, 130, 30);

        getContentPane().add(ComboBox_1);
        ComboBox_1.setBounds(330, 120, 90, 30);

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 11, 108, 32);

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("FİLM EKLEME EKRANI");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 10, 245, 54);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(540, 20, 350, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldfilmadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldfilmadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldfilmadiActionPerformed
public void insertUpdateDeleteFilm(char operation,Integer id,String filmAdi,String Salon,String seans,String saat)        
  {
   int i=0;        
   if(i==0){
    try {
        Connection con =MyConnection.getConnection();
        String query = "select * from filmekle where salon = '"+Salon+"' and saat = '"+saat+"' and seans = '"+seans+"'"; 
        Statement stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery(query);
       if(!rs.next()) {           
PreparedStatement ps;
//i insert için
if(operation=='i')
{
    try {
        ps=con.prepareStatement("insert into filmekle(FilmAdi,salon,seans,saat) VALUES(?,?,?,?) ");     
       
        ps.setString(1,filmAdi);
        ps.setString(3,seans);
        ps.setString(2,Salon);
        ps.setString(4,saat);
        

        if(ps.executeUpdate()>0)
        {
         JOptionPane.showMessageDialog(null, "Yeni film eklendi...", "Başarılı", 1);
        }
        
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
    }
    


}

       }
       else 
           JOptionPane.showMessageDialog(null,"YER YOK");
  
                                          
         
    } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
       
       
    }
    
   
   }  
    
   
    
    
    
  }
    
  
 



//Film Eklemede boşluk bırakırsak diye metotla düzelttirecez.
    public boolean dogrulama()
    {
       SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
       Date simdikiZaman = new Date();
       
       
    try {    
        String date1 = dateFormat.format(simdikiZaman);
       String date2 = dateFormat.format(jDateChooser1.getDate());
    if((TextFieldfilmadi.getText().equals("") || ComboBox_1.getSelectedItem().equals("") ||
             jDateChooser1.getDate().equals("") ) )
    {
        JOptionPane.showMessageDialog(null, "Bir ya da birden fazla boşluk var.","HATA!",1);      return false;}
    
   else if(!(jDateChooser1.getDate().compareTo(new Date())>0 || date1.equals(date2)) )
    { JOptionPane.showMessageDialog(null, "Geçmiş tarihler için film ekleyemezsin.","HATA!",1); return false;} 
    
    else{
    return true;
    } }
    catch(Exception e) {
        JOptionPane.showMessageDialog(null,"Lütfen tarih girin.","HATA!",1);
    }
    return false;
    }
    
        //new Date()
  
        
    
public static int CountData(String tableName){
int total=0;
Connection con=MyConnection.getConnection();
Statement st;
    try {
        st = con.createStatement();
        ResultSet rs=st.executeQuery("select COUNT(*) AS total from "+tableName+" where seans=curdate()");
        
        while(rs.next())
        {
        
        total=rs.getInt(1);
        
        }
    } catch (SQLException ex) {
          Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
    }
return total;
}    
    
    
    
    
    
    
    
    
    private void EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleActionPerformed
      String filmAdi=TextFieldfilmadi.getText();  
       String saat=(String) ComboBox_1.getSelectedItem();
  
	String salon=(String)comboBox.getSelectedItem();   


        if(dogrulama())
        {
         SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
         String seans=dateFormat.format(jDateChooser1.getDate());
         insertUpdateDeleteFilm('i',null, filmAdi, salon, seans,saat);
         label_sayı.setText( "Vizyondaki Film Sayısı: "+Integer.toString(CountData("filmekle")));

        }
        
        
        
        
    }//GEN-LAST:event_EkleActionPerformed

    private void CıkısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CıkısActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_CıkısActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        LoginForm rs=new LoginForm();
       
                rs.setVisible(true);
                rs.pack();
                rs.setLocationRelativeTo(null);         
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FilmEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilmEkleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox ComboBox_1;
    private javax.swing.JButton Cıkıs;
    private javax.swing.JButton Ekle;
    public static javax.swing.JTextField TextFieldfilmadi;
    public static javax.swing.JComboBox comboBox;
    private javax.swing.JButton jButton1;
    public static com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JLabel label_sayı;
    public static javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
