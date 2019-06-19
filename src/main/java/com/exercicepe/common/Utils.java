package com.exercicepe.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

  public enum WaitUntil {
    VISIBILITY,
    CLICKABLE
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
