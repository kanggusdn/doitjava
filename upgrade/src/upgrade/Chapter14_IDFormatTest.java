package upgrade;

public class Chapter14_IDFormatTest {
	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws Chapter14_IDFormatException {
		if (userID == null) {
			throw new Chapter14_IDFormatException("아이디는 null일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new Chapter14_IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		Chapter14_IDFormatTest test = new Chapter14_IDFormatTest();

		String userID = null;
		try {
			test.setUserID(userID);
		} catch (Chapter14_IDFormatException e) {
			System.out.println(e.getMessage());
		}

		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (Chapter14_IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
