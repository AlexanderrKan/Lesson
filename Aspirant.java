public class Aspirant extends Student {
    String Science;

    public Aspirant (String Ivan, String Ivanov, int group, int averageMark, String Astrology){
    super(Ivan, Ivanov, group, averageMark);
        this.Science = Astrology;
    }
    public void main(String[] args){
        Student.getScholarship();
        Aspirant.getScholarship();
    }
    @Override
    static void getScholarship() {
        if (averageMark == 5) {
            System.out.println("сумма 200 р.");
        } else {
            System.out.printf("сумма 180 р.");
        }
    }
}


