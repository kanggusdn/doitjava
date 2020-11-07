package upgrade;

public class Chapter12_MemberHashSetTest {
	public static void main(String[] args) {
		Chapter12_MemberHashSet memberHashSet = new Chapter12_MemberHashSet();

		Chapter12_Member memberLee = new Chapter12_Member(1001, "������");
		Chapter12_Member memberSon = new Chapter12_Member(1002, "�չα�");
		Chapter12_Member memberPark = new Chapter12_Member(1003, "�ڼ���");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();

		Chapter12_Member memberHong = new Chapter12_Member(1003, "ȫ�浿");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}
}