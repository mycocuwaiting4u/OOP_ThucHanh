package Bai2;

import java.util.Scanner ;

public class SDDoanThang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("   ---Khoi tao AB---   ") ;
		Diem A = new Diem(2, 5) ;
		Diem B = new Diem(20, 35) ;
		DoanThang AB = new DoanThang(A, B) ;
		System.out.println(" # Toa Do AB : ") ;
		AB.hienthi("A", "B");
		
		System.out.println();
		System.out.println("   ---Tinh tien AB---   ") ;
		System.out.println(" # Toa Do AB sau tinh tien 1 doan (5, 3) : ") ;
		AB.tinhTien(5 ,3) ;
		AB.hienthi("A", "B");
		
		System.out.println();
		System.out.println("   ---Khoi tao CD---   ") ;
		System.out.println(" # Nhap gia tri cho CD : ") ;
		DoanThang CD = new DoanThang() ;
		CD.nhapToaDoDoanThang(sc, "C", "D") ;
		
		System.out.println();
		System.out.println("   ---Hien Thi CD---   ") ;
		System.out.println(" # Toa do CD : ") ;
		CD.hienthi("C", "D");
		System.out.println(" # Do dai CD : " + CD.dodaiDoanThang() ) ;
		System.out.println(" # Goc CD voi truc Ox : " +  CD.gocvoitrucHoanh()) ;
		
		
		sc.close() ;
		
	}
	
	
	
	
	
}





