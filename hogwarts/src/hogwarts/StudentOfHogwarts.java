package hogwarts;

public abstract class StudentOfHogwarts {
	private String name;
	private int magicPower, transgressionDistance;
	private House house;

	public StudentOfHogwarts(String name, int magicPower, int transgressionDistance, House house) {
		this.name = name;
		this.magicPower = magicPower;
		this.transgressionDistance = transgressionDistance;
		this.house = house;
	}
	
	public abstract int countTraits();
	
	public int getMagicPower() { return magicPower;	}
	public House getHouse() { return house;	}
	public void setHouse(House house) { this.house = house; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public void setMagicPower(int magicPower) { this.magicPower = magicPower; }
	public int getTransgressionDistance() { return transgressionDistance; }
	public void setTransgressionDistance(int transgressionDistance) { this.transgressionDistance = transgressionDistance;}
}
