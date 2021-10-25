package mystylestest;

import icm.sphynx.MyStyles;

/**
 * @author israel-icm
 */
public class MyStylesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStyles.install(MyStyles.METRO_UI);
        // MyStyles.install(MyStyles.METRO_UI_DARK);
        new Test().setVisible(true);
    }
    
}
