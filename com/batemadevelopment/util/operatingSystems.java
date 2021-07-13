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
  static Scanner sc = new Scanner(System.in);
  
  /** Represents the lineDivider public String
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public static String lineDivider = "==========";
  
  /** Represents the error404 public String
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public static String error404 = "ERROR 404\n" + lineDivider + "\nPage not found...";
  public static String error405 = "ERROR 405\n" + lineDivider + "\n";
  public static String error406 = "ERROR 406\n" + lineDivider + "\n";
  public static String error407 = "ERROR 407\n" + lineDivider + "\n";
  public static String error408 = "ERROR 408\n" + lineDivider + "\n";
  
  /** Represents the osLogo private String
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  private static String osLogo;
  
  /** Represents the osName private String
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  private static String osName;
  
  /** Represents the main method
   * @author Lukas Batema
   * @author www.batemadevelopment.com
   * @version 0.0.1
   * @since 0.0.1
  */
  public static void main(String[] args) {
  	String welcomeMessage = "Welcome to the custom OS downloader. Please type the number of the OS, on the list below to find out more about it, or download it!";
	  String osList = "1) chromacOS\n2) Exit";
    System.out.println(welcomeMessage + "\n" + lineDivider + "\n" + osList + "\n");
    
    int optionSelect = sc.nextInt();

	  if (optionSelect == 1) {
	    chromacOS();
	  } else if (optionSelect == 2) {
	    exitProgram();
	  } else {
	    System.out.println(error404);
	  }  
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
    System.out.println(chromacOSList);

    int optionSelect = sc.nextInt();

    if (optionSelect == 1) {
  	  chromacOSDownload();
  	} else if (optionSelect == 2) {
	    chromacOSAbout();
	  } else if (optionSelect == 3) {
	    exitProgram();
	  } else {
	    System.out.println(error404);
  	}
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
    System.out.println(chromacOSAboutList);

    int optionSelect = sc.nextInt();
	
  	if (optionSelect == 1) {
	    exitProgram();
	  } else if (optionSelect == 2) {
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