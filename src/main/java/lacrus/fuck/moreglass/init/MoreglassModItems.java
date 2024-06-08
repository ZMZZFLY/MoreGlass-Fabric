/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package lacrus.fuck.moreglass.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import lacrus.fuck.moreglass.MoreglassMod;

public class MoreglassModItems {
	public static Item FB_GLASS;
	public static Item FB_W_HITE_GLASS;
	public static Item FB_BLACK_GLASS;
	public static Item FB_BLUE_GLASS;
	public static Item FB_BROWN_GLASS;
	public static Item FB_CYAN_GLASS;
	public static Item FB_GRAY_GLASS;
	public static Item FB_GREEN_GLASS;
	public static Item FB_LIGHTBLUE_GLASS;
	public static Item FB_LIME_GLASS;
	public static Item FB_MAGENTA_GLASS;
	public static Item FB_ORANGE_GLASS;
	public static Item FB_PINK_GLASS;
	public static Item FB_PURPLE_GLASS;
	public static Item FB_RED_GLASS;
	public static Item FB_SILVER_GLASS;
	public static Item FB_YELLOW_GLASS;
	public static Item FB_TINTED_GLASS;
	public static Item FB_SHADING_GLASS;
	public static Item FB_SHADING_GLASS_WHITE;
	public static Item FB_SHADING_GLASS_BLACK;
	public static Item FB_SHADING_GLASS_BLUE;
	public static Item FB_SHADING_GLASS_BROWN;
	public static Item FB_SHADING_GLASS_CYAN;
	public static Item FB_SHADING_GLASS_GRAY;
	public static Item FB_SHADING_GLASS_GREEN;
	public static Item FB_SHADING_GLASS_LIGHTBLUE;
	public static Item FB_SHADING_GLASS_LIME;
	public static Item FB_SHADING_GLASS_MAGENTA;
	public static Item FB_SHADING_GLASS_ORANGE;
	public static Item FB_SHADING_GLASS_PINK;
	public static Item FB_SHADING_GLASS_PURPLE;
	public static Item FB_SHADING_GLASS_RED;
	public static Item FB_SHADING_GLASS_SILVER;
	public static Item FB_SHADING_GLASS_YELLOW;
	public static Item FB_SHADING_GLASS_TINTED;

	public static void load() {
		FB_GLASS = register("fb_glass", new BlockItem(MoreglassModBlocks.FB_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_GLASS));
		FB_W_HITE_GLASS = register("fb_w_hite_glass", new BlockItem(MoreglassModBlocks.FB_W_HITE_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_W_HITE_GLASS));
		FB_BLACK_GLASS = register("fb_black_glass", new BlockItem(MoreglassModBlocks.FB_BLACK_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_BLACK_GLASS));
		FB_BLUE_GLASS = register("fb_blue_glass", new BlockItem(MoreglassModBlocks.FB_BLUE_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_BLUE_GLASS));
		FB_BROWN_GLASS = register("fb_brown_glass", new BlockItem(MoreglassModBlocks.FB_BROWN_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_BROWN_GLASS));
		FB_CYAN_GLASS = register("fb_cyan_glass", new BlockItem(MoreglassModBlocks.FB_CYAN_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_CYAN_GLASS));
		FB_GRAY_GLASS = register("fb_gray_glass", new BlockItem(MoreglassModBlocks.FB_GRAY_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_GRAY_GLASS));
		FB_GREEN_GLASS = register("fb_green_glass", new BlockItem(MoreglassModBlocks.FB_GREEN_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_GREEN_GLASS));
		FB_LIGHTBLUE_GLASS = register("fb_lightblue_glass", new BlockItem(MoreglassModBlocks.FB_LIGHTBLUE_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_LIGHTBLUE_GLASS));
		FB_LIME_GLASS = register("fb_lime_glass", new BlockItem(MoreglassModBlocks.FB_LIME_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_LIME_GLASS));
		FB_MAGENTA_GLASS = register("fb_magenta_glass", new BlockItem(MoreglassModBlocks.FB_MAGENTA_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_MAGENTA_GLASS));
		FB_ORANGE_GLASS = register("fb_orange_glass", new BlockItem(MoreglassModBlocks.FB_ORANGE_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_ORANGE_GLASS));
		FB_PINK_GLASS = register("fb_pink_glass", new BlockItem(MoreglassModBlocks.FB_PINK_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_PINK_GLASS));
		FB_PURPLE_GLASS = register("fb_purple_glass", new BlockItem(MoreglassModBlocks.FB_PURPLE_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_PURPLE_GLASS));
		FB_RED_GLASS = register("fb_red_glass", new BlockItem(MoreglassModBlocks.FB_RED_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_RED_GLASS));
		FB_SILVER_GLASS = register("fb_silver_glass", new BlockItem(MoreglassModBlocks.FB_SILVER_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SILVER_GLASS));
		FB_YELLOW_GLASS = register("fb_yellow_glass", new BlockItem(MoreglassModBlocks.FB_YELLOW_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_YELLOW_GLASS));
		FB_TINTED_GLASS = register("fb_tinted_glass", new BlockItem(MoreglassModBlocks.FB_TINTED_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_TINTED_GLASS));
		FB_SHADING_GLASS = register("fb_shading_glass", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS));
		FB_SHADING_GLASS_WHITE = register("fb_shading_glass_white", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_WHITE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_WHITE));
		FB_SHADING_GLASS_BLACK = register("fb_shading_glass_black", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_BLACK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_BLACK));
		FB_SHADING_GLASS_BLUE = register("fb_shading_glass_blue", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_BLUE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_BLUE));
		FB_SHADING_GLASS_BROWN = register("fb_shading_glass_brown", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_BROWN, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_BROWN));
		FB_SHADING_GLASS_CYAN = register("fb_shading_glass_cyan", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_CYAN, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_CYAN));
		FB_SHADING_GLASS_GRAY = register("fb_shading_glass_gray", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_GRAY, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_GRAY));
		FB_SHADING_GLASS_GREEN = register("fb_shading_glass_green", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_GREEN, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_GREEN));
		FB_SHADING_GLASS_LIGHTBLUE = register("fb_shading_glass_lightblue", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_LIGHTBLUE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_LIGHTBLUE));
		FB_SHADING_GLASS_LIME = register("fb_shading_glass_lime", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_LIME, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_LIME));
		FB_SHADING_GLASS_MAGENTA = register("fb_shading_glass_magenta", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_MAGENTA, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_MAGENTA));
		FB_SHADING_GLASS_ORANGE = register("fb_shading_glass_orange", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_ORANGE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_ORANGE));
		FB_SHADING_GLASS_PINK = register("fb_shading_glass_pink", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_PINK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_PINK));
		FB_SHADING_GLASS_PURPLE = register("fb_shading_glass_purple", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_PURPLE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_PURPLE));
		FB_SHADING_GLASS_RED = register("fb_shading_glass_red", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_RED, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_RED));
		FB_SHADING_GLASS_SILVER = register("fb_shading_glass_silver", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_SILVER, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_SILVER));
		FB_SHADING_GLASS_YELLOW = register("fb_shading_glass_yellow", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_YELLOW, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_YELLOW));
		FB_SHADING_GLASS_TINTED = register("fb_shading_glass_tinted", new BlockItem(MoreglassModBlocks.FB_SHADING_GLASS_TINTED, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MoreglassModTabs.TAB_MORE_GLASS).register(content -> content.accept(FB_SHADING_GLASS_TINTED));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MoreglassMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
