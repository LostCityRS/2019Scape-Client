package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!are")
public class Class93_Sub26_Sub4 extends Class93_Sub26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!are", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!are", name = "k", descriptor = "J")
	long aLong142;

	@OriginalMember(owner = "client!are", name = "f", descriptor = "Ljava/lang/String;")
	String aString94;

	@OriginalMember(owner = "client!are", name = "<init>", descriptor = "(Lclient!kd;)V", line = 181)
	Class93_Sub26_Sub4(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
		this.aLong142 = -6138163759650107551L;
		this.aString94 = null;
	}

	@OriginalMember(owner = "client!are", name = "e", descriptor = "(Lclient!alw;B)V", line = 184)
	@Override
	void method21992(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		if (arg0.g1((short) 16384) != 255) {
			arg0.pos -= -1445626955;
			this.aLong142 = arg0.g8(1118745192) * 6138163759650107551L;
		}
		this.aString94 = arg0.fastgstr((byte) 89);
	}

	@OriginalMember(owner = "client!are", name = "m", descriptor = "(Lclient!alw;)V", line = 184)
	@Override
	void method21994(@OriginalArg(0) Packet arg0) {
		if (arg0.g1((short) 16384) != 255) {
			arg0.pos -= -1445626955;
			this.aLong142 = arg0.g8(188401394) * 6138163759650107551L;
		}
		this.aString94 = arg0.fastgstr((byte) 103);
	}

	@OriginalMember(owner = "client!are", name = "n", descriptor = "(Lclient!kr;I)V", line = 192)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28199(this.aLong142 * -9204470119279482017L, this.aString94, -811892310);
	}

	@OriginalMember(owner = "client!are", name = "k", descriptor = "(Lclient!kr;)V", line = 192)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28199(this.aLong142 * -9204470119279482017L, this.aString94, -811892310);
	}

	@OriginalMember(owner = "client!are", name = "f", descriptor = "(Lclient!kr;)V", line = 192)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28199(this.aLong142 * -9204470119279482017L, this.aString94, -811892310);
	}

	@OriginalMember(owner = "client!are", name = "w", descriptor = "(Lclient!kr;)V", line = 192)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28199(this.aLong142 * -9204470119279482017L, this.aString94, -811892310);
	}
}
