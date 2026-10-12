package Bai1;

import java.util.Scanner ;

public class SDGach {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int n ;
		System.out.println("   ---Nhap danh sach cac loai gach---   ") ;
		System.out.print(" # Nhap so hop gach : ") ;
		n = sc.nextInt() ;
		sc.nextLine() ;
		
		Gach[] arr = new Gach[n] ;
		for (int i=0; i<n; i++)
		{
			arr[i] = new Gach() ;
			arr[i].nhapThongTin(sc) ;
			System.out.println();
		}
		
		System.out.println("   ---Thong tin cac hop gach---   ");
		for (int i=0; i<n; i++)
		{
			System.out.println(" # Hop gach thu " + (i+1) + " : ") ;
			arr[i].hienthiThongTin() ;
			System.out.println();
		}
		
		System.out.println("   ---Loai gach co chi phi lot thap nhat---   ");
		int vitrimin=0 ;
		for (int i=1; i<n; i++)
		{
			if (arr[i].chiphitrendientich()<arr[vitrimin].chiphitrendientich())
			{
				vitrimin=i ;
			}
		}
		System.out.println("Loai gach co chi phi lot thap nhat la : " + arr[vitrimin].getloai()) ;
		System.out.println();

		System.out.println("   ---Chi phi de lot dien tich 2000x500 (cm) ---   ") ;
		for (int i=0; i<n; i++)
		{
			int soluong=arr[i].soHopGach(2000, 500) ;
			long tongchiphi = (long)soluong*arr[i].getgia() ;
			System.out.println("Chi phi hop " + (i+1) + " = " + tongchiphi ) ;
		}
		
		sc.close() ;
	}
	
}




