import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class move {
	public static List <List<Integer>> solution(int[] integerSet,int targetInteger){
		if (integerSet.length == 1&& integerSet[0]!=targetInteger) return null;
		List <List<Integer>> result = new LinkedList<List<Integer>>();
			if(targetInteger%integerSet[0] == 0) {
				int count = targetInteger/integerSet[0];
				for (int i =0;i<count;i++) {
					List <List<Integer>> templist = solution(Arrays.copyOfRange(integerSet, 1, integerSet.length-1), targetInteger-integerSet[0]*i);
					Iterator<List<Integer>> it = templist.iterator();
					while (it.hasNext()) {
						List<Integer> next = it.next();
						next.add(integerSet[0]);
						result.add(next);
					}
				}
			}
			else {
				if (targetInteger >integerSet[0] ) {
					
				
				List <List<Integer>> templist = solution(Arrays.copyOfRange(integerSet, 1, integerSet.length-1), targetInteger-integerSet[0]);
				Iterator<List<Integer>> it = templist.iterator();
				while (it.hasNext()) {
					List<Integer> next = it.next();
					result.add(next);
				}
			}
				else {
					List <List<Integer>> templist = solution(Arrays.copyOfRange(integerSet, 1, integerSet.length-1), targetInteger);
					Iterator<List<Integer>> it = templist.iterator();
					while (it.hasNext()) {
						List<Integer> next = it.next();
						result.add(next);
					}
				}
		}
		return result;
		
	}
	public static void main(String[] args) {
		System.out.println(solution(new int[]{2,3,6},6));
	}
}
