package ch6;

public class Exercise6_5 {
public static void main(String args[]) {
        Student2 s = new Student2("홍길동",1,1,100,60,76);
        System.out.println(s.info());
        }
        }
class Student2{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    public Student2(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public int getTotal(){
        return kor + eng + math;
    }
    public float getAverage(){
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
    public String info(){
        return name + ", " +ban + "," +  no + ", " + kor + ", " + eng +
                ", " + math + ", " + getTotal() + ", " + getAverage();
    }
}
