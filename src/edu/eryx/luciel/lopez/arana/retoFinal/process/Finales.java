package edu.eryx.luciel.lopez.arana.retoFinal.process;

import edu.eryx.luciel.lopez.arana.utils.Menu;
import edu.eryx.luciel.lopez.arana.utils.MenuAction;

public class Finales {
    static String noJugarOption = "No, gracias.";
    public static MenuAction noJugarAction = (scanner) -> {
        OptionMenus.menuPrincipal.killMenu();
    };
    public static Menu menuFinal = new Menu();

    static {
        menuFinal
                .addOption(OptionMenus.yesOption,OptionMenus.yesAction);
        //menuFinal.addOption(noJugarOption, noJugarAction);
        menuFinal
                .createMenu();
    }

    public static void finalSiAbandonas(){
        System.out.println("Realmente esperaba que fueras tú el que nos salvara..");
        System.out.println();
        System.out.println("¿Quieres volver a jugar?");
        menuFinal.showMenu();
        var final_ = menuFinal.readOption();
        menuFinal.selectAndRunOption(final_);

    }

}
