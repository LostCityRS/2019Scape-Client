package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alf")
public class Class157_Sub1 extends Class157 implements Interface4 {

	@OriginalMember(owner = "client!alf", name = "z", descriptor = "Lclient!py;")
	final Class497 aClass497_50;

	@OriginalMember(owner = "client!alf", name = "<init>", descriptor = "(ZLclient!py;Lclient!zt;Lclient!zd;)V", line = 799)
	Class157_Sub1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) Class702 arg3) {
		super(arg0, arg2, arg3);
		this.aClass497_50 = arg1;
	}

	@OriginalMember(owner = "client!alf", name = "v", descriptor = "(ILclient!ao;I)Lclient!ay;", line = 804)
	@Override
	public Interface13 method27703(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		return new Class610(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alf", name = "y", descriptor = "(ILclient!ao;)Lclient!ay;", line = 804)
	@Override
	public Interface13 method27702(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class610(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alf", name = "q", descriptor = "(ILclient!ao;)Lclient!ay;", line = 804)
	@Override
	public Interface13 method27704(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class610(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alf", name = "s", descriptor = "(ILclient!ao;)Lclient!ay;", line = 804)
	@Override
	public Interface13 method27700(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		return new Class610(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!alf", name = "o", descriptor = "(B)Ljava/lang/Class;", line = 808)
	@Override
	public Class method27701(@OriginalArg(0) byte arg0) {
		return Class610.class;
	}

	@OriginalMember(owner = "client!alf", name = "x", descriptor = "()Ljava/lang/Class;", line = 808)
	@Override
	public Class method27705() {
		return Class610.class;
	}

	@OriginalMember(owner = "client!alf", name = "w", descriptor = "(II)[B", line = 812)
	@Override
	byte[] method14269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30064(arg0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!alf", name = "u", descriptor = "(I)[B", line = 812)
	@Override
	byte[] method14266(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30064(arg0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!alf", name = "z", descriptor = "(I)[B", line = 812)
	@Override
	byte[] method14264(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30064(arg0, 0, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!alf", name = "l", descriptor = "(IS)Z", line = 818)
	@Override
	boolean method14265(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30069(arg0, 0, -897178899);
		}
	}

	@OriginalMember(owner = "client!alf", name = "p", descriptor = "(I)Z", line = 818)
	@Override
	boolean method14267(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30069(arg0, 0, -1035862151);
		}
	}

	@OriginalMember(owner = "client!alf", name = "d", descriptor = "(I)Z", line = 818)
	@Override
	boolean method14268(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30069(arg0, 0, -57468234);
		}
	}

	@OriginalMember(owner = "client!alf", name = "c", descriptor = "(I)Z", line = 818)
	@Override
	boolean method14270(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_50;
		synchronized (this.aClass497_50) {
			return this.aClass497_50.method30069(arg0, 0, 264566312);
		}
	}

	@OriginalMember(owner = "client!alf", name = "hg", descriptor = "(J)V", line = 4399)
	static final void method14277(@OriginalArg(0) long arg0) {
		if (client.world.method30481(-982141012) != null) {
			if (Class429.anInt4781 * -1453926679 == 2 || Class429.anInt4781 * -1453926679 == 1) {
				Class1.method13(arg0);
			} else if (Class429.anInt4781 * -1453926679 == 4) {
				Class277.method26354(arg0);
			}
		}
		Class143.method11049(Class694.aClass104_14, (long) client.anInt3485);
		if (client.topLevelInterface * -703563959 != -1) {
			Class19.method23635(client.topLevelInterface * -703563959, 2103577804);
		}
		@Pc(39) int local39;
		for (local39 = 0; local39 < client.anInt3562 * -1477010237; local39++) {
			client.aBooleanArray19[local39] = client.topLevelComponentRedrawRequestedTemp[local39];
			client.topLevelComponentRedrawRequestedTemp[local39] = false;
		}
		client.anInt3554 = client.anInt3485 * -836590449;
		Class497.method30131(-1, -1, (byte) 50);
		if (client.topLevelInterface * -703563959 != -1) {
			client.anInt3562 = 0;
			Class79_Sub1_Sub2.method1489(-1721291139);
		}
		Class694.aClass104_14.method20568();
		Class510.method30246(Class694.aClass104_14, 1483618617);
		local39 = Class168.method17625(-608440267);
		if (local39 == -1) {
			local39 = client.anInt3520 * 895420077;
		}
		if (local39 == -1) {
			local39 = client.anInt3555 * 225035861;
		}
		Class696.method36644(local39, 456633732);
		@Pc(104) int local104 = Class520.selfPlayer.method19986(-1568045286) << 8;
		@Pc(108) Class472 local108 = Class520.selfPlayer.method24220().aClass472_61;
		Class110_Sub23.method8624(Class520.selfPlayer.aByte100, (int) local108.aFloat317 + local104, (int) local108.aFloat319 + local104, client.anInt3480 * 1820654295, 2073453342);
		client.anInt3480 = 0;
	}
}
