package leofrnk.de.coloredstone.item;

import leofrnk.de.coloredstone.ColoredStone;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ColoredStone.MOD_ID);
    public static final RegistryObject<Item> CBRUSH = ITEMS.register("cbrush",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COLORED = ITEMS.register("colored",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
