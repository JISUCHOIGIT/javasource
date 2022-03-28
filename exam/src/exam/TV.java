package exam;

public class TV {
	private int size;
	private int color;

	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TV(int size, int color) {
		super();
		this.size = size;
		this.color = color;
	}

	protected int getSize() {
		return size;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
