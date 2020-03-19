package packageone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;


public class Java_Class {
	
	int Instance_Variable = 20;
	static int static_Variable=30;
	
	static public void main(String...args) {
		Java_Class obj = new Java_Class();
		
		int Variable_Name = 10;
		boolean Flag = true;
		char Value = 'r';
		
		System.out.println("This is a java project");
		System.out.println(Variable_Name);
		System.out.println(static_Variable);
		System.out.println(obj.Instance_Variable);
		
		System.out.println("===============================================");
		
		//Unary Operator
		int i=10;
		System.out.println(i++); //10
		System.out.println(i); //11
		System.out.println(i--); //11
		System.out.println(i); //10
		
		System.out.println(++i); //11
		System.out.println(i); //11
		System.out.println(--i); //10
		System.out.println(i); //10
		
		System.out.println("==================================================");
		
		//Arthemetic operations
		
		int j=20;
		System.out.println(i+j);
		System.out.println(j-i);
		System.out.println(j*i);
		System.out.println(j/i);
		System.out.println(j%i);
		
	/*	+
		-
		*
		
		/
		%
		
		
		10)20(2
		   20
	     ------
	        0
	     ------ */
		System.out.println("==================================================");
		//Relational Operator
		
		/*
		 * <
		 * >
		 * <=
		 * >=
		 * ==
		 * !=
		 */
			
		int k=20;
		System.out.println(j==i);
		System.out.println(j>i);
		System.out.println(i<j); //true
		System.out.println(i!=j); //true
		System.out.println(j<=k); //true
		
		System.out.println("================================================");
		
		//Logical Operator
		/*
		 * AND - &&
		 * OR - ||
		 */
		
		System.out.println(i<j&&j>k);
		
		System.out.println("======================================================");
		
		//for loop
		
		for(int l=10;l<=20;l++) {
			//System.out.println(l);
			if(l==15) {
				//continue;
				break;
				//System.out.println("This is 15, so the number willnot be printed");
			}else {
				System.out.println(l);
			}
		}
		
		System.out.println("==================================================");
		
		int m=10;
		while(m<=20) {
			System.out.println(m);
			m=m+1;
		}
		
		
		System.out.println("===================================================");
		
		boolean flag = true;
		int n=10;
		do {
			System.out.println(n);
			n=n+1;
			flag=false;
		}while(flag);
		
		System.out.println("====================================================");
		
	/*	if(condition) {
			
		}else if(condition){
			
		}else if(condition) {
			
		}else {
			
		} */
		
		System.out.println("==================================================");
		
		int a=30;
		int b=a;
		
		switch(a) {
		case 10:
			System.out.println("This is avalue of i");
			break;
		case 20:
			System.out.println("This is a value of j");
			break;
		case 30:
			System.out.println("This is a value of 30");
			break;
		case 40:
			System.out.println("This is a value of a");
			break;
		default:
			System.out.println("This is a default value");
			break;
		}
		
		
		/*
		 *  Fibonacci series

 Prime number

 Factorial

 Armstrong number
 
 
		 */
		
		
		
		//Fibonacci series
	/*	
		0 1 1 2 3 5 8 13 21..
		
		int value1 = 0;
		int value2 = 1;
		
		
		int temp = value1+value2; //1
		
		value2=value1; //1
		value1=temp; //1
		 
		
		temp=value1+value2 //2
				
				*/
		
		
		//Prime number
		
/*		 a number that has two factors = 1 and itself
		 
		int Prime_Number=13;
		 
		 13/2=6.5 = 7
				 
		13/1
		13/2
		13/3
		13/4
		13/5
		13/6
		13/7
		
		int counter = 0;
		 counter=counter+1;
		 
		 if(counter>2) {
			 System.out.println("This is not prime");
		 }else {
			 System.out.println("This is prime");
		 }
		 
		int non_prime= 12
		
				
				6
				
1*12=12
2*6=12
3*4=12
4*3=12
6*2=12
7*2=14
12*1=12
*/

		 		//Factorial
	/*	11!
		11*10*9*8*7*6*5*4*3*2*1
		
		int factorial = 1;
		for(int fact=11;fact>=1;fact--) {
			factorial = factorial*fact;
		}
		
		*/
		
		//Amstrong number
		
/*		1634 
		
		1^4+6^4+3^4+4^4 = 1634
		
		10)1634(163
		   1630
		   ----   
		     4
		   ----
		   counter = 0;
		   Reminder = 1634%10 = 4
				   if(reminder == 0) {
					   break;
				   }else {
					   counter = counter+1;
				   }
		 10)163(16
		    160
		    ----
		      3
		    ----
			   Reminder = 1634%10 = 4
			   if(reminder == 0) {
				   break;
			   }else {
				   counter = counter+1;
			   }
		
		*/
		System.out.println("===================================================================");
		//Arrays
		
		int Array1[] = new int[5];
		int []Array2 = new int[5];
		int[] Array3 = new int[5];

		//Array1[0] = 100;
		Array1[1] = 200;
		Array1[2] = 300;
		Array1[3] = 400;
		Array1[4] = 500;
		//Array1[5] = 600;
		
		for(int arr=0;arr<Array1.length;arr++) {
			System.out.println(Array1[arr]);
		}
		
		System.out.println("==================================================");
		
		//Local date time
		
		LocalDate Date = LocalDate.now();
		System.out.println(Date);
		
		LocalTime Time = LocalTime.now();
		System.out.println(Time);
		
		LocalDateTime Date_Time = LocalDateTime.now();
		System.out.println(Date_Time);
		
		ZoneId zid = ZoneId.of("America/Los_Angeles");
		LocalDateTime Date_Time1 = LocalDateTime.now(zid);
		System.out.println(Date_Time1);
		
	System.out.println("==============================================");	
	String str1 = "This is a string        ";
	String str2 = new String();
	str2 = "This is another String";
	
	System.out.println(str1.charAt(11)); //t
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.concat(str2));
	System.out.println(str1.contains("successfully"));  //false
	System.out.println(str1.equals(str2));
	System.out.println(str1.indexOf('t'));   //11
	System.out.println(str1.length());
	System.out.println(str1.replace('s', 'A'));
	System.out.println(str1.substring(3, 12));
	System.out.println(str1.toLowerCase());
	System.out.println(str1.toUpperCase());
	System.out.println(str1.trim());
	
	String str3[] = str1.split(" ");
	for(int val=0;val<str3.length;val++) {
		System.out.println(str3[val]);
	}
	
	System.out.println("================================================");
	
	//Conversions
	//HDFC00035445
	
	
	int Inv_Value = 10;
	String String_Value = "20";
	
	System.out.println(Inv_Value+Integer.parseInt(String_Value)); //30
	System.out.println(Integer.toString(Inv_Value)+String_Value); //1020
	
	System.out.println("===============================================================");
	
	ArrayList<Integer> AL = new ArrayList<Integer>();
	AL.add(10);
	AL.add(20);
	AL.add(30);
	
	LinkedList<Integer> LL = new LinkedList<Integer>();
	LL.add(100);
	LL.addAll(AL);
	LL.add(200);
	
	System.out.println(LL);
	System.out.println(LL.addAll(0, AL));
	System.out.println(LL);
	System.out.println(LL.contains(300));
	System.out.println(LL.isEmpty());
	System.out.println(LL.lastIndexOf(20));
	System.out.println(LL);
	System.out.println(LL.remove(5));
	System.out.println(LL);
	System.out.println(LL.size());
	System.out.println(LL);
	System.out.println(LL.get(0));
	System.out.println(LL.set(2, 5000));
	System.out.println(LL);
	//System.out.println(LL.);
	
	boolean flag1 = LL.isEmpty();
	
	System.out.println("====================================================");
	
	HashSet<Integer> HS = new HashSet<Integer>();
	HS.add(5);
	HS.addAll(LL);
	HS.addAll(AL);
	System.out.println(HS);
	
	LinkedHashSet<Integer> LHS = new LinkedHashSet<Integer>();
	LHS.add(5);
	LHS.addAll(LL);
	LHS.addAll(AL);
	
	System.out.println(LHS);
	System.out.println(LHS.contains(5000));
	//System.out.println(LHS.);
	
	System.out.println("===================================================");
	
	HashMap<Integer, String> HM = new HashMap<Integer, String>();
	HM.put(1001, "Student1001");
	HM.put(1002, "Student1002");
	HM.put(1003, "Student1003");
	HM.put(1004, "Student1004");
	HM.put(1005, "Student1005");
	HM.put(1006, "Student1006");
	HM.put(1007, "Student1007");
	HM.put(1008, "Student1007");
	
	System.out.println(HM);
	
	System.out.println(HM.get(1008)); //Student1007
	System.out.println(HM.put(0000, "Student0000"));
	//System.out.println(HM.);
	System.out.println(HM);
	System.out.println(HM.values());
	
	System.out.println("=========================================================");
	
	LinkedHashMap<Integer, String> LHM = new LinkedHashMap<Integer, String>();
	LHM.put(2001, "Student2001");
	LHM.putAll(HM);
	System.out.println(LHM);
	
	LHM.put(2002, "Student2002");
	
	System.out.println(LHM);
	
	LHM.replace(2002, "Student2003");
	System.out.println(LHM);
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	public void Method_One() {
		System.out.println(Instance_Variable);
		System.out.println(static_Variable);
	}
	
	public void Method_Two() {
		
	}
	
	public void Method_Three() {
		
	}
	
	public void Method_Four() {
		
	}
	
	public void Method_Five() {
		
	}
}
