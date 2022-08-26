public class Student {
    String Firstname;
    String Lastname;
    int group;
    int averageMark;

    public Student (String Ivan, String Ivanov, int 802, int 5) {
        this.Firstname = Ivan;
        this.Lastname = Ivanov;
        this.group = 802;
        this.averageMark = 5;

        if (averageMark == 5) {
            System.out.println("сумма 100 р.");
        }
        else {
            System.out.printf("сумма 80 р.");
        }

    }
    double getScholarship() {return this.averageMark;}
}
