package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomePage homePage = new HomePage();
    @Test
    public void verifyUserShouldNavigateToComputer(){
        Assert.assertEquals(homePage.getVerifyComputer(),"Computers", "Error Message not displayed");
    }
}
