package bit.basic.obj2;

public class ListAction {
	private String Path;
	private boolean redirect;
	
	
	public ListAction(String path, boolean redirect) {
		super();
		Path = path;
		this.redirect = redirect;
	}
	public ActionForWard excute() {
		System.out.println("ListAction");
		return new ActionForWard(Path, redirect);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
