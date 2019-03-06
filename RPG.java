public class RPG {
	public static void main(String[] args) {
		Yusha a = new Yusha();
		a.hp = 100;
		a.mp = 80;
		a.name = "勇者";
		a.introduce();

		Mahou b = new Mahou();
		b.hp = 90;
		b.mp = 100;
		b.name = "魔法使い";
		b.introduce();

		Touzoku c = new Touzoku();
		c.hp = 90;
		c.mp = 80;
		c.name = "盗賊";
		c.introduce();
	}
}
