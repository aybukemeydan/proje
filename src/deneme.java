
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


     
public class deneme extends javax.swing.JFrame {
 
    
                String koltuuuk="";
		int Asayısı = 0;
	        int Bsayısı=0;
                int Csayısı=0;
		int APrice = 0;
                int BPrice=0;
                int CPrice=0;
	         int i=0;
                 int k=0;
                 int l=0;
                 int m=0;
                 int n=0;
                 int o=0;
                 int p=0;
                 int r=0;
                 int s=0;
                 int t=0;
                 
		int toplam = 0; 
 
    public deneme() {
        initComponents();
        koltuk_kontrol();
        
      //  koltuk_kontrol();
    }
   /* public void hesaplama()
    {
    koltuk_kontrol();
    if( btn_1.getText().equals("DOLU"))
    {
    Asayısı++;
    }
    if(btn_2.getText().equals("DOLU"))
    {
        Asayısı++;
    }
    */
    
    
public void koltuk_kontrol()
{
    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();

 Connection con =MyConnection.getConnection();
       try{
           Statement st1,st2,st3,st4,st5,st6,st7,st8,st9= null;
         
           ResultSet rs1,rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9=null;
            st1 = con.createStatement();
            st2 = con.createStatement();
            st3 = con.createStatement();
            st4 = con.createStatement();
            st5 = con.createStatement();
            st6 = con.createStatement();
            st7 = con.createStatement();
            st8 = con.createStatement();
            st9 = con.createStatement();
rs1=st1.executeQuery("select * from bilet where koltuk='A1' and salon='"+sallon+"' and seans='"+seanss+"' ");

            rs1.last();
            
            
            
            int kayitsayisi = rs1.getRow();
               
            if(kayitsayisi > 0 ){                       
                btn_1.setText("DOLU");
                btn_1.setEnabled(false);
            }
            else {
                btn_1.setText("A1");
                btn_1.setBackground(Color.GREEN);
            }
           
            rs2 = st2.executeQuery("select * from bilet where koltuk='A2' and salon='"+sallon+"' and seans='"+seanss+"'");
            rs2.last();
            int kayitsayisi2 = rs2.getRow();            
            if(kayitsayisi2 > 0){                
               btn_2.setText("DOLU");
               btn_2.setEnabled(false);
            }
            else {
                btn_2.setText("A2");
                btn_2.setBackground(Color.GREEN);
            }
                
            
            rs3 = st3.executeQuery("select * from bilet where koltuk='A3' and salon='"+sallon+"' and seans='"+seanss+"'");
            rs3.last();
            int kayitsayisi3 = rs3.getRow();            
            if(kayitsayisi3 > 0){                
                btn_3.setText("DOLU");
                btn_3.setEnabled(false);             
            }
            else {
                btn_3.setText("A3");
                btn_3.setBackground(Color.GREEN);
            }
    rs4 = st4.executeQuery("select * from bilet where koltuk='B1' and salon='"+sallon+"' and seans='"+seanss+"'");
            rs4.last();
            int kayitsayisi4 = rs4.getRow();            
            if(kayitsayisi4 > 0){                
                btn_4.setText("DOLU");
                btn_4.setEnabled(false);             
            }
            else {
                btn_4.setText("B1");
                btn_4.setBackground(Color.GREEN);
            }
             rs5 = st5.executeQuery("select * from bilet where koltuk='B2' and salon='"+sallon+"' and seans='"+seanss+"'");
            rs5.last();
            int kayitsayisi5 = rs5.getRow();            
            if(kayitsayisi5 > 0){                
                btn_5.setText("DOLU");
                btn_5.setEnabled(false);             
            }
            else {
                btn_5.setText("B2");
                btn_5.setBackground(Color.GREEN);
            }
            
             rs6 = st6.executeQuery("select * from bilet where koltuk='B3' and salon='"+sallon+"' and seans='"+seanss+"'");
            rs6.last();
            int kayitsayisi6 = rs6.getRow();            
            if(kayitsayisi6 > 0){                
                btn_6.setText("DOLU");
                btn_6.setEnabled(false);             
            }
            else {
                btn_6.setText("B3");
                btn_6.setBackground(Color.GREEN);
            }
             rs7 = st7.executeQuery("select * from bilet where koltuk='C1' and salon='"+sallon+"' and seans='"+seanss+"'");
            rs7.last();
            int kayitsayisi7 = rs7.getRow();            
            if(kayitsayisi7 > 0){                
                btn_7.setText("DOLU");
                btn_7.setEnabled(false);             
            }
            else {
                btn_7.setText("C1");
                btn_7.setBackground(Color.GREEN);
            }
             rs8 = st8.executeQuery("select * from bilet where koltuk='C2' and salon='"+sallon+"' and seans='"+seanss+"'");
            rs8.last();
            int kayitsayisi8 = rs8.getRow();            
            if(kayitsayisi8 > 0){                
                btn_8.setText("DOLU");
                btn_8.setEnabled(false);             
            }
            else {
                btn_8.setText("C2");
                btn_8.setBackground(Color.GREEN);
            }
             rs9 = st9.executeQuery("select * from bilet where koltuk='C3' and salon='"+sallon+"' and seans='"+seanss+"'");
            rs9.last();
            int kayitsayisi9 = rs9.getRow();            
            if(kayitsayisi9 > 0){                
                btn_9.setText("DOLU");
                btn_9.setEnabled(false);             
            }
            else {
                btn_9.setText("C3");
                btn_9.setBackground(Color.GREEN);
            }
            
       }catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
    }         

}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gonder = new javax.swing.JButton();
        salonadı = new javax.swing.JLabel();
        seansadı = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        salonadı1 = new javax.swing.JLabel();
        seansadı1 = new javax.swing.JLabel();
        gecicisalon1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        koltuk = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gecicifilm1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gonder.setBackground(new java.awt.Color(153, 255, 204));
        gonder.setText("Gönder");
        gonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setText("Temizle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Salon");

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        btn_4.setBackground(new java.awt.Color(255, 255, 102));
        btn_4.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btn_4.setText("B1");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_1.setBackground(new java.awt.Color(255, 255, 102));
        btn_1.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btn_1.setText("A1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_5.setBackground(new java.awt.Color(255, 255, 102));
        btn_5.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btn_5.setText("B2");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_2.setBackground(new java.awt.Color(255, 255, 102));
        btn_2.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btn_2.setText("A2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_6.setBackground(new java.awt.Color(255, 255, 102));
        btn_6.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btn_6.setText("B3");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_3.setBackground(new java.awt.Color(255, 255, 102));
        btn_3.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btn_3.setText("A3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_7.setBackground(new java.awt.Color(255, 255, 102));
        btn_7.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btn_7.setText("C1");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setBackground(new java.awt.Color(255, 255, 102));
        btn_8.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btn_8.setText("C2");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setBackground(new java.awt.Color(255, 255, 102));
        btn_9.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        btn_9.setText("C3");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        koltuk.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(koltuk, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(koltuk, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jButton2.setText("Geri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\PACKERDBELL\\Desktop\\koltuk.jpg")); // NOI18N
        jLabel7.setText("jLabel2");

        jLabel6.setText("    KOLTUK SEÇME EKRANI");

        jLabel2.setText("Film Adı:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salonadı, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salonadı1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seansadı1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gonder, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(seansadı, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gecicisalon1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gecicifilm1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(seansadı1)
                                .addGap(15, 15, 15)
                                .addComponent(salonadı, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addComponent(salonadı1)
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gecicisalon1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gecicifilm1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gonder, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(seansadı, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed

    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
        
        try{
          Connection con =MyConnection.getConnection();
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery("select * from bilet where koltuk='A1' and salon='"+sallon+"' and seans='"+seanss+"'");

            int kayitsayisi = rs.getRow();

            if(kayitsayisi > 0){
                JOptionPane.showMessageDialog(null, "Seçtiğiniz Koltuk Doludur!");
                
            }
            else {
                m++;
                if(m==1){
         koltuuuk+="A1 ";
                koltuk.setText(koltuuuk);
                btn_1.setBackground(Color.red);
               // btn_3.setEnabled(false);
                i++;
                Asayısı++;
               }
            }

        } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
        try{
          Connection con =MyConnection.getConnection();
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery("select * from bilet where koltuk='A2' and salon='"+sallon+"' and seans='"+seanss+"'");

            int kayitsayisi = rs.getRow();

            if(kayitsayisi > 0){
                JOptionPane.showMessageDialog(null, "Seçtiğiniz Koltuk Doludur!");
            }
            else {
                l++;
                if(l==1){
                koltuuuk+="A2 ";
                koltuk.setText(koltuuuk);
                btn_2.setBackground(Color.red);
               // btn_3.setEnabled(false);
                i++;
                   Asayısı++;
                }
                
            }

        } catch (Exception ex) {
       
        }
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
        try{
          Connection con =MyConnection.getConnection();
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery("select * from bilet where koltuk='A3' and salon='"+sallon+"' and seans='"+seanss+"'");

            int kayitsayisi = rs.getRow();

            if(kayitsayisi > 0){
                JOptionPane.showMessageDialog(null, "Seçtiğiniz Koltuk Doludur!");
            }
            else {
                k++;
                if(k==1){
                koltuuuk+="A3 ";
                koltuk.setText(koltuuuk);
                btn_3.setBackground(Color.red);
               // btn_3.setEnabled(false);
                i++;
                   Asayısı++;}
                
                
                
              
                
            }

        } catch (Exception ex) {
      if(k>1){
               JOptionPane.showMessageDialog(null, "Birden fazla koltuğa basmayın..");
                }
        }
    }//GEN-LAST:event_btn_3ActionPerformed

    
    
    private void gonderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderActionPerformed
    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
       String koltukk=koltuk.getText();
        String[] koll = koltukk.split(" ");
         koltuk_kontrol();
        try{            
           if(koltuk.getText().equals("")){
                     JOptionPane.showMessageDialog(null, "Koltuk boş geçilmez!!!");
                
            }
            else {
                for(int j=0; j<i; j++){
                Connection con =MyConnection.getConnection(); 
                Statement st = con.createStatement();
                String sql = "INSERT INTO bilet (salon,seans,koltuk)"
                + " VALUES ('"+sallon+"','"+seanss+"','"+koll[j]+"')";
                
                st.executeUpdate(sql); }
                 //Ekle butonundan aldım
                        int price1 = 15;
			int price2 = 20;
			int price3 = 25;
			CPrice = Csayısı*price3;
			BPrice =  Bsayısı *price2;
			APrice = Asayısı*price1;
                                    
                     toplam=(CPrice+BPrice)+APrice;       
                     String ücret = Integer.toString(toplam);
                     price.setText(ücret);
                //Ekle butonu bitti.
                JOptionPane.showMessageDialog(null, " İşleminiz Gerçekleşmiştir.İşte Fişiniz.İyi Seyirler.");
         Fatura f=new Fatura();
        f.setVisible(true);
        f.pack();
        f.setLocationRelativeTo(null);
        this.dispose();
                
        Fatura.filmAdii.setText(FilmSecme.jComboBox1.getSelectedItem().toString());
        Fatura.salonn.setText(FilmSecme.jComboBox3.getSelectedItem().toString());
        Fatura.saatt.setText(FilmSecme.jComboBox2.getSelectedItem().toString());
       Fatura.koltuklar.setText(koltuk.getText().toString()); 
       Fatura.ücreet.setText(price.getText().toString());
                
            }

        } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }//GEN-LAST:event_gonderActionPerformed

 
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 // koltuk_kontrol();  
 try{
    koltuk_kontrol();  
  koltuuuk="";

  koltuk.setText(koltuuuk); 
  i=0;
 if(btn_1.getBackground()==Color.red )
 { btn_1.setBackground(Color.green);
}
 if(btn_2.getBackground()==Color.red)
 { btn_2.setBackground(Color.green);
}
 if(btn_3.getBackground()==Color.red)
 { btn_3.setBackground(Color.green);
}
  if(btn_4.getBackground()==Color.red )
 { btn_4.setBackground(Color.green);
}
 if(btn_5.getBackground()==Color.red)
 { btn_5.setBackground(Color.green);
}
 if(btn_6.getBackground()==Color.red)
 { btn_6.setBackground(Color.green);
}
  if(btn_7.getBackground()==Color.red )
 { btn_7.setBackground(Color.green);
}
 if(btn_8.getBackground()==Color.red)
 { btn_8.setBackground(Color.green);
}
 if(btn_9.getBackground()==Color.red)
 { btn_9.setBackground(Color.green);
}
  Asayısı=0;
  Bsayısı=0;
  Csayısı=0;
   k=0;
   l=0;
   m=0;
   n=0;
   o=0;
   p=0;
   r=0;
   s=0;
   t=0;   
 }
   
 catch (Exception ex)
         {   JOptionPane.showMessageDialog(null, "HATA"); }
        
//                        int price1 = 15;
//			int price2 = 20;
//			int price3 = 25;
//			//CPrice = Csayısı*price1;
//	
//			APrice = Asayısı*price2;
//                       // BPrice =  Bsayısı *price2;            
//                       toplam=APrice;       
//                       String ücret = Integer.toString(toplam);
//                
//       price.setText(ücret);
        
        
        
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
        
        try{
          Connection con =MyConnection.getConnection();
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery("select * from bilet where koltuk='B1' and salon='"+sallon+"' and seans='"+seanss+"'");

            int kayitsayisi = rs.getRow();

            if(kayitsayisi > 0){
                JOptionPane.showMessageDialog(null, "Seçtiğiniz Koltuk Doludur!");
                
            }
            else {
                n++;
                if(n==1){
                koltuuuk+="B1 ";
                koltuk.setText(koltuuuk);
                btn_4.setBackground(Color.red);
               // btn_3.setEnabled(false);
                i++;   
                Bsayısı++;
               }
            }

        } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
     String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
        
        try{
          Connection con =MyConnection.getConnection();
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery("select * from bilet where koltuk='B2' and salon='"+sallon+"' and seans='"+seanss+"'");

            int kayitsayisi = rs.getRow();

            if(kayitsayisi > 0){
                JOptionPane.showMessageDialog(null, "Seçtiğiniz Koltuk Doludur!");
                
            }
            else {
                o++;
                if(o==1){
         koltuuuk+="B2 ";
                koltuk.setText(koltuuuk);
                btn_5.setBackground(Color.red);
               // btn_3.setEnabled(false);
                i++;   
                Bsayısı++;
                }
            }

        } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
        
        try{
          Connection con =MyConnection.getConnection();
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery("select * from bilet where koltuk='B3' and salon='"+sallon+"' and seans='"+seanss+"'");

            int kayitsayisi = rs.getRow();

            if(kayitsayisi > 0){
                JOptionPane.showMessageDialog(null, "Seçtiğiniz Koltuk Doludur!");
                
            }
            else {
                p++;
                if(p==1){
         koltuuuk+="B3 ";
                koltuk.setText(koltuuuk);
                btn_6.setBackground(Color.red);
               // btn_3.setEnabled(false);
                i++;
                    Bsayısı++;
               }
            }

        } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
        
        try{
          Connection con =MyConnection.getConnection();
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery("select * from bilet where koltuk='C1' and salon='"+sallon+"' and seans='"+seanss+"'");

            int kayitsayisi = rs.getRow();

            if(kayitsayisi > 0){
                JOptionPane.showMessageDialog(null, "Seçtiğiniz Koltuk Doludur!");
                
            }
            else {
                r++;
                if(r==1){
         koltuuuk+="C1 ";
                koltuk.setText(koltuuuk);
                btn_7.setBackground(Color.red);
               // btn_3.setEnabled(false);
                i++;   
                    Csayısı++;
               }
            }

        } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
        
        try{
          Connection con =MyConnection.getConnection();
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery("select * from bilet where koltuk='C2' and salon='"+sallon+"' and seans='"+seanss+"'");

            int kayitsayisi = rs.getRow();

            if(kayitsayisi > 0){
                JOptionPane.showMessageDialog(null, "Seçtiğiniz Koltuk Doludur!");
                
            }
            else {
                s++;
                if(s==1){
         koltuuuk+="C2 ";
                koltuk.setText(koltuuuk);
                btn_8.setBackground(Color.red);
               // btn_3.setEnabled(false);
                i++;   
                   Csayısı++;
               }
            }

        } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
    String seanss=(String)FilmSecme.jComboBox2.getSelectedItem();
    String sallon=(String)FilmSecme.jComboBox3.getSelectedItem();
        
        try{
          Connection con =MyConnection.getConnection();
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery("select * from bilet where koltuk='C3' and salon='"+sallon+"' and seans='"+seanss+"'");

            int kayitsayisi = rs.getRow();

            if(kayitsayisi > 0){
                JOptionPane.showMessageDialog(null, "Seçtiğiniz Koltuk Doludur!");
                
            }
            else {
                t++;
                if(t==1){
         koltuuuk+="C3 ";
                koltuk.setText(koltuuuk);
                btn_9.setBackground(Color.red);
               // btn_3.setEnabled(false);
                i++;   
                   Csayısı++;
               }
            }

        } catch (SQLException ex) {
        Logger.getLogger(Film.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btn_9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       FilmSecme rs=new FilmSecme();
       
                rs.setVisible(true);
                rs.pack();
                rs.setLocationRelativeTo(null);         
                this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deneme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deneme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    public static javax.swing.JLabel gecicifilm1;
    public static javax.swing.JLabel gecicisalon1;
    private javax.swing.JButton gonder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel koltuk;
    private javax.swing.JLabel price;
    private javax.swing.JLabel salonadı;
    private javax.swing.JLabel salonadı1;
    private javax.swing.JLabel seansadı;
    private javax.swing.JLabel seansadı1;
    // End of variables declaration//GEN-END:variables
}
