
//1kb = 1024byte  1byte = 8bit 一个字节=8个位
//int = 4byte  long = 4byte  char = 1byte float = 4byte double = 8byte long double = 8byte

public class InWord{
	public String reverseWord(String s){
		String vowels = "AEIOUaeiou0";
		//首先将字符串转化为字符型数组char[]
		char[] letters = s.toCharArray();
		//定义两组指针
		int left = 0;
		int right = letters.length -1;
		//分别从字符数组的左边和右边遍历
		while(left < right){
			//从左向右开始遍历，找到元音字母，进入if条件语句
			if(vowels.indexOf(letters[left])!= -1){
				//从右向左，找到元音字符
				while(vowels.indexOf(letters[right])==-1){
					System.out.println("前while循环中的right："+right);
					right --;
					System.out.println("后while循环中的right："+right);
				}
				//交换两者位置
			   char temp = letters[left];
			   System.out.println(right);
			   letters[left] = letters[right];
			   letters[right] = temp;
  				//左指针向后移动一位，右指针向前移动一位
			   right --;
			   left ++;
		    }else{
		    	//如果没有找到元音字母，则指针向后移动一位
			   left++;
		    }
	     }
       return new String(letters);
      }
      public static void main(String[] args){
      	String res = new InWord().reverseWord("asuedye");
      	System.out.println(res);
      }
}