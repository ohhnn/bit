package bit.basic.obj2;

public class ActionForWard {
	private String path;
	private boolean redirect;
	
	public ActionForWard(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
