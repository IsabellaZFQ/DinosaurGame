
package dev.agpoon.dino.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyManager implements KeyListener{
    
    public boolean[] keys;
    
    public boolean jump, crouch;
    
    private boolean isPressed = true;
    
    public KeyManager(){
        keys = new boolean[256];
    }
    
    public void tick(){
        jump = keys[KeyEvent.VK_W];
        crouch = keys[KeyEvent.VK_S];
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    
    }

    @Override
    public void keyPressed(KeyEvent e) {
         keys[e.getKeyCode()] = true;
         
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
}
