package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmailExampleTest {
  private static EmailExample emailExample;
  public static final String validEmail = "test1@gmail.com";

  @Test
  public void testCheck() {
    emailExample = new EmailExample();
    assertEquals(emailExample.validate(validEmail), true);
  }
}