import java.util.*;
public class ArraySort{
	public static void sort(){
		int[] a = {1,9,3,4,5,2,34,34,23,53,5234,2,4};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		sort();
	}
}