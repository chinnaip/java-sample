package in.conceptarchitect.utils;

import java.util.Random;

public class Utils {
	public static String toWords(int value) {
		if(value==0)
			return "ZERO";
		
		String []digits = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

		String sign= value<0 ? "MINUS" : "";
		
		String str="";
		
		if(value<0) value*=-1;
		
		while(value>0) {
			int d= value%10;
			str= digits[d]+" "+str;
			value=value/10;
		}
		
		System.out.println("value created is "+sign+" "+str);
		
		return sign+" "+str;
		
	}

	public static int randomValue() {
		Random random=new Random();
		int value= random.nextInt() % 100;
		return value;
	}
}
