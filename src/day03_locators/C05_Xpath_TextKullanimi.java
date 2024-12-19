package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Xpath_TextKullanimi {

    public static void main(String[] args) throws InterruptedException {
        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");

        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[.='Add']"))
                .click();
        Thread.sleep(2000);

        //3- Remove butonu’nun gorunur oldugunu test edin
        WebElement removeButonu = driver.findElement(By.xpath("//button[text()='Remove']"));

        if (removeButonu.isDisplayed()){
            System.out.println("Remove butonu testi PASSED");
        }else System.out.println("Remove butonu testi FAILED");

        //4- Remove tusuna basin

        removeButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h2[.='Add/Remove Elements']"));

        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("Add Remove Yazisi gorunme testi PASSED");
        }else System.out.println("Add Remove Yazisi gorunme testi FAILED");

        //6- Sayfayi kapatin
        Thread.sleep(2000);
        driver.quit();
    }
}
