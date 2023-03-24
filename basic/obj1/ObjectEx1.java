package bit.basic.obj1;
//묶음() 손발을 꽁꽁 묶음 
public class ObjectEx1 extends Object {
	public ObjectEx1() {
		System.out.println(this.equals(this));
	}
	public static void main(String[] args) {
//		new ObjectEx1();
		String str="abc";
		System.out.println(str.equals("엥비씨 "));
	}

}
