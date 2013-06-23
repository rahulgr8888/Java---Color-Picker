//Rahul Jain
//rahulgr8888

import java.awt.Color;
import java.awt.Window;
import java.lang.reflect.Method;

import javax.swing.JFrame;

public class launcher {

	public static void main(String[] args) {
		
		if (isMacOSX()) {
            System.setProperty(
                    "com.apple.mrj.application.apple.menu.about.name",
                    "ColorPicker");
        }
		
		Graphical go = new Graphical();
		go.setBackground(Color.WHITE);
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
