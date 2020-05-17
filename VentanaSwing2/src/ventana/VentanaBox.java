package ventana;
import javax.swing.*;
import java.awt.event.*;
public class VentanaBox extends JFrame implements ActionListener{

    private JLabel label1,label2;
    private JTextField textfield;
    private JButton boton;
    private JComboBox <String> combo;
    
    public VentanaBox(){
    setLayout(null);
    label1 = new JLabel("Ingrese un nombre:");
    label1.setBounds(10,10,200,15);
    add(label1);
    
    label2 = new JLabel("Seleccione un pais:");
    label2.setBounds(10,55,200,15);
    add(label2);
    
    boton = new JButton("Aceptar");
    boton.setBounds(240,105,115,25);
    add(boton);
    boton.addActionListener(this);
    
    textfield = new JTextField();
    textfield.setBounds(10,29,90,25);
    add(textfield); 
    
    combo = new JComboBox<String>();
    combo.setBounds(10,75,90,25);
    add(combo);
    combo.addItem("Inglaterra"); 
     combo.addItem("España");
      combo.addItem("Brasil");
       combo.addItem("Argentina");
        combo.addItem("USA");
         combo.addItem("Japon");
          combo.addItem("Australia");
    combo.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == boton){
        String pais = (String)combo.getSelectedItem();
        String nombre = textfield.getText();
        setTitle("Pais: "+pais+"."+" /// "+ "Nombre: "+nombre+".");
        
        }
        }
    }
    

