
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.foxyas.changedaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.foxyas.changedaddon.block.entity.UnifuserBlockEntity;
import net.foxyas.changedaddon.block.entity.InformantblockBlockEntity;
import net.foxyas.changedaddon.block.entity.GeneratorBlockEntity;
import net.foxyas.changedaddon.block.entity.DarklatexpuddleBlockEntity;
import net.foxyas.changedaddon.block.entity.CatlyzerBlockEntity;
import net.foxyas.changedaddon.ChangedAddonMod;

public class ChangedAddonModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ChangedAddonMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CATLYZER = register("catlyzer", ChangedAddonModBlocks.CATLYZER, CatlyzerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> UNIFUSER = register("unifuser", ChangedAddonModBlocks.UNIFUSER, UnifuserBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARKLATEXPUDDLE = register("darklatexpuddle", ChangedAddonModBlocks.DARKLATEXPUDDLE, DarklatexpuddleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INFORMANTBLOCK = register("informantblock", ChangedAddonModBlocks.INFORMANTBLOCK, InformantblockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GENERATOR = register("generator", ChangedAddonModBlocks.GENERATOR, GeneratorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
