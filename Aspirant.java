public class Aspirant extends Student {
    String Science;

    public void Student (String Ivan, String Ivanov, int Group, double averageMark, String Science){
    super(Ivan, Ivanov, Group, averageMark);
    this.Science = Science;
    }
    double getScholarship();{
        System.out.println("Сумма");
    }

}

