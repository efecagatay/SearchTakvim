import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeacrhForTakvim {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Monster/Desktop/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sosyopix.com/");

        WebElement searchButton = driver.findElement(By.xpath("//a[@class='search search-button']"));

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        searchButton.click();



        WebElement searchElement = driver.findElement(By.id("searchTerms"));

        WebDriverWait wait2 = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(searchElement));

        searchElement.click();

        searchElement.sendKeys("Takvim");

    }

}