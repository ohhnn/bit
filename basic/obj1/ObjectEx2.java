package bit.basic.obj1;

public class ObjectEx2 {
	public void add(int x) {
		System.out.println("void add(int x)");
	}
	public void add(int x, int y) {
		System.out.println("void add(int x, int y)");
	}
	public void add(int x, long y) {
		System.out.println("void add(int x, long y)");
	}
	public void add(long x, int y) {
		System.out.println("void add(long x, int y)");
	}
//	public int add(int y) {
//		return 0;
//	}
	public static void main(String[] args) {
		ObjectEx2 o = new ObjectEx2();
		o.add(1,2);
		
	}

}
