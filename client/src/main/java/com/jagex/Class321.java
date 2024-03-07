package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public class Class321 {

	@OriginalMember(owner = "client!hr", name = "ao", descriptor = "I")
	static int anInt4098;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(I[Ljava/lang/Object;)V", line = 7)
	Class321(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1) {
	}

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "(Lclient!alw;)Lclient!hr;", line = 10)
	public static Class321 method27241(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		if (local3 == 0) {
			return null;
		}
		local3--;
		arg0.pos += -1445626955;
		@Pc(18) int local18 = arg0.g4(-118643075);
		@Pc(21) Object[] local21 = new Object[local3];
		for (@Pc(23) int local23 = 0; local23 < local3; local23++) {
			@Pc(30) int local30 = arg0.g1((short) 16384);
			if (local30 == 0) {
				local21[local23] = Class500.method30160(Integer.class, -47609621).method30272(arg0, -1187347627);
			} else if (local30 == 1) {
				local21[local23] = Class500.method30160(String.class, -47609621).method30272(arg0, -1187347627);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + local30);
			}
		}
		return new Class321(local18, local21);
	}

	@OriginalMember(owner = "client!hr", name = "ajp", descriptor = "(Lclient!yf;B)V", line = 11401)
	static final void method27242(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class155.anInt2066 = 0;
	}
}
