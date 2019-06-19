package com.exercicepe;

import com.exercicepe.common.Elements;
import com.exercicepe.common.ErrorText;
import com.exercicepe.common.PreTest;
import com.exercicepe.common.Translations;
import com.exercicepe.common.Utils;
import com.exercicepe.elements.LoginPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends PreTest {

  @Parameters({ "browser", "gui" })
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod(@Optional("firefox") String browser, @Optional("no") String gui)
    throws Exception {

    PreTest.beforeTest(browser, gui);

    driver.get(Utils.getLoginUrl());

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getLoginUrl(), ErrorText.PAGE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void buttonGovClickTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(LoginPage.butGovAuth);

    Utils.waitingUntil(driver, LoginPage.imgGovHeader, 20, Utils.WaitUntil.VISIBILITY);

    Assert.assertTrue(driver.getCurrentUrl().contains(Utils.getGovLoginUrl()), ErrorText.VALUE.getText());

    Assert.assertTrue(element.checkElement(LoginPage.imgGovHeader), ErrorText.ELEMENT.getText());

    Assert.assertEquals(element.getAttribute(LoginPage.imgGovHeader, "alt"), "Autenticação.gov.pt",
        ErrorText.VALUE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void buttonAtClickTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(LoginPage.butATAuth);

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getAtLoginUrl(), ErrorText.VALUE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void failNoInputLoginTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(LoginPage.butLogin);

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getLoginUrl());

    Assert.assertTrue(element.checkElement(LoginPage.labelMailFeedback), ErrorText.ELEMENT.getText());

    Assert.assertEquals(element.getText(LoginPage.labelMailFeedback), Translations.labelLoginMailFeedback(element),
        ErrorText.VALUE.getText());

    Assert.assertTrue(element.checkElement(LoginPage.labelPasswordFeedback), ErrorText.ELEMENT.getText());

    Assert.assertEquals(element.getText(LoginPage.labelPasswordFeedback),
        Translations.labelLoginPasswordFeedback(element), ErrorText.VALUE.getText());
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod()
    throws Exception {

    PreTest.afterTest();
  }
}
