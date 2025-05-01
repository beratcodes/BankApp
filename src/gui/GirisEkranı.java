
package gui;

import database.DbConnection;
import database.IBilgiController;
import database.transaction.HesapBilgileri;
import database.transaction.KullaniciGiris;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

public final class GirisEkranı extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private KullaniciGiris kullaniciGirisObject = null;
    
    private final String KIMLIK_NO_TEXT = "TC Kimlik No / Müşteri No";
    private final String SIFRE_TEXT = "**********";
    
    public GirisEkranı() {
        initComponents();
        getEdits();
        System.out.println("Kullanıcı id = " + getHesapBilgileri().getKullaniciId());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkranıPanel = new javax.swing.JPanel();
        hosgeldinizMesaj = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        btnKayitOl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGiris = new javax.swing.JButton();
        sifremiUnuttumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giriş Ekranı");
        setResizable(false);

        girisEkranıPanel.setBackground(new java.awt.Color(204, 255, 204));

        hosgeldinizMesaj.setBackground(new java.awt.Color(204, 0, 0));
        hosgeldinizMesaj.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        hosgeldinizMesaj.setForeground(new java.awt.Color(255, 51, 51));
        hosgeldinizMesaj.setText("HOŞGELDİNİZ");

        kimlikText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });

        sifreText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });

        btnKayitOl.setBackground(new java.awt.Color(255, 204, 204));
        btnKayitOl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKayitOl.setText("Kayıt Ol");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Halen müşterimiz değil misin?");

        btnGiris.setBackground(new java.awt.Color(255, 204, 204));
        btnGiris.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGiris.setText("Giriş Yap");
        btnGiris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGirisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGirisMouseExited(evt);
            }
        });
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });

        sifremiUnuttumLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        sifremiUnuttumLabel.setForeground(new java.awt.Color(0, 0, 0));
        sifremiUnuttumLabel.setText("Şifremi Unuttum");
        sifremiUnuttumLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifremiUnuttumLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifremiUnuttumLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisEkranıPanelLayout = new javax.swing.GroupLayout(girisEkranıPanel);
        girisEkranıPanel.setLayout(girisEkranıPanelLayout);
        girisEkranıPanelLayout.setHorizontalGroup(
            girisEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkranıPanelLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(girisEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(hosgeldinizMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(girisEkranıPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnKayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifremiUnuttumLabel))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        girisEkranıPanelLayout.setVerticalGroup(
            girisEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkranıPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(hosgeldinizMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sifremiUnuttumLabel)
                .addGap(35, 35, 35)
                .addComponent(btnGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(girisEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkranıPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkranıPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void getEdits() {
        // Ekranı ortada başlamasını sağlayan kod.
        this.setLocationRelativeTo(null);
        girisEkranıPanel.setFocusable(true);
        kimlikText.setText(KIMLIK_NO_TEXT);
        sifreText.setText(SIFRE_TEXT);
        TextAyarlari.setOnlyNumber(kimlikText);
        //TextAyarlari.setMaximumLimit(kimlikText, 11);
        System.out.println();
    }

    public KullaniciGiris getKullaniciGirisObject() {
        if(this.kullaniciGirisObject == null)
        {
            kullaniciGirisObject = new KullaniciGiris();
        }
        return kullaniciGirisObject;
    }
        
    

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.kimlikText.getText().equals(this.KIMLIK_NO_TEXT)
                || String.valueOf(this.sifreText.getPassword()).equals(SIFRE_TEXT));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    /*
    Buton Renklendirmeleri
    */

    private void btnGirisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirisMouseEntered
        ButonAyarları.setBg(btnGiris, Color.yellow);
    }//GEN-LAST:event_btnGirisMouseEntered

    private void btnGirisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirisMouseExited
        ButonAyarları.setOriginalBg(btnGiris);
    }//GEN-LAST:event_btnGirisMouseExited

    private void btnKayitOlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKayitOlMouseEntered
        ButonAyarları.setBg(btnKayitOl, Color.orange);
    }//GEN-LAST:event_btnKayitOlMouseEntered

    private void btnKayitOlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKayitOlMouseExited
        ButonAyarları.setOriginalBg(btnKayitOl);
    }//GEN-LAST:event_btnKayitOlMouseExited

    /*
    Text Focus Ayarları
    */
    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained
        TextAyarlari.checkTheTextFocusGained(kimlikText, KIMLIK_NO_TEXT);
    }//GEN-LAST:event_kimlikTextFocusGained

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost
        TextAyarlari.checkTheTextFocusLost(kimlikText);
    }//GEN-LAST:event_kimlikTextFocusLost

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusGained
        TextAyarlari.checkTheTextFocusGained(sifreText, SIFRE_TEXT);
    }//GEN-LAST:event_sifreTextFocusGained

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusLost
        TextAyarlari.checkTheTextFocusLost(sifreText);
    }//GEN-LAST:event_sifreTextFocusLost

    /*
    Buton Olayları
    */
    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
        if(this.bilgilerGecerliMi())
        {
            String musteriKimlik = this.kimlikText.getText().trim();
            String sifre = String.valueOf(this.sifreText.getPassword());
            this.girisYap(musteriKimlik, sifre);
        }
        else 
        {
            Dialogs.bosOlamazMesajıGoster(this);
        }
    }//GEN-LAST:event_btnGirisActionPerformed
    
    private void girisYap(String musteriKimlik, String sifre)
    {
        this.getKullaniciGirisObject().setMusteriKimlik(musteriKimlik);
        this.getKullaniciGirisObject().setSifre(sifre);
        
        if(getKullaniciGirisObject().girisBilgileriDogruMu())
        {
            HesapEkranı hesap = new HesapEkranı();
            dispose();
            hesap.setVisible(true);
        }
        else
        {
            Dialogs.ozelMesajGoster(this, "Hatalı Kimlik No ya da Şifre"
                    + "\nLütfen bilgilerinizi kontrol ediniz.");
        }
    }
    
    private void btnKayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitOlActionPerformed
        KayıtEkranı kayitekrani = new KayıtEkranı();
        this.dispose();
        kayitekrani.setVisible(true);
    }//GEN-LAST:event_btnKayitOlActionPerformed

    private void sifremiUnuttumLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifremiUnuttumLabelMouseClicked
       
       SifreYenilemeEkranı yenile = new SifreYenilemeEkranı();
       dispose();
       yenile.setVisible(true);

    }//GEN-LAST:event_sifremiUnuttumLabelMouseClicked

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
            java.util.logging.Logger.getLogger(GirisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiris;
    private javax.swing.JButton btnKayitOl;
    private javax.swing.JPanel girisEkranıPanel;
    private javax.swing.JLabel hosgeldinizMesaj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JLabel sifremiUnuttumLabel;
    // End of variables declaration//GEN-END:variables
}
