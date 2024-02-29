package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alf")
public final class Class157_Sub1 extends Class157 implements Interface4 {

	@OriginalMember(owner = "client!alf", name = "z", descriptor = "Lclient!py;")
	final Class497 aClass497_50;

	@OriginalMember(owner = "client!alf", name = "hg", descriptor = "(J)V")
	static void method14277(@OriginalArg(0) long arg0) {
		if (client.aClass532_1.method30640(-982141012) != null) {
			if (Class429.anInt4942 * -1453926679 == 2 || Class429.anInt4942 * -1453926679 == 1) {
				Class1.method18(arg0);
			} else if (Class429.anInt4942 * -1453926679 == 4) {
				Class277.method26449(arg0);
			}
		}
		Class143.method11063(Class694.aClass104_14, (long) client.anInt3485);
		if (client.anInt3526 * -703563959 != -1) {
			Class19.method23646(client.anInt3526 * -703563959, 2103577804);
		}
		@Pc(39) int local39;
		for (local39 = 0; local39 < client.anInt3562 * -1477010237; local39++) {
			client.aBooleanArray19[local39] = client.aBooleanArray22[local39];
			client.aBooleanArray22[local39] = false;
		}
		client.anInt3554 = client.anInt3485 * -836590449;
		Class497.method30313(-1, -1, (byte) 50);
		if (client.anInt3526 * -703563959 != -1) {
			client.anInt3562 = 0;
			Class79_Sub1_Sub2.method1489(-1721291139);
		}
		Class694.aClass104_14.method20478();
		BaseVarTypeCoordFine.method30426(Class694.aClass104_14, 1483618617);
		local39 = Class168.method17640(-608440267);
		if (local39 == -1) {
			local39 = client.anInt3520 * 895420077;
		}
		if (local39 == -1) {
			local39 = client.anInt3555 * 225035861;
		}
		Class696.method36831(local39, 456633732);
		@Pc(104) int local104 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20009(-1568045286) << 8;
		@Pc(108) Class472 local108 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
		Class110_Sub23.method8624(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100, (int) local108.aFloat325 + local104, (int) local108.aFloat327 + local104, client.anInt3480 * 1820654295, 2073453342);
		client.anInt3480 = 0;
	}

	@OriginalMember(owner = "client!alf", name = "<init>", descriptor = "(ZLclient!py;Lclient!zt;Lclient!zd;)V")
	Class157_Sub1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) Class702 arg3) {
		super(arg0, arg2, arg3);
		this.aClass497_50 = arg1;
	}

	@OriginalMember(owner = "client!alf", name = "w", descriptor = "(II)[B")
	@Override
	byte[] method14250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30225(arg0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!alf", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;")
	@Override
	public Interface13 method27796(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class610(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alf", name = "u", descriptor = "(I)[B")
	@Override
	byte[] method14246(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30225(arg0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!alf", name = "l", descriptor = "(IS)Z")
	@Override
	boolean method14245(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30234(arg0, 0, -897178899);
		}
	}

	@OriginalMember(owner = "client!alf", name = "o", descriptor = "(B)Ljava/lang/Class;")
	@Override
	public Class method27794(@OriginalArg(0) byte arg0) {
		return Class610.class;
	}

	@OriginalMember(owner = "client!alf", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27795(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class610(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alf", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27797(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class610(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alf", name = "x", descriptor = "()Ljava/lang/Class;")
	@Override
	public Class method27798() {
		return Class610.class;
	}

	@OriginalMember(owner = "client!alf", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;")
	@Override
	public Interface13 method27793(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class610(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alf", name = "z", descriptor = "(I)[B")
	@Override
	byte[] method14244(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30225(arg0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!alf", name = "p", descriptor = "(I)Z")
	@Override
	boolean method14248(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30234(arg0, 0, -1035862151);
		}
	}

	@OriginalMember(owner = "client!alf", name = "d", descriptor = "(I)Z")
	@Override
	boolean method14249(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30234(arg0, 0, -57468234);
		}
	}

	@OriginalMember(owner = "client!alf", name = "c", descriptor = "(I)Z")
	@Override
	boolean method14258(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30234(arg0, 0, 264566312);
		}
	}
}
