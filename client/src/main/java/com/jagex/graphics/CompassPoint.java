package com.jagex.graphics;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("zi")
public class CompassPoint implements SerializableEnum {

	@ObfuscatedName("zi.e")
	public static final CompassPoint NORTH = new CompassPoint(7, 0);

	@ObfuscatedName("zi.n")
	public static final CompassPoint NORTHWEST = new CompassPoint(6, 1);

	@ObfuscatedName("zi.m")
	public static final CompassPoint NORTHEAST = new CompassPoint(3, 2);

	@ObfuscatedName("zi.k")
	public static final CompassPoint SOUTHWEST = new CompassPoint(5, 3);

	@ObfuscatedName("zi.f")
	public static final CompassPoint SOUTH = new CompassPoint(0, 4);

	@ObfuscatedName("zi.w")
	public static final CompassPoint WEST = new CompassPoint(4, 5);

	@ObfuscatedName("zi.l")
	public static final CompassPoint EAST = new CompassPoint(1, 6);

	@ObfuscatedName("zi.u")
	public static final CompassPoint SOUTHEAST = new CompassPoint(2, 7);

	@ObfuscatedName("zi.z")
	public final int index;

	@ObfuscatedName("zi.p")
	public final int serialID;

	@ObfuscatedName("vj.e(I)[Lzi;")
	public static CompassPoint[] values() {
		return new CompassPoint[] {NORTHWEST, SOUTH, NORTHEAST, NORTH, SOUTHEAST, EAST, SOUTHWEST, WEST};
	}

	public CompassPoint(int arg0, int arg1) {
		this.index = arg0;
		this.serialID = arg1;
	}

	@ObfuscatedName("zi.n()I")
	public int getId() {
		return this.serialID;
	}

	@ObfuscatedName("zi.m(I)Lzi;")
	public CompassPoint method13895() {
		switch(this.index) {
			case 0:
				return NORTH;
			case 1:
				return NORTHEAST;
			case 2:
				return SOUTHWEST;
			case 3:
				return EAST;
			case 4:
				return NORTHWEST;
			case 5:
				return SOUTHEAST;
			case 6:
				return WEST;
			case 7:
				return SOUTH;
			default:
				throw new IllegalStateException();
		}
	}
}
