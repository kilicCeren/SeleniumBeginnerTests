package day01_WebDriverKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {

    public static void main(String[] args) throws InterruptedException {
        // Bir test'e baslamadan once MUTLAKA
        // bir WebDriver edinmeliyiz

        // EN ILKEL haliyle WebDriver edinmek icin
        // Java'dan yardim alacagiz

        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");


        Thread.sleep(3000);

        driver.quit();
    }
}
