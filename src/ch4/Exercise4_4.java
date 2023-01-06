package ch4;

public class Exercise4_4 {
    public static void main(String[] args) {
        int num = 0;
        int i = 1;
        int sum = 0;

        while(sum < 100) {
            num++;
            sum += i * num;
            i *= -1;
        }
        System.out.println(num);
    }
}
