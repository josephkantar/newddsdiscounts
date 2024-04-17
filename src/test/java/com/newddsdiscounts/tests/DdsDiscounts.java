package com.newddsdiscounts.tests;

import com.newddsdiscounts.utils.RetryAnalyzer;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class DdsDiscounts extends BaseTest{

    @Severity(SeverityLevel.CRITICAL)
    @Step("Ddsdiscount test")
    @Test(testName = "DDsDiscounts Page",retryAnalyzer = RetryAnalyzer.class)

    public void testDdsDiscounts() throws InterruptedException {

        homePage
                .closeCookie ()
                .verifySignInModalWindowDisplay()
                //.verifyHomePageLogoAndImage()
                .verifyHomePageTextsAndTittle()
                .footerLinksList()
                .allLinksOnHomePage()
                .navMenuList()
                .clickFooterAboutUsLinksAndVerifyUrlAndTittle()
                .clickFooterCareersPageAndVerifyUrlAndTittle()
                .clickFooterSocialResponsibilityPageAndVerifyUrlAndTittle()
                .clickFooterDiversityPageAndVerifyUrlAndTittle()
                .clickFooterInvestorsPageAndVerifyUrlAndTittle()
                .clickFooterProductsPageAndVerifyUrlAndTittle()
                .clickFooterAssociatesPageAndVerifyUrlAndTittle()
                .clickFooterLegalNoticesLinksAndVerifyUrlAndTittle()
                .clickFooterComparisonPricingLinksAndVerifyUrlAndTittle()
                .clickFooterSitemapLinksAndVerifyUrlAndTittle()
                .clickFooterPrivacyLinksAndVerifyUrlAndTittle()
                .clickFooterAccessibilityLinksAndVerifyUrlAndTittle()
                .clickFooterDoNotCookieAndVerify()
                .clickFooterTermsofUseLinksAndVerifyUrlAndTittle()
                .navigateToContactUsPage();


//
        contactUsPageForm
                .clickFooterContactUsPageAndVerifyUrlAndTittle()
                .navigateToFoundInStore();

        foundInStorePage
                .clickFoundInStoreLinkAndVerifyUrlAndTittle();


    }
}
