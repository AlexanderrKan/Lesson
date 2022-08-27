public class Student {
    String  Firstname;
    String Lastname;
    int group = 802;
    double averageMark = 5;

    public Student(String Ivan, String Ivanov,  int group, double averageMark) {
        this.Firstname = Ivan;
        this.Lastname = Ivanov;
        this.group = 802;
        this.averageMark = 5;

    }

    public Student() {

    }

    String Firstname() {return this.Firstname;}
    String Lastname() {return this.Lastname;}
    int group() {return this.group;}
    double averageMark() {return this.averageMark;}
    void getScholarship() {
        if (averageMark == 5) {
            System.out.println("sum 100 ");
        } else {
            System.out.println("сумма 80 р.");
        }

    }


}

