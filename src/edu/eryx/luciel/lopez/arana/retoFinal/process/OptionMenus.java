package edu.eryx.luciel.lopez.arana.retoFinal.process;

import edu.eryx.luciel.lopez.arana.utils.Menu;
import edu.eryx.luciel.lopez.arana.utils.MenuAction;


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
    //-------------------- MENÚ DEL BOSQUE --------------------

    public static Menu menuGoToForest = new Menu();
        static String cortarMadera = "Cortar un árbol";
        public static MenuAction cortarAction = (scanner) -> {
            Process.cortarAction();
        };

        static String yaMeArrepenti = "Sabes qué.. creo que es mejor que continúe con mi camino";
        public static MenuAction yaMearrepentiAction = (scanner) -> System.out.println("kshgsjkhgskgs");
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
        public static MenuAction huirAction = (scanner -> Finales.finalSiAbandonas());
        static {
            menuPeleaOgro.addOption(atacarOption,atacarAction);
            menuPeleaOgro.addOption(defenderOption,defenderAction);
            menuPeleaOgro.addOption(huirOption,huirAction);

    }

    //-------------------- MENÚ PELEA --------------------
    public static Menu menuAldea = new Menu();
        static String alBosqueDeNuevoOption = "No, quiero arriesgarme a ir al bosque de nuevo";
        public static MenuAction alBosqueDeNuevoAction = (scanner) ->{
            menuGoToForest.showMenu();
        };
        static String aLaAldeaOption = "Sí, es mejor que vayamos a la aldea";
        public static MenuAction aLaAldeaAction = (scanner) -> {
            Process.irALaAldea();
        };
        static {
            menuAldea
                    .addOption(alBosqueDeNuevoOption,alBosqueDeNuevoAction);
            menuAldea
                    .addOption(aLaAldeaOption, aLaAldeaAction);
            menuAldea.createMenu();
        }





}
