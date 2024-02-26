package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ago")
public final class Class113_Sub2 extends Class113 {

	@OriginalMember(owner = "client!ago", name = "j", descriptor = "Lclient!agq;")
	Class114_Sub1 aClass114_Sub1_1;

	@OriginalMember(owner = "client!ago", name = "a", descriptor = "I")
	int anInt994;

	@OriginalMember(owner = "client!ago", name = "o", descriptor = "Lclient!aqi;")
	final Class102_Sub1_Sub1 aClass102_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ago", name = "<init>", descriptor = "(Lclient!aqi;Lclient!hs;)V")
	Class113_Sub2(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Class324 arg1) {
		super(arg0, arg1);
		this.aClass102_Sub1_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ago", name = "dq", descriptor = "()V")
	@Override
	void method8265() {
		for (@Pc(1) int local1 = 0; local1 < this.method8262((byte) 0); local1++) {
			((Class114_Sub1) this.method8263(local1, (byte) 1)).method30837();
		}
		super.method8325();
	}

	@OriginalMember(owner = "client!ago", name = "l", descriptor = "(Lclient!afa;Lclient!hj;)Lclient!ht;")
	@Override
	Class114 method8260(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class315 arg1) {
		return new Class114_Sub1((Class102_Sub1_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ago", name = "a", descriptor = "(Lclient!ht;)Z")
	@Override
	public boolean method8295(@OriginalArg(0) Class114 arg0) {
		if (this.aClass114_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method8577()) {
			@Pc(13) boolean local13 = this.method8357();
			this.aClass114_Sub1_1 = (Class114_Sub1) arg0;
			this.anInt993 = this.method8264(arg0, 1750714479) * -822875393;
			if (this.anInt993 * 1683166463 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt994 = this.aClass114_Sub1_1.anInt1004;
			if (local13) {
				OpenGL.glUseProgram(this.anInt994);
				this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 = this.aClass114_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ago", name = "x", descriptor = "(Lclient!hi;)Lclient!aqv;")
	@Override
	Class80_Sub13_Sub1 method8348(@OriginalArg(0) Class314 arg0) {
		return new Class80_Sub13_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!ago", name = "t", descriptor = "()V")
	@Override
	public void method8256() {
		if (this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 == this.aClass114_Sub1_1) {
			return;
		}
		if (this.aClass114_Sub1_1 == null) {
			throw new RuntimeException_Sub1();
		}
		OpenGL.glUseProgram(this.anInt994);
		this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 = this.aClass114_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "aa", descriptor = "()Z")
	@Override
	public boolean method8304() {
		return this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 == this.aClass114_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "e", descriptor = "()Z")
	@Override
	public boolean method8357() {
		return this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 == this.aClass114_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "ak", descriptor = "()V")
	@Override
	void method8325() {
		for (@Pc(1) int local1 = 0; local1 < this.method8262((byte) 0); local1++) {
			((Class114_Sub1) this.method8263(local1, (byte) 1)).method30837();
		}
		super.method8325();
	}

	@OriginalMember(owner = "client!ago", name = "hy", descriptor = "()V")
	void method8384() throws Throwable {
		this.method8325();
		super.finalize();
	}

	@OriginalMember(owner = "client!ago", name = "do", descriptor = "()V")
	@Override
	void method8255() {
		for (@Pc(1) int local1 = 0; local1 < this.method8262((byte) 0); local1++) {
			((Class114_Sub1) this.method8263(local1, (byte) 1)).method30837();
		}
		super.method8325();
	}

	@OriginalMember(owner = "client!ago", name = "hj", descriptor = "()V")
	void method8385() throws Throwable {
		this.method8325();
		super.finalize();
	}

	@OriginalMember(owner = "client!ago", name = "ht", descriptor = "()V")
	void method8386() throws Throwable {
		this.method8325();
		super.finalize();
	}

	@OriginalMember(owner = "client!ago", name = "finalize", descriptor = "()V")
	@Override
	void finalize() throws Throwable {
		this.method8325();
		super.finalize();
	}

	@OriginalMember(owner = "client!ago", name = "av", descriptor = "()V")
	@Override
	public void method8298() {
	}

	@OriginalMember(owner = "client!ago", name = "an", descriptor = "()Z")
	@Override
	public boolean method8299() {
		return this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 == this.aClass114_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "bo", descriptor = "(Lclient!hi;)Lclient!aqv;")
	@Override
	Class80_Sub13_Sub1 method8323(@OriginalArg(0) Class314 arg0) {
		return new Class80_Sub13_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!ago", name = "ae", descriptor = "()Z")
	@Override
	public boolean method8372() {
		return this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 == this.aClass114_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "as", descriptor = "(Lclient!afa;Lclient!hj;)Lclient!ht;")
	@Override
	Class114 method8306(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class315 arg1) {
		return new Class114_Sub1((Class102_Sub1_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ago", name = "aw", descriptor = "(Lclient!afa;Lclient!hj;)Lclient!ht;")
	@Override
	Class114 method8307(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) Class315 arg1) {
		return new Class114_Sub1((Class102_Sub1_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ago", name = "ad", descriptor = "()V")
	@Override
	public void method8297() {
	}

	@OriginalMember(owner = "client!ago", name = "bh", descriptor = "(Lclient!ht;)Z")
	@Override
	public boolean method8319(@OriginalArg(0) Class114 arg0) {
		if (this.aClass114_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method8577()) {
			@Pc(13) boolean local13 = this.method8357();
			this.aClass114_Sub1_1 = (Class114_Sub1) arg0;
			this.anInt993 = this.method8264(arg0, 1734684856) * -822875393;
			if (this.anInt993 * 1683166463 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt994 = this.aClass114_Sub1_1.anInt1004;
			if (local13) {
				OpenGL.glUseProgram(this.anInt994);
				this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 = this.aClass114_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ago", name = "at", descriptor = "()V")
	@Override
	public void method8296() {
		if (this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 == this.aClass114_Sub1_1) {
			return;
		}
		if (this.aClass114_Sub1_1 == null) {
			throw new RuntimeException_Sub1();
		}
		OpenGL.glUseProgram(this.anInt994);
		this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 = this.aClass114_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "be", descriptor = "(Lclient!ht;)Z")
	@Override
	public boolean method8279(@OriginalArg(0) Class114 arg0) {
		if (this.aClass114_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method8577()) {
			@Pc(13) boolean local13 = this.method8357();
			this.aClass114_Sub1_1 = (Class114_Sub1) arg0;
			this.anInt993 = this.method8264(arg0, 1947069814) * -822875393;
			if (this.anInt993 * 1683166463 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt994 = this.aClass114_Sub1_1.anInt1004;
			if (local13) {
				OpenGL.glUseProgram(this.anInt994);
				this.aClass102_Sub1_Sub1_1.aClass114_Sub1_2 = this.aClass114_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ago", name = "f", descriptor = "()V")
	@Override
	public void method8257() {
	}
}
