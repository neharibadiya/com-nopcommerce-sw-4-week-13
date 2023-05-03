package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ComputerPage1 extends Utility {
    //2.1 Click on Computer Menu.
    By computerMenu = By.xpath("//a[@href='/computers']");
    public void clickOnComputer() {
        clickOnElement(computerMenu);
    }
    //2.2 Click on Desktop
    By desktopMenu = By.xpath("//h2[@class='title']//a");

    public void clickOnDesktop() {
        clickOnElement(desktopMenu);
    }
    //2.3 Select Sort By position "Name: A to Z"
    By selectByValue = By.xpath("//select[@name='products-orderby']");

    public void getSelectByValue(String value) {
        selectByValueFromDropDown(selectByValue, value);
    }

    //2.4 Click on "Add To Cart"
    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }
    //2.5 Verify the Text "Build your own computer"
    By verifyBuildYourOwn = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public String getVerifyBuildYourOwn() {
        return getTextFromElement(verifyBuildYourOwn);
    }
    //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");

    public void selectProcessorByValue(String value) {
        selectByValueFromDropDown(selectProcessor, value);
    }

    //2.7.Select "8GB [+$60.00]" using Select class.
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    public void setSelectRam (String value){
        selectByValueFromDropDown(selectRam,value);
    }
    //2.8 Select HDD radio "400 GB [+$100.00]"
    By selectHDD = By.xpath("//label[text()='400 GB [+$100.00]']");

    public void clickOnHDD400GB() {
        clickOnElement(selectHDD);
    }
    //2.9 Select OS radio "Vista Premium [+$60.00]"
    By selectOS = By.xpath("//label[text()='Vista Premium [+$60.00]']");

    public void clickOnOsVistaPremium() {
        clickOnElement(selectOS);
    }
    //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
    //[+$5.00]"
    By selectMicrosoftOffice = By.xpath("//input[@id='product_attribute_5_10']");
    public void setSelectMicrosoftOffice(){
        clickOnElement(selectMicrosoftOffice);
    }
    By selectSoftware = By.xpath("//input[@id='product_attribute_5_12']");

    public void clickOnSoftwareTotalCommander() {
        clickOnElement(selectSoftware);
    }

    //2.11 Verify the price "$1,475.00"
    By verifyTotal = By.xpath("//span[@id='price-value-1']");

    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotal);
    }
    //2.12 Click on "ADD TO CARD" Button.
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }
    //2.13 Verify the Message "The product has been added to your shopping cart" on Top
    //green Bar
    By verifyCartMsg = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");

    public String verifyCaryMessage() {
        return getTextFromElement(verifyCartMsg);
    }
    //After that close the bar clicking on the cross button.
    By closeMsgBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    public void closeMessageBar() {
        clickOnElement(closeMsgBar);
    }
    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.

    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");

    public void mouseHoverOnElementShoppingCart() {
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    By clickOnGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");

    public void clickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }

    //2.15 Verify the message "Shopping cart"
    By verifyMessageShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    public String verifyToMessageShoppingCart(){
        return getTextFromElement(verifyMessageShoppingCart);
    }

    //2.16 Change the Qty to "2" and Click on "Update shopping cart"

    By clearText = By.xpath("//input[@value='1']");

    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(clearText);
        quantity.clear();
    }

    By sendTextToQuantity = By.xpath("//input[@value='1']");

    public void sendTextToQuantityField() {
        sendTextToElement(sendTextToQuantity, "2");
    }
    By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickOnUpdateShoppingCart);
    }
    //2.17 Verify the Total"$2,950.00"
    By verifyTotal1 = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    public String verifyTotal() {
        return getTextFromElement(verifyTotal1);
    }

    //2.18 click on checkbox “I agree with the terms of service”
    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");

    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        clickOnElement(clickOnCheckbox);
    }
    //2.19 Click on “CHECKOUT”
    By clickOnCheckout = By.xpath("//button[@id='checkout']");

    public void clickOnCheckOutButton() {
        clickOnElement(clickOnCheckout);
    }
    //2.20 Verify the Text “Welcome, Please Sign In!”
    By VerifyTextWelcome= By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public String verifyText1(){
        return getTextFromElement(VerifyTextWelcome);
    }
    //2.21Click on “CHECKOUT AS GUEST” Tab
    By clickOnCheckoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public void clickOnCheckOutAsGuest() {
        clickOnElement(clickOnCheckoutAsGuest);
    }
    //2.22 Fill the all mandatory field
    By sendTextToFirstName = By.id("BillingNewAddress_FirstName");

    public void sendTextToFirstNameField(String name) {
        sendTextToElement(sendTextToFirstName, name);
    }

    By sendTextToLastName = By.id("BillingNewAddress_LastName");

    public void sendTextToLastNameField(String lastName) {
        sendTextToElement(sendTextToLastName, lastName);
    }

    By sendTextToEmail = By.id("BillingNewAddress_Email");

    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmail, email);
    }

    By sendTextToCompany = By.id("BillingNewAddress_Company");

    public void sendTextToCompanyField(String company) {
        sendTextToElement(sendTextToCompany, company);
    }

    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "158");
    }

    // Select country = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
    //        country.selectByVisibleText("United Kingdom

    By sendTextToCity = By.xpath("//input[@id='BillingNewAddress_City']");

    public void sendTextToCityField(String city) {
        sendTextToElement(sendTextToCity, city);
    }

    By sendTextToAddress1 = (By.cssSelector("#BillingNewAddress_Address1"));

    public void sendTextToAddressLine1(String address) {
        sendTextToElement(sendTextToAddress1, address);
    }

    By sendTextToAddress2 = (By.cssSelector("#BillingNewAddress_Address2"));

    public void sendTextToAddressLine2(String address) {
        sendTextToElement(sendTextToAddress2, address);
    }

    By sendTextToPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");

    public void sendTextToPostcode(String postcode) {
        sendTextToElement(sendTextToPostalCode, postcode);
    }

    By sendTextToPhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    public void sendTextToPhoneNumberField(String number) {
        sendTextToElement(sendTextToPhoneNumber, number);
    }

    //2.23 Click on “CONTINUE”
    By clickOnContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }
    //2.24 Click on Radio Button “Next Day Air($0.00)”
    By clickOnNextDayAir = By.xpath("//input[@id='shippingoption_1']");

    public void clickOnNextDayAirButton() {
        clickOnElement(clickOnNextDayAir);
    }
    //2.25 Click on “CONTINUE”
    By clickOnContinueTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    public void clickOnContinueButtonAgain() {
        clickOnElement(clickOnContinueTab);
    }
    //2.26 Select Radio Button “Credit Card”
    By clickOnCreditCard = By.xpath("//input[@id='paymentmethod_1']");

    public void clickOnCreditCardButton() {
        clickOnElement(clickOnCreditCard);
    }
    By continueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public void selectClickOnContinue1() {
        clickOnElement(continueButton);
    }
    //2.27 Select “Master card” From Select credit card dropdown
    By clickOnMasterCard = By.xpath("//select[@id='CreditCardType']");

    public void selectMasterCardFromCreditCardDropdown(String value) {
        selectByValueFromDropDown(clickOnMasterCard,value);
    }
    //2.28 Fill all the details
    By cardHolderName = By.id("CardholderName");

    public void sendTextTOCardHolderName(String name) {
        sendTextToElement(cardHolderName, name);
    }

    By cardNumber = By.id("CardNumber");

    public void sendTextTOCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }

    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "5");
        selectByValueFromDropDown(By.id("ExpireYear"), "2024");
    }

    By cardCode = By.id("CardCode");

    public void sendTextToCardCode(String code) {
        sendTextToElement(cardCode, code);
    }
    //2.29 Click on “CONTINUE”
    By continueButton2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }
    //2.30 Verify “Payment Method” is “Credit Card”
    By verifyText1 = By.xpath("//li[@class='payment-method']/span[2]");

    public String getVerifyText1() {
        return getTextFromElement(verifyText1);

    }
    //2.32 Verify “Shipping Method” is “Next Day Air”
    By verifyText2 = By.xpath("//li[@class='shipping-method']//span[2]");

    public String getVerifyText2() {
        return getTextFromElement(verifyText2);

    }
    //2.33 Verify Total is “$2,950.00”
    By verifyText3 = By.xpath("//tr[@class='order-total']/td[2]/span/strong");

    public String getVerifyText3() {
        return getTextFromElement(verifyText3);

    }
    //2.34 Click on “CONFIRM”
    By conform = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");

    public void clickOnConformButton() {
        clickOnElement(conform);
    }
    //2.35 Verify the Text “Thank You”
    By verifyText4 = By.xpath("//div[@class='page-title']/h1");

    public String getVerifyText4() {
        return getTextFromElement(verifyText4);

    }
    //2.36 Verify the message “Your order has been successfully processed!”
    By verifyText5 = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String getVerifyText5() {
        return getTextFromElement(verifyText5);

    }

    //2.37 Click on “CONTINUE”
    By continueButton3 = By.xpath("//button[normalize-space()='Continue']");

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }
    //2.37 Verify the text “Welcome to our store”
    By verifyText6 = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String getVerifyText6() {
        return getTextFromElement(verifyText6);

    }
}
