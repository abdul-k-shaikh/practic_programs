import java.util.Random;

public class SixDigitRandomNos {

	public static void main(String[] args) {
		Random rnd = new Random();
		int number = rnd.nextInt(9999);
		System.out.println(number);
		
		//this will convert any number sequenc into 6char
		String format = String.format("%04d", number);

	}

}
