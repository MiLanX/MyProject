import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class LongSubString{
	public int lengthSubString(String s){
		char[] arr = s.toCharArray();
		int max = 0, cur = 0,start = 0,end = 0; 
		int[] ch  = new int[125];
		for(int i=0;i<arr.length;i++){
			char c = arr[i];
			if(ch[c] == 0){
				ch[c] = i+1;
				cur ++;
				if(max < cur){
					max = cur;
				}
			}else{
				start = ch[i] -1;
				for(int j = start;j<end;j++){
					ch[arr[j]] = 0;
				}
				ch[c] = i+1;
				cur++;
			}
		}
		return max;
	}
	public static void main(String[] args){
		String s = "asdbnmsiklb";
		System.out.println(new LongSubString().lengthSubString(s));
	}
}