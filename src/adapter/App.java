package adapter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ��һ����Ľӿ�ת���ɿͻ�ϣ�������һ���ӿڡ�Adapterģʽʹ��ԭ�����ڽӿڲ����ݶ���һ��������Щ�����һ������
 * 
 * 
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0
 * @time: 2014-9-30
 */
public class App
{
    
    public static void main(String[] args)
    {

        
    	double a = 1;
    	float b = 0.9f;
System.out.println(a*b);
    	double bb=0.9;
    	BigDecimal a1 = new BigDecimal(Double.toString(a));
    	BigDecimal b1 = new BigDecimal(Float.toString(b));
    	BigDecimal a2 = new BigDecimal(a);
    	BigDecimal b2 = new BigDecimal(b);
    	double c = a1.multiply(b1).doubleValue();
    	double d = a2.subtract(b2).doubleValue();
    	System.out.println("c="+c);
    	System.out.println("d="+d);
    	System.out.println("1.01+2.02+3.03="+(1.01+2.02+3.03));
    	System.out.println("d="+multiply(get2Double(a),b));
    	System.out.println("dd="+multiply(0.9f,0.9f));
    }
    public static double get2Double(double a){
        DecimalFormat df=new DecimalFormat(".##");
        return new Double(df.format(a).toString());
    }
	public static double multiply(double a, float b){
		BigDecimal DecimalA = new BigDecimal(String.valueOf(a)) ;
  		BigDecimal DecimalResult = new BigDecimal(String.valueOf(b)).multiply(DecimalA);
  		return DecimalResult.doubleValue();
	}
	public static float multiply(float a, float b){
		BigDecimal DecimalA = new BigDecimal(String.valueOf(a)) ;
  		BigDecimal DecimalResult = new BigDecimal(String.valueOf(b)).multiply(DecimalA);
  		return DecimalResult.floatValue();
  		//return (float)DecimalResult.doubleValue();
	}
    public static  List<String> get()
    {
        List<String> ttt=new ArrayList<String>();
        ttt.add("12");
        return ttt;
    }
}
