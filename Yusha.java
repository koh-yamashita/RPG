class Yusha extends Chara {
	Yusha(String name,int hp,int mp,int atk){
		super(name,hp,mp,atk);
	}
	public void introduce() {
		System.out.println("私は" + this.name + "です。HPは" + this.hp + "でMPは" + this.mp + "です。");
	}
	public void attack(Chara target) {
		System.out.println(this.name + "の攻撃！");
		int atk = 20;
		target.damage(atk);
	}
	public void damage(int atk) {
		this.hp -= atk;
		System.out.println(this.name + "は"+ atk +"のダメージを受けた！");
	}
	void kaifuku(int heal) {
		this.hp += heal;
		System.out.println(this.name + "は"+ heal +"回復した。");
	}
}
