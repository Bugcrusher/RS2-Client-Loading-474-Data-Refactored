package com.seven.scene.tile;
import com.seven.collection.Linkable;
import com.seven.media.renderable.ItemPile;
import com.seven.media.renderable.StaticObject;

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 


public final class Tile extends Linkable {

	public Tile(int i, int j, int k)
	{
		obj5Array = new StaticObject[5];
		anIntArray1319 = new int[5];
		anInt1310 = anInt1307 = i;
		anInt1308 = j;
		anInt1309 = k;
	}

	public int anInt1307;
	public final int anInt1308;
	public final int anInt1309;
	public final int anInt1310;
	public TileUnderlay aClass43_1311;
	public ShapedTile aClass40_1312;
	public WallLock obj1;
	public WallDecoration obj2;
	public GroundDecoration obj3;
	public ItemPile obj4;
	public int anInt1317;
	public final StaticObject[] obj5Array;
	public final int[] anIntArray1319;
	public int anInt1320;
	public int anInt1321;
	public boolean aBoolean1322;
	public boolean aBoolean1323;
	public boolean aBoolean1324;
	public int anInt1325;
	public int anInt1326;
	public int anInt1327;
	public int anInt1328;
	public Tile aClass30_Sub3_1329;
}
