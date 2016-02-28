package inheritance;

public class TestNumber {

	// take an array af number and sum them up
	public static double sum(Number[] nums) {
		double sum = 0.0;
		for (Number num : nums) {
			sum += num.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		// Create a Number array
		Number[] nums = new Number[4];
		// assign devived class objects
		nums[0] = new Byte((byte) 10);
		nums[1] = new Integer(10);
		nums[2] = new Float(10.0f);
		nums[3] = new Double(10.0d);
		// pass the number array to sum and print the result
		System.out.println("The sum of number is: " + sum(nums));

	}

}
