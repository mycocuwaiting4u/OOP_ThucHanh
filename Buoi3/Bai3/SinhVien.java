package Bai3;

import java.util.Scanner ;

public class SinhVien {
	
	private String id ;
	private String name ;
	private Date date ;
	private int numbers ;
	private String courseName[] ;
	private String courseGrade[] ;
	
	
	public SinhVien() {
		id = "" ;
		name = "" ;
		date = new Date() ;
		numbers = 0 ;
		courseName = new String[100] ;
		courseGrade = new String[100] ;
	}
	
	public SinhVien(String id, String name, Date date, int numbers, String courseName[], String courseGrade[]) {
		this.id = id ;
		this.name = name ; 
		this.date = new Date(date) ;
		this.numbers = numbers ;
		
		this.courseName = new String[100] ;
		this.courseGrade = new String[100] ;
		for (int i=0; i<numbers; i++)
		{
			this.courseName[i] = courseName[i] ;
			this.courseGrade[i] = courseGrade[i] ;
		}
	}
	
	public SinhVien(SinhVien A) {
		this.id = A.id ;
		this.name = A.name ; 
		this.date = new Date(A.date) ;
		this.numbers = A.numbers ;
		
		this.courseName = new String[100] ;
		this.courseGrade = new String[100] ;
		for (int i=0; i<numbers; i++)
		{
			this.courseName[i] = A.courseName[i] ;
			this.courseGrade[i] = A.courseGrade[i] ;
		}
	}
	
	public String maSinhVien() {
		return id ;
	}
	
	public String tenSinhVien() {
		return name ;
	}
	
	public void nhapSinhVien(Scanner sc) {
		nhapThongTin(sc) ;
		for (int i=0; i<numbers; i++)
		{
			nhapDiem(sc, i) ;
		}
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("- MSSV: ") ;					id = sc.nextLine() ;
		System.out.print("- Ten: ") ;					name = sc.nextLine() ;
		System.out.print("- Ngay sinh: \n") ;			date.inputDate(sc) ;
		System.out.print("- So luong hoc phan: ") ;		numbers = sc.nextInt() ;
		sc.nextLine() ;
	}
	
	public void nhapDiem(Scanner sc, int i) {
		System.out.print("  + Ten hoc phan (" + (i+1) + "): " ) ;
		courseName[i] = sc.nextLine() ;
		System.out.print("  + Diem hoc phan (" + (i+1) + "): " ) ;
		courseGrade[i] = sc.nextLine() ;
	}
	
	public String toString() {
		String str = "\n- MSSV: " + id + 
				   	 "\n- Ten: " + name +
				     "\n- Ngay sinh: " + date.toString() +
				     "\n- So luong hoc phan: " + numbers + "\n" ;
		str += "- Danh sach diem: " ;
		for (int i=0; i<numbers; i++)
		{
			str += "\n    + Hoc phan: " + courseName[i] + "\n      Diem: " + courseGrade[i] ;
		}
		return str ;
	}
	
	public double diemTB() {
		double foo = 0 ;
		for (int i=0; i<numbers; i++)
		{
			String a = courseGrade[i] ;
			if (a.equals("A")) foo += 4 ;
			else if (a.equals("B+")) foo += 3.5 ;
			else if (a.equals("B")) foo += 3 ;
			else if (a.equals("C+")) foo += 2.5 ;
			else if (a.equals("C")) foo += 2 ;
			else if (a.equals("D+")) foo += 1.5 ;
			else if (a.equals("D")) foo += 1 ;
			else foo += 0 ; 
		}
		return (foo/numbers) ;
	}
	
	public void dangKyHP(Scanner sc) {
		nhapDiem(sc, numbers) ;
		numbers++ ;
	}
	
	public void xoaHP(String str) {
		for (int i=0; i<numbers; i++)
		{
			if (courseName[i].equals(str)) 
			{
				for (int j=i; j<numbers; j++)
				{
					courseName[j] = courseName[j+1] ;
					courseGrade[j] = courseGrade[j+1] ;
				}
			}
		}
	}
	
	
}
