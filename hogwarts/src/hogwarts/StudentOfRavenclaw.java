package hogwarts;

public class StudentOfRavenclaw extends StudentOfHogwarts{
	private int intelligence, wisdom, wit, creativity;

	public StudentOfRavenclaw(String name, int magicPower, int transgressionDistance, House house, int intelligence, int wisdom, int wit, int creativity) {
		super(name, magicPower, transgressionDistance, house);
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.wit = wit;
		this.creativity = creativity;
	}

	public int getIntelligence() { return intelligence; }
	public void setIntelligence(int intelligence) { this.intelligence = intelligence; }
	public int getWisdom() { return wisdom; }
	public void setWisdom(int wisdom) { this.wisdom = wisdom; }
	public int getWit() { return wit; }
	public void setWit(int wit) { this.wit = wit; }
	public int getCreativity() { return creativity; }
	public void setCreativity(int creativity) { this.creativity = creativity; }
	@Override
	public int countTraits() {
		return this.intelligence+this.wisdom+this.wit+this.creativity;
	}
}
