package com.ontariotechu.sofe3980U;
import org.joda.time.LocalTime;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      LocalTime currentTime = new LocalTime();
      System.out.println("The current local time is " + currentTime);
       Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());
      
      Binary and=Binary.and(binary1,binary2);
       System.out.println("Their and is " +and.getValue());
    }
}
