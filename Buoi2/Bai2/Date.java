package Bai2;

import java.util.Scanner ;

public class Date {
	
	private int day, month, year ;
	
	public Date() {
		day = 0 ;
		month = 0 ;
		year = 0 ;
	}
	
	public Date(int d, int m, int y) {
		this.day = d ;
		this.month = m ;
		this.year = y ;
	}
	
	public void printDate() {
		System.out.println(day + " - " + month + " - " + year ) ;
	}
	
	public boolean checkValid() {
		if (year<=0 || month<1 || month>12) return false ;
		
		int[] maxDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
		if ((year%4==0 && year%100!=0) || (year%400==0)) maxDay[2] = 29 ;

		return day>=1 && day<=maxDay[month] ;
	}
	
	public void inputDate() { 
		Scanner sc = new Scanner(System.in) ;
		
		do
		{
			System.out.print("ngay : ");
			this.day = sc.nextInt() ;
			System.out.print("thang : ");
			this.month = sc.nextInt() ;
			System.out.print("nam : ");
			this.year = sc.nextInt() ;
			
			if (!this.checkValid()) System.out.println("Ko hop le! Nhap lai di ") ;
		} while (!this.checkValid()) ;
		
		sc.close() ; 
	}
	
	public Date nextDay() {
		Date nextday = new Date(day+1, month, year) ;
		if (nextday.checkValid()) return nextday ;
		
		nextday = new Date(1, month+1, year) ;
		if (nextday.checkValid()) return nextday ;
		
		return new Date(1, 1, year+1) ;
	}
	
	public Date addDay(int n) {
		Date newDay = new Date(day, month, year) ;
		for (int i=0; i<n; i++)
		{
			newDay = newDay.nextDay() ; 
		}
		return newDay ;
	}
	
	
}
