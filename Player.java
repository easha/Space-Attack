/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceAttack;

/**
 *
 * @author farlina
 */
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player extends Sprite implements Commons {

    private final int START_Y = 575;
    private final int START_X = 270;

    private final String playerImg = "src/SpaceAttack/player.png";
    private int width;

    public Player() {

        initPlayer();
    }

    private void initPlayer() {
        
        ImageIcon ii = new ImageIcon(playerImg);

        width = ii.getImage().getWidth(null);

        setImage(ii.getImage());
        setX(START_X);
        setY(START_Y);
    }

    public void act() {
        
        x += dx;
        
        if (x <= 2) {
            x = 2;
        }
        
        if (x >= BOARD_WIDTH - 1 * width) {
            x = BOARD_WIDTH - 1 * width;
        }
    }

    public void keyPressed(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
        
            dx = -4;
        }

        if (key == KeyEvent.VK_RIGHT) {
        
            dx = 4;
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
        
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
        
            dx = 0;
        }
    }
}
