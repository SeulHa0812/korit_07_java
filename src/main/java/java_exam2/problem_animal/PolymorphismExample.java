package java_exam2.problem_animal;

class Animal {
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍!");
    }

    public void fetch() {
        System.out.println("공을 가져옵니다.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹~");
    }
}


public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for(Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.fetch();
            }
        }

    }
}
