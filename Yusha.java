public class Yusha {
	String name;
	int hp;
	int mp;
	void introduce() {
		System.out.println("私は" + this.name + "です。HPは" + this.hp + "でMPは" + this.mp + "です。");
	}
	void attack(Touzoku c) {
		System.out.println(this.name + "の攻撃！");
		c.damage();
	}
		void damage() {
		this.hp -= 13;
		System.out.println(this.name + "は13のダメージを受けた！");
		System.out.println(this.name + "は薬草を一つ盗まれた！");
	}
	void kaifuku() {
		this.hp += 10;
		System.out.println(this.name + "は10回復した。");
	}
}
