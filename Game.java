
public class Game {
	private String name;
	private Integer playerNumber;
	private Integer round;
	
	public Game(String name, Integer playerNumber, Integer round) {
		super();
		this.name = name;
		this.playerNumber = playerNumber;
		this.round = round;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(Integer playerNumber) {
		this.playerNumber = playerNumber;
	}

	public Integer getRound() {
		return round;
	}

	public void setRound(Integer round) {
		this.round = round;
	}
	
}
