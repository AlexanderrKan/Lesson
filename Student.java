public class Student {
    String  Firstname;
    String Lastname;
    int group;
    double averageMark;
    public Student(String firstName, String lastName, int group, double averageMark){
        this.Firstname = firstName;
        this.Lastname = lastName;
        this.group = group;
        this.averageMark = averageMark;
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

