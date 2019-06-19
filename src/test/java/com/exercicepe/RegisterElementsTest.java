package com.exercicepe;

import com.exercicepe.common.Elements;
import com.exercicepe.common.ErrorText;
import com.exercicepe.common.PreTest;
import com.exercicepe.common.Translations;
import com.exercicepe.common.Utils;
import com.exercicepe.elements.LoginPage;
import com.exercicepe.elements.RegisterPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterElementsTest extends PreTest {

  @Parameters({ "browser", "gui" })
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod(@Optional("firefox") String browser, @Optional("no") String gui)
    throws Exception {

    PreTest.beforeTest(browser, gui);

    driver.get(Utils.getLoginUrl());

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getLoginUrl(), ErrorText.PAGE.getText());

    Elements element = new Elements(driver);

    element.click(LoginPage.butRegister);

    Assert.assertEquals(element.getText(RegisterPage.labelTitle), Translations.labelRegisterTitle(element),
        ErrorText.VALUE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void inputElementsTest()
    throws Exception {

    Elements element = new Elements(driver);

    Assert.assertTrue(element.checkElement(RegisterPage.inputName), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.inputMail), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.inputPassword), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.inputNif), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.inputBirthDate), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.radioMaleGender), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.radioFemaleGender), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.radioOtherGender), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.inputZip1), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.inputZip2), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.inputCity), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.inputPhone), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.checkMailNotifications), ErrorText.ELEMENT.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void buttonElementsTest()
    throws Exception {

    Elements element = new Elements(driver);

    Assert.assertTrue(element.checkElement(RegisterPage.butGov), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.butAt), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.butRegister), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.butLogin), ErrorText.ELEMENT.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void buttonGovClickTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(RegisterPage.butGov);

    Utils.waitingUntil(driver, LoginPage.imgGovHeader, 20, Utils.WaitUntil.VISIBILITY);

    Assert.assertTrue(driver.getCurrentUrl().contains(Utils.getGovLoginUrl()), ErrorText.VALUE.getText());

    Assert.assertTrue(element.checkElement(LoginPage.imgGovHeader), ErrorText.ELEMENT.getText());

    Assert.assertEquals(element.getAttribute(LoginPage.imgGovHeader, "alt"), Utils.getGovBannerUrl(),
        ErrorText.VALUE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void buttonAtClickTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(RegisterPage.butAt);

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getAtLoginUrl(), ErrorText.VALUE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void buttonLoginClickTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(RegisterPage.butLogin);

    Assert.assertTrue(element.checkElement(LoginPage.labelLoginTitle));
  }

  @Test(enabled = true, invocationCount = 1)
  public void useTermsPopupElementsTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(RegisterPage.butRegister);

    driver.switchTo().frame(element.getElement(RegisterPage.frameTerms));

    Assert.assertTrue(driver.findElement(RegisterPage.labelTermsTitle).isDisplayed(), ErrorText.ELEMENT.getText());

    Assert.assertEquals(element.getText(RegisterPage.labelTermsTitle), Translations.labelTermsUseTitle(element),
        ErrorText.VALUE.getText());

    driver.switchTo().defaultContent();

    Assert.assertTrue(element.checkElement(RegisterPage.butTermsAccept), ErrorText.ELEMENT.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void failNoInputTest()
    throws Exception {

    Elements element = new Elements(driver);

    element.click(RegisterPage.butRegister);

    Utils.waitingUntil(driver, RegisterPage.frameTerms, 20, Utils.WaitUntil.VISIBILITY);

    driver.switchTo().frame(element.getElement(RegisterPage.frameTerms));

    Assert.assertTrue(element.checkElement(RegisterPage.labelTermsTitle), ErrorText.ELEMENT.getText());

    Utils.scrollToElement(driver, element.getElement(RegisterPage.labelTermsDate));

    driver.switchTo().defaultContent();

    element.click(RegisterPage.butTermsAccept);

    Assert.assertTrue(element.checkElement(RegisterPage.labelNameFeedback), ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(RegisterPage.labelNameFeedback),
        Translations.labelRegisterNameFeedback(element), ErrorText.VALUE.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.labelEmailFeedback), ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(RegisterPage.labelEmailFeedback),
        Translations.labelRegisterMailFeedback(element), ErrorText.VALUE.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.labelPasswordFeedback), ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(RegisterPage.labelPasswordFeedback),
        Translations.labelRegisterPasswordFeedback(element), ErrorText.VALUE.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.labelNifFeedback), ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(RegisterPage.labelNifFeedback),
        Translations.labelRegisterNifFeedback(element), ErrorText.VALUE.getText());

    Assert.assertTrue(element.checkElement(RegisterPage.labelBirthFeedback), ErrorText.ELEMENT.getText());
    Assert.assertEquals(element.getText(RegisterPage.labelBirthFeedback),
        Translations.labelRegisterBirthFeedback(element), ErrorText.VALUE.getText());
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod()
    throws Exception {

    PreTest.afterTest();
  }
}
