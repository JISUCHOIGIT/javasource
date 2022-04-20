package item.action;


public class ItemActionFactory {
	private static ItemActionFactory baf;
	
	private ItemActionFactory() {}
	
	public static ItemActionFactory getInstance() {
		if(baf == null) {
			baf = new ItemActionFactory();
		}
		return baf;
	}
	Action action = null;
	public Action action(String cmd) {
		
		if(cmd.equals("/list.do")) {
			action = new ItemListAction("/list.jsp");
		} else if(cmd.equals("/insert.do")) {
			action = new ItemInsertAction("/list.do");
		} else if(cmd.equals("/delete.do")) {
			action = new ItemDeleteAction("/list.do");
		} else if(cmd.equals("/update.do")) {
			action = new ItemUpdateAction("/list.do");
		} else if(cmd.equals("/search.do")) {
			action = new ItemSearchAction("/list.jsp");
		}
		
		return action;
	}

}
