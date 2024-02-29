package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class Class131 {

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
	static final int anInt1139 = 4;

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
	public int anInt1137;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Lclient!lz;")
	public Interface38 anInterface38_18;

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "Lclient!mr;")
	public Interface44 anInterface44_3;

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "F")
	protected float aFloat122;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "F")
	protected float aFloat123;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	public int anInt1138;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
	public int anInt1140;

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
	public int anInt1141;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "[F")
	public float[] aFloatArray39 = new float[16];

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "[F")
	public float[] aFloatArray40 = new float[16];

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!pq;")
	public final Class489 aClass489_46 = new Class489();

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "Lclient!ox;")
	public final Class472 aClass472_39 = new Class472();

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "Lclient!og;")
	public final Class460 aClass460_8 = new Class460();

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!ox;")
	public final Class472 aClass472_40 = new Class472();

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Lclient!og;")
	public final Class460 aClass460_9 = new Class460();

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "Lclient!ox;")
	public final Class472 aClass472_41 = new Class472();

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!ox;")
	public final Class472 aClass472_42 = new Class472();

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Lclient!ox;")
	public final Class472 aClass472_43 = new Class472();

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "Lclient!ox;")
	public final Class472 aClass472_44 = new Class472();

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "Lclient!ox;")
	public final Class472 aClass472_38 = new Class472();

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "Lclient!pq;")
	public final Class489 aClass489_45 = new Class489();

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "Lclient!afc;")
	protected Class104_Sub2 aClass104_Sub2_18;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!afc;)V")
	Class131(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass104_Sub2_18 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(B)V")
	public final void method10099(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat122 = 32.0F;
				this.aFloat123 = 0.0F;
				break;
			case 2:
				this.aFloat122 = 4.0F;
				this.aFloat123 = 0.0F;
				break;
			case 3:
				this.aFloat122 = 1.0F;
				this.aFloat123 = 0.0F;
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
	public final void method10100(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat122 = 32.0F;
				this.aFloat123 = 0.0F;
				break;
			case 2:
				this.aFloat122 = 4.0F;
				this.aFloat123 = 0.0F;
				break;
			case 3:
				this.aFloat122 = 1.0F;
				this.aFloat123 = 0.0F;
		}
	}

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "(Lclient!pq;)V")
	public abstract void method10101(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "(Z)V")
	public abstract void method10102(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "(I)V")
	public abstract void method10103(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "(Lclient!pq;)V")
	public abstract void method10104(@OriginalArg(0) Class489 arg0);

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "(Z)V")
	public abstract void method10105(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "()V")
	public abstract void method10106();

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "()V")
	public abstract void method10107();

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "(Z)V")
	public abstract void method10108(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "(I)V")
	public abstract void method10109(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(Z)V")
	public abstract void method10110(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "()V")
	public abstract void method10111();

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "(I)V")
	public abstract void method10112(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "(I)V")
	public abstract void method10113(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V")
	public abstract void method10114(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "(I)V")
	public abstract void method10115(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "()V")
	public abstract void method10116();

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(Z)V")
	public abstract void method10117(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "()V")
	public abstract void method10118();

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
	public final void method10119(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat122 = 32.0F;
				this.aFloat123 = 0.0F;
				break;
			case 2:
				this.aFloat122 = 4.0F;
				this.aFloat123 = 0.0F;
				break;
			case 3:
				this.aFloat122 = 1.0F;
				this.aFloat123 = 0.0F;
		}
	}
}
