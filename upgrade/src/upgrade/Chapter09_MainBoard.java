package upgrade;

public class Chapter09_MainBoard {
	public static void main(String[] args) {
		Chapter09_Player player = new Chapter09_Player();
		player.play(1);

		Chapter09_AdvancedLevel aLevel = new Chapter09_AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);

		Chapter09_SuperLevel sLevel = new Chapter09_SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
