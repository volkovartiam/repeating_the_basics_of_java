package ru.volkov.lesson9.solid.l.bad;

import ru.volkov.lesson9.solid.l.bad.exception.VideoUnsupportedException;

public class WinampMediaPlayer extends MediaPlayer {

    // Play video is not supported in Winamp player
    public void playVideo() {
        throw new VideoUnsupportedException();
    }
}
