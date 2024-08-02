package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
	/*	String s="Welcome"; // String s=new String("Welcome");
		
		System.out.println(s);
	*/
		
		//length() - returns of a string(number of characters)
		
		String s="Welcome";
		s.length();
		
		System.out.println(s.length()); //7
		
		System.out.println("Welcome".length()); //7
		
		
		
		//concat() - joining strings
		
		String s1="Welcome";
		String s2="java";
		String s3="Automation";
		
		System.out.println(s1+s2); //Welcomejava
		System.out.println(s1+s2+s3); //WelcomejavaAutomation
		
		System.out.println(s1.concat(s2)); //Welcomejava
		System.out.println(s1.concat(s2).concat(s3)); //WelcomejavaAutomation
		System.out.println(s1.concat(s2+s3)); //WelcomejavaAutomation
		
		System.out.println("Welcome"+"java");
		System.out.println("Welcome"+"java"+"Automation");
		
		
		
		//trim - remove spaces right and left side
		
		s="   Welcome   ";
		
		System.out.println(s); //print string along with spaces 
		
		System.out.println(s.trim()); //Welcome
		
        s="   Welcome   ";
		
		System.out.println(s); //print string along with spaces
		System.out.println("Before triming:"+s.length());
		
		System.out.println(s.trim()); //Welcome
		System.out.println("After triming:"+s.trim().length());
		
		
		
		//charAt() - returns a character from a string based on index 
		          // index starts from 0
		
		s="welcome";
		
		System.out.println(s.charAt(3)); //c
		System.out.println(s.charAt(0)); //w
		
		
		
		//contains() - returns true/false
		
		s="Welcome";
		
		System.out.println(s.contains("Wel")); //true
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("wel")); //false
		System.out.println(s.contains("COME")); //false
		System.out.println(s.contains("Welme")); //false
		
		String s4="Welcome";
		String s6="java";
		String s7="Welcome";
		
        System.out.println(s4.contains(s6)); //false
        System.out.println(s4.contains(s7)); //true
        
        
        
        //equals() , equalsIgnoreCase() - compare strings
        
        s1="Welcome";
        s2="Welcome";
        
        System.out.println(s1==s2); //true
        
        System.out.println(s1.equals(s2)); //true
        
        System.out.println(s1.equals("welcome")); //false
        System.out.println(s1.equals("Welcome")); //true
		
        s1="Welcome";
        s2="welcome";
        
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        
        System.out.println(s1.equalsIgnoreCase("Welcome")); //true
        System.out.println(s1.equalsIgnoreCase("java")); //false
        
        
        
        //replace() - replace single/multiple(sequence) of characters in a string
        
        s="welcome to selenium java selenium python selenium";
        
        System.out.println(s.replace('e', 'X')); //wXlcomX to sXlXnium java sXlXnium python sXlXnium
        
        System.out.println(s.replace("selenium", "hai")); //welcome to hai java hai python hai
        
        System.out.println(s.replace('m','R').replace('s', 'C')); //welcoRe to CeleniuR java CeleniuR python CeleniuR
        
        
        String amount="$15,20,55";
        
        System.out.println(amount.replace("$","")); //15,20,55
        System.out.println(amount.replace("$","").replace(",","")); //152055
        
        
        
        //substring() - extract substring from the main string
                       //starting index - 0
                       //ending index - 1
        s="Selenium";
        
        System.out.println(s.substring(1, 5)); //elen
        System.out.println(s.substring(0, 3)); //sel
        
        
        
        //toUpperCase() , toLowerCase()
        
        s="Welcome";
        
        System.out.println(s.toUpperCase()); //WELCOME
        
        System.out.println(s.toLowerCase()); //welcome
        
        
        
        //split() - split the string into multiple parts based on delimeter
                    // * % ^ & () - you cannot use delimeters
        
        
        //ex1
        
         String amounts="$15,20,55";
        
        System.out.println(amounts.replace("$","")); //15,20,55
        System.out.println(amounts.replace("$","").replace(",","")); //152055
        
        s="abc@gmail.com";
        
        String a[]=s.split("@");
        
        System.out.println(Arrays.toString(a)); //[abc, gmail.com]
        
        System.out.println(a[0]); //abc
        System.out.println(a[1]); //gmail.com
        
        //ex2
        
        s="abc,123@xyz";
        
        String arr1[]=s.split(","); //abc
        
        System.out.println(Arrays.toString(arr1)); //[abc, 123@xyz]
        
        String arr2[]=arr1[1].split("@");
        
        System.out.println(Arrays.toString(arr2)); //[123, xyz]
        
        
        System.out.println(arr1[0]); //abc
        System.out.println(arr2[0]); //123
        System.out.println(arr2[1]); //xyz
        
        //ex3
        
        s="abc 123";
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr)); //[abc, 123]
        
        System.out.println(arr[0]); //abc
        System.out.println(arr[1]); //123
        
        //ex4
        
        String name="John kenedy";
        
        System.out.println(name.replace('J', 'j').contains("john")); //true
        System.out.println(name.toLowerCase().contains("john")); //true
        
        	

	}

}
