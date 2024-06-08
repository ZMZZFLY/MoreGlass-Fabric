
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package lacrus.fuck.moreglass.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import lacrus.fuck.moreglass.MoreglassMod;

public class MoreglassModTabs {
	public static ResourceKey<CreativeModeTab> TAB_MORE_GLASS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MoreglassMod.MODID, "more_glass"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_MORE_GLASS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + MoreglassMod.MODID + ".more_glass")).icon(() -> new ItemStack(MoreglassModBlocks.FB_GLASS)).build());
	}
}
