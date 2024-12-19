package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class TestPractice_2 {
    public static void main(String[] args) throws InterruptedException {

        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("WebDriver.chrome.driver", "kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // 2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        // 3- Category bolumundeki elementleri locate edin
        WebElement womenElementi = driver.findElement(By.xpath("(//*[@*='panel-title'])[1]"));
        WebElement menElementi = driver.findElement(By.xpath("(//*[@*='panel-title'])[2]"));
        WebElement kidsElementi = driver.findElement(By.xpath("(//*[@*='panel-title'])[3]"));


        // 4- Category bolumunde 3 element oldugunu test edin
        List<WebElement> categoryElementListesi = driver.findElements(By.xpath("//*[@*='panel-title']"));
        int actualElementSayisi = categoryElementListesi.size();
        System.out.println(actualElementSayisi);
        int expectedElementSayisi = 3;

        if (actualElementSayisi == expectedElementSayisi) {
            System.out.println("Category Element Sayisi Testi PASSED");
        } else System.out.println("Category Element Sayisi Testi FAILED");


        // 5- Category isimlerini yazdirin
        for (WebElement eachElement : categoryElementListesi) {
            System.out.println(eachElement.getText());
        }

        // 6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();

    }
}
