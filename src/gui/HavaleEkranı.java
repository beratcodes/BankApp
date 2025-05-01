
package gui;

import database.IBilgiController;
import database.transaction.Havale;
import database.transaction.HesapBilgileri;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;


public final class HavaleEkranı extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {
    
    private final String  MUSTERI_NO_TEXT_ORIGINAL = "Müşteri No";
    
    private Havale havaleObject = null;
    
    private int gonderilecekMiktar = 0;
    
    public HavaleEkranı() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        havalePanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(miktarText);
        TextAyarlari.setOnlyNumber(musteriNoText);
        TextAyarlari.setMaximumLimit(miktarText, 5);
        TextAyarlari.setMaximumLimit(musteriNoText, 11);
        musteriNoText.setText(MUSTERI_NO_TEXT_ORIGINAL);
        this.KullanıcıAdıLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye() + " ₺"));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.miktarText.getText().equals("")
                || this.musteriNoText.getText().equals(this.MUSTERI_NO_TEXT_ORIGINAL));
    }

    public Havale getHavaleObject() {
        if(this.havaleObject == null)
        {
            havaleObject = new Havale();
        }
        return havaleObject;
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        havalePanel = new javax.swing.JPanel();
        KullanıcıAdıLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        uyarıLabel = new javax.swing.JLabel();
        ToplamBakiyeLabel = new javax.swing.JLabel();
        gonderilecekMiktarLabel = new javax.swing.JLabel();
        miktarText = new javax.swing.JTextField();
        btnGönder = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();
        havaleLabel = new javax.swing.JLabel();
        musteriNoText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Havale Ekranı");
        setResizable(false);

        havalePanel.setBackground(new java.awt.Color(153, 102, 255));

        KullanıcıAdıLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        KullanıcıAdıLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullanıcıAdıLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        bakiyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bakiyeLabel.setText("[bakiye]");

        uyarıLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uyarıLabel.setText("Tek seferde 20.000 TL ve altını gönderebilirsiniz.");

        ToplamBakiyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ToplamBakiyeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ToplamBakiyeLabel.setText("Toplam Bakiyeniz : ");

        gonderilecekMiktarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gonderilecekMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gonderilecekMiktarLabel.setText("Göndereceğiniz Miktar :");

        miktarText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        miktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                miktarTextKeyReleased(evt);
            }
        });

        btnGönder.setBackground(new java.awt.Color(255, 204, 204));
        btnGönder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGönder.setText("GÖNDER");
        btnGönder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGönder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGönderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGönderMouseExited(evt);
            }
        });
        btnGönder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGönderActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/left-arrow_1.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        havaleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        havaleLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        havaleLabel.setText("Havale Alacak Kişi :");

        musteriNoText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        musteriNoText.setForeground(new java.awt.Color(153, 153, 153));
        musteriNoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                musteriNoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                musteriNoTextFocusLost(evt);
            }
        });

        javax.swing.GroupLayout havalePanelLayout = new javax.swing.GroupLayout(havalePanel);
        havalePanel.setLayout(havalePanelLayout);
        havalePanelLayout.setHorizontalGroup(
            havalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havalePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(KullanıcıAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(geriIcon)
                .addGap(23, 23, 23))
            .addGroup(havalePanelLayout.createSequentialGroup()
                .addGroup(havalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(havalePanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(uyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havalePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(ToplamBakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havalePanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(havalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGönder)
                            .addGroup(havalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(havalePanelLayout.createSequentialGroup()
                                    .addComponent(havaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(musteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(havalePanelLayout.createSequentialGroup()
                                    .addComponent(gonderilecekMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(miktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        havalePanelLayout.setVerticalGroup(
            havalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havalePanelLayout.createSequentialGroup()
                .addGroup(havalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(havalePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(KullanıcıAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havalePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(uyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(havalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToplamBakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(havalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gonderilecekMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(havalePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(havaleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnGönder, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        havalePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gonderilecekMiktarLabel, miktarText});

        havalePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {havaleLabel, musteriNoText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havalePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havalePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void miktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_miktarTextKeyReleased
        this.gonderilecekMiktar = TextAyarlari.checkTheTextKeyReleased(miktarText, 20000);
    }//GEN-LAST:event_miktarTextKeyReleased

    private void btnGönderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGönderMouseEntered
        ButonAyarları.setBg(btnGönder, Color.green);
    }//GEN-LAST:event_btnGönderMouseEntered

    private void btnGönderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGönderMouseExited
        ButonAyarları.setOriginalBg(btnGönder);
    }//GEN-LAST:event_btnGönderMouseExited

    private void btnGönderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGönderActionPerformed
        if(this.bilgilerGecerliMi())
        {
            this.havaleYap();
            
        } else
        {
           Dialogs.bosOlamazMesajıGoster(this);
        }
    }//GEN-LAST:event_btnGönderActionPerformed

    private void havaleYap()
    {
        getHavaleObject().setGonderilecekMiktar(this.gonderilecekMiktar);
        getHavaleObject().setHavaleAlacakKisi(this.musteriNoText.getText());
        
        if(getHavaleObject().havaleYapildiMi())
        {
            Dialogs.ozelMesajGoster(this, "Havale işlemi gerçekleşti."
                    + "\nGönderilen müşteri numarası : " + this.musteriNoText.getText()
                    + "\nGönderdiğiniz Miktar : " + this.gonderilecekMiktar + " ₺");
            HesapEkranı hesap = new HesapEkranı();
            dispose();
            hesap.setVisible(true);
        } else 
        {
            Dialogs.ozelMesajGoster(this, "Havale işlemi gerçekleştirilemedi.\n"
                    + "Lütfen girdiğiniz bilgileri kontrol ediniz.");
        }
    }
    
    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        HesapEkranı hesap = new HesapEkranı();
        dispose();
        hesap.setVisible(true);
    }//GEN-LAST:event_geriIconMouseClicked

    private void musteriNoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musteriNoTextFocusGained
        TextAyarlari.checkTheTextFocusGained(musteriNoText, MUSTERI_NO_TEXT_ORIGINAL);
    }//GEN-LAST:event_musteriNoTextFocusGained

    private void musteriNoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musteriNoTextFocusLost
        TextAyarlari.checkTheTextFocusLost(musteriNoText);
    }//GEN-LAST:event_musteriNoTextFocusLost

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
            java.util.logging.Logger.getLogger(HavaleEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HavaleEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HavaleEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HavaleEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HavaleEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KullanıcıAdıLabel;
    private javax.swing.JLabel ToplamBakiyeLabel;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton btnGönder;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel gonderilecekMiktarLabel;
    private javax.swing.JLabel havaleLabel;
    private javax.swing.JPanel havalePanel;
    private javax.swing.JTextField miktarText;
    private javax.swing.JTextField musteriNoText;
    private javax.swing.JLabel uyarıLabel;
    // End of variables declaration//GEN-END:variables
}
