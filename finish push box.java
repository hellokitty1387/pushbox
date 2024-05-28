import javax.swing.SwingUtilities;
/**
 *  created by Mr.Hou on  5/9/16.
 * */
public class GameStarterXs {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrameXs();
            }
        });
    }
}
