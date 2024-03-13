package com.jagex.game.world.entity;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("vj")
public class LocShape implements SerializableEnum {

	@ObfuscatedName("vj.e")
	public static final LocShape field7554 = new LocShape(0, 0);

	@ObfuscatedName("vj.n")
	public static final LocShape field7551 = new LocShape(1, 0);

	@ObfuscatedName("vj.m")
	public static final LocShape field7545 = new LocShape(2, 0);

	@ObfuscatedName("vj.k")
	public static final LocShape field7546 = new LocShape(3, 0);

	@ObfuscatedName("vj.f")
	public static final LocShape field7547 = new LocShape(9, 2);

	@ObfuscatedName("vj.w")
	public static final LocShape field7548 = new LocShape(4, 1);

	@ObfuscatedName("vj.l")
	public static final LocShape field7549 = new LocShape(5, 1);

	@ObfuscatedName("vj.u")
	public static final LocShape field7550 = new LocShape(6, 1);

	@ObfuscatedName("vj.z")
	public static final LocShape field7557 = new LocShape(7, 1);

	@ObfuscatedName("vj.p")
	public static final LocShape field7543 = new LocShape(8, 1);

	@ObfuscatedName("vj.d")
	public static final LocShape field7553 = new LocShape(12, 2);

	@ObfuscatedName("vj.c")
	public static final LocShape field7552 = new LocShape(13, 2);

	@ObfuscatedName("vj.r")
	public static final LocShape field7565 = new LocShape(14, 2);

	@ObfuscatedName("vj.v")
	public static final LocShape field7555 = new LocShape(15, 2);

	@ObfuscatedName("vj.o")
	public static final LocShape field7561 = new LocShape(16, 2);

	@ObfuscatedName("vj.s")
	public static final LocShape field7558 = new LocShape(17, 2);

	@ObfuscatedName("vj.y")
	public static final LocShape field7559 = new LocShape(18, 2);

	@ObfuscatedName("vj.q")
	public static final LocShape field7560 = new LocShape(19, 2);

	@ObfuscatedName("vj.x")
	public static final LocShape field7544 = new LocShape(20, 2);

	@ObfuscatedName("vj.b")
	public static final LocShape field7556 = new LocShape(21, 2);

	@ObfuscatedName("vj.h")
	public static final LocShape field7563 = new LocShape(10, 2);

	@ObfuscatedName("vj.a")
	public static final LocShape field7564 = new LocShape(11, 2);

	@ObfuscatedName("vj.g")
	public static final LocShape field7566 = new LocShape(22, 3);

	@ObfuscatedName("vj.i")
	public final int field7562;

	@ObfuscatedName("vj.j")
	public final int field7567;

	public LocShape(int arg0, int arg1) {
		this.field7562 = arg0;
		this.field7567 = arg1;
	}

	@ObfuscatedName("a.e(I)[Lvj;")
	public static LocShape[] method606() {
		return new LocShape[] { field7554, field7551, field7558, field7555, field7545, field7565, field7547, field7546, field7566, field7553, field7564, field7550, field7544, field7563, field7549, field7552, field7557, field7548, field7561, field7543, field7560, field7556, field7559 };
	}

    @ObfuscatedName("vj.n()I")
	public int getId() {
		return this.field7562;
	}

	@ObfuscatedName("sg.m(II)Z")
	public static boolean method8381(int arg0) {
		return arg0 >= field7554.field7562 && arg0 <= field7546.field7562 || field7547.field7562 == arg0;
	}

	@ObfuscatedName("aat.f(II)Z")
	public static boolean method14238(int arg0) {
		return arg0 >= field7548.field7562 && arg0 <= field7543.field7562;
	}

	@ObfuscatedName("g.w(II)Z")
	public static boolean method615(int arg0) {
		return arg0 >= field7553.field7562 && arg0 <= field7558.field7562;
	}

	@ObfuscatedName("pb.l(II)Z")
	public static boolean method6788(int arg0) {
		return arg0 >= field7559.field7562 && arg0 <= field7556.field7562;
	}
}
