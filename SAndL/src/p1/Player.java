package p1;

public class Player {
	private String name;
	private int id;
	private int currPos;
	public Player(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		this.currPos = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCurrPos() {
		return currPos;
	}

	public void setCurrPos(int currPos) {
		this.currPos = currPos;
	}
	

}
