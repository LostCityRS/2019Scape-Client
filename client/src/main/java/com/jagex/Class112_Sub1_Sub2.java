package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!app")
public final class Class112_Sub1_Sub2 extends Class112_Sub1 {

	@OriginalMember(owner = "client!app", name = "n", descriptor = "I")
	static final int anInt2535 = 16;

	@OriginalMember(owner = "client!app", name = "w", descriptor = "I")
	int anInt2530;

	@OriginalMember(owner = "client!app", name = "u", descriptor = "I")
	int anInt2532;

	@OriginalMember(owner = "client!app", name = "f", descriptor = "I")
	int anInt2533;

	@OriginalMember(owner = "client!app", name = "l", descriptor = "I")
	int anInt2534;

	@OriginalMember(owner = "client!app", name = "z", descriptor = "Lclient!ce;")
	Interface15 anInterface15_1;

	@OriginalMember(owner = "client!app", name = "p", descriptor = "[Lclient!ce;")
	final Interface15[] anInterface15Array1 = new Interface15[4];

	@OriginalMember(owner = "client!app", name = "m", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_33;

	@OriginalMember(owner = "client!app", name = "k", descriptor = "I")
	int anInt2531;

	@OriginalMember(owner = "client!app", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class112_Sub1_Sub2(@OriginalArg(0) Class104_Sub1 arg0) {
		if (!arg0.aBoolean90) {
			throw new IllegalStateException("");
		}
		this.aClass104_Sub1_33 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, local19, 0);
		this.anInt2531 = local19[0];
	}

	@OriginalMember(owner = "client!app", name = "hl", descriptor = "()V")
	void method18021() throws Throwable {
		super.finalize();
		this.method23750();
	}

	@OriginalMember(owner = "client!app", name = "e", descriptor = "()I")
	@Override
	public int method23748() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "n", descriptor = "()I")
	@Override
	public int method23749() {
		return this.anInt2530;
	}

	@OriginalMember(owner = "client!app", name = "h", descriptor = "()Z")
	@Override
	public boolean method23453() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!app", name = "x", descriptor = "(Lclient!dw;)V")
	@Override
	public void method23448(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Interface15 local2 = (Interface15) arg0;
		if (arg0 == null) {
			this.anInt2534 &= 0xFFFFFFEF;
			this.anInterface15_1 = null;
			if (this.anInt2534 == 0) {
				this.anInt2530 = 0;
				this.anInt2533 = 0;
			}
		} else {
			if ((this.anInt2534 | 0x10) == 16) {
				this.anInt2530 = local2.method31069();
				this.anInt2533 = local2.method31071();
				if (this.aClass104_Sub1_33.method20446((byte) -49) == this) {
					this.aClass104_Sub1_33.method3784();
				}
			} else if (this.anInt2533 != local2.method31071() || this.anInt2530 != local2.method31069()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= 0x10;
			this.anInterface15_1 = local2;
		}
		if (this.aClass104_Sub1_33.method20446((byte) -87) == this) {
			this.method18025();
		} else {
			this.anInt2532 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!app", name = "ac", descriptor = "(I)V")
	void method18022(@OriginalArg(0) int arg0) {
		@Pc(4) Interface15 local4 = this.anInterface15Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method25549(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!app", name = "u", descriptor = "()I")
	@Override
	public int method23755() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "y", descriptor = "()V")
	@Override
	public void method23763() {
		if (this.anInt2531 != 0) {
			this.aClass104_Sub1_33.method3829(this.anInt2531);
			this.anInt2531 = 0;
		}
	}

	@OriginalMember(owner = "client!app", name = "k", descriptor = "()Z")
	@Override
	boolean method23751() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2531);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2532 & 0x1 << local5) != 0) {
				this.method18022(local5);
			}
		}
		if ((this.anInt2532 & 0x10) != 0) {
			this.method18025();
		}
		this.anInt2532 = 0;
		this.aClass104_Sub1_33.method3910();
		return true;
	}

	@OriginalMember(owner = "client!app", name = "f", descriptor = "()Z")
	@Override
	boolean method23752() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!app", name = "b", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23446(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface15 local6 = (Interface15) arg1;
		if (arg1 == null) {
			this.anInt2534 &= ~local3;
			this.anInterface15Array1[arg0] = null;
			if (this.anInt2534 == 0) {
				this.anInt2530 = 0;
				this.anInt2533 = 0;
			}
		} else {
			if ((this.anInt2534 | local3) == local3) {
				this.anInt2530 = local6.method31069();
				this.anInt2533 = local6.method31071();
				if (this.aClass104_Sub1_33.method20446((byte) -112) == this) {
					this.aClass104_Sub1_33.method3784();
				}
			} else if (this.anInt2533 != local6.method31071() || this.anInt2530 != local6.method31069()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= local3;
			this.anInterface15Array1[arg0] = local6;
		}
		if (this.aClass104_Sub1_33.method20446((byte) -60) == this) {
			this.method18022(arg0);
		} else {
			this.anInt2532 |= local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "d", descriptor = "()I")
	@Override
	public int method23747() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "m", descriptor = "()V")
	@Override
	public void method23750() {
		if (this.anInt2531 != 0) {
			this.aClass104_Sub1_33.method3829(this.anInt2531);
			this.anInt2531 = 0;
		}
	}

	@OriginalMember(owner = "client!app", name = "z", descriptor = "()I")
	@Override
	public int method23753() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "w", descriptor = "()I")
	@Override
	public int method23764() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "as", descriptor = "()V")
	void method18023() {
		if (this.anInterface15_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface15_1.method25549(36096);
		}
	}

	@OriginalMember(owner = "client!app", name = "ad", descriptor = "(I)V")
	void method18024(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!app", name = "i", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23450(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface15 local6 = (Interface15) arg1;
		if (arg1 == null) {
			this.anInt2534 &= ~local3;
			this.anInterface15Array1[arg0] = null;
			if (this.anInt2534 == 0) {
				this.anInt2530 = 0;
				this.anInt2533 = 0;
			}
		} else {
			if ((this.anInt2534 | local3) == local3) {
				this.anInt2530 = local6.method31069();
				this.anInt2533 = local6.method31071();
				if (this.aClass104_Sub1_33.method20446((byte) -40) == this) {
					this.aClass104_Sub1_33.method3784();
				}
			} else if (this.anInt2533 != local6.method31071() || this.anInt2530 != local6.method31069()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= local3;
			this.anInterface15Array1[arg0] = local6;
		}
		if (this.aClass104_Sub1_33.method20446((byte) -105) == this) {
			this.method18022(arg0);
		} else {
			this.anInt2532 |= local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "ae", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2530;
		@Pc(12) int local12 = this.aClass104_Sub1_33.method20446((byte) -83).method23749();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2531);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!app", name = "ai", descriptor = "()V")
	void method18025() {
		if (this.anInterface15_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface15_1.method25549(36096);
		}
	}

	@OriginalMember(owner = "client!app", name = "c", descriptor = "()I")
	@Override
	public int method23758() {
		return this.anInt2530;
	}

	@OriginalMember(owner = "client!app", name = "r", descriptor = "()I")
	@Override
	public int method23759() {
		return this.anInt2530;
	}

	@OriginalMember(owner = "client!app", name = "g", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23444(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface15 local6 = (Interface15) arg1;
		if (arg1 == null) {
			this.anInt2534 &= ~local3;
			this.anInterface15Array1[arg0] = null;
			if (this.anInt2534 == 0) {
				this.anInt2530 = 0;
				this.anInt2533 = 0;
			}
		} else {
			if ((this.anInt2534 | local3) == local3) {
				this.anInt2530 = local6.method31069();
				this.anInt2533 = local6.method31071();
				if (this.aClass104_Sub1_33.method20446((byte) -48) == this) {
					this.aClass104_Sub1_33.method3784();
				}
			} else if (this.anInt2533 != local6.method31071() || this.anInt2530 != local6.method31069()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= local3;
			this.anInterface15Array1[arg0] = local6;
		}
		if (this.aClass104_Sub1_33.method20446((byte) 2) == this) {
			this.method18022(arg0);
		} else {
			this.anInt2532 |= local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "ag", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2530;
		@Pc(12) int local12 = this.aClass104_Sub1_33.method20446((byte) -14).method23749();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2531);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!app", name = "j", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23449(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface15 local6 = (Interface15) arg1;
		if (arg1 == null) {
			this.anInt2534 &= ~local3;
			this.anInterface15Array1[arg0] = null;
			if (this.anInt2534 == 0) {
				this.anInt2530 = 0;
				this.anInt2533 = 0;
			}
		} else {
			if ((this.anInt2534 | local3) == local3) {
				this.anInt2530 = local6.method31069();
				this.anInt2533 = local6.method31071();
				if (this.aClass104_Sub1_33.method20446((byte) -84) == this) {
					this.aClass104_Sub1_33.method3784();
				}
			} else if (this.anInt2533 != local6.method31071() || this.anInt2530 != local6.method31069()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= local3;
			this.anInterface15Array1[arg0] = local6;
		}
		if (this.aClass104_Sub1_33.method20446((byte) -75) == this) {
			this.method18022(arg0);
		} else {
			this.anInt2532 |= local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "t", descriptor = "(Lclient!dw;)V")
	@Override
	public void method23451(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Interface15 local2 = (Interface15) arg0;
		if (arg0 == null) {
			this.anInt2534 &= 0xFFFFFFEF;
			this.anInterface15_1 = null;
			if (this.anInt2534 == 0) {
				this.anInt2530 = 0;
				this.anInt2533 = 0;
			}
		} else {
			if ((this.anInt2534 | 0x10) == 16) {
				this.anInt2530 = local2.method31069();
				this.anInt2533 = local2.method31071();
				if (this.aClass104_Sub1_33.method20446((byte) -44) == this) {
					this.aClass104_Sub1_33.method3784();
				}
			} else if (this.anInt2533 != local2.method31071() || this.anInt2530 != local2.method31069()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= 0x10;
			this.anInterface15_1 = local2;
		}
		if (this.aClass104_Sub1_33.method20446((byte) -81) == this) {
			this.method18025();
		} else {
			this.anInt2532 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!app", name = "v", descriptor = "()Z")
	@Override
	boolean method23760() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2531);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2532 & 0x1 << local5) != 0) {
				this.method18022(local5);
			}
		}
		if ((this.anInt2532 & 0x10) != 0) {
			this.method18025();
		}
		this.anInt2532 = 0;
		this.aClass104_Sub1_33.method3910();
		return true;
	}

	@OriginalMember(owner = "client!app", name = "o", descriptor = "()Z")
	@Override
	boolean method23754() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2531);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2532 & 0x1 << local5) != 0) {
				this.method18022(local5);
			}
		}
		if ((this.anInt2532 & 0x10) != 0) {
			this.method18025();
		}
		this.anInt2532 = 0;
		this.aClass104_Sub1_33.method3910();
		return true;
	}

	@OriginalMember(owner = "client!app", name = "s", descriptor = "()Z")
	@Override
	boolean method23761() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!app", name = "ah", descriptor = "()Z")
	@Override
	public boolean method23454() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!app", name = "p", descriptor = "()I")
	@Override
	public int method23757() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "aw", descriptor = "(I)V")
	void method18026(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!app", name = "q", descriptor = "()V")
	@Override
	public void method23762() {
		if (this.anInt2531 != 0) {
			this.aClass104_Sub1_33.method3829(this.anInt2531);
			this.anInt2531 = 0;
		}
	}

	@OriginalMember(owner = "client!app", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2530;
		@Pc(12) int local12 = this.aClass104_Sub1_33.method20446((byte) -35).method23749();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2531);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!app", name = "at", descriptor = "()V")
	void method18027() {
		if (this.anInterface15_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface15_1.method25549(36096);
		}
	}

	@OriginalMember(owner = "client!app", name = "l", descriptor = "()I")
	@Override
	public int method23756() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "al", descriptor = "()Z")
	@Override
	public boolean method23455() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!app", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		this.method23750();
	}
}
