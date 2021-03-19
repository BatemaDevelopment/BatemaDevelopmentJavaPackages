import java.util.*;

package com.batemadevelopment.util;

public class coffeeBeansCalculator {
  static Scanner sc = Scanner();
  public static void main(String[] args) {
    String appName = "COFFEE BEANS CALCULATOR";
    String lineDivider = "==========";
    String coffeeBeansCalculatorLogo = "\n\t\t(\t\t(\t\t(\t\t\n\t\t)\t\t)\t\t)\t\t\n\t\t(\t\t(\t\t(\t\t\n____________________/\t\t\| \t\t | \\\t\t/————————————————————|\t\t||\t\t|\\\t\t/\\ \t /———————————————————";
    
    // Start-Up Screen
    System.out.println(appName);
    System.out.println(lineDivider);
    System.out.println(coffeeBeansCalculatorLogo);
    System.out.println(lineDivider);
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
    
    // Menu Selection
    System.out.println("Coffee Beans Calculator Main Menu\n" + lineDivider + "1) General Calculator\n2) Currency and Finance Calculator\n3) Geometry Calculator\n4)Algebra Calculator\n5) Pre-Calculus and Calculus Calculator\n6) Chemestry Calculator\n7) Exit\n" + lineDivider + "Type the number of the desired option and then press return, to open it's sub-menu.");
    
    int menuSelection = sc.newInt();
    
    if (menuSelection > 0 && menuSelection < 8 && menuSelection === 9) {
      if (menuSelection === 1) {
        generalCalculator();
      } else if (menuSelection === 2) {
        moneyCalculator();
      } else if (menuSelection === 3) {
        geometryCalculator();
      } else if (menuSelection === 4) {
        algebraCalculator();
      } else if (menuSelection === 5) {
        calculusCalculator();
      } else if (menuSelection === 6) {
        chemestryCalculator();
      } else if (menuSelection === 7) {
        exitCaclulator();
      } else if (menuSelection === 9) {
        secertCalculator();
      }
    } else {
      errorMessage();
    }
  }
  
  public static void errorMessage() {
    // App Crash
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nPlease restart the app and choose a number from 1 to 7, thanks!");
    return
  }
  
  public static void generalCalculator() {
    String lineDivider = "==========";
    System.out.println("This calculator can only do basic addition, subtraction, division, and multiplication, that's about it.");
    System.out.println(lineDivider);
    
    System.out.println("Coffee Beans Calculator General Calculator Menu\n" + lineDivider + "1) Two Number Addition\n2) Two Number Subtraction\n3) Two Number Division\n4)Two Number Multiplication\n5) Exit\n" + lineDivider + "Type the number of the desired option and then press return, to open it's sub-menu.");
    
    int generalCalculatorSelection = sc.newInt();
    
    if (generalCalculatorSelection > 0 && generalCalculatorSelection < 6) {
      if (generalCalculatorSelection === 1) {
        basicAddition();
      } else if (generalCalculatorSelection === 2) {
        basicSubtraction();
      } else if (generalCalculatorSelection === 3) {
        basicDivision();
      } else if (generalCalculatorSelection === 4) {
        basicMultiplication();
      } else if (generalCalculatorSelection === 5) {
        exitCalculator();
      }
    } else {
      errorMessage();
    }
  }
  
  public static void moneyCalculator() {
    String lineDivider = "==========";
    System.out.println("This calculator is for calculating financial and currency related subjects. DO NOT USE THIS FOR TAXES OR RELATED THINGS, AS WE ARE NOT LIABLE FOR MISCALCULATION IN TAXES OR IN RELATED FEDERAL DOCUMENTS!");
    System.out.println(lineDivider);
    
    System.out.println("Coffee Beans Calculator General Calculator Menu\n" + lineDivider + "1) Two Number Addition\n2) Two Number Subtraction\n3) Two Number Division\n4)Two Number Multiplication\n5) Exit\n" + lineDivider + "Type the number of the desired option and then press return, to open it's sub-menu.");
    
    int moneyCalculatorSelection = sc.newInt();
    
    if (moneyCalculatorSelection > 0 && moneyCalculatorSelection < 8) {
      if (moneyCalculatorSelection === 1) {
        
      } else if (moneyCalculatorSelection === 2) {
        
      } else if (moneyCalculatorSelection === 3) {
        
      } else if (moneyCalculatorSelection === 4) {
        
      } else if (moneyCalculatorSelection === 5) {
        
      } else if (moneyCalculatorSelection === 6) {
        
      } else if (moneyCalculatorSelection === 7) {
        
      }
    } else {
      errorMessage();
    }
  }
  
  public static void geometryCalculator() {
    String lineDivider = "==========";
    System.out.println("This calculator is for geometric calculations, mainly with area and volume of shapes.");
    System.out.println(lineDivider);
    
    System.out.println("Coffee Beans Calculator General Calculator Menu\n" + lineDivider + "1) Two Number Addition\n2) Two Number Subtraction\n3) Two Number Division\n4)Two Number Multiplication\n5) Exit\n" + lineDivider + "Type the number of the desired option and then press return, to open it's sub-menu.");
    
    int moneyCalculatorSelection = sc.newInt();
    
    if (moneyCalculatorSelection > 0 && moneyCalculatorSelection < 8) {
      if (moneyCalculatorSelection === 1) {
        
      } else if (moneyCalculatorSelection === 2) {
        
      } else if (moneyCalculatorSelection === 3) {
        
      } else if (moneyCalculatorSelection === 4) {
        
      } else if (moneyCalculatorSelection === 5) {
        
      } else if (moneyCalculatorSelection === 6) {
        
      } else if (moneyCalculatorSelection === 7) {
        
      }
    } else {
      errorMessage();
    }
  }
  
  public static void algebraCalculator() {
    String lineDivider = "==========";
    System.out.println("This calculator is for algebraic calculations, mainly the more simple ones");
    System.out.println(lineDivider);
  }
  
  public static void calculusCalculator() {
    String lineDivider = "==========";
    System.out.println("This calculator is for calculus calculations, mainly the more simple ones");
    System.out.println(lineDivider);
  }
  
  public static void chemestryCalculator() {
    String lineDivider = "==========";
    System.out.println("This calculator is for chemestry calculations");
    System.out.println(lineDivider);
  }
  
  public static void secertCalculator() {
    String lineDivider = "==========";
    System.out.println("You found the easter egg... Although it is not ready to be used yet. Sorry!");
    System.out.println(lineDivider);
  }
}
