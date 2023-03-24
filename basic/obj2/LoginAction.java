package bit.basic.obj2;

public class LoginAction extends Action {
	private String path;
	private boolean redirect;
	
	public LoginAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}
	public ActionForWard excute()	{
		return new ActionForWard(path, redirect);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
