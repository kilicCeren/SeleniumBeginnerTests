package day03_locatorsday;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ByClassName {

    public static void main(String[] args) throws InterruptedException {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // bu sure tum islemler icin ayri ayri gecerlidir
        // sayfanin bulunmasi ve her bir webelementin locate etmesi icin
        // buraya yazilan 10 saniye boyunca bekler

        //2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");

        //3- arama kutusuna phone yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone" + Keys.ENTER);
        // aramaKutusu.submit();

        //4- Category bolumunde 8 element oldugunu test edin

        List<WebElement> categoryElementleriList = driver.findElements(By.className("panel-list"));

        int expectedCategorySayisi = 8;
        int actualCategorySayisi = categoryElementleriList.size();

        if (expectedCategorySayisi == actualCategorySayisi) {
            System.out.println("Category sayisi testi PASSED");
        } else {
            System.out.println("Category sayisi testi FAILED");

        }

        //5- Category isimlerini yazdirin
        // System.out.println(categoryElementleriList); // bize referans degerlerini yazdirir

        // Listede Webelement'ler oldugu icin direkt yazdiramiyoruz
        // Eger listedeki herbir elementi ele alirsak, uzerindeki text'i yazdirabiliriz

        for (WebElement eachElement : categoryElementleriList) {
            System.out.println(eachElement.getText());
        }


        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();

    }
}
