# 🏦 BankaApp

> **BankaApp** ile dijital bankacılığın tüm temel adımlarını öğrenin: kayıt, giriş, şifre sıfırlama, bakiye görüntüleme, para çekme/yatırma, havale ve fatura ödemeleri.  
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
- **Responsive Renk Temaları**  
  - Her modül kendi arka plan rengini seçiyor:  
    - Giriş & Şifre Yenileme: nane yeşili  
    - Kayıt: pastel sarı  
    - Para çekme: soluk krem  
    - Para yatırma: turuncu  
    - Havale: mor  
    - Fatura ödemeler: su mavisi  
    - Ayarlar: limon sarısı  

---

## 📸 Ekran Görüntüleri

<div align="center">
  <img src="screenshots/login.png"   alt="Giriş Ekranı"       width="300"/>
  <img src="screenshots/reset.png"   alt="Şifre Yenileme"      width="300"/>
  <img src="screenshots/register.png"alt="Kayıt Ol Ekranı"     width="300"/>
  <img src="screenshots/home.png"    alt="Hesap Ana Sayfa"     width="300"/>
  <img src="screenshots/withdraw.png"alt="Para Çekme"          width="300"/>
  <img src="screenshots/deposit.png" alt="Para Yatırma"        width="300"/>
  <img src="screenshots/transfer.png"alt="Havale"              width="300"/>
  <img src="screenshots/payments.png"alt="Fatura Ödemeleri"    width="300"/>
  <img src="screenshots/settings.png"alt="Hesap Ayarları"      width="300"/>
</div>

> *“Şifremi Unuttum” butonuna basınca doğrudan Şifre Yenileme ekranına yönlendirileceğini unutma.*

---

## ⚙️ Kurulum & Çalıştırma

1. **Depoyu klonla**  
   ```bash
   git clone https://github.com/kullaniciadi/BankaApp.git
   cd BankaApp
