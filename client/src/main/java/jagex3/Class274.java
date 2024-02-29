package jagex3;

import java.awt.Container;
import java.awt.Insets;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
final class Class274 implements Interface22 {

	@OriginalMember(owner = "client!fs", name = "kc", descriptor = "I")
	static int anInt3928;

	@OriginalMember(owner = "client!fs", name = "we", descriptor = "Lclient!fb;")
	public static Class258 aClass258_11;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fs", name = "this$0", descriptor = "Lclient!fb;")
	final Class258 aClass258_10;

	@OriginalMember(owner = "client!fs", name = "acb", descriptor = "(Lclient!yf;I)V")
	static void method26429(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.aBoolean752 ? 1 : 0;
	}

	@OriginalMember(owner = "client!fs", name = "afl", descriptor = "(Lclient!yf;I)V")
	static void method26430(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(26) int local26 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (local26 == -1) {
			throw new RuntimeException("");
		}
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local13 + (char) local26;
	}

	@OriginalMember(owner = "client!fs", name = "air", descriptor = "(Lclient!yf;I)V")
	static void method26431(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3552 * -350691737;
	}

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "(Lclient!ajq;I)V")
	static void method26432(@OriginalArg(0) Class149_Sub5 arg0, @OriginalArg(1) int arg1) {
		arg0.aClass132_Sub1_Sub1_Sub1_1 = null;
		if (Class149_Sub5.anInt1448 * 829391975 < 20) {
			Class149_Sub5.aClass21_3.method379(arg0, (byte) 4);
			Class149_Sub5.anInt1448 += 1630361431;
		}
	}

	@OriginalMember(owner = "client!fs", name = "fj", descriptor = "(B)V")
	public static void method26433(@OriginalArg(0) byte arg0) {
		@Pc(2) Container local2 = BaseVarTypeString.method30377(-283088421);
		@Pc(6) int local6 = local2.getSize().width;
		@Pc(10) int local10 = local2.getSize().height;
		if (Class628.aFrame2 == local2) {
			@Pc(16) Insets local16 = Class628.aFrame2.getInsets();
			local6 -= local16.left + local16.right;
			local10 -= local16.bottom + local16.top;
		}
		if (client.anInt3413 * -108363597 == local6 && BaseVarTypeString.anInt5362 * 2090134413 == local10 && !client.aBoolean611) {
			return;
		}
		if (Class694.aClass104_14 == null || Class694.aClass104_14.method20435()) {
			Class495.method30210((byte) -61);
		} else {
			client.anInt3413 = local6 * -1386467717;
			BaseVarTypeString.anInt5362 = local10 * -1294184635;
		}
		client.aLong244 = (Class305.method26889(1582354690) + 500L) * -3239649073383352057L;
		client.aBoolean611 = false;
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!fb;)V")
	Class274(@OriginalArg(0) Class258 arg0) {
		this.aClass258_10 = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "(Ljava/lang/Object;)V")
	@Override
	public void method26423(@OriginalArg(0) Object arg0) {
		this.method26427((Interface70) arg0, -949777433);
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(Ljava/lang/Object;I)V")
	@Override
	public void method26424(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		this.method26427((Interface70) arg0, -272365851);
	}

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "(Lclient!wr;I)V")
	void method26427(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Iterator local5 = this.aClass258_10.method26126(495448070).iterator();
		while (local5.hasNext()) {
			@Pc(12) Class539 local12 = (Class539) local5.next();
			if (local12.method30978(-1740415374) == arg0) {
				local12.method30969(-2132718265);
				local5.remove();
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "(Ljava/lang/Object;)V")
	@Override
	public void method26425(@OriginalArg(0) Object arg0) {
		this.method26427((Interface70) arg0, 1186633252);
	}

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "(Ljava/lang/Object;)V")
	@Override
	public void method26426(@OriginalArg(0) Object arg0) {
		this.method26427((Interface70) arg0, -2006535156);
	}

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "(Lclient!wr;)V")
	void method26428(@OriginalArg(0) Interface70 arg0) {
		@Pc(5) Iterator local5 = this.aClass258_10.method26126(1800908213).iterator();
		while (local5.hasNext()) {
			@Pc(12) Class539 local12 = (Class539) local5.next();
			if (local12.method30978(1526012801) == arg0) {
				local12.method30969(-2132718265);
				local5.remove();
			}
		}
	}
}
