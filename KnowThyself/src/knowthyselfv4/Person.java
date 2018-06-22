package knowthyselfv4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String faveDrink;
	private String faveFood;
	private String faveSport = "";
	private Zodiacs zodiacs;
	private String faveColor;
	private String myHobbies;



	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM");

	public String getName() {
		return name;
	}

	public String getFaveSport() {
		return faveSport;
	}

	public Person(String name, String dob, String faveDrink, String faveFood,
			String faveColor, String faveSport, String myHobbies) {
		zodiacs = new Zodiacs();
		this.name = name;
		this.faveDrink = faveDrink;
		this.faveFood = faveFood;
		this.faveColor = faveColor;
		this.myHobbies = myHobbies;
	}

	public Person(String name, String dob) {
		this(name, dob, "", "", "", "", "");
		try {
			this.dob = fmt.parse(dob);
		} catch (ParseException e) {
			System.out.println("Please enter date in the format dd/MM");
		}
		try {
			setZodSign();
		} catch (ParseException e) {
			System.out.println("Assignment failed");
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFaveDrink() {
		return faveDrink;
	}

	public void setFaveDrink(String faveDrink) {
		this.faveDrink = faveDrink;
	}

	public String getFaveFood() {
		return faveFood;
	}

	public void setFaveFood(String faveFood) {
		this.faveFood = faveFood;
	}

	public String getUserAstroFile() {
		System.out.println("Your sign is: "+zodiacs.getCurrSign());
		return zodiacs.viewZodiacDetails();
	}
	
	public void setZodSign() throws ParseException {
		String userSign="";
		 if (dob.after(fmt.parse("19/03"))
				 && dob.before(fmt.parse("19/04"))) {
			 userSign= "aries";
				 } else if (dob.after(fmt.parse("18/04"))
				 && dob.before(fmt.parse("21/05"))) {
					 userSign= "taurus";
				 } else if (dob.after(fmt.parse("20/05"))
				 && dob.before(fmt.parse("21/06"))) {
					 userSign= "Gemini";
				 } else if (dob.after(fmt.parse("20/06"))
				 && dob.before(fmt.parse("23/07"))) {
					 userSign= "Cancer";
				 } else if (dob.after(fmt.parse("22/07"))
				 && (dob.before(fmt.parse("23/08")))) {
					 userSign= "leo";
				 } else if (dob.after(fmt.parse("22/08"))
				 && dob.before(fmt.parse("23/09"))) {
					 userSign= "virgo";
				 } else if (dob.after(fmt.parse("22/09"))
				 && dob.before(fmt.parse("23/10"))) {
					 userSign= "libra";
				 } else if (dob.after(fmt.parse("22/10"))
				 && dob.before(fmt.parse("22/11"))) {
					 userSign= "scorpio";
				 } else if (dob.after(fmt.parse("21/11"))
				 && dob.before(fmt.parse("22/12"))) {
					 userSign= "sagittarius";
				 } else if (dob.after(fmt.parse("21/12"))
				 || dob.before(fmt.parse("20/01"))) {
					 userSign= "capricorn";
				 } else if (dob.after(fmt.parse("19/01"))
				 && dob.before(fmt.parse("19/02"))) {
					 userSign= "aquarius";
				 } else if (dob.after(fmt.parse("18/02"))
				 && dob.before(fmt.parse("20/03"))) {
					 userSign= "pisces";}

		 zodiacs.setCurrSign(zodiacs.findZodiacSign(userSign));
	}
	public String getFaveColor() {
		return faveColor;
	}

	public void setFaveColor(String faveColor) {
		this.faveColor = faveColor;
	}

	public String getMyHobbies() {
		return myHobbies;
	}

	public void setMyHobbies(String myHobbies) {
		this.myHobbies = myHobbies;
	}

}
