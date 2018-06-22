package knowthyselfv4;

import java.util.ArrayList;
import java.util.List;

public class Zodiacs {
	private ZodiacSign currentSign;
	List<ZodiacSign> allZodiacSign = new ArrayList<Zodiacs.ZodiacSign>();
	// ZodiacSign qualities declarations
	private Qualities ariesQual = new Qualities(
			"Courageous, determined, confident, passionate",
			"Impatient, moody, short-tempered, impulsive, aggressive");
	private Qualities taurusQual = new Qualities(
			"Honest, reliable, patient, practical, devoted, responsible",
			"VERY Stubborn, possessive, uncompromising");
	private Qualities geminiQual = new Qualities(
			"Intelligent, Adaptable, Outgoing, Communicative",
			"Indecisive, Over-analytical, Nosy");
	private Qualities cancerQual = new Qualities(
			"Tenacious, loyal, emotional, sympathetic, persuasive",
			"Moody, pessimistic, suspicious, manipulative, insecure");
	private Qualities leoQual = new Qualities(
			"Creative, extra-passionate about thing you really care about, can be generous, warm-hearted, cheerful, humorous",
			"Arrogant(well you'd say confident), stubborn, self-centered, can be inflexible");
	private Qualities virgoQual = new Qualities(
			"Loyal, analytical, kind, hardworking, practical",
			"Shyness, worry, overly critical of self and others, all work and no play, high sex drive");
	private Qualities libraQual = new Qualities(
			"Cooperative,diplomatic, gracious, fair-minded, social",
			"Indecisive, avoids confrontations, self-pity, Can appear as people pleaser");
	private Qualities sagittariusQual = new Qualities(
			"Generous, idealistic, great sense of humor, speaks their mind",
			"Promises more than can deliver, very impatient, says anything dont care");
	private Qualities scorpioQual = new Qualities(
			"Resourceful, brave, passionate, stubborn, a true friend",
			"Distrusting, jealous, secretive, violent, kill you in your sleep");
	private Qualities aquariusQual = new Qualities(
			"Progressive, original, independent, humanitarian, Trend setter, doesnt follow",
			"Runs from emotional expression, temperamental, uncompromising, aloof");
	private Qualities capricornQual = new Qualities(
			"Responsible, disciplined, self-control, good managers",
			"Know-it-all, unforgiving, condescending, can be stubborn, expecting the worst");
	Qualities piscesQual = new Qualities(
			"Compassionate, artistic, intuitive, gentle",
			"lack of confidence,naive, desire to escape reality");

	// Elements
	private Element airElement = new Element("Air",
			"All about action, ideas, and motion. You like change.");
	private Element fireElement = new Element("Fire",
			"Passionate, dynamic, and temperamental");
	private Element waterElement = new Element(
			"Water",
			"You like security in everything, Jobs, relationship.Intuitive, emotional and ultra-sensitive");
	private Element earthElement = new Element(
			"Earth",
			"You like to keep it real, you're loyal and stable, and stick by their people through hard times");

	private ZodiacSign aries = new ZodiacSign("Aries", ariesQual, fireElement, "Ram",
			"I am", "Mars", "Mar 20 - Apr 18", "");
	private ZodiacSign taurus = new ZodiacSign("Taurus", taurusQual, earthElement,
			"Bull", "I have", "Venus", "Apr 19 - May 20", "");
	private ZodiacSign gemini = new ZodiacSign("Gemini", geminiQual, airElement,
			"Twin", "I think", "Mecury", "May 21 - Jun 20", "Mutable");
	private ZodiacSign cancer = new ZodiacSign("Cancer", cancerQual, waterElement,
			"Crab", "I feel", "Jun 21 - Jul 22", "Moon", "");
	private ZodiacSign leo = new ZodiacSign("Leo", leoQual, fireElement, "Lion",
			"I will", "Sun", "Jul 23 - Aug 22", "");
	private ZodiacSign virgo = new ZodiacSign("Virgo", virgoQual, earthElement,
			"Virgin", "I analyse", "Mercury", "Aug 23 - Sep 22", "");
	private ZodiacSign libra = new ZodiacSign("Libra", libraQual, airElement, "Scales",
			"I balance", "Venus", "Sep 23 - Oct 22", "");
	private ZodiacSign scorpio = new ZodiacSign("Scorpio", scorpioQual, waterElement,
			"Scorpion", "I lust", "Pluto ex Mars", "Oct 23 - Nov 21", "");
	private ZodiacSign sagittarius = new ZodiacSign("Sagittarius", sagittariusQual,
			fireElement, "Archer", "I see", "Jupiter", "Nov 22 - Dec 21", "");
	private ZodiacSign capricorn = new ZodiacSign("Scorpio", capricornQual,
			earthElement, "Goat", "I use", "Saturn", "Dec 22 - Jan 19 ", "");
	private ZodiacSign aquarius = new ZodiacSign("Aries", aquariusQual, airElement,
			"Water Carrier", "I know", "Uranus ex Saturn", "Jan 20 - Feb 18",
			"");
	private ZodiacSign pisces = new ZodiacSign("Aries", piscesQual, waterElement,
			"Fishes", "I believe", "Neptune ex jupiter", "Feb 19 - Mar 19", "");

	public Zodiacs() {
		
		allZodiacSign.add(aries);
		allZodiacSign.add(taurus);
		allZodiacSign.add(gemini);
		allZodiacSign.add(cancer);
		allZodiacSign.add(leo);
		allZodiacSign.add(virgo);
		allZodiacSign.add(libra);
		allZodiacSign.add(sagittarius);
		allZodiacSign.add(scorpio);
		allZodiacSign.add(capricorn);
		allZodiacSign.add(aquarius);
		allZodiacSign.add(pisces);
	}

	public  int findZodiacLoc(String sign) {
		for (int i = 0; i < allZodiacSign.size(); i++) {
			if (allZodiacSign.get(i).getSignName().equalsIgnoreCase(sign)) {
				return i;
			}
		}
		System.out.println("Could not find " + sign);
		return -1;
	}

	public ZodiacSign findZodiacSign(String txtSign) {
		int signLoc = findZodiacLoc(txtSign);

		if (signLoc >= 0) {
			ZodiacSign sign = allZodiacSign.get(signLoc);
			return sign;
		} else
			System.out.println("We couldnt find " + txtSign);
		return null;
	}
	
	public String getCurrSign(){
		return currentSign.getSignName();
	}

	public String viewZodiacDetails(){
		return currentSign.toString();
	}
	public void setCurrSign(ZodiacSign x){
		currentSign=x;
	}
	private class ZodiacSign {
		private String signName;
		private Qualities qualities;
		private Element element;
		private String symbol;
		private String motto;
		private String planetRuler;
		private String dateIntervals;
		private String Mode;

		ZodiacSign(String signName, Qualities signQualities, Element element,
				String symbol, String motto, String planetRuler, String dob,
				String Mode) {
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


		public String getDateIntervals() {
			return dateIntervals;
		}


		@Override
		public String toString() {
			String strengths = qualities.getStrength();
			String weaknesses = qualities.getWeaknesses();
			String elem = element.getEleQualities();
			return "STRENGTHS: " + strengths + "\nWEAKNESSES : " + weaknesses
					+ "\n" + "MORE: " + elem;

		}
		
		@SuppressWarnings("unused")
		public String fullDetails(){
			return getMotto()+ getMode()+getDob()+getSymbol()+ getPlanetRuler()+ getElement() + getDateIntervals()+ getQualities()+ getPlanetRuler();
		}
	}
}

class Element {
	private String name;
	private String eleQualities;

	public Element(String name, String eleQualities) {
		super();
		this.name = name;
		this.eleQualities = eleQualities;
	}

	public String getName() {
		return name;
	}

	public String getEleQualities() {
		return eleQualities;
	}
}

class Qualities {
	private String strength;
	private String weaknesses;

	public Qualities(String strength, String weaknesses) {
		this.strength = strength;
		this.weaknesses = weaknesses;
	}

	public String getStrength() {
		return strength;
	}

	public String getWeaknesses() {
		return weaknesses;
	}
}