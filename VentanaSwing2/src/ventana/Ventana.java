package ventana;
import javax.swing.*;
import java.awt.event.*;
public class Ventana extends JFrame implements ActionListener     {
    private JLabel jlabel1,jlabel2;
    private JTextField texto1,texto2;
    private JButton boton;
    public Ventana(){
        setLayout(null);
    jlabel1 = new JLabel("Usuario: ");
     jlabel1.setBounds(10,10,100,40);
      add(jlabel1);
    jlabel2 = new JLabel("Clave: ");
     jlabel2.setBounds(23,20,200,80);
      add(jlabel2);
    texto1 = new JTextField();
     texto1.setBounds(65,17,80,22);
      add(texto1);
    texto2 = new JTextField();
     texto2.setBounds(65,48,80,22);
      add(texto2);
    boton = new JButton("Ingresar");
     boton.setBounds(240,80,90,40);
      add(boton);
       boton.addActionListener(this);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == boton){
        if(texto1.getText().equals("Juan"))
         if(texto2.getText().equals("abc123")){
            setTitle("correcto");
}else{setTitle("Incorrecto");
        }
    }
       
    } 
       public static void main(String []args){
       Ventana v1 = new Ventana();
       v1.setVisible(true);
       v1.setBounds(150,190,400,200);
       v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       VentanaArea v2 = new VentanaArea();
       v2.setVisible(true);
       v2.setBounds(750,190,400,200);
       v2.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       VentanaBox v3 = new VentanaBox();
       v3.setVisible(true);
       v3.setBounds(450,440,400,200);
       v3.setDefaultCloseOperation(EXIT_ON_CLOSE);
       }     

    
}
