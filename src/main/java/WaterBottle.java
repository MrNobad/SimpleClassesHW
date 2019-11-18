public class WaterBottle {
    public int volume;

    public WaterBottle (){
        this.volume = 100;
    }

    public void drink() {
        this.volume = this.volume - 10;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}
