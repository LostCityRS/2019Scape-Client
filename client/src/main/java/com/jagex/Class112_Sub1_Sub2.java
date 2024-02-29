package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!app")
public class Class112_Sub1_Sub2 extends Class112_Sub1 {

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

	@OriginalMember(owner = "client!app", name = "<init>", descriptor = "(Lclient!afa;)V", line = 18)
	Class112_Sub1_Sub2(@OriginalArg(0) Class104_Sub1 arg0) {
		if (!arg0.aBoolean90) {
			throw new IllegalStateException("");
		}
		this.aClass104_Sub1_33 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, local19, 0);
		this.anInt2531 = local19[0];
	}

	@OriginalMember(owner = "client!app", name = "e", descriptor = "()I", line = 27)
	@Override
	public int method23737() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "u", descriptor = "()I", line = 27)
	@Override
	public int method23744() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "d", descriptor = "()I", line = 27)
	@Override
	public int method23736() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "z", descriptor = "()I", line = 27)
	@Override
	public int method23742() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "w", descriptor = "()I", line = 27)
	@Override
	public int method23753() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "p", descriptor = "()I", line = 27)
	@Override
	public int method23746() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "l", descriptor = "()I", line = 27)
	@Override
	public int method23745() {
		return this.anInt2533;
	}

	@OriginalMember(owner = "client!app", name = "n", descriptor = "()I", line = 31)
	@Override
	public int method23738() {
		return this.anInt2530;
	}

	@OriginalMember(owner = "client!app", name = "c", descriptor = "()I", line = 31)
	@Override
	public int method23747() {
		return this.anInt2530;
	}

	@OriginalMember(owner = "client!app", name = "r", descriptor = "()I", line = 31)
	@Override
	public int method23748() {
		return this.anInt2530;
	}

	@OriginalMember(owner = "client!app", name = "b", descriptor = "(ILclient!dp;)V", line = 35)
	@Override
	public void method23435(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
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
				this.anInt2530 = local6.method30888();
				this.anInt2533 = local6.method30890();
				if (this.aClass104_Sub1_33.method20435((byte) -112) == this) {
					this.aClass104_Sub1_33.method3765();
				}
			} else if (this.anInt2533 != local6.method30890() || this.anInt2530 != local6.method30888()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= local3;
			this.anInterface15Array1[arg0] = local6;
		}
		if (this.aClass104_Sub1_33.method20435((byte) -60) == this) {
			this.method18009(arg0);
		} else {
			this.anInt2532 |= local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "i", descriptor = "(ILclient!dp;)V", line = 35)
	@Override
	public void method23439(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
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
				this.anInt2530 = local6.method30888();
				this.anInt2533 = local6.method30890();
				if (this.aClass104_Sub1_33.method20435((byte) -40) == this) {
					this.aClass104_Sub1_33.method3765();
				}
			} else if (this.anInt2533 != local6.method30890() || this.anInt2530 != local6.method30888()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= local3;
			this.anInterface15Array1[arg0] = local6;
		}
		if (this.aClass104_Sub1_33.method20435((byte) -105) == this) {
			this.method18009(arg0);
		} else {
			this.anInt2532 |= local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "g", descriptor = "(ILclient!dp;)V", line = 35)
	@Override
	public void method23433(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
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
				this.anInt2530 = local6.method30888();
				this.anInt2533 = local6.method30890();
				if (this.aClass104_Sub1_33.method20435((byte) -48) == this) {
					this.aClass104_Sub1_33.method3765();
				}
			} else if (this.anInt2533 != local6.method30890() || this.anInt2530 != local6.method30888()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= local3;
			this.anInterface15Array1[arg0] = local6;
		}
		if (this.aClass104_Sub1_33.method20435((byte) 2) == this) {
			this.method18009(arg0);
		} else {
			this.anInt2532 |= local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "j", descriptor = "(ILclient!dp;)V", line = 35)
	@Override
	public void method23438(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
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
				this.anInt2530 = local6.method30888();
				this.anInt2533 = local6.method30890();
				if (this.aClass104_Sub1_33.method20435((byte) -84) == this) {
					this.aClass104_Sub1_33.method3765();
				}
			} else if (this.anInt2533 != local6.method30890() || this.anInt2530 != local6.method30888()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= local3;
			this.anInterface15Array1[arg0] = local6;
		}
		if (this.aClass104_Sub1_33.method20435((byte) -75) == this) {
			this.method18009(arg0);
		} else {
			this.anInt2532 |= local3;
		}
	}

	@OriginalMember(owner = "client!app", name = "x", descriptor = "(Lclient!dw;)V", line = 64)
	@Override
	public void method23437(@OriginalArg(0) Interface19 arg0) {
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
				this.anInt2530 = local2.method30888();
				this.anInt2533 = local2.method30890();
				if (this.aClass104_Sub1_33.method20435((byte) -49) == this) {
					this.aClass104_Sub1_33.method3765();
				}
			} else if (this.anInt2533 != local2.method30890() || this.anInt2530 != local2.method30888()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= 0x10;
			this.anInterface15_1 = local2;
		}
		if (this.aClass104_Sub1_33.method20435((byte) -87) == this) {
			this.method18011();
		} else {
			this.anInt2532 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!app", name = "t", descriptor = "(Lclient!dw;)V", line = 64)
	@Override
	public void method23440(@OriginalArg(0) Interface19 arg0) {
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
				this.anInt2530 = local2.method30888();
				this.anInt2533 = local2.method30890();
				if (this.aClass104_Sub1_33.method20435((byte) -44) == this) {
					this.aClass104_Sub1_33.method3765();
				}
			} else if (this.anInt2533 != local2.method30890() || this.anInt2530 != local2.method30888()) {
				throw new RuntimeException();
			}
			this.anInt2534 |= 0x10;
			this.anInterface15_1 = local2;
		}
		if (this.aClass104_Sub1_33.method20435((byte) -81) == this) {
			this.method18011();
		} else {
			this.anInt2532 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!app", name = "ac", descriptor = "(I)V", line = 92)
	void method18009(@OriginalArg(0) int arg0) {
		@Pc(4) Interface15 local4 = this.anInterface15Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method25456(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!app", name = "as", descriptor = "()V", line = 100)
	void method18010() {
		if (this.anInterface15_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface15_1.method25456(36096);
		}
	}

	@OriginalMember(owner = "client!app", name = "ai", descriptor = "()V", line = 100)
	void method18011() {
		if (this.anInterface15_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface15_1.method25456(36096);
		}
	}

	@OriginalMember(owner = "client!app", name = "at", descriptor = "()V", line = 100)
	void method18012() {
		if (this.anInterface15_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface15_1.method25456(36096);
		}
	}

	@OriginalMember(owner = "client!app", name = "h", descriptor = "()Z", line = 107)
	@Override
	public boolean method23442() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!app", name = "ah", descriptor = "()Z", line = 107)
	@Override
	public boolean method23443() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!app", name = "al", descriptor = "()Z", line = 107)
	@Override
	public boolean method23444() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!app", name = "k", descriptor = "()Z", line = 115)
	@Override
	boolean method23740() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2531);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2532 & 0x1 << local5) != 0) {
				this.method18009(local5);
			}
		}
		if ((this.anInt2532 & 0x10) != 0) {
			this.method18011();
		}
		this.anInt2532 = 0;
		this.aClass104_Sub1_33.method3764();
		return true;
	}

	@OriginalMember(owner = "client!app", name = "v", descriptor = "()Z", line = 115)
	@Override
	boolean method23749() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2531);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2532 & 0x1 << local5) != 0) {
				this.method18009(local5);
			}
		}
		if ((this.anInt2532 & 0x10) != 0) {
			this.method18011();
		}
		this.anInt2532 = 0;
		this.aClass104_Sub1_33.method3764();
		return true;
	}

	@OriginalMember(owner = "client!app", name = "o", descriptor = "()Z", line = 115)
	@Override
	boolean method23743() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2531);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2532 & 0x1 << local5) != 0) {
				this.method18009(local5);
			}
		}
		if ((this.anInt2532 & 0x10) != 0) {
			this.method18011();
		}
		this.anInt2532 = 0;
		this.aClass104_Sub1_33.method3764();
		return true;
	}

	@OriginalMember(owner = "client!app", name = "f", descriptor = "()Z", line = 126)
	@Override
	boolean method23741() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!app", name = "s", descriptor = "()Z", line = 126)
	@Override
	boolean method23750() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!app", name = "ad", descriptor = "(I)V", line = 131)
	void method18013(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!app", name = "aw", descriptor = "(I)V", line = 131)
	void method18014(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!app", name = "ae", descriptor = "(IIIIIIZZ)V", line = 135)
	@Override
	public void method23441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2530;
		@Pc(12) int local12 = this.aClass104_Sub1_33.method20435((byte) -83).method23738();
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

	@OriginalMember(owner = "client!app", name = "ag", descriptor = "(IIIIIIZZ)V", line = 135)
	@Override
	public void method23434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2530;
		@Pc(12) int local12 = this.aClass104_Sub1_33.method20435((byte) -14).method23738();
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

	@OriginalMember(owner = "client!app", name = "a", descriptor = "(IIIIIIZZ)V", line = 135)
	@Override
	public void method23436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2530;
		@Pc(12) int local12 = this.aClass104_Sub1_33.method20435((byte) -35).method23738();
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

	@OriginalMember(owner = "client!app", name = "y", descriptor = "()V", line = 148)
	@Override
	public void method23752() {
		if (this.anInt2531 != 0) {
			this.aClass104_Sub1_33.method3960(this.anInt2531);
			this.anInt2531 = 0;
		}
	}

	@OriginalMember(owner = "client!app", name = "m", descriptor = "()V", line = 148)
	@Override
	public void method23739() {
		if (this.anInt2531 != 0) {
			this.aClass104_Sub1_33.method3960(this.anInt2531);
			this.anInt2531 = 0;
		}
	}

	@OriginalMember(owner = "client!app", name = "q", descriptor = "()V", line = 148)
	@Override
	public void method23751() {
		if (this.anInt2531 != 0) {
			this.aClass104_Sub1_33.method3960(this.anInt2531);
			this.anInt2531 = 0;
		}
	}

	@OriginalMember(owner = "client!app", name = "hl", descriptor = "()V", line = 155)
	void method18015() throws Throwable {
		super.finalize();
		this.method23739();
	}

	@OriginalMember(owner = "client!app", name = "finalize", descriptor = "()V", line = 155)
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		this.method23739();
	}
}
