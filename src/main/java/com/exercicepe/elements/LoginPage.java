package com.exercicepe.elements;

import org.openqa.selenium.By;

public class LoginPage {

  public static By labelTitle = By.cssSelector("#adene-login > div > h2");

  public static By inputMail = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(3) > label > input");

  public static By inputPassword = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(4) > label > input");

  public static By butLogin = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(5) > div > button");

  public static By butRecoverPwd = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > a");

  public static By butGovAuth = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(9) > form > button");

  public static By butATAuth = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div.sc-iwsKbI.ctZuQQ > form > button");

  public static By butRegister = By.cssSelector("#auth-card > div > div.sc-gZMcBi.gwjsYB > div.sc-iwsKbI.kxdJwJ > button");
}
