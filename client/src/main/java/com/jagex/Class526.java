package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public class Class526 {

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!rc;")
	public static final Class526 aClass526_1 = new Class526(false, false);

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "Lclient!rc;")
	public static final Class526 aClass526_2 = new Class526(true, false);

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "Lclient!rc;")
	public static final Class526 NORMAL = new Class526(false, false);

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "Lclient!rc;")
	public static final Class526 REGION = new Class526(true, false);

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!rc;")
	static final Class526 aClass526_4 = new Class526(true, false);

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "Lclient!rc;")
	static final Class526 aClass526_5 = new Class526(true, true);

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!rc;")
	static final Class526 aClass526_6 = new Class526(true, true);

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "Lclient!rc;")
	public static final Class526 aClass526_7 = new Class526(false, false);

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Z")
	boolean aBoolean788;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Z")
	boolean aBoolean787;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(ZZ)V", line = 15)
	Class526(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean788 = arg0;
		this.aBoolean787 = arg1;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)Z", line = 21)
	boolean method30380(@OriginalArg(0) int arg0) {
		return this.aBoolean788;
	}

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "()Z", line = 21)
	boolean method30381() {
		return this.aBoolean788;
	}

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "()Z", line = 25)
	public boolean method30382() {
		return this.aBoolean787;
	}

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "(B)Z", line = 25)
	public boolean method30383(@OriginalArg(0) byte arg0) {
		return this.aBoolean787;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "()Z", line = 25)
	public boolean method30384() {
		return this.aBoolean787;
	}

	@OriginalMember(owner = "client!rc", name = "aip", descriptor = "(Lclient!yf;I)V", line = 11358)
	static final void method30385(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(34) int local34 = Class372.aClass58_2.method1094(local13, -737304293).method22935(local23, (byte) -56).anInt5852 * 1337578489;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local34;
	}
}
