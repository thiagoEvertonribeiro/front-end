// Fig. 12.6: LabelFrame.java
// JLabels with text and icons.
import java.awt.FlowLayout; // especifica como os componentes são organizados
import javax.swing.JFrame; // fornece recursos básicos de janela
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

//declarando classe labelframe, extends esta herdando o componente jframe

public class LabelFrame extends JFrame 

//iniciando o bloco de codigos da classe labelframe
{
// declaração de variaveis   
   private final JLabel label1; 
// privete nao exporta a variavel , final serve para declarar uma variavel somente leitura,j label é o tipo da variavel, label1 nome da variavel.   
   private final JLabel label2; 
   private final JLabel label3; 

// O construtor LabelFrame adiciona JLabels ao JFrame
   public LabelFrame()

// inicio do bloco de codigos do construtor   

   { 
// define o titulo da tabela
      super("Testing JLabel");
//definir o layout do quadro
      setLayout(new FlowLayout()); 

// esta recebendo um novo objeto jlabel , injetando parametro string
      label1 = new JLabel("Label with text");
// esta definindo um texto na ferramenta de dica , quando colocar o mouse no elemento aparece o texto.   
      label1.setToolTipText("This is label1");
// mostra na saida de camadas       
      add(label1); // add label1 to JFrame

// declarando variavel bug do tipo icon, que esta recebendo variavel de novo objeto do tipo imagem icon, pega a classe invoca o recurso bug1.png

      Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
// recebebendo parametros, virgula dentro da declaração de parametro serve como separador de parametros.      
      label2 = new JLabel("Label with text and icon", bug, 
// esta alinhando objeto bug, indentifica que esta alinhando a esquerda     
      SwingConstants.LEFT);     
      label2.setToolTipText("This is label2");
      add(label2); // add label2 to JFrame

// declaração de variavel      
      label3 = new JLabel(); 
// definindo texto     
      label3.setText("Label with icon and text at bottom");
// definindo o icone   do label13
      label3.setIcon(bug); // add icon to JLabel
// definindo o texto em posição horizontal , vai estar ao centro
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
// definindo o texto em posição vertical , vai estar para baixo     
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
// definindo o texto de ajuda      
      label3.setToolTipText("This is label3");
// esta sendo adicionado por ultimo     
      add(label3); // add label3 to JFrame
// fechamento do construtor      
   } 
} // fechamento da classe


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
