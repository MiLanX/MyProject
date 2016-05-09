public class MyFirst{
	public static int answer(double[] y,double[] x){
		if(y == null || x == null || x.length != y.length ||
			y.length == 0 || x.length == 0){
			return 0;
		}
		double xMin = getMin(x, x.length);
		double yMin = getMin(y, y.length);
		return (int)Math.round((1-(yMin / xMin))*100);
	}
	public static double getMin(double[] array, int len){
		double min = array[0];
		for (int i=1; i<len; i++) {
			min = Math.min(min, array[i]);
		}
		return min;
	}
	public static void main(String[] args) {
		double[] y = {2.299999999999998, 15.0,102.400000000000001,3452.999999999991};
		double[] x = {23.0,150.0,1025.0,425.000};
		int result = answer(y,x);
		System.out.println("result:"+result);
	}

}