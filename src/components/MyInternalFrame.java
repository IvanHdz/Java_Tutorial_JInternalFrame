package components;

/**
 *
 * @author Ivan
 */
import javax.swing.JInternalFrame;

/* Used by InternalFrameDemo.java. */
public class MyInternalFrame extends JInternalFrame {

    static int openFrameCount = 0;
    static final int xOffset = 30, yOffset = 30;

    public MyInternalFrame() {
        super("Document #" + (++openFrameCount),
                true, //resizable
                true, //closable
                true, //maximizable
                true);//iconifiable

        //...Create the GUI and put it in the window...
        //...Then set the window size or call pack...
        setSize(300, 300);

        //Set the window's location.
        //Se Multiplica para que las vaya poniendo Abajo de cada una.
        setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
    }
}
