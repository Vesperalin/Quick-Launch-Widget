package View;

import javax.swing.*;
import java.awt.*;

public class Widget extends JDialog {
    private JPanel mainPanel;
    private LaunchButton googleButton;
    private LaunchButton youtubeButton;
    private LaunchButton twitchButton;
    private LaunchButton translatorButton;

    public Widget(java.awt.Frame parent, boolean isModal){
        super(parent, isModal);
        this.setUndecorated(true);
        initPanel();
        initComponents();
        this.pack();
    }

    private void initPanel(){
        mainPanel= new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        mainPanel.setBackground(new Color(247, 243, 173));
        this.add(mainPanel);
    }

    private void initComponents(){
        googleButton=new LaunchButton("src/main/resources/Google.png", "www.google.com");
        youtubeButton=new LaunchButton("src/main/resources/YouTube.png", "www.youtube.com");
        twitchButton=new LaunchButton("src/main/resources/Twitch.png", "www.twitch.tv");
        translatorButton=new LaunchButton("src/main/resources/Translator.png", "www.bab.la");
        mainPanel.add(googleButton);
        mainPanel.add(youtubeButton);
        mainPanel.add(twitchButton);
        mainPanel.add(translatorButton);
    }

}
