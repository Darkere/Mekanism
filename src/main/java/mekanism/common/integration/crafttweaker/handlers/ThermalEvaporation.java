package mekanism.common.integration.crafttweaker.handlers;

import com.blamejared.crafttweaker.api.annotations.ZenRegister;
import com.blamejared.crafttweaker.api.item.IIngredient;
import mekanism.common.Mekanism;
import mekanism.common.integration.crafttweaker.CrafttweakerIntegration;
import mekanism.common.integration.crafttweaker.helpers.IngredientHelper;
import mekanism.common.integration.crafttweaker.util.AddMekanismRecipe;
import mekanism.common.integration.crafttweaker.util.IngredientWrapper;
import mekanism.common.integration.crafttweaker.util.RemoveAllMekanismRecipe;
import mekanism.common.integration.crafttweaker.util.RemoveMekanismRecipe;
import mekanism.common.recipe.RecipeHandler.Recipe;
import mekanism.common.recipe.machines.ThermalEvaporationRecipe;
import mekanism.common.temporary.ILiquidStack;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mekanism.thermal_evaporation")
public class ThermalEvaporation {

    public static final String NAME = Mekanism.MOD_NAME + " Solar Evaporation";

    @ZenCodeType.Method
    public static void addRecipe(ILiquidStack liquidInput, ILiquidStack liquidOutput) {
        if (IngredientHelper.checkNotNull(NAME, liquidInput, liquidOutput)) {
            CrafttweakerIntegration.LATE_ADDITIONS.add(new AddMekanismRecipe<>(NAME, Recipe.THERMAL_EVAPORATION_PLANT,
                  new ThermalEvaporationRecipe(IngredientHelper.toFluid(liquidInput), IngredientHelper.toFluid(liquidOutput))));
        }
    }

    @ZenCodeType.Method
    public static void removeRecipe(IIngredient liquidInput, @ZenCodeType.Optional IIngredient liquidOutput) {
        if (IngredientHelper.checkNotNull(NAME, liquidInput)) {
            CrafttweakerIntegration.LATE_REMOVALS.add(new RemoveMekanismRecipe<>(NAME, Recipe.THERMAL_EVAPORATION_PLANT, new IngredientWrapper(liquidOutput),
                  new IngredientWrapper(liquidInput)));
        }
    }

    @ZenCodeType.Method
    public static void removeAllRecipes() {
        CrafttweakerIntegration.LATE_REMOVALS.add(new RemoveAllMekanismRecipe<>(NAME, Recipe.THERMAL_EVAPORATION_PLANT));
    }
}