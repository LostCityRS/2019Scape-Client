package jagex3;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class459 implements Interface49 {

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!aqd;")
	final Class104_Sub2_Sub1 aClass104_Sub2_Sub1_11;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	final int anInt5234;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	final int anInt5235;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Lclient!ck;")
	final Class206 aClass206_27;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!dg;")
	final Class226 aClass226_30;

	@OriginalMember(owner = "client!of", name = "w", descriptor = "J")
	long aLong281;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;Lclient!dg;III)V")
	Class459(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass104_Sub2_Sub1_11 = arg0;
		this.anInt5234 = arg3;
		this.anInt5235 = arg4;
		this.aClass206_27 = arg1;
		this.aClass226_30 = arg2;
		this.aLong281 = IDirect3DDevice.CreateRenderTarget(this.aClass104_Sub2_Sub1_11.aLong121, arg3, arg4, Class104_Sub2_Sub1.method19546(this.aClass206_27, this.aClass226_30), arg5, 0, false);
		this.aClass104_Sub2_Sub1_11.method20925(this);
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "()I")
	@Override
	public int method31071() {
		return this.anInt5234;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "()I")
	@Override
	public int method31067() {
		return this.anInt5234;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "()V")
	@Override
	public void method29827() {
		if (this.aLong281 != 0L) {
			this.aClass104_Sub2_Sub1_11.method19558(this.aLong281);
			this.aLong281 = 0L;
		}
	}

	@OriginalMember(owner = "client!of", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.aLong281 != 0L) {
			IUnknown.Release(this.aLong281);
			this.aLong281 = 0L;
		}
		this.aClass104_Sub2_Sub1_11.method21139(this);
	}

	@OriginalMember(owner = "client!of", name = "p", descriptor = "()V")
	@Override
	public void method29828() {
		if (this.aLong281 != 0L) {
			this.aClass104_Sub2_Sub1_11.method19558(this.aLong281);
			this.aLong281 = 0L;
		}
	}

	@OriginalMember(owner = "client!of", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method29828();
	}

	@OriginalMember(owner = "client!of", name = "k", descriptor = "()I")
	@Override
	public int method31070() {
		return this.anInt5234;
	}

	@OriginalMember(owner = "client!of", name = "z", descriptor = "()J")
	@Override
	public long method29829() {
		return this.aLong281;
	}

	@OriginalMember(owner = "client!of", name = "w", descriptor = "()I")
	@Override
	public int method31068() {
		return this.anInt5235;
	}

	@OriginalMember(owner = "client!of", name = "l", descriptor = "()I")
	@Override
	public int method31072() {
		return this.anInt5235;
	}

	@OriginalMember(owner = "client!of", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.aLong281 != 0L) {
			IUnknown.Release(this.aLong281);
			this.aLong281 = 0L;
		}
		this.aClass104_Sub2_Sub1_11.method21139(this);
	}

	@OriginalMember(owner = "client!of", name = "hl", descriptor = "()V")
	void method29373() {
		this.method29828();
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()J")
	@Override
	public long method29830() {
		return this.aLong281;
	}

	@OriginalMember(owner = "client!of", name = "n", descriptor = "()I")
	@Override
	public int method31069() {
		return this.anInt5235;
	}
}
