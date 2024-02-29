package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!are")
public final class Class93_Sub26_Sub4 extends Class93_Sub26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!are", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_4;

	@OriginalMember(owner = "client!are", name = "k", descriptor = "J")
	long aLong142;

	@OriginalMember(owner = "client!are", name = "f", descriptor = "Ljava/lang/String;")
	String aString94;

	@OriginalMember(owner = "client!are", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub4(@OriginalArg(0) Class375 arg0) {
		this.aClass375_4 = arg0;
		this.aLong142 = -6138163759650107551L;
		this.aString94 = null;
	}

	@OriginalMember(owner = "client!are", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			this.aLong142 = arg0.method22435(1118745192) * 6138163759650107551L;
		}
		this.aString94 = arg0.method22438((byte) 89);
	}

	@OriginalMember(owner = "client!are", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			this.aLong142 = arg0.method22435(188401394) * 6138163759650107551L;
		}
		this.aString94 = arg0.method22438((byte) 103);
	}

	@OriginalMember(owner = "client!are", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28398(this.aLong142 * -9204470119279482017L, this.aString94, -811892310);
	}

	@OriginalMember(owner = "client!are", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.method28398(this.aLong142 * -9204470119279482017L, this.aString94, -811892310);
	}

	@OriginalMember(owner = "client!are", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.method28398(this.aLong142 * -9204470119279482017L, this.aString94, -811892310);
	}

	@OriginalMember(owner = "client!are", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.method28398(this.aLong142 * -9204470119279482017L, this.aString94, -811892310);
	}
}
