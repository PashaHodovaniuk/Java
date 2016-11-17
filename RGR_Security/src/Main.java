import java.math.*;

public class Main {
	BigInteger bigNumber = BigInteger.valueOf(1);

	public static void main(String[] args) {
		BigInteger bigNumber;
		
		/*int currentNumber, dividers;
		for (currentNumber = 1; currentNumber < 1000; currentNumber++) {
			dividers = 0;
			for (int i = 1; i <= currentNumber; i++) {
				if (currentNumber % i == 0)
					dividers++;
			}
			if (dividers <= 2) {
				bigNumber = bigNumber.multiply(BigInteger.valueOf(currentNumber));
			}
		}
		bigNumber = bigNumber.add(BigInteger.valueOf(1511));*/
		InOut.Out("Enter you number: ");
		int numVar = new Integer(InOut.In());
		bigNumber = ProductРrimes(numVar);
		//System.out.println("1511");
		System.out.println(bigNumber.toString());

		if (BefinitionPrimeNumber(bigNumber)) {
			System.out.println("This number is a simple!");
		} else {
			System.out.println("This number is a not simple!");
		}
	}
	
	static BigInteger ProductРrimes(int _number)
	{
		BigInteger bigNumber = BigInteger.valueOf(1);
		int currentNumber, dividers;
		for (currentNumber = 1; currentNumber < 1000; currentNumber++) {
			dividers = 0;
			for (int i = 1; i <= currentNumber; i++) {
				if (currentNumber % i == 0)
					dividers++;
			}
			if (dividers <= 2) {
				bigNumber = bigNumber.multiply(BigInteger.valueOf(currentNumber));
			}
		}
		bigNumber = bigNumber.add(BigInteger.valueOf(_number));
		return bigNumber;
	}
	
	static boolean BefinitionPrimeNumber(BigInteger _bigNumber)
	{
		boolean simple = true;
		BigInteger halfBigNumber = _bigNumber.divide(BigInteger.valueOf(2));
		BigInteger i = BigInteger.valueOf(2);
		for (; !(i.equals(halfBigNumber)); i = i.add(BigInteger.ONE)) {
			if (_bigNumber.mod(i) == BigInteger.ZERO) {
				simple = false;
				System.out.println(i.toString() + " \n" + _bigNumber.divide(i).toString());
				break;
			}
		}
		return simple;
	}
}