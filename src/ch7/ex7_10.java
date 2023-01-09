package ch7;

public class ex7_10 {
    private boolean isPowerOn;
    private int channel;
    private int previousChannel;
    private int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean getIsPowerOn(){
        return isPowerOn;
    }
    public void setIsPowerOn(boolean isPowerOn){
        this.isPowerOn = isPowerOn;
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        previousChannel = this.channel;
        this.channel = channel;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void gotoPrevChannel(){
        setChannel(previousChannel);
    }
}
class Exercise7_10 {
    public static void main(String args[]) {
        ex7_10 t = new ex7_10();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
