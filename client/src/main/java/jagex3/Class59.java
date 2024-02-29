package jagex3;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aci")
public final class Class59 {

	@OriginalMember(owner = "client!aci", name = "wn", descriptor = "Ljava/util/Iterator;")
	public static Iterator anIterator1;

	@OriginalMember(owner = "client!aci", name = "e", descriptor = "(B)[Lclient!oh;")
	public static Class461[] method1109(@OriginalArg(0) byte arg0) {
		return new Class461[] { Class461.aClass461_45, Class461.aClass461_53, Class461.aClass461_9, Class461.aClass461_35, Class461.aClass461_55, Class461.aClass461_19, Class461.aClass461_26, Class461.aClass461_42, Class461.aClass461_15, Class461.aClass461_22, Class461.aClass461_44, Class461.aClass461_25, Class461.aClass461_39, Class461.aClass461_21, Class461.aClass461_3, Class461.aClass461_33, Class461.aClass461_13, Class461.aClass461_24, Class461.aClass461_48, Class461.aClass461_18, Class461.aClass461_6, Class461.aClass461_47, Class461.aClass461_30, Class461.aClass461_5, Class461.aClass461_16, Class461.aClass461_36, Class461.aClass461_28, Class461.aClass461_52, Class461.aClass461_40, Class461.aClass461_4, Class461.aClass461_31, Class461.aClass461_46, Class461.aClass461_1, Class461.aClass461_34, Class461.aClass461_54, Class461.aClass461_27, Class461.aClass461_38, Class461.aClass461_2, Class461.aClass461_14, Class461.aClass461_10, Class461.aClass461_7, Class461.aClass461_12, Class461.aClass461_49, Class461.aClass461_51, Class461.aClass461_29, Class461.aClass461_17, Class461.aClass461_37, Class461.aClass461_11, Class461.aClass461_23, Class461.aClass461_32, Class461.aClass461_20, Class461.aClass461_8, Class461.aClass461_43, Class461.aClass461_50, Class461.aClass461_41 };
	}

	@OriginalMember(owner = "client!aci", name = "<init>", descriptor = "()V")
	public Class59() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!aci", name = "f", descriptor = "()J")
	public long method1104() {
		return System.nanoTime();
	}

	@OriginalMember(owner = "client!aci", name = "e", descriptor = "(I)J")
	public long method1105(@OriginalArg(0) int arg0) {
		return System.nanoTime();
	}

	@OriginalMember(owner = "client!aci", name = "m", descriptor = "()J")
	public long method1106() {
		return System.nanoTime();
	}

	@OriginalMember(owner = "client!aci", name = "k", descriptor = "()J")
	public long method1107() {
		return System.nanoTime();
	}

	@OriginalMember(owner = "client!aci", name = "n", descriptor = "()J")
	public long method1108() {
		return System.nanoTime();
	}
}
