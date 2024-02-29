package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class507 implements Interface75 {

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Lclient!qj;")
	public static final Class507 aClass507_5 = new Class507(0);

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Lclient!qj;")
	public static final Class507 aClass507_4 = new Class507(1);

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Lclient!qj;")
	public static final Class507 aClass507_6 = new Class507(2);

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
	final int anInt5363;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "()[Lclient!qj;")
	public static Class507[] method30406() {
		return new Class507[] { aClass507_4, aClass507_5, aClass507_6 };
	}

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "()[Lclient!qj;")
	public static Class507[] method30407() {
		return new Class507[] { aClass507_4, aClass507_5, aClass507_6 };
	}

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "()[Lclient!qj;")
	public static Class507[] method30408() {
		return new Class507[] { aClass507_4, aClass507_5, aClass507_6 };
	}

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "(ZZLjava/lang/String;Ljava/lang/String;J)Z")
	static boolean method30409(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4) {
		Class411.aBoolean758 = arg0;
		if (!arg1) {
			Class411.anInt4907 = -48143567;
		}
		Class411.aBoolean759 = arg1;
		Class411.aString209 = arg2;
		Class411.aString210 = arg3;
		Class411.aLong274 = arg4 * 7033311592096984251L;
		if (!Class411.aBoolean759 && (Class411.aString209.equals("") || Class411.aString210.equals(""))) {
			Class114.method7638(3, 404726518);
			Class680.method33424(-658529605);
			return false;
		}
		if (Class411.anInt4875 * -1128337797 != 132) {
			Class411.anInt4900 = 0;
			Class411.anInt4916 = -1109601241;
			Class411.anInt4915 = -156824051;
		}
		Class411.aClass175_3.aBoolean566 = false;
		Class114.method7638(-3, -1221204395);
		Class411.anInt4882 = -1044277882;
		Class411.anInt4912 = 0;
		Class411.anInt4909 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "en", descriptor = "(I)V")
	static void method30410(@OriginalArg(0) int arg0) {
		if (Class694.aClass104_14 == null) {
			return;
		}
		client.aClass532_1.method30644((byte) 59);
		Class360.method27982((short) -5760);
		Class389.method28447((byte) 34);
		Class54.method14857((short) 2003);
		Class106.method7582((byte) 1);
		client.aClass532_1.method30634(true, -1425513161);
		Class542.method31117(-1497248091);
		Class165.method15331(-248208143);
		Class700.method36897(false, (byte) -31);
		Class286.method26625(1204150188);
		Class166_Sub18.method15754(1608465020);
		Exception_Sub1.method17643(-1962708807);
		@Pc(32) int local32;
		for (local32 = 0; local32 < client.aClass567Array1.length; local32++) {
			if (client.aClass567Array1[local32] != null) {
				client.aClass567Array1[local32].aClass109_9 = null;
			}
		}
		@Pc(61) int local61;
		for (local32 = 0; local32 < 2048; local32++) {
			@Pc(56) Class132_Sub1_Sub1_Sub1_Sub2 local56 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local32];
			if (local56 != null) {
				for (local61 = 0; local61 < local56.aClass109Array3.length; local61++) {
					local56.aClass109Array3[local61] = null;
				}
			}
		}
		for (local32 = 0; local32 < client.anInt3488 * -1814159537; local32++) {
			@Pc(88) Class132_Sub1_Sub1_Sub1_Sub1 local88 = (Class132_Sub1_Sub1_Sub1_Sub1) client.aClass93_Sub15Array1[local32].anObject5;
			if (local88 != null) {
				for (local61 = 0; local61 < local88.aClass109Array3.length; local61++) {
					local88.aClass109Array3[local61] = null;
				}
			}
		}
		client.aClass16_21.method219((byte) 71);
		Class694.aClass104_14.method20889(-1550720229);
		Class694.aClass104_14 = null;
	}

	@OriginalMember(owner = "client!qj", name = "api", descriptor = "(Lclient!yf;B)V")
	static void method30411(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		Class65.aClass123_Sub1_2.method9009((float) arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] / 1000.0F, 614785474);
	}

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "(II)I")
	static int method30412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I)V")
	Class507(@OriginalArg(0) int arg0) {
		this.anInt5363 = arg0 * 518352289;
	}

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt5363 * 1367455329;
	}

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt5363 * 1367455329;
	}
}
