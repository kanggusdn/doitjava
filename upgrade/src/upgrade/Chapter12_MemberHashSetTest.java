package upgrade;

public class Chapter12_MemberHashSetTest {
	public static void main(String[] args) {
		Chapter12_MemberHashSet memberHashSet = new Chapter12_MemberHashSet();

		Chapter12_Member memberLee = new Chapter12_Member(1001, "ÀÌÁö¿ø");
		Chapter12_Member memberSon = new Chapter12_Member(1002, "¼Õ¹Î±¹");
		Chapter12_Member memberPark = new Chapter12_Member(1003, "¹Ú¼­ÈÍ");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();

		Chapter12_Member memberHong = new Chapter12_Member(1003, "È«±æµ¿");
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}
}