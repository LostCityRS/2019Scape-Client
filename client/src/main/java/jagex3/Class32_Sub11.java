package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aom")
public final class Class32_Sub11 extends Class32 {

	@OriginalMember(owner = "client!aom", name = "dg", descriptor = "(Lclient!hs;B)Z")
	static boolean method17049(@OriginalArg(0) Class322 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return false;
		}
		if (arg0.anIntArray400 != null) {
			arg0 = arg0.method27345(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface23_2, (short) 565);
			if (arg0 == null) {
				return false;
			}
		}
		if (!arg0.aBoolean713) {
			return false;
		} else if (!arg0.method27351(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface23_2, -283554360)) {
			return false;
		} else if (Class159_Sub1.aClass16_15.method215((long) (arg0.anInt4141 * -1352808549)) != null) {
			return false;
		} else if (Class159_Sub1.aClass16_16.method215((long) (arg0.anInt4146 * 880251661)) == null) {
			if (arg0.aString180 != null) {
				if (arg0.anInt4157 * 1579741579 == 0 && Class159_Sub1.aBoolean355) {
					return false;
				}
				if (arg0.anInt4157 * 1579741579 == 1 && Class159_Sub1.aBoolean354) {
					return false;
				}
				if (arg0.anInt4157 * 1579741579 == 2 && Class159_Sub1.aBoolean359) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aom", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;)V")
	public Class32_Sub11(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2) {
		super(arg0, arg1, arg2, Class667.aClass667_108, 16, new Class52(Class603.class));
	}
}
