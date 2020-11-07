package upgrade;

public class Chapter12_MemberTreeSetTest {
	public static void main(String[] args) {
		Chapter12_MemberTreeSet memberTreeSet = new Chapter12_MemberTreeSet();

		Chapter12_Member memberPark = new Chapter12_Member(1003, "�ڼ���");
		Chapter12_Member memberLee = new Chapter12_Member(1001, "������");
		Chapter12_Member memberSon = new Chapter12_Member(1002, "�չα�");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();

		Chapter12_Member memberHong = new Chapter12_Member(1003, "ȫ�浿");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}
}