package Bai1;

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
	
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("x = ") ;
		x = sc.nextInt() ;
		System.out.print("y = ") ;
		y = sc.nextInt() ;
		sc.close() ;
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



