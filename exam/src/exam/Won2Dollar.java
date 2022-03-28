package exam;

public class Won2Dollar extends Converter {

	@Override
	protected double converter(double src) {
		return src / 1200;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return " 달러";
	}

}
