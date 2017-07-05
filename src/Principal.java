
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import questao1.P1SSDQ1;
import questao2.P1SSDQ2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMD-FX
 */
public class Principal {
    public static void main(String[] args){
        int resultado;
      Object[] options = { "Questão 1", "Questão 2", "Sair" };
      resultado=JOptionPane.showOptionDialog(null, "Avaliação 1 SSD", "P1", 
              JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
              options, options[0]);
      switch(resultado){
          case 0:
              new P1SSDQ1().show();
              break;
          case 1:
              new P1SSDQ2().show();
              break;
          case 2:
              
              break;
      }
    }
}
/*
Falta retonar vetor com os indices selecionados para participarem de classificação ou não
falta retornar apenas as linhas com o reultado esperado.
mostrar na are de texto o resultado
bloquear edição nas caixas de testo das duas janelas.
*/