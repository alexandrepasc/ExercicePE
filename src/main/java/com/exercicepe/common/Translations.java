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

  public static String labelReservedAreaTitle(Elements element)
    throws Exception {

    switch (getLanguage(element)) {
      case PT:
        return "ÁREA RESERVADA";
      case EN:
        return "RESERVED AREA";
      default:
        return null;
    }
  }

  public static String labelRecoveryPasswordTitle(Elements element)
    throws Exception {

    switch (getLanguage(element)) {
      case PT:
        return "RECUPERAR PALAVRA-PASSE";
      case EN:
        return "RECOVER PASSWORD";
      default:
        return null;
    }
  }

  public static String labelRegisterTitle(Elements element)
    throws Exception {

    switch (getLanguage(element)) {
      case PT:
        return "REGISTO";
      case EN:
        return "REGISTRATION";
      default:
        return null;
    }
  }

  public static String labelLoginMailFeedback(Elements element)
    throws Exception {

    switch (getLanguage(element)) {
      case PT:
        return "Campo em falta/incorreto";
      case EN:
        return null;
        default:
          return null;
    }
  }

  public static String labelLoginPasswordFeedback(Elements element)
      throws Exception {

    switch (getLanguage(element)) {
      case PT:
        return "Campo em falta/incorreto";
      case EN:
        return null;
      default:
        return null;
    }
  }
}
