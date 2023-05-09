package edu.eryx.luciel.lopez.arana.retoFinal.ui;
import edu.eryx.luciel.lopez.arana.retoFinal.process.Process;
import edu.eryx.luciel.lopez.arana.utils.Menu;
import edu.eryx.luciel.lopez.arana.utils.MenuAction;

import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.menuGoToForest;


public class CLI {
    public static Menu menuPrincipal = new Menu();

    private static final String INTRODUCCION = "Bienvenido, viajero, lo siento, no pude evitar ver la espada que llevas contigo\n" +
            "Me gustaría solicitar tu ayuda... hace unos años llegó un mago que nos trató con\n" +
            "dulzura y no intentó ayudar.. pero se fue por un mal camino y ahora captura a las\n" +
            "hadas que están a su alcance y vivimos con miedo... necesitamos la ayuda de alguien\n" +
            "valiente que pueda rescatarnos.. no quiero que mi pueblo siga viviendo en este tormento\n\n" +
            "¿Nos ayudarías?";

    private static final String yesOption = "Está bien, vamos"; //Esta es la opción que se muestra
    private static final String noOption = "Lo siento.. ya tengo un camino por recorrer, espero que alguien más pueda ayudarles";


    private static final MenuAction yesAction = (scanner) -> {
        //Aquí es lo que se ejecuta cuando se selecciona la opción correspondiente
        System.out.println("De verdad no sabes lo mucho que te agradezco que nos ayudes.. Deja darte\n" +
                "una pequeña introducción a el cómo puedes rescatar a las hadas.\n\n" +
                "Como el Mago destruyó casi todas las casas, las hadas que logran escapar no tienen\n" +
                "en dónde refugiarse, por lo que es esencial que construyas casas antes de liberar a las hadas.\n" +
                "Al talar árboles, obtendrás madera, y con 4 puedes hacer una casa, no es tan difícil.\n" +
                "Cada casa puede dar refugio a 5 hadas.\n\n" +
                "¡Vamos a talar árboles!");

        Process.goToForest();

    };
    private static final MenuAction noAction = (scanner) -> System.out.println("¿De verdad no vas a ayudarnos?");

    static {
        menuPrincipal
                .addOption(yesOption, yesAction);
        menuPrincipal
                .addOption(noOption, noAction);
        menuPrincipal
                .createMenu();

    }

    public static void main(String[] args) {
        System.out.println(INTRODUCCION);

        menuPrincipal.showMenu();
        var option = menuPrincipal.readOption();
        menuPrincipal.selectAndRunOption(option);

        menuGoToForest.showMenu();
        var option1 = menuGoToForest.readOption();
        menuGoToForest.selectAndRunOption(option1);

        System.out.println("Oh, no.. ¿escuchas eso? ¡Es un ogro del Mago! ¡Atácalo antes de que sea muy tarde!");




      /*  do {
            menu.showMenu();
            var option = menu.readOption();
            menu.selectAndRunOption(option);
        } while (menu.isAlive());

       */


    }
}
