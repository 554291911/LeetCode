public class No3_ReverseInteger {

	public int reverse(int x) {
		if (x == Integer.MIN_VALUE)
			return 0;
		String result = "";
		if (x != Math.abs(x)) {
			x = -x;
			result += "-";
		}
		String t = "" + x;
		char[] c = t.toCharArray();
		for (int i = c.length - 1; i >= 0; i--)
			result += c[i];
		Long l = new Long(result);
		if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE)
			return 0;
		else
			return l.intValue();
	}

	public static void main(String[] args) {
		System.out.println(new No3_ReverseInteger().reverse(-2147483648));
	}

}