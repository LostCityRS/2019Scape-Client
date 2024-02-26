package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abq")
public class Class41 implements Interface12 {

	@OriginalMember(owner = "client!abq", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_74;

	@OriginalMember(owner = "client!abq", name = "f", descriptor = "Lclient!xl;")
	final Class664 aClass664_31;

	@OriginalMember(owner = "client!abq", name = "l", descriptor = "Lclient!aba;")
	protected final Interface3 anInterface3_25;

	@OriginalMember(owner = "client!abq", name = "e", descriptor = "I")
	public int anInt2476;

	@OriginalMember(owner = "client!abq", name = "u", descriptor = "Lclient!ej;")
	Class243 aClass243_63;

	@OriginalMember(owner = "client!abq", name = "n", descriptor = "(Lclient!yp;I)V")
	static void method17944(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class107 local9 = (Class107) arg0.aClass80_Sub1_Sub20_2.anObjectArray5[arg0.anInt5780 * -1336568839];
		@Pc(31) Interface22 local31 = (Interface22) (arg0.anIntArray526[arg0.anInt5780 * -1336568839] == 0 ? arg0.aMap23.get(local9.aClass143_6) : arg0.aMap24.get(local9.aClass143_6));
		@Pc(36) Class519 local36 = local9.aClass521_6.method30623(-666678663);
		if (Class519.aClass519_4 == local36) {
			if (local9.aClass143_6 == Class143.aClass143_69) {
				Class261.method26501(local9, (byte) 1);
			}
			local31.method36983(local9, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], 1073337262);
		} else if (local36 == Class519.aClass519_3) {
			local31.method36985(local9, arg0.aLongArray27[(arg0.anInt5777 -= 1311199625) * -628853575]);
		} else if (local36 == Class519.aClass519_2) {
			if (Class143.aClass143_69 == local9.aClass143_6) {
				Class240.method26227(local9, (short) -16028);
			}
			local31.method37001(local9, arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997], 2100447400);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!abq", name = "<init>", descriptor = "(Lclient!zy;Lclient!zv;Lclient!pf;Lclient!xl;ILclient!aba;)V")
	public Class41(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) Class664 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface3 arg5) {
		this.aClass480_74 = arg2;
		this.aClass664_31 = arg3;
		this.anInterface3_25 = arg5;
		this.anInt2476 = Class333.method27806(this.aClass480_74, this.aClass664_31, 1627757149) * 895758877;
		this.aClass243_63 = new Class243(arg4);
	}

	@OriginalMember(owner = "client!abq", name = "e", descriptor = "(I)Lclient!ae;")
	@Override
	public final Interface11 method18053(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		@Pc(11) Interface11 local11;
		synchronized (this.aClass243_63) {
			local11 = (Interface11) this.aClass243_63.method26282((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method17926(arg0, (byte) -95);
		local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26253(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abq", name = "t", descriptor = "(II)Lclient!ae;")
	@Override
	public final Interface11 method18054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		@Pc(11) Interface11 local11;
		synchronized (this.aClass243_63) {
			local11 = (Interface11) this.aClass243_63.method26282((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method17926(arg0, (byte) -98);
		local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26253(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abq", name = "g", descriptor = "(IB)Lclient!ae;")
	final Interface11 method17926(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class480 local3 = this.aClass480_74;
		@Pc(12) byte[] local12;
		synchronized (this.aClass480_74) {
			local12 = Class349.method27998(this.aClass480_74, this.aClass664_31, arg0, (byte) -21);
		}
		@Pc(27) Interface11 local27 = this.anInterface3_25.method28276(arg0, this, (byte) 31);
		if (local12 != null) {
			local27.method37006(new Class80_Sub36(local12), 1896589581);
		}
		local27.method37007((byte) 59);
		return local27;
	}

	@OriginalMember(owner = "client!abq", name = "f", descriptor = "(I)I")
	@Override
	public final int method18051(@OriginalArg(0) int arg0) {
		return this.anInt2476 * 462823477;
	}

	@OriginalMember(owner = "client!abq", name = "i", descriptor = "(IS)V")
	public final void method17927(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26256(1693912082);
			this.aClass243_63 = new Class243(arg0);
		}
	}

	@OriginalMember(owner = "client!abq", name = "m", descriptor = "(B)V")
	public void method17928(@OriginalArg(0) byte arg0) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!abq", name = "k", descriptor = "(I)V")
	public void method17929(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!abq", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public final Iterator iterator() {
		return new Class54(this);
	}

	@OriginalMember(owner = "client!abq", name = "r", descriptor = "(I)V")
	public void method17930(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26247(arg0, (byte) 83);
		}
	}

	@OriginalMember(owner = "client!abq", name = "h", descriptor = "(I)V")
	public void method17931(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26247(arg0, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!abq", name = "l", descriptor = "()I")
	@Override
	public final int method18052() {
		return this.anInt2476 * 462823477;
	}

	@OriginalMember(owner = "client!abq", name = "x", descriptor = "()V")
	public void method17932() {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!abq", name = "w", descriptor = "()V")
	public void method17933() {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!abq", name = "u", descriptor = "(I)Lclient!ae;")
	@Override
	public final Interface11 method18055(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		@Pc(11) Interface11 local11;
		synchronized (this.aClass243_63) {
			local11 = (Interface11) this.aClass243_63.method26282((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method17926(arg0, (byte) -47);
		local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26253(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abq", name = "s", descriptor = "(IS)V")
	public void method17934(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26247(arg0, (byte) 15);
		}
	}

	@OriginalMember(owner = "client!abq", name = "q", descriptor = "(I)V")
	public void method17935(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26247(arg0, (byte) 22);
		}
	}

	@OriginalMember(owner = "client!abq", name = "a", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method17936() {
		return new Class54(this);
	}

	@OriginalMember(owner = "client!abq", name = "z", descriptor = "()V")
	public void method17937() {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!abq", name = "p", descriptor = "()V")
	public void method17938() {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!abq", name = "o", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method17939() {
		return new Class54(this);
	}

	@OriginalMember(owner = "client!abq", name = "j", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method17940() {
		return new Class54(this);
	}

	@OriginalMember(owner = "client!abq", name = "y", descriptor = "(I)Lclient!ae;")
	final Interface11 method17941(@OriginalArg(0) int arg0) {
		@Pc(3) Class480 local3 = this.aClass480_74;
		@Pc(12) byte[] local12;
		synchronized (this.aClass480_74) {
			local12 = Class349.method27998(this.aClass480_74, this.aClass664_31, arg0, (byte) 96);
		}
		@Pc(27) Interface11 local27 = this.anInterface3_25.method28276(arg0, this, (byte) -5);
		if (local12 != null) {
			local27.method37006(new Class80_Sub36(local12), 1896589581);
		}
		local27.method37007((byte) -28);
		return local27;
	}

	@OriginalMember(owner = "client!abq", name = "d", descriptor = "()V")
	public void method17942() {
		@Pc(3) Class243 local3 = this.aClass243_63;
		synchronized (this.aClass243_63) {
			this.aClass243_63.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!abq", name = "v", descriptor = "(I)Lclient!ae;")
	final Interface11 method17943(@OriginalArg(0) int arg0) {
		@Pc(3) Class480 local3 = this.aClass480_74;
		@Pc(12) byte[] local12;
		synchronized (this.aClass480_74) {
			local12 = Class349.method27998(this.aClass480_74, this.aClass664_31, arg0, (byte) -29);
		}
		@Pc(27) Interface11 local27 = this.anInterface3_25.method28276(arg0, this, (byte) -10);
		if (local12 != null) {
			local27.method37006(new Class80_Sub36(local12), 1896589581);
		}
		local27.method37007((byte) 30);
		return local27;
	}
}
