package org.factory;

import org.factory.world.Position;

public class Player {

    private Position position;

    public Player(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
