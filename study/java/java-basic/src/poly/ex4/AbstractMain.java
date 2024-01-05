package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 인스턴스 생성 불가
        //Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);

    }
    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //변하지 않는 부분
    private static void moveAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.move();
        System.out.println("동물 소리 테스트 종료");
    }
}
