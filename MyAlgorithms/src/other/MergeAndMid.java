package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class MergeAndMid {
	public static double mergeAndMid(double[] arr2,double[]arr1) {
		LinkedList<Double> temp = new LinkedList<>();
		HashSet<Double> set = new HashSet<>();
		for (int i = 0;i<arr1.length;i++) {
			if (!set.contains(arr1[i])) {
				set.add(arr1[i]);
				temp.add(arr1[i]);
			}
		}
		for (int i = 0;i<arr2.length;i++) {
			if (!set.contains(arr2[i])) {
				set.add(arr2[i]);
				temp.add(arr2[i]);
			}
		}
		Object[] result = temp.toArray();
		Arrays.sort(result);
		if (temp.size()%2 != 0) return (double) result[temp.size()/2];
		return (((double)result[temp.size()/2]) + (double)result[temp.size()/2 - 1])/2;
		
	}
	public static void main(String[] args) {
		double[] arr= {1,2,7,8,5};
		double[] arr2= {1,4,2,3};
		System.out.println(mergeAndMid(arr2, arr));
	}
}
