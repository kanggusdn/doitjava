package upgrade;

import java.util.ArrayList;
import upgrade.Chapter12_Member;

public class Chapter12_MemberArrayList {
	private ArrayList<Chapter12_Member> arrayList;

	public Chapter12_MemberArrayList() {
		arrayList = new ArrayList<Chapter12_Member>();
	}

	public void addMember(Chapter12_Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberId) {
		for (int i = 0; i < arrayList.size(); i++) {
			Chapter12_Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	public void showAllMember() {
		for (Chapter12_Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
