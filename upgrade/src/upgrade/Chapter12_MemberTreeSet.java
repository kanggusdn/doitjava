package upgrade;

import java.util.Iterator;
import java.util.TreeSet;

public class Chapter12_MemberTreeSet {
	private TreeSet<Chapter12_Member> treeSet;

	public Chapter12_MemberTreeSet() {
		treeSet = new TreeSet<Chapter12_Member>();
	}

	public void addMember(Chapter12_Member member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId) {
		Iterator<Chapter12_Member> ir = treeSet.iterator();

		while (ir.hasNext()) {
			Chapter12_Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for (Chapter12_Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}