public class Aspirant extends Student {
    String Science;

    public Aspirant (String Ivan, String Ivanov, int group, double averageMark, String Astrology){
    super(Ivan, Ivanov, group, averageMark);
        this.Science = Astrology;

    }

    public Aspirant() {
        
    }

    public void main(String[] args){
        Student student = new Student();
        Aspirant aspirant = new Aspirant();
        Student.getScholarship();
        Aspirant.getScholarship();
    }
    @Override // 
        void getScholarship() {
            if (averageMark == 5) {
                System.out.println("сумма 200 р.");
            } else {
                System.out.println("сумма 180 р.");
            }
    }

}
