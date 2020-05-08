package net.mcreator.yaaw.procedures;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.yaaw.YaawVariables;
import net.mcreator.yaaw.YaawElements;

@YaawElements.ModElement.Tag
public class ButterBeerFoodFoodEatenProcedure extends YaawElements.ModElement {
	public ButterBeerFoodFoodEatenProcedure(YaawElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ButterBeerFoodFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ButterBeerFoodFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		YaawVariables.MapVariables.get(world).bu = (double) ((YaawVariables.MapVariables.get(world).bu) + 1);
		YaawVariables.MapVariables.get(world).syncData(world);
		if (((YaawVariables.MapVariables.get(world).bu) == 5)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 15, (int) 2));
		} else {
			if (((YaawVariables.MapVariables.get(world).bu) > 3)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 4, (int) 1));
			}
		}
	}
}
