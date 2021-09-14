/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yesenia Cata
 */
import java.util.Scanner;

public class Main{

public static void main(String[] args) {

String months = "January Febuary March April May June July August September October November December, "; //determines the strings 
int month;
Scanner scan=new Scanner(System.in); //scans what user inputs 

System.out.print("Please enter a month number from 1 to 12: "); //asks user to input a number from 1 to 12
month=scan.nextInt();

if(month>0 && month<13){ //uses input from user to print name of month based on number
System.out.print(months.substring((month-1)*9, ((month-1)*9)+9));
}
else
System.out.println("Invalid number entered.");
scan.close();v // only prints if number higher than 12 is inputted
}
}