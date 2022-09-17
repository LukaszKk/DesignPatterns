package org.factory.creatures;

import org.factory.world.WorldBiom;
import org.springframework.stereotype.Component;

@Component
public class PolarWolf implements Wolf {

    @Override
    public int damage() {
        return 3;
    }

    @Override
    public int health() {
        return 15;
    }

    @Override
    public int viewDistance() {
        return 320;
    }

    @Override
    public WorldBiom occurrence() {
        return WorldBiom.TUNDRA;
    }
}
