package paket;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;



public class Anasayfa extends javax.swing.JFrame {

    String cinsiyet;

    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    int q,i,id,deleteItem;
    
    
    public Anasayfa() {
        initComponents();
      
    }
public void upDateDb(){
    
 try{
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrencibilgi?zeroDateTimeBehavior=convertToNull","root","");
     pst=con.prepareStatement("Select *from ogrenci3");
     
     rs=pst.executeQuery();
     ResultSetMetaData stData=rs.getMetaData();
     
     q= stData.getColumnCount();
     
     
     DefaultTableModel RecordTable=(DefaultTableModel)tablo.getModel();
     
     RecordTable.setRowCount(0);
     
     while(rs.next()){
        
         Vector columnData=new Vector();
         
         for(i=1;i<=q;i++){
             
           columnData.add(rs.getInt("Sıra"));   
           columnData.add(rs.getString("Ad"));
           columnData.add(rs.getString("Soyad"));
           columnData.add(rs.getString("Cinsiyet"));
           columnData.add(rs.getString("Fakulte"));
           columnData.add(rs.getString("Bolum"));
           columnData.add(rs.getInt("Numara"));
           columnData.add(rs.getInt("Sınıf"));  
             
         }
         
          RecordTable.addRow(columnData);
         
     }
     
     
     
     
 }   
  catch(Exception e){
      
  }  
    
}
      


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        Arama = new javax.swing.JTextField();
        Ekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        Sil = new javax.swing.JButton();
        yazdır = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        soyad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numara = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sınıf = new javax.swing.JTextField();
        erkek = new javax.swing.JRadioButton();
        kız = new javax.swing.JRadioButton();
        fakulte = new javax.swing.JComboBox<>();
        bbolum = new javax.swing.JComboBox<>();
        Listele = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tablo.setForeground(new java.awt.Color(0, 0, 0));
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra ", "Adı", "Soyadı ", "Cinsiyet ", "Fakülte", "Bölüm ", "Numara", "Sınıf"
            }
        ));
        tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 0, 818, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\profile-search-icon (1).png")); // NOI18N
        jLabel6.setText("Ögrenci Ara");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 162, 40));

        Arama.setBackground(new java.awt.Color(255, 255, 204));
        Arama.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Arama.setForeground(new java.awt.Color(0, 0, 0));
        Arama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AramaKeyReleased(evt);
            }
        });
        getContentPane().add(Arama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 617, 150, 30));

        Ekle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Ekle.setForeground(new java.awt.Color(0, 0, 0));
        Ekle.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\profile-add-icon.png")); // NOI18N
        Ekle.setText("Ögrenci_Ekle");
        Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkleActionPerformed(evt);
            }
        });
        getContentPane().add(Ekle, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 464, -1, -1));

        guncelle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        guncelle.setForeground(new java.awt.Color(0, 0, 0));
        guncelle.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\profile-settings-icon (1).png")); // NOI18N
        guncelle.setText("Öğrenci_Guncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });
        getContentPane().add(guncelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 464, -1, -1));

        Sil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Sil.setForeground(new java.awt.Color(0, 0, 0));
        Sil.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\profile-delete-icon (1).png")); // NOI18N
        Sil.setText("Öğrenci_Sil");
        Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SilActionPerformed(evt);
            }
        });
        getContentPane().add(Sil, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 464, -1, -1));

        yazdır.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        yazdır.setForeground(new java.awt.Color(0, 0, 0));
        yazdır.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\printer-icon.png")); // NOI18N
        yazdır.setText("Yazdır");
        yazdır.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazdırActionPerformed(evt);
            }
        });
        getContentPane().add(yazdır, new org.netbeans.lib.awtextra.AbsoluteConstraints(884, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\name-card-icon (1).png")); // NOI18N
        jLabel2.setText("Ad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 23, 92, -1));

        ad.setBackground(new java.awt.Color(255, 255, 204));
        ad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ad.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 26, 140, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\name-card-icon (1).png")); // NOI18N
        jLabel3.setText("Soyadı");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 83, 92, -1));

        soyad.setBackground(new java.awt.Color(255, 255, 204));
        soyad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        soyad.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(soyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 86, 140, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\users-mixed-gender-icon.png")); // NOI18N
        jLabel5.setText("Cinsiyet");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 151, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\university-icon.png")); // NOI18N
        jLabel7.setText("Fakülte");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 213, 92, 26));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\Firefox-old-school-final-icon.png")); // NOI18N
        jLabel8.setText("Bölüm");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 273, 92, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\Numbers-icon.png")); // NOI18N
        jLabel9.setText("Numara");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 338, 92, -1));

        numara.setBackground(new java.awt.Color(255, 255, 204));
        numara.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numara.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(numara, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 341, 110, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\Notebook-Photo-Class-icon (1).png")); // NOI18N
        jLabel10.setText("Sınıf");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 399, 92, -1));

        sınıf.setBackground(new java.awt.Color(255, 255, 204));
        sınıf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sınıf.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(sınıf, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 402, 50, -1));

        erkek.setBackground(new java.awt.Color(255, 255, 204));
        erkek.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        erkek.setForeground(new java.awt.Color(0, 0, 0));
        erkek.setText("Erkek");
        erkek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erkekActionPerformed(evt);
            }
        });
        getContentPane().add(erkek, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 153, 75, -1));

        kız.setBackground(new java.awt.Color(255, 255, 204));
        kız.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        kız.setForeground(new java.awt.Color(0, 0, 0));
        kız.setText("Kız");
        kız.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kızActionPerformed(evt);
            }
        });
        getContentPane().add(kız, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 153, 75, -1));

        fakulte.setBackground(new java.awt.Color(255, 255, 204));
        fakulte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fakulte.setForeground(new java.awt.Color(0, 0, 0));
        fakulte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muhendislik", "Teknoloji", "Eğitim", "İletisim " }));
        getContentPane().add(fakulte, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 212, 132, -1));

        bbolum.setBackground(new java.awt.Color(255, 255, 204));
        bbolum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bbolum.setForeground(new java.awt.Color(0, 0, 0));
        bbolum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilgisayar muh", "Elektrik muh", "Makine muh", "Bilgisayar tek", "Elektrik tek", "Makine tek", "Bilgisayar eg", "Elektrik eg", "Makine eg", "Bilgisayar ilt", "Elektrik ilt", "Makine ilt" }));
        getContentPane().add(bbolum, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 275, -1, -1));

        Listele.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Listele.setForeground(new java.awt.Color(0, 0, 0));
        Listele.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\Apps-preferences-contact-list-icon.png")); // NOI18N
        Listele.setText("Listele");
        Listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeleActionPerformed(evt);
            }
        });
        getContentPane().add(Listele, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ozkan\\Documents\\NetBeansProjects\\java_proje\\resimler\\castle-336498_1920.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 780));
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
                 
  
    private void EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkleActionPerformed
                             
        
            
      try{
            
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrencibilgi?zeroDateTimeBehavior=convertToNull","root","");
            String query = "insert into ogrenci3(Ad,Soyad,Cinsiyet,Fakulte,Bolum,Numara,Sınıf)values(?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            
           String n_numara=numara.getText().toString();
           String ssınıf=sınıf.getText().toString();
           pst.setString(7,ssınıf);
           
           pst.setString(6,n_numara);
           
            pst.setString(1, ad.getText());
            if(erkek.isSelected()){
                cinsiyet="Erkek";
            }
            if(kız.isSelected()){
                cinsiyet="Kız";
            }
            pst.setString(3, cinsiyet);
            
              
            String fakultee=fakulte.getSelectedItem().toString();
            
            pst.setString(4,fakultee);
            pst.setString(2,soyad.getText());
            String bolume=bbolum.getSelectedItem().toString();
            
            pst.setString(5,bolume);
            
             if (fakulte.getSelectedItem().toString().equals("Muhendislik")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar tek") 
                 || fakulte.getSelectedItem().toString().equals("Muhendislik")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar eg")
                 || fakulte.getSelectedItem().toString().equals("Muhendislik")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar ilt")  
                 ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Makine tek")
                  ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Makine eg")
                  ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Makine ilt")
                  ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Elektrik tek")
                  ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Elektrik eg")
                   ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Elektrik ilt")   
                   ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar muh") 
                 ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar eg")
                 ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 &&bbolum.getSelectedItem().toString().equals("Bilgisayar ilt")  
                 ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Makine muh")
                  ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Makine eg")
                  ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Makine ilt")
                  ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Elektrik muh")
                  ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Elektrik eg")
                   ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Elektrik ilt")  
                   ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar muh") 
                 ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar tek")
                 ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 &&bbolum.getSelectedItem().toString().equals("Bilgisayar ilt")  
                 ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Makine muh")
                  ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Makine tek")
                  || fakulte.getSelectedItem().toString().equals("Eğitim")
                 &&bbolum.getSelectedItem().toString().equals("Makine ilt")
                  ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik muh")
                  ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik tek")
                   ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik ilt") 
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar muh") 
                 ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar tek")
                 ||fakulte.getSelectedItem().toString().equals("İletisim")
                 &&bbolum.getSelectedItem().toString().equals("Bilgisayar eg")  
                 ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Makine muh")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Makine tek")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Makine eg")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik muh")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik tek")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik eg") 
                     ){ 
                      
               
               
                    
            
              JOptionPane.showMessageDialog(null, "Lütfen uygun fakulte veya bolum adı tercih edin"); 
              
               
               }
              
                
             else{ 
                    
                    int z=Integer.parseInt(sınıf.getText());
                if(z>4 || numara.getText().length()<4 )  {
                       JOptionPane.showMessageDialog(null, "Sınıf 5 ten kucuk ve numara en az 4  haneli  olmalı"); 
                   }
                    
                else{
                    
                    
                    
                    pst.executeUpdate();         
        
           
                  upDateDb();
            
         
         
            JOptionPane.showMessageDialog(null, "VeriTabanına Kaydedildi!");
     
             }  } } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hata:"+""+e);
            
            
        }
     
        
             
        
    }//GEN-LAST:event_EkleActionPerformed

    private void tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloMouseClicked
      int i = tablo.getSelectedRow();
      
         TableModel model =tablo.getModel();
      
          ad.setText(model.getValueAt(i,1).toString());
         
          soyad.setText(model.getValueAt(i,2).toString());
          
           String ccinsiyet = model.getValueAt(i,3).toString();
            if(ccinsiyet.equals("Erkek")){
                erkek.setSelected(true);
                kız.setSelected(false);
            }
            else{
                kız.setSelected(true);
                erkek.setSelected(false);
            }
          numara.setText(model.getValueAt(i,6).toString());
          sınıf.setText(model.getValueAt(i,7).toString());
          
        
        String subject1 = model.getValueAt(i,4).toString();
            switch(subject1){
                case "Muhendislik":
                    fakulte.setSelectedIndex(0);
                    break;
                case "Teknoloji":
                    fakulte.setSelectedIndex(1);
                    break;
                case "Eğitim":
                    fakulte.setSelectedIndex(2);
                    break;
                case "İletisim":
                    fakulte.setSelectedIndex(3);
                    break;
            }
           String subject2 = model.getValueAt(i,5).toString();
            switch(subject2){
                case "Bilgisayar muh":
                    bbolum.setSelectedIndex(0);
                    break;
                case "Elektrik muh":
                    bbolum.setSelectedIndex(1);
                    break;
                case "Makine muh":
                    bbolum.setSelectedIndex(2);
                    break;
                case "Bilgisayar tek":
                    bbolum.setSelectedIndex(3);
                    break;                 
                case "Elektrik tek":
                    bbolum.setSelectedIndex(4);
                    break;
                case "Makine tek":
                    bbolum.setSelectedIndex(5);
                    break;
                case "Bilgisayar eg":
                    bbolum.setSelectedIndex(6);
                    break;
                case "Elektrik eg ":
                    bbolum.setSelectedIndex(7);
                    break;
                 case "Makine eg":
                    bbolum.setSelectedIndex(8);
                    break;
                case "Bilgisayar ilt":
                    bbolum.setSelectedIndex(9);
                    break;  
                case "Elektrik ilt":
                    bbolum.setSelectedIndex(10);
                    break;
                 case "Makine ilt":
                    bbolum.setSelectedIndex(11);    
                                      
            }   
                    
                    
       
                    
                    
                    
         
        
    }//GEN-LAST:event_tabloMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
    
     DefaultTableModel RecordTable=(DefaultTableModel)tablo.getModel();
     int i=tablo.getSelectedRow();  
        
      try{
          
          id=Integer.parseInt(RecordTable.getValueAt(i,0).toString()); 
         
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrencibilgi?zeroDateTimeBehavior=convertToNull","root",""); 
        
          pst=con.prepareStatement("update ogrenci3 set Ad=?,Soyad=?,Cinsiyet=?,Fakulte=? ,Bolum=?,Numara=?,Sınıf=? where Sıra=?  ");
          
          String n_numara=numara.getText().toString();
           String ssınıf=sınıf.getText().toString();
          
          
          pst.setString(7,ssınıf);
           
           pst.setString(6,n_numara);
           
            pst.setString(1, ad.getText());
            if(erkek.isSelected()){
                cinsiyet="Erkek";
            }
            if(kız.isSelected()){
                cinsiyet="Kız";
            }
            pst.setString(3, cinsiyet);
            
              
            String fakultee=fakulte.getSelectedItem().toString();
            
            pst.setString(4,fakultee);
            pst.setString(2,soyad.getText());
            String bolume=bbolum.getSelectedItem().toString();
            
            pst.setString(5,bolume);
            
            pst.setInt(8,id);
            pst.executeUpdate();         
            
          
              if (fakulte.getSelectedItem().toString().equals("Muhendislik")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar tek") 
                 || fakulte.getSelectedItem().toString().equals("Muhendislik")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar eg")
                 || fakulte.getSelectedItem().toString().equals("Muhendislik")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar ilt")  
                 ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Makine tek")
                  ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Makine eg")
                  ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Makine ilt")
                  ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Elektrik tek")
                  ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Elektrik eg")
                   ||fakulte.getSelectedItem().toString().equals("Muhendislik")
                 &&  bbolum.getSelectedItem().toString().equals("Elektrik ilt")   
                   ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar muh") 
                 ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar eg")
                 ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 &&bbolum.getSelectedItem().toString().equals("Bilgisayar ilt")  
                 ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Makine muh")
                  ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Makine eg")
                  ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Makine ilt")
                  ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Elektrik muh")
                  ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Elektrik eg")
                   ||fakulte.getSelectedItem().toString().equals("Teknoloji")
                 && bbolum.getSelectedItem().toString().equals("Elektrik ilt")  
                   ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar muh") 
                 ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar tek")
                 ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 &&bbolum.getSelectedItem().toString().equals("Bilgisayar ilt")  
                 ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Makine muh")
                  ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Makine tek")
                  || fakulte.getSelectedItem().toString().equals("Eğitim")
                 &&bbolum.getSelectedItem().toString().equals("Makine ilt")
                  ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik muh")
                  ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik tek")
                   ||fakulte.getSelectedItem().toString().equals("Eğitim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik ilt") 
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar muh") 
                 ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Bilgisayar tek")
                 ||fakulte.getSelectedItem().toString().equals("İletisim")
                 &&bbolum.getSelectedItem().toString().equals("Bilgisayar eg")  
                 ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Makine muh")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Makine tek")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Makine eg")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik muh")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik tek")
                  ||fakulte.getSelectedItem().toString().equals("İletisim")
                 && bbolum.getSelectedItem().toString().equals("Elektrik eg") 
                     ){ 
                      
               
               
                    
            
              JOptionPane.showMessageDialog(null, "Lütfen uygun fakulte veya bolum adı tercih edin"); 
              
               
               }
              
                
             else{ 
                    
                    int z=Integer.parseInt(sınıf.getText());
                if(z>4 || numara.getText().length()<4 )  {
                       JOptionPane.showMessageDialog(null, "Sınıf 5 ten kucuk ve numara en az 4  haneli  olmalı"); 
                   }
                    
                else{
                    
                    
            
            
            
            
            
            
            
            upDateDb();
          
          JOptionPane.showMessageDialog(null, "Guncellendi!");
        }}}
         catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hata guncellenemedi:"+""+e);
            
            
        }
          
      
           
           
           
        
        
        
        
        
    }//GEN-LAST:event_guncelleActionPerformed

    private void SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SilActionPerformed
      
     DefaultTableModel RecordTable=(DefaultTableModel)tablo.getModel();
     int i=tablo.getSelectedRow();
     
     try{
         
         id=Integer.parseInt(RecordTable.getValueAt(i,0).toString());
         
         deleteItem=JOptionPane.showConfirmDialog(null,"Secili Kisiyi silmek istiyor musunuz?",
            "Uyarı",JOptionPane.YES_NO_OPTION );   
         if(deleteItem==JOptionPane.YES_OPTION ){
             
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ogrencibilgi?zeroDateTimeBehavior=convertToNull","root",""); 
             
            pst=con.prepareStatement("delete from ogrenci3 where Sıra=?");
            
            pst.setInt(1,id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Silindi");
            upDateDb();           
            
            
         }
     }   
       catch(Exception e){
           JOptionPane.showMessageDialog(this,"HATA Silinemedi"); 
       } 
        
        
    }//GEN-LAST:event_SilActionPerformed

    private void ListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeleActionPerformed
        try{
        
          upDateDb(); 
                  
        }  
        catch(Exception e){
            
        }
    }//GEN-LAST:event_ListeleActionPerformed

    private void yazdırActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazdırActionPerformed
       
    MessageFormat header=new MessageFormat("DOSYA YAZILDI");    
        
     MessageFormat footer=new MessageFormat("Page {0,number,integer}");        
      
     try{
         tablo.print(JTable.PrintMode.NORMAL,header,footer);
         
     }
     
     catch(Exception e){
         JOptionPane.showMessageDialog(this,"HATA Silinemedi"+""+e);   
     }
        
    }//GEN-LAST:event_yazdırActionPerformed

    private void AramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AramaKeyReleased
        
       String val=Arama.getText();
      try {
             if(val.matches("^[0-9]+$")){
               String query="SELECT *FROM ogrenci3 WHERE (Numara LIKE '%"+val+"%' or Sıra LIKE  '%"+val+"%' or  Sınıf LIKE '%"+val+"%')";
               pst=con.prepareStatement(query);
               rs=pst.executeQuery();
               tablo.setModel(DbUtils.resultSetToTableModel(rs));               
             }else{
              String query="SELECT *FROM ogrenci3 WHERE (Ad LIKE '%"+val+"%' or Soyad LIKE '%"+val+"%' "
                      + "or Cinsiyet LIKE '%"+val+"%' or Fakulte LIKE '%"+val+"%'or Bolum LIKE '%"+val+"%' )";              
                               
              pst=con.prepareStatement(query);
              rs=pst.executeQuery();
              
              tablo.setModel(DbUtils.resultSetToTableModel(rs));
                           
             }}                                         
      
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       } 
        finally{
          try{
              if(pst!=null){
                  
               rs.close();
               pst.close();
              }
          }catch(Exception e){
              JOptionPane.showMessageDialog(null,e);
          }
      }
        
        
        
    }//GEN-LAST:event_AramaKeyReleased

    private void erkekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erkekActionPerformed
        
        if(erkek.isSelected()){
           kız.setSelected(false);
        }
        
        
        
    }//GEN-LAST:event_erkekActionPerformed

    private void kızActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kızActionPerformed
       if(kız.isSelected()){
           erkek.setSelected(false);
        }
    }//GEN-LAST:event_kızActionPerformed

  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Arama;
    private javax.swing.JButton Ekle;
    private javax.swing.JButton Listele;
    private javax.swing.JButton Sil;
    private javax.swing.JTextField ad;
    private javax.swing.JComboBox<String> bbolum;
    private javax.swing.JRadioButton erkek;
    private javax.swing.JComboBox<String> fakulte;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton kız;
    private javax.swing.JTextField numara;
    private javax.swing.JTextField soyad;
    private javax.swing.JTextField sınıf;
    private javax.swing.JTable tablo;
    private javax.swing.JButton yazdır;
    // End of variables declaration//GEN-END:variables
}
