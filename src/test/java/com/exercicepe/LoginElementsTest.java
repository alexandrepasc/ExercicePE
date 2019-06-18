package com.exercicepe;

import com.exercicepe.common.ErrorText;
import com.exercicepe.common.PreTest;
import com.exercicepe.common.Utils;

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

  @AfterMethod(alwaysRun = true)
  public void afterMethod()
    throws Exception {

    PreTest.afterTest();
  }
}
