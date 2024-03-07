//Java 1325 OOP Group Project Game
import javax.swing.*;

import game.Board;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class window {
    private static int width = 800;
    private static int height = 600;

    public window(){
        JFrame frame = new JFrame("Galactic Destroyer");
        //start.setSize(50,50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height); //Default resolution
        frame.getContentPane().add(new Board());
        frame.setVisible(true);
        //Buttons
        JButton testButton = new JButton("Test button");
        JButton start = new JButton("Start Game");
        JButton settings = new JButton("Settings");
        JButton quit = new JButton("Quit");
        //Panel
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(3,1));
        menu.add(start);
        menu.add(settings);
        menu.add(quit);
        menu.setBackground(Color.CYAN);
        frame.add(menu, BorderLayout.CENTER);
        menu.setVisible(true);
        //Panel for board
        JPanel gamePanel = new JPanel();
        //gamePanel.setLayout(new GridLayout(2,1));
      //  gamePanel.getCo
        
        
        //Panel for settings, may be removed depending on time
        JPanel settingsPanel = new JPanel();
        settingsPanel.setLayout(new GridLayout(5,1));
        frame.setVisible(true);
        //Add events for button presses
        //Start game
        start.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                menu.setVisible(false);
                gamePanel.setVisible(true);
               
            }
        });
        //Go to settings
        settings.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                menu.setVisible(false);
                settingsPanel.setVisible(true);
            }
        });
        //Exit the game
        quit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });

        //Code to display background image on main menu
        /*
        try{
            backgroundPanel menuBackdrop = new backgroundPanel(javax.imageio.ImageIO.read(new File("assets/background.png")));
            frame.add(menuBackdrop);
        }
        catch (Exception e){
            System.out.println("Background image was not found!" + e);
        }
         */
    }
    public static void main(String args[]) {
        new window();
        
    }
}
