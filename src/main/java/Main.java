import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DashboardPage;
import pages.LoginPage;

import java.io.File;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = initChromeDriver();
        webDriver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login();

        DashboardPage dashboardPage = new DashboardPage(webDriver);
        dashboardPage.action();

        webDriver.quit();
    }

    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver",
                new File(Main.class.getResource("/chromedriver.exe").getFile()).getPath());
        return new ChromeDriver();
    }
}
