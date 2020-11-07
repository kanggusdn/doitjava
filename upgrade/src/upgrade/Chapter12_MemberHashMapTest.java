package upgrade;

public class Chapter12_MemberHashMapTest {
	public static void main(String[] args) {
		Chapter12_MemberHashMap memberHashMap = new Chapter12_MemberHashMap();

		Chapter12_Member memberLee = new Chapter12_Member(1001, "������");
		Chapter12_Member memberSon = new Chapter12_Member(1002, "�չα�");
		Chapter12_Member memberPark = new Chapter12_Member(1003, "�ڼ���");
		Chapter12_Member memberHong = new Chapter12_Member(1004, "ȫ�浿");

		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);

		memberHashMap.showAllMember();

		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}