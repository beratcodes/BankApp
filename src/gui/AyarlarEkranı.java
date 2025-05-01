
package gui;

import database.IBilgiController;
import database.transaction.HesapBilgileri;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarları;
import gui.ayarlar.TextAyarlari;
import database.transaction.TelNoYenile;




public class AyarlarEkranı extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    private TelNoYenile telNoYenileObject = null;
    
    private String eskiTelNo = null;
    
    public AyarlarEkranı() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarPanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        KullanıcıAdıLabel = new javax.swing.JLabel();
        telefonNoLabel = new javax.swing.JLabel();
        telefonNoText = new javax.swing.JTextField();
        sifreText = new javax.swing.JTextField();
        telefonNoLabel1 = new javax.swing.JLabel();
        sifreIcon = new javax.swing.JLabel();
        telefonNoIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ayarlar");
        setResizable(false);

        ayarlarPanel.setBackground(new java.awt.Color(204, 204, 0));
        ayarlarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/left-arrow_1.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });
        ayarlarPanel.add(geriIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 10, -1, 52));

        KullanıcıAdıLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        KullanıcıAdıLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullanıcıAdıLabel.setText("Sayın [KULLANICI ADI SOYADI]");
        ayarlarPanel.add(KullanıcıAdıLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 68, 535, 50));

        telefonNoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        telefonNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonNoLabel.setText("Telefon Numaranız : ");
        ayarlarPanel.add(telefonNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 298, 50));

        telefonNoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        telefonNoText.setEnabled(false);
        ayarlarPanel.add(telefonNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 230, 50));

        sifreText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sifreText.setText("*****************");
        sifreText.setEnabled(false);
        ayarlarPanel.add(sifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 230, 50));

        telefonNoLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        telefonNoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonNoLabel1.setText("Şifreniz :");
        ayarlarPanel.add(telefonNoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 298, 50));

        sifreIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sifreIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        sifreIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreIconMouseClicked(evt);
            }
        });
        ayarlarPanel.add(sifreIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        telefonNoIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefonNoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        telefonNoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telefonNoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telefonNoIconMouseClicked(evt);
            }
        });
        ayarlarPanel.add(telefonNoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        HesapEkranı hesap = new HesapEkranı();
        dispose();
        hesap.setVisible(true);
    }//GEN-LAST:event_geriIconMouseClicked
    
    private int clickCounter = 0;
    private void telefonNoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonNoIconMouseClicked
        if(clickCounter == 0) // Daha önce tıklanmamışsa 
        {
          telefonNoText.setEnabled(true);
          IconAyarları.changeIcon(telefonNoIcon, "updateTelIcon2");  
          clickCounter++;
        }
        else // 1'den fazla tıklanmışsa telefonNoText'i kapat.
        {
             telefonNoText.setEnabled(false);
             this.telNoYenile();
             
             IconAyarları.setOriginalIcon(telefonNoIcon);
             clickCounter = 0;
        }
        
    }//GEN-LAST:event_telefonNoIconMouseClicked
    
    private void telNoYenile()
    {
        if(this.bilgilerGecerliMi())
        {
            String yeniTelNo =  this.telefonNoText.getText().trim();
            getTelNoYenileObject().setTelNo(yeniTelNo);
            if(getTelNoYenileObject().telNoYenilendiMi())
            {
                Dialogs.ozelMesajGoster(this, "Telefon numarası güncellendi."
                        + "\n Yeni numaranız : " + yeniTelNo);
            } else {
                Dialogs.ozelMesajGoster(this, "Başarısız. Bilgileri Kontrol Ediniz!");
                this.telefonNoText.setText(this.eskiTelNo);
            }
        }
        else 
        {
           Dialogs.bosOlamazMesajıGoster(this);
        }
    }
    
    private void sifreIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreIconMouseClicked
        SifreYenilemeEkranı sifre = new SifreYenilemeEkranı();
        dispose();
        sifre.setVisible(true);
    }//GEN-LAST:event_sifreIconMouseClicked
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        ayarlarPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(telefonNoText);        
        TextAyarlari.setMaximumLimit(telefonNoText, 11);
        KullanıcıAdıLabel.setText("Sayın " + this.getHesapBilgileri().getAdSoyad());
        telefonNoText.setText(this.getHesapBilgileri().getTelNo());
        this.eskiTelNo = telefonNoText.getText();
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.telefonNoText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public TelNoYenile getTelNoYenileObject() {
        if(this.telNoYenileObject == null)
        {
            telNoYenileObject = new TelNoYenile();
        }
        return telNoYenileObject;
    }

    
    
    
    
    

    
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
            java.util.logging.Logger.getLogger(AyarlarEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KullanıcıAdıLabel;
    private javax.swing.JPanel ayarlarPanel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel sifreIcon;
    private javax.swing.JTextField sifreText;
    private javax.swing.JLabel telefonNoIcon;
    private javax.swing.JLabel telefonNoLabel;
    private javax.swing.JLabel telefonNoLabel1;
    private javax.swing.JTextField telefonNoText;
    // End of variables declaration//GEN-END:variables
}
