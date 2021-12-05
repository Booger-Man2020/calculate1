import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

public class calcul extends JFrame {
    public calcul() {
        setTitle("POSCHITAY");
        setBounds(400, 200, 400, 450);
        setDefaultCloseOperation(3);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 350, 50);
        add(field);
        Scanner scanner = new Scanner(System.in);
        JButton res = new JButton("СЕ");
        JButton bracket1 = new JButton("(");
        JButton bracket2 = new JButton(")");
        JButton dot = new JButton(".");
        JButton but1 = new JButton("1");

        JButton but2 = new JButton("2");
        JButton but3 = new JButton("3");
        JButton but4 = new JButton("4");
        JButton but5 = new JButton("5");
        JButton but6 = new JButton("6");
        JButton but7 = new JButton("7");
        JButton but8 = new JButton("8");
        JButton but9 = new JButton("9");
        JButton but0 = new JButton("0");
        JButton eq = new JButton("=");
        JButton plus = new JButton("+");
        JButton min = new JButton("-");
        JButton slash = new JButton("/");
        JButton mul = new JButton("x");

        res.setBounds(20, 80, 50, 50);
        add(res);
        bracket1.setBounds(80, 80, 50, 50);
        add(bracket1);
        bracket2.setBounds(140, 80, 50, 50);
        add(bracket2);

        but7.setBounds(20, 140, 50, 50);
        add(but7);
        but7.addMouseListener();
        but8.setBounds(80, 140, 50, 50);
        add(but8);
        but9.setBounds(140, 140, 50, 50);
        add(but9);

        but4.setBounds(20, 200, 50, 50);
        add(but4);
        but5.setBounds(80, 200, 50, 50);
        add(but5);
        but6.setBounds(140, 200, 50, 50);
        add(but6);

        but1.setBounds(20, 260, 50, 50);
        add(but1);
        but2.setBounds(80, 260, 50, 50);
        add(but2);
        but3.setBounds(140, 260, 50, 50);
        add(but3);

        but0.setBounds(80, 320, 50, 50);
        add(but0);
        dot.setBounds(140, 320, 50, 50);
        add(dot);

        slash.setBounds(260, 80, 50, 50);
        add(slash);
        mul.setBounds(260, 140, 50, 50);
        add(mul);
        min.setBounds(260, 200, 50, 50);
        add(min);

        plus.setBounds(260, 260, 50, 110);
        add(plus);

        eq.setBounds(200, 260, 50, 110);
        add(eq);
        eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(field.getText());
            }
        });

        eq.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(field.getText());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        setVisible(true);



    }

    public static void main(String[] args) {
        new calcul();

    }
}
