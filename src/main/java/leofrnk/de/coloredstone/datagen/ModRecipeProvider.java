package leofrnk.de.coloredstone.datagen;

import leofrnk.de.coloredstone.ColoredStone;
import leofrnk.de.coloredstone.block.ModBlocks;
import leofrnk.de.coloredstone.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;

import java.util.Iterator;
import java.util.List;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;


public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> COLORED_SMELLABLE = List.of(ModItems.COLORED.get(),
            ModBlocks.COLORED_ORE.get());
    //Stone
    private static final List<ItemLike> C_Stone = List.of(
            ModBlocks.BLACK_COLORED_STONE.get(),
            ModBlocks.BLUE_COLORED_STONE.get(),
            ModBlocks.CYAN_COLORED_STONE.get(),
            ModBlocks.GREEN_COLORED_STONE.get(),
            ModBlocks.LIGHT_BLUE_COLORED_STONE.get(),
            ModBlocks.LIGHT_GREEN_COLORED_STONE.get(),
            ModBlocks.ORANGE_COLORED_STONE.get(),
            ModBlocks.PINK_COLORED_STONE.get(),
            ModBlocks.RED_COLORED_STONE.get(),
            ModBlocks.VIOLET_COLORED_STONE.get(),
            ModBlocks.YELLOW_COLORED_STONE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        oreSmelting(recipeOutput, COLORED_SMELLABLE, RecipeCategory.MISC, ModItems.COLORED.get(), 0.25f, 200, "colored");
        oreBlasting(recipeOutput, COLORED_SMELLABLE, RecipeCategory.MISC, ModItems.COLORED.get(), 0.25f, 100, "colored");
        oreSmelting(recipeOutput, C_Stone, RecipeCategory.MISC, Blocks.STONE, 0.25f, 5, "colored");
        oreBlasting(recipeOutput, C_Stone, RecipeCategory.MISC, Blocks.STONE, 0.25f, 5, "colored");





        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COLORED_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        // STONE _----------____---__--__---__--_--_-_-__-_-_---------______---_________________________________
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S',Blocks.STONE)
                .define('#', Items.BLACK_DYE )
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S',Blocks.STONE)
                .define('#', Items.BLUE_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.CYAN_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.GREEN_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.LIGHT_BLUE_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GREEN_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.LIME_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.ORANGE_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.PINK_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.RED_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VIOLET_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.PURPLE_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE.get())
                .pattern(" # ")
                .pattern(" C ")
                .pattern(" S ")
                .define('S', Blocks.STONE)
                .define('#', Items.YELLOW_DYE)
                .define('C',ModItems.COLORED.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        // STONE WALL -------------------------------------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.BLACK_COLORED_STONE .get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.BLUE_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.CYAN_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.GREEN_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.LIGHT_BLUE_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GREEN_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.LIGHT_GREEN_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.ORANGE_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.PINK_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.RED_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VIOLET_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.VIOLET_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_WALL.get(),6)
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.YELLOW_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        //----------------------SLAB---------------------------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.BLACK_COLORED_STONE .get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.BLUE_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.CYAN_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.GREEN_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.LIGHT_BLUE_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GREEN_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.LIGHT_GREEN_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.ORANGE_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.PINK_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.RED_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VIOLET_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.VIOLET_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_SLAB.get(),6)
                .pattern("###")
                .define('#', ModBlocks.YELLOW_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        //STAIR _____>_>_>_>__>_>_____----------------
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.BLACK_COLORED_STONE .get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.BLUE_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.CYAN_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.GREEN_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.LIGHT_BLUE_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GREEN_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.LIGHT_GREEN_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.ORANGE_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.PINK_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.RED_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VIOLET_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.VIOLET_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_COLORED_STONE_STAIR.get(),4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ModBlocks.YELLOW_COLORED_STONE.get())
                .unlockedBy(getHasName(ModItems.COLORED.get()), has(ModItems.COLORED.get()))
                .save(recipeOutput);
        // -------------------------------------------------------

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COLORED.get(), 9)
                .requires(ModBlocks.COLORED_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.COLORED_BLOCK.get()), has(ModBlocks.COLORED_BLOCK.get()))
                .save(recipeOutput);
    }





    protected static void oreSmelting(RecipeOutput p_300202_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_300202_, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }


    protected static void oreBlasting(RecipeOutput p_298528_, List<ItemLike> p_251504_, RecipeCategory p_248846_, ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_298528_, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_, p_251984_, "_from_blasting");
    }


    private static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput p_297621_, RecipeSerializer<T> p_251817_, AbstractCookingRecipe.Factory<T> p_312098_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        Iterator var10 = p_249619_.iterator();

        while(var10.hasNext()) {
            ItemLike itemlike = (ItemLike)var10.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_, p_312098_).group(p_251450_).unlockedBy(getHasName(itemlike), has(itemlike)).save(p_297621_, getItemName(p_250066_) + p_249236_ + "_" + getItemName(itemlike));
        }

    }
}











