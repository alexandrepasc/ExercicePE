package com.exercicepe;

import com.exercicepe.common.Elements;
import com.exercicepe.common.ErrorText;
import com.exercicepe.common.PreTest;
import com.exercicepe.common.Translations;
import com.exercicepe.common.Utils;
import com.exercicepe.elements.LoginPage;
import com.exercicepe.elements.RecoverPasswordPage;
import com.exercicepe.elements.RegisterPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginElementsTest extends PreTest {

  @Parameters({ "browser", "gui" })
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod(@Optional("firefox") String browser, @Optional("no") String gui)
    throws Exception {

    PreTest.beforeTest(browser, gui);

    driver.get(Utils.getLoginUrl());

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getLoginUrl(), ErrorText.PAGE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void titleTest()
    throws Exception {

    Elements element = new Elements(driver);

    Assert.assertTrue(element.checkElement(LoginPage.labelTitle), ErrorText.ELEMENT.getText());

    Assert.assertEquals(element.getText(LoginPage.labelTitle), Translations.labelReservedAreaTitle(element),
        ErrorText.VALUE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void inputElementsTest()
    throws Exception {

    Elements element = new Elements(driver);

    Assert.assertTrue(element.checkElement(LoginPage.inputMail), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(LoginPage.inputPassword), ErrorText.ELEMENT.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void buttonElementsTest()
    throws Exception {

    Elements element = new Elements(driver);

    Assert.assertTrue(element.checkElement(LoginPage.butLogin), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(LoginPage.butGovAuth), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(LoginPage.butATAuth), ErrorText.ELEMENT.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void buttonsRecoverRegisterTest()
    throws Exception {

    Elements element = new Elements(driver);

    Assert.assertTrue(element.checkElement(LoginPage.butRecoverPwd), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(LoginPage.butRegister), ErrorText.ELEMENT.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void recoverPasswordClickTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(LoginPage.butRecoverPwd);

    Assert.assertEquals(element.getText(RecoverPasswordPage.labelTitle),
        Translations.labelRecoveryPasswordTitle(element), ErrorText.VALUE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void registerClickTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(LoginPage.butRegister);

    Assert.assertEquals(element.getText(RegisterPage.labelTitle), Translations.labelRegisterTitle(element),
        ErrorText.VALUE.getText());
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod()
    throws Exception {

    PreTest.afterTest();
  }
}
