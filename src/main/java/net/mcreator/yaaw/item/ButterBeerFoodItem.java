
package net.mcreator.yaaw.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.yaaw.itemgroup.WandsItemGroup;
import net.mcreator.yaaw.YaawElements;

@YaawElements.ModElement.Tag
public class ButterBeerFoodItem extends YaawElements.ModElement {
	@ObjectHolder("yaaw:butterbeerfood")
	public static final Item block = null;
	public ButterBeerFoodItem(YaawElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(WandsItemGroup.tab).maxStackSize(64).food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("butterbeerfood");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}
	}
}
