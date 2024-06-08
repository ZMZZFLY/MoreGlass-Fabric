
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package lacrus.fuck.moreglass.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import lacrus.fuck.moreglass.block.FbYellowGlassBlock;
import lacrus.fuck.moreglass.block.FbWHiteGlassBlock;
import lacrus.fuck.moreglass.block.FbTintedGlassBlock;
import lacrus.fuck.moreglass.block.FbSilverGlassBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassYellowBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassWhiteBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassTintedBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassSilverBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassRedBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassPurpleBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassPinkBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassOrangeBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassMagentaBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassLimeBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassLightblueBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassGreenBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassGrayBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassCyanBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassBrownBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassBlueBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassBlock;
import lacrus.fuck.moreglass.block.FbShadingGlassBlackBlock;
import lacrus.fuck.moreglass.block.FbRedGlassBlock;
import lacrus.fuck.moreglass.block.FbPurpleGlassBlock;
import lacrus.fuck.moreglass.block.FbPinkGlassBlock;
import lacrus.fuck.moreglass.block.FbOrangeGlassBlock;
import lacrus.fuck.moreglass.block.FbMagentaGlassBlock;
import lacrus.fuck.moreglass.block.FbLimeGlassBlock;
import lacrus.fuck.moreglass.block.FbLightblueGlassBlock;
import lacrus.fuck.moreglass.block.FbGreenGlassBlock;
import lacrus.fuck.moreglass.block.FbGlassBlock;
import lacrus.fuck.moreglass.block.FbCyanGlassBlock;
import lacrus.fuck.moreglass.block.FbCrayGlassBlock;
import lacrus.fuck.moreglass.block.FbBrownGlassBlock;
import lacrus.fuck.moreglass.block.FbBlueGlassBlock;
import lacrus.fuck.moreglass.block.FbBlackGlassBlock;
import lacrus.fuck.moreglass.MoreglassMod;

public class MoreglassModBlocks {
	public static Block FB_GLASS;
	public static Block FB_W_HITE_GLASS;
	public static Block FB_BLACK_GLASS;
	public static Block FB_BLUE_GLASS;
	public static Block FB_BROWN_GLASS;
	public static Block FB_CYAN_GLASS;
	public static Block FB_GRAY_GLASS;
	public static Block FB_GREEN_GLASS;
	public static Block FB_LIGHTBLUE_GLASS;
	public static Block FB_LIME_GLASS;
	public static Block FB_MAGENTA_GLASS;
	public static Block FB_ORANGE_GLASS;
	public static Block FB_PINK_GLASS;
	public static Block FB_PURPLE_GLASS;
	public static Block FB_RED_GLASS;
	public static Block FB_SILVER_GLASS;
	public static Block FB_YELLOW_GLASS;
	public static Block FB_TINTED_GLASS;
	public static Block FB_SHADING_GLASS;
	public static Block FB_SHADING_GLASS_WHITE;
	public static Block FB_SHADING_GLASS_BLACK;
	public static Block FB_SHADING_GLASS_BLUE;
	public static Block FB_SHADING_GLASS_BROWN;
	public static Block FB_SHADING_GLASS_CYAN;
	public static Block FB_SHADING_GLASS_GRAY;
	public static Block FB_SHADING_GLASS_GREEN;
	public static Block FB_SHADING_GLASS_LIGHTBLUE;
	public static Block FB_SHADING_GLASS_LIME;
	public static Block FB_SHADING_GLASS_MAGENTA;
	public static Block FB_SHADING_GLASS_ORANGE;
	public static Block FB_SHADING_GLASS_PINK;
	public static Block FB_SHADING_GLASS_PURPLE;
	public static Block FB_SHADING_GLASS_RED;
	public static Block FB_SHADING_GLASS_SILVER;
	public static Block FB_SHADING_GLASS_YELLOW;
	public static Block FB_SHADING_GLASS_TINTED;

	public static void load() {
		FB_GLASS = register("fb_glass", new FbGlassBlock());
		FB_W_HITE_GLASS = register("fb_w_hite_glass", new FbWHiteGlassBlock());
		FB_BLACK_GLASS = register("fb_black_glass", new FbBlackGlassBlock());
		FB_BLUE_GLASS = register("fb_blue_glass", new FbBlueGlassBlock());
		FB_BROWN_GLASS = register("fb_brown_glass", new FbBrownGlassBlock());
		FB_CYAN_GLASS = register("fb_cyan_glass", new FbCyanGlassBlock());
		FB_GRAY_GLASS = register("fb_gray_glass", new FbCrayGlassBlock());
		FB_GREEN_GLASS = register("fb_green_glass", new FbGreenGlassBlock());
		FB_LIGHTBLUE_GLASS = register("fb_lightblue_glass", new FbLightblueGlassBlock());
		FB_LIME_GLASS = register("fb_lime_glass", new FbLimeGlassBlock());
		FB_MAGENTA_GLASS = register("fb_magenta_glass", new FbMagentaGlassBlock());
		FB_ORANGE_GLASS = register("fb_orange_glass", new FbOrangeGlassBlock());
		FB_PINK_GLASS = register("fb_pink_glass", new FbPinkGlassBlock());
		FB_PURPLE_GLASS = register("fb_purple_glass", new FbPurpleGlassBlock());
		FB_RED_GLASS = register("fb_red_glass", new FbRedGlassBlock());
		FB_SILVER_GLASS = register("fb_silver_glass", new FbSilverGlassBlock());
		FB_YELLOW_GLASS = register("fb_yellow_glass", new FbYellowGlassBlock());
		FB_TINTED_GLASS = register("fb_tinted_glass", new FbTintedGlassBlock());
		FB_SHADING_GLASS = register("fb_shading_glass", new FbShadingGlassBlock());
		FB_SHADING_GLASS_WHITE = register("fb_shading_glass_white", new FbShadingGlassWhiteBlock());
		FB_SHADING_GLASS_BLACK = register("fb_shading_glass_black", new FbShadingGlassBlackBlock());
		FB_SHADING_GLASS_BLUE = register("fb_shading_glass_blue", new FbShadingGlassBlueBlock());
		FB_SHADING_GLASS_BROWN = register("fb_shading_glass_brown", new FbShadingGlassBrownBlock());
		FB_SHADING_GLASS_CYAN = register("fb_shading_glass_cyan", new FbShadingGlassCyanBlock());
		FB_SHADING_GLASS_GRAY = register("fb_shading_glass_gray", new FbShadingGlassGrayBlock());
		FB_SHADING_GLASS_GREEN = register("fb_shading_glass_green", new FbShadingGlassGreenBlock());
		FB_SHADING_GLASS_LIGHTBLUE = register("fb_shading_glass_lightblue", new FbShadingGlassLightblueBlock());
		FB_SHADING_GLASS_LIME = register("fb_shading_glass_lime", new FbShadingGlassLimeBlock());
		FB_SHADING_GLASS_MAGENTA = register("fb_shading_glass_magenta", new FbShadingGlassMagentaBlock());
		FB_SHADING_GLASS_ORANGE = register("fb_shading_glass_orange", new FbShadingGlassOrangeBlock());
		FB_SHADING_GLASS_PINK = register("fb_shading_glass_pink", new FbShadingGlassPinkBlock());
		FB_SHADING_GLASS_PURPLE = register("fb_shading_glass_purple", new FbShadingGlassPurpleBlock());
		FB_SHADING_GLASS_RED = register("fb_shading_glass_red", new FbShadingGlassRedBlock());
		FB_SHADING_GLASS_SILVER = register("fb_shading_glass_silver", new FbShadingGlassSilverBlock());
		FB_SHADING_GLASS_YELLOW = register("fb_shading_glass_yellow", new FbShadingGlassYellowBlock());
		FB_SHADING_GLASS_TINTED = register("fb_shading_glass_tinted", new FbShadingGlassTintedBlock());
	}

	public static void clientLoad() {
		FbGlassBlock.clientInit();
		FbWHiteGlassBlock.clientInit();
		FbBlackGlassBlock.clientInit();
		FbBlueGlassBlock.clientInit();
		FbBrownGlassBlock.clientInit();
		FbCyanGlassBlock.clientInit();
		FbCrayGlassBlock.clientInit();
		FbGreenGlassBlock.clientInit();
		FbLightblueGlassBlock.clientInit();
		FbLimeGlassBlock.clientInit();
		FbMagentaGlassBlock.clientInit();
		FbOrangeGlassBlock.clientInit();
		FbPinkGlassBlock.clientInit();
		FbPurpleGlassBlock.clientInit();
		FbRedGlassBlock.clientInit();
		FbSilverGlassBlock.clientInit();
		FbYellowGlassBlock.clientInit();
		FbTintedGlassBlock.clientInit();
		FbShadingGlassBlock.clientInit();
		FbShadingGlassWhiteBlock.clientInit();
		FbShadingGlassBlackBlock.clientInit();
		FbShadingGlassBlueBlock.clientInit();
		FbShadingGlassBrownBlock.clientInit();
		FbShadingGlassCyanBlock.clientInit();
		FbShadingGlassGrayBlock.clientInit();
		FbShadingGlassGreenBlock.clientInit();
		FbShadingGlassLightblueBlock.clientInit();
		FbShadingGlassLimeBlock.clientInit();
		FbShadingGlassMagentaBlock.clientInit();
		FbShadingGlassOrangeBlock.clientInit();
		FbShadingGlassPinkBlock.clientInit();
		FbShadingGlassPurpleBlock.clientInit();
		FbShadingGlassRedBlock.clientInit();
		FbShadingGlassSilverBlock.clientInit();
		FbShadingGlassYellowBlock.clientInit();
		FbShadingGlassTintedBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MoreglassMod.MODID, registryName), block);
	}
}
