public class PalinDrome{
	public boolean isPalinDrome(int x){
		if(x<0){return false;}
		if(x<10){return true;}
		int bits = (int)Math.log10((double)x);
		int a = 1;
		int b = (int)Math.pow(10,(double)bits);
		for(int i =0 ;i<bits/2 +1;i++){
			if((x/a)%10!=(x%10))return false;
			a = a *10;
			b = b/10;
		}
		return true;
	}
}