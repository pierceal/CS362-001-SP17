package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	/**
	 * Return a randomly selected method to be tests !.
	 */
    public static String RandomSelectMethod(Random random){
        String[] methodArray = new String[] {"setTitle","setDescription"};// The list of the of methods to be tested in the Appt class

    	int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)
    	            
        return methodArray[n] ; // return the method name 
        }
	
    /**
     * Generate Random Tests that tests Appt Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing...");
		 
		 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =10;//System.currentTimeMillis();
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
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
				for (int i = 0; i < NUM_TESTS; i++) {
					String methodName = ApptRandomTest.RandomSelectMethod(random);
					   if (methodName.equals("setTitle")){
						   String newTitle=(String) ValuesGenerator.getString(random);
						   appt.setTitle(newTitle);						   
						}
					
				}
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 
            }
          
          /*
           * My testing: Finishes testing setDecription and isValid
           */
          int testNum=0;
          int startHour=0;
          int startMinute=0;
          int startDay=0;
          int startMonth=0;
          int startYear=0;
          Appt appts = new Appt(startHour,
                               startMinute ,
                               startDay ,
                               startMonth ,
                               startYear ,
                               null,
                               null);
          // finish testing setDescription
          appts.setDescription(null);
          // finish testing isValid
          for(startHour=-1; startHour<=24; startHour++){
              for(startMinute=-1; startMinute<=60; startMinute++){
                  for(startDay=0; startDay<=32; startDay++){
                      for(startMonth=0; startMonth<=13; startMonth++){
                            System.out.println("My Appt test number: " + testNum);
                            testNum++;
                            appts.setStartHour(startHour);
                            appts.setStartMinute(startMinute);
                            appts.setStartDay(startDay);
                            appts.setStartMonth(startMonth);
                      }
                  }
              }
          }
          

          
          
	 
	 
		 System.out.println("Done testing...");
	 }


	
}
