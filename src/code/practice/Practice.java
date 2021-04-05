package code.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Aditi
 *
 */
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey Guru");
		/*
		 * int[] A = { 3, 8, 9, 7, 6 }; for (int value : solution(A, 5)) {
		 * System.out.println(value); }
		 */
		int[] A = {1, 3, 6, 4, 1, 2};
		int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};
		System.out.println(solution55(4,"two"));
	}

	public static int[] solution(int[] A, int K) {
		int ALength = A.length;
		int[] Result = new int[ALength];
		for (int i = 0; i < A.length; i++) {
			if (i + K < ALength) {
				Result[i + K] = A[i];
			} else {
				Result[i + K - A.length] = A[i];
			}
		}
		return Result;

	}

	public static int solution2(int N) {
		// 1 0 0 1
		String bin = Integer.toBinaryString(N);
		int count = 0;
		int reslen = 0;
		boolean start = false;
		int[] result = Arrays.stream(bin.split("")).mapToInt(Integer::parseInt).toArray();
		for (int value : result) {
			if (value == 1)
				count++;
		}
		if (count > 1) {
			count = 0;
			for (int i = 0; i < result.length; i++) {
				if (result[i] == 1) {
					start = true;
					if (count > 0) {
						if (reslen < count) {
							reslen = count;
						}
						count = 0;
					}
				}
				if (start == false) {
					count++;
				}
				if (i == result.length - 1) {
					if (reslen < count) {
						reslen = count;
					}
				}
				start = false;
			}
			return reslen;
		} else {
			return 0;
		}
		
		
	}
	public static int solution3(int[] A) {
		int N = A.length;
		int val=0;
		Set<Integer> set = new HashSet<>();
		for (int a : A) {
		    if (a > 0) {
		        set.add(a);
		    }
		}
		for (int i = 1; i <= N + 1; i++) {
		    if (!set.contains(i)) {
		        val = i;
		    }
		}
		return val;
	}
	
	public static int solution55(int D, String S) {
		Map<String, Integer> val = new HashMap<String, Integer>();
		val.put("one", 1);
		val.put("two", 2);
		val.put("three", 3);
		val.put("four", 4);
		val.put("five", 5);
		return D * val.get(S);
		
	}
}
