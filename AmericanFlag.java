import java.awt.*;
import java.applet.*;

public class AmericanFlag {

	private int x;
	private int y;
	private double scale;
	private int h;
	private int w;


	public AmericanFlag (int x, int y, double scale) {
		setX(x);
		setY(y);
		setH((int)(10));
		setW((int)(5*1.9*26));


	}
	
	public void draw(Graphics g) {
		for (int i = 0; i < 13; i++) {
			y = y + 10;
			if (i % 2 == 0) {
				redStripe(this.x, this.y, h, w, g);
			} else {
				whiteStripe(this.x, this.y, h, w, g);
			}
		}

		union(this.x, this.y-120, h, w, g);
	}

	public void redStripe(int x, int y, int height, int width, Graphics g) {

		g.setColor(Color.red);
		g.fillRect(x, y, width, height);

	}

	public void whiteStripe(int x, int y, int height, int width, Graphics g) {

		g.setColor(Color.white);
		g.fillRect(x, y, width, height);

	}

	public void union(int x, int y, int height, int width, Graphics g) {

		g.setColor(Color.blue);
		height = 70;
		width = 110;
		g.fillRect(x, y, width, height);

	}

	public void setX(int x) {
		if (x > 0) {
			this.x = x;
		}
	}

	public void setY(int y) {
		if (y > 0) {
			this.y=y;
		}
	}

	public void setH(int h) {
		if (h > 0) {
			this.h=h;
		}
	}

	public void setW(int w) {
		if (w > 0) {
			this.w=w;
		}
	}




}