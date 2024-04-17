package com.newddsdiscounts.pages;

import com.newddsdiscounts.driver.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.newddsdiscounts.constants.FrameworkConstants.getUrl;
import static com.newddsdiscounts.utils.JSUtils.scrollIntoViewJS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class FoundInStorePage extends BasePage {

    public FoundInStorePage(WebDriver driver) {
        super(driver);
    }


    public FoundInStorePage clickFoundInStoreLinkAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user navigate to Found In Store page");

        navigateTo_URL(getUrl());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#menu-item-20")).click();
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.ddsdiscounts.com/found-in-store/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Found In Store"));

        return this;

        }
}