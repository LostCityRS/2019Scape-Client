package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adt")
public class Class88_Sub2 extends Class88 {

	@OriginalMember(owner = "client!adt", name = "s", descriptor = "I")
	final int anInt2546;

	@OriginalMember(owner = "client!adt", name = "y", descriptor = "I")
	final int anInt2545;

	@OriginalMember(owner = "client!adt", name = "<init>", descriptor = "(Lclient!afa;IIIII)V")
	Class88_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, Class206.aClass206_20, Class226.aClass226_22, arg4 * arg5, false);
		this.anInt2546 = arg4;
		this.anInt2545 = arg5;
		this.aClass104_Sub1_34.method3804(this);
		@Pc(24) Class112 local24 = this.aClass104_Sub1_34.method20446((byte) -90);
		if (local24 != null) {
			@Pc(33) int local33 = local24.method23749() - (arg3 + arg5);
			@Pc(39) int local39 = Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17);
			OpenGL.glCopyTexImage2D(this.anInt2543, 0, local39, arg2, local33, arg4, arg5, 0);
		}
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adt", name = "<init>", descriptor = "(Lclient!afa;IIIZ[IIIZ)V")
	Class88_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, Class206.aClass206_22, Class226.aClass226_22, arg2 * arg3, arg4);
		this.anInt2546 = arg2;
		this.anInt2545 = arg3;
		if (arg8) {
			@Pc(21) int[] local21 = new int[arg5.length];
			for (@Pc(23) int local23 = 0; local23 < arg3; local23++) {
				@Pc(30) int local30 = local23 * arg2;
				@Pc(38) int local38 = (arg3 - local23 - 1) * arg2;
				for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
					local21[local30++] = arg5[local38++];
				}
			}
			arg5 = local21;
		}
		this.aClass104_Sub1_34.method3804(this);
		if (this.anInt2543 != 34037 && arg4 && arg6 == 0 && arg7 == 0) {
			method18080(this.anInt2543, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), this.anInt2546, this.anInt2545, 32993, this.aClass104_Sub1_34.anInt527, arg5);
			this.method18089(true);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(this.anInt2543, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), this.anInt2546, this.anInt2545, 0, 32993, this.aClass104_Sub1_34.anInt527, arg5, arg7 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method18089(false);
		}
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adt", name = "<init>", descriptor = "(Lclient!afa;ILclient!ck;Lclient!dg;IIZ[BLclient!ck;Z)V")
	Class88_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) Class206 arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.anInt2546 = arg4;
		this.anInt2545 = arg5;
		if (arg9) {
			@Pc(21) byte[] local21 = new byte[arg7.length];
			for (@Pc(23) int local23 = 0; local23 < arg5; local23++) {
				@Pc(30) int local30 = local23 * arg4;
				@Pc(38) int local38 = (arg5 - local23 - 1) * arg4;
				for (@Pc(40) int local40 = 0; local40 < arg4; local40++) {
					local21[local30++] = arg7[local38++];
				}
			}
			arg7 = local21;
		}
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg6 && this.anInt2543 != 34037) {
			method18078(arg1, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), arg4, arg5, arg8, arg7);
			this.method18089(true);
		} else {
			OpenGL.glTexImage2Dub(this.anInt2543, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), this.anInt2546, this.anInt2545, 0, Class104_Sub1.method3926(arg8), 5121, arg7, 0);
			this.method18089(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adt", name = "<init>", descriptor = "(Lclient!afa;ILclient!ck;Lclient!dg;IIZ[FLclient!ck;)V")
	Class88_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) Class206 arg8) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, arg6);
		this.anInt2546 = arg4;
		this.anInt2545 = arg5;
		this.aClass104_Sub1_34.method3804(this);
		if (arg6 && this.anInt2543 != 34037) {
			method18062(arg1, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), arg4, arg5, arg8, arg7);
			this.method18089(true);
		} else {
			OpenGL.glTexImage2Df(this.anInt2543, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), this.anInt2546, this.anInt2545, 0, Class104_Sub1.method3926(arg8), 5126, arg7, 0);
			this.method18089(false);
		}
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adt", name = "<init>", descriptor = "(Lclient!afa;ILclient!ck;Lclient!dg;II)V")
	Class88_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4 * arg5, false);
		this.anInt2546 = arg4;
		this.anInt2545 = arg5;
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glTexImage2Dub(this.anInt2543, 0, Class104_Sub1.method3826(this.aClass206_16, this.aClass226_17), arg4, arg5, 0, Class104_Sub1.method3926(this.aClass206_16), 5121, null, 0);
		this.method18053(true);
	}

	@OriginalMember(owner = "client!adt", name = "bx", descriptor = "(I)Lclient!dp;")
	final Interface18 method18091(@OriginalArg(0) int arg0) {
		return new Class213(this, arg0);
	}

	@OriginalMember(owner = "client!adt", name = "ar", descriptor = "(ZZ)V")
	final void method18092(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt2543 == 3553) {
			this.aClass104_Sub1_34.method3804(this);
			OpenGL.glTexParameteri(this.anInt2543, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt2543, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!adt", name = "aq", descriptor = "(IIII[IIIZ)V")
	final void method18093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		if (arg7) {
			@Pc(10) int[] local10 = new int[arg2 * arg3];
			for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
				@Pc(19) int local19 = local12 * arg2;
				@Pc(29) int local29 = (arg3 - local12 - 1) * arg6 + arg5;
				for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
					local10[local19++] = arg4[local29++];
				}
			}
			arg4 = local10;
		}
		this.aClass104_Sub1_34.method3804(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt2543, 0, arg0, this.anInt2545 - arg1 - arg3, arg2, arg3, 32993, this.aClass104_Sub1_34.anInt527, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!adt", name = "ax", descriptor = "(IIII[I[II)V")
	final void method18094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt2546 * this.anInt2545] : arg5;
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glGetTexImagei(this.anInt2543, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, (arg1 + (arg3 - 1) - local24) * this.anInt2546, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!adt", name = "av", descriptor = "(IIIIII)V")
	final void method18095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class112 local4 = this.aClass104_Sub1_34.method20446((byte) -4);
		if (local4 != null) {
			@Pc(13) int local13 = local4.method23749() - (arg5 + arg3);
			this.aClass104_Sub1_34.method3804(this);
			OpenGL.glCopyTexSubImage2D(this.anInt2543, 0, arg0, this.anInt2545 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!adt", name = "bh", descriptor = "(I)Lclient!dp;")
	final Interface18 method18096(@OriginalArg(0) int arg0) {
		return new Class213(this, arg0);
	}

	@OriginalMember(owner = "client!adt", name = "aj", descriptor = "(I)Lclient!dp;")
	final Interface18 method18097(@OriginalArg(0) int arg0) {
		return new Class213(this, arg0);
	}

	@OriginalMember(owner = "client!adt", name = "ay", descriptor = "(ZZ)V")
	final void method18098(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt2543 == 3553) {
			this.aClass104_Sub1_34.method3804(this);
			OpenGL.glTexParameteri(this.anInt2543, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt2543, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!adt", name = "ab", descriptor = "(ZZ)V")
	final void method18099(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (this.anInt2543 == 3553) {
			this.aClass104_Sub1_34.method3804(this);
			OpenGL.glTexParameteri(this.anInt2543, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(this.anInt2543, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!adt", name = "ao", descriptor = "(I)Lclient!dw;")
	final Interface19 method18100(@OriginalArg(0) int arg0) {
		return new Class213(this, arg0);
	}

	@OriginalMember(owner = "client!adt", name = "aa", descriptor = "(IIII[BLclient!ck;IIZ)V")
	final void method18101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			@Pc(10) int local10 = arg5.anInt3389 * -1639868421;
			@Pc(14) int local14 = local10 * arg2;
			@Pc(18) int local18 = local10 * arg7;
			@Pc(23) byte[] local23 = new byte[local14 * arg3];
			for (@Pc(25) int local25 = 0; local25 < arg3; local25++) {
				@Pc(32) int local32 = local25 * local14;
				@Pc(42) int local42 = (arg3 - local25 - 1) * local18 + arg6;
				for (@Pc(44) int local44 = 0; local44 < local14; local44++) {
					local23[local32++] = arg4[local42++];
				}
			}
			arg4 = local23;
		}
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt2543, 0, arg0, this.anInt2545 - arg1 - arg3, arg2, arg3, Class104_Sub1.method3926(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!adt", name = "af", descriptor = "(IIII[IIIZ)V")
	final void method18102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg6 == 0) {
			arg6 = arg2;
		}
		if (arg7) {
			@Pc(10) int[] local10 = new int[arg2 * arg3];
			for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
				@Pc(19) int local19 = local12 * arg2;
				@Pc(29) int local29 = (arg3 - local12 - 1) * arg6 + arg5;
				for (@Pc(31) int local31 = 0; local31 < arg2; local31++) {
					local10[local19++] = arg4[local29++];
				}
			}
			arg4 = local10;
		}
		this.aClass104_Sub1_34.method3804(this);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, arg6);
		}
		OpenGL.glTexSubImage2Di(this.anInt2543, 0, arg0, this.anInt2545 - arg1 - arg3, arg2, arg3, 32993, this.aClass104_Sub1_34.anInt527, arg4, arg5);
		if (arg2 != arg6) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!adt", name = "ak", descriptor = "(IIII[I[II)V")
	final void method18103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt2546 * this.anInt2545] : arg5;
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glGetTexImagei(this.anInt2543, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, (arg1 + (arg3 - 1) - local24) * this.anInt2546, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!adt", name = "an", descriptor = "(IIII[I[II)V")
	final void method18104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt2546 * this.anInt2545] : arg5;
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glGetTexImagei(this.anInt2543, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, (arg1 + (arg3 - 1) - local24) * this.anInt2546, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!adt", name = "az", descriptor = "(IIII[BLclient!ck;IIZ)V")
	final void method18105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			@Pc(10) int local10 = arg5.anInt3389 * -1639868421;
			@Pc(14) int local14 = local10 * arg2;
			@Pc(18) int local18 = local10 * arg7;
			@Pc(23) byte[] local23 = new byte[local14 * arg3];
			for (@Pc(25) int local25 = 0; local25 < arg3; local25++) {
				@Pc(32) int local32 = local25 * local14;
				@Pc(42) int local42 = (arg3 - local25 - 1) * local18 + arg6;
				for (@Pc(44) int local44 = 0; local44 < local14; local44++) {
					local23[local32++] = arg4[local42++];
				}
			}
			arg4 = local23;
		}
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt2543, 0, arg0, this.anInt2545 - arg1 - arg3, arg2, arg3, Class104_Sub1.method3926(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!adt", name = "bl", descriptor = "(IIII[I[II)V")
	final void method18106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt2546 * this.anInt2545] : arg5;
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glGetTexImagei(this.anInt2543, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, (arg1 + (arg3 - 1) - local24) * this.anInt2546, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!adt", name = "bf", descriptor = "(IIII[I[II)V")
	final void method18107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int[] local10 = arg5 == null ? new int[this.anInt2546 * this.anInt2545] : arg5;
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glGetTexImagei(this.anInt2543, 0, 32993, 5121, local10, 0);
		for (@Pc(24) int local24 = 0; local24 < arg3; local24++) {
			System.arraycopy(local10, (arg1 + (arg3 - 1) - local24) * this.anInt2546, arg4, arg6 + local24 * arg2, arg2);
		}
	}

	@OriginalMember(owner = "client!adt", name = "bc", descriptor = "(I)Lclient!dp;")
	final Interface18 method18108(@OriginalArg(0) int arg0) {
		return new Class213(this, arg0);
	}

	@OriginalMember(owner = "client!adt", name = "bk", descriptor = "(IIIIII)V")
	final void method18109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) Class112 local4 = this.aClass104_Sub1_34.method20446((byte) -89);
		if (local4 != null) {
			@Pc(13) int local13 = local4.method23749() - (arg5 + arg3);
			this.aClass104_Sub1_34.method3804(this);
			OpenGL.glCopyTexSubImage2D(this.anInt2543, 0, arg0, this.anInt2545 - (arg1 + arg3), arg4, local13, arg2, arg3);
			OpenGL.glFlush();
		}
	}

	@OriginalMember(owner = "client!adt", name = "bd", descriptor = "(I)Lclient!dp;")
	final Interface18 method18110(@OriginalArg(0) int arg0) {
		return new Class213(this, arg0);
	}

	@OriginalMember(owner = "client!adt", name = "ap", descriptor = "(IIII[BLclient!ck;IIZ)V")
	final void method18111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg7 == 0) {
			arg7 = arg2;
		}
		if (arg8) {
			@Pc(10) int local10 = arg5.anInt3389 * -1639868421;
			@Pc(14) int local14 = local10 * arg2;
			@Pc(18) int local18 = local10 * arg7;
			@Pc(23) byte[] local23 = new byte[local14 * arg3];
			for (@Pc(25) int local25 = 0; local25 < arg3; local25++) {
				@Pc(32) int local32 = local25 * local14;
				@Pc(42) int local42 = (arg3 - local25 - 1) * local18 + arg6;
				for (@Pc(44) int local44 = 0; local44 < local14; local44++) {
					local23[local32++] = arg4[local42++];
				}
			}
			arg4 = local23;
		}
		this.aClass104_Sub1_34.method3804(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, arg7);
		}
		OpenGL.glTexSubImage2Dub(this.anInt2543, 0, arg0, this.anInt2545 - arg1 - arg3, arg2, arg3, Class104_Sub1.method3926(arg5), 5121, arg4, arg6);
		if (arg7 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
