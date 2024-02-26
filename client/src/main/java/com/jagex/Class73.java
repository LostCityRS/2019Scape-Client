package com.jagex;

import java.lang.reflect.Array;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acy")
public class Class73 implements Interface12 {

	@OriginalMember(owner = "client!acy", name = "l", descriptor = "Lclient!ae;")
	Interface11 anInterface11_3;

	@OriginalMember(owner = "client!acy", name = "t", descriptor = "Lclient!aba;")
	final Interface3 anInterface3_26;

	@OriginalMember(owner = "client!acy", name = "f", descriptor = "Lclient!xl;")
	final Class664 aClass664_32;

	@OriginalMember(owner = "client!acy", name = "e", descriptor = "Lclient!pf;")
	final Class480 aClass480_75;

	@OriginalMember(owner = "client!acy", name = "u", descriptor = "I")
	protected int anInt2513;

	@OriginalMember(owner = "client!acy", name = "g", descriptor = "[Lclient!ae;")
	Interface11[] anInterface11Array3;

	@OriginalMember(owner = "client!acy", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!xl;Lclient!pf;Lclient!aba;Z)V")
	Class73(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class664 arg2, @OriginalArg(3) Class480 arg3, @OriginalArg(4) Interface3 arg4, @OriginalArg(5) boolean arg5) {
		this.anInterface3_26 = arg4;
		this.aClass664_32 = arg2;
		this.aClass480_75 = arg3;
		this.anInt2513 = Class333.method27806(this.aClass480_75, this.aClass664_32, 2037250493) * -472931625;
		this.anInterface11Array3 = (Interface11[]) Array.newInstance(this.anInterface3_26.method28275(986934902), this.anInt2513 * 604664039);
		if (arg5) {
			for (@Pc(37) int local37 = 0; local37 < this.anInt2513 * 604664039; local37++) {
				this.method18056(local37, (byte) 126);
			}
		}
	}

	@OriginalMember(owner = "client!acy", name = "e", descriptor = "(I)Lclient!ae;")
	@Override
	public final Interface11 method18053(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface11_3 == null) {
				this.anInterface11_3 = this.anInterface3_26.method28276(-1, this, (byte) 17);
			}
			return this.anInterface11_3;
		} else {
			if (this.anInterface11Array3[arg0] == null) {
				this.method18056(arg0, (byte) 126);
			}
			return this.anInterface11Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!acy", name = "t", descriptor = "(II)Lclient!ae;")
	@Override
	public final Interface11 method18054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0) {
			if (this.anInterface11_3 == null) {
				this.anInterface11_3 = this.anInterface3_26.method28276(-1, this, (byte) 12);
			}
			return this.anInterface11_3;
		} else {
			if (this.anInterface11Array3[arg0] == null) {
				this.method18056(arg0, (byte) 126);
			}
			return this.anInterface11Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!acy", name = "g", descriptor = "(IB)V")
	final void method18056(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.anInterface11Array3[arg0] != null) {
			return;
		}
		try {
			this.anInterface11Array3[arg0] = this.anInterface3_26.method28276(arg0, this, (byte) -34);
		} catch (@Pc(18) Exception local18) {
			local18.printStackTrace();
			return;
		}
		@Pc(23) Object local23 = null;
		@Pc(31) byte[] local31 = Class349.method27998(this.aClass480_75, this.aClass664_32, arg0, (byte) 21);
		if (local31 != null) {
			this.anInterface11Array3[arg0].method37006(new Class80_Sub36(local31), 1896589581);
		}
		this.anInterface11Array3[arg0].method37007((byte) -87);
	}

	@OriginalMember(owner = "client!acy", name = "f", descriptor = "(I)I")
	@Override
	public int method18051(@OriginalArg(0) int arg0) {
		return this.anInterface11Array3.length;
	}

	@OriginalMember(owner = "client!acy", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public final Iterator iterator() {
		return new Class66(this);
	}

	@OriginalMember(owner = "client!acy", name = "a", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method18057() {
		return new Class66(this);
	}

	@OriginalMember(owner = "client!acy", name = "u", descriptor = "(I)Lclient!ae;")
	@Override
	public final Interface11 method18055(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			if (this.anInterface11_3 == null) {
				this.anInterface11_3 = this.anInterface3_26.method28276(-1, this, (byte) 46);
			}
			return this.anInterface11_3;
		} else {
			if (this.anInterface11Array3[arg0] == null) {
				this.method18056(arg0, (byte) 126);
			}
			return this.anInterface11Array3[arg0];
		}
	}

	@OriginalMember(owner = "client!acy", name = "l", descriptor = "()I")
	@Override
	public int method18052() {
		return this.anInterface11Array3.length;
	}

	@OriginalMember(owner = "client!acy", name = "o", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method18058() {
		return new Class66(this);
	}

	@OriginalMember(owner = "client!acy", name = "j", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method18059() {
		return new Class66(this);
	}
}
