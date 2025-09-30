package java_exam2.problem_animal;

class Animal {
    // 1. Define method - makeSound()
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    // 2. Override makeSound()
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    // 3. Define 고유 메서드 - fetch()
    public void fetch() {
        System.out.println("공을 가져옵니다.");
    }
}

class Cat extends Animal {
    // 2. Override makeSound()
    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
}


public class PolymorphismExample {
    public static void main(String[] args) {
        // 4. Animal 타입의 배열 animals에 Dog, Cat 업캐스팅하여 저장
        Animal[] animals = new Animal[2];
        animals[0] = new Dog(); // upcasting
        animals[1] = new Cat();

        // 5. 반복문 사용 모든 동물 makeSound() 호출
        for(Animal animal : animals) {
            animal.makeSound();
            // 6. instanceof 통해 Dog 객체 확인한 후, 다운캐스팅하여 fetch() 메서드 호출
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal; // downcasting
                dog.fetch();
            }
        }

    }
}
