package com.runescape.entity;

import com.runescape.cache.def.ItemDefinition;
import com.runescape.entity.model.Model;

public final class Item extends Renderable {

	public final Model getRotatedModel() {
		ItemDefinition itemDef = ItemDefinition.lookup(ID);
		return itemDef.getModel(anInt1559);
	}

	public int ID;
	public int x;
	public int y;
	public int anInt1559;
}