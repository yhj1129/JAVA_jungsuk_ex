package ch4;

public class Exercise4_12 {
    public static void main(String[] args) {
        int i = 2; //2단부터 시작

        for (; i < 9; i+=3) {

            int j = 1; //곱할 수, 시작은 1

            while (j < 4){ // * 3 까지 하기

                int k = i; //시작할 앞에 수 지정

                System.out.print(k + " * " + j + " = " + k * j + "\t");
                k++;
                System.out.print(k + " * " + j + " = " + k * j + "\t");
                k++;

                if (k <= 9){
                    System.out.print(k + " * " + j + " = " + k * j + "\t");
                }

                System.out.println();
                j++; // * 2 로 넘어가기
            }
            System.out.println();
        }
    }
}
