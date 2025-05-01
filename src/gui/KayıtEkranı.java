
package gui;

import database.IBilgiController;
import database.transaction.HesapBilgileri;
import database.transaction.KullaniciBasvuru;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public class KayıtEkranı extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private KullaniciBasvuru kullaniciBasvuruObject = null;
    
    public KayıtEkranı() {
        initComponents();
        getEdits();
    }

    public KullaniciBasvuru getKullaniciBasvuruObject(){
        if(this.kullaniciBasvuruObject == null)
        {
            kullaniciBasvuruObject = new KullaniciBasvuru();
        }
        return kullaniciBasvuruObject;
    }
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KayıtPaneli = new javax.swing.JPanel();
        kayıtLabel = new javax.swing.JLabel();
        kimlikLabel = new javax.swing.JLabel();
        güvenlikLabel = new javax.swing.JLabel();
        adsoyadText = new javax.swing.JTextField();
        kimlikText = new javax.swing.JTextField();
        telefonText = new javax.swing.JTextField();
        bilgiLabel = new javax.swing.JLabel();
        telefonLabel = new javax.swing.JLabel();
        guvenlikCmb = new javax.swing.JComboBox<>();
        cevapText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnKayitOl = new javax.swing.JButton();
        adsoyadLabel1 = new javax.swing.JLabel();
        bilgiLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Kayıt Ol Ekranı");
        setResizable(false);

        KayıtPaneli.setBackground(new java.awt.Color(255, 255, 204));
        KayıtPaneli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kayıtLabel.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        kayıtLabel.setText("KAYIT OL");
        KayıtPaneli.add(kayıtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 246, 54));

        kimlikLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        kimlikLabel.setText("TC No :");
        KayıtPaneli.add(kimlikLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, 40));

        güvenlikLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        güvenlikLabel.setText("GÜVENLİK SORUSU :");
        KayıtPaneli.add(güvenlikLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 631, -1, 40));

        adsoyadText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        KayıtPaneli.add(adsoyadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 279, 323, 40));

        kimlikText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        KayıtPaneli.add(kimlikText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 364, 323, 40));

        telefonText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        KayıtPaneli.add(telefonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 445, 323, 40));

        bilgiLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        bilgiLabel.setText("KİŞİSEL BİLGİLER");
        KayıtPaneli.add(bilgiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, 40));

        telefonLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        telefonLabel.setText("Telefon No:");
        KayıtPaneli.add(telefonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, 40));

        guvenlikCmb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        guvenlikCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil hayvanınızın adı nedir?", "Öğretmeninizin soyadı nedir?", "Yaşamak istediğiniz yer neresidir?", "Ya da rastgele cümle girin (önerilir)" }));
        KayıtPaneli.add(guvenlikCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 330, 40));

        cevapText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        KayıtPaneli.add(cevapText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 710, 330, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setText("Cevap : ");
        KayıtPaneli.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 710, 80, 40));

        btnKayitOl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKayitOl.setText("KAYIT OL");
        btnKayitOl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKayitOl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKayitOlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKayitOlMouseExited(evt);
            }
        });
        btnKayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitOlActionPerformed(evt);
            }
        });
        KayıtPaneli.add(btnKayitOl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 800, 150, 50));

        adsoyadLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        adsoyadLabel1.setText("Ad Soyad : ");
        KayıtPaneli.add(adsoyadLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 40));

        bilgiLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        bilgiLabel1.setText("GÜVENLİK BİLGİLERİ");
        KayıtPaneli.add(bilgiLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 545, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KayıtPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KayıtPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null); // Başlangıçta ekran masaüstü merkezinde açılsın.
        KayıtPaneli.setFocusable(true); // Başlangıçta odaklanması gereken ekran kayıt paneli olsun.
        TextAyarlari.setOnlyNumber(kimlikText); // KimlikText kutusuna sadece rakam girilsin.
        TextAyarlari.setOnlyAlphabetic(adsoyadText); // adSoyadText'e sadece harf girilsin.
        TextAyarlari.setOnlyNumber(telefonText); // telefonText'e sadece rakam girilsin.
        TextAyarlari.setMaximumLimit(kimlikText, 11); // karakter giriş limitini 11 yapıyor.
        TextAyarlari.setMaximumLimit(telefonText, 11);
    }
    
    

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(KayıtPaneli);
    }


    private void btnKayitOlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKayitOlMouseEntered
        ButonAyarları.setBg(btnKayitOl, Color.yellow); // Mouse buton üzerine geldiğinde butonun rengi değişsin.
    }//GEN-LAST:event_btnKayitOlMouseEntered

    private void btnKayitOlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKayitOlMouseExited
        ButonAyarları.setOriginalBg(btnKayitOl); // Mouse buton üzerinden gittiğinde buton eski rengini alsın
    }//GEN-LAST:event_btnKayitOlMouseExited

    private void btnKayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitOlActionPerformed
        if(this.bilgilerGecerliMi())
        {
            this.basvuruyuGerceklestir();
            /*
            GirisEkranı girisEkran = new GirisEkranı();
            dispose();
            girisEkran.setVisible(true);
            */
        }
        else 
        {
            Dialogs.bosOlamazMesajıGoster(this);
        }
    }//GEN-LAST:event_btnKayitOlActionPerformed
    
    private void basvuruyuGerceklestir() {
    // Kişisel Bilgiler
    this.getKullaniciBasvuruObject().setAdSoyad(this.adsoyadText.getText());
    this.getKullaniciBasvuruObject().setTelNo(this.telefonText.getText().trim());
    this.getKullaniciBasvuruObject().setTcNo(this.kimlikText.getText().trim());
    
    // Güvenlik Bilgileri
    this.getKullaniciBasvuruObject().setGuvenlikSorusu(String.valueOf(this.guvenlikCmb.getSelectedItem()));
    this.getKullaniciBasvuruObject().setGuvenlikCevap(this.cevapText.getText().trim());
    
    // Sistem tarafından verilecek bilgiler
    this.getKullaniciBasvuruObject().setMusteriNo(this.randomMusteriNoAl());
    this.getKullaniciBasvuruObject().setSifre(this.randomSifreAl());
    
    // ÖNEMLİ: Burada veritabanına kaydet!
    //this.getKullaniciBasvuruObject().basvuruyuOnayla();
    
    if(this.getKullaniciBasvuruObject().basvuruOnaylandiMi()) {
    Dialogs.ozelMesajGoster(this, "Başvurunuz Kabul Edilmiştir."
            + "\nMüşteri Numaranız : " + this.getKullaniciBasvuruObject().getMusteriNo()
            + "\nŞifreniz : " + this.getKullaniciBasvuruObject().getSifre());
    GirisEkranı girisEkran = new GirisEkranı();
    dispose();
    girisEkran.setVisible(true);
    }
    else 
    {
        Dialogs.ozelMesajGoster(this, "Girilen parametreleri lütfen kontrol ediniz.");
    }

    }

    private String randomMusteriNoAl()
    {
        String musteriNo;
        do {
         musteriNo = String.valueOf(1000000 + (int)(Math.random() * 9000000));   
        }while(this.getKullaniciBasvuruObject().musteriNoTablodaVarMi());
        
        return musteriNo;
    }
    
    private String randomSifreAl()
    {
        String sifre;
        sifre = String.valueOf(1000 + (int)(Math.random() * 9000));
        return sifre;
    }
    
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
            java.util.logging.Logger.getLogger(KayıtEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayıtEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayıtEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayıtEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayıtEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KayıtPaneli;
    private javax.swing.JLabel adsoyadLabel1;
    private javax.swing.JTextField adsoyadText;
    private javax.swing.JLabel bilgiLabel;
    private javax.swing.JLabel bilgiLabel1;
    private javax.swing.JButton btnKayitOl;
    private javax.swing.JTextField cevapText;
    private javax.swing.JComboBox<String> guvenlikCmb;
    private javax.swing.JLabel güvenlikLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel kayıtLabel;
    private javax.swing.JLabel kimlikLabel;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JLabel telefonLabel;
    private javax.swing.JTextField telefonText;
    // End of variables declaration//GEN-END:variables


    private Object kullaniciBasvuruObject() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    
}
