package Bai3;

import java.util.Scanner ;

public class SDPhanSo {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		PhanSo a = new PhanSo(3, 7) ;
		PhanSo b = new PhanSo(4, 9) ;
		
		
		System.out.println(" - Hien thi phan so : ") ;
		a.hienthiPhanSo() ; 
		b.hienthiPhanSo() ; 
		
		
		PhanSo x = new PhanSo() ;
		PhanSo y = new PhanSo() ;
		System.out.println() ;
		System.out.println(" - Nhap phan so x :") ;
		x.nhapPhanSo(sc) ;
		System.out.println(" - Nhap phan so y :") ;
		y.nhapPhanSo(sc) ;
		
		
		System.out.println() ;
		System.out.println(" - Gia tri nghich dao cua x : ") ;
		x.giatringhichDao().hienthiPhanSo() ;
		
		
		System.out.println() ;
		System.out.println(" - Gia tri x + y : ") ;
		x.congPhanSo(y).hienthiPhanSo(); 
		
		
		System.out.println() ;
		System.out.print(" - So phan tu cua danh sach : ") ;
		int n = sc.nextInt() ;
		double max = -Double.MAX_VALUE ;
		double tong = 0 ;
		PhanSo[] arr = new PhanSo[n] ;
		for (int i=0; i<n; i++)
		{
			System.out.println("Nhap phan so " + (i+1) + " :" ) ;
			arr[i] = new PhanSo() ;
			arr[i].nhapPhanSo(sc) ;
			tong = tong + arr[i].giaTri() ;
			
			if(max<arr[i].giaTri()) max=arr[i].giaTri() ;
		}
		System.out.printf("Tong %d so = %.3f", n, tong ) ;
		
		
		System.out.println() ;
		System.out.print(" - Phan so lon nhat : " + max ) ;
		
		
		System.out.println() ;
		System.out.println(" - Danh sach tang dan : " ) ;
		for (int i=0; i<n-1; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if (arr[i].lonHon(arr[j]))
				{
					PhanSo temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
		for (int i=0; i<n; i++)
		{
			arr[i].hienthiPhanSo() ;
		}
		System.out.println() ;
		for (int i=0; i<n; i++)
		{
			System.out.println(arr[i].giaTri());
		}
		
	}
	
}





