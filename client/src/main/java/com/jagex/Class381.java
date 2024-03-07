package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public class Class381 implements Interface32 {

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
	public final int anInt4624;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V", line = 8)
	Class381(@OriginalArg(0) int arg0) {
		this.anInt4624 = arg0 * 1960194337;
	}

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "(Lclient!alw;)Lclient!kj;", line = 13)
	public static Class381 method28124(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g4(-118643075);
		return new Class381(local3);
	}

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "(Lclient!alw;)Lclient!kj;", line = 13)
	public static Class381 method28125(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g4(-118643075);
		return new Class381(local3);
	}

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "(Lclient!alw;)Lclient!kj;", line = 13)
	public static Class381 method28126(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g4(-118643075);
		return new Class381(local3);
	}

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "(Lclient!alw;)Lclient!kj;", line = 13)
	public static Class381 method28127(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g4(-118643075);
		return new Class381(local3);
	}

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "(S)Lclient!kt;", line = 18)
	@Override
	public Class388 method28578(@OriginalArg(0) short arg0) {
		return Class388.aClass388_4;
	}

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "()Lclient!kt;", line = 18)
	@Override
	public Class388 method28579() {
		return Class388.aClass388_4;
	}

	@OriginalMember(owner = "client!kj", name = "ed", descriptor = "(Lclient!yf;I)V", line = 5703)
	static final void method28128(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class305.method26801(local11, local14, arg0, 1958111628);
	}

	@OriginalMember(owner = "client!kj", name = "ans", descriptor = "(Lclient!yf;I)V", line = 12345)
	static final void method28129(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9024(-1662199153) != Class342.aClass342_4) {
			throw new RuntimeException();
		}
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class65.aClass123_Sub1_2.method9039(1644866564);
	}

	@OriginalMember(owner = "client!kj", name = "aqy", descriptor = "(Lclient!yf;I)V", line = 12828)
	static final void method28130(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
