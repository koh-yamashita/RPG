public class Touzoku2 {
	String name;
	int hp;
	int mp;
	void introduce() {
		System.out.println("私は" + this.name + "です。HPは" + this.hp + "でMPは" + this.mp + "です。敵の持ち物を一定確率で盗みます。");
	}
	void attack(Yusha2 a) {
		System.out.println(this.name + "の攻撃！");
	}
	void damage(Yusha2 a) {	
		a.hp -= 13;
		System.out.println(a.name + "は13のダメージを受けた！");
		System.out.println(a.name + "は薬草を一つ盗まれた！");
	}
}
