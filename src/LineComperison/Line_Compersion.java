package LineComperison;

import java.util.Scanner;

public class Line_Compersion {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		
		int x1,y1,x2,y2;		
		int x3=10,y3=15,x4=4,y4=20;
        double len;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1 point");
        x1=sc.nextInt();
        
        System.out.println("Enter y1 point");
        y1=sc.nextInt();
        
        System.out.println("Enter x2 point");
        x2=sc.nextInt();

        System.out.println("Enter y2 point");
        y2=sc.nextInt();
        
        len=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        double len1=Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
        System.out.println("Length of a line ("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+len);
        System.out.println();
        System.out.println("Length of a line ("+x3+","+y3+"),"+"("+x4+","+y4+")===>"+len1);

        //- Using Java equals method to check equality of 2 Lengths is preferable.

        String s1=Double.toString(len);
        String s2=Double.toString(len1);
        System.out.println();
        if(s1.equals(s2))
        {
        	System.out.println("Two lines are equal");
        }
        else
        {
        	System.out.println("Two lines are not equal");
        }
        
        //- Using Java compareTo method to compare 2 Lengths is preferable.
        if(s1.compareTo(s2) == 0)
        {
        	System.out.println("Two lines are equal");
        }
        else if(s1.compareTo(s2) > 0)
        {
        	System.out.println("Length1 less then length2");
        }
        else if(s1.compareTo(s2) < 0)
        {
        	System.out.println("Length1 greater then length2");
        }
        sc.close();
	}
}
