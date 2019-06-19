package com.exercicepe.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Utils {

  public enum WaitUntil {
    VISIBILITY,
    CLICKABLE
  }

  public static int getRandomValue(int min, int max) {

    //return min + (int) (Math.random() * max);

    Random aRandom = new Random();
    if (min > max) {
      throw new IllegalArgumentException("Start cannot exceed End.");
    }
    long range = (long) max - (long) min + 1;
    long fraction = (long) (range * aRandom.nextDouble());
    int randomNumber = (int) (fraction + min);
    return randomNumber;
  }

  public static int getRandom(int size_) {

    Random random = new Random();

    return random.nextInt(size_);
  }

  public static void waitingUntil(WebDriver driver, By by, int time, WaitUntil what) {
    WebDriverWait wait = new WebDriverWait(driver, time);
    switch (what) {
      case VISIBILITY:
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        break;
      case CLICKABLE:
        wait.until(ExpectedConditions.elementToBeClickable(by));
        break;
    }
  }

  public static void scrollToElement(WebDriver driver, WebElement element)
    throws Exception {

    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
  }

  public static String getHomeUrl() {

    return "https://poupaenergia.pt/";
  }

  public static String getLoginUrl() {

    return "https://poupaenergia.pt/entrar";
  }

  public static String getGovLoginUrl() {

    return "https://autenticacao.gov.pt/fa/CitizenConsent.aspx?RequestId";
  }

  public static String getGovBannerUrl() {

    return "Autenticação.gov.pt";
  }

  public static String getAtLoginUrl() {

    return "https://www.acesso.gov.pt/jsp/loginRedirectForm.jsp";
  }
}
