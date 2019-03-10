public class Mahou2 {
	String name;
	int hp;
	int mp;
	void introduce() {
		System.out.println("私は" + this.name + "です。HPは" + this.hp + "でMPは" + this.mp + "です。回復魔法をが使えます。");
	}
	void heal(Yusha2 a) {
		a.hp += 20;
		System.out.println(this.name + "はホイミをとなえた。");
		System.out.println(a.name + "は10回復した。");
	}
}