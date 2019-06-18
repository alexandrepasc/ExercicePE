package com.exercicepe.common;

import com.exercicepe.elements.HomePage;

public class Translations {

  private static Languages getLanguage(Elements element)
    throws Exception {

    String language = element.getAttribute(HomePage.tagHtml, "lang");

    switch (language) {
      case "pt-pt":
        return Languages.PT;
      case "en-US":
        return Languages.EN;
      default:
        return Languages.PT;
    }
  }

  public static String butReservedArea(Elements element)
    throws Exception {

    switch (getLanguage(element)) {
      case PT:
        return "Área Reservada";
      case EN:
        return "Reserved Area";
      default:
        return null;
    }
  }
}
