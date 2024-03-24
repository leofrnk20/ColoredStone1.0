package leofrnk.de.coloredstone.block;

import leofrnk.de.coloredstone.ColoredStone;
import leofrnk.de.coloredstone.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ColoredStone.MOD_ID);
// Stone ---------------------------------------------------------------------
    public static final RegistryObject<Block> BLACK_COLORED_STONE = registetrBlock("black_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> BLUE_COLORED_STONE = registetrBlock("blue_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> CYAN_COLORED_STONE = registetrBlock("cyan_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> GREEN_COLORED_STONE = registetrBlock("green_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE = registetrBlock("light_blue_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> LIGHT_GREEN_COLORED_STONE = registetrBlock("light_green_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> ORANGE_COLORED_STONE = registetrBlock("orange_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> PINK_COLORED_STONE = registetrBlock("pink_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> RED_COLORED_STONE = registetrBlock("red_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> VIOLET_COLORED_STONE = registetrBlock("violet_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> YELLOW_COLORED_STONE = registetrBlock("yellow_colored_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.YELLOW)));


    //stone stair
    public static final RegistryObject<Block> BLACK_COLORED_STONE_STAIR = registetrBlock("black_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.BLACK_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final RegistryObject<Block>BLUE_COLORED_STONE_STAIR = registetrBlock("blue_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.BLUE_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final RegistryObject<Block>CYAN_COLORED_STONE_STAIR = registetrBlock("cyan_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.CYAN_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
        public static final RegistryObject<Block>GREEN_COLORED_STONE_STAIR = registetrBlock("green_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.GREEN_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
       public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_STAIR = registetrBlock("light_blue_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.LIGHT_BLUE_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
       public static final RegistryObject<Block> LIGHT_GREEN_COLORED_STONE_STAIR = registetrBlock("light_green_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.LIGHT_GREEN_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
       public static final RegistryObject<Block> ORANGE_COLORED_STONE_STAIR = registetrBlock("orange_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.ORANGE_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
       public static final RegistryObject<Block> PINK_COLORED_STONE_STAIR = registetrBlock("pink_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.PINK_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
       public static final RegistryObject<Block> RED_COLORED_STONE_STAIR = registetrBlock("red_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.RED_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
       public static final RegistryObject<Block> VIOLET_COLORED_STONE_STAIR = registetrBlock("violet_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.VIOLET_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
       public static final RegistryObject<Block> YELLOW_COLORED_STONE_STAIR = registetrBlock("yellow_colored_stone_stair",
            ()-> new StairBlock(ModBlocks.YELLOW_COLORED_STONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    //stone slab-------------.-------------------/jsdkfdgahfjahsfjashfsa
    public static final RegistryObject<Block> BLACK_COLORED_STONE_SLAB = registetrBlock("black_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> BLUE_COLORED_STONE_SLAB = registetrBlock("blue_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> CYAN_COLORED_STONE_SLAB = registetrBlock("cyan_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> GREEN_COLORED_STONE_SLAB = registetrBlock("green_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_SLAB = registetrBlock("light_blue_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> LIGHT_GREEN_COLORED_STONE_SLAB = registetrBlock("light_green_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> ORANGE_COLORED_STONE_SLAB = registetrBlock("orange_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> PINK_COLORED_STONE_SLAB = registetrBlock("pink_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> RED_COLORED_STONE_SLAB = registetrBlock("red_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> VIOLET_COLORED_STONE_SLAB = registetrBlock("violet_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> YELLOW_COLORED_STONE_SLAB = registetrBlock("yellow_colored_stone_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.YELLOW)));

    //stone wall
    public static final RegistryObject<Block> BLACK_COLORED_STONE_WALL = registetrBlock("black_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> BLUE_COLORED_STONE_WALL = registetrBlock("blue_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> CYAN_COLORED_STONE_WALL = registetrBlock("cyan_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> GREEN_COLORED_STONE_WALL = registetrBlock("green_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_STONE_WALL = registetrBlock("light_blue_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> LIGHT_GREEN_COLORED_STONE_WALL = registetrBlock("light_green_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> ORANGE_COLORED_STONE_WALL = registetrBlock("orange_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> PINK_COLORED_STONE_WALL = registetrBlock("pink_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> RED_COLORED_STONE_WALL = registetrBlock("red_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> VIOLET_COLORED_STONE_WALL = registetrBlock("violet_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> YELLOW_COLORED_STONE_WALL = registetrBlock("yellow_colored_stone_wall",
            ()-> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.YELLOW)));

//chiseled stone bricks ------------------------
public static final RegistryObject<Block> BLACK_COLORED_CHISELED_STONE = registetrBlock("black_colored_chiseled_stone",
        ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.BLACK)));
    public static final RegistryObject<Block> BLUE_COLORED_CHISELED_STONE = registetrBlock("blue_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.BLUE)));
    public static final RegistryObject<Block> CYAN_COLORED_CHISELED_STONE = registetrBlock("cyan_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.CYAN)));
    public static final RegistryObject<Block> GREEN_COLORED_CHISELED_STONE = registetrBlock("green_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> LIGHT_BLUE_COLORED_CHISELED_STONE = registetrBlock("light_blue_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.LIGHT_BLUE)));
    public static final RegistryObject<Block> LIGHT_GREEN_COLORED_CHISELED_STONE = registetrBlock("light_green_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.GREEN)));
    public static final RegistryObject<Block> ORANGE_COLORED_CHISELED_STONE = registetrBlock("orange_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.ORANGE)));
    public static final RegistryObject<Block> PINK_COLORED_CHISELED_STONE = registetrBlock("pink_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> RED_COLORED_CHISELED_STONE = registetrBlock("red_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.RED)));
    public static final RegistryObject<Block> VIOLET_COLORED_CHISELED_STONE = registetrBlock("violet_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.LIME)));
    public static final RegistryObject<Block> YELLOW_COLORED_CHISELED_STONE = registetrBlock("yellow_colored_chiseled_stone",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(DyeColor.YELLOW)));

    //cobbeledstone ------------
    // cobbeledstone stair
    //cobbeledstone slab
    //cobbeled wall
    //cracked stone bricks ---------
    //mosssy stone bricks --------
    //smooth stone
    //smothstone slab
//stone bricks
    //stone brick slab
    //stone brick stair
    //stone brick wall




// ---------------------------------------------------------------------------------------

    public static final RegistryObject<Block> COLORED_ORE = registetrBlock("colored_ore",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).mapColor(DyeColor.PINK)));
    public static final RegistryObject<Block> COLORED_BLOCK = registetrBlock("colored_block",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).mapColor(DyeColor.PINK)));







    private static <T extends Block> RegistryObject<T> registetrBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
