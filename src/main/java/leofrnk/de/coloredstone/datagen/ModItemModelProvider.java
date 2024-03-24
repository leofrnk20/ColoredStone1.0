package leofrnk.de.coloredstone.datagen;

import leofrnk.de.coloredstone.ColoredStone;
import leofrnk.de.coloredstone.block.ModBlocks;
import leofrnk.de.coloredstone.item.ModFoods;
import leofrnk.de.coloredstone.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ColoredStone.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        simpleItem(ModItems.CBRUSH);
        simpleItem(ModItems.COLORED);


        evenSimplerBlockItem(ModBlocks.BLACK_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.BLACK_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.BLUE_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.BLUE_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.CYAN_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.CYAN_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.GREEN_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.GREEN_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.LIGHT_GREEN_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.LIGHT_GREEN_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.ORANGE_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.ORANGE_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.PINK_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.PINK_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.RED_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.RED_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.VIOLET_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.VIOLET_COLORED_STONE_STAIR);
        evenSimplerBlockItem(ModBlocks.YELLOW_COLORED_STONE_SLAB);
        evenSimplerBlockItem(ModBlocks.YELLOW_COLORED_STONE_STAIR);


        wallItem(ModBlocks.BLACK_COLORED_STONE_WALL, ModBlocks.BLACK_COLORED_STONE);
        wallItem(ModBlocks.BLUE_COLORED_STONE_WALL, ModBlocks.BLUE_COLORED_STONE);
        wallItem(ModBlocks.CYAN_COLORED_STONE_WALL, ModBlocks.CYAN_COLORED_STONE);
        wallItem(ModBlocks.GREEN_COLORED_STONE_WALL, ModBlocks.GREEN_COLORED_STONE);
        wallItem(ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL, ModBlocks.LIGHT_BLUE_COLORED_STONE);
        wallItem(ModBlocks.LIGHT_GREEN_COLORED_STONE_WALL, ModBlocks.LIGHT_GREEN_COLORED_STONE);
        wallItem(ModBlocks.ORANGE_COLORED_STONE_WALL, ModBlocks.ORANGE_COLORED_STONE);
        wallItem(ModBlocks.PINK_COLORED_STONE_WALL, ModBlocks.PINK_COLORED_STONE);
        wallItem(ModBlocks.RED_COLORED_STONE_WALL, ModBlocks.RED_COLORED_STONE);
        wallItem(ModBlocks.VIOLET_COLORED_STONE_WALL, ModBlocks.VIOLET_COLORED_STONE);
        wallItem(ModBlocks.YELLOW_COLORED_STONE_WALL, ModBlocks.YELLOW_COLORED_STONE);

    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ColoredStone.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(ColoredStone.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(ColoredStone.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(ColoredStone.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(ColoredStone.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ColoredStone.MOD_ID,"item/" + item.getId().getPath()));
    }
}
