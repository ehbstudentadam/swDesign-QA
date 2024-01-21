package be.ehb.adapter.exercise2.drawers;

import java.awt.Point;

public interface IFigureDrawable {
	public void drawCircle(Point centre,float diameter);
	public void drawRectangle(Point leftup,int height,int width);
	public void drawTriangle(Point one,Point two,Point three);
	public void drawSquare(Point rightup,int size);

}
