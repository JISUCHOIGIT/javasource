package exam;

public class ColorTV extends TV {
	
	public ColorTV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ColorTV(int size, int color) {
		super(size,color);
	}

	void printProperty(int size, int color) {
		System.out.println(size + "인치 " + color + "컬러");
	}

}
