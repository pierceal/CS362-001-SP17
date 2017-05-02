package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test00()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
    
    
    /**
     * Test with hour too high.
     */
    @Test
    public void test01()  throws Throwable  {
        int startHour=24;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Hour too high";
        String description="Tests when hour is too high.";
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertFalse(appt.getValid());
    }
    /**
     * Test with hour too low.
     */
    @Test
    public void test02()  throws Throwable  {
        int startHour=-1;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Hour too low";
        String description="Tests when hour is too low.";
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertFalse(appt.getValid());
    }
    
    /**
     * Test with minute too high.
     */
    @Test
    public void test03()  throws Throwable  {
        int startHour=13;
        int startMinute=60;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Minute too high";
        String description="Tests when minute is too high.";
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertFalse(appt.getValid());
    }
    /**
     * Test with minute too low.
     */
    @Test
    public void test04()  throws Throwable  {
        int startHour=13;
        int startMinute=-1;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Minute too low";
        String description="Tests when minute is too low.";
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertFalse(appt.getValid());
    }

    /**
     * Test with day too high.
     */
    @Test
    public void test05()  throws Throwable  {
        int startHour=13;
        int startMinute=30;
        int startDay=32;
        int startMonth=4;
        int startYear=2017;
        String title="Day too high";
        String description="Tests when day is too high.";
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertFalse(appt.getValid());
    }
    /**
     * Test with day too low.
     */
    @Test
    public void test06()  throws Throwable  {
        int startHour=13;
        int startMinute=30;
        int startDay=0;
        int startMonth=4;
        int startYear=2017;
        String title="Day too low";
        String description="Tests when day is too low.";
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertFalse(appt.getValid());
    }
    
    /**
     * Test with month too high.
     */
    @Test
    public void test07()  throws Throwable  {
        int startHour=13;
        int startMinute=30;
        int startDay=10;
        int startMonth=13;
        int startYear=2017;
        String title="Month too high";
        String description="Tests when month is too high.";
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertFalse(appt.getValid());
    }
    /**
     * Test with month too low.
     */
    @Test
    public void test08()  throws Throwable  {
        int startHour=13;
        int startMinute=30;
        int startDay=10;
        int startMonth=0;
        int startYear=2017;
        String title="Month too low";
        String description="Tests when month is too low.";
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertFalse(appt.getValid());
    }
    
    /**
     * First test that toString works as expected.
     */
    @Test
    public void test09()  throws Throwable  {
        int startHour=12;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Birthday Party";
        String description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertEquals("\t4/10/2017 at 12:30pm ,Birthday Party, This is my birthday party.\n", appt.toString());
     		
    }
    /**
     * Second test that toString works as expected.
     */
    @Test
    public void test10()  throws Throwable  {
        int startHour=0;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Birthday Party";
        String description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertEquals("\t4/10/2017 at 12:30am ,Birthday Party, This is my birthday party.\n", appt.toString());
        
    }
    /**
     * Third test that toString works as expected.
     */
    @Test
    public void test11()  throws Throwable  {
        int startHour=1;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Birthday Party";
        String description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertEquals("\t4/10/2017 at 1:30am ,Birthday Party, This is my birthday party.\n", appt.toString());
        
    }
    /**
     * Fourth test that toString works as expected.
     */
    @Test
    public void test12()  throws Throwable  {
        int startHour=-1;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title=null;
        String description=null;
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertEquals(null, appt.toString());
    }
    
    /**
     * Test that the set methods work as expected.
     */
    @Test
    public void test13()  throws Throwable  {
        int startHour=13;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Birthday Party";
        String description="This is my birthday party.";
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        assertEquals(13, appt.getStartHour());
        assertEquals(30, appt.getStartMinute());
        assertEquals(10, appt.getStartDay());
        assertEquals(4, appt.getStartMonth());
        assertEquals(2017, appt.getStartYear());
        appt.setStartHour(14);
        appt.setStartMinute(31);
        appt.setStartDay(11);
        appt.setStartMonth(5);
        appt.setStartYear(2018);
        assertEquals(14, appt.getStartHour());
        assertEquals(31, appt.getStartMinute());
        assertEquals(11, appt.getStartDay());
        assertEquals(5, appt.getStartMonth());
        assertEquals(2018, appt.getStartYear());
    
        
    }
 }
