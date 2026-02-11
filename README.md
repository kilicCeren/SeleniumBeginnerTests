# 🌐 SeleniumBeginnerTests

Bu repository, **Java** dili kullanılarak geliştirilmiş, **Selenium WebDriver** kullanımı üzerine odaklanan **başlangıç seviyesi (beginner)** otomasyon test örneklerini içermektedir. Proje, herhangi bir test framework’ü (**JUnit, TestNG, Maven vb.**) kullanılmadan, doğrudan **Java + Selenium** mantığını öğretmeyi amaçlayan örneklerden oluşur.

Testler, Selenium’un temel kavramlarını adım adım öğrenmeye yönelik olacak şekilde paketlenmiş ve sınıflandırılmıştır.

---

## 🎯 Projenin Amacı

- Selenium WebDriver’ın **temel kullanımını** öğrenmek  
- Java ile tarayıcı otomasyonu mantığını kavramak  
- Web elementleri ile etkileşim kurmayı öğretmek  
- Locator stratejilerini uygulamalı göstermek  
- Test otomasyonuna yeni başlayanlar için sade ve anlaşılır örnekler sunmak  

---

## 🛠️ Kullanılan Teknolojiler ve Araçlar

| Teknoloji | Açıklama |
|----------|----------|
| **Java** | Otomasyon test dili |
| **Selenium WebDriver** | Web tarayıcı otomasyonu |
| **ChromeDriver** | Google Chrome için WebDriver |
| **IntelliJ IDEA** | Geliştirme ortamı (IDE) |

> ⚠️ Bu projede **Maven, JUnit veya TestNG kullanılmamaktadır.**  
> Testler `main` metodu üzerinden, doğrudan Java sınıfları çalıştırılarak yürütülür.

---

## 📁 Proje Yapısı

```SeleniumBeginnerTests/
├── .idea/ # IntelliJ IDEA proje ayarları
├── kurulumDosyalari/ # Gerekli kurulum dosyaları
│ ├── selenium-java-4.26.0/ # Selenium kütüphaneleri
│ └── chromedriver.exe # ChromeDriver
├── src/
│ ├── day01_WebDriverKullanma/ # WebDriver temel kullanımı
│ │ ├── C01_IlkOtomasyon.java
│ │ └── C02_WebDriverMethodlari.java
│ ├── day02_driverMethodlari_web/ # Driver ve navigasyon metodları
│ │ ├── C01_IlkTestOtomasyonu.java
│ │ ├── C02_DriverNavigateMethodlari.java
│ │ ├── C03_DriverManageMethodlari.java
│ │ ├── C04_DriverManageMethodlari.java
│ │ ├── C05_WebElementKullanimi.java
│ │ └── C06_ByClassname.java
│ ├── day03_locators/ # Locator kullanımları
│ │ ├── C01_ByClassName.java
│ │ ├── C02_Locators.java
│ │ ├── C03_ByLinkText.java
│ │ ├── C04_Xpath.java
│ │ ├── C05_Xpath_TextKullanimi.java
│ │ └── C06_Locators.java
│ ├── day04_relativeLocators/ # Relative Locator örnekleri
│ │ └── C01_RelativeLocators.java
│ ├── TestPractice_1.java
│ ├── TestPractice_2.java
│ ├── TestPractice_3.java
│ └── TestPractice_4.java
├── .gitignore
└── SeleniumBeginnerTests.iml
```

---

## 🧪 Test Yapısı ve Mantığı

- Her sınıf **bağımsızdır** ve kendi `main` metoduna sahiptir  
- Testler doğrudan çalıştırılarak sonuç gözlemlenir  
- Selenium WebDriver kullanılarak:
  - Tarayıcı açma
  - URL'e gitme
  - Element bulma
  - Tıklama
  - Yazı gönderme
  - Sayfa bilgilerini alma  
  gibi temel işlemler uygulanır

Bu yapı, test framework karmaşasına girmeden Selenium mantığını öğrenmeyi hedefler.

---
