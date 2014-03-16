//Rahul Jain
//rahulgr8888

import java.awt.Color;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class launcher {

	public static void main(String[] args) {
		
		if (isMacOSX()) {
            System.setProperty(
                    "com.apple.mrj.application.apple.menu.about.name",
                    "ColorPicker");
        }
		
		Graphical go = new Graphical();
		go.setBackground(Color.WHITE);
		go.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		go.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					JOptionPane.showMessageDialog(null, "Thanks for using ColorPicker.\nuserID- @rahulgr8888\nLook me up anywhere","Closing...",JOptionPane.INFORMATION_MESSAGE);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.exit(0);
				 }
			}
		);
		
	//	go.setSize(720,480);
		go.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
	//	maybe would work on windows(have to try)
	//	GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    //	gd.setFullScreenWindow(go);

		if (isMacOSX()) {
            enableFullScreenMode(go);
        }
		
		go.setVisible(true);
	}
	
	//copy-pasted, but have to understand what is going on!
	 public static void enableFullScreenMode(Window window) {
	        String className = "com.apple.eawt.FullScreenUtilities";
	        String methodName = "setWindowCanFullScreen";
	 
	        try {
	            Class<?> clazz = Class.forName(className);
	            Method method = clazz.getMethod(methodName, new Class<?>[] {
	                    Window.class, boolean.class });
	            method.invoke(null, window, true);
	        } catch (Throwable t) {
	            System.err.println("Full screen mode is not supported");
	            t.printStackTrace();
	        }
	    }
	 
	    private static boolean isMacOSX() {
	        return System.getProperty("os.name").indexOf("Mac OS X") >= 0;
	    }

}
