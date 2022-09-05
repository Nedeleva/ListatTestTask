package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.main.MainPage;
import properties.Drivers;

public class MainTest {
    @Test
    public void verifyCity() {
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        MainPage mainPage = new MainPage(driver);
        mainPage
                .openMainPage()
                .chooseCity()
                .selectDate()
                .clickSearchButton()
                .verifyLocation();
        driver.quit();
    }

    @Test
    public void verifyDate() {
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        MainPage mainPage = new MainPage(driver);
        mainPage
                .openMainPage()
                .chooseCity()
                .selectDate()
                .clickSearchButton()
                .verifyDate();
        driver.quit();
    }

    @Test
    public void verifySetBudgetButton() {
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        MainPage mainPage = new MainPage(driver);
        mainPage
                .openMainPage()
                .chooseCity()
                .selectDate()
                .clickSearchButton()
                .setBudget();
        driver.quit();
    }
}