package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

//@Repository
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long,Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member m) {
        m.setId(++sequence);
        store.put(m.getId(), m);
        return m;
    }

    @Override
//    Null값이 발생할 수 있을 때는 Optional<자료형>으로 감싸준다.
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
//        똑같이 Optional.ofNullable()로 감싸서 출력해준다.
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(m -> m.getName().equals(name))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

//    Test가 한 싸이클 돌 때마다 저장소 비워주기
    public void clearStore(){
        store.clear();
    }
}
