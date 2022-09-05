package pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;

import static constants.Constants.*;
import static constants.Locators.MainPage.*;

public class MainPage extends BasePage {
    @FindBy(xpath = SEARCH_FIELD)
    private WebElement searchField;
    @FindBy(xpath = CITY_XPATH)
    private WebElement city;
    @FindBy(xpath = SELECT_NEXT)
    private WebElement selectNext;
    @FindBy(xpath = DECEMBER)
    private WebElement december;
    @FindBy(xpath = FIRST_DATE)
    private WebElement firstDate;
    @FindBy(xpath = LAST_DATE)
    private WebElement lastDate;
    @FindBy(xpath = SEARCH_BUTTON)
    private WebElement searchButton;
    @FindBy(xpath = RESULT_LIST)
    private WebElement resultList;
    @FindBy(xpath = SEARCH_INFO)
    private WebElement searchInfo;
    @FindBy(xpath = SET_BUDGET_BUTTON)
    private WebElement budgetButton;
    @FindBy(xpath = MOVE_BUTTON)
    private WebElement moveButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openMainPage() {
        openURL(CITE_URL);
        return this;
    }

    public MainPage chooseCity() {
        fillField(searchField, CITY);
        clickOn(city);
        return this;
    }

    public MainPage selectDate() {
        clickOn(selectNext);
        clickOn(selectNext);
        clickOn(firstDate);
        clickOn(lastDate);
        return this;
    }

    public MainPage clickSearchButton(){
        clickOn(searchButton);
        return this;
    }

    public MainPage verifyLocation() {
        Assert.assertTrue(resultList.getText().contains(CITY));
        return this;
    }

    public MainPage verifyDate() {
        Assert.assertTrue(searchInfo.getText().contains(CHECK_IN_DATE));
        Assert.assertTrue(searchInfo.getText().contains(CHECK_OUT_DATE));
        return this;
    }

    public MainPage setBudget(){
        clickOn(budgetButton);
        Actions actions = new Actions(driver);
        actions
                .clickAndHold(moveButton)
                .moveByOffset(-20,0)
                .release()
                .perform();
        return this;
    }
}
