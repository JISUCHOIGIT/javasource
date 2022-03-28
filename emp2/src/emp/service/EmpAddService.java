package emp.service;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;
import emp.util.ConsoleUtil;

import static emp.dao.JdbcUtil.*;

import java.sql.Connection;

public class EmpAddService {

	public boolean addEmp(EmpDTO newEmp) throws Exception {
		

		boolean isAddSuccess = false;
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		boolean result = dao.insert(newEmp);
		
		if (result) {
			commit(con);
			isAddSuccess = true;
			
		} else {
			rollback(con);
		}
				
		close(con);
		return isAddSuccess;
	}
}
