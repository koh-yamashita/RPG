public class Chara {
	String name;
	int hp;
	int mp;
	int atk;
	
	public Chara() {
		name = "ああああ";
		hp = 100;
		mp = 100;
		atk = 10;
	}
	
	public Chara(String name,int hp,int mp,int atk) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.atk = atk;
	}
	public void introduce() {
		System.out.println("私は" + name + "です。HPは" + hp + "でMPは" + mp + "です。");
	}
	public void damage(int atk) {
		this.hp -= atk;
		System.out.println(name + "は"+ atk +"のダメージを受けた！");
	}
	public void attack(Chara target) {
		System.out.println(name + "の攻撃！");
		target.damage(atk);
	}
	void kaifuku(int heal) {
		this.hp += heal;
		System.out.println(this.name + "は"+ heal +"回復した。");
	}
	public void yakedo(int flame) {
		this.hp -= flame;
		System.out.println(name + "はやけどで"+ flame +"の追加ダメージ！");
	}
	 public void dead() {
		if(this.hp <= 0){
		System.out.println(this.name + "は"+ "たおれた。");
		}
	}
}
