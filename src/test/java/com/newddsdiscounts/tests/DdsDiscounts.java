package com.newddsdiscounts.tests;

import com.newddsdiscounts.utils.RetryAnalyzer;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class DdsDiscounts extends BaseTest{

    @Severity(SeverityLevel.CRITICAL)
    @Step("Corp Ross")
    @Test(testName = "Corp Ross HomePage",retryAnalyzer = RetryAnalyzer.class)

    public void testDdsDiscounts() throws InterruptedException {
        homePage
//                .closeCookie ()
                .verifySignInModalWindowDisplay()
//                .verifyHomePageLogoAndImage()
//                .verifyHomePageTextsAndTittle()
//                .footerLinksList()
//                .allLinksOnHomePage()
                .clickFooterAboutUsLinksAndVerifyUrlAndTittle()
                .navMenuList();

                //.verifyHomePageRossAltLinkText();
//                .verifyHomePageTexts()
//                .footerLinksList()
//                .navMenuList()
//                .verifySocialResponsibilityPage()
//                .verifySocialResponsibilityPageNavMenuLinks()
//                .clickFooterRossLinksAndVerifyUrlAndTittle()
//                .clickFooterDDsLinksAndVerifyUrlAndTittle()
//                .clickFooterPrivacyLinksAndVerifyUrlAndTittle()
//                .clickFooterEqualEmployLinksAndVerifyUrlAndTittle()
//                .clickFooterAccessibilityLinksAndVerifyUrlAndTittle()
//                .clickFooterContactUsLinksAndVerifyUrlAndTittle()
//                .clickFooterSiteMapLinksAndVerifyUrlAndTittle()
//                .clickFooterDoNotCookieAndVerify()
//                .goToCareersPageViaCompany();
//
//        careersPage
//                .clickFooterLinksAndVerifyUrlAndTittles()
//                .goToInvestorPageViaCompany();
//
//        investorPage
//                .verifyInvestorPageUrlAndTittle();


    }
}
