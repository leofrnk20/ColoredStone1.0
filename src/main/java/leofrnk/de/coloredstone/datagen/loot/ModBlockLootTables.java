package leofrnk.de.coloredstone.datagen.loot;

import leofrnk.de.coloredstone.ColoredStone;
import leofrnk.de.coloredstone.block.ModBlocks;
import leofrnk.de.coloredstone.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;
public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.COLORED_BLOCK.get());
        //stone ---------
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_GREEN_COLORED_STONE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE.get());
        this.dropSelf(ModBlocks.VIOLET_COLORED_STONE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE.get());
        // stone slab ---------
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.LIGHT_GREEN_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.VIOLET_COLORED_STONE_SLAB.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_SLAB.get());
        //stone stair
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.LIGHT_GREEN_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.VIOLET_COLORED_STONE_STAIR.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_STAIR.get());
        //stone wall
        this.dropSelf(ModBlocks.BLACK_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_GREEN_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.PINK_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.RED_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.VIOLET_COLORED_STONE_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_STONE_WALL.get());
        //chiseled
        this.dropSelf(ModBlocks.BLACK_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.BLUE_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.CYAN_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.GREEN_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.LIGHT_GREEN_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.ORANGE_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.PINK_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.RED_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.VIOLET_COLORED_CHISELED_STONE.get());
        this.dropSelf(ModBlocks.YELLOW_COLORED_CHISELED_STONE.get());

        this.add(ModBlocks.COLORED_ORE.get(),
            block -> coloredoredrop(ModBlocks.COLORED_ORE.get(), ModItems.COLORED.get()));
    }
    protected LootTable.Builder coloredoredrop(Block pBlock, Item item){
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F,5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
