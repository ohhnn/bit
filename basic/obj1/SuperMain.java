package bit.basic.obj1;

public class SuperMain {

	public static void main(String[] args) {
		//SuperCla
		// sp = new SuperClass();
		//SubClass1 sc1 = new SubClass1();
		
		//SubClass2 sc2 = new SubClass2(); //SubClass2(  SuperClass(  Object( )  )    )
		SubClass2 sc2 = (SubClass2) new SuperClass();
		//SuperClass s= new SubClass3();
		sc2.actionProces();
	}

}
