package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    WebDriver webDriver;

    public DashboardPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void action() throws InterruptedException {
        WebElement buttonUser = webDriver.findElement(By.cssSelector(".employee_avatar_small"));
        buttonUser.click();
        Thread.sleep(1000);
        WebElement buttonExit = webDriver.findElement(By.id("header_logout"));
        buttonExit.click();
        Thread.sleep(5000);
    }
}
