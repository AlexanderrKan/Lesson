public class Human {
    int age;
    String Fullname;
    Human(int age, String Fullname) {
        this.age= age;
        this.Fullname=Fullname;
    }
    static void talk (String Fullname){
        System.out.println("Hello ");
    }
    static void move(int age){
        System.out.println("walk "+age);
    }
}
