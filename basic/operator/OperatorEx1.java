package bit.basic.operator;
//최우선 () . [] 
//
public class OperatorEx1 {
	
	//public int firstOperator(int x, int y, int z, int k) {		
		//return x>y?(x+y*z*k):(x+y)*z+k;
	//}
	public int[] firstOperator(int ...x) {
		return x;
	}
	public void logicMethod(int x, int y, int z) {
		boolean b=++x==1&& y++==2||++z==4;
		System.out.println("B="+ b + " x="+x+ "y="+y);
	}
	public static void main(String[] args) {
		OperatorEx1 o1 = new OperatorEx1();
		int rs = o1.firstOperator(1,2,3,4,5,6,7,8,9)[0] + o1.firstOperator(1,2,3,4,5,6,7,8,9)[1];
		System.out.println(rs);
	}

}