import java.util.Scanner;

public class ZigZag{
	public String convert(String s, int numRows){
		if(numRows < 2){
			return s;
		}
		StringBuffer[] sb = new StringBuffer[numRows];
		int index = 0, incre = 1;
		for(int i = 0;i<sb.length;i++){
			sb[i] = new StringBuffer(" ");
		}
		for(int i=0;i<s.length();i++){
			sb[index].append(s.charAt(i));
			if(index == 0){incre = 1;}
			if(index == numRows-1){incre = -1;}
			index += incre;
		}
		String re = "";
		for(int i=0;i<sb.length;i++){
			re+=sb[i];
		}
		return re;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(new ZigZag().convert(str,4));
	}
}