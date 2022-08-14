package autoapp.automation.pages;

import autoapp.automation.utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HomePage extends BasePage{


    public HomePage(BrowserDriver driver) {
        super(driver);
    }

    public static void hoverClickMegaMenu(String menu, String subMenu) throws InterruptedException {
        List<WebElement> menuElements = driver.findElements(By.cssSelector("#block_top_menu .sf-menu li a[title='"+ menu + "']"));
        WebElement menuElement = menuElements.get(1);
        Actions actions = new Actions(driver);
        actions.moveToElement(menuElement).perform();
        Thread.sleep(2000);
        WebElement subMenuElement = driver.findElements(By.cssSelector("#block_top_menu .sf-menu li a[title='" + subMenu + "']")).get(1);
        actions.click(subMenuElement).build().perform();
    }
    public static void validatePageTitle(String title){
        assert driver.getTitle().contains(title);
    }
}
