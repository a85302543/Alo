package other;

import java.util.Arrays;
import java.util.Comparator;

public class findminString {
	public static class Com implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			return (o1 + o2).compareTo(o2 + o1);
		}
		
	}
	public static String findMinString(String[] strs) {
		if(strs == null||strs.length == 0) return "";
		Arrays.sort(strs, new Com());
		String result = "";
		for (String s:strs) {
			result+=s;
		}
		return result;
		
	}
	public static void main(String[] args) {
		System.out.println(findMinString(new String[]{"ca","c","bb"}));
	}
}

