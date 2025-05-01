
package gui;


import database.IBilgiController;
import database.transaction.HesapBilgileri;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarları;
import java.awt.Color;


public final class HesapEkranı extends javax.swing.JFrame implements IDuzenleyici, IBilgiController  {

  
    public HesapEkranı() {
        initComponents();
        getEdits();
        System.out.println("Kullanıcı id = " + getHesapBilgileri().getKullaniciId());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        hesapEkraniPanel = new javax.swing.JPanel();
        HosgeldinLabel = new javax.swing.JLabel();
        kullanıcıLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        cüzdanIcon = new javax.swing.JLabel();
        paraCekIcon = new javax.swing.JLabel();
        btnParaCek = new javax.swing.JButton();
        btnParaYatir = new javax.swing.JButton();
        paraYatırIcon = new javax.swing.JLabel();
        btnHavale = new javax.swing.JButton();
        havaleIcon = new javax.swing.JLabel();
        btnÖdemeler = new javax.swing.JButton();
        odemelerIcon = new javax.swing.JLabel();
        geriIcon = new javax.swing.JLabel();
        btnAyarlar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hesap Ekranı");
        setResizable(false);

        hesapEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));

        HosgeldinLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        HosgeldinLabel.setForeground(new java.awt.Color(0, 0, 0));
        HosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HosgeldinLabel.setText("Hoşgeldin");
        HosgeldinLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        kullanıcıLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        kullanıcıLabel.setForeground(new java.awt.Color(0, 0, 0));
        kullanıcıLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullanıcıLabel.setText("[Kullanıcı Adı Soyadı]");

        bakiyeLabel.setFont(new java.awt.Font("SansSerif", 1, 54)); // NOI18N
        bakiyeLabel.setForeground(new java.awt.Color(0, 0, 0));
        bakiyeLabel.setText("[BAKİYE]");

        cüzdanIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/wallet.png"))); // NOI18N

        paraCekIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/para çekme.png"))); // NOI18N

        btnParaCek.setBackground(new java.awt.Color(255, 204, 204));
        btnParaCek.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnParaCek.setText("Para Çek");
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

        btnParaYatir.setBackground(new java.awt.Color(255, 204, 204));
        btnParaYatir.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnParaYatir.setText("Para Yatır");
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

        paraYatırIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/para yatırma.png"))); // NOI18N

        btnHavale.setBackground(new java.awt.Color(255, 204, 204));
        btnHavale.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnHavale.setText("Havale");
        btnHavale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHavale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHavaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHavaleMouseExited(evt);
            }
        });
        btnHavale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHavaleActionPerformed(evt);
            }
        });

        havaleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/cellphone.png"))); // NOI18N

        btnÖdemeler.setBackground(new java.awt.Color(255, 204, 204));
        btnÖdemeler.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnÖdemeler.setText("Ödemeler");
        btnÖdemeler.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnÖdemeler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnÖdemelerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnÖdemelerMouseExited(evt);
            }
        });
        btnÖdemeler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÖdemelerActionPerformed(evt);
            }
        });

        odemelerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/ödemeler.png"))); // NOI18N

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/left-arrow_1.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        btnAyarlar.setBackground(new java.awt.Color(255, 153, 153));
        btnAyarlar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAyarlar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/profile-user.png"))); // NOI18N
        btnAyarlar.setText("Hesap Ayarları");
        btnAyarlar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAyarlar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAyarlarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAyarlarMouseExited(evt);
            }
        });
        btnAyarlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyarlarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hesapEkraniPanelLayout = new javax.swing.GroupLayout(hesapEkraniPanel);
        hesapEkraniPanel.setLayout(hesapEkraniPanelLayout);
        hesapEkraniPanelLayout.setHorizontalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(kullanıcıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(489, 489, 489)
                        .addComponent(cüzdanIcon)
                        .addGap(21, 21, 21)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(paraCekIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(paraYatırIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(havaleIcon)
                        .addGap(130, 130, 130)
                        .addComponent(odemelerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnParaCek)
                        .addGap(141, 141, 141)
                        .addComponent(btnParaYatir)
                        .addGap(141, 141, 141)
                        .addComponent(btnHavale, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnÖdemeler)))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(geriIcon))
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(563, 563, 563)
                        .addComponent(HosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAyarlar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        hesapEkraniPanelLayout.setVerticalGroup(
            hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(HosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAyarlar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(kullanıcıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cüzdanIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hesapEkraniPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(152, 152, 152)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paraCekIcon)
                    .addComponent(paraYatırIcon)
                    .addComponent(havaleIcon)
                    .addComponent(odemelerIcon))
                .addGap(27, 27, 27)
                .addGroup(hesapEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnParaCek, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParaYatir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHavale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnÖdemeler, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Buton renklendirmeleri
    */
    
    private void btnParaCekMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaCekMouseEntered
        ButonAyarları.setBg(btnParaCek, Color.GREEN);
        IconAyarları.changeIcon(paraCekIcon, "lira");
    }//GEN-LAST:event_btnParaCekMouseEntered

    private void btnParaCekMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaCekMouseExited
        ButonAyarları.setOriginalBg(btnParaCek);
        IconAyarları.setOriginalIcon(paraCekIcon);
    }//GEN-LAST:event_btnParaCekMouseExited

    private void btnParaYatirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaYatirMouseEntered
        ButonAyarları.setBg(btnParaYatir, Color.GREEN);
        IconAyarları.changeIcon(paraYatırIcon, "lira");
    }//GEN-LAST:event_btnParaYatirMouseEntered

    private void btnParaYatirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParaYatirMouseExited
        ButonAyarları.setOriginalBg(btnParaYatir);
        IconAyarları.setOriginalIcon(paraYatırIcon);
    }//GEN-LAST:event_btnParaYatirMouseExited

    private void btnHavaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHavaleMouseEntered
        ButonAyarları.setBg(btnHavale, Color.GREEN);
        IconAyarları.changeIcon(havaleIcon, "money");
    }//GEN-LAST:event_btnHavaleMouseEntered

    private void btnHavaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHavaleMouseExited
        ButonAyarları.setOriginalBg(btnHavale);
        IconAyarları.setOriginalIcon(havaleIcon);
    }//GEN-LAST:event_btnHavaleMouseExited

    private void btnÖdemelerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnÖdemelerMouseEntered
        ButonAyarları.setBg(btnÖdemeler, Color.yellow);
        IconAyarları.changeIcon(odemelerIcon, "balance");
    }//GEN-LAST:event_btnÖdemelerMouseEntered

    private void btnÖdemelerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnÖdemelerMouseExited
        ButonAyarları.setOriginalBg(btnÖdemeler);
        IconAyarları.setOriginalIcon(odemelerIcon);
    }//GEN-LAST:event_btnÖdemelerMouseExited
    
    /*
    Buton Olayları
    */
    private void btnParaCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaCekActionPerformed
        ParaCekmeEkranı paracekme = new ParaCekmeEkranı();
        dispose();
        paracekme.setVisible(true);
    }//GEN-LAST:event_btnParaCekActionPerformed

    private void btnParaYatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParaYatirActionPerformed
        ParaYatırmaEkranı parayatır = new ParaYatırmaEkranı();
        dispose();
        parayatır.setVisible(true);
    }//GEN-LAST:event_btnParaYatirActionPerformed

    private void btnHavaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHavaleActionPerformed
        HavaleEkranı havale = new HavaleEkranı();
        dispose();
        havale.setVisible(true);
    }//GEN-LAST:event_btnHavaleActionPerformed

    private void btnÖdemelerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÖdemelerActionPerformed
        OdemeEkranı odeme = new OdemeEkranı();
        dispose();
        odeme.setVisible(true);
    }//GEN-LAST:event_btnÖdemelerActionPerformed

    /*
    Mouse Click olayları
    */
    
    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        String question = "Hesabınızdan çıkış yapılacaktır.\n"
                + "Onaylıyor musunuz?";
        if(Dialogs.onayMesajiGoster(this, question))
        {
            this.cikisYap();
        }
    }//GEN-LAST:event_geriIconMouseClicked

    private void cikisYap()
    {
        getHesapBilgileri().cikisYap();
        GirisEkranı giris = new GirisEkranı();
        dispose();
        giris.setVisible(true);
    }
    
    private void btnAyarlarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyarlarMouseEntered
        ButonAyarları.setBg(btnAyarlar, Color.green);
    }//GEN-LAST:event_btnAyarlarMouseEntered

    private void btnAyarlarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyarlarMouseExited
        ButonAyarları.setOriginalBg(btnAyarlar);
    }//GEN-LAST:event_btnAyarlarMouseExited

    private void btnAyarlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyarlarActionPerformed
        AyarlarEkranı ayarlar = new AyarlarEkranı();
        dispose();
        ayarlar.setVisible(true);
    }//GEN-LAST:event_btnAyarlarActionPerformed

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        hesapEkraniPanel.setFocusable(true);
        this.kullanıcıLabel.setText(getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye() + " ₺"));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
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
            java.util.logging.Logger.getLogger(HesapEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HosgeldinLabel;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton btnAyarlar;
    private javax.swing.JButton btnHavale;
    private javax.swing.JButton btnParaCek;
    private javax.swing.JButton btnParaYatir;
    private javax.swing.JButton btnÖdemeler;
    private javax.swing.JLabel cüzdanIcon;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel havaleIcon;
    private javax.swing.JPanel hesapEkraniPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kullanıcıLabel;
    private javax.swing.JLabel odemelerIcon;
    private javax.swing.JLabel paraCekIcon;
    private javax.swing.JLabel paraYatırIcon;
    // End of variables declaration//GEN-END:variables
}
