package upgrade;

import java.util.HashMap;
import java.util.Iterator;

public class Chapter12_MemberHashMap {
	private HashMap<Integer, Chapter12_Member> hashMap;

	public Chapter12_MemberHashMap() {
		hashMap = new HashMap<Integer, Chapter12_Member>();
	}

	public void addMember(Chapter12_Member member) {
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}

	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Chapter12_Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}