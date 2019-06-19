package com.exercicepe.elements;

import org.openqa.selenium.By;

public class RegisterPage {

  public static By labelTitle = By.cssSelector("#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > h3");

  public static By butGov = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(2) > div.sc-iwsKbI.junIXN > form > button");

  public static By butAt = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(2) > div.sc-iwsKbI.ctZuQQ > form > button");

  public static By inputName = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(3) > div > div > label > input");

  public static By inputMail = By
      .cssSelector("#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(4) > label > input");

  public static By inputPassword = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(5) > label > div > input");

  public static By inputNif = By
      .cssSelector("#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(6) > label > input");

  public static By inputBirthDate = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(7) > label > div > div.react-datepicker-wrapper > div > input");

  public static By radioMaleGender = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(8) > div > div > label:nth-child(1)");

  public static By radioFemaleGender = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(8) > div > div > label:nth-child(2)");

  public static By radioOtherGender = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(8) > div > div > label:nth-child(3)");

  public static By inputZip1 = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div.sc-fBuWsC.eOeorl > div:nth-child(1) > div > div > div > input:nth-child(1)");

  public static By inputZip2 = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div.sc-fBuWsC.eOeorl > div:nth-child(1) > div > div > div > input:nth-child(3)");

  public static By inputCity = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div.sc-fBuWsC.eOeorl > div:nth-child(2) > div > label > input");

  public static By inputPhone = By.cssSelector(
      "#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(11) > label > input");

  public static By checkMailNotifications = By
      .cssSelector("#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(12) > label");

  public static By butRegister = By
      .cssSelector("#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-kAzzGY.bNvMpU > div:nth-child(13) > div > button");

  public static By butLogin = By
      .cssSelector("#auth-card > div > div.sc-jhAzac.ggHaQl > div.sc-gZMcBi.gwjsYB > div.sc-iwsKbI.kxdJwJ > button");
}
