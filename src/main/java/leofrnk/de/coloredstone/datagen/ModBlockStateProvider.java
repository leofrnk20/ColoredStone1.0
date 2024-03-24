package leofrnk.de.coloredstone.datagen;

import leofrnk.de.coloredstone.ColoredStone;
import leofrnk.de.coloredstone.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ColoredStone.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
     //General
        blockWithItem(ModBlocks.COLORED_BLOCK);
        blockWithItem(ModBlocks.COLORED_ORE);
        // Stone
        blockWithItem(ModBlocks.BLACK_COLORED_STONE);
        blockWithItem(ModBlocks.BLUE_COLORED_STONE);
        blockWithItem(ModBlocks.CYAN_COLORED_STONE);
        blockWithItem(ModBlocks.GREEN_COLORED_STONE);
        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_STONE);
        blockWithItem(ModBlocks.LIGHT_GREEN_COLORED_STONE);
        blockWithItem(ModBlocks.ORANGE_COLORED_STONE);
        blockWithItem(ModBlocks.PINK_COLORED_STONE);
        blockWithItem(ModBlocks.RED_COLORED_STONE);
        blockWithItem(ModBlocks.VIOLET_COLORED_STONE);
        blockWithItem(ModBlocks.YELLOW_COLORED_STONE);

        //stone slab
        slabBlock(((SlabBlock) ModBlocks.BLACK_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.BLUE_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()), blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.CYAN_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()), blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.GREEN_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.GREEN_COLORED_STONE.get()),blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()),blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.LIGHT_GREEN_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.LIGHT_GREEN_COLORED_STONE.get()),blockTexture(ModBlocks.LIGHT_GREEN_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.ORANGE_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()),blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.PINK_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.PINK_COLORED_STONE.get()),blockTexture(ModBlocks.PINK_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.RED_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.RED_COLORED_STONE.get()),blockTexture(ModBlocks.RED_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.VIOLET_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.VIOLET_COLORED_STONE.get()),blockTexture(ModBlocks.VIOLET_COLORED_STONE.get()));
        slabBlock(((SlabBlock) ModBlocks.YELLOW_COLORED_STONE_SLAB.get()), blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()),blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));

        //stone stair
        stairsBlock(((StairBlock) ModBlocks.BLACK_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.BLUE_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.CYAN_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.GREEN_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.LIGHT_GREEN_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.LIGHT_GREEN_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.ORANGE_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.PINK_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.PINK_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.RED_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.RED_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.VIOLET_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.VIOLET_COLORED_STONE.get()));
        stairsBlock(((StairBlock) ModBlocks.YELLOW_COLORED_STONE_STAIR.get()),blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));
        //stone wall
        wallBlock(((WallBlock) ModBlocks.BLACK_COLORED_STONE_WALL.get()), blockTexture(ModBlocks.BLACK_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.BLUE_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.CYAN_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.CYAN_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.GREEN_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.GREEN_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.LIGHT_BLUE_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_GREEN_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.LIGHT_GREEN_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.ORANGE_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.ORANGE_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.PINK_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.PINK_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.RED_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.RED_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.YELLOW_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.YELLOW_COLORED_STONE.get()));
        wallBlock(((WallBlock) ModBlocks.VIOLET_COLORED_STONE_WALL.get()),blockTexture(ModBlocks.VIOLET_COLORED_STONE.get()));
//chiseled stone bricks ------------------------
        blockWithItem(ModBlocks.BLACK_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.BLUE_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.CYAN_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.GREEN_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.LIGHT_BLUE_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.LIGHT_GREEN_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.ORANGE_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.PINK_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.RED_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.VIOLET_COLORED_CHISELED_STONE);
        blockWithItem(ModBlocks.YELLOW_COLORED_CHISELED_STONE);
        //cobbeledstone ------------
        // cobbeledstone stair
        //cobbeledstone slab
        //cracked stone bricks ---------
        //mosssy stone bricks --------
        //smooth stone
        //smothstone slab
//stone bricks
        //stone brick slab
        //stone brick stair



    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
