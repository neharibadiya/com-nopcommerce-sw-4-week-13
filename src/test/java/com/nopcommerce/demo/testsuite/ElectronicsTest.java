package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    Electronics electronics = new Electronics();
    ComputerPage computerPage = new ComputerPage();
    ComputerPage1 computerPage1 = new ComputerPage1();
    HomePage homePage = new HomePage();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        electronics.setMouseHoverOnCellPhoneAndClick();
        //electronics.setVerifyTextCellPhones();
        electronics.setMouseHoverOnElectronicsTab();
    }
    @Test
    public void verifyTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronics.setMouseHoverOnElectronicsTab();
        electronics.setMouseHoverOnCellPhoneAndClick();
        //electronics.setClickOnCellPhone();
        Assert.assertEquals(electronics.setVerifyTextCellPhones(),"Cell phones", "Error message not displayed");
        Thread.sleep(2000);
        electronics.setClickOnProductNameNokiaLumia1020();
        Assert.assertEquals(electronics.setVerifyTextNokiaLumia1020(), "Nokia Lumia 1020", "Error message not displayed");
        Assert.assertEquals(electronics.verifyNokiaPrice(), "$349.00","Error message not displayed" );
        electronics.setClearQuantity();
        Thread.sleep(2000);
        electronics.setChangeQuantity("2");
        Thread.sleep(2000);
        electronics.setClickOnAddToCartTab();
        Assert.assertEquals(electronics.setVerifyTextMassage(), "The product has been added to your shopping cart");
        electronics.setClickOnCrossButton();
        electronics.setMouseHoverOnShoppingCart();
        electronics.hoverAndClickOnGoToCart();
        Assert.assertEquals(electronics.verifyTextMessageShoppingCart(),"Shopping cart");
        //Assert.assertEquals(electronics.verifyQuantity(),"21","Error message not displayed" );
        Thread.sleep(2000);
        Assert.assertEquals(electronics.verifyTotal(), "$7,329.00", "Error message not displayed" );
        electronics.clickOnCheckbox();
        electronics.clickOnCheckout();
        Assert.assertEquals(electronics.verifyTextWelcomePlease(), "Welcome, Please Sign In!");
        electronics.clickOnRegister();
        Assert.assertEquals(electronics.verifyTextRegister(),"Register");
        electronics.sendTextToFirstNameField("gautam");
        electronics.sendTextToLastNameField("patel");
        electronics.sendTextToEmailField("gautam123@yahoo.com");
        electronics.setSendTextToPasswordField("Password1");
        Thread.sleep(2000);
        electronics.setSendTextToConfirmPasswordField("Password1");
        Thread.sleep(2000);
        electronics.setClickOnRegister1();
        Assert.assertEquals(electronics.verifyMessageYourRegistrationCompleted(),"Your registration completed","Registration is not done");
        Thread.sleep(3000);
        electronics.setClickOnContinueTab();
        Assert.assertEquals(electronics.verifyToTextShoppingCart(),"Shopping cart");
        electronics.clickOnCheckbox();
        electronics.setClickOnCheckout1();
        electronics.countryByVisibleText("United Kingdom");
        electronics.sendTextToCity("London");
        electronics.sendTextToAddress("Luton");
        electronics.sendTextToPostelCode("HP8 9jU");
        electronics.sendTextToPhoneNumber("02088765454");
        electronics.clickOnContinue1();
        electronics.setClickOnRadioButton2ndDayAir();
        electronics.clickOnContinue2();
        electronics.clickOnCreditCard();
        electronics.clickOnVisa();
        electronics.sendTextToCardholderName("G Patel");
        electronics.sendTextToCardNumber("1111222233334444");
        electronics.sendTextToExpirationMonth("10");
        electronics.sendTextToExpirationYear("2027");
        electronics.sendTextToCardCode("684");
        electronics.clickOnContinue3();
        Assert.assertEquals(electronics.verifyPaymentMethod(), "Credit Card", "Error message not displayed");
        Assert.assertEquals(electronics.verifyShoppingMethod(),"2nd Day Air", "Error message not displayed");
        Assert.assertEquals(electronics.verifyTotalPrice(), "$698.00", "Error message not displayed");
        electronics.clickOnConfirm();
        Assert.assertEquals(electronics.verifyTextThankYou(),"Thank you", "Error message not displayed");
        Assert.assertEquals(electronics.verifySuccessfully(), "Your order has been successfully processed!", "Error message not displayed");
        electronics.clickOnContinue4();
        Assert.assertEquals(electronics.verifyWelcomeToOurStore(), "Welcome to our store", "Error message not displayed");
        electronics.clickOnLogout();
        Assert.assertEquals(electronics.verifyCurrentUrl(), "https://demo.nopcommerce.com/");


    }
}






