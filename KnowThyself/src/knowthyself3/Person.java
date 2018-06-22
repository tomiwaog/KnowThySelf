package knowthyself3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private Date dob;
	private String faveDrink;
	private String faveFood;
	private String faveSport = "";
	private ZodiacSign zodSign;
	private String faveColor;
	private String myHobbies;

	public void setZodSign(ZodiacSign zodSign) {
		this.zodSign = zodSign;
	}

	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM");

	public String getName() {
		return name;
	}

	public String getFaveSport() {
		return faveSport;
	}

	public Person(String name, String dob, String faveDrink, String faveFood,
			String faveColor, String faveSport, String myHobbies) {
		this.name = name;
		this.faveDrink = faveDrink;
		this.faveFood = faveFood;
		this.faveColor = faveColor;
		this.myHobbies = myHobbies;
		try {
			this.dob = fmt.parse(dob);
		} catch (ParseException e) {
			System.out.println("Please enter date in the format dd/MM");
		}
	}

	public Person(String name, String dob) {
		this(name,dob,"","","","","");
		try {
			this.dob = fmt.parse(dob);
		} catch (ParseException e) {
			System.out.println("Please enter date in the format dd/MM");
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

	public ZodiacSign getZodSign() {
		return zodSign;
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

	public void printPersonDetails() {
		System.out.println(zodSign.details());
	}
}
