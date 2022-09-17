package org.factory.world;

public class Position {

    private WorldBiom actualBiom;

    public Position() {
        actualBiom = WorldBiom.EVEN_COUNTRY;
    }

    public Position(WorldBiom actualBiom) {
        this.actualBiom = actualBiom;
    }

    public WorldBiom getActualBiom() {
        return actualBiom;
    }
}
