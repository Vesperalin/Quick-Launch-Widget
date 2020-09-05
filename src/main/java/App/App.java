package App;

import View.Widget;

public class App {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Widget widget = new Widget(new javax.swing.JFrame(), true);
            widget.setVisible(true);
        });
    }
}
