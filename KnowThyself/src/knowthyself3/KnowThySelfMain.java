package knowthyself3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class KnowThySelfMain {

	private static Scanner sc = new Scanner(System.in); ;

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM");

		
		// Zodiac qualities
		Qualities ariesQual = new Qualities(
				"Courageous, determined, confident, passionate",
				"Impatient, moody, short-tempered, impulsive, aggressive");
		Qualities taurusQual = new Qualities(
				"Honest, reliable, patient, practical, devoted, responsible",
				"VERY Stubborn, possessive, uncompromising");
		Qualities geminiQual = new Qualities(
				"Intelligent, Adaptable, Outgoing, Communicative",
				"Indecisive, Over-analytical, Nosy");
		Qualities cancerQual = new Qualities(
				"Tenacious, loyal, emotional, sympathetic, persuasive",
				"Moody, pessimistic, suspicious, manipulative, insecure");
		Qualities leoQual = new Qualities(
				"Creative, extra-passionate about thing you really care about, can be generous, warm-hearted, cheerful, humorous",
				"Arrogant(well you'd say confident), stubborn, self-centered, can be inflexible");
		Qualities virgoQual = new Qualities(
				"Loyal, analytical, kind, hardworking, practical",
				"Shyness, worry, overly critical of self and others, all work and no play, high sex drive");
		Qualities libraQual = new Qualities(
				"Cooperative,diplomatic, gracious, fair-minded, social",
				"Indecisive, avoids confrontations, self-pity, Can appear as people pleaser");
		Qualities sagittariusQual = new Qualities(
				"Generous, idealistic, great sense of humor, speaks their mind",
				"Promises more than can deliver, very impatient, says anything dont care");
		Qualities scorpioQual = new Qualities(
				"Resourceful, brave, passionate, stubborn, a true friend",
				"Distrusting, jealous, secretive, violent, kill you in your sleep");
		Qualities aquariusQual = new Qualities(
				"Progressive, original, independent, humanitarian, Trend setter, doesnt follow",
				"Runs from emotional expression, temperamental, uncompromising, aloof");
		Qualities capricornQual = new Qualities(
				"Responsible, disciplined, self-control, good managers",
				"Know-it-all, unforgiving, condescending, can be stubborn, expecting the worst");
		Qualities piscesQual = new Qualities(
				"Compassionate, artistic, intuitive, gentle",
				"lack of confidence,naive, desire to escape reality");


		// Elements
		Element airElement = new Element("Air",
				"All about action, ideas, and motion. You like change.");
		Element fireElement = new Element("Fire",
				"Passionate, dynamic, and temperamental");
		Element waterElement = new Element(
				"Water",
				"You like security in everything, Jobs, relationship.Intuitive, emotional and ultra-sensitive");
		Element earthElement = new Element(
				"Earth",
				"You like to keep it real, you're loyal and stable, and stick by their people through hard times");

		Zodiac aries = new Zodiac("Aries", ariesQual, fireElement, "Ram",
				"I am", "Mars", "Mar 20 - Apr 18", "");
		Zodiac taurus = new Zodiac("Taurus", taurusQual, earthElement, "Bull",
				"I have", "Venus", "Apr 19 - May 20", "");
		Zodiac gemini = new Zodiac("Gemini", geminiQual, airElement, "Twin",
				"I think", "Mecury", "May 21 - Jun 20", "Mutable");
		Zodiac cancer = new Zodiac("Cancer", cancerQual, waterElement, "Crab",
				"I feel", "Jun 21 - Jul 22", "Moon", "");
		Zodiac leo = new Zodiac("Leo", leoQual, fireElement, "Lion", "I will",
				"Sun", "Jul 23 - Aug 22", "");
		Zodiac virgo = new Zodiac("Virgo", virgoQual, earthElement, "Virgin",
				"I analyse", "Mercury", "Aug 23 - Sep 22", "");
		Zodiac libra = new Zodiac("Libra", libraQual, airElement, "Scales",
				"I balance", "Venus", "Sep 23 - Oct 22", "");
		Zodiac scorpio = new Zodiac("Scorpio", scorpioQual, waterElement,
				"Scorpion", "I lust", "Pluto ex Mars", "Oct 23 - Nov 21", "");
		Zodiac sagittarius = new Zodiac("Sagittarius", sagittariusQual,
				fireElement, "Archer", "I see", "Jupiter", "Nov 22 - Dec 21",
				"");
		Zodiac capricorn = new Zodiac("Scorpio", capricornQual, earthElement,
				"Goat", "I use", "Saturn", "Dec 22 - Jan 19 ", "");
		Zodiac aquarius = new Zodiac("Aries", aquariusQual, airElement,
				"Water Carrier", "I know", "Uranus ex Saturn",
				"Jan 20 - Feb 18", "");
		Zodiac pisces = new Zodiac("Aries", piscesQual, waterElement, "Fishes",
				"I believe", "Neptune ex jupiter", "Feb 19 - Mar 19", "");

		System.out
				.println("\n\t\t\tWelcome to KnowThself 3.0."
						+ "\nAn app that attempt to Analyse you using Cognitive Computing, Philosophy, Mathematics and Sociology."
						+ "\t\t\n\nPlease press ENTER to Continue.....");

		
		

		@SuppressWarnings("unused")
		String keyRandom = sc.nextLine();
		System.out
				.println("Thank you! You will now be presented with cognitive Question. Enter them to the best of your abilities for the most accurate result."
						+ "\t\n\nPress Enter to START.");
		keyRandom = sc.nextLine();
		
		System.out.print("\nPlease Enter your full name: ");
		String fName = sc.nextLine();
		System.out.print("\nEnter your favourite Number: ");
		String faveNum = sc.nextLine();
		String yesNo = "";
		if (Integer.parseInt(faveNum) <= 31) {
			System.out
					.print("Is your favourite number the same day as your birthday? Enter yes or No: ");
			yesNo = sc.nextLine();
		}
		System.out.print("\nPlease enter your favourite drink: ");
		String faveDrink = sc.nextLine();
		System.out.print("\nPlease enter your favourite Food: ");
		String faveFood = sc.nextLine();
		System.out.print("\nPlease enter your favourite Colour: ");
		String faveColor = sc.nextLine();
		System.out.print("\nPlease enter your favourite sport. or N/A: ");
		String faveSport = sc.nextLine();
		String dob = "";
		if (yesNo.toLowerCase().contains("y")) {
			System.out
					.print("\nEnter your month of birth. i.e June ==06 | January ==01: ");
			String month = sc.nextLine();
			if (Integer.parseInt(faveNum) < 9) {
				faveNum = "0" + faveNum;
			}
			dob = faveNum + "/" + month;
		} else {
			System.out.print("\nEnter dob of birth e.g. 23/06: ");
			dob = sc.nextLine();
			dob = dob.substring(0, 5);
		}
		System.out.print("\nPlease enter your Hobbie or hobbies :");
		String hobbie = sc.nextLine();

		System.out.println("\n\nThank you, Press ENTER to see result");
		keyRandom = sc.nextLine();
		Person user = new Person(fName, dob);

		if (user.getDob().after(fmt.parse("19/03"))
				&& user.getDob().before(fmt.parse("19/04"))) {
			user.setZodSign(aries);
		} else if (user.getDob().after(fmt.parse("18/04"))
				&& user.getDob().before(fmt.parse("21/05"))) {
			user.setZodSign(taurus);
		} else if (user.getDob().after(fmt.parse("20/05"))
				&& user.getDob().before(fmt.parse("21/06"))) {
			user.setZodSign(gemini);
		} else if (user.getDob().after(fmt.parse("20/06"))
				&& user.getDob().before(fmt.parse("23/07"))) {
			user.setZodSign(cancer);
		} else if (user.getDob().after(fmt.parse("22/07"))
				&& (user.getDob().before(fmt.parse("23/08")))) {
			user.setZodSign(leo);
		} else if (user.getDob().after(fmt.parse("22/08"))
				&& user.getDob().before(fmt.parse("23/09"))) {
			user.setZodSign(virgo);
		} else if (user.getDob().after(fmt.parse("22/09"))
				&& user.getDob().before(fmt.parse("23/10"))) {
			user.setZodSign(libra);
		} else if (user.getDob().after(fmt.parse("22/10"))
				&& user.getDob().before(fmt.parse("22/11"))) {
			user.setZodSign(scorpio);
		} else if (user.getDob().after(fmt.parse("21/11"))
				&& user.getDob().before(fmt.parse("22/12"))) {
			user.setZodSign(sagittarius);
		} else if (user.getDob().after(fmt.parse("21/12"))
				|| user.getDob().before(fmt.parse("20/01"))) {
			user.setZodSign(capricorn);
		} else if (user.getDob().after(fmt.parse("19/01"))
				&& user.getDob().before(fmt.parse("19/02"))) {
			user.setZodSign(aquarius);
		} else if (user.getDob().after(fmt.parse("18/02"))
				&& user.getDob().before(fmt.parse("20/03"))) {
			user.setZodSign(pisces);
		} else
			System.out.println("You enter invalid data");
		System.out
				.println("Thank you, "
						+ user.getName()
						+ ". Based on the data you've provided."
						+ "\nYou come across as a person with the following qualities.\n");
		user.printPersonDetails();

	}
}
