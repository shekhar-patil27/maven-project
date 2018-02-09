package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
  * @param someone accept string
  * @return returns string format
  */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
