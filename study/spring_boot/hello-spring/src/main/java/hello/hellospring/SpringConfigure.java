package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfigure {

    //SpringDataJpa 사용할 때
    private MemberRepository repository;
    @Autowired
    public SpringConfigure(MemberRepository repository) {
        this.repository = repository;
    }

    //Jpa 사용할 때
//    private EntityManager em;
//    @Autowired
//    public SpringConfigure(EntityManager em) {
//        this.em = em;
//    }

    //Jdbc 사용할 때
//    private final DataSource dataSource;
//    @Autowired
//    public SpringConfigure(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    @Bean
    public MemberService service(){
        return new MemberService(repository);
    }

//    @Bean
//    public MemberRepository repository(){
////        return new MemoryMemberRepository();
////        return new JdbcMemberRepository(dataSource);
////        return new JdbCTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//
//    }

    //AOP Spring Bean 직접 등록하기
//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }
}
