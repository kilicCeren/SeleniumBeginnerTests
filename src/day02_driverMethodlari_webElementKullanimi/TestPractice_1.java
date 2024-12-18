package day02_driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPractice_1 {
    public static void main(String[] args) throws InterruptedException {

        // ilkel olarak webdriver'i set ettik.
        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com/");

        //2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu: " + driver.manage().window().getSize());

        // 3. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //4. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000); // 3 saniye bekle
        driver.manage().window().maximize();

        // 5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Maximize Sayfanin konumu: " + driver.manage().window().getPosition());
        System.out.println("Maximize Sayfanin boyutu: " + driver.manage().window().getSize());

        //6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        // 7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Fullscreen Sayfanin konumu: " + driver.manage().window().getPosition());
        System.out.println("Fullscreen Sayfanin boyutu: " + driver.manage().window().getSize());

        //8. Sayfayi kapatin
        driver.quit();
    }
}
