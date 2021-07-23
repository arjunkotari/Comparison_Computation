package LineComperison;

import java.util.Scanner;

public class Line_Compersion {
	public int x1,x2,y1,y2;
	/*
	 * constructor to pass the values
	 */
	public Line_Compersion(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	/*
	 * Calculating distance
	 */
	public double calculateDistanceOfLines() {
		double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		return distance;
	}
	
	/*
	 * Using compareTo method to compare two lengths is preferable
	 */
	public static void distanceOfLine(String line1, String line2) {
		 if(line1.compareTo(line2) == 0)
	        {
	        	System.out.println("Two lines are equal");
	        }
	        else if(line1.compareTo(line2) > 0)
	        {
	        	System.out.println("Length1 greter then length2");
	        }
	        else if(line1.compareTo(line2) < 0)
	        {
	        	System.out.println("Length1 less then length2");
	        }
	}
	/*
	 * main starts
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");		
        double len1,len2;
        //Passing values 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1 point");
        int x1=sc.nextInt();        
        System.out.println("Enter y1 point");
        int y1=sc.nextInt();        
        System.out.println("Enter x2 point");
        int x2=sc.nextInt();
        System.out.println("Enter y2 point");
        int y2=sc.nextInt();
        
        System.out.println("Enter x3 point");
        int x3=sc.nextInt();        
        System.out.println("Enter y3 point");
        int y3=sc.nextInt();        
        System.out.println("Enter x4 point");
        int x4=sc.nextInt();
        System.out.println("Enter y4 point");
        int y4=sc.nextInt();  
        
        //calling constructor
        Line_Compersion line = new Line_Compersion(x1, x2, y1, y2);
        //calling calculateDistanceOfLines and store in len1.
        len1 = line.calculateDistanceOfLines();
        System.out.println("Length of line1: "+len1);
        
        Line_Compersion line1 = new Line_Compersion(x3, x4, y3, y4);
        //calling calculateDistanceOfLines and store in len2.
        len2 = line1.calculateDistanceOfLines();
        System.out.println("Length of line2: "+len2);
        //Converting double to string. Bcz compareTo method compare string type only.
        String s1=Double.toString(len1);
        String s2=Double.toString(len2);
        //calling distanceOfLine method.
        distanceOfLine(s1, s2);       
        sc.close();
	}
}
