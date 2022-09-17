package org.factory.creatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TundraMonsters implements Monsters {

    @Autowired
    @Qualifier("greyWolf")
    Wolf wolf;

    @Override
    public Wolf createWolf() {
        return wolf;
    }
}
