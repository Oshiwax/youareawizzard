
package net.mcreator.yaaw.item;

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
			super(new Item.Properties().group(WandsItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(1).saturation(0.3f).setAlwaysEdible()

							.build()));
			setRegistryName("butterbeerfood");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);

				ButterBeerFoodFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}

	}

}
