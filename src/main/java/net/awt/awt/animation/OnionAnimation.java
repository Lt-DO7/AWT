package net.awt.awt.animation;

import loqor.ait.core.blockentities.ExteriorBlockEntity;
import loqor.ait.core.blocks.ExteriorBlock;
import loqor.ait.core.tardis.Tardis;
import loqor.ait.core.tardis.animation.ExteriorAnimation;
import loqor.ait.core.tardis.handler.travel.TravelHandler;
import loqor.ait.core.tardis.handler.travel.TravelHandlerBase;

public class OnionAnimation extends ExteriorAnimation {
	public OnionAnimation(ExteriorBlockEntity exterior) {
		super(exterior);
	}

	@Override
	public void tick(Tardis tardis) {
		TravelHandler travel = tardis.travel();
		TravelHandlerBase.State state = travel.getState();
		if (this.timeLeft < 0) {
			this.setupAnimation(state);
		}

		this.timeLeft--;
	}

	public static boolean isOnion(ExteriorBlockEntity exterior) {
		return exterior.getAnimation() instanceof OnionAnimation;
	}
}
