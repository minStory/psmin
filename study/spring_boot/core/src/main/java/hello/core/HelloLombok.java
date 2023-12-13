package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok hl = new HelloLombok();
        hl.setName("박성민");
        hl.setAge(10);
        String name = hl.getName();
        int age = hl.getAge();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("hl = " + hl);
    }
}
