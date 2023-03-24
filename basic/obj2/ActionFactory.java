package bit.basic.obj2;

public class ActionFactory {
	private static ActionFactory actionFactory;
	public static ActionFactory getInstance() {
		if(actionFactory==null) {
			actionFactory=new ActionFactory();
		}
		return actionFactory;
	}
	public Action getAction(String command) {
		if(command.equals("login")) {
			return new LoginAction("loginView", true);
		}
		if(command.equals("lsit")) {
			return new LoginAction("listView", false);
		}
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
