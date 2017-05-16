/*
 * This file was automatically generated by EvoSuite
 * Fri May 12 05:57:30 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, (String) null, (String) null);
      assertEquals(12, appt0.getStartHour());
      
      appt0.setStartHour(11);
      appt0.toString();
      assertEquals(11, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(0, 59, 59, 59, 59, (String) null, (String) null);
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(59, appt0.getStartYear());
      assertEquals(59, appt0.getStartMonth());
      assertEquals(59, appt0.getStartMinute());
      assertEquals(59, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 12, 12, 12, "e", "Ho.s|dQhTb/_8");
      boolean boolean0 = appt0.getValid();
      assertEquals(12, appt0.getStartYear());
      assertEquals(12, appt0.getStartMonth());
      assertEquals(12, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(12, appt0.getStartHour());
      assertEquals("Ho.s|dQhTb/_8", appt0.getDescription());
      assertTrue(boolean0);
      assertEquals("e", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "DKk[[-", "DKk[[-");
      String string0 = appt0.getTitle();
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals("DKk[[-", string0);
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
      assertEquals("DKk[[-", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(0, 487, 0, 0, 0, "W", (String) null);
      int int0 = appt0.getStartYear();
      assertEquals("W", appt0.getTitle());
      assertEquals("", appt0.getDescription());
      assertEquals(487, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt((-870), (-870), (-870), (-870), 113, "pm", "pm");
      int int0 = appt0.getStartYear();
      assertEquals(113, int0);
      assertEquals(-870, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(-870, appt0.getStartHour());
      assertEquals(-870, appt0.getStartMinute());
      assertEquals("pm", appt0.getTitle());
      assertEquals(-870, appt0.getStartDay());
      assertEquals("pm", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt((-1109), (-1109), (-1109), 0, 0, "1903-07-01T00:00:00Z", "1903-07-01T00:00:00Z");
      int int0 = appt0.getStartMonth();
      assertEquals(-1109, appt0.getStartHour());
      assertEquals(0, int0);
      assertEquals(-1109, appt0.getStartMinute());
      assertEquals("1903-07-01T00:00:00Z", appt0.getDescription());
      assertEquals(-1109, appt0.getStartDay());
      assertEquals("1903-07-01T00:00:00Z", appt0.getTitle());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(1618, 1618, 1618, (-3648), 168, "uU7r;May", "uU7r;May");
      int int0 = appt0.getStartMonth();
      assertEquals((-3648), int0);
      assertEquals("uU7r;May", appt0.getTitle());
      assertEquals(1618, appt0.getStartDay());
      assertEquals(1618, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(168, appt0.getStartYear());
      assertEquals(1618, appt0.getStartHour());
      assertEquals("uU7r;May", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, (String) null, (String) null);
      int int0 = appt0.getStartMinute();
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(112, 112, 112, 112, 112, "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(112, appt0.getStartHour());
      assertEquals(112, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(112, appt0.getStartMonth());
      assertEquals(112, appt0.getStartDay());
      assertEquals(112, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(1823, 1823, 1823, 0, 0, "T@VsOz6P8'KSS", "T@VsOz6P8'KSS");
      int int0 = appt0.getStartHour();
      assertEquals(1823, int0);
      assertEquals("T@VsOz6P8'KSS", appt0.getDescription());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(1823, appt0.getStartMinute());
      assertEquals(1823, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertEquals("T@VsOz6P8'KSS", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt((-3260), 0, 0, 0, 1914, "FqVS#J'QipuMj", "FqVS#J'QipuMj");
      int int0 = appt0.getStartDay();
      assertEquals(1914, appt0.getStartYear());
      assertEquals("FqVS#J'QipuMj", appt0.getTitle());
      assertEquals("FqVS#J'QipuMj", appt0.getDescription());
      assertEquals(-3260, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(694, 694, 694, 694, 694, "[)1zH?", "[)1zH?");
      String string0 = appt0.getDescription();
      assertEquals("[)1zH?", string0);
      assertEquals(694, appt0.getStartDay());
      assertEquals("[)1zH?", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(694, appt0.getStartMinute());
      assertEquals(694, appt0.getStartYear());
      assertEquals(694, appt0.getStartHour());
      assertEquals(694, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(710, 710, 710, 1837, 1837, "", "");
      appt0.setDescription("");
      assertEquals(1837, appt0.getStartYear());
      assertEquals(1837, appt0.getStartMonth());
      assertEquals(710, appt0.getStartHour());
      assertEquals(710, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(710, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(112, 112, 112, 112, 112, "", "");
      appt0.setTitle("");
      assertEquals(112, appt0.getStartHour());
      assertEquals(112, appt0.getStartYear());
      assertEquals(112, appt0.getStartMonth());
      assertEquals(112, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(112, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt((-3069), (-3069), (-3069), 0, 0, (String) null, "1696-09-01T00:00:00Z");
      assertEquals("", appt0.getTitle());
      
      appt0.setTitle((String) null);
      assertEquals(0, appt0.getStartYear());
      assertEquals(-3069, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-3069, appt0.getStartDay());
      assertEquals(-3069, appt0.getStartMinute());
      assertEquals("1696-09-01T00:00:00Z", appt0.getDescription());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 23, 0, 0, "", "");
      assertEquals(0, appt0.getStartMonth());
      assertEquals(23, appt0.getStartHour());
      assertEquals(23, appt0.getStartMinute());
      assertEquals(23, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, (String) null, (String) null);
      appt0.setDescription((String) null);
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt((-2635), (-2635), (-2635), 2293, (-2635), "", "");
      String string0 = appt0.toString();
      assertEquals(-2635, appt0.getStartMinute());
      assertEquals(2293, appt0.getStartMonth());
      assertEquals(-2635, appt0.getStartHour());
      assertEquals(-2635, appt0.getStartYear());
      assertEquals(-2635, appt0.getStartDay());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1, 1, ";jjm 3m*^nm$", ";jjm 3m*^nm$");
      String string0 = appt0.toString();
      assertEquals("\t1/1/1 at 1:1am ,;jjm 3m*^nm$, ;jjm 3m*^nm$\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt(0, 31, 31, 1762, 31, "InvalidFieldValue", "InvalidFieldValue");
      int int0 = appt0.getStartDay();
      assertEquals("InvalidFieldValue", appt0.getDescription());
      assertEquals(31, appt0.getStartMinute());
      assertEquals(31, appt0.getStartYear());
      assertEquals(31, int0);
      assertEquals(0, appt0.getStartHour());
      assertEquals(1762, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals("InvalidFieldValue", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt(0, 2541, (-2196), 0, 2541, (String) null, "2/wzUr~B@Qw|uU~");
      int int0 = appt0.getStartHour();
      assertEquals(0, int0);
      assertEquals(2541, appt0.getStartYear());
      assertEquals("", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-2196, appt0.getStartDay());
      assertEquals(2541, appt0.getStartMinute());
      assertEquals("2/wzUr~B@Qw|uU~", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt((-2635), (-2635), (-2635), 2293, (-2635), "", "");
      appt0.getTitle();
      assertEquals(-2635, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(-2635, appt0.getStartMinute());
      assertEquals(2293, appt0.getStartMonth());
      assertEquals(-2635, appt0.getStartDay());
      assertEquals(-2635, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt((-2635), (-2635), (-2635), 2293, (-2635), "", "");
      int int0 = appt0.getStartYear();
      assertEquals(-2635, appt0.getStartDay());
      assertEquals(-2635, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals((-2635), int0);
      assertEquals(-2635, appt0.getStartHour());
      assertEquals(2293, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt((-3069), (-3069), (-3069), 0, 0, (String) null, "1696-09-01T00:00:00Z");
      int int0 = appt0.getStartDay();
      assertEquals(0, appt0.getStartMonth());
      assertEquals("1696-09-01T00:00:00Z", appt0.getDescription());
      assertEquals(-3069, appt0.getStartHour());
      assertEquals("", appt0.getTitle());
      assertEquals((-3069), int0);
      assertEquals(0, appt0.getStartYear());
      assertEquals(-3069, appt0.getStartMinute());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt((-2635), (-2635), (-2635), 2293, (-2635), "", "");
      int int0 = appt0.getStartHour();
      assertEquals(2293, appt0.getStartMonth());
      assertEquals((-2635), int0);
      assertEquals(-2635, appt0.getStartYear());
      assertEquals(-2635, appt0.getStartMinute());
      assertEquals(-2635, appt0.getStartDay());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt((-2635), (-2635), (-2635), 2293, (-2635), "", "");
      appt0.setStartMinute((-2635));
      assertEquals(-2635, appt0.getStartDay());
      assertEquals(2293, appt0.getStartMonth());
      assertEquals(-2635, appt0.getStartYear());
      assertEquals(-2635, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(-2635, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt((-2635), (-2635), (-2635), 2293, (-2635), "", "");
      appt0.getDescription();
      assertEquals(-2635, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(-2635, appt0.getStartMinute());
      assertEquals(-2635, appt0.getStartDay());
      assertEquals(2293, appt0.getStartMonth());
      assertEquals(-2635, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(195, 4554, 4554, 4554, 195, "xc4@haEYuphZ6-r", (String) null);
      int int0 = appt0.getStartMonth();
      assertEquals("", appt0.getDescription());
      assertEquals("xc4@haEYuphZ6-r", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(195, appt0.getStartYear());
      assertEquals(4554, int0);
      assertEquals(195, appt0.getStartHour());
      assertEquals(4554, appt0.getStartDay());
      assertEquals(4554, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 12, 12, 12, "e", "Ho.s|dQhTb/_8");
      assertEquals(12, appt0.getStartYear());
      
      appt0.setStartYear(0);
      assertTrue(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 59, 0, 0, "KSH$Yn#uY", "KSH$Yn#uY");
      appt0.setStartDay((-839));
      assertEquals(-839, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt((-3069), (-3069), (-3069), 0, 0, (String) null, "1696-09-01T00:00:00Z");
      assertEquals(-3069, appt0.getStartHour());
      
      appt0.setStartHour(0);
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt((-2235), (-2235), (-2235), (-2235), (-2235), "", "");
      boolean boolean0 = appt0.getValid();
      assertEquals(-2235, appt0.getStartYear());
      assertEquals(-2235, appt0.getStartHour());
      assertEquals(-2235, appt0.getStartMonth());
      assertFalse(boolean0);
      assertEquals(-2235, appt0.getStartDay());
      assertEquals(-2235, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, (-1351), 12, "!Ez", "!Ez");
      assertEquals(-1351, appt0.getStartMonth());
      
      appt0.setStartMonth(12);
      String string0 = appt0.toString();
      assertEquals("\t12/12/12 at 12:12pm ,!Ez, !Ez\n", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Appt appt0 = new Appt((-1763), (-1763), (-1763), (-1763), (-1763), "5yk*miDOaU", "5yk*miDOaU");
      int int0 = appt0.getStartMinute();
      assertEquals(-1763, appt0.getStartHour());
      assertEquals(-1763, appt0.getStartYear());
      assertEquals("5yk*miDOaU", appt0.getDescription());
      assertEquals((-1763), int0);
      assertEquals(-1763, appt0.getStartDay());
      assertEquals("5yk*miDOaU", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-1763, appt0.getStartMonth());
  }
}