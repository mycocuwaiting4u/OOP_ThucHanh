package Bai2;

import java.util.Scanner;

public class Diem {
	
	private int x, y ;
	
	public Diem() {
		x = 0 ;
		y = 0 ;
	}
	
	public Diem(int x, int y) {
		this.x = x ;
		this.y = y ;
	}
	
	public Diem(Diem a) {
		x = a.x ;
		y = a.y ;
	}
	
	public void nhapDiem(Scanner sc, String s) {
		System.out.print(" - " + s + "(x) = ") ;
		x = sc.nextInt() ;
		System.out.print(" - " + s + "(y) = ") ;
		y = sc.nextInt() ;
	}
	
	public void hienThi() {
		System.out.println("(" + x + ", " + y + ")") ;
	}
	
	public void doiDiem(int dx, int dy) {
		x = x+dx ;
		y = y+dy ;
	}
	
	public int giaTriX() {
		return x ;
	}
	
	public int giaTriY() {
		return y ;
	}
	
	public double khoangCach() {
		return (double)Math.sqrt(x*x + y*y) ;
	}
	
	public double khoangCach(Diem d) {
		return (double)Math.sqrt((d.x - x)*(d.x - x) + (d.y - y)*(d.y - y)) ;
	}
	
}


