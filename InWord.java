

public class InWord{
	public String reverseWord(String s){
		String vowels = "AEIOUaeiou0";
		//首先将
		char[] letters = s.toCharArray();

		int left = 0;
		int right = letters.length -1;

		while(left < right){
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
      	String res = new InWord().reverseWord("asuedye");
      	System.out.println(res);
      }
}