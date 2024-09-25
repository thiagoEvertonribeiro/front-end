// Fig. 12.7: LabelTest.java
// Testing LabelFrame.

// a linha abaixo importara o componente jframe do modulo swing da biblioteca (pacote) javax
import javax.swing.JFrame;

//a linha abaixo esta declarando a classe labeltest
public class LabelTest 
// vai iniciar bloco de codigos da classe labeltest
{
// esta declarando o metodo main
   public static void main(String[] args)
//esta declarando a variavel labelframe, ela é do tipo labelframe
   { 
      LabelFrame labelFrame = new LabelFrame(); 
// esta declarando o fechamento da operação
      labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// definir largura e altura em pixel
      labelFrame.setSize(260, 180); 
// esta pedindo para renderizar mostrar na tela
      labelFrame.setVisible(true); 
// encerrar bloco de codigo do metodo     
   } 
// encerrar bloco de codigo da classe   
} // end class LabelTest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
