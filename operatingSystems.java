package com.batemadevelopment.util;

import java.util.*;

/** Represents the Custom Operating Systems class
 * @author Lukas Batema
 * @author www.batemadevelopment.com
 * @version 0.0.1
 * @since 0.0.1
*/
public class operatingSystems {
  
  /** Represents the sc Scanner
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  static Scanner sc = Scanner();
  
  /** Represents the lineDivider public String
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public String lineDivider = "==========";
  
  /** Represents the error404 public String
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public String error404 = "ERROR 404\n" + lineDivider + "\nPage not found...";
  public String error405 = "ERROR 405\n" + lineDivider + "\n";
  public String error406 = "ERROR 406\n" + lineDivider + "\n";
  public String error407 = "ERROR 407\n" + lineDivider + "\n";
  public String error408 = "ERROR 408\n" + lineDivider + "\n";
  
  /** Represents the osLogo private String
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  private String osLogo;
  
  /** Represents the osName private String
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  private String osName;
  
  /** Represents the main method
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public static void main(String[] args) {
	String welcomeMessage = "Welcome to the custom OS downloader. Please type the number of the OS, on the list below to find out more about it, or download it!";
	String osList = "1) chromacOS\n2) Exit";
	int optionSelect = sc.newInt();
	
	if (optionSelect === 1) {
	  chromacOS();
	} else if (optionSelect === 2) {
	  exitProgram();
	} else {
	  System.out.println(error404);
	}  
	
	System.out.println(welcomeMessage + "\n" + lineDivider + "\n" + osList + "\n");
  }
  
  /** Represents the chromacOS method
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public static void chromacOS() {
	osName = "chromacOS";
	osLogo = "";
	String chromacOSList = "1) Download\n2) About\n3) Exit";
	int optionSelect = sc.newInt();
	
	if (optionSelect === 1) {
	  chromacOSDownload();
	} else if (optionSelect === 2) {
	  chromacOSAbout();
	} else if (optionSelect === 3) {
	  exitProgram();
	} else {
	  System.out.println(error404);
	}
	
	System.out.println(osLogo + "\n" + osName + "\n" + lineDivider + "\n" + chromacOSList + "\n");
  }
  
  /** Represents the chromeOSDownload method
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public static void chromacOSDownload() {
	System.out.println(error404);
  }
  
  /** Represents the chromacOSAbout method
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public static void chromacOSAbout() {
	String aboutOS = "chromacOS is made for the Chromebooks. It is a mash-up between macOS and chromeOS.\n";
	
	System.out.println(aboutOS);
	
	String chromacOSAboutList = "1) Exit\n2) chromacOS Download";
	int optionSelect = sc.newInt();
	
	if (optionSelect === 1) {
	  exitProgram();
	} else if (optionSelect === 2) {
	  chromacOSDownload();
	} else {
	  System.out.println(error404);
	}
  }
  
  /** Represents the exitProgram method
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public static void exitProgram() {
	String exitMessage = "Thank you for using this program!";
	
	System.out.println(exitMessage);
  }
}