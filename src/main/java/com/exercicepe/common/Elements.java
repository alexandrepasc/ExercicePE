package com.exercicepe.common;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {

  private WebDriver driver;

  public Elements(WebDriver driver) {
    this.driver = driver;
  }

  public WebElement getElement(By by) {
    try {

      return driver.findElement(by);

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return null;

    } catch (Exception e) {
      return null;
    }
  }

  public WebElement[] getElements(By by) {
    try {

      return driver.findElements(by).toArray(new WebElement[0]);

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return null;

    } catch (Exception e) {
      return null;
    }
  }

  public String getElementText(By by) {
    try {

      return getElement(by).getText();

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return null;

    } catch (Exception e) {
      return null;
    }
  }

  public String getElementText(By by, int numb) {
    try {

      return getElements(by)[numb].getText();

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return null;

    } catch (Exception e) {
      return null;
    }
  }
}
