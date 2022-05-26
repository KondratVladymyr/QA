public class Dog extends Animal {
    void run(){
        super.run();
        System.out.print(" " + "and say");
    }
    @Override
    void makeSound() {
        System.out.println("woof!");
    }
}

