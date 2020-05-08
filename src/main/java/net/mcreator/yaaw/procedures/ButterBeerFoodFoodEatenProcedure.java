package net.mcreator.yaaw.procedures;

@YaawElements.ModElement.Tag
public class ButterBeerFoodFoodEatenProcedure extends YaawElements.ModElement {

	public ButterBeerFoodFoodEatenProcedure(YaawElements instance) {
		super(instance, 8);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies){
		if(dependencies.get("entity")==null){
			System.err.println("Failed to load dependency entity for procedure ButterBeerFoodFoodEaten!");
			return;
		}

            Entity entity =(Entity)dependencies.get("entity" );

		if ((==5)) {if(entity instanceof LivingEntity)
	((LivingEntity)entity).addPotionEffect(new EffectInstance(Effects.NAUSEA,(int) 15,(int) 2));}else{if ((>3)) {if(entity instanceof LivingEntity)
	((LivingEntity)entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS,(int) 4,(int) 1));}}

	}

}
