
package gui;

import database.IBilgiController;
import database.transaction.HesapBilgileri;
import database.transaction.ParaYatirma;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;


public class ParaYatırmaEkranı extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    private int yatirilanMiktar = 0;
    
    private ParaYatirma paraYatirmaObject = null;
    
    public ParaYatırmaEkranı() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraYatirmaPanel = new javax.swing.JPanel();
        KullanıcıAdıLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        uyarıLabel = new javax.swing.JLabel();
        ToplamBakiyeLabel = new javax.swing.JLabel();
        yatiracaginizMiktarLabel = new javax.swing.JLabel();
        miktarText = new javax.swing.JTextField();
        btnParaYatir = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Para Yatırma Ekranı");
        setResizable(false);

        paraYatirmaPanel.setBackground(new java.awt.Color(255, 153, 102));

        KullanıcıAdıLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        KullanıcıAdıLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullanıcıAdıLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        bakiyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bakiyeLabel.setText("[bakiye]");

        uyarıLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uyarıLabel.setText("Tek seferde 40.000 TL ve altını yatırabilirsiniz.");

        ToplamBakiyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ToplamBakiyeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ToplamBakiyeLabel.setText("Toplam Bakiyeniz : ");

        yatiracaginizMiktarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yatiracaginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yatiracaginizMiktarLabel.setText("Yatıracağınız Miktar :");

        miktarText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        miktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                miktarTextKeyReleased(evt);
            }
        });

        btnParaYatir.setBackground(new java.awt.Color(255, 204, 204));
        btnParaYatir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnParaYatir.setText("PARA YATIR");
        btnParaYatir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParaYatir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParaYatirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParaYatirMouseExited(evt);
            }
        });
        btnParaYatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParaYatirActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/left-arrow_1.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraYatirmaPanelLayout = new javax.swing.GroupLayout(paraYatirmaPanel);
        paraYatirmaPanel.setLayout(paraYatirmaPanelLayout);
        paraYatirmaPanelLayout.setHorizontalGroup(
            paraYatirmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(KullanıcıAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(geriIcon)
                .addGap(23, 23, 23))
            .addGroup(paraYatirmaPanelLayout.createSequentialGroup()
                .addGroup(paraYatirmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraYatirmaPanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(uyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraYatirmaPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(ToplamBakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraYatirmaPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(paraYatirmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnParaYatir)
                            .addGroup(paraYatirmaPanelLayout.createSequentialGroup()
                                .addComponent(yatiracaginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(miktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        paraYatirmaPanelLayout.setVerticalGroup(
            paraYatirmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaPanelLayout.createSequentialGroup()
                .addGroup(paraYatirmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraYatirmaPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(KullanıcıAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraYatirmaPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addComponent(uyarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(paraYatirmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToplamBakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(paraYatirmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yatiracaginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnParaYatir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        paraYatirmaPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {miktarText, yatiracaginizMiktarLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        paraYatirmaPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(miktarText);
        TextAyarlari.setMaximumLimit(miktarText, 5);
        this.KullanıcıAdıLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()) + " ₺");
    }

    public ParaYatirma getParaYatirmaObject() {
        if(this.paraYatirmaObject == null)
        {
            paraYatirmaObject = new ParaYatirma();
        }
        return paraYatirmaObject;
    }
    
    

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.miktarText.getText().equals("")
                );
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    

    private void btnParaYatirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaYatirMouseEntered
        ButonAyarları.setBg(btnParaYatir, Color.green);
    }//GEN-LAST:event_btnParaYatirMouseEntered

    private void btnParaYatirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaYatirMouseExited
        ButonAyarları.setOriginalBg(btnParaYatir);
    }//GEN-LAST:event_btnParaYatirMouseExited

    private void btnParaYatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaYatirActionPerformed
        if(this.bilgilerGecerliMi())
        {
            this.paraYatir();
        }else {
            Dialogs.bosOlamazMesajıGoster(this);
        }
    }//GEN-LAST:event_btnParaYatirActionPerformed
    
    private void paraYatir()
    {
        this.getParaYatirmaObject().setYatirilacakMiktar(this.yatirilanMiktar); 
        
        if(getParaYatirmaObject().paraYatirildiMi()){
            Dialogs.ozelMesajGoster(
            this, 
            "Başarıyla hesabınıza para tanımlanmıştır.\nYatırılan Miktar : " + this.yatirilanMiktar + " ₺");
            HesapEkranı ekran = new HesapEkranı();
            dispose();
            ekran.setVisible(true); 
        } else 
        {
            Dialogs.ozelMesajGoster(this, "Lütfen bilgilerinizi kontrol edin.");
        }
    }
    
    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        HesapEkranı hesap = new HesapEkranı();
        dispose();
        hesap.setVisible(true);
    }//GEN-LAST:event_geriIconMouseClicked

    private void miktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_miktarTextKeyReleased
        this.yatirilanMiktar = TextAyarlari.checkTheTextKeyReleased(miktarText, 40000);
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
            java.util.logging.Logger.getLogger(ParaYatırmaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatırmaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatırmaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatırmaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatırmaEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KullanıcıAdıLabel;
    private javax.swing.JLabel ToplamBakiyeLabel;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton btnParaYatir;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JTextField miktarText;
    private javax.swing.JPanel paraYatirmaPanel;
    private javax.swing.JLabel uyarıLabel;
    private javax.swing.JLabel yatiracaginizMiktarLabel;
    // End of variables declaration//GEN-END:variables

}
