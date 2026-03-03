import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;

public class workingwithborderlayout {
    public workingwithborderlayout() {
     JFrame Borderframe = new JFrame("borderlayout frame");
     Borderframe.setSize(1000,500);
     Borderframe.setLayout(new BorderLayout());
        JButton buttonone = new JButton("button one");
        JButton buttontwo = new JButton("button two");
        JButton buttonthree = new JButton("button three");
        JButton buttonfour = new JButton("button four");
        Borderframe.add(this.CreateJbuttonone(),BorderLayout.NORTH);
        Borderframe.add(buttontwo, BorderLayout.SOUTH);
        Borderframe.add(buttonthree, BorderLayout.EAST);
        Borderframe.add(buttonfour, BorderLayout.WEST);
     Borderframe.setVisible(true);
    }
    public JButton CreateJbuttonone(){
       JButton ButtonONE = new JButton("button one");
        return ButtonONE;
    }
        
}

