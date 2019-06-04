package azelaic;

import java.io.IOException;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello acid
 */
public class PriceChecker {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--incognito");
        options.addArguments("--sandbox");

        // Instantiate driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://theordinary.com/product/rdn-azelaic-acid-suspension-10pct-30ml?");

        try {
            Thread.sleep(2000);
            driver.findElement(Locators.azelaicAcidImage);
            System.out.println("The page has finished loading"); // Excellent

        } catch (TimeoutException timeOut) {
            System.out.println("The webpage took too long to load");

        }

        driver.findElement(Locators.pycnogenol).click();
        Thread.sleep(2000);

        try {
            String pycnoPrice = driver.findElement(Locators.pycnogenolPrice).getText();
            // Getting the price of the goodie in double 
            double price = Double.parseDouble(pycnoPrice.substring(0, 4));
            System.out.println(price);

            // Check if the price is under a certain threshhold

            if (price <= 9.0) {
                // Notif that the price has changed
            } else {
                // Notif that the price hasn't changed
            }

        } catch (Exception e) {
            System.out.println(e);

        }


        driver.close();
        driver.quit();



    }
}
