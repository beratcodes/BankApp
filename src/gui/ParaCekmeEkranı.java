
package gui;

import database.IBilgiController;
import database.transaction.HesapBilgileri;
import database.transaction.ParaCekme;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;


public final class ParaCekmeEkranı extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private ParaCekme paraCekmeObject = null;
    
    private int cekilecekMiktar = 0;
    public ParaCekmeEkranı() {
        initComponents();
        getEdits();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraCekmePanel = new javax.swing.JPanel();
        KullanıcıAdıLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        uyarıLabel = new javax.swing.JLabel();
        ToplamBakiyeLabel = new javax.swing.JLabel();
        cekilecekMiktarLabel = new javax.swing.JLabel();
        miktarText = new javax.swing.JTextField();
        btnParaCek = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Para Çekme Ekranı");
        setResizable(false);

        paraCekmePanel.setBackground(new java.awt.Color(255, 255, 204));

        KullanıcıAdıLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        KullanıcıAdıLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullanıcıAdıLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        bakiyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bakiyeLabel.setText("[bakiye]");

        uyarıLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uyarıLabel.setText("Tek seferde 5000 TL ve altını çekebilirsiniz.");

        ToplamBakiyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ToplamBakiyeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ToplamBakiyeLabel.setText("Toplam Bakiyeniz : ");

        cekilecekMiktarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cekilecekMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cekilecekMiktarLabel.setText("Çekeceğiniz Miktar :");

        miktarText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        miktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                miktarTextKeyReleased(evt);
            }
        });

        btnParaCek.setBackground(new java.awt.Color(255, 204, 204));
        btnParaCek.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnParaCek.setText("PARA ÇEK");
        btnParaCek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParaCek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParaCekMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParaCekMouseExited(evt);
            }
        });
        btnParaCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaCekActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/left-arrow_1.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraCekmePanelLayout = new javax.swing.GroupLayout(paraCekmePanel);
        paraCekmePanel.setLayout(paraCekmePanelLayout);
        paraCekmePanelLayout.setHorizontalGroup(
            paraCekmePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(KullanıcıAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(geriIcon)
                .addGap(23, 23, 23))
            .addGroup(paraCekmePanelLayout.createSequentialGroup()
                .addGroup(paraCekmePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraCekmePanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(uyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraCekmePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(ToplamBakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraCekmePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(paraCekmePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paraCekmePanelLayout.createSequentialGroup()
                                .addComponent(cekilecekMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(miktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        paraCekmePanelLayout.setVerticalGroup(
            paraCekmePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmePanelLayout.createSequentialGroup()
                .addGroup(paraCekmePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraCekmePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(KullanıcıAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraCekmePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(uyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(paraCekmePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToplamBakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(paraCekmePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekilecekMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        paraCekmePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ToplamBakiyeLabel, bakiyeLabel, uyarıLabel});

        paraCekmePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cekilecekMiktarLabel, miktarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        TextAyarlari.setOnlyNumber(miktarText);
        paraCekmePanel.setFocusable(true);
        TextAyarlari.setMaximumLimit(miktarText, 4);
        this.KullanıcıAdıLabel.setText("Sayın " + this.getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(this.getHesapBilgileri().getBakiye() + " ₺"));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.miktarText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaCekme getParaCekmeObject() {
        if(this.paraCekmeObject == null)
        {
            paraCekmeObject = new ParaCekme();
        }
        return paraCekmeObject;
    }

    private void btnParaCekMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaCekMouseEntered
        ButonAyarları.setBg(btnParaCek, Color.green);
    }//GEN-LAST:event_btnParaCekMouseEntered

    private void btnParaCekMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaCekMouseExited
        ButonAyarları.setOriginalBg(btnParaCek);
    }//GEN-LAST:event_btnParaCekMouseExited

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        HesapEkranı hesap = new HesapEkranı();
        dispose();
        hesap.setVisible(true);
    }//GEN-LAST:event_geriIconMouseClicked

    private void btnParaCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaCekActionPerformed
        if(this.bilgilerGecerliMi())
        {
            this.paraCek();
        } else {
            Dialogs.bosOlamazMesajıGoster(this);
        }
        
    }//GEN-LAST:event_btnParaCekActionPerformed

    private void paraCek()
    {
        this.getParaCekmeObject().setCekilecekMiktar(cekilecekMiktar);
        
        if(getParaCekmeObject().paraCekildiMi())
        {
            Dialogs.ozelMesajGoster(this, "Para çekme işlemi başarıyla tamamlandi."
                    + "\nÇekilen Miktar : " + this.cekilecekMiktar + " ₺");
            HesapEkranı hesap = new HesapEkranı();
            dispose();
            hesap.setVisible(true);
        }else 
        {
            Dialogs.ozelMesajGoster(this, "Yetersiz bakiye!");
        }
    }
    
    private void miktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_miktarTextKeyReleased
        this.cekilecekMiktar = TextAyarlari.checkTheTextKeyReleased(miktarText, 5000);
    }//GEN-LAST:event_miktarTextKeyReleased

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
            java.util.logging.Logger.getLogger(ParaCekmeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KullanıcıAdıLabel;
    private javax.swing.JLabel ToplamBakiyeLabel;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton btnParaCek;
    private javax.swing.JLabel cekilecekMiktarLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JTextField miktarText;
    private javax.swing.JPanel paraCekmePanel;
    private javax.swing.JLabel uyarıLabel;
    // End of variables declaration//GEN-END:variables
}
