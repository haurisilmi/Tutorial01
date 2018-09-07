
public class Player {
	private String name;
	private Integer lives;
	
	public Player(String name,Integer lives){
		this.name = name;
		this.lives = lives;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLives() {
		return lives;
	}

	public void setLives(Integer lives) {
		this.lives = lives;
	}
	
}
