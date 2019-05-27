public class Bottle {


    private int volume;

    public Bottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink() {
        this.volume -= 10;
    }

    public void empty() {
        this.volume = 0;
    }
}