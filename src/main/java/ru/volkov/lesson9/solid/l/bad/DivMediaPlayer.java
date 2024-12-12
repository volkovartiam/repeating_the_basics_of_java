package ru.volkov.lesson9.solid.l.bad;

import ru.volkov.lesson9.solid.l.bad.MediaPlayer;
import ru.volkov.lesson9.solid.l.bad.exception.AudioUnsupportedException;
import ru.volkov.lesson9.solid.l.bad.exception.VideoUnsupportedException;

public class DivMediaPlayer extends MediaPlayer {

    // Play video is not supported in Winamp player
    @Override
    public void playAudio() {
        throw new AudioUnsupportedException();
    }
}
