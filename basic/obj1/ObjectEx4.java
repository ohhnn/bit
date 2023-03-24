package bit.basic.obj1;

import java.io.*;
import java.util.*;


//다형성 안시성 만리장성 화성 목성 토성 
public class ObjectEx4 {
	public InputStream getBufferInput()throws Exception{
		
		return new FileInputStream(new File(""));
	}
	public List getList() {
		return new Stack();
	}
	
	public void methodObj1() {
		System.out.println("Data:");
		BufferedInputStream br=null;
		try {
		//	bis=new BufferedInputStream(new FileInputStream(new File(new StringBuffer().toString())));
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(System.in);
			System.out.println(br.readLine());
		} catch (Exception e) {

		}
	}
	public void methodObj2(Object value) {
		if (value instanceof Double) {
			System.out.println(((Double)value).doubleValue());
			
		}
		if (value instanceof String) {
			System.out.println(((String)value).substring(0));
			
		}
		
	}
	public static void main(String[] args) {
		ObjectEx4 o = new ObjectEx4();
		o.methodObj2(10.1);

	}

}
