package upgrade;

import java.util.Comparator;

public class Chapter12_Member implements Comparator<Chapter12_Member> {
	private int memberId;
	private String memberName;

	public Chapter12_Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Chapter12_Member) {
			Chapter12_Member member = (Chapter12_Member) obj;
			if (this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}

//	@Override
//	public int compareTo(Chapter12_Member member) {
//		return (this.memberId - member.memberId);
//	}

	@Override
	public int compare(Chapter12_Member mem1, Chapter12_Member mem2) {
		return mem1.getMemberId() - mem2.getMemberId();
	}
}
