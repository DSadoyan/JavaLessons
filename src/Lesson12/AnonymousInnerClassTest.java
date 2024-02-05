package Lesson12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnerClassTest {
    static int count = 1;
    public static void main(String[] args) {
        Musician musician = new Guitarist();
        musician.playMusic();

        Musician pianist = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("Playing piano");
            }
        };
        pianist.playMusic();

        Musician violinist = new Musician() {
            @Override
            public void playMusic() {
                System.out.println("Playing violin");
            }
        };
        violinist.playMusic();

        Message sms = new Message() {
            @Override
            public void sendMessage(String text) {
                System.out.println("Sending sms " + text);
            }
        };
        sms.sendMessage("Hello");

        Geo geo = new Geo(){
            @Override
            public void perimeterTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
                super.perimeterTriangle(x1, y1, x2, y2, x3, y3);
            }
        };
        JFrame jf = new JFrame();
        jf.setSize(400,600);
        JButton jb = new JButton("Click");
        jf.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Count " + count++);
            }
        });
        jf.setVisible(true);


    }

}
