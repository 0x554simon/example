import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.net.URL;

public class BWFilterTest extends Applet {
    private Image   im, bw;

    public void init() {
		loadImage();
		filterImage();
    }
    public void paint(Graphics g) {
		int imw = im.getWidth(this);

		g.drawImage(im,0,0,this);
		g.drawImage(bw,imw,0,this);
    }
	private void loadImage() {
		try {
			URL url = getClass().getResource("tiger.gif");
			im = createImage((ImageProducer)url.getContent());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		MediaTracker mt = new MediaTracker(this);
		mt.addImage(im, 0);
		try {
			mt.waitForID(0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void filterImage() {
		bw = createImage(new FilteredImageSource(
								im.getSource(), new BWFilter()));
	}
}
