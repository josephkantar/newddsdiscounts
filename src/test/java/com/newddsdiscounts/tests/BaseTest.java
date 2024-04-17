package com.newddsdiscounts.tests;

import com.newddsdiscounts.driver.DriverManager;

import com.newddsdiscounts.pages.ContactUsPageForm;
import com.newddsdiscounts.pages.FoundInStorePage;
import com.newddsdiscounts.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import static com.newddsdiscounts.driver.Driver.initDriver;
import static com.newddsdiscounts.driver.Driver.quitDriver;

public class BaseTest {

   HomePage homePage;
   ContactUsPageForm contactUsPageForm;
   FoundInStorePage foundInStorePage;

    @BeforeMethod

    public void setUp() {

        initDriver();
        homePage=new HomePage(DriverManager.getDriver());
        foundInStorePage =new FoundInStorePage(DriverManager.getDriver());
        contactUsPageForm =new ContactUsPageForm(DriverManager.getDriver());
    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }
}

// For ALLURE report we should navigate to this URL
// https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.19.0/
// then click on " allure-commandline-2.19.0.zip
// copy path of bin and paste to
