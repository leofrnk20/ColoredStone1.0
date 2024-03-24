package leofrnk.de.coloredstone.datagen;

import leofrnk.de.coloredstone.ColoredStone;
import leofrnk.de.coloredstone.block.ModBlocks;
import leofrnk.de.coloredstone.item.ModItems;
import leofrnk.de.coloredstone.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.HTML;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ColoredStone.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.COLORED_BLOCK)
                .add(ModBlocks.BLACK_COLORED_STONE.get());
        // MINEABLE -------------------------------------------------------------
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                //Stone
                .add(ModBlocks.BLACK_COLORED_STONE.get(),
                        ModBlocks.BLUE_COLORED_STONE.get(),
                        ModBlocks.CYAN_COLORED_STONE.get(),
                        ModBlocks.GREEN_COLORED_STONE.get(),
                        ModBlocks.LIGHT_BLUE_COLORED_STONE.get(),
                        ModBlocks.LIGHT_GREEN_COLORED_STONE.get(),
                        ModBlocks.ORANGE_COLORED_STONE.get(),
                        ModBlocks.PINK_COLORED_STONE.get(),
                        ModBlocks.RED_COLORED_STONE.get(),
                        ModBlocks.VIOLET_COLORED_STONE.get(),
                        ModBlocks.YELLOW_COLORED_STONE.get())
                //STAIRS
                .add(ModBlocks.BLACK_COLORED_STONE_STAIR.get(),
                        ModBlocks.BLUE_COLORED_STONE_STAIR.get(),
                        ModBlocks.CYAN_COLORED_STONE_STAIR.get(),
                        ModBlocks.GREEN_COLORED_STONE_STAIR.get(),
                        ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIR.get(),
                        ModBlocks.LIGHT_GREEN_COLORED_STONE_STAIR.get(),
                        ModBlocks.ORANGE_COLORED_STONE_STAIR.get(),
                        ModBlocks.PINK_COLORED_STONE_STAIR.get(),
                        ModBlocks.RED_COLORED_STONE_STAIR.get(),
                        ModBlocks.VIOLET_COLORED_STONE_STAIR.get(),
                        ModBlocks.YELLOW_COLORED_STONE_STAIR.get())
                //SLABS
                .add(ModBlocks.BLACK_COLORED_STONE_SLAB.get(),
                        ModBlocks.BLUE_COLORED_STONE_SLAB.get(),
                        ModBlocks.CYAN_COLORED_STONE_SLAB.get(),
                        ModBlocks.GREEN_COLORED_STONE_SLAB.get(),
                        ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get(),
                        ModBlocks.LIGHT_GREEN_COLORED_STONE_SLAB.get(),
                        ModBlocks.ORANGE_COLORED_STONE_SLAB.get(),
                        ModBlocks.PINK_COLORED_STONE_SLAB.get(),
                        ModBlocks.RED_COLORED_STONE_SLAB.get(),
                        ModBlocks.VIOLET_COLORED_STONE_SLAB.get(),
                        ModBlocks.YELLOW_COLORED_STONE_SLAB.get())
                //WALLS
                .add(ModBlocks.BLACK_COLORED_STONE_WALL.get(),
                        ModBlocks.BLUE_COLORED_STONE_WALL.get(),
                        ModBlocks.CYAN_COLORED_STONE_WALL.get(),
                        ModBlocks.GREEN_COLORED_STONE_WALL.get(),
                        ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get(),
                        ModBlocks.LIGHT_GREEN_COLORED_STONE_WALL.get(),
                        ModBlocks.ORANGE_COLORED_STONE_WALL.get(),
                        ModBlocks.PINK_COLORED_STONE_WALL.get(),
                        ModBlocks.RED_COLORED_STONE_WALL.get(),
                        ModBlocks.VIOLET_COLORED_STONE_WALL.get(),
                        ModBlocks.YELLOW_COLORED_STONE_WALL.get())
                //chiseled
                .add(ModBlocks.BLACK_COLORED_CHISELED_STONE.get(),
                        ModBlocks.BLUE_COLORED_CHISELED_STONE.get(),
                        ModBlocks.CYAN_COLORED_CHISELED_STONE.get(),
                        ModBlocks.GREEN_COLORED_CHISELED_STONE.get(),
                        ModBlocks.LIGHT_BLUE_COLORED_CHISELED_STONE.get(),
                        ModBlocks.LIGHT_GREEN_COLORED_CHISELED_STONE.get(),
                        ModBlocks.ORANGE_COLORED_CHISELED_STONE.get(),
                        ModBlocks.PINK_COLORED_CHISELED_STONE.get(),
                        ModBlocks.RED_COLORED_CHISELED_STONE.get(),
                        ModBlocks.VIOLET_COLORED_CHISELED_STONE.get(),
                        ModBlocks.YELLOW_COLORED_CHISELED_STONE.get())
                //general
                .add(ModBlocks.COLORED_BLOCK.get(),
                        ModBlocks.COLORED_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE);

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL);

        // NEEDS -------------------------------------------------------------

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                //Stone
                .add(ModBlocks.BLACK_COLORED_STONE.get())
                .add(ModBlocks.RED_COLORED_STONE.get())
                //general
                .add(ModBlocks.COLORED_BLOCK.get())
                .add(ModBlocks.COLORED_ORE.get())

        ;

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.BLACK_COLORED_STONE_WALL.get(),
                        ModBlocks.BLUE_COLORED_STONE_WALL.get(),
                        ModBlocks.CYAN_COLORED_STONE_WALL.get(),
                        ModBlocks.GREEN_COLORED_STONE_WALL.get(),
                        ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get(),
                        ModBlocks.LIGHT_GREEN_COLORED_STONE_WALL.get(),
                        ModBlocks.ORANGE_COLORED_STONE_WALL.get(),
                        ModBlocks.PINK_COLORED_STONE_WALL.get(),
                        ModBlocks.RED_COLORED_STONE_WALL.get(),
                        ModBlocks.VIOLET_COLORED_STONE_WALL.get(),
                        ModBlocks.YELLOW_COLORED_STONE_WALL.get());

    }
}
