package org.factory;

import org.factory.creatures.Monsters;
import org.factory.creatures.TundraMonsters;
import org.factory.world.WorldBiom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.factory.world.Position;

@SpringBootApplication
public class Main {

    private static Player player;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        player = new Player(new Position());
        setUpWorld();
    }

    public static void setUpWorld() {
        Monsters monsters;
        if (player.getPosition().getActualBiom() == WorldBiom.TUNDRA) {
            System.out.println("Applying tundra monsters");
            monsters = new TundraMonsters();
        } else if (player.getPosition().getActualBiom() == WorldBiom.FOREST) {
            System.out.println("Applying forest monsters");
            monsters = null;
        }
        System.out.println("Done setting up world");
    }
}
