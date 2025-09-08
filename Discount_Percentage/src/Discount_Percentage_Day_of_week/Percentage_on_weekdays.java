package Discount_Percentage_Day_of_week;

public class Percentage_on_weekdays {

	public static void main(String[] args) {
		
		int discountPercentage = 0;
		
		int dayofweek = 4;
		
		switch (dayofweek) {
		case 6:
			discountPercentage = 40;
			break;
		case 7:
			discountPercentage = 60;
		default:
			discountPercentage = 10;
			break;
			
		}
		
//		if (dayofweek == 6) {
//			discountPercentage = 40;
//		} else if (dayofweek == 7) {
//			discountPercentage = 60;
//		}else {
//			discountPercentage = 10;
//	}
	
		System.out.println(discountPercentage);
	
}
}