package Bai1;

import java.util.Scanner ;

public class Gach {
	private String maSo ;
	private String mau ;
	private int soLuong ;
	private int chieuDai ;
	private int chieuNgang ;
	private long gia ;
	
	
	public Gach() {
		maSo = "" ;
		mau = "" ;
		soLuong = 0 ;
		chieuDai = 0 ;
		chieuNgang = 0 ;
		gia = 0 ;
	}
	
	public Gach(String maSo, String mau, int soLuong, int chieuDai, int chieuNgang, long gia) {
		this.maSo = maSo ;
		this.mau = mau ;
		this.soLuong = soLuong ;
		this.chieuDai = chieuDai ;
		this.chieuNgang = chieuNgang ;
		this.gia = gia ;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println(" - Nhap thong tin hop gach : ") ;
		
		System.out.print("Ma So : ") ;
		maSo = sc.nextLine() ;
		
		System.out.print("Mau : ") ;
		mau = sc.nextLine() ;
		
		System.out.print("So Luong : ") ;
		soLuong = sc.nextInt() ;
		
		System.out.print("Chieu Dai : ") ;
		chieuDai = sc.nextInt() ;
		
		System.out.print("Chieu Ngang : ") ;
		chieuNgang = sc.nextInt() ;
		
		System.out.print("Gia : ") ;
		gia = sc.nextLong() ;
		
		sc.nextLine() ;
	}
	
	public void hienthiThongTin() {
		System.out.println("Ma so       : " + maSo) ;
		System.out.println("Mau         : " + mau) ;
		System.out.println("So luong    : " + soLuong) ;
		System.out.println("Kich Thuoc  : " + chieuDai + "x" + chieuNgang ) ;
		System.out.println("Gia         : " + gia) ;
	}
	
	public float giaBanLe() {
		return (float)(((double)gia/soLuong)*1.2) ;
	}
	
	public int dientichMax() {
		return soLuong*(chieuDai*chieuNgang) ;
	}
	
	public int soHopGach(int d, int n) {
		int slDai = (int)Math.ceil((double)d/chieuDai) ;
		int slNgang = (int)Math.ceil((double)n/chieuNgang) ;
		
		int sovien = slDai*slNgang ;
		return (int)Math.ceil((double)sovien/soLuong) ;
	}
	
	public double chiphitrendientich() {
		return (double)gia/dientichMax() ;
	}
	
	public long getgia() {
		return this.gia ;
	}
	
	public String getloai() {
		return maSo ;
	}
	
}







