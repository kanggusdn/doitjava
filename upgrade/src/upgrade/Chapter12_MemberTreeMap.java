package upgrade;

import java.util.Iterator;
import java.util.TreeMap;

public class Chapter12_MemberTreeMap {
	private TreeMap<Integer, Chapter12_Member> treeMap;

	public Chapter12_MemberTreeMap() {
		treeMap = new TreeMap<Integer, Chapter12_Member>();
	}

	public void addMember(Chapter12_Member member) {
		treeMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Chapter12_Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}