package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    //1.1 Mouse Hover on “Electronics” Tab
    By mouseHoverOnElectronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    public void setMouseHoverOnElectronicsTab(){
        mouseHoverToElement(mouseHoverOnElectronicsTab);
    }
    //1.2 Mouse Hover on “Cell phones” and click
    By mouseHoverOnCellPhoneAndClick = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    public void setMouseHoverOnCellPhoneAndClick(){
        mouseHoverToElementAndClick(mouseHoverOnCellPhoneAndClick);
    }
    By clickOnCellPhone = By.xpath("//li[@class='active last']//a[normalize-space()='Cell phones']");
    public void setClickOnCellPhone(){
        clickOnElement(clickOnCellPhone);
    }
    // 1.3 Verify the text “Cell phones”
    By verifyTextCellPhones = By.xpath("//h1[normalize-space()='Cell phones']");
    public String setVerifyTextCellPhones(){
        return getTextFromElement(verifyTextCellPhones);
    }
    //2.5 Click on product name “Nokia Lumia 1020” link
    By clickOnProductNameNokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    public void setClickOnProductNameNokiaLumia1020(){
        clickOnElement(clickOnProductNameNokiaLumia1020);
    }
    //2.6 Verify the text “Nokia Lumia 1020”
    By verifyTextNokiaLumia1020 = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    public String setVerifyTextNokiaLumia1020(){
        return getTextFromElement(verifyTextNokiaLumia1020);
    }
    //2.7 Verify the price “$349.00”
    By verifyNokiaPrice = By.xpath("//span[@id='price-value-20']");
    public String verifyNokiaPrice(){
        return getTextFromElement(verifyNokiaPrice);
    }
    //2.8 Change quantity to 2
    By ClearQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    public void setClearQuantity(){
        clickOnElement(ClearQuantity);
    }
    public void ClearQuantity(){
        driver.findElement(By.id("product_enteredQuantity_20")).clear();
    }
    By changeQuantity = By.id("product_enteredQuantity_20");
    public void setChangeQuantity(String text){
        sendTextToElement(changeQuantity, text);
    }
    //2.9 Click on “ADD TO CART” tab
    By clickOnAddToCartTab = By.xpath("//button[@id='add-to-cart-button-20']");
    public void setClickOnAddToCartTab(){
        clickOnElement(clickOnAddToCartTab);
    }
    //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By verifyTextMassage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    public String setVerifyTextMassage(){
        return getTextFromElement(verifyTextMassage);
    }
    //After that close the bar clicking on the cross button.
    By clickOnCrossButton = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public void setClickOnCrossButton(){
        clickOnElement(clickOnCrossButton);
    }
    //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void setMouseHoverOnShoppingCart(){
        mouseHoverToElementAndClick(mouseHoverOnShoppingCart);
    }
    By clickOnGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    public void hoverAndClickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }
    //2.12 Verify the message "Shopping cart"
    By verifyTextMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public String verifyTextMessageShoppingCart(){
        return getTextFromElement(verifyTextMessageShoppingCart);
    }
    //2.13 Verify the quantity is 21
    By verifyQuantity = By.xpath("//input[@id='itemquantity11219']");
    public String verifyQuantity() {
        return getTextFromElement(verifyQuantity);
    }
    //2.14 Verify the Total $30,975.00
    By verifyTotal = By.xpath("//span[@class='product-subtotal']");
    public String verifyTotal() {
        return getTextFromElement(verifyTotal);
    }
    //2.15 click on checkbox “I agree with the terms of service”
    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");
    public void clickOnCheckbox() {
        clickOnElement(clickOnCheckbox);
    }
    //2.16 Click on “CHECKOUT”
    By clickOnCheckout = By.xpath("//button[@id='checkout']");
    public void clickOnCheckout() {
        clickOnElement(clickOnCheckout);
    }
    //2.17 Verify the Text “Welcome, Please Sign In!”
    By verifyTextWelcomePlease = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    public String verifyTextWelcomePlease() {
        return getTextFromElement(verifyTextWelcomePlease);
    }
    //2.18 Click on “REGISTER” tab
    By clickOnRegister = By.xpath("//button[normalize-space()='Register']");
    public void clickOnRegister() {
        clickOnElement(clickOnRegister);
    }
    //2.19 Verify the text “Register”
    By verifyTextRegister = By.xpath("//h1[contains(text(),'Register')]");
    public String verifyTextRegister() {
        return getTextFromElement(verifyTextRegister);
    }
    //2.20 Fill the mandatory fields
    By sendTextToFirstNameField = By.id("FirstName");
    public void sendTextToFirstNameField(String firstname) {
        sendTextToElement(sendTextToFirstNameField, firstname);
    }
    By sendTextToLastNameField = By.id("LastName");
    public void sendTextToLastNameField(String lastname) {
        sendTextToElement(sendTextToLastNameField, lastname);
    }
    By sendTextToDay = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    public void sendTextToDay(String day) {
        sendTextToElement(sendTextToDay, day);
    }
    By sendTextToMonth = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    public void sendTextToMonth(String month) {
        sendTextToElement(sendTextToMonth, month);
    }
    By sendTextToYear = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
    public void sendTextToYear(String year) {
        sendTextToElement(sendTextToYear, year);
    }
    By sendTextToEmailField = By.id("Email");
    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmailField, email);
    }
    By sendTextToPasswordField = By.xpath("//input[@id='Password']");
    public void setSendTextToPasswordField(String password) {
        sendTextToElement(sendTextToPasswordField, password);
    }
    By sendTextToConfirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    public void setSendTextToConfirmPasswordField(String confirmPassword) {
        sendTextToElement(sendTextToConfirmPasswordField, confirmPassword);
    }
    //2.21 Click on “REGISTER” Button
    By clickOnRegister1 = By.xpath("//button[@id='register-button']");
    public void setClickOnRegister1() {
        clickOnElement(clickOnRegister1);
    }
    //2.22 Verify the message “Your registration completed”
    By verifyMessageYourRegistrationCompleted = By.xpath("//div[text()='Your registration completed']");
    public String verifyMessageYourRegistrationCompleted() {
        return getTextFromElement(verifyMessageYourRegistrationCompleted);
    }
    //2.23 Click on “CONTINUE” tab
    By clickOnContinueTab = By.xpath("//a[contains(text(),'Continue')]");
    public void setClickOnContinueTab(){
        clickOnElement(clickOnContinueTab);
    }
    //2.24 Verify the text “Shopping card”
    By verifyToTextShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public String verifyToTextShoppingCart(){
        return getTextFromElement(verifyToTextShoppingCart);
    }
    //2.25 click on checkbox “I agree with the terms of service”
    By clickOnCheckBox = By.id("termsofservice");
    public void setClickOnCheckBox(){
        clickOnElement(clickOnCheckBox);
    }
    //2.26 Click on “CHECKOUT”
    By clickOnCheckout1 = By.xpath("//button[@id='checkout']");
    public void setClickOnCheckout1() {
        clickOnElement(clickOnCheckout1);
    }
    //2.27 Fill the Mandatory fields
    By selectCountry = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    public void countryByVisibleText(String name) {
        selectByVisibleTextFromDropDown(selectCountry, name);
    }
    By sendTextToCity = By.id("BillingNewAddress_City");
    public void sendTextToCity(String city) {
        sendTextToElement(sendTextToCity, city);
    }
    By sendTextToAddress = By.id("BillingNewAddress_Address1");
    public void sendTextToAddress(String address) {
        sendTextToElement(sendTextToAddress, address);
    }
    By sendTextToPostelCode = By.id("BillingNewAddress_ZipPostalCode");
    public void sendTextToPostelCode(String postalCode) {
        sendTextToElement(sendTextToPostelCode, postalCode);
    }
    By sendTextToPhoneNumber = By.id("BillingNewAddress_PhoneNumber");
    public void sendTextToPhoneNumber(String phoneNumber) {
        sendTextToElement(sendTextToPhoneNumber, phoneNumber);
    }
    //2.28 Click on “CONTINUE”
    By clickOnContinue1 = By.xpath("//button[@onclick='Billing.save()']");
    public void clickOnContinue1() {
        clickOnElement(clickOnContinue1);
    }
    //2.29 Click on Radio Button “2nd Day Air ($0.00)”
    By clickOnRadioButton2ndDayAir = By.xpath("//button[@onclick='Billing.save()']");
    public void setClickOnRadioButton2ndDayAir(){
        clickOnElement(clickOnRadioButton2ndDayAir);
    }
    //2.30 Click on “CONTINUE”
    By clickOnContinue2 = By.xpath("(//button[text()='Continue'])[3]");
    public void clickOnContinue2() {
        clickOnElement(clickOnContinue2);
    }
    //2.31 Select Radio Button “Credit Card”
    By clickOnCreditCard = By.id("paymentmethod_1");
    public void clickOnCreditCard() {
        clickOnElement(clickOnCreditCard);
    }
    //2.32 Select “Visa” From Select credit card dropdown
    By clickOnVisa = By.xpath("//option[contains(text(),'Visa')]");
    public void clickOnVisa() {
        clickOnElement(clickOnVisa);
    }
    //2.33 Fill all the details
    By sendTextToCardholderName = By.name("CardholderName");
    public void sendTextToCardholderName(String cardHolderName) {
        sendTextToElement(sendTextToCardholderName, cardHolderName);
    }
    By sendTextToCardNumber = By.xpath("//input[@id='CardNumber']");
    public void sendTextToCardNumber(String cardNumber) {
        sendTextToElement(sendTextToCardNumber, cardNumber);
    }
    By sendTextToExpirationMonth = By.xpath("//select[@id='ExpireMonth']");
    public void sendTextToExpirationMonth(String expirationMonth) {
        selectByValueFromDropDown(sendTextToExpirationMonth,expirationMonth);
    }
    By sendTextToExpirationYear = By.xpath("//select[@id='ExpireYear']");
    public void sendTextToExpirationYear(String expirationYear) {
        selectByValueFromDropDown(sendTextToExpirationYear, expirationYear);
    }
    By sendTextToCardCode = By.id("CardCode");
    public void sendTextToCardCode(String cardCode) {
        sendTextToElement(sendTextToCardCode, cardCode);
    }
    //2.34 Click on “CONTINUE”
    By clickOnContinue3 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    public void clickOnContinue3() {
        clickOnElement(clickOnContinue3);
    }
    //2.35 Verify “Payment Method” is “Credit Card”
    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    public String verifyPaymentMethod() {
        return getTextFromElement(verifyPaymentMethod);
    }
    //2.36 Verify “Shipping Method” is “2nd Day Air”
    By verifyShoppingMethod = By.xpath("//span[text()[normalize-space()='2nd Day Air']]");
    public String verifyShoppingMethod() {
        return getTextFromElement(verifyShoppingMethod);
    }
    //2.37 Verify Total is “$698.00”
    By verifyTotalPrice = By.xpath("(//strong[text()='$698.00'])[2]");
    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotalPrice);
    }
    //2.38 Click on “CONFIRM”
    By clickOnConfirm = By.xpath("//button[contains(text(),'Confirm')]");
    public void clickOnConfirm() {
        clickOnElement(clickOnConfirm);
    }
    //2.39 Verify the Text “Thank You”
    By verifyTextThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    public String verifyTextThankYou() {
        return getTextFromElement(verifyTextThankYou);
    }
    //2.40 Verify the message “Your order has been successfully processed!”
    By verifySuccessfully = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    public String verifySuccessfully() {
        return getTextFromElement(verifySuccessfully);
    }
    //2.41 Click on “CONTINUE”
    By clickOnContinue4 = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    public void clickOnContinue4() {
        clickOnElement(clickOnContinue4);
    }
    //2.42 Verify the text “Welcome to our store”
    By verifyWelcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public String verifyWelcomeToOurStore() {
        return getTextFromElement(verifyWelcomeToOurStore);
    }
    //2.43 Click on “Logout” link
    By clickOnLogout = By.xpath("//a[contains(text(),'Log out')]");
    public void clickOnLogout() {
        clickOnElement(clickOnLogout);
    }
    //2.44 Verify the URL is “https://demo.nopcommerce.com
    public String verifyCurrentUrl(){
        return driver.getCurrentUrl();
    }

}






















