import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static BigInteger getResults(BigInteger time) {
		BigInteger result = BigInteger.ZERO;
		BigInteger strangeCounter = BigInteger.valueOf((long) 3);
		BigInteger seconds = BigInteger.ONE;

		while (true) {
			BigInteger previousSeconds = seconds;
			seconds = seconds.add(strangeCounter);
			
			if (seconds.compareTo(time) > 0) {
				BigInteger previousStrangeCounter = strangeCounter.divide(BigInteger.valueOf((long) 2));
				BigInteger remainingSeconds = time.subtract(previousSeconds);
				result = strangeCounter.subtract(remainingSeconds)
				break;
			}
			strangeCounter = strangeCounter.multiply(BigInteger.valueOf((long) 2));
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		BigInteger time = reader.nextBigInteger();

		BigInteger result = getResults(time);
		System.out.println(result);
	}
}
