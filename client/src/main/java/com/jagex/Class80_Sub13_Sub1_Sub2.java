package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ats")
public final class Class80_Sub13_Sub1_Sub2 extends Class80_Sub13_Sub1 {

	@OriginalMember(owner = "client!ats", name = "s", descriptor = "[I")
	int[] anIntArray288 = null;

	@OriginalMember(owner = "client!ats", name = "a", descriptor = "Lclient!ago;")
	Class113_Sub2 aClass113_Sub2_2;

	@OriginalMember(owner = "client!ats", name = "<init>", descriptor = "(Lclient!ago;Lclient!hi;)V")
	Class80_Sub13_Sub1_Sub2(@OriginalArg(0) Class113_Sub2 arg0, @OriginalArg(1) Class314 arg1) {
		super(arg1);
		this.aClass113_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!ats", name = "t", descriptor = "(I)Z")
	@Override
	public boolean method23992(@OriginalArg(0) int arg0) {
		if (this.anIntArray288 == null) {
			this.anIntArray288 = new int[this.aClass113_Sub2_2.method8262((byte) 0)];
		}
		@Pc(16) Class114_Sub1 local16 = (Class114_Sub1) this.aClass113_Sub2_2.method8263(arg0, (byte) 1);
		this.anIntArray288[arg0] = OpenGL.glGetUniformLocation(local16.anInt1004, this.method23988((byte) 117));
		return this.anIntArray288[arg0] != -1;
	}

	@OriginalMember(owner = "client!ats", name = "y", descriptor = "()I")
	int method24004() {
		return this.anIntArray288[this.aClass113_Sub2_2.method8355((byte) 66)];
	}

	@OriginalMember(owner = "client!ats", name = "g", descriptor = "(I)I")
	@Override
	public int method23997(@OriginalArg(0) int arg0) {
		return this.anIntArray288[arg0];
	}

	@OriginalMember(owner = "client!ats", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method23993(@OriginalArg(0) int arg0) {
		if (this.anIntArray288 == null) {
			this.anIntArray288 = new int[this.aClass113_Sub2_2.method8262((byte) 0)];
		}
		@Pc(16) Class114_Sub1 local16 = (Class114_Sub1) this.aClass113_Sub2_2.method8263(arg0, (byte) 1);
		this.anIntArray288[arg0] = OpenGL.glGetUniformLocation(local16.anInt1004, this.method23988((byte) 98));
		return this.anIntArray288[arg0] != -1;
	}

	@OriginalMember(owner = "client!ats", name = "v", descriptor = "(I)I")
	@Override
	public int method24003(@OriginalArg(0) int arg0) {
		return this.anIntArray288[arg0];
	}
}
