# 🏦 BankApp

> **BankaApp** ile dijital bankacılığın tüm temel adımları: kayıt, giriş, şifre sıfırlama, bakiye görüntüleme, para çekme/yatırma, havale ve fatura ödemeleri.  
> Java Swing & JDBC temelli, kullanıcı dostu bir masaüstü bankacılık simülasyonu.

---

## 🚀 Özellikler

- **Kayıt Ol**  
  - Ad Soyad, TC No, Telefon  
  - Güvenlik sorusu/cevabı ile ekstra doğrulama  
- **Giriş Ekranı**  
  - TC Kimlik No / Müşteri No + Şifre  
  - “Şifremi Unuttum” ile **Şifre Yenileme** akışı  
- **Şifre Yenileme**  
  - TC, Telefon, Güvenlik sorusu & eski şifre onayı  
- **Hesap Ana Sayfası**  
  - Güncel bakiye görüntüleme  
  - “Hesap Ayarları” ile telefon & şifre güncelleme  
- **Para Çekme / Yatırma**  
  - Tek seferde 5.000₺ (çekme) / 40.000₺ (yatırma) limiti  
  - Toplam bakiyeyi anlık güncelleme  
- **Havale**  
  - Tek seferde 20.000₺ ve altında gönderim  
  - Müşteri No ile havale alıcı seçimi  
- **Ödemeler**  
  - Elektrik, Su, Doğalgaz, İnternet faturası borç ve ödeme butonları

## ⚙️ Kurulum & Çalıştırma

1. **Depoyu klonla**  
   ```bash
   git clone https://github.com/kullaniciadi/BankaApp.git
   cd BankaApp
