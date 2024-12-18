package day02_driverMethodlari_webElementKullanimi;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPractice_2 {
    public static void main(String[] args) throws InterruptedException {

        // Once webdriver'imizi set ediyoruz
        System.setProperty("WebDriver.chrome.driver", "kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        // her islemi max 10sn'lik sürlerde yaparak test edecek
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com/");

        //2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Acilan sayfanin konumu: " + driver.manage().window().getPosition());
        System.out.println("Acilan sayfanin boyutu: " + driver.manage().window().getSize());

        //3. Sayfanin konumunu pixel olarak (50,50)’ye getirin
        driver.manage().window().setPosition(new Point(50, 50));

        //4. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin
        driver.manage().window().setSize(new Dimension(1000, 500));

        //4. Sayfanin istenen konum ve boyuta geldigini test

        // konum icin
        Point expectedSonSayfaKonum = new Point(50, 50);
        Point actualSonSayfaKonum = driver.manage().window().getPosition();
        System.out.println(actualSonSayfaKonum);

        if (actualSonSayfaKonum == expectedSonSayfaKonum) {
            System.out.println("Konum testi PASSSED");
        } else System.out.println("Konum testi PASSSED");

        //boyut icin
        Dimension expectedSonSayfaBoyut = new Dimension(1000, 500);
        Dimension actualSonSayfaBoyut = driver.manage().window().getSize();
        System.out.println(actualSonSayfaBoyut);

        if (actualSonSayfaBoyut == expectedSonSayfaBoyut) {
            System.out.println("Boyut testi PASSSED");
        } else System.out.println("Boyut testi PASSSED");


        //5. Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();

    }
}
