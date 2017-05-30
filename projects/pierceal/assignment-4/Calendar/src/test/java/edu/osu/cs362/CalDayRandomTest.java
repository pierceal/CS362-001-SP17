package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
    @Test
    public void radnomtest()  throws Throwable  {
        LinkedList<Appt> appts = new LinkedList<Appt>();
        int testNum=0;
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
        for(int i=0; i<=2; i++){
            System.out.println("My CalDay test number: " + testNum);
            testNum++;
            appt = new Appt(startHour,
                                startMinute ,
                                startDay ,
                                startMonth ,
                                startYear ,
                                title,
                                description);
            startHour=13;
            startMinute=30;
            startDay=10;
            startMonth=4;
            startYear=2017;
            cal.addAppt(appt);

        }
    }
}
