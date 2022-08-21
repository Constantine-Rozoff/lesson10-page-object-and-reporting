package net.absoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage extends BaseStorePage {

  private final String itemXPath = "//div[@class='inventory_item'][.//div[@class='inventory_item_name' and text()='%s']]";

  public InventoryPage(WebDriver driver) {
    super(driver);
  }

  public InventoryPage addItemToCart(String itemName) {
    WebElement item = driver.findElement(By.xpath(String.format(itemXPath, itemName)));
    WebElement addToCartButton = item.findElement(
        By.xpath("//button[contains(@data-test, 'add-to-cart')]"));
    addToCartButton.click();
    return this;
  }

}