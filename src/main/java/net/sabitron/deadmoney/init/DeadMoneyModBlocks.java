
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.deadmoney.init;

import net.sabitron.deadmoney.block.SaturniteBlockBlock;
import net.sabitron.deadmoney.DeadMoneyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class DeadMoneyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DeadMoneyMod.MODID);
	public static final RegistryObject<Block> SATURNITE_BLOCK = REGISTRY.register("saturnite_block", () -> new SaturniteBlockBlock());
}
