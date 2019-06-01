package azelaic;

import java.io.IOException;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * Hello acid
 */
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--incognito");
        options.addArguments("--no-sandbox");
        
        // Instantiate driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://theordinary.com/product/rdn-azelaic-acid-suspension-10pct-30ml");

        try {
            //TODO

        } catch (TimeoutException timeOut) {
            System.out.println("The webpage took too long to load");

        }

    }
}
