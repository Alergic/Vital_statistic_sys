package Views;
import javax.sound.sampled.*;
import java.io.File;
import java.util.Scanner;

public class Music {
    private Clip clip;

    public Music(String filename){
        try{
            File musicFile = new File(filename);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            if(clip != null){
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                clip.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
