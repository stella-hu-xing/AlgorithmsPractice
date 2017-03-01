package easy_level;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Write a program that outputs the string representation of numbers from 1 to
 * n.
 * 
 * But for multiples of three it should output “Fizz” instead of the number and
 * for the multiples of five output “Buzz”. For numbers which are multiples of
 * both three and five output “FizzBuzz”.
 * 
 * @author xinghu
 *
 */
public class FizzBuzz_412 {

	public static void main(String[] args) {
		FizzBuzz_412 fb = new FizzBuzz_412();
		System.out.println(fb.fizzBuzz(15));
		
	}

	//Runtime: 4 ms  beats39.34%
	public List<String> fizzBuzz(int n) {
		List<String> answer = new ArrayList<String>();
		for (int i  =0; i <n; i++) {
			if ((i+1) % 3 == 0 && (i+1) % 5 != 0)
				answer.add(i , "Fizz");
			else if ((i+1) % 3 != 0 && (i+1) % 5 == 0)
				answer.add(i , "Buzz");
			else if ((i+1) % 3 == 0 && (i+1) % 5 == 0)
				answer.add(i, "FizzBuzz");
			else
				answer.add(i, String.valueOf((i+1)));

		}

		return answer;
	}
}
