package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean(){
        String[] bdNames = ac.getBeanDefinitionNames();
        for (String bdName : bdNames) {
            Object bean = ac.getBean(bdName);
            System.out.println("bdName = " + bdName + ", object = " + bean);
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean(){
        String[] bdNames = ac.getBeanDefinitionNames();
        for (String bdName : bdNames) {
            BeanDefinition bd = ac.getBeanDefinition(bdName);

            //bd.ROLE_APPLICATION : 직접 등록한 애플리케이션 빈
            //bd.ROLE_INFRASTRUCTURE : 스프링이 내부에서 사용하는 빈
            if(bd.getRole() == bd.ROLE_APPLICATION){
                Object bean = ac.getBean(bdName);
                System.out.println("bdName = " + bdName + ", object = " + bean);
                System.out.println("ac.getBeanDefinition = " + ac.getBeanDefinition(bdName));
            }
        }
    }
}
