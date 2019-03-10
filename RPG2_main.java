public class RPG2_main {
		public static void main(String[] args) {
			Yusha2 a = new Yusha2();
			a.hp = 100;
			a.mp = 80;
			a.name = "勇者";
			a.introduce();

			Mahou2 b = new Mahou2();
			b.hp = 90;
			b.mp = 100;
			b.name = "魔法使い";
			b.introduce();

			Touzoku2 c = new Touzoku2();
			c.hp = 90;
			c.mp = 80;
			c.name = "盗賊";
			c.introduce();

			c.attack(a);
			c.damage(a);
			b.heal(a);
		}
	}

