package fieldExam;

public class SnackController {
	private Snack s = new Snack();
	
	public SnackController() {
		
	}

	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return s.information();
	}

	@Override
	public String toString() {
		return "SnackController [s=" + s + "]";
	}
	
	}
	
	

