package Task5_02;

public class Player implements Playable, Recordable{
    @Override
    public void play() {
        System.out.println("Playing started.");
    }

    @Override
    public void record() {
        System.out.println("Recording started.");
    }

    @Override
    public void pause() {
        System.out.println("Paused.");
    }

    @Override
    public void stop() {
        System.out.println("The process is stopped.");
    }

}
