public class Student extends Human implements IStudentInfo{
    public void city(String b, String c) {
        System.out.println("Student city is:" + " " + b);
        System.out.println("College city is:" + " " + c);
    }
    public static void main(String [] args){
        Student a = new Student();
        a.age(17);
        a.city("Chongqing", "Shanghai");
    }
}
