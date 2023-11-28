package hello.core.member;

public interface MemberService {

    void join(Member m);

    Member findMember(Long mId);
}
