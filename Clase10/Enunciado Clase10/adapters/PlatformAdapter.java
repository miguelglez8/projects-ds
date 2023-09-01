package adapters;

import java.awt.Point;

import platform.Image2D;

public interface PlatformAdapter {
	Image2D loadImage(String file);

    void drawBall(Image2D image, Point point);

    Point getPosition();
}
