package edu.eryx.luciel.lopez.arana.retoFinal;

import edu.eryx.luciel.lopez.arana.retoFinal.process.Process;
import edu.eryx.luciel.lopez.arana.retoFinal.ui.CLI;

import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.*;


public class Main {
    private static boolean indicadorPelea = false;
    public static void main(String[] args) {

    while(menuPrincipal.isAlive()){
         /* System.out.println(CLI.INTRODUCCION);

          menuPrincipal.showMenu();
          var principal = menuPrincipal.readOption();
          menuPrincipal.selectAndRunOption(principal);


          */

          menuGoToForest.showMenu();
          var forest = menuGoToForest.readOption();
          menuGoToForest.selectAndRunOption(forest);


          try {
              Thread.sleep(700);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }

          if (indicadorPelea == false) {
              System.out.println(CLI.A_LUCHAR);
              System.out.println();
              Process.iniciarPeleaOgrovsHeroe();
              indicadorPelea = true;
          }

          menuAldea.showMenu();
          var aldea = menuAldea.readOption();
          menuAldea.selectAndRunOption(aldea);
      }




    }

}
