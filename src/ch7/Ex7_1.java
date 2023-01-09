package ch7;


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++){
            cards[i] = new SutdaCard(i % 10 + 1, (i<10) && (i == 1||i==3 || i==8));
        }
    }

    public void shuffle(){
        for (int i = 0; i < CARD_NUM; i++) {
            int j = (int) (Math.random()*20);
            SutdaCard temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public SutdaCard pick(int index){
        return cards[index];
    }

    public SutdaCard pick(){
        return pick((int) (Math.random() * 20));
    }
}
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    // info() Object toString() . 대신 클래스의 을 오버라이딩했다
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
public class Ex7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
    }
}
