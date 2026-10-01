package Bai3;

import java.util.Scanner ;

public class PhanSo {
	
	private int tu, mau ;
	
	public PhanSo() {
		tu = 0 ; 
		mau = 1 ;
	}
	
	public PhanSo(int tu, int mau) {
		this.tu = tu ; 
		this.mau = mau ;
	}
	
	public void nhapPhanSo(Scanner sc) {
		System.out.println("a/b : ") ;
		System.out.print("a = ") ;
		tu = sc.nextInt() ;
		do {
			System.out.print("b = ") ;
			mau = sc.nextInt() ;
			if (mau==0) System.out.println("Mau = 0, nhap lai ! ") ;
		} while (mau==0) ;
		
		if (mau<0)
		{
			tu = -tu ;
			mau = -mau ;
		}
	}
	
	public void hienthiPhanSo() {
		if (tu==0) System.out.println("a/b = 0") ;
		else if (mau==1) System.out.println("a/b = " + tu ) ;
		else
		{
			System.out.println("a/b = " + tu + "/" + mau ) ;
		}
	}
		
	public void nghichDao() {
		int temp = tu ;
		tu = mau ;
		mau = temp ;
	}
	
	public PhanSo giatringhichDao() {
		return new PhanSo(mau, tu) ;
	}
	
	public void rutGon() {
		int a = Math.abs(tu) ;
		int b = Math.abs(mau) ;
		while (b!=0)
		{
			int temp = b ;
			b = a%b ;
			a = temp ;
		}
		tu = tu/a ;
		mau = mau/a ;
	}
	
	public double giaTri() {
		return (double)tu/mau ;
	}
	
	public boolean lonHon(PhanSo a) {
		return this.giaTri() > a.giaTri() ;
	}
	
	
			//------Math------//
	
	public PhanSo congPhanSo(PhanSo a) {
		PhanSo kq = new PhanSo(tu*a.mau+mau*a.tu, mau*a.mau) ;
		kq.rutGon() ; 
		return kq ;
	}
	
	public PhanSo truPhanSo(PhanSo a) {
		PhanSo kq = new PhanSo(tu*a.mau-mau*a.tu, mau*a.mau) ;
		kq.rutGon() ; 
		return kq ;
	}
	
	public PhanSo nhanPhanSo(PhanSo a) {
		PhanSo kq = new PhanSo(tu*a.tu, mau*a.mau) ;
		kq.rutGon() ; 
		return kq ;
	}
	
	public PhanSo chiaPhanSo(PhanSo a) {
		PhanSo kq = new PhanSo(tu*a.mau, mau*a.tu) ;
		kq.rutGon() ; 
		return kq ;
	}
	
	public PhanSo congSoNguyen(int a) {
		PhanSo kq = new PhanSo(tu+a*mau, mau) ;
		kq.rutGon() ; 
		return kq ;
	}
	
	public PhanSo truSoNguyen(int a) {
		PhanSo kq = new PhanSo(tu-a*mau, mau) ;
		kq.rutGon() ; 
		return kq ;
	}
	
	public PhanSo nhanSoNguyen(int a) {
		PhanSo kq = new PhanSo(tu*a, mau) ;
		kq.rutGon() ; 
		return kq ;
	}
	
	public PhanSo chiaSoNguyen(int a) {
		PhanSo kq = new PhanSo(tu, mau*a) ;
		kq.rutGon() ; 
		return kq ;
	}
	
}





