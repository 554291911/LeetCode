public class No4_PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		else {
			char[] t = (x + "").toCharArray();
			for (int i = 0; i < t.length / 2; i++) {
				if (t[i] != t[t.length - 1 - i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(new No4_PalindromeNumber().isPalindrome(123454321));
	}
}