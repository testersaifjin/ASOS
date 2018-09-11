package com.ASOS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends DriverManager {

    public HomePage()
    {

        PageFactory.initElements(driver, this);
    }

//    @FindBy (id = "small-searchterms")
    @FindBy(how = How.ID, using = "small-searchterms")
    private WebElement searchBox;
    @FindBy (xpath = "//input[@type='submit']")
    private WebElement searchBtn;

    public void navigateToNopCommercePage(){

        driver.get(url);
    }


    public void goToSearch(String searchInput)
    {
        searchBox.sendKeys(searchInput);
        searchBtn.click();

    }
}
