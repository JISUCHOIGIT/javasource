package pattern.action;

public class ActionForward {
	
	private String path;
	private boolean redirect; //true(sendRedirect),false(forward)
	
	public ActionForward() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ActionForward(String path, boolean redirect) {
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
	
	
	
}
