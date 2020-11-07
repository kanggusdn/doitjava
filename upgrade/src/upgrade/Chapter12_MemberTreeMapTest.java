package upgrade;

public class Chapter12_MemberTreeMapTest {
	public static void main(String[] args) {
		Chapter12_MemberTreeMap memberHashMap = new Chapter12_MemberTreeMap();

		Chapter12_Member memberPark = new Chapter12_Member(1003, "�ڼ���");
		Chapter12_Member memberLee = new Chapter12_Member(1001, "������");
		Chapter12_Member memberHong = new Chapter12_Member(1004, "ȫ�浿");
		Chapter12_Member memberSon = new Chapter12_Member(1002, "�չα�");

		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);

		memberHashMap.showAllMember();

		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}