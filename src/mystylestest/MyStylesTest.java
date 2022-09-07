package mystylestest;

import com.sphynxs.mystyles.MyStyles;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

/**
 * @author israel-icm
 */
public class MyStylesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*UIDefaults uiDefaults = UIManager.getDefaults();
        uiDefaults.put("activeCaption", new javax.swing.plaf.ColorUIResource(Color.BLACK));
        uiDefaults.put("activeCaptionText", new javax.swing.plaf.ColorUIResource(Color.white));
        JFrame.setDefaultLookAndFeelDecorated(true);*/
        
        
        MyStyles.install(MyStyles.METRO_UI);
        // MyStyles.install(MyStyles.METRO_UI_DARK);
        new Test().setVisible(true);
    }
    
}
