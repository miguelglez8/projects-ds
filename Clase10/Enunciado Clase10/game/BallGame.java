package game;

import java.awt.Point;

import adapters.PlatformAdapter;
import platform.Image2D;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas
 */

public class BallGame {
   
    public void start(PlatformAdapter p) {
        Image2D image = p.loadImage("Bola.jpg");

        for (int i = 0; i < 10; i++) {
            Point point = p.getPosition();
            p.drawBall(image, point);
        }
    }

}
