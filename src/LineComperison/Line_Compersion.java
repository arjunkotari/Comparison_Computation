package LineComperison;

import java.util.Scanner;

public class Line_Compersion {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		
		int x1,y1,x2,y2;
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
        
        System.out.println("Length of a line ("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+len);
        sc.close();
	}

}
