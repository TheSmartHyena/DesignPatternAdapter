public class Main {
    public static void main(String[] args) {
        // Client
        Mp3PlayerNoAdapter mp3old = new Mp3PlayerNoAdapter();
        mp3old.play("mp3", "test.mp3");
        mp3old.play("mp4", "test.mp4");
        mp3old.play("vlc", "test.vlc");

        Mp3Player mp3 = new Mp3Player();

        mp3.play("mp3", "test.mp3");
        mp3.play("mp4", "test.mp4");
        mp3.play("vlc", "test.vlc");

    }
}