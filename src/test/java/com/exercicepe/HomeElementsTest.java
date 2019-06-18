package com.exercicepe;

import com.exercicepe.common.Elements;
import com.exercicepe.common.ErrorText;
import com.exercicepe.common.PreTest;
import com.exercicepe.common.Translations;
import com.exercicepe.common.Utils;
import com.exercicepe.elements.HomePage;

import org.openqa.selenium.Point;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeElementsTest extends PreTest {

  @Parameters({ "browser", "gui" })
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod(@Optional("firefox") String browser, @Optional("no") String gui)
    throws Exception {

    PreTest.beforeTest(browser, gui);

    driver.get(Utils.getHomeUrl());

    Assert.assertEquals(driver.getCurrentUrl(), Utils.getHomeUrl(), ErrorText.PAGE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void reservedAreaTest()
    throws Exception {

    Elements element = new Elements(driver);

    Assert.assertTrue(element.checkElement(HomePage.butReservedArea), ErrorText.ELEMENT.getText());

    Assert.assertTrue(element.getText(HomePage.butReservedArea).contains(Translations.butReservedArea(element)),
        ErrorText.VALUE.getText());
  }

  @Test(enabled = true, invocationCount = 1)
  public void reservedAreaStyleTest()
    throws Exception {

    Elements element = new Elements(driver);

    //    Assert.assertEquals(element.getCssValue(HomePage.butReservedArea, "color"), "rgb(147, 193, 62)",
    //        ErrorText.VALUE.getText());
    Assert.assertEquals(Color.fromString(element.getCssValue(HomePage.butReservedArea, "color")).asHex(), "#93c13e",
        ErrorText.VALUE.getText());

    Point location = element.getLocation(HomePage.butReservedArea);

    Assert.assertEquals(location.x, 1029, ErrorText.VALUE.getText());
    Assert.assertEquals(location.y, 13, ErrorText.VALUE.getText());
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod()
    throws Exception {

    PreTest.afterTest();
  }
}
