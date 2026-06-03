import java.util.ArrayList;
import javax.swing.*;

class Superhero {
    private String name;
    private boolean onMission;

    public Superhero(String name) {
        this.name = name;
        this.onMission = false;
    }

    void sendOnMission(){
        onMission = true;
    }

    void recallToBase(){
        onMission = false;
    }

    boolean isOnMission(){
        return onMission;
    }

    String getName(){
        return name;
    }

}


class MissionControl {

    ArrayList<Superhero> superheros = new ArrayList<>();

    void addHero(Superhero h){
        superheros.add(h);
    }

    String sendHero(String name){
        for (Superhero h : superheros){
            if (h.getName().equals(name)){
                if(h.isOnMission()){
                    return name + " is already on a mission.";                
                }

                h.sendOnMission();
                return name + " hero is sent on a mission.";
            }
        }

        return " super hero not found";
    }

    String recallHero(String name){
        for (Superhero h : superheros){
            if(h.getName().equals(name)){
                if(!h.isOnMission()){
                    return name + " is at base";
                }

                h.recallToBase();
                return name + " is recalled to base";
            }
        }
        return " hero not found";
    }

    String showActiveMissions(){
        String result = "";
        for (Superhero h : superheros){
            if(h.isOnMission()){
                result += h.getName() + "\n";
            }
        }

        if (result.equals("")){
            return " no superhero at any mission!!";
        }

        return result;
    }

}

class UI {
    public UI(MissionControl sys){
        JFrame frame = new JFrame("Superhero Mission Control");
        frame.setLayout(new java.awt.FlowLayout());
    
        JTextField input = new JTextField(15);
       // input.setBounds(50, 30, 200, 30);

        JTextArea displayer = new JTextArea(8,25);
      //  displayer.setBounds(50, 80, 300, 120);

        JButton b = new JButton("Show Active Missions");
        JButton b1 = new JButton("Sned on Mission");
        JButton b2 = new JButton("Recall to Base");


      /**   b.setBounds(100, 220, 150, 30);
        b1.setBounds(210, 220, 150, 30);
        b2.setBounds(120, 260, 200, 30); */

        b.addActionListener(e-> {
            displayer.setText(sys.showActiveMissions());
        });

        b1.addActionListener(e-> {
            displayer.setText(sys.sendHero(input.getText()));
        });

        b2.addActionListener(e->{
            displayer.setText(sys.recallHero(input.getText()));
        });

        frame.add(input);
        frame.add(displayer);
        frame.add(b);
        frame.add(b1);
        frame.add(b2);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(700,700);
    }   
}

public class Superheros{
    public static void main(String[] args) {
        MissionControl sys = new MissionControl();
        sys.addHero(new Superhero("Batman"));
        sys.addHero(new Superhero("Spiderman"));
        sys.addHero(new Superhero("WonderWoman"));

        new UI(sys);
    }
}
