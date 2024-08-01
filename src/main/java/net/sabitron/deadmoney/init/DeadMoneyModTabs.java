
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.deadmoney.init;

import net.sabitron.deadmoney.DeadMoneyMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DeadMoneyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DeadMoneyMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(DeadMoneyModBlocks.SATURNITE_BLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(DeadMoneyModItems.COSMIC_KNIFE.get());
			tabData.accept(DeadMoneyModItems.CLEAN_COSMIC_KNIFE.get());
			tabData.accept(DeadMoneyModItems.HOT_COSMIC_KNIFE.get());
			tabData.accept(DeadMoneyModItems.KNIFE_SPEAR.get());
			tabData.accept(DeadMoneyModItems.CLEAN_KNIFE_SPEAR.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(DeadMoneyModItems.SATURNITE_INGOT.get());
			tabData.accept(DeadMoneyModItems.SATURNITE_DUST.get());
			tabData.accept(DeadMoneyModItems.SATURNITE_NUGGET.get());
		}
	}
}
