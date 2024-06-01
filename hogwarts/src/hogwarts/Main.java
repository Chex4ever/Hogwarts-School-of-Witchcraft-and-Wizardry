package hogwarts;

public class Main {
	public static void main(String[] args) {
		StudentOfGriffindor harryPotter = Randomizer.randomStudentOfGryffindor("Гарри Поттер");
		StudentOfGriffindor hermioneGranger = Randomizer.randomStudentOfGryffindor("Гермиона Грейнджер");
		StudentOfGriffindor ronWeasley = Randomizer.randomStudentOfGryffindor("Рон Уизли");
		StudentOfSlytherin dracoMalfoy = Randomizer.randomStudentOfSlytherin("Драко Малфой");
		StudentOfSlytherin grahamMontague = Randomizer.randomStudentOfSlytherin("Грэхэм Монтегю");
		StudentOfSlytherin gregoryGoyle = Randomizer.randomStudentOfSlytherin("Грегори Гойл");
		StudentOfHufflepuff zachariahSmith = Randomizer.randomStudentOfHufflepuff("Захария Смит");
		StudentOfHufflepuff cedricDiggory = Randomizer.randomStudentOfHufflepuff("Седрик Диггори");
		StudentOfHufflepuff justinFinchFletchley = Randomizer.randomStudentOfHufflepuff("Джастин Финч-Флетчли");
		StudentOfRavenclaw zhouChang = Randomizer.randomStudentOfRavenclaw("Чжоу Чанг");
		StudentOfRavenclaw padmaPatil = Randomizer.randomStudentOfRavenclaw("Падма Патил");
		StudentOfRavenclaw marcusBelby = Randomizer.randomStudentOfRavenclaw("Маркус Белби");
		print(ronWeasley);
		print(marcusBelby);
		compareFacultyTraits(hermioneGranger, harryPotter);
		compareFacultyTraits(dracoMalfoy, grahamMontague);
		compareFacultyTraits(zachariahSmith, cedricDiggory);
		compareFacultyTraits(zhouChang, padmaPatil);
		compareMagicTraits(gregoryGoyle, justinFinchFletchley);
	}

	public static void compareMagicTraits(StudentOfHogwarts student1, StudentOfHogwarts student2) {
		int student1Score = student1.getMagicPower() + student1.getTransgressionDistance();
		int student2Score = student2.getMagicPower() + student2.getTransgressionDistance();
		if (student1Score > student2Score) {
			System.out.printf("%s обладает бОльшей мощностью магии, чем %s.%n", student1.getName(), student2.getName());
		} else if (student2Score > student1Score) {
			System.out.printf("%s обладает бОльшей мощностью магии, чем %s.%n", student2.getName(), student1.getName());
		} else {
			System.out.printf("%s и %s владеют магией на равном уровне.%n", student1.getName(), student2.getName());
		}
	}

	public static void compareFacultyTraits(StudentOfHogwarts student1, StudentOfHogwarts student2) {
		if (student1.getHouse()==student2.getHouse()) {
			announceFacultyTraitsWinner(student1.getName(), student1.countTraits(), student2.getName(),
					student2.countTraits(), student1.getHouse().accusative);
		} else {
			System.out.println("Сравнение черт характера возможно только для студентов одного факультета");
		}
	}

	public static void announceFacultyTraitsWinner(String name1, int score1, String name2, int score2, String house) {
		if (score1 > score2) {
			System.out.printf("Студент %s набрал в сумме %d баллов, а %s - %d, значит %s лучший %s, чем %s.%n", name1, score1,
					name2, score2, name1, house, name2);
		} else if (score1 < score2) {
			System.out.printf("Студент %s набрал в сумме %d баллов, а %s - %d, значит %s лучший %s, чем %s.%n", name2, score2,
					name1, score1, name2, house, name1);
			;
		} else {
			System.out.printf("%s и %s набрали в сумме по %d баллов, а значит определить кто лучший %s не получится.%n",
					name1, name2, score1, house);
		}
	}

	public static void print(StudentOfGriffindor student) {
		print((StudentOfHogwarts) student);
		System.out.printf(
				"Имеет следующие, характерные для гриффиндорца, черты характера:%n   благородство - %d,%n   честь - %d,%n   храбрость - %d.%n",
				student.getCourage(), student.getHonor(), student.getNobility());
	}

	public static void print(StudentOfHufflepuff student) {
		print((StudentOfHogwarts) student);
		System.out.printf(
				"Имеет следующие, характерные для пуффендуйца, черты характера:%n   трудолюбие - %d,%n   верность - %d,%n   честность - %d.%n",
				student.getHardWork(), student.getLoyalty(), student.getHonesty());
	}

	public static void print(StudentOfRavenclaw student) {
		print((StudentOfHogwarts) student);
		System.out.printf(
				"Имеет следующие, характерные для когтевранца, черты характера:%n   ум - %d,%n   мудрость - %d,%n   остроумность - %d,%n   долбанутость - %d.%n",
				student.getIntelligence(), student.getWisdom(), student.getWit(), student.getCreativity());
	}

	public static void print(StudentOfSlytherin student) {
		print((StudentOfHogwarts) student);
		System.out.printf(
				"Имеет следующие, характерные для слизеринца, черты характера:%n   хитрость - %d,%n   решительность - %d,%n   амбициозность - %d,%n   находчивость - %d,%n   жажда власти - %d.%n",
				student.getCunning(), student.getDetermination(), student.getAmbition(), student.getResourcefulness(),
				student.getThirstForPower());
	}

	public static void print(StudentOfHogwarts student) {
		System.out.printf("%n%s - студент Хогвартса на факультете %s.%n", student.getName(), student.getHouse().title);
		System.out.printf(
				"Владеет магической силой на %d баллов, трансгрессировал на максимальное расстояние в %d миль.%n",
				student.getMagicPower(), student.getTransgressionDistance());
	}
}