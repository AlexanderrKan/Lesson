public class Array {
    public static void main (String [] agrs){
        int [] array = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            sum+=array[i];
        }
        System.out.println(sum);
    }
}
