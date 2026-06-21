package net.killerkrow.nef;

import net.fabricmc.api.ModInitializer;

import net.killerkrow.nef.util.ModBlocks;
import net.killerkrow.nef.util.ModItemGroups;
import net.killerkrow.nef.util.ModItems;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotEnoughFlowers implements ModInitializer {
	public static final String MOD_ID = "nef";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
