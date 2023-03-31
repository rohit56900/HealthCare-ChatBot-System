import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class chat extends JFrame {
    JTextArea ar = new JTextArea();
    JTextField fl = new JTextField();

    JButton btn = new JButton();

    JLabel la = new JLabel();


    chat(){
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setLayout(null);
        fr.setSize(400, 600);
        fr.getContentPane().setBackground(Color.BLACK);
        fr.setTitle("LPU UNI HOSPITOL CHATBOT");

        fr.add(ar);
        fr.add(fl);

        ar.setSize(300, 310);
        ar.setLocation(50, 1);
        ar.setBackground(Color.white);

        fl.setSize(300, 20);
        fl.setLocation(1, 320);

        fr.add(btn);
        la.setText("SEND");
        btn.add(la);
        btn.setSize(400, 20);
        btn.setLocation(300, 320);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == btn) {
                    String str = fl.getText().toLowerCase();
                    ar.append("You : " + str + "\n");
                    fl.setText("");

                    if(str.contains("weakness") || str.contains("body pain") || str.contains("shivering") || str.contains("chills") || str.contains("irritated") || str.contains("headache")) {
                        response("You might have fever." + "\n" + "For quick relief you can take medicine - dolo, paracetamol." + "\n" + "Nearest Medical shop - Uni-Hospital, LPU");

                    } else if (str.contains("sore throat") || str.contains("dry cough") || str.contains("runny nose") || str.contains("getting cold")) {
                        response("You might have cold." + "\n" + "For quick relief you can take medicine - Cetriz, Zolrex-D, Viscodyne-D." + "\n" + "Nearest Medical shop - Uni-Hospital, LPU");

                    } else if (str.contains("dizziness") || str.contains("faint") || str.contains("sleepiness") || str.contains("tired")) {
                        response("You might have weakness." + "\n" + "For quick relief you can take medicine - AtoZ syrup, Vitamine tablet." + "\n" + "Nearest Medical shop - Uni-Hospital, LPU");

                    } else if (str.contains("acidity") || str.contains("vomating")) {
                        response("You might have stomach problem." + "\n" + "For quick relief you can take medicine - Eno, Pantop-D." + "\n" + "Nearest Medical shop - Uni-Hospital, LPU");

                    } else if (str.contains("short temper")) {
                        response("You might have BP." + "\n" + "For quick relief you can take medicine - Pinon a20, Benazepril." + "\n" + "Nearest Medical shop - Uni-Hospital, LPU");

                    } else if (str.contains("blurred vision")) {
                        response("You might have Eye Problem." + "\n" + "For quick relief you can take medicine - Eye Drops." + "\n" + "Nearest Medical shop - Uni-Hospital, LPU" + "/n" );

                    } else
                        response("Sorry, I didn't understand your language.");
                }
            }
        });
    }

    public void response(String s) {
        ar.append("LPU UNI HOPITOL CHATBOT : " + s + "\n" );
    }


}

public class healthCareChatBot {
    public static void main(String[] args) {
        new chat();
    }
}