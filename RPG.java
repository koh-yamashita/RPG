public class RPG {
	public static void main(String[] args) {
		Chara teamA[] = new Chara[3];
		Chara teamB[] = new Chara[2];
		teamA[0] = new Chara("勇者",100,80,20);
		teamA[1] = new Mahou("魔法使い",90,100,10);
		teamA[2] = new DragonKnight("竜騎士",150,80,30);
		teamB[0] = new Touzoku("盗賊",80,18,13);
		teamB[1] = new Wolf("オオカミ",50,0,20);

		for(int i=0; i<teamA.length; i++) {
			for(int j=0; j<teamB.length; j++) {
			teamA[i].introduce();
			teamA[i].attack(teamB[j]);
			teamB[j].dead();
			((Mahou) teamA[1]).hoimi(teamA[i]);
			teamB[j].introduce();
			teamB[j].attack(teamA[i]);
			teamA[i].dead();
			}
		}
	}
}
