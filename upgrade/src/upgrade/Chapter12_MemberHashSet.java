package upgrade;

import java.util.HashSet;
import java.util.Iterator;

public class Chapter12_MemberHashSet {
	private HashSet<Chapter12_Member> hashSet;

	public Chapter12_MemberHashSet() {
		hashSet = new HashSet<Chapter12_Member>();
	}

	public void addMember(Chapter12_Member member) {
		hashSet.add(member);
	}

	public boolean removeMember(int memberId) {
		Iterator<Chapter12_Member> ir = hashSet.iterator();

		while (ir.hasNext()) {
			Chapter12_Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for (Chapter12_Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}