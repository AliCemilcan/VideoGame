

package videogame;

import videogame.console.Wii;
import videogame.console.XBox;

/**
 *
 * @author ayfer
 */
public class VideoGame {
 //Editing this file
    // comment number 2 represtenting creation of my branch
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wii wii2 = new Wii();
        XBox xbox2 = new XBox();
        
        wii2.play();
        xbox2.play();
    }

}
