package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {
    //1.1 Click on Computer Menu.
    By computerMenu = By.xpath("//a[@href='/computers']");

    public void clickOnComputer() {
        clickOnElement(computerMenu);
    }

    //1.2 Click on Desktop
    By desktopMenu = By.xpath("//h2[@class='title']//a");

    public void clickOnDesktop() {
        clickOnElement(desktopMenu);
    }

    //1.3 Select Sort By position "Name: Z to A"
    public void sortProductZToA() {
        List<WebElement> products = driver.findElements(By.xpath("//h2[@class='product-title']//a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);

        //1.4 Verify the Product will arrange in Descending order

    }
}