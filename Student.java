public class Student {
    String Firstname;
    String Lastname;
    int group;
    double averageMark;

    public Student (String Ivan, String Ivanov, int group, double averageMark) {
        this.Firstname = Ivan;
        this.Lastname = Ivanov;
        this.group = 802;
        this.averageMark = 5;
    }

    double getScholarship() {return this.averageMark;}

}

