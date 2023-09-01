package adapters;

import java.awt.Point;

import platform.Image2D;
import platform.playstation.Playstation5API;

public class PlaystationAdapter implements PlatformAdapter {
	
	private Playstation5API play = new Playstation5API();
	
	public Image2D loadImage(String file) {
		return play.loadGraphics(file);
	}

	public void drawBall(Image2D image, Point point) {
		play.render(point.x, point.y, image);
	}

	public Point getPosition() {
		return play.getJoystick();
	}

}
