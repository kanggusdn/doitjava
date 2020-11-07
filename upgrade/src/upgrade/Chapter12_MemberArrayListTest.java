package upgrade;

import upgrade.Chapter12_Member;

public class Chapter12_MemberArrayListTest {
	public static void main(String[] args) {
		Chapter12_MemberArrayList memberArrayList = new Chapter12_MemberArrayList();

		Chapter12_Member memberLee = new Chapter12_Member(1001, "������");
		Chapter12_Member memberSon = new Chapter12_Member(1002, "�չα�");
		Chapter12_Member memberPark = new Chapter12_Member(1003, "�ڼ���");
		Chapter12_Member memberHong = new Chapter12_Member(1004, "ȫ�浿");

		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);

		memberArrayList.showAllMember();

		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}
}
