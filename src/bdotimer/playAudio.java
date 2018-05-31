/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdotimer;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import sun.misc.Launcher;

/**
 *
 * @author Guilherme
 */
public class playAudio extends Thread{
    
    
    public void run(){
        try{
            System.out.println(getPath().toString());
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("resources/sound.wav").getFile());
            System.out.println(file.getAbsolutePath());
            File soundFile = new File(file.getAbsolutePath()); //you could also get the sound file with an URL
          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
       
    }   catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(playAudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(playAudio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String getPath(){
        final String path = "resources/sound.wav";
        final File jarFile = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
        String name = null;
        if(jarFile.isFile()) {  // Run with JAR file
            JarFile jar = null;
            try {
                jar = new JarFile(jarFile);
            } catch (IOException ex) {
                Logger.getLogger(playAudio.class.getName()).log(Level.SEVERE, null, ex);
            }
            final Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
            while(entries.hasMoreElements()) {
                name = entries.nextElement().getName();
                if (name.startsWith(path + "/")) { //filter according to the path
                    System.out.println(name);
                }
            }
            try {
                jar.close();
            } catch (IOException ex) {
                Logger.getLogger(playAudio.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else { // Run with IDE
            final URL url = Launcher.class.getResource("/" + path);
            if (url != null) {
                try {
                    final File apps = new File(url.toURI());
                    for (File app : apps.listFiles()) {
                        System.out.println(app);
                    }
                } catch (URISyntaxException ex) {
                    // never happens
                }
            }
        }
        return name;
    }
}
