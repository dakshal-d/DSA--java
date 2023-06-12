package LinkedList;

import java.util.Scanner;

class Song {
    String title;
    String artist;
    Song next;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.next = null;
    }
}

class MusicPlayer {
    private Song head;
    private Song tail;

    public MusicPlayer() {
        head = null;
        tail = null;
    }

    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);

        if (head == null) {
            head = newSong;
            tail = newSong;
        } else {
            tail.next = newSong;
            tail = newSong;
        }
    }

    public void playFromBeginning() {
        Song current = head;
        while (current != null) {
            System.out.println("Playing: " + current.title + " - " + current.artist);
            current = current.next;
        }
    }

    public void playFromEnd() {
        playReverse(head);
    }

    private void playReverse(Song current) {
        if (current == null) {
            return;
        }

        playReverse(current.next);
        System.out.println("Playing: " + current.title + " - " + current.artist);
    }
}

public class Song1 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);
      
        int numSongs = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < numSongs; i++) {
        
            String title = scanner.nextLine();

            String artist = scanner.nextLine();

            player.addSong(title, artist);
        }

        System.out.println("Playlist created successfully!");
        System.out.println("\nPlaying songs from the beginning of the playlist...");
        player.playFromBeginning();
        System.out.println("\nPlaying songs from the end of the playlist...");
        player.playFromEnd();

        scanner.close();
    }
}
