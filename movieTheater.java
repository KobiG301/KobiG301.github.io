	//Kobi George
import java.util.Scanner;
public class movieTheater {
	public static int[] determinePrices(int [] cusAges) {
		int [] prices = new int[8];
		for(int i = 0; i < cusAges.length; i++) {
			if(cusAges[i] < 13) {
				prices[i] = 8;
			}
			else if(cusAges[i] < 65) {
				prices[i] = 12;
			}
			else {
				prices[i] = 10;
			}
		}
		return prices;
	}
	public static void printDailyRevenue(int prices[]) {
		int total = 0;
		for(int i = 0; i < prices.length; i++) {
			total += prices[i];
		}
		System.out.println("Total tickets sold: " + prices.length);
		System.out.println("Total revenue: " + total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ages = new int[8];
		Scanner k = new Scanner(System.in);
		for(int i = 0; i < ages.length; i++) {
			System.out.println("enter an age");
			ages[i] = k.nextInt();
		}
		int[] prices = determinePrices(ages);
		printDailyRevenue(prices);
		

	}

}
