package hogwarts;

public class StudentOfSlytherin extends StudentOfHogwarts{
	private int cunning, determination, ambition, resourcefulness, thirstForPower;

	public StudentOfSlytherin(String name, int magicPower, int transgressionDistance, House house, int cunning, int determination, int ambition,
			int resourcefulness, int thirstForPower) {
		super(name, magicPower, transgressionDistance, house);
		this.cunning = cunning;
		this.determination = determination;
		this.ambition = ambition;
		this.resourcefulness = resourcefulness;
		this.thirstForPower = thirstForPower;
	}

	public int getCunning() { return cunning; }
	public void setCunning(int cunning) { this.cunning = cunning; }
	public int getDetermination() { return determination; }
	public void setDetermination(int determination) { this.determination = determination; }
	public int getAmbition() { return ambition; }
	public void setAmbition(int ambition) { this.ambition = ambition; }
	public int getResourcefulness() { return resourcefulness; }
	public void setResourcefulness(int resourcefulness) { this.resourcefulness = resourcefulness; }
	public int getThirstForPower() { return thirstForPower; }
	public void setThirstForPower(int thirstForPower) { this.thirstForPower = thirstForPower; }
	@Override
	public int countTraits() {
		return this.cunning+this.determination+this.ambition+this.resourcefulness+this.thirstForPower;
	}
}
