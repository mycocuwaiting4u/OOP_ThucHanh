package Bai2;

public class SDDate {
	
	public static void main(String[] args) {
		Date foo = new Date() ;
		System.out.println("Da khoi tao Date") ;
		System.out.println("Nhap Date") ;
		foo.inputDate() ;
		System.out.print("In ngay : ");
		foo.printDate() ;
		
		System.out.print("Ngay mai la ngay : ") ;
		foo = foo.nextDay() ;
		foo.printDate() ;
		
		System.out.print("20 ngay nua la ngay : ") ;
		foo = foo.addDay(20) ;
		foo.printDate() ;
	}
	
}
