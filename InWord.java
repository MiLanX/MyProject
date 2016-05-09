

public class InWord{
	public String reverseWord(String s){
		String vowels = "AEIOUaeiou0";
		//首先将字符串转化为字符串数组
		char[] letters = s.toCharArray();
		//定义两个指针，分别从两端进行遍历
		int left = 0;
		int right = letters.length -1;
		
		while(left < right){
			//如果左指针没有遍历到元音字符
			if(vowels.indexOf(letters[left])!= -1){
				
				while(vowels.indexOf(letters[right])==-1){
					right --;
				}
			
			   char temp = letters[left];
			   letters[left] = letters[right];
			   letters[right] = temp;
  
			   right --;
			   left ++;
		    }else{
			left++;
		    }
	     }
       return new String(letters);
      }
      public static void main(String[] args){
      	String res = new InWord().reverseWord("hello");
      	System.out.println(res);
      }
}
