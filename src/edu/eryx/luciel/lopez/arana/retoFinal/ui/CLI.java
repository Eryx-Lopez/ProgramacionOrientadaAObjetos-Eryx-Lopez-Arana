package edu.eryx.luciel.lopez.arana.retoFinal.ui;
import edu.eryx.luciel.lopez.arana.retoFinal.process.Process;
import edu.eryx.luciel.lopez.arana.utils.Menu;
import edu.eryx.luciel.lopez.arana.utils.MenuAction;

import static edu.eryx.luciel.lopez.arana.retoFinal.process.Process.menuGoToForest;

public class CLI {
    public static Menu menuPrincipal = new Menu();


    private static String INTRODUCTION = "Bienvenido, querido viajero...\n" +
        "Déjame contarte una pequeña historia.\n\n" +
        "Hace mucho mucho tiempo, un mago llegó a una pequeña aldea, era muy cariñoso con todos\n" +
        "nosotros, pero cuando se dio cuenta que podía utilizarnos para aumentar su poder, pronto\n" +
        "todo se vio sumido en una gran oscuridad.. \n\n" +
        "Ahora tiene a casi todas las hadas cautivas, es muy poderoso... ¿Crees que puedas ayudarnos " +
        "a librarnos de él?";

    private static String yesOption = "Sí, vamos"; //Esta es la opción que se muestra
    private static String noOption = "No, qué miedo el mago, lo siento";


    private static MenuAction yesAction = (scanner) -> {
        //Aquí es lo que se ejecuta cuando se selecciona la opción correspondiente
        System.out.println("¡Gracias por ayudarnos! Deja te enseño cómo funciona esto.\n" +
                "Sólo puedes talar tres árboles antes de atacar al ogro. Al talar cada árbol, obtendrás\n" +
                "madera y hojas de vida. Con 4 de madera puedes hacer una casa para 5 hadas. Con una hoja de vida\n" +
                "puedes recuperar un punto de vida.\n" +
                "Ahora vamos a talar árboles");
        Process.goToForest();

    };
    private static MenuAction noAction = (scanner) -> {
        System.out.println("¿De verdad no vas a ayudarnos?");
    };

    static {
        menuPrincipal
                .addOption(yesOption, yesAction);
        menuPrincipal
                .addOption(noOption, noAction);
        menuPrincipal
                .createMenu();

    }

    public static void main(String[] args) {
        menuPrincipal.showMenu();
        var option = menuPrincipal.readOption();
        menuPrincipal.selectAndRunOption(option);

        menuGoToForest.showMenu();
        var option1 = menuGoToForest.readOption();
        menuGoToForest.selectAndRunOption(option1);


      /*  do {
            menu.showMenu();
            var option = menu.readOption();
            menu.selectAndRunOption(option);
        } while (menu.isAlive());

       */


    }
}
