import java.awt.*;

public class Player extends GameObject {

    public Player(int x, int y, ID id){
        super(x, y, id);

        speedX = 1;
        speedY = 1;
    }

    @Override
    public void tick() {
        x += speedX;
        y += speedY;
    }

    public void render(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, y,32,32);
    }
}
