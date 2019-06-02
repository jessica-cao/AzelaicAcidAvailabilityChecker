package azelaic;


import org.openqa.selenium.By;

public class Locators {
    //WebDriver driver = new ChromeDriver();
    
    
    public static By azelaicAcidImage = By.xpath("//img[contains(@src,'../images/products/rdn-azelaic-acid-suspension-10pct-30ml.png?ver=16')]");
    public static By pycnogenol = By.xpath("//*[@id='CategoryList_ProductsList_0']/li[3]/a");
    public static By shippingNotAvailableMsg = By.xpath("//*[@id='ContentPlaceHolder1_ProductView_PayWidgetV2_ButtonPanel']");
}