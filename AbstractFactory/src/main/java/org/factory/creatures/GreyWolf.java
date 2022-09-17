package org.factory.creatures;

import org.factory.world.WorldBiom;
import org.springframework.stereotype.Component;

@Component
public class GreyWolf implements Wolf {

    @Override
    public int damage() {
        return 2;
    }

    @Override
    public int health() {
        return 10;
    }

    @Override
    public int viewDistance() {
        return 300;
    }

    @Override
    public WorldBiom occurrence() {
        return WorldBiom.FOREST;
    }
}
