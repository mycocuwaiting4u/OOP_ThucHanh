package Bai2;

import java.util.Scanner ;

public class DoanThang {

	private Diem d1  ;
	private Diem d2  ;
	
	public DoanThang() {
		d1 = new Diem() ;
		d2 = new Diem() ;
	}
	
	public DoanThang(Diem d1, Diem d2) {
		this.d1 = new Diem(d1) ;
		this.d2 = new Diem(d2) ;
	}
	
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax, ay) ;
		d2 = new Diem(bx, by) ;
	}
	
	public void nhapToaDoDoanThang(Scanner sc, String s1, String s2) {
		d1.nhapDiem(sc, s1) ;
		d2.nhapDiem(sc, s2) ;
	}
	
	public void hienthi(String A, String B) {
		System.out.print(A + " = ");
		d1.hienThi() ;
		System.out.print(B + " = ");
		d2.hienThi() ;
	}
	
	public void tinhTien(int dx, int dy) {			//cach 1
		d1.doiDiem(dx, dy) ;
		d2.doiDiem(dx, dy) ;
	}
	
//	public DoanThang tinhTien(int dx, int dy) {			//cach 2
//		return new DoanThang(new Diem(d1.giaTriX()+dx, d1.giaTriY()+dy), new Diem(d2.giaTriX()+dx, d2.giaTriY()+dy)) ;
//	}
	
	public double dodaiDoanThang() {
		return d1.khoangCach(d2) ;
	}
	
	public double gocvoitrucHoanh() {
		int dx = d2.giaTriX()-d1.giaTriX() ;
		int dy = d2.giaTriY()-d1.giaTriY() ;
		double rad = Math.atan2(dy, dx) ;
		return Math.toDegrees(rad) ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
