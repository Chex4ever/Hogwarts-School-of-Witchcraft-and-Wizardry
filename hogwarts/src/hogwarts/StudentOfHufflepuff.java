package hogwarts;

public class StudentOfHufflepuff extends StudentOfHogwarts{
	private int hardWork, loyalty, honesty;

	public StudentOfHufflepuff(String name, int magicPower, int transgressionDistance, House house, int hardWork, int loyalty, int honesty) {
		super(name, magicPower, transgressionDistance, house);
		this.hardWork = hardWork;
		this.loyalty = loyalty;
		this.honesty = honesty;
	}
	public int getHardWork() { return hardWork; }
	public void setHardWork(int hardWork) { this.hardWork = hardWork; }
	public int getLoyalty() { return loyalty; }
	public void setLoyalty(int loyalty) { this.loyalty = loyalty; }
	public int getHonesty() { return honesty; }
	public void setHonesty(int honesty) { this.honesty = honesty; }
	@Override
	public int countTraits() {
		return this.hardWork+this.loyalty+this.honesty;
	}
}
