package hogwarts;
import java.util.Random;
public class Randomizer {
	public static StudentOfGriffindor randomStudentOfGryffindor(String name) {
		return new StudentOfGriffindor(name, random100(),random100(),House.GRIFFINDOR, random100(),random100(),random100());
	}
	public static StudentOfHufflepuff randomStudentOfHufflepuff(String name) {
		return new StudentOfHufflepuff(name, random100(),random100(),House.HUFFLEPUFF,random100(),random100(),random100());
	}
	public static StudentOfRavenclaw randomStudentOfRavenclaw(String name) {
		return new StudentOfRavenclaw(name, random100(),random100(),House.RAVENCLAW,random100(),random100(),random100(),random100());
	}
	public static StudentOfSlytherin randomStudentOfSlytherin(String name) {
		return new StudentOfSlytherin(name, random100(),random100(),House.SLYTHERINE,random100(),random100(),random100(),random100(),random100());
	}
	public static int random100() {
		return intInRange(1,100);
	}
	public static int intInRange(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
