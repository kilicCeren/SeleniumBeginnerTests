package day02_driverMethodlari_webElementKullanimi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_WebElementKullanma {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazip aratin

        // Kodlarimiz ile reel browser'daki bir webelement'i kullanabilmek icin
        // once o webelementi kodlarimizla tanimlayip
        // bir obje olarak class'da kaydetmeliyiz

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone");

        aramaKutusu.submit();

        // arama sonucunda urun bulunabildigini test edin

        // arama sonuc yazisini locate edip
        // oradaki yazinin icinde bulunan sayinin
        // 0'dan buyuk oldugunu test edelim

        WebElement aramaSonucYaziElementi = driver.findElement(By.className("product-count-text"));

        System.out.println(aramaSonucYaziElementi);
        // [[ChromeDriver: chrome on mac (5f242332f6a62f061e7a000f6e5c05a3)] -> class name: product-count-text]

        System.out.println(aramaSonucYaziElementi.getText()); // 4 Products Found

        String sonucSayisiStr = aramaSonucYaziElementi.getText().replaceAll("\\D", "");

        System.out.println(sonucSayisiStr); // "4"

        int sonucSayisi = Integer.parseInt(sonucSayisiStr); // 4


        if (sonucSayisi > 0) {
            System.out.println("Arama testi PASSED");
        } else System.out.println("Arama testi FAILED");


        // sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
