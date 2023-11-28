package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member m) {
        store.put(m.getId(), m);
    }

    @Override
    public Member findById(Long mId) {
        return store.get(mId);
    }
}
