package mekanism.api.datagen.recipe.builder;

import com.google.gson.JsonObject;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import mcp.MethodsReturnNonnullByDefault;
import mekanism.api.MekanismAPI;
import mekanism.api.SerializerHelper;
import mekanism.api.annotations.FieldsAreNonnullByDefault;
import mekanism.api.chemical.gas.GasStack;
import mekanism.api.datagen.recipe.MekanismRecipeBuilder;
import mekanism.api.recipes.inputs.FluidStackIngredient;
import net.minecraft.util.ResourceLocation;

@FieldsAreNonnullByDefault
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class ElectrolysisRecipeBuilder extends MekanismRecipeBuilder<ElectrolysisRecipeBuilder> {

    private final FluidStackIngredient input;
    private final GasStack leftGasOutput;
    private final GasStack rightGasOutput;
    private double energyMultiplier = 1;

    protected ElectrolysisRecipeBuilder(FluidStackIngredient input, GasStack leftGasOutput, GasStack rightGasOutput) {
        super(new ResourceLocation(MekanismAPI.MEKANISM_MODID, "separating"));
        this.input = input;
        this.leftGasOutput = leftGasOutput;
        this.rightGasOutput = rightGasOutput;
    }

    public static ElectrolysisRecipeBuilder separating(FluidStackIngredient input, GasStack leftGasOutput, GasStack rightGasOutput) {
        if (leftGasOutput.isEmpty() || rightGasOutput.isEmpty()) {
            throw new IllegalArgumentException("This separating recipe requires non empty gas outputs.");
        }
        return new ElectrolysisRecipeBuilder(input, leftGasOutput, rightGasOutput);
    }

    public ElectrolysisRecipeBuilder energyMultiplier(double multiplier) {
        if (multiplier < 1) {
            throw new IllegalArgumentException("Energy multiplier must be greater than or equal to one");
        }
        this.energyMultiplier = multiplier;
        return this;
    }

    @Override
    protected ElectrolysisRecipeResult getResult(ResourceLocation id) {
        return new ElectrolysisRecipeResult(id);
    }

    public class ElectrolysisRecipeResult extends RecipeResult {

        protected ElectrolysisRecipeResult(ResourceLocation id) {
            super(id);
        }

        @Override
        public void serialize(@Nonnull JsonObject json) {
            json.add("input", input.serialize());
            if (energyMultiplier > 1) {
                //Only add energy usage if it is greater than one, as otherwise it will default to one
                json.addProperty("energyMultiplier", energyMultiplier);
            }
            json.add("leftGasOutput", SerializerHelper.serializeGasStack(leftGasOutput));
            json.add("rightGasOutput", SerializerHelper.serializeGasStack(rightGasOutput));
        }
    }
}