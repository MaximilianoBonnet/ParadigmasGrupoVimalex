package BaseDelJuego;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sonido {
	public static Clip LoadSound(String direction){
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sonido.class.getResource(direction)));
			return clip;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}


}
