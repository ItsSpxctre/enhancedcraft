package com.spxctreofficial.enhancedcraft.registry.items.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class EtheriumAxeItem extends AxeItem {

	public EtheriumAxeItem(ToolMaterial material) {
		super(material, 14, -2.9f, new Item.Settings().group(ItemGroup.TOOLS));
	}
    
}