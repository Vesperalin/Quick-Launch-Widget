package View;

import javax.swing.*;
import java.awt.*;

public class Widget extends JDialog {
    private JPanel mainPanel;
    private JButton googleButton;
    private JButton youtubeButton;
    private JButton twitchButton;
    private JButton translatorButton;
    private Color unpressedColor;
    private Color pressedColour;

    public Widget(java.awt.Frame parent, boolean isModal){
        super(parent, isModal);
        this.setUndecorated(true);
        initColours();
        initPanel();
        initComponents();
        this.pack();

    }

    public void initPanel(){
        mainPanel= new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        mainPanel.setBackground(new Color(247, 243, 173));
        this.add(mainPanel);
    }

    private void initComponents(){
        googleButton = new JButton(new ImageIcon("src/main/resources/Google.png"));
        googleButton.setPreferredSize(new Dimension(37,37));
        googleButton.setBackground(unpressedColor);
        mainPanel.add(googleButton);

        youtubeButton = new JButton(new ImageIcon("src/main/resources/YouTube.png"));
        youtubeButton.setPreferredSize(new Dimension(37,37));
        youtubeButton.setBackground(unpressedColor);
        mainPanel.add(youtubeButton);

        twitchButton = new JButton(new ImageIcon("src/main/resources/Twitch.png"));
        twitchButton.setPreferredSize(new Dimension(37,37));
        twitchButton.setBackground(unpressedColor);
        mainPanel.add(twitchButton);

        translatorButton = new JButton(new ImageIcon("src/main/resources/Translator.png"));
        translatorButton.setPreferredSize(new Dimension(37,37));
        translatorButton.setBackground(unpressedColor);
        mainPanel.add(translatorButton);
    }

    private void initColours(){
        unpressedColor = new Color(250, 247, 195);
        pressedColour = new Color(240, 233, 122);
    }
}
