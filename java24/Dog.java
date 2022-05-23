public class Dog extends Animal {
    private String dog;
    @Override
    void makeSound() {
        System.out.println("woof!");
    }
    void run(){
        super.run();
        System.out.print(" " + "and say");
    }
    public String getName() {
        return dog;
    }
    public void setName (String d) {
        this.dog = d;
    }
}

