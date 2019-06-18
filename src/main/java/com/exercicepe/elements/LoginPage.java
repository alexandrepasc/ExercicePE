package com.exercicepe.elements;

import org.openqa.selenium.By;

public class LoginPage {

  public By labelTitle = By.cssSelector("#adene-login > div > h2");

  public By inputMail = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(3) > label > input");

  public By inputPassword = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(4) > label > input");

  public By butLogin = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(5) > div > button");

  public By butRecoverPwd = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > a");

  public By butGovAuth = By.cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div:nth-child(9) > form > button");

  public By butATAuth = By
      .cssSelector("#auth-card > div > div.sc-kAzzGY.bNvMpU > div.sc-iwsKbI.ctZuQQ > form > button");

  public By butRegister = By.cssSelector("#auth-card > div > div.sc-gZMcBi.gwjsYB > div.sc-iwsKbI.kxdJwJ > button");
}
