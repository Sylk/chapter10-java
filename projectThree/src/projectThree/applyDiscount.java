package projectThree;

import java.util.Scanner;
import java.text.DecimalFormat;

public class applyDiscount {

	public static void main(String[] args) throws NegativeUnits, NegativePrice {
		double price;
		double discount = 1;
		Scanner scanner = new Scanner( System.in);
		DecimalFormat defaultFormat = DecimalFormat.getCurrencyInstance();
		
		System.out.print("Enter units sold >> ");
		double unitsSold = Double.parseDouble (scanner.nextLine());
		
		if(unitsSold < 0){
			throw new NegativeUnits();
		}
		
		System.out.print("Enter price >> ");
		price = scanner.nextDouble();
		
		if(price < 0){
			throw new NegativePrice();
		}
		
		if(unitsSold>=10 && unitsSold <=19){
			discount = 0.80;
		}
		else if(unitsSold>=20 && unitsSold <=49){
			discount = 0.70;
		}
		else if(unitsSold>=50 && unitsSold <=99){
			discount = 0.60;
		}
		else if(unitsSold >=100){
			discount = 0.50;
		}
		
		String totalPrice = defaultFormat.format(unitsSold * price * discount);
		System.out.println("The total for "+unitsSold+" is "+totalPrice);
	}

}
