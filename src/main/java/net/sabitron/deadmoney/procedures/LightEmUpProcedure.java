package net.sabitron.deadmoney.procedures;

import net.minecraft.world.entity.Entity;

public class LightEmUpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
