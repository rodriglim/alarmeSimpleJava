package javahora;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class MetodoMusica {
    static boolean pararMusica = false;
    public static void tocarSom(String nomeMusica) {
      
        URL url = MetodoMusica.class.getResource(nomeMusica);
        AudioClip som = Applet.newAudioClip(url);
        som.play();
        try {
            Thread.sleep(15000);
            pararMusica = true;
        } catch (Exception e) {
        }
        
        if(pararMusica == true){
            som.stop();
        }
    }
    
}
