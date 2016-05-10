import java.util.HashMap;
import java.util.Map;
public class LongSubString{

	public int lengthOfLongestSubstring(String s){
		char[] arr = s.toCharArray();
		int max = 0, cur = 0, start = 0;
		int[] map = new int[255];
		for(int i=0;i<arr.length;i++){
			char c = arr[i];
			if(map[c]==0){
				map[c] = i+1;
				cur ++;
				if(cur > max ){
					max = cur;
				}
			}else{
				int end = map[c]-1;
				for(int j = start;j<end;j++){
					map[arr[j]] = 0;
				}
				start = end+1;
				map[arr[i]] = i+1;
				cur = i -end;
			}

		}
		return max;
	}
}