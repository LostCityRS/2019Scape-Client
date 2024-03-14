package com.jagex.game.world.entity;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("vj")
public class LocShape implements SerializableEnum {

	@ObfuscatedName("vj.e")
	public static final LocShape WALL_STRAIGHT = new LocShape(0, 0);

	@ObfuscatedName("vj.n")
	public static final LocShape WALL_DIAGONAL_CORNER = new LocShape(1, 0);

	@ObfuscatedName("vj.m")
	public static final LocShape WALL_L = new LocShape(2, 0);

	@ObfuscatedName("vj.k")
	public static final LocShape WALL_SQUARE_CORNER = new LocShape(3, 0);

	@ObfuscatedName("vj.f")
	public static final LocShape WALL_DIAGONAL = new LocShape(9, 2);

	@ObfuscatedName("vj.w")
	public static final LocShape WALLDECOR_STRAIGHT_NOOFFSET = new LocShape(4, 1);

	@ObfuscatedName("vj.l")
	public static final LocShape WALLDECOR_STRAIGHT_OFFSET = new LocShape(5, 1);

	@ObfuscatedName("vj.u")
	public static final LocShape WALLDECOR_DIAGONAL_OFFSET = new LocShape(6, 1);

	@ObfuscatedName("vj.z")
	public static final LocShape WALLDECOR_DIAGONAL_NOOFFSET = new LocShape(7, 1);

	@ObfuscatedName("vj.p")
	public static final LocShape WALLDECOR_DIAGONAL_BOTH = new LocShape(8, 1);

	@ObfuscatedName("vj.d")
	public static final LocShape ROOF_STRAIGHT = new LocShape(12, 2);

	@ObfuscatedName("vj.c")
	public static final LocShape ROOF_DIAGONAL_WITH_ROOFEDGE = new LocShape(13, 2);

	@ObfuscatedName("vj.r")
	public static final LocShape ROOF_DIAGONAL = new LocShape(14, 2);

	@ObfuscatedName("vj.v")
	public static final LocShape ROOF_L_CONCAVE = new LocShape(15, 2);

	@ObfuscatedName("vj.o")
	public static final LocShape ROOF_L_CONVEX = new LocShape(16, 2);

	@ObfuscatedName("vj.s")
	public static final LocShape ROOF_FLAT = new LocShape(17, 2);

	@ObfuscatedName("vj.y")
	public static final LocShape ROOFEDGE_STRAIGHT = new LocShape(18, 2);

	@ObfuscatedName("vj.q")
	public static final LocShape ROOFEDGE_DIAGONAL_CORNER = new LocShape(19, 2);

	@ObfuscatedName("vj.x")
	public static final LocShape ROOFEDGE_L = new LocShape(20, 2);

	@ObfuscatedName("vj.b")
	public static final LocShape ROOFEDGE_SQUARE_CORNER = new LocShape(21, 2);

	@ObfuscatedName("vj.h")
	public static final LocShape CENTREPIECE_STRAIGHT = new LocShape(10, 2);

	@ObfuscatedName("vj.a")
	public static final LocShape CENTREPIECE_DIAGONAL = new LocShape(11, 2);

	@ObfuscatedName("vj.g")
	public static final LocShape GROUND_DECOR = new LocShape(22, 3);

	@ObfuscatedName("vj.i")
	public final int id;

	@ObfuscatedName("vj.j")
	public final int layer;

	public LocShape(int id, int layer) {
		this.id = id;
		this.layer = layer;
	}

	@ObfuscatedName("a.e(I)[Lvj;")
	public static LocShape[] values() {
		return new LocShape[] {WALL_STRAIGHT, WALL_DIAGONAL_CORNER, ROOF_FLAT, ROOF_L_CONCAVE, WALL_L, ROOF_DIAGONAL, WALL_DIAGONAL, WALL_SQUARE_CORNER, GROUND_DECOR, ROOF_STRAIGHT, CENTREPIECE_DIAGONAL, WALLDECOR_DIAGONAL_OFFSET, ROOFEDGE_L, CENTREPIECE_STRAIGHT, WALLDECOR_STRAIGHT_OFFSET, ROOF_DIAGONAL_WITH_ROOFEDGE, WALLDECOR_DIAGONAL_NOOFFSET, WALLDECOR_STRAIGHT_NOOFFSET, ROOF_L_CONVEX, WALLDECOR_DIAGONAL_BOTH, ROOFEDGE_DIAGONAL_CORNER, ROOFEDGE_SQUARE_CORNER, ROOFEDGE_STRAIGHT};
	}

    @ObfuscatedName("vj.n()I")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("sg.m(II)Z")
	public static boolean isWall(int arg0) {
		return arg0 >= WALL_STRAIGHT.id && arg0 <= WALL_SQUARE_CORNER.id || WALL_DIAGONAL.id == arg0;
	}

	@ObfuscatedName("aat.f(II)Z")
	public static boolean isWallDecor(int arg0) {
		return arg0 >= WALLDECOR_STRAIGHT_NOOFFSET.id && arg0 <= WALLDECOR_DIAGONAL_BOTH.id;
	}

	@ObfuscatedName("g.w(II)Z")
	public static boolean isRoof(int arg0) {
		return arg0 >= ROOF_STRAIGHT.id && arg0 <= ROOF_FLAT.id;
	}

	@ObfuscatedName("pb.l(II)Z")
	public static boolean isRoofEdge(int arg0) {
		return arg0 >= ROOFEDGE_STRAIGHT.id && arg0 <= ROOFEDGE_SQUARE_CORNER.id;
	}
}
