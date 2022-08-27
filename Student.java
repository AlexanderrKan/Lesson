public abstract class Student {
    String  Firstname;
    String Lastname;
    int group = 802;
    static int averageMark = 5;

    public Student(String Ivan, String Ivanov,  int group, int averageMark) {

        this.Firstname = Ivan;
        this.Lastname = Ivanov;
        this.group = 0;
        this.averageMark = 0;

    }
    String Firstname() {return this.Firstname;}
    String Lastname() {return this.Lastname;}
    int group() {return this.group;}
    int averageMark() {return this.averageMark;}
    static void getScholarship() {
        if (averageMark == 5) {
            System.out.println("сумма 100 р.");
        } else {
            System.out.printf("сумма 80 р.");
        }

    }


}

