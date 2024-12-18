package day02_driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPractice_4 {
    public static void main(String[] args) {

        //1. Yeni bir class olusturun (TekrarTesti) //gerekli ayarlamalar yapalım
        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //2. Youtube web sayfasına gidin
        // ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com/");

        String expectedYoutubeTitleIcerik = "youtube";
        String actualYoutubeTitle = driver.getTitle();
        if (actualYoutubeTitle.contains(expectedYoutubeTitleIcerik)) {
            System.out.println("Youtube title testi PASSED");
        } else {
            System.out.println("Youtube title testi FAILED");
            System.out.println("Youtube Title: " + actualYoutubeTitle);
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın,
        // içermiyorsa doğru URL'yi yazdırın.
        String expectedYoutubeUrlIcerik = "youtube";
        String actualYoutubeUrl = driver.getCurrentUrl();
        if (actualYoutubeUrl.contains(expectedYoutubeUrlIcerik)) {
            System.out.println("Youtube Url testi PASSED");
        } else {
            System.out.println("Youtube Url testi FAILED");
            System.out.println("Youtube Url: " + actualYoutubeUrl);
        }
        //4. Daha sonra testotomasyonu sayfasina gidin https://www.testotomasyonu.com/
        driver.navigate().to("https://www.testotomasyonu.com/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Testotomasyonu sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Test" içerip içermediğini (contains) test edin,
        // Yoksa doğru başlığı(Actual Title) yazdırın.

        String expectedTestOtomasyonuTitleIcerik = "Test";
        String actualTestOtomasyonuTitle = driver.getTitle();
        if (actualTestOtomasyonuTitle.contains(expectedTestOtomasyonuTitleIcerik)) {
            System.out.println("Test Otomasyonu title testi PASSED");
        } else {
            System.out.println("Test Otomasyonu title testi FAILED");
            System.out.println("Test Otomasyonu Title: " + actualTestOtomasyonuTitle);
        }

        //10.Sayfa URL'sinin https://www.testotomasyonu.com/ olup olmadığını test edin,
        // degilse doğru URL'yi yazdırın
        String expectedTestOtomasyonuUrlIcerik = "https://www.testotomasyonu.com/";
        String actualTestOtomasyonuUrl = driver.getCurrentUrl();
        if (actualTestOtomasyonuUrl.contains(expectedTestOtomasyonuUrlIcerik)) {
            System.out.println("Test Otomasyonu Url testi PASSED");
        } else {
            System.out.println("Test Otomasyonu Url testi FAILED");
            System.out.println("Test Otomasyonu Url: " + actualTestOtomasyonuTitle);
        }

        //11.Sayfayi kapatin
        driver.quit();

    }
}
