package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class489 {

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "Lclient!pl;")
	final Class486 aClass486_5;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	final int anInt5014;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	final int anInt5013;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "(Lclient!abs;Lclient!ald;I)Lclient!aby;")
	public static Class49 method30218(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		return Class710.method37158(arg0, arg1, 2, 868299037);
	}

	@OriginalMember(owner = "client!pp", name = "lr", descriptor = "(II)V")
	static void method30219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class71.method18185(arg0, null, (byte) 100)) {
			Class331.method27790(Class709.aClass310Array1[arg0].aClass327Array2, -1, (byte) 103);
		}
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class489(@OriginalArg(0) Packet arg0) {
		this.aClass486_5 = (Class486) Class80_Sub39.method15030(Class486.method30060(-835819538), arg0.g1(), -1498480699);
		this.anInt5014 = arg0.g4() * 956051035;
		if (Class486.UNCOMPRESSED == this.aClass486_5) {
			this.anInt5013 = this.anInt5014 * 319576311;
		} else {
			this.anInt5013 = arg0.g4() * -1736179251;
		}
	}

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "(B)Lclient!pl;")
	Class486 method30214(@OriginalArg(0) byte arg0) {
		return this.aClass486_5;
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)I")
	int method30215(@OriginalArg(0) int arg0) {
		return this.anInt5013 * -407842043;
	}

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "(I)I")
	int method30216(@OriginalArg(0) int arg0) {
		return this.anInt5014 * -1755229741;
	}

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "()I")
	int method30217() {
		return this.anInt5013 * -407842043;
	}
}
