package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ahq")
public class Class130_Sub2 extends Class130 {

	@OriginalMember(owner = "client!ahq", name = "lq", descriptor = "I")
	static int anInt1117;

	@OriginalMember(owner = "client!ahq", name = "m", descriptor = "Lclient!ho;")
	Class115 aClass115_2;

	@OriginalMember(owner = "client!ahq", name = "k", descriptor = "Lclient!aql;")
	Class93_Sub33_Sub1 aClass93_Sub33_Sub1_17;

	@OriginalMember(owner = "client!ahq", name = "f", descriptor = "Lclient!hi;")
	Class116 aClass116_1;

	@OriginalMember(owner = "client!ahq", name = "<init>", descriptor = "(Lclient!afc;)V", line = 14)
	public Class130_Sub2(@OriginalArg(0) Class104_Sub2 arg0) throws Exception_Sub2 {
		super(arg0);
		this.method10029(-469561861);
	}

	@OriginalMember(owner = "client!ahq", name = "w", descriptor = "()Z", line = 19)
	boolean method10028() throws Exception_Sub2 {
		this.aClass115_2 = this.aClass104_Sub2_14.method21124("BatchedSprite");
		this.aClass93_Sub33_Sub1_17 = this.aClass115_2.method8276("SpriteSampler", (byte) 0);
		this.aClass116_1 = this.aClass115_2.method8199("Normal", 1249273355);
		this.aClass115_2.method8301(this.aClass116_1);
		return true;
	}

	@OriginalMember(owner = "client!ahq", name = "f", descriptor = "(I)Z", line = 19)
	boolean method10029(@OriginalArg(0) int arg0) throws Exception_Sub2 {
		this.aClass115_2 = this.aClass104_Sub2_14.method21124("BatchedSprite");
		this.aClass93_Sub33_Sub1_17 = this.aClass115_2.method8276("SpriteSampler", (byte) 0);
		this.aClass116_1 = this.aClass115_2.method8199("Normal", 1249273355);
		this.aClass115_2.method8301(this.aClass116_1);
		return true;
	}

	@OriginalMember(owner = "client!ahq", name = "e", descriptor = "()V", line = 27)
	@Override
	public void method10025() {
		this.aClass115_2.method8315();
		this.aClass115_2.method8248(this.aClass93_Sub33_Sub1_17, 0, this.anInterface38_12, 2147130415);
	}

	@OriginalMember(owner = "client!ahq", name = "n", descriptor = "()V", line = 27)
	@Override
	public void method10024() {
		this.aClass115_2.method8315();
		this.aClass115_2.method8248(this.aClass93_Sub33_Sub1_17, 0, this.anInterface38_12, 2141130101);
	}

	@OriginalMember(owner = "client!ahq", name = "m", descriptor = "()V", line = 27)
	@Override
	public void method10026() {
		this.aClass115_2.method8315();
		this.aClass115_2.method8248(this.aClass93_Sub33_Sub1_17, 0, this.anInterface38_12, 2133777575);
	}

	@OriginalMember(owner = "client!ahq", name = "k", descriptor = "()V", line = 27)
	@Override
	public void method10027() {
		this.aClass115_2.method8315();
		this.aClass115_2.method8248(this.aClass93_Sub33_Sub1_17, 0, this.anInterface38_12, 2131330891);
	}

	@OriginalMember(owner = "client!ahq", name = "arf", descriptor = "(Lclient!yf;B)V", line = 12973)
	static final void method10030(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class411.disallowTrigger * 1176571707;
	}
}
