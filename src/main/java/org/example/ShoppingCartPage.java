package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils {

    public void conformAddedProduct() {

        //click on shopping cart button
        clickOnElement(By.className("ico-cart"));
        //
        String expectedProductName =loadProp.getProperty("ExpectedProductName");
        //verify correct product show in cart
        String actualProductName = getTextFromElement(By.className("product-name"));
        Assert.assertEquals(actualProductName,expectedProductName,"Wrong Product");
    }
}
