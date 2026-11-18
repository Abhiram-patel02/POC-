package com.javapocs;
import java.util.Scanner;
public class Noukri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("welcome to noukri one of the best platform for your job search ");
	    System.out.println("please ente your name");
	    String name = sc.nextLine();
	    
	    System.out.println("enter your age");
	    int age = sc.nextInt();
	    sc.nextLine();// add this compelsary
	    
	     if (age > 22) {
	    	 System.out.println("ok lets complete other details also");
	    	 System.out.println("enter your gender");
	    	 String gender = sc.nextLine();
	    	 
	    	 System.out.println("enter your higest quelification");
	    	 String edu = sc.nextLine();
	    	 
	    	 if (edu.equalsIgnoreCase("graduation")||edu.equalsIgnoreCase("masters")) {
	    		 System.out.println("ok DO U HAVE ANY BACKLOCKS ?(true/false)");
	    		 boolean bc = sc.nextBoolean();
	    		 sc.nextLine();//consume leftover
	    		 
	    		  if (!bc) {
	    			  System.out.println("thats good lets continue other details also");
	    			  System.out.println("enter your skills");
	    			  String skill = sc.nextLine();
	    			  
	    			  if (skill.equalsIgnoreCase("java")||skill.equalsIgnoreCase("python")){
	    				  System.out.println("ok u can continue");
	    				  System.out.println("enter your experince status(fresher/experienced");
	    				  String exper = sc.nextLine();
	    				  
	    				  if (exper.equalsIgnoreCase("experienced") )
	    				  {
	    					  System.out.println("enter years of experinced");
	    				   double expyear = sc.nextDouble();
	    				  }
	    				   else if (exper.equalsIgnoreCase("fresher")){
	    					  System.out.println("welcome fresher !");
	    				   }
	    				   else {
	    					   System.out.println("invalid experince ststus");
	    				   }
	    					  System.out.println("enter your technical interview marks");
	    					  int marks = sc.nextInt();
	    					   
	    					  if(marks >20) {
	    						  System.out.println("ok thats grate enter your expexted salary");
	    						  double sal = sc.nextDouble();
	    						  
	    						  if (sal < 600000) {
	    							  System.out.println("hey" + name+ ",your profile is grate match to this role");
	    						  }else {
	    							  System.out.println("hey sry we dosent expect more than our budjet");
	    						  }
	    					  }else {
	    						  System.out.println("your marks are low so try next time");
	    					  }
	    					  
	    			   
	    				  }else {
	    				  System.out.println("ohh sry we are only accepting java or python");
	    			        }
	    			  
	    		  }else {
	    			  System.out.println("no we dont accepts backlocks");
	    		        }
	     } else {
	    		 System.out.println("your profile dosent matches our requirements");
	              }
	          
	        }else{
	    		 System.out.println("i think u should wait for few more years");
	    	      }
	     sc.close();
	} 
}


