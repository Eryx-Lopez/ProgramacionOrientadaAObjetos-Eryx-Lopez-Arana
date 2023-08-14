package edu.eryx.luciel.lopez.arana.retoFinal.process;

import edu.eryx.luciel.lopez.arana.utils.Menu;
import edu.eryx.luciel.lopez.arana.utils.MenuAction;

/**
 * Aquí están todos los diferentes menús que se usan durante el juego:
 * Menú princupal
 * Menú del bosque
 * Menú pelea
 * Menú items
 * Menú aldea
 */
public class OptionMenus {

    //-------------------- MENÚ PRINCIPAL --------------------
    public static Menu menuPrincipal = new Menu();

    public static final String yesOption = "Está bien, vamos"; //Esta es la opción que se muestra
    public static final String noOption = "Lo siento.. ya tengo un camino por recorrer, espero que alguien más pueda ayudarles";

    public static final MenuAction yesAction = (scanner) -> {
        //Aquí es lo que se ejecuta cuando se selecciona la opción correspondiente
        System.out.println("De verdad no sabes lo mucho que te agradezco que nos ayudes.. Deja darte\n" +
                "una pequeña introducción a el cómo puedes rescatar a las hadas.\n\n" +
                "Como el Mago destruyó casi todas las casas, las hadas que logran escapar no tienen\n" +
                "en dónde refugiarse, por lo que es esencial que construyas casas antes de liberar a las hadas.\n" +
                "Al talar árboles, obtendrás madera, y con 4 puedes hacer una casa, no es tan difícil.\n" +
                "Cada casa puede dar refugio a 5 hadas.\n\n" +
                "¡Vamos a talar árboles!");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Muy bien, sé que la espada puede tener muchos usos, pero déjame darte\n" +
                "esta hacha, facilitará mucho tu trabajo.\n" +
                "       (De otro color) REY HADA TE HA DADO UNA HACHA.");
        // menuGoToForest.addOption(cortarMadera, cortarAction);
        //menuGoToForest.addOption(yaMeArrepenti, yaMearrepentiAction);// El chiste sí es salirte, pero en realidad
        //Te mandaría al método que sería el final si abandonas el juego.

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
    //-------------------- MENÚ DEL BOSQUE --------------------

    public static Menu menuGoToForest = new Menu();
        static String cortarMadera = "Cortar árboles";
        public static MenuAction cortarAction = (scanner) -> {
            Process.cortarAction();
        };

        static String yaMeArrepenti = "Sabes qué.. creo que es mejor que continúe con mi camino";
        public static MenuAction yaMearrepentiAction = (scanner) -> Finales.finalSiAbandonas();
    static {
        menuGoToForest
                .addOption(cortarMadera, cortarAction);
        menuGoToForest
                .addOption(yaMeArrepenti, yaMearrepentiAction);// El chiste sí es salirte, pero en realidad
        //Te mandaría al método que sería el final si abandonas el juego.
        menuGoToForest.createMenu();

    }


    //-------------------- MENÚ PELEA --------------------

    public static Menu menuPeleaOgro = new Menu();
        static String atacarOption = "Atacar";
          public static MenuAction atacarAction = (scanner) -> {
            Process.atacarAlOgroAction();
          };

        static String defenderOption = "Defender";
        public static MenuAction defenderAction = (scanner) -> {
            Process.defenderDelOgroAction();
        };
        static String huirOption = "Huir";
        public static MenuAction huirAction = (scanner) -> {
            Finales.finalSiAbandonas();
        };
        static {
            menuPeleaOgro.addOption(atacarOption,atacarAction);
            menuPeleaOgro.addOption(defenderOption,defenderAction);
            menuPeleaOgro.addOption(huirOption,huirAction);

    }

    //-------------------- MENÚ ITEMS --------------------
    public static Menu menuItems = new Menu();
       static String pieMoraAzul = "Pie de Mora azul.                  8 HOJAS\n" +
               "        Cura 3 puntos de vida.";
       public static MenuAction pieMoraAzulAction = (scanner -> Process.pieMoraAzulAction());
       static String pieDeManzana = "Pie de Manzana.                  15 HOJAS\n" +
               "        Cura la mitad de tu vida.";
       public static MenuAction pieManzanaAction = (scanner -> Process.pieDeManzanaAction());
       static String pastelDeLavanda = "Pastel de Lavanda.                  40 HOJAS\n" +
               "        Cura la vida al máximo";
       public static MenuAction pastelLavandaAction = (scanner -> Process.pastelDeLavandaAction());

       static String tortuConchasDeMatcha = "Tortu-conchas de Matcha.                  60 HOJAS\n" +
                   "        Sube en 5 puntos la vida.";
       public static MenuAction tortuConchasAction = (scanner -> Process.tortuConchasAction());

    static {
            menuItems
                    .addOption(pieMoraAzul,pieManzanaAction);
            menuItems
                    .addOption(pieDeManzana, pieManzanaAction);
            menuItems
                    .addOption(pastelDeLavanda, pastelLavandaAction);
            menuItems
                    .addOption(tortuConchasDeMatcha, tortuConchasAction);
            menuItems.createMenu();

        }
    //-------------------- MENÚ ALDEA --------------------
    public static Menu menuAldea = new Menu();
    static String buscarOgros = "Buscar ogros en el bosque";
    static String hacerCasas = "Construir casas";
    public static MenuAction buscarOgrosAction = (scanner -> Process.encontrarOgroAction());
    static String yaNoQuiero = "Yo.. Lo siento, mucho, pero no creo ser el indicado.\n" +
            "Coninuaré con mi camino, de verdad lo siento. Espero que alguien llegue\n" +
            "y pueda salvarles.";
    public static MenuAction hacerCasasAction = (scanner) -> {
    Process.hacerCasasAction();
    };
        static {
            menuAldea
                    .addOption(cortarMadera, cortarAction);
            menuAldea
                    .addOption(buscarOgros, buscarOgrosAction);
            menuAldea.addOption(hacerCasas,hacerCasasAction);
            menuAldea.addOption(yaNoQuiero, noAction);
            menuAldea.createMenu();

        }




}
