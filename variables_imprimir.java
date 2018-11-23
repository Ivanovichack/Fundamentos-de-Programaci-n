/*
 *Programa en JAVA que pide nombre, edad, peso y talla de un
 * usuario y calcula su IMC. Posteriormente muestra el resultado en pantalla.
 * Un mensaje que diga si esta en desnutrición, normal o con sobrepeso.
 *
 */

//Importamos la clase JOptionPane
import javax.swing.JOptionPane;
//Creamos la clase variables_imprimir
public class variables_imprimir {
   
    //creación del metodo principal main - Aqui se pone todo el código que se ejecutara. Fuera de el nada se ejecuta.
    public static void main(String [] args){
        
        //Declaramos y al mismo tiempo Pedimos el nombre y lo guardamos en dicha variable
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        
        //Declaramos y al mismo tiempo Pedimos la edad y se convierte el resultado a entero
        int edad =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        
        //Declaramos y al mismo tiempo Pedimos el peso y lo convertimos a Float 
        float peso =  Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su peso"));
        
        //pedimos la talla y lo convertimos a Float
        float talla =  Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese talla"));
        
        //declaramos la variable IMC de tipo double en la que se guardara el IMC del usuario
        double IMC = 0;

        // Calculamos el IMC con los datos leidos 
        IMC = (peso / (talla * talla));

        //Comparamos si el IMC es menor a 18
        if(IMC < 18){

            JOptionPane.showMessageDialog(null, "NOMBRE:"+nombre+
                    "\n EDAD:"+edad+ 
                    "\n PESO:"+peso+
                    "\n Talla:"+talla+ 
                    "\n IMC:"+IMC+
                    "\nEstas desnutrido");

        //Comparamos si el IMC es mayor o igual a 18 y ademas que sea menor o igual a 24.9
        }else if(IMC >= 18 && IMC <= 24.9){

             JOptionPane.showMessageDialog(null, "NOMBRE:"+nombre+
                    "\n EDAD:"+edad+ 
                    "\n PESO:"+peso+
                    "\n Talla:"+talla+ 
                    "\n IMC:"+IMC+
                    "\nEstas normal");
 
        //Comparamos si el IMC es mayor o igual a 25 y ademas que sea menor o igual a 29.9
        }else if(IMC >= 25 && IMC <= 29.9){
            
             JOptionPane.showMessageDialog(null, "NOMBRE:"+nombre+
                    "\n EDAD:"+edad+ 
                    "\n PESO:"+peso+
                    "\n Talla:"+talla+ 
                    "\n IMC:"+IMC+
                    "\nEstas conn sobrepeso");

        }

    }


}
