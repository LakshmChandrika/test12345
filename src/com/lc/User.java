/**
 * 
 */
package com.lc;

import java.util.Scanner;

/**
 * @author lpasupuleti
 *
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complaint c = new Complaint();
		Person p = new Person();
		
		int x, y;
		System.out.println("Hello..!!!\nenter your choice");
		System.out.println("1.View All complaints\n2.Raise complaint\n3.View particular complaint");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		switch( x )
		{
		case 1:
			//System.out.println("Enter customer id");
			//b = sc.nextInt();
			c.showAll();
			break;
			
		case 2:
			System.out.println("Enter customer id");
			y = sc.nextInt();
			p.launchComplaint( y );
			System.out.println("The complaint has been launched successfully for id "+y);
			break;
		case 3: System.out.println("enter customer id ");
		    y = sc.nextInt();
		    c.show( y );
		case 4: break;

		}

	}
}
