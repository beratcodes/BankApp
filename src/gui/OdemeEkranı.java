
package gui;

import database.IBilgiController;
import database.transaction.FaturaOdemeleri;
import database.transaction.HesapBilgileri;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import java.awt.Color;

public final class OdemeEkranı extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    
    private FaturaOdemeleri faturaOdemeObject = null;
    
    public OdemeEkranı() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemelerPanel = new javax.swing.JPanel();
        KullanıcıAdıLabel = new javax.swing.JLabel();
        geriIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        elektirikBorcuLabel = new javax.swing.JLabel();
        btnElektirikOde = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        suBorcuLabel = new javax.swing.JLabel();
        btnSuOde = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dogalgazBorcuLabel = new javax.swing.JLabel();
        btnDogalgazOde = new javax.swing.JButton();
        btnInternetOde = new javax.swing.JButton();
        internetBorcuLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ödeme Ekranı");
        setResizable(false);

        odemelerPanel.setBackground(new java.awt.Color(0, 204, 204));

        KullanıcıAdıLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        KullanıcıAdıLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullanıcıAdıLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/left-arrow_1.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Toplam elektirik faturası borcunuz : ");

        elektirikBorcuLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        elektirikBorcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektirikBorcuLabel.setText("[Elektirik Borcu]");

        btnElektirikOde.setBackground(new java.awt.Color(204, 204, 255));
        btnElektirikOde.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnElektirikOde.setForeground(new java.awt.Color(0, 0, 0));
        btnElektirikOde.setText("ÖDE");
        btnElektirikOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElektirikOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElektirikOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElektirikOdeMouseExited(evt);
            }
        });
        btnElektirikOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElektirikOdeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Toplam su faturası borcunuz : ");

        suBorcuLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        suBorcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suBorcuLabel.setText("[Su Borcu]");

        btnSuOde.setBackground(new java.awt.Color(255, 204, 255));
        btnSuOde.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSuOde.setForeground(new java.awt.Color(0, 0, 0));
        btnSuOde.setText("ÖDE");
        btnSuOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuOdeMouseExited(evt);
            }
        });
        btnSuOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuOdeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Toplam doğalgaz faturası borcunuz : ");

        dogalgazBorcuLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        dogalgazBorcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dogalgazBorcuLabel.setText("[Doğalgaz Borcu]");

        btnDogalgazOde.setBackground(new java.awt.Color(255, 255, 204));
        btnDogalgazOde.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDogalgazOde.setForeground(new java.awt.Color(0, 0, 0));
        btnDogalgazOde.setText("ÖDE");
        btnDogalgazOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDogalgazOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDogalgazOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDogalgazOdeMouseExited(evt);
            }
        });
        btnDogalgazOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDogalgazOdeActionPerformed(evt);
            }
        });

        btnInternetOde.setBackground(new java.awt.Color(204, 255, 204));
        btnInternetOde.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInternetOde.setForeground(new java.awt.Color(0, 0, 0));
        btnInternetOde.setText("ÖDE");
        btnInternetOde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInternetOde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInternetOdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInternetOdeMouseExited(evt);
            }
        });
        btnInternetOde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternetOdeActionPerformed(evt);
            }
        });

        internetBorcuLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        internetBorcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internetBorcuLabel.setText("[internet Borcu]");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Toplam internet faturası borcunuz : ");

        javax.swing.GroupLayout odemelerPanelLayout = new javax.swing.GroupLayout(odemelerPanel);
        odemelerPanel.setLayout(odemelerPanelLayout);
        odemelerPanelLayout.setHorizontalGroup(
            odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(odemelerPanelLayout.createSequentialGroup()
                        .addComponent(KullanıcıAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addComponent(geriIcon)
                        .addGap(26, 26, 26))
                    .addGroup(odemelerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(elektirikBorcuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnElektirikOde)
                        .addGap(108, 108, 108))
                    .addGroup(odemelerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(suBorcuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnSuOde)
                        .addGap(108, 108, 108))
                    .addGroup(odemelerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dogalgazBorcuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnDogalgazOde)
                        .addGap(108, 108, 108))
                    .addGroup(odemelerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(internetBorcuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(btnInternetOde)
                        .addGap(108, 108, 108))))
        );
        odemelerPanelLayout.setVerticalGroup(
            odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(KullanıcıAdıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elektirikBorcuLabel)
                    .addComponent(btnElektirikOde, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suBorcuLabel)
                    .addComponent(btnSuOde, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogalgazBorcuLabel)
                    .addComponent(btnDogalgazOde, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(odemelerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(internetBorcuLabel)
                    .addComponent(btnInternetOde, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        odemelerPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDogalgazOde, btnElektirikOde, btnInternetOde, btnSuOde, dogalgazBorcuLabel, elektirikBorcuLabel, internetBorcuLabel, jLabel1, jLabel2, jLabel3, jLabel4, suBorcuLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        odemelerPanel.setFocusable(true);
        this.KullanıcıAdıLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        
        // Sadece görüntü için "TL" ekliyoruz
        this.elektirikBorcuLabel.setText(String.format("%.2f TL", getHesapBilgileri().getElektirikFaturasi()));
        this.suBorcuLabel.setText(String.format("%.2f TL", getHesapBilgileri().getSuFaturasi()));
        this.dogalgazBorcuLabel.setText(String.format("%.2f TL", getHesapBilgileri().getDogalgazFaturasi()));
        this.internetBorcuLabel.setText(String.format("%.2f TL", getHesapBilgileri().getInternetFaturasi()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return true;
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public FaturaOdemeleri getFaturaOdemeObject() {
        if(this.faturaOdemeObject == null)
        {
            faturaOdemeObject = new FaturaOdemeleri();
        }
        return faturaOdemeObject;
    }
    
    
    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        HesapEkranı hesap = new HesapEkranı();
        dispose();
        hesap.setVisible(true);
    }//GEN-LAST:event_geriIconMouseClicked
    
    // Buton Hover Ayarları 
    
    private void btnElektirikOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElektirikOdeMouseEntered
        ButonAyarları.setBg(btnElektirikOde, Color.magenta);
    }//GEN-LAST:event_btnElektirikOdeMouseEntered

    private void btnElektirikOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElektirikOdeMouseExited
        ButonAyarları.setOriginalBg(btnElektirikOde);
    }//GEN-LAST:event_btnElektirikOdeMouseExited

    private void btnSuOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuOdeMouseEntered
        ButonAyarları.setBg(btnSuOde, Color.magenta);
    }//GEN-LAST:event_btnSuOdeMouseEntered

    private void btnSuOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuOdeMouseExited
        ButonAyarları.setOriginalBg(btnSuOde);
    }//GEN-LAST:event_btnSuOdeMouseExited

    private void btnDogalgazOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDogalgazOdeMouseEntered
        ButonAyarları.setBg(btnDogalgazOde, Color.magenta);
    }//GEN-LAST:event_btnDogalgazOdeMouseEntered

    private void btnDogalgazOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDogalgazOdeMouseExited
        ButonAyarları.setOriginalBg(btnDogalgazOde);
    }//GEN-LAST:event_btnDogalgazOdeMouseExited

    private void btnInternetOdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInternetOdeMouseEntered
        ButonAyarları.setBg(btnInternetOde, Color.magenta);
    }//GEN-LAST:event_btnInternetOdeMouseEntered

    private void btnInternetOdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInternetOdeMouseExited
        ButonAyarları.setOriginalBg(btnInternetOde);
    }//GEN-LAST:event_btnInternetOdeMouseExited
    
    // Buton Action olayları
    
    private void btnElektirikOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElektirikOdeActionPerformed
        double elektirikTutari = Double.parseDouble(this.elektirikBorcuLabel.getText().replace(" TL", "").replace(",", "."));
        if(this.faturaOncedenOdendiMi(elektirikTutari))
        {
            Dialogs.ozelMesajGoster(this, "Elektirik faturası zaten ödenmiş.");
        } else {
            this.faturayiOde("elektirik", elektirikTutari);
        }
    }//GEN-LAST:event_btnElektirikOdeActionPerformed

    private void btnSuOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuOdeActionPerformed
        double suTutari = Double.parseDouble(this.suBorcuLabel.getText().replace(" TL", "").replace(",", "."));
        if(this.faturaOncedenOdendiMi(suTutari))
        {
            Dialogs.ozelMesajGoster(this, "Su faturası zaten ödenmiş.");
        } else {
            this.faturayiOde("su", suTutari);
        }
    }//GEN-LAST:event_btnSuOdeActionPerformed

    private void btnDogalgazOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDogalgazOdeActionPerformed
        double dogalgazTutari = Double.parseDouble(this.dogalgazBorcuLabel.getText().replace(" TL", "").replace(",", "."));
        if(this.faturaOncedenOdendiMi(dogalgazTutari))
        {
            Dialogs.ozelMesajGoster(this, "Doğalgaz faturası zaten ödenmiş.");
        } else {
            this.faturayiOde("dogalgaz", dogalgazTutari);
        }
    }//GEN-LAST:event_btnDogalgazOdeActionPerformed

    private void btnInternetOdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternetOdeActionPerformed
        double internetTutari = Double.parseDouble(this.internetBorcuLabel.getText().replace(" TL", "").replace(",", "."));
        if(this.faturaOncedenOdendiMi(internetTutari))
        {
            Dialogs.ozelMesajGoster(this, "İnternet faturası zaten ödenmiş.");
        } else {
            this.faturayiOde("internet", internetTutari);
        }
    }//GEN-LAST:event_btnInternetOdeActionPerformed

    private boolean faturaOncedenOdendiMi(double odenecekTutar)
    {
        return odenecekTutar == 0.0;
    }
    
    private void faturayiOde(String faturaIsmi, double faturaTutari)
    {
        this.getFaturaOdemeObject().setFaturaIsmi(faturaIsmi);
        this.getFaturaOdemeObject().setFaturaTutari(faturaTutari);
        
        if(getFaturaOdemeObject().faturaOdendiMi())
        {
            Dialogs.ozelMesajGoster(this, "Faturanız başarıyla ödenmiştir.");
            HesapEkranı ekran = new HesapEkranı();
            dispose();
            ekran.setVisible(true);
        } else {
            Dialogs.ozelMesajGoster(this, "Ödeme işlemi gerçekleştirilemedi!");
        }
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
            java.util.logging.Logger.getLogger(OdemeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemeEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KullanıcıAdıLabel;
    private javax.swing.JButton btnDogalgazOde;
    private javax.swing.JButton btnElektirikOde;
    private javax.swing.JButton btnInternetOde;
    private javax.swing.JButton btnSuOde;
    private javax.swing.JLabel dogalgazBorcuLabel;
    private javax.swing.JLabel elektirikBorcuLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel internetBorcuLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel odemelerPanel;
    private javax.swing.JLabel suBorcuLabel;
    // End of variables declaration//GEN-END:variables
}
