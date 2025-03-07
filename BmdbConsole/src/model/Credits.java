package model;

public class Credits {
	
	public int id;
	public int movieId;
	public int actorId;
	public String role;
	
	public Credits(int id, int movieId, int actorId, String role) {
		super();
		this.id = id;
		this.movieId = movieId;
		this.actorId = actorId;
		this.role = role;
	}

	public Credits() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
