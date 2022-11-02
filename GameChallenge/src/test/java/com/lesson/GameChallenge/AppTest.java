package com.lesson.GameChallenge;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;



@DisplayName("General Tests")
public class AppTest {
    
  @Test
  @DisplayName("Values don't match")
  void notEquals() {
	  assertNotEquals(10,20);
  }
  
  @Test
  void Equal() {
	  assertEquals(10,10);
  }
  
  @Test
  void torf() {
	  assertTrue(true);
  }
  
  @Test
  void torf2() {
	  assertFalse(false);
  }
//  public void shouldAnswerWithTrue() {
//    assertTrue(true);
//  }
}

