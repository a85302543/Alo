package other;

import java.util.*;

public class DeletesameChar {
	public static String deleteSameChar(String str) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<>();
		char[] temp = str.toCharArray();
		for (int i = 0;i<temp.length;i++) {
			if (!set.contains(temp[i])) {
				set.add(temp[i]);
				sb.append(temp[i]);
			}
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(deleteSameChar(s));
	}
}
