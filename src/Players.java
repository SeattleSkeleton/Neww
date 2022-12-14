import java.awt.*;

public class Players extends GameObject {

    Handler handler = new Handler();

    public Players(int x, int y, ID id) {
        super(x, y, id);
        this.handler = handler;

    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    public void tick() {
        if(velX < 0) facing = -1;
        else if (velX > 0) facing = 1;


        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH - 32);
        y = Game.clamp(y, 0, Game.HEIGHT - 64);



    }

    public void render(Graphics g) {
        if(id == ID.Tank1)  g.setColor(Color.BLUE);
        else if (id == ID.Tank2) g.setColor(Color.RED);
        g.fillRect(x, y, 32,32);


    }



}

