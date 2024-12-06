package net.awt.awt.animation;

import loqor.ait.core.blockentities.ExteriorBlockEntity;
import loqor.ait.core.tardis.Tardis;
import loqor.ait.core.tardis.animation.ExteriorAnimation;
import loqor.ait.core.tardis.handler.travel.TravelHandler;
import loqor.ait.core.tardis.handler.travel.TravelHandlerBase;

public class LegoAnimation extends ExteriorAnimation {
    public LegoAnimation(ExteriorBlockEntity exterior) {
        super(exterior);
    }

    @Override
    public void tick(Tardis tardis) {
        TravelHandler travel = tardis.travel();
        TravelHandlerBase.State state = travel.getState();

        // Example animation logic based on the travel state
        if (this.timeLeft < 0) {
            this.setupAnimation(state);
        }

        // Decrement the time left for the animation
        this.timeLeft--;
    }

    public static boolean isLego(ExteriorBlockEntity exterior) {
        return exterior.getAnimation() instanceof LegoAnimation;
    }
}