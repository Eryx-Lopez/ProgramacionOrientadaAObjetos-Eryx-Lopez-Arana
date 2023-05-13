package edu.eryx.luciel.lopez.arana.retoFinal;

import edu.eryx.luciel.lopez.arana.retoFinal.process.Process;
import edu.eryx.luciel.lopez.arana.retoFinal.ui.CLI;

import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.menuPeleaOgro;
import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.menuGoToForest;
import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.menuPrincipal;


public class Main {
    public static void main(String[] args) {

        /*System.out.println(CLI.INTRODUCCION);
        menuPrincipal.showMenu();
        var principal = menuPrincipal.readOption();
        menuPrincipal.selectAndRunOption(principal);

        menuGoToForest.showMenu();
        var forest = menuGoToForest.readOption();
        menuGoToForest.selectAndRunOption(forest);

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(CLI.A_LUCHAR);
        System.out.println();

         */
        Process.pelearOgrovsHeroe();



    }

}
