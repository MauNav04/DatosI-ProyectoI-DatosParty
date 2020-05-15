import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handlerL;

    public KeyInput(Handler handler){
        this.handlerL = handler;
    }

    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();

    }

    public void keyReleased(KeyEvent e){
        int keyCode = e.getKeyCode();
    }
}
