import javax.swing.*;
import java.awt.event.ActionEvent;


public class Sunflower extends Plant {

    private Timer sunProduceTimer;

    public Sunflower(GamePanel parent,int x,int y) {
        super(parent, x, y);
        sunProduceTimer = new Timer(15000,(ActionEvent e) -> {
            Sun sta = new Sun(gp,60 + x*100,110 + y*120,130 + y*120);
            gp.activeSuns.add(sta);
            gp.add(sta, Integer.valueOf(1));
        });
        sunProduceTimer.start();
    }

}
