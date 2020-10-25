package upgrade;

public class Chapter09_Player {
	private Chapter09_PlayerLevel level;

	public Chapter09_Player() {
		level = new Chapter09_BeginnerLevel();
		level.showLevelMessage();
	}

	public Chapter09_PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(Chapter09_PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
}
