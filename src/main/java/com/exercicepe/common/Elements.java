package com.exercicepe.common;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {

  private static WebDriver driver;

  public Elements(WebDriver driver) {
    this.driver = driver;
  }

  public static WebElement getElement(By by) {
    try {

      return driver.findElement(by);

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return null;

    } catch (Exception e) {
      return null;
    }
  }

  public static WebElement[] getElements(By by) {
    try {

      return driver.findElements(by).toArray(new WebElement[0]);

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return null;

    } catch (Exception e) {
      return null;
    }
  }

  public static String getText(By by) {
    try {

      return getElement(by).getText();

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return null;

    } catch (Exception e) {
      return null;
    }
  }

  public static String getText(By by, int numb) {
    try {

      return getElements(by)[numb].getText();

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return null;

    } catch (Exception e) {
      return null;
    }
  }

  public static boolean elementClick(By by) {
    try {

      getElement(by).click();
      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (ElementClickInterceptedException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean elementClick(By by, int numb) {
    try {

      getElements(by)[numb].click();
      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (ElementClickInterceptedException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean elementSendKeys(By by, String text) {
    try {

      getElement(by).sendKeys(text);
      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean elementSendKeys(By by, int text) {
    try {

      getElement(by).sendKeys(Integer.toString(text));
      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean elementSendKeys(By by, String text, int numb) {
    try {

      getElements(by)[numb].sendKeys(text);
      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean elementSendKeys(By by, int text, int numb) {
    try {

      getElements(by)[numb].sendKeys(Integer.toString(text));
      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean isVisible(By by) {
    try {

      return getElement(by).isDisplayed();

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean isVisible(By by, int numb) {
    try {

      return getElements(by)[numb].isDisplayed();

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean isPresent(By by) {
    try {

      getElement(by).getLocation();
      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean isPresent(By by, int numb) {
    try {

      getElements(by)[numb].getLocation();
      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean checkElement(By by) {
    try {

      if (!isPresent(by)) {
        return false;
      }

      if (!isVisible(by)) {
        return false;
      }

      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }

  public static boolean checkElement(By by, int numb) {
    try {

      if (!isPresent(by, numb)) {
        return false;
      }

      if (!isVisible(by, numb)) {
        return false;
      }

      return true;

    } catch (StaleElementReferenceException e) {

      e.printStackTrace();
      return false;

    } catch (Exception e) {
      return false;
    }
  }
}
