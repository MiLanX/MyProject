public class TwoSum{
	public int[] sum(int[] nums ,int target){
		int[] result;
		for(int i=0；i<nums.length-1;i++){
			for(int j=0;j<nums.length;j++){
				if(nums[i]+nums[j] == target){
					result = new int[2];
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
	}
	public static void main(String[] args){
		
	}
}