package edu.eryx.luciel.lopez.arana.retoFinal.process;

import static edu.eryx.luciel.lopez.arana.retoFinal.process.OptionMenus.*;

public class Process {
    public static void goToForest(){
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Muy bien, sé que la espada puede tener muchos usos, pero déjame darte\n" +
                "esta hacha, facilitará mucho tu trabajo.\n" +
                "       (De otro color) REY HADA TE HA DADO UNA HACHA.");
        menuGoToForest.addOption(cortarMadera, cortarAction);
        menuGoToForest.addOption(yaMeArrepenti, yaMearrepentiAction);// El chiste sí es salirte, pero en realidad
        //Te mandaría al método que sería el final si abandonas el juego.

    }

    public static void atacarOgro(){
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Escúchame bien, esto es lo más importante..\n" +
                "Cada que derrotes a un ogro, obtendrás parte de su poder, lo que te ayudará a luchar\n" +
                "contra el Mago. Si logras quitar 10 puntos de su poder, podrás rescatar algunas hadas,\n" +
                "pero no te preocupes si no puedes rescatar a muchas, casi todas están con el Mago.\n\n" +
                "Ahora bien, ambos pueden atacar y defenderse, así que ten cuidado.");

    }
}

