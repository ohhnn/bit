package bit.basic.obj2;
import java.util.*;

public class ActionProcess {
	private Scanner sc = new Scanner(System.in);
	
	public void menu() {
				String command="";
		while(true) {
			System.out.println("1.Login 2.List 3.Delete 4.Modify 5. Exit");

			switch (sc.nextInt()) {
			case 1:
				command="login";break;
			case 2:
				command="List";break;
			case 3:
				command="Delete";break;
			case 4:
				command="Modify";break;
			case 5:
				return;
			}
			new ActionFactory().getAction(command);
			ActionForWard af = action.excute();
			if(af.isRedirect()) {
				System.out.println(af.getPath()+"직접이동"));
			}
		}
	}
	
	public static void main(String[] args) {
		new ActionProcess().menu();
	}

}
