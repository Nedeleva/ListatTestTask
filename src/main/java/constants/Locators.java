package constants;

public class Locators {
    public interface MainPage {
        String SEARCH_FIELD = "//input[@type='search']",
                CITY_XPATH = "//span[@class='search_hl_name' and contains(text(),'New York')]",
                SELECT_NEXT = "//div[@class='bui-calendar__control bui-calendar__control--next']",
                DECEMBER = "//div[@class='bui-calendar__month' and contains(text(),'December')]",
                FIRST_DATE = "//td[@data-date='2022-12-01']",
                LAST_DATE = "//td[@data-date='2022-12-31']",
                SEARCH_BUTTON = "//button[@class='sb-searchbox__button ']",
                RESULT_LIST = "//h2[@class='e6e585da68']",
                SEARCH_INFO = "//div[@data-testid='searchbox-layout-vertical']",
                SET_BUDGET_BUTTON = "//span[@class='f89122bbdb']",
                MOVE_BUTTON = "//div[@style='left: 100%;']";
    }
}
