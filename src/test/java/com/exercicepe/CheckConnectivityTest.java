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

import java.net.HttpURLConnection;
import java.net.URL;

public class CheckConnectivityTest extends PreTest {

  @Parameters({ "browser", "gui" })
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod(@Optional("firefox") String browser, @Optional("no") String gui)
    throws Exception {

    PreTest.beforeTest(browser, gui);
  }

  @Test(enabled = true, invocationCount = 1)
  public void connectivityTest()
    throws Exception {

    URL url = new URL(Utils.getUrl());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    conn.setRequestMethod("GET");
    conn.connect();

    Assert.assertEquals(conn.getResponseCode(), 200, ErrorText.WRONG.getText());
  }

  @AfterMethod(alwaysRun = true)
  public void afterMethod()
    throws Exception {

    PreTest.afterTest();
  }
}
