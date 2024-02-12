import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorSorting {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>(List.of(
                new Song("Let It Be", "The Beatles",
                        243
                ),
                new Song("Here Comes the Sun", "The Beatles",
                        185
                ),
                new Song("Overworld Theme", "Koji Kondo",
                        180
                )
        ));

        System.out.println(playlist);

        playlist.sort(Comparator.comparing(Song::getArtist));
        System.out.println(playlist);

        playlist.sort(Comparator.comparing(Song::getArtist)
                .thenComparing(Song::getName));
        System.out.println(playlist);

        playlist.sort(Comparator.comparing(Song::getArtist)
                .thenComparingInt(Song::getDurationInSeconds)
                .reversed());
        System.out.println(playlist);
    }
}
