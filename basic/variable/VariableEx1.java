package bit.basic.variable;
//변수 (local(stack), static(static,class), instance(Heap)) 
//클래스(설계도(속성+기능)) --------> 객체 Object
//객체는 기능을 갖고있는 데이터다 !
//기본 primitive | 참조형 Reference

public class VariableEx1 {
	 /*클래스 영역*/
	int y; //heap
	static int z; //static 정적 
	public void variableMethod1() {
		int x; //지역변수 
		// x++; 
	}
	public void variableMethod2(int x) {
		//private int value;
		//static int view;
		
	}
	
	public static void main(String[] args) {
		/*매서드 영역 */
		VariableEx1 v1 = new VariableEx1();
		VariableEx1 v2 = new VariableEx1();
		VariableEx1 v3 = new VariableEx1();

	}

}
