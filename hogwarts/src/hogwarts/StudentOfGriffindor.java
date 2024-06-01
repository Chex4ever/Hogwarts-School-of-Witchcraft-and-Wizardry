package hogwarts;

public class StudentOfGriffindor extends StudentOfHogwarts {
	int nobility, honor, courage;

	public StudentOfGriffindor(String name, int magicPower, int transgressionDistance, House house, int nobility,
			int honor, int courage) {
		super(name, magicPower, transgressionDistance, house);
		this.nobility = nobility;
		this.honor = honor;
		this.courage = courage;
	}
	public int getNobility() { return nobility;	}
	public void setNobility(int nobility) {	this.nobility = nobility; }
	public int getHonor() {	return honor; }
	public void setHonor(int honor) { this.honor = honor; }
	public int getCourage() { return courage; }
	public void setCourage(int courage) { this.courage = courage;}
	@Override
	public int countTraits() {
		return this.nobility+this.honor+this.courage;
	}
}
