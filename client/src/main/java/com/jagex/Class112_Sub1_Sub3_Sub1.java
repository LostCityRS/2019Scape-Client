package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ata")
public class Class112_Sub1_Sub3_Sub1 extends Class112_Sub1_Sub3 {

	@OriginalMember(owner = "client!ata", name = "m", descriptor = "I")
	static final int anInt3182 = 16;

	@OriginalMember(owner = "client!ata", name = "w", descriptor = "I")
	int anInt3183;

	@OriginalMember(owner = "client!ata", name = "l", descriptor = "I")
	int anInt3184;

	@OriginalMember(owner = "client!ata", name = "u", descriptor = "I")
	int anInt3185;

	@OriginalMember(owner = "client!ata", name = "z", descriptor = "I")
	int anInt3186;

	@OriginalMember(owner = "client!ata", name = "p", descriptor = "Lclient!rh;")
	Interface56 anInterface56_1;

	@OriginalMember(owner = "client!ata", name = "d", descriptor = "[Lclient!rh;")
	final Interface56[] anInterface56Array1 = new Interface56[4];

	@OriginalMember(owner = "client!ata", name = "k", descriptor = "Lclient!aqv;")
	final Class104_Sub2_Sub2 aClass104_Sub2_Sub2_10;

	@OriginalMember(owner = "client!ata", name = "f", descriptor = "I")
	int anInt3181;

	@OriginalMember(owner = "client!ata", name = "<init>", descriptor = "(Lclient!aqv;)V", line = 21)
	Class112_Sub1_Sub3_Sub1(@OriginalArg(0) Class104_Sub2_Sub2 arg0) {
		super(arg0);
		this.aClass104_Sub2_Sub2_10 = arg0;
		@Pc(12) int[] local12 = new int[1];
		if (!this.aClass104_Sub2_Sub2_10.aBoolean475) {
			throw new RuntimeException("");
		}
		OpenGL.glGenFramebuffersEXT(1, local12, 0);
		this.anInt3181 = local12[0];
	}

	@OriginalMember(owner = "client!ata", name = "p", descriptor = "()I", line = 30)
	@Override
	public int method23746() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "d", descriptor = "()I", line = 30)
	@Override
	public int method23736() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "w", descriptor = "()I", line = 30)
	@Override
	public int method23753() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "l", descriptor = "()I", line = 30)
	@Override
	public int method23745() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "u", descriptor = "()I", line = 30)
	@Override
	public int method23744() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "z", descriptor = "()I", line = 30)
	@Override
	public int method23742() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "e", descriptor = "()I", line = 30)
	@Override
	public int method23737() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "n", descriptor = "()I", line = 34)
	@Override
	public int method23738() {
		return this.anInt3184;
	}

	@OriginalMember(owner = "client!ata", name = "r", descriptor = "()I", line = 34)
	@Override
	public int method23748() {
		return this.anInt3184;
	}

	@OriginalMember(owner = "client!ata", name = "c", descriptor = "()I", line = 34)
	@Override
	public int method23747() {
		return this.anInt3184;
	}

	@OriginalMember(owner = "client!ata", name = "b", descriptor = "(ILclient!dp;)V", line = 38)
	@Override
	public void method23435(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3185 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3185 == 0) {
				this.anInt3184 = 0;
				this.anInt3183 = 0;
			}
		} else {
			if (this.anInt3185 == 0) {
				this.anInt3184 = local6.method30888();
				this.anInt3183 = local6.method30890();
				this.method23446();
			} else if (this.anInt3183 != local6.method30890() || this.anInt3184 != local6.method30888()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass104_Sub2_Sub2_10.method20435((byte) -50) == this) {
			this.method23286(arg0);
		} else {
			this.anInt3186 |= local3;
		}
	}

	@OriginalMember(owner = "client!ata", name = "j", descriptor = "(ILclient!dp;)V", line = 38)
	@Override
	public void method23438(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3185 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3185 == 0) {
				this.anInt3184 = 0;
				this.anInt3183 = 0;
			}
		} else {
			if (this.anInt3185 == 0) {
				this.anInt3184 = local6.method30888();
				this.anInt3183 = local6.method30890();
				this.method23446();
			} else if (this.anInt3183 != local6.method30890() || this.anInt3184 != local6.method30888()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass104_Sub2_Sub2_10.method20435((byte) -10) == this) {
			this.method23286(arg0);
		} else {
			this.anInt3186 |= local3;
		}
	}

	@OriginalMember(owner = "client!ata", name = "g", descriptor = "(ILclient!dp;)V", line = 38)
	@Override
	public void method23433(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3185 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3185 == 0) {
				this.anInt3184 = 0;
				this.anInt3183 = 0;
			}
		} else {
			if (this.anInt3185 == 0) {
				this.anInt3184 = local6.method30888();
				this.anInt3183 = local6.method30890();
				this.method23446();
			} else if (this.anInt3183 != local6.method30890() || this.anInt3184 != local6.method30888()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass104_Sub2_Sub2_10.method20435((byte) -78) == this) {
			this.method23286(arg0);
		} else {
			this.anInt3186 |= local3;
		}
	}

	@OriginalMember(owner = "client!ata", name = "i", descriptor = "(ILclient!dp;)V", line = 38)
	@Override
	public void method23439(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3185 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3185 == 0) {
				this.anInt3184 = 0;
				this.anInt3183 = 0;
			}
		} else {
			if (this.anInt3185 == 0) {
				this.anInt3184 = local6.method30888();
				this.anInt3183 = local6.method30890();
				this.method23446();
			} else if (this.anInt3183 != local6.method30890() || this.anInt3184 != local6.method30888()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass104_Sub2_Sub2_10.method20435((byte) -41) == this) {
			this.method23286(arg0);
		} else {
			this.anInt3186 |= local3;
		}
	}

	@OriginalMember(owner = "client!ata", name = "x", descriptor = "(Lclient!dw;)V", line = 67)
	@Override
	public void method23437(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3185 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3185 == 0) {
				this.anInt3184 = 0;
				this.anInt3183 = 0;
			}
		} else {
			if (this.anInt3185 == 0) {
				this.anInt3184 = local2.method30888();
				this.anInt3183 = local2.method30890();
				this.method23446();
			} else if (this.anInt3183 != local2.method30890() || this.anInt3184 != local2.method30888()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass104_Sub2_Sub2_10.method20435((byte) -96) == this) {
			this.method23289();
		} else {
			this.anInt3186 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!ata", name = "t", descriptor = "(Lclient!dw;)V", line = 67)
	@Override
	public void method23440(@OriginalArg(0) Interface19 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3185 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3185 == 0) {
				this.anInt3184 = 0;
				this.anInt3183 = 0;
			}
		} else {
			if (this.anInt3185 == 0) {
				this.anInt3184 = local2.method30888();
				this.anInt3183 = local2.method30890();
				this.method23446();
			} else if (this.anInt3183 != local2.method30890() || this.anInt3184 != local2.method30888()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass104_Sub2_Sub2_10.method20435((byte) -65) == this) {
			this.method23289();
		} else {
			this.anInt3186 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!ata", name = "as", descriptor = "(I)V", line = 95)
	void method23286(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method30895(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!ata", name = "am", descriptor = "(I)V", line = 95)
	void method23287(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method30895(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!ata", name = "ad", descriptor = "(I)V", line = 95)
	void method23288(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method30895(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!ata", name = "at", descriptor = "()V", line = 103)
	void method23289() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30895(36096);
		}
	}

	@OriginalMember(owner = "client!ata", name = "ar", descriptor = "()V", line = 103)
	void method23290() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30895(36096);
		}
	}

	@OriginalMember(owner = "client!ata", name = "au", descriptor = "()V", line = 103)
	void method23291() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30895(36096);
		}
	}

	@OriginalMember(owner = "client!ata", name = "al", descriptor = "()Z", line = 110)
	@Override
	public boolean method23444() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!ata", name = "h", descriptor = "()Z", line = 110)
	@Override
	public boolean method23442() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!ata", name = "ah", descriptor = "()Z", line = 110)
	@Override
	public boolean method23443() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!ata", name = "k", descriptor = "()Z", line = 118)
	@Override
	boolean method23740() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3181);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3186 & 0x1 << local5) != 0) {
				this.method23286(local5);
			}
		}
		if ((this.anInt3186 & 0x10) != 0) {
			this.method23289();
		}
		this.anInt3186 = 0;
		return super.method23740();
	}

	@OriginalMember(owner = "client!ata", name = "v", descriptor = "()Z", line = 118)
	@Override
	boolean method23749() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3181);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3186 & 0x1 << local5) != 0) {
				this.method23286(local5);
			}
		}
		if ((this.anInt3186 & 0x10) != 0) {
			this.method23289();
		}
		this.anInt3186 = 0;
		return super.method23740();
	}

	@OriginalMember(owner = "client!ata", name = "o", descriptor = "()Z", line = 118)
	@Override
	boolean method23743() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3181);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3186 & 0x1 << local5) != 0) {
				this.method23286(local5);
			}
		}
		if ((this.anInt3186 & 0x10) != 0) {
			this.method23289();
		}
		this.anInt3186 = 0;
		return super.method23740();
	}

	@OriginalMember(owner = "client!ata", name = "f", descriptor = "()Z", line = 128)
	@Override
	boolean method23741() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!ata", name = "s", descriptor = "()Z", line = 128)
	@Override
	boolean method23750() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!ata", name = "a", descriptor = "(IIIIIIZZ)V", line = 133)
	@Override
	public void method23436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3184;
		@Pc(12) int local12 = this.aClass104_Sub2_Sub2_10.method20435((byte) -128).method23738();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3181);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!ata", name = "ae", descriptor = "(IIIIIIZZ)V", line = 133)
	@Override
	public void method23441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3184;
		@Pc(12) int local12 = this.aClass104_Sub2_Sub2_10.method20435((byte) -12).method23738();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3181);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!ata", name = "ag", descriptor = "(IIIIIIZZ)V", line = 133)
	@Override
	public void method23434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3184;
		@Pc(12) int local12 = this.aClass104_Sub2_Sub2_10.method20435((byte) -88).method23738();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3181);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!ata", name = "q", descriptor = "()V", line = 146)
	@Override
	public void method23751() {
		if (this.anInt3181 != 0) {
			this.aClass104_Sub2_Sub2_10.method21320(this.anInt3181);
			this.anInt3181 = 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "m", descriptor = "()V", line = 146)
	@Override
	public void method23739() {
		if (this.anInt3181 != 0) {
			this.aClass104_Sub2_Sub2_10.method21320(this.anInt3181);
			this.anInt3181 = 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "y", descriptor = "()V", line = 146)
	@Override
	public void method23752() {
		if (this.anInt3181 != 0) {
			this.aClass104_Sub2_Sub2_10.method21320(this.anInt3181);
			this.anInt3181 = 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "finalize", descriptor = "()V", line = 153)
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		this.method23739();
	}

	@OriginalMember(owner = "client!ata", name = "hl", descriptor = "()V", line = 153)
	void method23292() throws Throwable {
		super.finalize();
		this.method23739();
	}
}
