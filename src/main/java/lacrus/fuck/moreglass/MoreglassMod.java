/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package lacrus.fuck.moreglass;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import lacrus.fuck.moreglass.init.MoreglassModTabs;
import lacrus.fuck.moreglass.init.MoreglassModItems;
import lacrus.fuck.moreglass.init.MoreglassModBlocks;

public class MoreglassMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "moreglass";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MoreglassMod");

		MoreglassModTabs.load();

		MoreglassModBlocks.load();
		MoreglassModItems.load();

	}
}
