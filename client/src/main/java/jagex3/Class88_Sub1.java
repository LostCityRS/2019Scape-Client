package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adq")
public final class Class88_Sub1 extends Class88 {

	@OriginalMember(owner = "client!adq", name = "h", descriptor = "I")
	static final int anInt284 = 34074;

	@OriginalMember(owner = "client!adq", name = "y", descriptor = "I")
	static final int anInt285 = 34070;

	@OriginalMember(owner = "client!adq", name = "q", descriptor = "I")
	static final int anInt286 = 34071;

	@OriginalMember(owner = "client!adq", name = "s", descriptor = "I")
	static final int anInt287 = 34069;

	@OriginalMember(owner = "client!adq", name = "b", descriptor = "I")
	static final int anInt288 = 34073;

	@OriginalMember(owner = "client!adq", name = "x", descriptor = "I")
	static final int anInt289 = 34072;

	@OriginalMember(owner = "client!adq", name = "a", descriptor = "I")
	final int anInt290;

	@OriginalMember(owner = "client!adq", name = "<init>", descriptor = "(Lclient!afa;Lclient!ck;Lclient!dg;IZ[[BLclient!ck;)V")
	Class88_Sub1(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) Class206 arg6) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt290 = arg3;
		this.aClass104_Sub1_34.method3804(this);
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			OpenGL.glTexImage2Dub(local20 + 34069, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), arg3, arg3, 0, Class104_Sub1.method3926(arg6), 5121, arg5[local20], 0);
		}
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adq", name = "<init>", descriptor = "(Lclient!afa;Lclient!ck;Lclient!dg;IZ[[I)V")
	Class88_Sub1(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[][] arg5) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, arg4);
		this.anInt290 = arg3;
		this.aClass104_Sub1_34.method3804(this);
		@Pc(22) int local22;
		if (arg4) {
			for (local22 = 0; local22 < 6; local22++) {
				method18080(local22 + 34069, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), arg3, arg3, 32993, this.aClass104_Sub1_34.anInt527, arg5[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), arg3, arg3, 0, 32993, this.aClass104_Sub1_34.anInt527, arg5[local22], 0);
			}
		}
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adq", name = "<init>", descriptor = "(Lclient!afa;Lclient!ck;Lclient!dg;I)V")
	Class88_Sub1(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3) {
		super(arg0, 34067, arg1, arg2, arg3 * arg3 * 6, false);
		this.anInt290 = arg3;
		this.aClass104_Sub1_34.method3804(this);
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			OpenGL.glTexImage2Dub(local20 + 34069, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), arg3, arg3, 0, Class104_Sub1.method3926(this.aClass206_16), 5121, null, 0);
		}
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adq", name = "ar", descriptor = "(II)Lclient!dp;")
	Interface18 method1592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class204(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!adq", name = "ap", descriptor = "(II)Lclient!dp;")
	Interface18 method1593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class204(this, arg0, arg1);
	}
}
