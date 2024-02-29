package jagex3;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public abstract class Class117 implements Interface4 {

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "Lclient!eb;")
	final Class240 aClass240_11 = new Class240(100);

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_12 = new Class240(100);

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "Lclient!ao;")
	final Interface11 anInterface11_4;

	@OriginalMember(owner = "client!fu", name = "rt", descriptor = "(Lclient!yf;I)V")
	static void method8379(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4023 * -1490598249;
	}

	@OriginalMember(owner = "client!fu", name = "ben", descriptor = "(Lclient!yf;I)V")
	static void method8380(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class146.aClass344_3.method27631(-1829778453) > 0) {
			@Pc(17) String local17 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
			@Pc(22) String local22 = Class146.aClass344_3.method27617(local17, -1422298918);
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local22;
		}
	}

	@OriginalMember(owner = "client!fu", name = "anv", descriptor = "(Lclient!yf;B)V")
	static void method8381(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6049 -= -1422374923;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		@Pc(36) String local36 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 2];
		@Pc(54) boolean local54 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1;
		Class114.method7634(local14, local25, local36, local54, (byte) 51);
	}

	@OriginalMember(owner = "client!fu", name = "beo", descriptor = "(Lclient!yf;I)V")
	static void method8382(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = local23 >>> 8;
		@Pc(33) int local33 = local23 & 0xFF;
		@Pc(39) Class30 local39 = (Class30) Class74.aClass32_2.method18273(local13, -2074756598);
		@Pc(45) Class77 local45 = (Class77) Class276.aClass32_3.method18273(local29, -675571426);
		@Pc(50) ScriptVarType[] local50 = local45.aScriptVarTypeArrayArray2[local33];
		@Pc(55) Object[] local55 = local39.method620(local33, 1113569772);
		if (local55 == null && local45.anObjectArrayArray2 != null) {
			local55 = local45.anObjectArrayArray2[local33];
		}
		if (local55 != null) {
			local25 = local55.length / local50.length;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local25;
	}

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "(Ljava/net/Socket;III)Lclient!uz;")
	static Class160 method8383(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		return new Class160_Sub1(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "(II)V")
	public static void method8384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(22, (long) arg0);
		local4.method21877(2145428061);
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!ao;Lclient!py;Lclient!py;Lclient!py;)V")
	Class117(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class497 arg3) {
		this.anInterface11_4 = arg0;
		Class626.method32425(arg1, arg3, 2, -1246432472);
		Class629.method32446(arg2, arg3, (byte) -26);
	}

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "(I)V")
	final void method8366(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25925(arg0, (byte) 7);
		}
	}

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "(I)Lclient!ard;")
	final Class93_Sub1_Sub5 method8367(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_12;
		synchronized (this.aClass240_12) {
			@Pc(11) Class93_Sub1_Sub5 local11 = (Class93_Sub1_Sub5) this.aClass240_12.method25932((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub5(arg0);
				this.aClass240_12.method25923(local11, (long) arg0);
			}
			return local11.method21567(1109357338) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "(IB)Lclient!ard;")
	final Class93_Sub1_Sub5 method8368(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class240 local3 = this.aClass240_12;
		synchronized (this.aClass240_12) {
			@Pc(11) Class93_Sub1_Sub5 local11 = (Class93_Sub1_Sub5) this.aClass240_12.method25932((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub5(arg0);
				this.aClass240_12.method25923(local11, (long) arg0);
			}
			return local11.method21567(1629026729) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "(I)V")
	final void method8369(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25926((byte) -19);
		}
	}

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "(II)V")
	final void method8370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25925(arg0, (byte) 40);
		}
	}

	@OriginalMember(owner = "client!fu", name = "w", descriptor = "(I)Lclient!arr;")
	final Class93_Sub1_Sub10 method8371(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			@Pc(11) Class93_Sub1_Sub10 local11 = (Class93_Sub1_Sub10) this.aClass240_11.method25932((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub10(arg0);
				this.aClass240_11.method25923(local11, (long) arg0);
			}
			return local11.method21788(-1289947964) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "(I)Lclient!ard;")
	final Class93_Sub1_Sub5 method8372(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_12;
		synchronized (this.aClass240_12) {
			@Pc(11) Class93_Sub1_Sub5 local11 = (Class93_Sub1_Sub5) this.aClass240_12.method25932((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub5(arg0);
				this.aClass240_12.method25923(local11, (long) arg0);
			}
			return local11.method21567(1953167056) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "(I)Lclient!ard;")
	final Class93_Sub1_Sub5 method8373(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_12;
		synchronized (this.aClass240_12) {
			@Pc(11) Class93_Sub1_Sub5 local11 = (Class93_Sub1_Sub5) this.aClass240_12.method25932((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub5(arg0);
				this.aClass240_12.method25923(local11, (long) arg0);
			}
			return local11.method21567(1812626461) ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "()V")
	final void method8374() {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "()V")
	final void method8375() {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25926((byte) -32);
		}
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "()V")
	final void method8376() {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V")
	final void method8377(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			this.aClass240_11.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(IB)Lclient!arr;")
	final Class93_Sub1_Sub10 method8378(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class240 local3 = this.aClass240_11;
		synchronized (this.aClass240_11) {
			@Pc(11) Class93_Sub1_Sub10 local11 = (Class93_Sub1_Sub10) this.aClass240_11.method25932((long) arg0);
			if (local11 == null) {
				local11 = new Class93_Sub1_Sub10(arg0);
				this.aClass240_11.method25923(local11, (long) arg0);
			}
			return local11.method21788(-1126248190) ? local11 : null;
		}
	}
}
