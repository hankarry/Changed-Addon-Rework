package net.foxyas.changedaddon.procedures;

import net.minecraft.world.entity.Entity;

import net.foxyas.changedaddon.network.ChangedAddonModVariables;

public class CooldownResetProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(ChangedAddonModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ChangedAddonModVariables.PlayerVariables())).act_cooldown == true) {
			return true;
		}
		return false;
	}
}
