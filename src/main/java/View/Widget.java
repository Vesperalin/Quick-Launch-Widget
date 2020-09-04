package View;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Widget extends JDialog {
    private JPanel mainPanel;

    public Widget(java.awt.Frame parent, boolean isModal){
        super(parent, isModal);
        this.setUndecorated(true);
        initPanel();
        initComponents();
        this.pack();
        DragListener drag = new DragListener();
        this.addMouseListener(drag);
        this.addMouseMotionListener(drag);
    }

    private void initPanel(){
        mainPanel= new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        mainPanel.setBackground(new Color(247, 243, 173));
        this.add(mainPanel);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    private void initComponents(){
        LaunchButton googleButton = new LaunchButton("src/main/resources/Google.png", "www.google.com");
        LaunchButton youtubeButton = new LaunchButton("src/main/resources/YouTube.png", "www.youtube.com");
        LaunchButton twitchButton = new LaunchButton("src/main/resources/Twitch.png", "www.twitch.tv");
        LaunchButton translatorButton = new LaunchButton("src/main/resources/Translator.png", "www.bab.la");
        mainPanel.add(googleButton);
        mainPanel.add(youtubeButton);
        mainPanel.add(twitchButton);
        mainPanel.add(translatorButton);
    }

    private static class DragListener extends MouseInputAdapter{
        private Point location;
        private MouseEvent pressed;

        @Override
        public void mousePressed(MouseEvent me) {
            pressed = me;
        }

        @Override
        public void mouseDragged(MouseEvent me) {
            Component component = me.getComponent();
            location = component.getLocation(location);
            int x = location.x - pressed.getX() + me.getX();
            int y = location.y - pressed.getY() + me.getY();
            component.setLocation(x, y);
        }
    }

}
