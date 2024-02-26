package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class217 {

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "Lclient!cw;")
	Class217 aClass217_1;

	@OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
	final int anInt3612;

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "[Lclient!pm;")
	final Class487[] aClass487Array9;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "[Lclient!pm;")
	Class487[] aClass487Array8;

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "[Lclient!pm;")
	Class487[] aClass487Array7;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "[[F")
	float[][] aFloatArrayArray23;

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "(I)V")
	public static void method25864(@OriginalArg(0) int arg0) {
		if (Class238.anInt3841 * 1722349977 == 104) {
			Class238.anInt3841 = -696557753;
		}
	}

	@OriginalMember(owner = "client!cw", name = "t", descriptor = "(I)[Lclient!qn;")
	public static Class512[] method25865(@OriginalArg(0) int arg0) {
		return new Class512[] { Class512.aClass512_5, Class512.aClass512_6, Class512.aClass512_4 };
	}

	@OriginalMember(owner = "client!cw", name = "t", descriptor = "(J)V")
	public static void method25866(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class388.method28637(arg0 - 1L);
			Class388.method28637(1L);
		} else {
			Class388.method28637(arg0);
		}
	}

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "(Ljava/lang/Object;ZB)[B")
	public static byte[] method25867(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(local11, local11.length) : local11;
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(26) ByteBuffer local26 = (ByteBuffer) arg0;
			@Pc(30) byte[] local30 = new byte[local26.capacity()];
			local26.position(0);
			local26.get(local30);
			return local30;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(ILclient!ald;Z)V")
	Class217(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) boolean arg2) {
		this.anInt3612 = arg1.g2s() * 1361676069;
		this.aClass487Array9 = new Class487[arg0];
		this.aClass487Array8 = new Class487[this.aClass487Array9.length];
		this.aClass487Array7 = new Class487[this.aClass487Array9.length];
		this.aFloatArrayArray23 = new float[this.aClass487Array9.length][3];
		for (@Pc(33) int local33 = 0; local33 < this.aClass487Array9.length; local33++) {
			this.aClass487Array9[local33] = new Class487(arg1, arg2);
			this.aFloatArrayArray23[local33][0] = arg1.gFloat();
			this.aFloatArrayArray23[local33][1] = arg1.gFloat();
			this.aFloatArrayArray23[local33][2] = arg1.gFloat();
		}
	}

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "(II)Lclient!pm;")
	Class487 method25857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass487Array8[arg0] == null) {
			this.aClass487Array8[arg0] = new Class487(this.method25858(arg0, (byte) -33));
			this.aClass487Array8[arg0].method30082();
		}
		return this.aClass487Array8[arg0];
	}

	@OriginalMember(owner = "client!cw", name = "t", descriptor = "(IB)Lclient!pm;")
	Class487 method25858(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass487Array9[arg0];
	}

	@OriginalMember(owner = "client!cw", name = "g", descriptor = "(I)Lclient!pm;")
	Class487 method25859(@OriginalArg(0) int arg0) {
		if (this.aClass487Array7[arg0] == null) {
			this.aClass487Array7[arg0] = new Class487(this.method25858(arg0, (byte) -88));
			if (this.aClass217_1 == null) {
				this.aClass487Array7[arg0].method30078(Class487.aClass487_97);
			} else {
				this.aClass487Array7[arg0].method30078(this.aClass217_1.method25860(arg0, -1835185992));
			}
		}
		return this.aClass487Array7[arg0];
	}

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "(II)Lclient!pm;")
	Class487 method25860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass487Array7[arg0] == null) {
			this.aClass487Array7[arg0] = new Class487(this.method25858(arg0, (byte) 41));
			if (this.aClass217_1 == null) {
				this.aClass487Array7[arg0].method30078(Class487.aClass487_97);
			} else {
				this.aClass487Array7[arg0].method30078(this.aClass217_1.method25860(arg0, -1578061640));
			}
		}
		return this.aClass487Array7[arg0];
	}

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "(I)Lclient!pm;")
	Class487 method25861(@OriginalArg(0) int arg0) {
		if (this.aClass487Array8[arg0] == null) {
			this.aClass487Array8[arg0] = new Class487(this.method25858(arg0, (byte) 116));
			this.aClass487Array8[arg0].method30082();
		}
		return this.aClass487Array8[arg0];
	}

	@OriginalMember(owner = "client!cw", name = "i", descriptor = "(I)Lclient!pm;")
	Class487 method25862(@OriginalArg(0) int arg0) {
		if (this.aClass487Array7[arg0] == null) {
			this.aClass487Array7[arg0] = new Class487(this.method25858(arg0, (byte) 71));
			if (this.aClass217_1 == null) {
				this.aClass487Array7[arg0].method30078(Class487.aClass487_97);
			} else {
				this.aClass487Array7[arg0].method30078(this.aClass217_1.method25860(arg0, -1360497611));
			}
		}
		return this.aClass487Array7[arg0];
	}

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "(I)Lclient!pm;")
	Class487 method25863(@OriginalArg(0) int arg0) {
		return this.aClass487Array9[arg0];
	}
}
