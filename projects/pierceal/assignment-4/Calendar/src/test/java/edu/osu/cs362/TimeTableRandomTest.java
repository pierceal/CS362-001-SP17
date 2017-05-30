package edu.osu.cs362;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
          Calendar rightnow = Calendar.getInstance();
          int thisMonth = rightnow.get(Calendar.MONTH)+1;
          int thisYear = rightnow.get(Calendar.YEAR);
          int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);
          int startHour=15;
          int startMinute=30;
          int startDay=thisDay;
          int startMonth=thisMonth;
          int startYear=thisYear;
          String title="Birthday Party";
          String description="This is my birthday party.";
          //Construct today and tomorrow objects
          GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);
          GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
          tomorrow.add(Calendar.DAY_OF_MONTH,1);
          //Construct a new TimeTable object
          TimeTable timeTable=new TimeTable();
          //Construct new linked list objects
          LinkedList<CalDay> calDays = new LinkedList<CalDay>();
          LinkedList<Appt> listAppts = new LinkedList<Appt>();
          LinkedList<Appt> appts = new LinkedList<Appt>();
          LinkedList<GregorianCalendar> result = new LinkedList<GregorianCalendar>();
          //Construct a new Appointment object with the initial data
          Appt appt = new Appt(startHour,
                               startMinute ,
                               startDay ,
                               startMonth ,
                               startYear ,
                               title,
                               description);
          for(int i=0; i<=3; i++){
              appt = new Appt(startHour,
                              startMinute ,
                              startDay ,
                              startMonth ,
                              startYear ,
                              title,
                              description);
              listAppts.add(appt);
              timeTable.getApptRange(listAppts,today,tomorrow);
              startHour=13;
          }
          for(int j=0; j<=5; j++){
              timeTable.deleteAppt(listAppts, appt);
              timeTable.deleteAppt(appts, appt);
          }
          appt = null;
          appts = null;
          timeTable.deleteAppt(listAppts, appt);
          timeTable.deleteAppt(appts, appt);
          startHour=24;
          appt = new Appt(startHour,
                          startMinute ,
                          startDay ,
                          startMonth ,
                          startYear ,
                          title,
                          description);
          listAppts.add(appt);
          timeTable.getApptRange(listAppts,today,tomorrow);
          timeTable.deleteAppt(listAppts, appt);
          timeTable.deleteAppt(appts, appt);
	 }
}
