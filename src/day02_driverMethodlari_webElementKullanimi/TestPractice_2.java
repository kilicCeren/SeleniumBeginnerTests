package day02_driverMethodlari_webElementKullanimi;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestPractice_2 {
    public static void main(String[] args) throws InterruptedException {
        //1. https://www.testotomasyonu.com/ sayfasina gidin
        System.setProperty("WebDriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Acilan sayfanin konumu: " + driver.manage().window().getPosition());
        System.out.println("Acilan sayfanin boyutu: " + driver.manage().window().getSize());


        //3. Sayfanin konumunu pixel olarak (50,50)’ye getirin
        driver.manage().window().setPosition(new Point(50,50));


        //4. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin
        driver.manage().window().setSize(new Dimension(1000,500));


        //4. Sayfanin istenen konum ve boyuta geldigini test edin
        Point actualSonSayfaKonum =  driver.manage().window().getPosition();
        System.out.println(actualSonSayfaKonum);
        Point expectedSonSayfaKonum =  new Point(50,50);


        Dimension actualSonSayfaBoyut = driver.manage().window().getSize();
        System.out.println(actualSonSayfaBoyut);
        Dimension expectedSonSayfaBoyut = new Dimension(1000,500);


        if (actualSonSayfaKonum.equals(expectedSonSayfaKonum)) {
            System.out.println("Konum testi PASSED");
        } else System.out.println("Konum testi FAILED");

        if (actualSonSayfaBoyut.equals(expectedSonSayfaBoyut)) {
            System.out.println("Boyut testi PASSED");
        } else System.out.println("Boyut testi FAILED");


        //5. Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();

    }
}
