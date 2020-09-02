package View;

import javax.swing.*;
import java.awt.*;

public class LaunchButton extends JButton {
    private Color unpressedColor;
    private Color pressedColor;

    public LaunchButton(String path){
        unpressedColor=new Color(250, 247, 195);
        pressedColor=new Color(240, 233, 122);
        initComponent(path);
    }

    private void initComponent(String path){
        this.setIcon(new ImageIcon(path));
        this.setPreferredSize(new Dimension(37,37));
        this.setBackground(unpressedColor);
    }
}
