
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.deadmoney.init;

import net.sabitron.deadmoney.item.SaturniteNuggetItem;
import net.sabitron.deadmoney.item.SaturniteIngotItem;
import net.sabitron.deadmoney.item.SaturniteDustItem;
import net.sabitron.deadmoney.item.KnifeSpearItem;
import net.sabitron.deadmoney.item.HotCosmicKnifeItem;
import net.sabitron.deadmoney.item.CosmicKnifeItem;
import net.sabitron.deadmoney.item.CleanKnifeSpearItem;
import net.sabitron.deadmoney.item.CleanCosmicKnifeItem;
import net.sabitron.deadmoney.DeadMoneyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class DeadMoneyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DeadMoneyMod.MODID);
	public static final RegistryObject<Item> SATURNITE_BLOCK = block(DeadMoneyModBlocks.SATURNITE_BLOCK);
	public static final RegistryObject<Item> SATURNITE_INGOT = REGISTRY.register("saturnite_ingot", () -> new SaturniteIngotItem());
	public static final RegistryObject<Item> SATURNITE_DUST = REGISTRY.register("saturnite_dust", () -> new SaturniteDustItem());
	public static final RegistryObject<Item> SATURNITE_NUGGET = REGISTRY.register("saturnite_nugget", () -> new SaturniteNuggetItem());
	public static final RegistryObject<Item> COSMIC_KNIFE = REGISTRY.register("cosmic_knife", () -> new CosmicKnifeItem());
	public static final RegistryObject<Item> CLEAN_COSMIC_KNIFE = REGISTRY.register("clean_cosmic_knife", () -> new CleanCosmicKnifeItem());
	public static final RegistryObject<Item> HOT_COSMIC_KNIFE = REGISTRY.register("hot_cosmic_knife", () -> new HotCosmicKnifeItem());
	public static final RegistryObject<Item> KNIFE_SPEAR = REGISTRY.register("knife_spear", () -> new KnifeSpearItem());
	public static final RegistryObject<Item> CLEAN_KNIFE_SPEAR = REGISTRY.register("clean_knife_spear", () -> new CleanKnifeSpearItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
