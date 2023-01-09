package ch7;

class SutdaCards {
    final int NUM;
    final boolean ISKWANG;
    SutdaCards() {
        this(1, true);
    }
    SutdaCards(int num, boolean isKwang) {
        this.NUM = num;
        this.ISKWANG = isKwang;
    }
    public String toString() {
        return NUM + ( ISKWANG ? "K":"");
    }
}
class ex7_14 {
    public static void main(String args[]) {
        SutdaCards card = new SutdaCards(1, true);
    }
}
