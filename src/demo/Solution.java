package demo;

/**
 * @author lsy
 *
 */
public class Solution {
	/**
	 * Write a function that takes a string as input and returns the string
	 * reversed. Example: Given s = "hello", return "olleh". Subscribe to see
	 * which companies asked this question
	 */
	public String reverseString(String s) {
		char[] arr = s.toCharArray();
		for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
			char temp = s.charAt(i);
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return new String(arr);
	}

	/**
	 * You are playing the following Nim Game with your friend: There is a heap
	 * of stones on the table, each time one of you take turns to remove 1 to 3
	 * stones. The one who removes the last stone will be the winner. You will
	 * take the first turn to remove the stones.
	 * 
	 * Both of you are very clever and have optimal strategies for the game.
	 * Write a function to determine whether you can win the game given the
	 * number of stones in the heap.
	 * 
	 * For example, if there are 4 stones in the heap, then you will never win
	 * the game: no matter 1, 2, or 3 stones you remove, the last stone will
	 * always be removed by your friend.
	 */
	public boolean canWinNim(int n) {
		if (n % 4 == 0 || n <= 0) {
			return false;
		}
		return true;
	}

	/**
	 * Calculate the sum of two integers a and b, but you are not allowed to use
	 * the operator + and -.
	 * 
	 * Example: Given a = 1 and b = 2, return 3.
	 */
	public int getSum(int a, int b) {
		int sum = 0;
		int carry = 0;
		do {
			sum = a ^ b;
			carry = (a & b) << 1;
			a = sum;
			b = carry;
		} while (b != 0);
		return sum;
	}

	/**
	 * Given a non-negative integer num, repeatedly add all its digits until the
	 * result has only one digit.
	 * 
	 * For example:
	 * 
	 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has
	 * only one digit, return it.
	 */
	public int addDigits(int num) {
		if(num<10){
			return num;
		}
		int result=0;
		String temp=num+"";
		int lth=temp.length();
		while(lth>0){
			double f=Math.pow(10,lth-1); 
			int pr=num/(int)f;
			result = result+pr;
			num=num-pr*(int)f;
			lth--;
		}
		return addDigits(result);
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.addDigits(38));
	}
}
