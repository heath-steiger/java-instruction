package model;

public class Movie {
	private int id;
	private String title;
	private int year;
	private String rating;
	private String director;
	//private String credits;
	
	public Movie(int id, String title, int year, String rating, String director/*, String credits*/) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.rating = rating;
		this.director = director;
		//credits = credits;
	}

	public Movie() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

//	public String getCredits() {
//		return credits;
//	}
//
//	public void setCredits(String credits) {
//		credits = credits;
//	}
	
	
}
