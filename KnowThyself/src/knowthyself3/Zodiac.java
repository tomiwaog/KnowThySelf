package knowthyself3;

public class Zodiac {
	private String signName;
	private Qualities qualities;
	private Element element;
	private String symbol;
	private String motto;
	private String planetRuler;
	private String dateIntervals;
	private String Mode;

	public Zodiac(String signName, Qualities signQualities, Element element, 
			String symbol, String motto, String planetRuler, String dob,
			String Mode) {
		super();
		this.signName = signName;
		this.element = element;
		this.qualities = signQualities;
		this.symbol = symbol;
		this.motto = motto;
		this.planetRuler = planetRuler;
		this.dateIntervals = dob;
		this.Mode = Mode;
	}

	public String getSignName() {
		return signName;
	}

	public Qualities getQualities() {
		return qualities;
	}

	public Element getElement() {
		return element;
	}

	public String getDob() {
		return dateIntervals;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getMotto() {
		return motto;
	}

	public String getPlanetRuler() {
		return planetRuler;
	}

	public String getMode() {
		return Mode;
	}

	public void setMode(String mode) {
		Mode = mode;
	}

	public String getDateIntervals() {
		return dateIntervals;
	}

	public void setDateIntervals(String dateIntervals) {
		this.dateIntervals = dateIntervals;
	}

	public String details(){
		String strengths = qualities.getStrength();
		String weaknesses = qualities.getWeaknesses();
		String elem = element.getEleQualities();
		return "STRENGTHS: "+strengths+ "\nWEAKNESSES : "+weaknesses+ "\n"+"MORE: "+elem;
		
	}
}
