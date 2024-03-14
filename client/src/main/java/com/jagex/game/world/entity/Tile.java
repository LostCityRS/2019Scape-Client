package com.jagex.game.world.entity;

import com.jagex.graphics.scenegraph.GroundDecorLayerEntity;
import com.jagex.graphics.scenegraph.ObjLayerEntity;
import com.jagex.graphics.scenegraph.WallDecorLayerEntity;
import com.jagex.graphics.scenegraph.WallLayerEntity;
import deob.ObfuscatedName;

@ObfuscatedName("tk")
public class Tile {

	@ObfuscatedName("tk.e")
	public byte level;

	@ObfuscatedName("tk.n")
	public Tile bridge;

	@ObfuscatedName("tk.m")
	public WallLayerEntity wall;

	@ObfuscatedName("tk.k")
	public WallLayerEntity dynamicWall;

	@ObfuscatedName("tk.f")
	public WallDecorLayerEntity wallDecoration;

	@ObfuscatedName("tk.w")
	public WallDecorLayerEntity dynamicWallDecoration;

	@ObfuscatedName("tk.l")
	public GroundDecorLayerEntity groundDecoration;

	@ObfuscatedName("tk.u")
	public ObjLayerEntity objStack;

	@ObfuscatedName("tk.z")
	public PrimaryLayerEntityList entities;

	@ObfuscatedName("tk.p")
	public short field6973;

	@ObfuscatedName("tk.d")
	public short field6969;

	@ObfuscatedName("tk.c")
	public short field6975;

	@ObfuscatedName("tk.r")
	public short field6972;

	public Tile(int level) {
		this.level = (byte) level;
	}
}
