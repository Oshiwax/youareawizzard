package net.mcreator.yaaw.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.yaaw.item.ButterBeerFoodItem;
import net.mcreator.yaaw.YaawElements;

@YaawElements.ModElement.Tag
public class ButterBeerOnBlockRightClickedProcedure extends YaawElements.ModElement {
	public ButterBeerOnBlockRightClickedProcedure(YaawElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ButterBeerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ButterBeerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ButterBeerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ButterBeerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ButterBeerOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(ButterBeerFoodItem.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
