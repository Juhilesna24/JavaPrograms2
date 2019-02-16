/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import static java.time.Instant.now;
import static java.time.Instant.now;
import static java.time.chrono.HijrahDate.now;
import java.util.Calendar;
import java.util.*;
/**
 *
 * @author my pc
 */
public class cal {
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();
        System.out.println("Date:"+c.get(Calendar.DATE));
        System.out.println("Month:"+c.get(Calendar.MONTH));
        System.out.println("Year:"+c.get(Calendar.YEAR));
        System.out.println("Current date : " + (c.get(Calendar.MONTH) + 1) + "-"
        + c.get(Calendar.DATE) + "-" + c.get(Calendar.YEAR));

    String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
        "Friday", "Saturday" };
    
    System.out.println("Current day is : " + strDays[c.get(Calendar.DAY_OF_WEEK) - 1]);
 
    }
    
}
