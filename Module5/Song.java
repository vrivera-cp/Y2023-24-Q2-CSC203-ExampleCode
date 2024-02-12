public class Song {
    private String name;
    private String artist;
    private int durationInSeconds;
    public Song(String name, String artist, int durationInSeconds) {
        this.name = name;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" by %s (%d s)", name, artist, durationInSeconds);
    }

    public String getName() {
        return name;
    }
    public String getArtist() {
        return artist;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}
