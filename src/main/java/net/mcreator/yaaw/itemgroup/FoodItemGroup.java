
package net.mcreator.yaaw.itemgroup;

@YaawElements.ModElement.Tag
public class FoodItemGroup extends YaawElements.ModElement {

	public FoodItemGroup(YaawElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabfood") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ButterBeerBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
