public class Mahou {
	String name;
	int hp;
	int mp;
	void introduce() {
		System.out.println("私は" + this.name + "です。HPは" + this.hp + "でMPは" + this.mp + "です。回復魔法をが使えます。");
	}
	void heal(Yusha a) {
		this.mp -= 10;
		System.out.println(this.name + "はホイミをとなえた。");
		a.kaifuku();
	}
}
