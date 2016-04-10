import java.util.Scanner;
import java.util.Random;
public class squareEveryDigit {

	public static void main(String[] args) {
		Scanner sakib = new Scanner(System.in);
		System.out.println("Please typea number to convert to squares of each digit");
		int num = sakib.nextInt();
		String str = String.valueOf(num);
		String[] stringArray = str.split("");
		int[] intArray = new int[stringArray.length];
		for(int i=0;i<stringArray.length;i++){
			String numberAsString = stringArray[i];
			intArray[i] = Integer.parseInt(numberAsString);
		}
		System.out.println("Number of integers: " + intArray.length);
	      System.out.print("The integers are:");
	      for (int number : intArray) {
	         System.out.print(number*number);
	      }
	}
}
