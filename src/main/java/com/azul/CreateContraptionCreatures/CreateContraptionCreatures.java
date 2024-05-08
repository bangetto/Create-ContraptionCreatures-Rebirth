package com.azul.CreateContraptionCreatures;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.azul.CreateContraptionCreatures.block.ModBlocks;
import com.azul.CreateContraptionCreatures.entity.ModEntity;
import com.azul.CreateContraptionCreatures.entity.custom.Gatherers.AutoDrillerEntity;
import com.azul.CreateContraptionCreatures.entity.custom.Gatherers.AutoLumbererEntity;
import com.azul.CreateContraptionCreatures.items.ModItem;
import com.azul.CreateContraptionCreatures.util.LocomotiveWorkerTrades;
import com.azul.CreateContraptionCreatures.util.MechanicTrades;
import com.azul.CreateContraptionCreatures.util.PlumberTrades;
import com.azul.CreateContraptionCreatures.villager.ModVillagers;

import mod.azure.azurelib.AzureLib;

public class CreateContraptionCreatures implements ModInitializer
{
	public static final String MOD_ID = "createcontraptioncreatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		LOGGER.info("Hello from create : Contraption Creatures");
		// Register blocks
		AzureLib.initialize();
		// Register Mobs
		FabricDefaultAttributeRegistry.register(ModEntity.AUTO_DRILLER, AutoDrillerEntity.createGathererDrillerAttributes());
		FabricDefaultAttributeRegistry.register(ModEntity.AUTO_LUMBERER, AutoLumbererEntity.createGathererLumbererAttributes());
		ModBlocks.registerModBlocks();
		ModItem.registerModItems();
		// Register Villagers
		ModVillagers.registerVillagers();
		MechanicTrades.registerCustomTrades();
		PlumberTrades.registerCustomTrades();
		LocomotiveWorkerTrades.registerCustomTrades();

	}
}
