package model;

public class Actors {
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthDate; 
//	private String credits;
	
	public Actors(int id, String firstName, String lastName, String gender, String birthDate /*,String credits*/) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
//		this.credits = credits;
	}
	
	public Actors() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
//	public String getCredits() {
//		return credits;
//	}
//	public void setCredits(String credits) {
//		this.credits = credits;
//	}
	
	
	
}
