CS1302 Homework 3

1.	Write a java program that calls a method called removeZeroes that takes as a parameter an ArrayList of integers and eliminates any occurrences of the number 0 from the list. For example, if the list stores the values [0, 4, 5, 0, 6, 0, 1] before the method is called, it should store the values [4, 5, 6, 1] after the method finishes executing. Print the ArrayList before and after the method call. 
 
2.	a. Given the CalendarDate class below, complete the class to include a constructor, accessors, mutators, toString method and a compareTo metho. Years take precedence over months, which take precedence over days. For example, August 21, 2011 comes before March 3, 2018 
 
public class CalendarDate implements Comparable<CalendarDate> {     private int year;     private int month; 
    private int day; 
 …
} 

b. Write a client class that creates an ArrayList with  at least 5 objects of the CalendarDate class. Print the ArrayList, then sort the ArrayList and print it again. Note: you can use Collections.sort() to sort your ArrayList after you implement the compareTo() method. 
 
For example:  
ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>(); dates.add(new CalendarDate(2010,02,15)); dates.add(new CalendarDate(1977,10,22)); dates.add(new CalendarDate(2010,01,22)); 
 
 
      Collections.sort(dates); // will sort the elements of the ArrayList using the  	//compareTo method defined in CalendarDate class/ 
