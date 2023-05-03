package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.ComputerPage1;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest1 extends BaseTest {
    ComputerPage computer1 = new ComputerPage();
    ComputerPage1 computerPage1 = new ComputerPage1();

    @Test
    public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerPage1.clickOnComputer();
        computerPage1.clickOnDesktop();
        computerPage1.getSelectByValue("5");
        computerPage1.clickOnAddToCart();
        Assert.assertEquals(computerPage1.getVerifyBuildYourOwn(), "Build your own computer", "Error message not displayed");
        computerPage1.selectProcessorByValue("1");
        computerPage1.setSelectRam("5");
        computerPage1.clickOnHDD400GB();
        computerPage1.clickOnOsVistaPremium();
        computerPage1.setSelectMicrosoftOffice();
        computerPage1.clickOnSoftwareTotalCommander();
        Assert.assertEquals(computerPage1.verifyTotalPrice(), "$1,470.00", "Error message not displayed");
        Thread.sleep(2000);
        computerPage1.clickOnAddToCartButton();
        Assert.assertEquals(computerPage1.verifyCaryMessage(), "The product has been added to your shopping cart", "Error message not displayed");

        computerPage1.closeMessageBar();
        computerPage1.mouseHoverOnElementShoppingCart();
        computerPage1.clickOnGoToCart();
        Assert.assertEquals(computerPage1.verifyToMessageShoppingCart(), "Shopping cart","Shopping cart not displayed successfully");
        Thread.sleep(4000);
        computerPage1.clearTextInQuantityField();
        computerPage1.sendTextToQuantityField();
        computerPage1.clickOnUpdateShoppingCartButton();
        Assert.assertEquals(computerPage1.verifyTotal(), "$2,850.00");
        computerPage1.clickOnCheckBoxIAgreeWithTermsAndCondition();
        computerPage1.clickOnCheckOutButton();
        Thread.sleep(2000);
        Assert.assertEquals(computerPage1.verifyText1(), "Welcome, Please Sign In!");
        computerPage1.clickOnCheckOutAsGuest();
        computerPage1.sendTextToFirstNameField("Gautam");
        computerPage1.sendTextToLastNameField("Patel");
        computerPage1.sendTextToEmailField("gautampatel11@gmail.com");
        computerPage1.sendTextToCompanyField("Password1");
        computerPage1.selectCountryFromDropDownList();
        computerPage1.sendTextToCityField("London");
        computerPage1.sendTextToAddressLine1("Luton Road");
        computerPage1.sendTextToAddressLine2("Luton");
        computerPage1.sendTextToPostcode("HA9 9AU");
        computerPage1.sendTextToPhoneNumberField("02034343876");
        computerPage1.clickOnContinueButton();
        computerPage1.clickOnNextDayAirButton();
        computerPage1.clickOnContinueButtonAgain();
        computerPage1.clickOnCreditCardButton();
        computerPage1.selectClickOnContinue1();
        computerPage1.selectMasterCardFromCreditCardDropdown("MasterCard");
        computerPage1.sendTextTOCardHolderName("M shah");
        computerPage1.sendTextTOCardNumber("1111222233334444");
        computerPage1.selectMonthAndYearForCreditCardExpireData();
        computerPage1.sendTextToCardCode("486");
        computerPage1.clickOnContinueButton2();
        Thread.sleep(2000);
        Assert.assertEquals(computerPage1.getVerifyText1(), "Credit Card", "Error Message not displayed");
        Assert.assertEquals(computerPage1.getVerifyText2(), "Next Day Air", "Error Message not displayed");
        Assert.assertEquals(computerPage1.getVerifyText3(), "$2,850.00", "Error Message not displayed");
        computerPage1.clickOnConformButton();
        Assert.assertEquals(computerPage1.getVerifyText4(), "Checkout", "Error Message not displayed");
        Assert.assertEquals(computerPage1.getVerifyText5(), "Your order has been successfully processed!", "Error Message not displayed");
        computerPage1.clickOnContinueButton3();
        Thread.sleep(2000);
        Assert.assertEquals(computerPage1.getVerifyText6(),"Welcome to our store");
    }



}
