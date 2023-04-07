// MemberDao.java
package ch08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberService {
	Map<String, Member> members = new HashMap<>();
	
	private static long nextId = 0;

	public MemberService () {
		Member m;
		m = new Member("psung@ucb.edu","123","Park Sung");
		m.setId(1L);
		members.put(m.getEmail(), m);
		
		m = new Member("lp@google.com","456","Lee Phil");
		m.setId(2L);
		members.put(m.getEmail(), m);
		
		m = new Member("june@stellar.net","789","Kim June");
		m.setId(3L);
		members.put(m.getEmail(), m);
	}

	public Member selectByEmail(String email) {
		return members.get(email);
	}

	public List<Member> findAll() {
		return new ArrayList<>(members.values());
	}
	
	public Member find(String id) {
	    if (id == null) return null;

	    long memberId = Long.parseLong(id); // 입력된 id 값을 long 형으로 변환합니다.

	    for (Member member : members.values())
	        if (member.getId() == memberId) return member; // 일치하는 Member 객체를 찾았으면 반환합니다.
	    
	    return null; // 일치하는 Member 객체를 찾지 못했을 경우 null 반환
	}
}