
package gui;

import database.IBilgiController;
import database.transaction.HesapBilgileri;
import database.transaction.SifreYenileme;
import gui.ayarlar.ButonAyarları;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public final class SifreYenilemeEkranı extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    private SifreYenileme sifreYenilemeObject = null;
    
    
    public SifreYenilemeEkranı() {
        initComponents();
        getEdits();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifrePanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        telNoText = new javax.swing.JTextField();
        telNoLabel = new javax.swing.JLabel();
        soruLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        eskiSifreLabel = new javax.swing.JLabel();
        yeniSifreLabel = new javax.swing.JLabel();
        sifreTekrarLabel = new javax.swing.JLabel();
        eskiSifreText = new javax.swing.JPasswordField();
        yeniTekrarText = new javax.swing.JPasswordField();
        yeniSifreText = new javax.swing.JPasswordField();
        btnSifreYenile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Şifre Yenileme Ekranı");
        setResizable(false);

        sifrePanel.setBackground(new java.awt.Color(204, 255, 204));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/left-arrow_1.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Şifre Yenileme");

        tcNoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("TC Kimlik Numarası :");

        tcNoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        telNoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        telNoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Telefon Numarası :");

        soruLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        soruLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soruLabel.setText("Güvenlik Sorusu Cevabı :");

        guvenlikCevapText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        eskiSifreLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eskiSifreLabel.setText("Eski Şifre :");

        yeniSifreLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreLabel.setText("Yeni Şifre :");

        sifreTekrarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreTekrarLabel.setText("Yeni Şifre Tekrar :");

        eskiSifreText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        yeniTekrarText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        yeniSifreText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnSifreYenile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSifreYenile.setText("Şifre Yenile");
        btnSifreYenile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSifreYenile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSifreYenileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSifreYenileMouseExited(evt);
            }
        });
        btnSifreYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSifreYenileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sifrePanelLayout = new javax.swing.GroupLayout(sifrePanel);
        sifrePanel.setLayout(sifrePanelLayout);
        sifrePanelLayout.setHorizontalGroup(
            sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifrePanelLayout.createSequentialGroup()
                .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sifrePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon))
                    .addGroup(sifrePanelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifrePanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifrePanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sifrePanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSifreYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sifrePanelLayout.createSequentialGroup()
                                .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soruLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yeniTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        sifrePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tcNoLabel, tcNoText});

        sifrePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {telNoLabel, telNoText});

        sifrePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eskiSifreText, guvenlikCevapText, soruLabel, yeniSifreText, yeniTekrarText});

        sifrePanelLayout.setVerticalGroup(
            sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soruLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(sifrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnSifreYenile, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        sifrePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tcNoLabel, tcNoText});

        sifrePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {telNoLabel, telNoText});

        sifrePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eskiSifreText, guvenlikCevapText, soruLabel, yeniSifreText, yeniTekrarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifrePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        sifrePanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setMaximumLimit(telNoText, 11);
        TextAyarlari.setMaximumLimit(tcNoText, 11);
        if(getHesapBilgileri().getKullaniciId() == 0) // Eğer kullanıcı hesabında değilse false dönder.
        {
            this.eskiSifreText.setEnabled(false);
        }
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return TextAyarlari.textAlanlariDolumu(sifrePanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public SifreYenileme getSifreYenilemeObject() {
        if(this.sifreYenilemeObject == null)
        {
            sifreYenilemeObject = new SifreYenileme();
        }
        return sifreYenilemeObject;
    }

    public JPasswordField getEskiSifreText() {
        return eskiSifreText;
    }

    private boolean isEnabledEskiSifreText()
    {
        return this.getEskiSifreText().isEnabled();
    }
    
    
    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        if(isEnabledEskiSifreText())
        {
            AyarlarEkranı ayarlar = new AyarlarEkranı();
            dispose();
            ayarlar.setVisible(true);
        }
        else 
        {
            GirisEkranı giris = new GirisEkranı();
            dispose();
            giris.setVisible(true);
        }
    }//GEN-LAST:event_geriIconMouseClicked

    private void btnSifreYenileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSifreYenileMouseEntered
        ButonAyarları.setBg(btnSifreYenile, Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnSifreYenileMouseEntered

    private void btnSifreYenileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSifreYenileMouseExited
        ButonAyarları.setOriginalBg(btnSifreYenile);
    }//GEN-LAST:event_btnSifreYenileMouseExited

    private void btnSifreYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSifreYenileActionPerformed
        if(this.bilgilerGecerliMi())
        {
            this.sifreyiYenile();
        } else {
            Dialogs.bosOlamazMesajıGoster(this);
        }
    }//GEN-LAST:event_btnSifreYenileActionPerformed

    private void sifreyiYenile()
    {
        String yeniSifre = String.valueOf(this.yeniSifreText.getPassword());
        String yeniSifreTekrar = String.valueOf(this.yeniTekrarText.getPassword());
        
        if(yeniSifre.equals(yeniSifreTekrar))
        {
            this.sifreyiOnayla();
        }
        else 
        {
            Dialogs.ozelMesajGoster(this, "Şifreler uyuşmuyor girdiğiniz parametreleri kontrol ediniz.");
        }
    }
    
    private void sifreyiOnayla()
    {
        this.getSifreYenilemeObject().setTcNo(this.tcNoText.getText());
        this.getSifreYenilemeObject().setTelNo(this.telNoText.getText());
        this.getSifreYenilemeObject().setGuvenlikCevap(this.guvenlikCevapText.getText());
        if(this.isEnabledEskiSifreText())
        {
            this.getSifreYenilemeObject().setEskiSifre(String.valueOf(this.eskiSifreText.getPassword()));
        }
        getSifreYenilemeObject().setYeniSifre(String.valueOf(this.yeniSifreText.getPassword()));
        
        if(this.getSifreYenilemeObject().sifreYenilendiMi())
        {
            Dialogs.ozelMesajGoster(this, "Şifreniz başarıyla yenilendi.\n"
                    + "Yeni Şifreniz : " + this.yeniSifreText.getPassword());
            if(this.isEnabledEskiSifreText())
            {
                HesapEkranı hesap = new HesapEkranı();
                dispose();
                hesap.setVisible(true);
            } else {
                GirisEkranı giris = new GirisEkranı();
                dispose();
                giris.setVisible(true);
            }
        } else {
            Dialogs.ozelMesajGoster(this, "Şifreniz yenilenemedi.\n"
                    + "Lütfen bilgilerinizi kontrol edin.");
        }
        
        
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
            java.util.logging.Logger.getLogger(SifreYenilemeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSifreYenile;
    private javax.swing.JLabel eskiSifreLabel;
    private javax.swing.JPasswordField eskiSifreText;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel sifrePanel;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JLabel soruLabel;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JTextField telNoText;
    private javax.swing.JLabel yeniSifreLabel;
    private javax.swing.JPasswordField yeniSifreText;
    private javax.swing.JPasswordField yeniTekrarText;
    // End of variables declaration//GEN-END:variables

    Object geteskiSifreText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
