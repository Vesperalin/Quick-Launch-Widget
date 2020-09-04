package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;

public class LaunchButton extends JButton implements MouseListener {
    private Color unpressedColor;
    private Color pressedColor;
    private String uri;

    public LaunchButton(String path, String uri){
        unpressedColor=new Color(250, 247, 195);
        pressedColor=new Color(240, 234, 154);
        initComponent(path);
        addMouseListener(this);
        this.uri=uri;
    }

    private void initComponent(String path){
        this.setIcon(new ImageIcon(path));
        this.setPreferredSize(new Dimension(37,37));
        this.setContentAreaFilled(false);
        this.setOpaque(true);
        this.setBackground(unpressedColor);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.setBackground(pressedColor);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.setBackground(unpressedColor);
        try{
            Desktop.getDesktop().browse(URI.create(uri));
        }catch(IOException exc){
            JOptionPane.showMessageDialog(new JFrame(), "Can't connect with page");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
}
