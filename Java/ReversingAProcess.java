package codewars;

public class ReversingAProcess {
	public static String decode(String r) {
		String line = "";
		String line2 = "";
		for (int i = 0; i < r.length(); i++) {
			if (Character.isDigit(r.charAt(i))) {
				line2 += r.charAt(i);
			} else {
				line += r.charAt(i);
			}
		}
		String res = "";
		for (int i = 0; i < line.length(); i++) {
			for (int k = 0; k < 26; k++) {
				if (((char) ((k * Integer.parseInt(line2) % 26) + 97)) == line.charAt(i)) {
					res += (char) (k + 97);
				}
			}
		}
		if (!res.equals(line)) {
			return res;
		} else {
			return "Impossible to decode";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decode("1877138eieaqgumigywmicwgcgg"));
	}

}
