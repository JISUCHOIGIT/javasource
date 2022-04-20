package item.service;

import static item.dao.JdbcUtil.*;

import java.sql.Connection;

import item.dao.ItemDAO;
import item.dto.ItemDTO;

public class ItemInsertService {
	public boolean insert(ItemDTO insertDto) {
		Connection con = getConnection();
		ItemDAO dao = new ItemDAO(con);
		
		boolean result = dao.insert(insertDto);
		
		if(result) {
			commit(con);
		} else {
			rollback(con);
		}
		close(con);
		
		
		return result;
	}
	
	
	
}
