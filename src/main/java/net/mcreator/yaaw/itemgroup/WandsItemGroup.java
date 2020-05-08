
package net.mcreator.yaaw.itemgroup;

@YaawElements.ModElement.Tag
public class WandsItemGroup extends YaawElements.ModElement {

	public WandsItemGroup(YaawElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwands") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.STICK, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
