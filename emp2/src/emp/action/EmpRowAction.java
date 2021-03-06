package emp.action;

import java.util.Scanner;

import emp.dto.EmpDTO;
import emp.service.EmpRowService;
import emp.util.ConsoleUtil;

public class EmpRowAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		EmpRowService service = new EmpRowService();
		
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.printRowMessage(sc);
		
		//출력
		EmpDTO dto = service.getRow(empno);
		util.printEmpMessage(dto);
	}

}
