/*
+++++++++++++++++++++++++++++++++++++++++++++
title     Northem Dark Color Palette        +
project   northem-dark-java                 +
file      NorthemDark.java                  +
version                                     +
author    Arctic Ice Studio                 +
email     development@arcticicestudio.com   +
website   http://arcticicestudio.com        +
copyright Copyright (C) 2016                +
created   2016-01-23 15:42 UTC+0100         +
modified  2016-04-09 13:49 UTC+0200         +
+++++++++++++++++++++++++++++++++++++++++++++

[Description]
"Northem Dark" color palette as enumeration for the "Northem Dark - Java" project.

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

import javafx.scene.paint.Color;
import java.util.regex.Pattern;

/**
 * <a href="https://github.com/arcticicestudio/northem-dark">Northem Dark</a> color palette
  * as enumeration of the <a href="https://github.com/arcticicestudio/northem-dark-java">Northem Dark - Java</a> project.
 * <div>
 *   <table style="display:inline-block">
 *     <thead>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(31,31,35);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(36,36,41);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(41,41,46);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(79,79,89);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(222,222,222);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(236,238,239);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(143,206,200);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(133,193,211);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(135,178,206);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(91,129,175);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(224,116,115);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(253,206,132);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(240,160,111);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(201,204,120);margin: 0"></th>
 *       <th style="border:none;width:25px;height:30px;background-color:rgb(194,161,202);margin: 0"></th>
 *     </thead>
 *   </table>
 * </div>
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @see <a href="https://github.com/arcticicestudio/northem-dark">"Northem Dark" GitHub Repository</a>
 * @see <a href="https://github.com/arcticicestudio/northem-dark-java">"Northem Dark - Java" GitHub Repository</a>
 * @since 0.1.0
 */
public enum NorthemDark {
  /**
   * The color {@code darkest-coal} with an RGB value of {@code rgb(31,31,35)} and HEX value of {@code #1F1F23}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(31,31,35);margin: 0"></div>
   */
  DARKEST_COAL(31,31,35),
  /**
   * The color {@code dark-coal} with an RGB value of {@code rgb(36,36,41)} and HEX value of {@code #242429}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(36,36,41);margin: 0"></div>
   */
  DARK_COAL(36,36,41),
  /**
   * The color {@code coal} with an RGB value of {@code rgb(41,41,46)} and HEX value of {@code #29292E}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(41,41,46);margin: 0"></div>
   */
  COAL(41,41,46),
  /**
   * The color {@code light-coal} with an RGB value of {@code rgb(79,79,89)} and HEX value of {@code #4F4F59}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(79,79,89);margin: 0"></div>
   */
  LIGHT_COAL(79,79,89),
  /**
   * The color {@code dirty-white} with an RGB value of {@code rgb(222,222,222)} and HEX value of {@code #DEDEDE}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(222,222,222);margin: 0"></div>
   */
  DIRTY_WHITE(222,222,222),
  /**
   * The color {@code white} with an RGB value of {@code rgb(236,238,239)} and HEX value of {@code #ECEEEF}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(236,238,239);margin: 0"></div>
   */
  WHITE(236,238,239),
  /**
   * The color {@code aqua} with an RGB value of {@code rgb(143,206,200)} and HEX value of {@code #8FCEC8}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(143,206,200);margin: 0"></div>
   */
  AQUA(143,206,200),
  /**
   * The color {@code light-blue} with an RGB value of {@code rgb(133,193,211)} and HEX value of {@code #85C1D3}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(133,193,211);margin: 0"></div>
   */
  LIGHT_BLUE(133,193,211),
  /**
   * The color {@code blue} with an RGB value of {@code rgb(135,178,206)} and HEX value of {@code #87B2CE}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(135,178,206);margin: 0"></div>
   */
  BLUE(135,178,206),
  /**
   * The color {@code dark-blue} with an RGB value of {@code rgb(91,129,175)} and HEX value of {@code #5B81AF}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(91,129,175);margin: 0"></div>
   */
  DARK_BLUE(91,129,175),
  /**
   * The color {@code red} with an RGB value of {@code rgb(224,116,115)} and HEX value of {@code #E07473}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(224,116,115);margin: 0"></div>
   */
  RED(224,116,115),
  /**
   * The color {@code yellow} with an RGB value of {@code rgb(253,206,132)} and HEX value of {@code #FDCE84}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(253,206,132);margin: 0"></div>
   */
  YELLOW(253,206,132),
  /**
   * The color {@code orange} with an RGB value of {@code rgb(240,160,111)} and HEX value of {@code #F0A06F}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(240,160,111);margin: 0"></div>
   */
  ORANGE(240,160,111),
  /**
   * The color {@code lime} with an RGB value of {@code rgb(201,204,120)} and HEX value of {@code #C9CC78}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(201,204,120);margin: 0"></div>
   */
  LIME(201,204,120),
  /**
   * The color {@code purple} with an RGB value of {@code rgb(194,161,202)} and HEX value of {@code #C2A1CA}.
   * <div style="border:none;width:25px;height:30px;background-color:rgb(194,161,202);margin: 0"></div>
   */
  PURPLE(194,161,202);

  /**
   * Compiled pattern to convert the RGB and HEX color values.
   */
  private static final Pattern COLOR_PREFIX = Pattern.compile("0x", Pattern.LITERAL);

  /**
   * Contains the RGB color code.
   */
  private final Color COLOR;

  /**
   * Constructs a new color object.
   *
   * @param RED The value for the additive primary color {@code red}
   * @param GREEN The value for the additive primary color {@code green}
   * @param BLUE The value for the additive primary color {@code blue}
   */
  NorthemDark(final int RED, final int GREEN, final int BLUE) {
    COLOR = Color.rgb(RED, GREEN, BLUE);
  }
}
