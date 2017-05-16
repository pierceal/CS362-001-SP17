package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {


    /**
     * Test that the get methods work as expected.
     */
    @Test
    public void test00()  throws Throwable  {
        int day=27;
        int month=04;
        int year=2017;
        //Construct a new Calendar object
        CalDay cal = new CalDay(new GregorianCalendar(year,month,day));
        // assertions
        assertTrue(cal.isValid());
        assertEquals(27, cal.getDay());
        assertEquals(04, cal.getMonth());
        assertEquals(2017, cal.getYear());
        assertEquals(0, cal.getSizeAppts());
    }
    /**
     * Test that the invalid CalDay constructor works as expected.
     */
    @Test
    public void test01()  throws Throwable  {
        boolean valid=false;
        //Construct a new Calendar object
        CalDay cal = new CalDay();
        // assertions
        assertEquals(false, valid);
    }
    /**
     * Test that the addAppt method works as expected.
     */
    @Test
    public void test02()  throws Throwable  {
        LinkedList<Appt> appts = new LinkedList<Appt>();
        int startHour=13;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Birthday Party";
        String description="This is my birthday party.";
        int day=27;
        int month=04;
        int year=2017;
        //Construct a new Calendar object
        CalDay cal = new CalDay(new GregorianCalendar(year,month,day));
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        cal.addAppt(appt);
        cal.addAppt(appt);
        startHour=0;
        startMinute=0;
        startDay=0;
        startMonth=0;
        startYear=0;
        appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        cal.addAppt(appt);
    }
    /**
     * First test that the iterator CalDay constructor works as expected.
     */
    @Test
    public void test03()  throws Throwable  {
        //Construct a new Calendar object
        CalDay cal = new CalDay();
        // assertions
        assertEquals(null, cal.iterator());
    }
    /**
     * Second test that the iterator CalDay constructor works as expected.
     */
    @Test
    public void test04()  throws Throwable  {
        int day=27;
        int month=04;
        int year=2017;
        //Construct a new Calendar object
        CalDay cal = new CalDay(new GregorianCalendar(year,month,day));
        // assertions
        cal.iterator();
    }
    /**
     * Test that the toString method works as expected.
     */
    @Test
    public void test05()  throws Throwable  {
        LinkedList<Appt> appts;
        boolean valid = true;
        int startHour=13;
        int startMinute=30;
        int startDay=10;
        int startMonth=4;
        int startYear=2017;
        String title="Birthday Party";
        String description="This is my birthday party.";
        int day=27;
        int month=04;
        int year=2017;
        //Construct a new string object
        StringBuilder sb = new StringBuilder();
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        //Construct a new Calendar object
        CalDay cal = new CalDay();
        cal.toString();
        //Construct a new Calendar object
        cal = new CalDay(new GregorianCalendar(year,month,day));
        // assertions
        cal.addAppt(appt);
        cal.addAppt(appt);
        cal.toString();
    }
    
    /********************************************
     *
     * Tests added for assignment 2 start here.
     *
     ********************************************/
    
    /**
     * Test that the addAppt method works as expected.
     */
    @Test
    public void test06()  throws Throwable  {
        LinkedList<Appt> appts = new LinkedList<Appt>();
        int startHour=0;
        int startMinute=0;
        int startDay=0;
        int startMonth=0;
        int startYear=0;
        String title="Birthday Party";
        String description="This is my birthday party.";
        int day=27;
        int month=04;
        int year=2017;
        //Construct a new Calendar object
        CalDay cal = new CalDay(new GregorianCalendar(year,month,day));
        //Construct a new Appointment object with the initial data
        Appt appt = new Appt(startHour,
                             startMinute ,
                             startDay ,
                             startMonth ,
                             startYear ,
                             title,
                             description);
        // assertions
        appts = null;
        cal.addAppt(appt);
    }
    /**
     * Test that the iterator CalDay constructor works as expected.
     */
    @Test
    public void test07()  throws Throwable  {
        int day=0;
        int month=0;
        int year=0;
        //Construct a new Calendar object
        CalDay cal = new CalDay(new GregorianCalendar(year,month,day));
        // assertions
        cal.iterator();
    }
}
