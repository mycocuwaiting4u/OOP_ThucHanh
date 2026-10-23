package Bai3;

import java.util.Scanner ;

public class SDSinhVien {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		SinhVien A = new SinhVien() ;
		
		System.out.println("	//---Nhap thong tin sinh vien---//");
		A.nhapSinhVien(sc) ;
		System.out.println() ;
		
		System.out.println("	//---Dang ky them 1 hoc phan---//");
		A.dangKyHP(sc) ;
		System.out.println() ;
		
		
		System.out.println("	//---Thong tin sinh vien---//" + A) ;
		System.out.println() ;
		
		System.out.println("	//---Tao danh sach sinh vien---//") ;
		System.out.print("# Nhap so luong danh sach: ") ;
		int n ;
		n = sc.nextInt() ;
		sc.nextLine() ;
		SinhVien[] sv = new SinhVien[n] ;
		for (int i=0; i<n; i++)
		{
			sv[i] = new SinhVien() ;
			System.out.println("# Sinh vien " + (i+1) + ": ") ;
			sv[i].nhapSinhVien(sc) ;
			System.out.println() ;
		}
		
		System.out.println() ;
		System.out.println("	//---Sinh vien bi canh cao hoc vu---//") ;
		int foo=0 ;
		for (int i=0; i<n; i++)
		{
			if (sv[i].diemTB()<1.0) 
			{
				System.out.println("- Sinh vien :" + sv[i].maSinhVien() ) ;
				foo=1 ;
			}
		}
		if (foo==0) System.out.println("- Khong co sinh vien nao bi canh bao hoc vu") ;
		
		System.out.println() ;
		System.out.println("	//---Danh sach sinh vien da sap xep---//") ;
		for (int i=0; i<n-1; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if (sv[i].tenSinhVien().compareToIgnoreCase(sv[j].tenSinhVien())<0)
				{
					SinhVien B = sv[i] ;
					sv[i] = sv[j] ;
					sv[j] = B ;
				}
			}
		}
		for (int i=0; i<n; i++)
		{
			System.out.println("# Thong tin sinh vien" + sv[i].toString()) ;
			System.out.println() ;
		}
		
		sc.close() ;
		
	}
	
	
}




