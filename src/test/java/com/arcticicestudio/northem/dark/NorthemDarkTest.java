/*
+++++++++++++++++++++++++++++++++++++++++++++++
title     Northem Dark Enumeration JUnit Test +
project   northem-dark-java                   +
file      NorthemDarkTest.java                +
version   0.1.0                               +
author    Arctic Ice Studio                   +
email     development@arcticicestudio.com     +
website   http://arcticicestudio.com          +
copyright Copyright (C) 2016                  +
created   2016-01-23 15:47 UTC+0100           +
modified  2016-04-09 14:08 UTC+0200           +
+++++++++++++++++++++++++++++++++++++++++++++++

[Description]
JUnit test class for the 'NorthemDark' class of the "Northem Dark - Java" API.

[Copyright]
Copyright (C) 2016 Arctic Ice Studio <development@arcticicestudio.com>

[References]
Northem Dark
  (https://github.com/arcticicestudio/northem-dark)
Java 8 API Documentation
  (https://docs.oracle.com/javase/8/docs/api/)
JavaFX 2.2 API Documentation
  (https://docs.oracle.com/javafx/2/api/)
JavaFX 2.2 Oracle Project Website
  (http://docs.oracle.com/javase/8/javase-clienttechnologies.htm)
Arctic Versioning Specification
  (http://specs.arcticicestudio.com/arcver) (ArcVer)
*/

package com.arcticicestudio.northem.dark;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * JUnit test class for the {@link NorthemDark} class of the
 * <a href="https://github.com/arcticicestudio/northem-dark-java">Northem Dark - Java</a> API.
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @see NorthemDark
 * @see <a href="http://junit.org/">http://junit.org/</a>
 * @see <a href="https://github.com/arcticicestudio/northem-dark-java">Northem Dark - Java</a>
 * @since 0.1.0
 */
public class NorthemDarkTest {
  @Test
  public void shouldReturnTheCorrectHEXColorCode() {
    assertEquals(NorthemDark.hex(NorthemDark.DARKEST_COAL.get()), "#1F1F23");
    assertEquals(NorthemDark.hex(NorthemDark.DARK_COAL.get()), "#242429");
    assertEquals(NorthemDark.hex(NorthemDark.COAL.get()), "#29292E");
    assertEquals(NorthemDark.hex(NorthemDark.LIGHT_COAL.get()), "#4F4F59");
    assertEquals(NorthemDark.hex(NorthemDark.DIRTY_WHITE.get()), "#DEDEDE");
    assertEquals(NorthemDark.hex(NorthemDark.WHITE.get()), "#ECEEEF");
    assertEquals(NorthemDark.hex(NorthemDark.AQUA.get()), "#8FCEC8");
    assertEquals(NorthemDark.hex(NorthemDark.LIGHT_BLUE.get()), "#85C1D3");
    assertEquals(NorthemDark.hex(NorthemDark.BLUE.get()), "#87B2CE");
    assertEquals(NorthemDark.hex(NorthemDark.DARK_BLUE.get()), "#5B81AF");
    assertEquals(NorthemDark.hex(NorthemDark.RED.get()), "#E07473");
    assertEquals(NorthemDark.hex(NorthemDark.YELLOW.get()), "#FDCE84");
    assertEquals(NorthemDark.hex(NorthemDark.ORANGE.get()), "#F0A06F");
    assertEquals(NorthemDark.hex(NorthemDark.LIME.get()), "#C9CC78");
    assertEquals(NorthemDark.hex(NorthemDark.PURPLE.get()), "#C2A1CA");
  }

  @Test
  public void shouldReturnTheCorrectRGBColorCode() {
    assertEquals(NorthemDark.rgb(NorthemDark.DARKEST_COAL.get()), "rgb(31, 31, 35)");
    assertEquals(NorthemDark.rgb(NorthemDark.DARK_COAL.get()), "rgb(36, 36, 41)");
    assertEquals(NorthemDark.rgb(NorthemDark.COAL.get()), "rgb(41, 41, 46)");
    assertEquals(NorthemDark.rgb(NorthemDark.LIGHT_COAL.get()), "rgb(79, 79, 89)");
    assertEquals(NorthemDark.rgb(NorthemDark.DIRTY_WHITE.get()), "rgb(222, 222, 222)");
    assertEquals(NorthemDark.rgb(NorthemDark.WHITE.get()), "rgb(236, 238, 239)");
    assertEquals(NorthemDark.rgb(NorthemDark.AQUA.get()), "rgb(143, 206, 200)");
    assertEquals(NorthemDark.rgb(NorthemDark.LIGHT_BLUE.get()), "rgb(133, 193, 211)");
    assertEquals(NorthemDark.rgb(NorthemDark.BLUE.get()), "rgb(135, 178, 206)");
    assertEquals(NorthemDark.rgb(NorthemDark.DARK_BLUE.get()), "rgb(91, 129, 175)");
    assertEquals(NorthemDark.rgb(NorthemDark.RED.get()), "rgb(224, 116, 115)");
    assertEquals(NorthemDark.rgb(NorthemDark.YELLOW.get()), "rgb(253, 206, 132)");
    assertEquals(NorthemDark.rgb(NorthemDark.ORANGE.get()), "rgb(240, 160, 111)");
    assertEquals(NorthemDark.rgb(NorthemDark.LIME.get()), "rgb(201, 204, 120)");
    assertEquals(NorthemDark.rgb(NorthemDark.PURPLE.get()), "rgb(194, 161, 202)");
  }
}
