package Bai1;

public class SDDiem {
	
	public static void main(String[] args) {
		Diem A = new Diem(3, 4) ;
		System.out.print("A = ");
		A.hienThi() ;
		
		Diem B = new Diem() ;
		System.out.println("Nhap diem B ") ;
		B.nhapDiem() ;
		System.out.print("B = ");
		B.hienThi() ;
		
		Diem C = new Diem(-B.giaTriX(), -B.giaTriY()) ;
		System.out.print("C = ");
		C.hienThi() ; 
		
		System.out.println("Khoang cach tu diem B den tam, BO = " + B.khoangCach()) ;
		System.out.println("Khoang cach tu diem A den B, AB = " + A.khoangCach(B)) ;
		
	}
	
}
