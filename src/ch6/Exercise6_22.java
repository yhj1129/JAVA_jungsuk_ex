package ch6;

public class Exercise6_22 {
    public static boolean isNumber(String str){
        boolean tf = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                tf = false;
            }
        }
        return tf;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+" 는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+" 는 숫자입니까? "+isNumber(str));
    }
}
