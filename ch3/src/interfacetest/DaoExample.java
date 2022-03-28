package interfacetest;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) { //메인 클래스에 메소드 기재 가능
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
