package day02_driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPractice_3 {
    public static void main(String[] args) {

        //1.Yeni bir class olusturalim (Homework)
        //Oncelikle  gerekli ayarlarimizi yapiyoruz.
        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2.ChromeDriver kullanarak, facebook sayfasina gidin
        // Ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
        // degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com/");

        String expectedTitleIcerik = "facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("Facebbok Title testi PASSED");
        } else {
            System.out.println("Facebbok Title testi FAILED");
            System.out.println("Facebook Title: " + actualTitle);
        }


        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin,
        // icermiyorsa“actual” URL’i yazdirin.
        String expectedUrlIcerik = "facebook";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrlIcerik)) {
            System.out.println("Facebook Url testi PASSED");
        } else {
            System.out.println("Facebook Url testi FAILED");
            System.out.println("Facebook Url: " + actualUrl);
        }

        //4.https://www.walmart.com/
        driver.get("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitleIcerikWalmart = "Walmart.com";
        String actualTitleWalmart = driver.getTitle();

        if (actualTitleWalmart.contains(expectedTitleIcerikWalmart)) {
            System.out.println("Walmart title testi PASSED");
        } else {
            System.out.println("Walmart title testi FAILED");
            System.out.println("Walmart Title: " + actualTitleWalmart);
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //9.Browser’i kapatin
        driver.quit();
    }
}
