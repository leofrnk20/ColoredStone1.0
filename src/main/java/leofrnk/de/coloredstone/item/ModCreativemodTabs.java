package leofrnk.de.coloredstone.item;

import leofrnk.de.coloredstone.ColoredStone;
import leofrnk.de.coloredstone.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativemodTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ColoredStone.MOD_ID);
    public static final RegistryObject<CreativeModeTab> COLOREDSTONE_TAB = CREATIVE_MODE_TABS.register("coloredstone_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.COLORED.get()))
                    .title(Component.translatable("creativetab.coloredstone_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.COLORED.get());
                        //stone------------------------------------
                        pOutput.accept(ModBlocks.BLACK_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.BLUE_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.CYAN_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.GREEN_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.LIGHT_GREEN_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.ORANGE_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.PINK_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.RED_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.VIOLET_COLORED_STONE.get());
                        pOutput.accept(ModBlocks.YELLOW_COLORED_STONE.get());

                        //stair
                        pOutput.accept(ModBlocks.BLACK_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.BLUE_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.CYAN_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.GREEN_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.LIGHT_GREEN_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.ORANGE_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.PINK_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.RED_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.VIOLET_COLORED_STONE_STAIR.get());
                        pOutput.accept(ModBlocks.YELLOW_COLORED_STONE_STAIR.get());

                        //slab
                        pOutput.accept(ModBlocks.BLACK_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.BLUE_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.CYAN_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.GREEN_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_GREEN_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.ORANGE_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.PINK_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.RED_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.VIOLET_COLORED_STONE_SLAB.get());
                        pOutput.accept(ModBlocks.YELLOW_COLORED_STONE_SLAB.get());
                        //wall

                        pOutput.accept(ModBlocks.BLACK_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.BLUE_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.CYAN_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.GREEN_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.LIGHT_GREEN_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.ORANGE_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.PINK_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.RED_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.VIOLET_COLORED_STONE_WALL.get());
                        pOutput.accept(ModBlocks.YELLOW_COLORED_STONE_WALL.get());

                        //------- CHISELED -----------
                        pOutput.accept(ModBlocks.BLACK_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.BLUE_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.CYAN_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.GREEN_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.LIGHT_GREEN_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.ORANGE_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.PINK_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.RED_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.VIOLET_COLORED_CHISELED_STONE.get());
                        pOutput.accept(ModBlocks.YELLOW_COLORED_CHISELED_STONE.get());
                        //------- GENERAL -----------

                        pOutput.accept(ModBlocks.COLORED_ORE.get());
                        pOutput.accept(ModBlocks.COLORED_BLOCK.get());


                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
