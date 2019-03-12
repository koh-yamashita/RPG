public class Touzoku {
	String name;
	int hp;
	int mp;
	void introduce() {
		System.out.println("私は" + this.name + "です。HPは" + this.hp + "でMPは" + this.mp + "です。敵の持ち物を一定確率で盗みます。");
	}
	void attack(Yusha a) {
		System.out.println(this.name + "の攻撃！");
		a.damage();
	}
	void damage() {
		this.hp -= 100;
		System.out.println(this.name + "は100のダメージを受けた！");
		System.out.println(this.name + "は倒れた。");
	}
}
