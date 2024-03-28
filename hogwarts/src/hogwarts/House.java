package hogwarts;

public enum House {
	GRIFFINDOR("Гриффиндор", "гриффиндорец"), HUFFLEPUFF("Пуффендуй", "пуффендуец"), RAVENCLAW("Когтевран","когтевранец"), SLYTHERINE("Слизерин", "слизеринец");
	public String title;
	public String accusative;

	private House(String title, String accusative) {
		this.title = title;
		this.accusative = accusative;
	}

}
