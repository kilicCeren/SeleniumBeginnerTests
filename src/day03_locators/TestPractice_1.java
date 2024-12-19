package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TestPractice_1 {
    public static void main(String[] args) throws InterruptedException {
        //Gerekli ayarlamaları yap
        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 1- https://www.testotomasyonu.com/ sayfasına gidin.
        driver.get("https://www.testotomasyonu.com/");

        // 2- Arama kutusuna “dress” yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("dress" + Keys.ENTER);

        // 3- Görüntülenen sonuçların sayısını yazdırın

        List<WebElement> bulunanUrunElementiListesi=driver.findElements(By.xpath("//*[@*='prod-img']"));
        System.out.println(bulunanUrunElementiListesi.size());

        // 4- Listeden ilk urunun resmine tıklayın.
        driver.findElement(By.xpath("(//*[@*='prod-img'])[1]"))
                .click();
        // 5- Urun detayinda dress kelimesi geçtiğini test edin.
        WebElement urunDetayi = driver.findElement(By.xpath("//*[@*='product-short-desc  my-2']"));

        String expectedUrunDetayiIcerik ="dress";
        String actualUrunDetayi = urunDetayi.getText();

        if (actualUrunDetayi.contains(expectedUrunDetayiIcerik)){
            System.out.println("Urun Detayi icerik Testi PASSED");
        }else{
            System.out.println("Urun Detayi icerik Testi FAILED");
        }

        //6- Sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();

    }
}
