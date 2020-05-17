
package ventana;
import java.awt.event.*;
import javax.swing.*;
public class VentanaArea extends JFrame implements ActionListener{
    private JButton boton1;
    private JTextArea textarea1,textarea2;
    private JLabel label1;
     
    public VentanaArea(){
    setLayout(null);
    label1 = new JLabel("Ingrese texto a comparar");
    label1.setBounds(9,10,200,15);
    add(label1);
    
    textarea1 = new JTextArea();
    textarea1.setBounds(10,30,150,20);
    add(textarea1);
    
    textarea2 = new JTextArea();
    textarea2.setBounds(10,65,150,20);
    add(textarea2);
    
    boton1 = new JButton("Comparar");
    boton1.setBounds(10,110,110,28);
    add(boton1);
    boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton1){
         if(textarea1.getText().equals(textarea2.getText())){
         setTitle("Son iguales");
         }else{
         setTitle("No son iguales");
         }
        }
       
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
}
