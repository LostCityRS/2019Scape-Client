package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atr")
public class Class93_Sub33_Sub1_Sub2 extends Class93_Sub33_Sub1 {

	@OriginalMember(owner = "client!atr", name = "c", descriptor = "[I")
	int[] anIntArray275 = null;

	@OriginalMember(owner = "client!atr", name = "d", descriptor = "Lclient!ago;")
	Class115_Sub2 aClass115_Sub2_2;

	@OriginalMember(owner = "client!atr", name = "<init>", descriptor = "(Lclient!ago;Lclient!hv;)V", line = 14)
	Class93_Sub33_Sub1_Sub2(@OriginalArg(0) Class115_Sub2 arg0, @OriginalArg(1) Class325 arg1) {
		super(arg1);
		this.aClass115_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!atr", name = "a", descriptor = "()I", line = 19)
	final int method23668() {
		return this.anIntArray275[this.aClass115_Sub2_2.method8216(-594583474)];
	}

	@OriginalMember(owner = "client!atr", name = "i", descriptor = "()I", line = 19)
	final int method23669() {
		return this.anIntArray275[this.aClass115_Sub2_2.method8216(-1150527909)];
	}

	@OriginalMember(owner = "client!atr", name = "g", descriptor = "()I", line = 19)
	final int method23670() {
		return this.anIntArray275[this.aClass115_Sub2_2.method8216(-1408248032)];
	}

	@OriginalMember(owner = "client!atr", name = "j", descriptor = "()I", line = 19)
	final int method23671() {
		return this.anIntArray275[this.aClass115_Sub2_2.method8216(-1252077771)];
	}

	@OriginalMember(owner = "client!atr", name = "z", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method23666(@OriginalArg(0) int arg0) {
		if (this.anIntArray275 == null) {
			this.anIntArray275 = new int[this.aClass115_Sub2_2.method8200((byte) -50)];
		}
		@Pc(16) Class116_Sub1 local16 = (Class116_Sub1) this.aClass115_Sub2_2.method8203(arg0, -2102610570);
		this.anIntArray275[arg0] = OpenGL.glGetUniformLocation(local16.anInt958, this.method23651(-779329247));
		return this.anIntArray275[arg0] != -1;
	}

	@OriginalMember(owner = "client!atr", name = "e", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method23661(@OriginalArg(0) int arg0) {
		if (this.anIntArray275 == null) {
			this.anIntArray275 = new int[this.aClass115_Sub2_2.method8200((byte) -77)];
		}
		@Pc(16) Class116_Sub1 local16 = (Class116_Sub1) this.aClass115_Sub2_2.method8203(arg0, -1467770934);
		this.anIntArray275[arg0] = OpenGL.glGetUniformLocation(local16.anInt958, this.method23651(256248337));
		return this.anIntArray275[arg0] != -1;
	}

	@OriginalMember(owner = "client!atr", name = "l", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method23664(@OriginalArg(0) int arg0) {
		if (this.anIntArray275 == null) {
			this.anIntArray275 = new int[this.aClass115_Sub2_2.method8200((byte) -67)];
		}
		@Pc(16) Class116_Sub1 local16 = (Class116_Sub1) this.aClass115_Sub2_2.method8203(arg0, -1326093701);
		this.anIntArray275[arg0] = OpenGL.glGetUniformLocation(local16.anInt958, this.method23651(-355818980));
		return this.anIntArray275[arg0] != -1;
	}

	@OriginalMember(owner = "client!atr", name = "u", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method23665(@OriginalArg(0) int arg0) {
		if (this.anIntArray275 == null) {
			this.anIntArray275 = new int[this.aClass115_Sub2_2.method8200((byte) -15)];
		}
		@Pc(16) Class116_Sub1 local16 = (Class116_Sub1) this.aClass115_Sub2_2.method8203(arg0, -822978522);
		this.anIntArray275[arg0] = OpenGL.glGetUniformLocation(local16.anInt958, this.method23651(1368452782));
		return this.anIntArray275[arg0] != -1;
	}

	@OriginalMember(owner = "client!atr", name = "w", descriptor = "(I)I", line = 30)
	@Override
	public final int method23663(@OriginalArg(0) int arg0) {
		return this.anIntArray275[arg0];
	}

	@OriginalMember(owner = "client!atr", name = "h", descriptor = "(I)I", line = 30)
	@Override
	public final int method23662(@OriginalArg(0) int arg0) {
		return this.anIntArray275[arg0];
	}

	@OriginalMember(owner = "client!atr", name = "x", descriptor = "(I)I", line = 30)
	@Override
	public final int method23667(@OriginalArg(0) int arg0) {
		return this.anIntArray275[arg0];
	}
}
