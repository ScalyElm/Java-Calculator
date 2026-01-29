package Calcolatrice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calcolatrice extends JFrame implements ActionListener {
   private JTextField display;
   private double primoNumero, secondoNumero, risultato;
   private String operation;
   public Calcolatrice() {
       setTitle("Calcolatrice");
       setSize(300, 400);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       getContentPane().setLayout(null);
       display = new JTextField();
       display.setBackground(new Color(224, 255, 255));
       display.setBounds(0, 0, 283, 53);
       display.setFont(new Font("Tahoma", Font.PLAIN, 18));
       display.setEditable(false);
       getContentPane().add(display);
       JPanel panelButtons = new JPanel();
       panelButtons.setBackground(Color.BLACK);
       panelButtons.setBounds(0, 52, 283, 309);
       JButton btmSette = new JButton("7");
       btmSette.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btmSette.setBounds(1, 0, 56, 77);
       btmSette.addActionListener(this);
       panelButtons.setLayout(null);
       panelButtons.add(btmSette);
       JButton btnOtto = new JButton("8");
       btnOtto.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnOtto.setBounds(57, 0, 56, 77);
       btnOtto.addActionListener(this);
       panelButtons.add(btnOtto);
       JButton btnNove = new JButton("9");
       btnNove.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnNove.setBounds(113, 0, 56, 77);
       btnNove.addActionListener(this);
       panelButtons.add(btnNove);
       JButton btnAdd = new JButton("+");
       btnAdd.setFont(new Font("Traditional Arabic", Font.BOLD, 25));
       btnAdd.setBounds(225, 77, 56, 77);
       btnAdd.addActionListener(this);
       panelButtons.add(btnAdd);
       JButton btnQuatro = new JButton("4");
       btnQuatro.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnQuatro.setBounds(1, 77, 56, 77);
       btnQuatro.addActionListener(this);
       panelButtons.add(btnQuatro);
       JButton btnCinque = new JButton("5");
       btnCinque.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnCinque.setBounds(57, 77, 56, 77);
       btnCinque.addActionListener(this);
       panelButtons.add(btnCinque);
       JButton btnSei = new JButton("6");
       btnSei.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnSei.setBounds(113, 77, 56, 77);
       btnSei.addActionListener(this);
       panelButtons.add(btnSei);
       JButton btnSottrazione = new JButton("-");
       btnSottrazione.setFont(new Font("Traditional Arabic", Font.BOLD, 25));
       btnSottrazione.setBounds(169, 77, 56, 77);
       btnSottrazione.addActionListener(this);
       panelButtons.add(btnSottrazione);
       JButton btnUno = new JButton("1");
       btnUno.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnUno.setBounds(1, 154, 56, 77);
       btnUno.addActionListener(this);
       panelButtons.add(btnUno);
       JButton btnDue = new JButton("2");
       btnDue.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnDue.setBounds(57, 154, 56, 77);
       btnDue.addActionListener(this);
       panelButtons.add(btnDue);
       JButton btnTre = new JButton("3");
       btnTre.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnTre.setBounds(113, 154, 56, 77);
       btnTre.addActionListener(this);
       panelButtons.add(btnTre);
       JButton btnMoltiplicazione = new JButton("*");
       btnMoltiplicazione.setFont(new Font("Traditional Arabic", Font.BOLD, 25));
       btnMoltiplicazione.setBounds(169, 154, 56, 77);
       btnMoltiplicazione.addActionListener(this);
       panelButtons.add(btnMoltiplicazione);
       JButton btnComma = new JButton(",");
       btnComma.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnComma.setBounds(1, 231, 56, 77);
       btnComma.addActionListener(this);
       panelButtons.add(btnComma);
       JButton btnZero = new JButton("0");
       btnZero.setFont(new Font("Traditional Arabic", Font.BOLD, 17));
       btnZero.setBounds(57, 231, 56, 77);
       btnZero.addActionListener(this);
       panelButtons.add(btnZero);
       JButton btnUguale = new JButton("=");
       btnUguale.setFont(new Font("Traditional Arabic", Font.BOLD, 25));
       btnUguale.setBounds(169, 231, 112, 77);
       btnUguale.addActionListener(this);
       panelButtons.add(btnUguale);
       JButton btnDivisione = new JButton("/");
       btnDivisione.setFont(new Font("Traditional Arabic", Font.BOLD, 25));
       btnDivisione.setBounds(225, 154, 56, 77);
       btnDivisione.addActionListener(this);
       panelButtons.add(btnDivisione);
       JButton btnRadice = new JButton("√");
       btnRadice.setFont(new Font("Tahoma", Font.BOLD, 17));
       btnRadice.setBounds(113, 231, 56, 77);
       btnRadice.addActionListener(this);
       panelButtons.add(btnRadice);
       JButton btnClear = new JButton("C");
       btnClear.setFont(new Font("Times New Roman", Font.BOLD, 27));
       btnClear.setBounds(169, 0, 112, 77);
       btnClear.addActionListener(this);
       panelButtons.add(btnClear);
       getContentPane().add(panelButtons);
       setVisible(true);
   }
   public static void main(String[] args) {
       new Calcolatrice();
   }
   @Override
   public void actionPerformed(ActionEvent e) {
       String command = e.getActionCommand();
       switch (command) {
           case "0":
           case "1":
           case "2":
           case "3":
           case "4":
           case "5":
           case "6":
           case "7":
           case "8":
           case "9":
           case ".":
               display.setText(display.getText() + command);
               break;
           case "+":
           case "-":
           case "*":
           case "/":
               primoNumero = Double.parseDouble(display.getText());
               operation = command;
               display.setText("");
               break;
           case "=":
               secondoNumero = Double.parseDouble(display.getText());
               switch (operation) {
                   case "+":
                       risultato = primoNumero + secondoNumero;
                       break;
                   case "-":
                       risultato = primoNumero - secondoNumero;
                       break;
                   case "*":
                       risultato = primoNumero * secondoNumero;
                       break;
                   case "/":
                       if (secondoNumero != 0)
                           risultato = primoNumero / secondoNumero;
                       else
                           risultato = 0;
                       break;
               }
               display.setText(String.valueOf(risultato));
               break;
           case "√":
               double number = Double.parseDouble(display.getText());
               risultato = Math.sqrt(number);
               display.setText(String.valueOf(risultato));
               break;
           case "C":
               display.setText("");
               break;
       }
   }
}
