package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ake")
public final class Class93_Sub15 extends Class93 {

	@OriginalMember(owner = "client!ake", name = "k", descriptor = "Ljava/lang/Object;")
	public final Object anObject5;

	@OriginalMember(owner = "client!ake", name = "kr", descriptor = "(Lclient!yf;I)V")
	static void method13508(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class35.method688(local11, local14, arg0, (short) 2078);
	}

	@OriginalMember(owner = "client!ake", name = "yu", descriptor = "(Lclient!yf;I)V")
	static void method13509(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class93_Sub1_Sub7 local2 = Class370.method28178(1506885452);
		if (Class166_Sub14.method15669(local2, 1053898168) == 4) {
			@Pc(14) Class93_Sub15 local14 = (Class93_Sub15) client.aClass16_18.method215(local2.method21715(1288673959));
			if (local14 != null) {
				arg0.aClass132_Sub1_Sub1_Sub1_4 = (Class132_Sub1_Sub1_Sub1) local14.anObject5;
				arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
				return;
			}
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ake", name = "aqv", descriptor = "(Lclient!yf;I)V")
	static void method13510(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class704 local2 = Class124_Sub3.method21466((byte) -111);
		@Pc(5) String local5 = Class659.method32993((byte) -45);
		if (local5 == null) {
			local5 = "";
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.getId();
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local5;
	}

	@OriginalMember(owner = "client!ake", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class93_Sub15(@OriginalArg(0) Object arg0) {
		this.anObject5 = arg0;
	}
}
