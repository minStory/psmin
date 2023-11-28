package hello.core.member;

public interface MemberRepository {

    void save(Member m);

    Member findById(Long mId);
}
