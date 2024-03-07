import javax.swing.*;
import java.awt.*;

public class backgroundPanel extends JPanel {
    private Image background;
    public backgroundPanel(Image background){
        this.background = background;
        setLayout(new BorderLayout());
    }
    @Override
    public void paintComponents(Graphics g){
        super.paintComponent(g);
        g.drawImage(background, 0, 0, null);
    }
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(background.getWidth(this),background.getHeight(this));
    }
}
