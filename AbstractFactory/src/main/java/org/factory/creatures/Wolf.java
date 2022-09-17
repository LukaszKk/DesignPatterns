package org.factory.creatures;

import org.factory.world.WorldBiom;

public interface Wolf {

    int damage();
    int health();
    int viewDistance();
    WorldBiom occurrence();
}
