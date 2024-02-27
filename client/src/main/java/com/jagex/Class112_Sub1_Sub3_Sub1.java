package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ata")
public final class Class112_Sub1_Sub3_Sub1 extends Class112_Sub1_Sub3 {

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

	@OriginalMember(owner = "client!ata", name = "<init>", descriptor = "(Lclient!aqv;)V")
	Class112_Sub1_Sub3_Sub1(@OriginalArg(0) Class104_Sub2_Sub2 arg0) {
		super(arg0);
		this.aClass104_Sub2_Sub2_10 = arg0;
		@Pc(12) int[] local12 = new int[1];
		if (!this.aClass104_Sub2_Sub2_10.aBoolean476) {
			throw new RuntimeException("");
		}
		OpenGL.glGenFramebuffersEXT(1, local12, 0);
		this.anInt3181 = local12[0];
	}

	@OriginalMember(owner = "client!ata", name = "q", descriptor = "()V")
	@Override
	public void method23762() {
		if (this.anInt3181 != 0) {
			this.aClass104_Sub2_Sub2_10.method21318(this.anInt3181);
			this.anInt3181 = 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "al", descriptor = "()Z")
	@Override
	public boolean method23455() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!ata", name = "n", descriptor = "()I")
	@Override
	public int method23749() {
		return this.anInt3184;
	}

	@OriginalMember(owner = "client!ata", name = "b", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23446(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
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
				this.anInt3184 = local6.method31069();
				this.anInt3183 = local6.method31071();
				this.method23458();
			} else if (this.anInt3183 != local6.method31071() || this.anInt3184 != local6.method31069()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass104_Sub2_Sub2_10.method20446((byte) -50) == this) {
			this.method23298(arg0);
		} else {
			this.anInt3186 |= local3;
		}
	}

	@OriginalMember(owner = "client!ata", name = "x", descriptor = "(Lclient!dw;)V")
	@Override
	public void method23448(@OriginalArg(0) Interface19 arg0) {
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
				this.anInt3184 = local2.method31069();
				this.anInt3183 = local2.method31071();
				this.method23458();
			} else if (this.anInt3183 != local2.method31071() || this.anInt3184 != local2.method31069()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass104_Sub2_Sub2_10.method20446((byte) -96) == this) {
			this.method23299();
		} else {
			this.anInt3186 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!ata", name = "as", descriptor = "(I)V")
	void method23298(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method31076(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!ata", name = "at", descriptor = "()V")
	void method23299() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method31076(36096);
		}
	}

	@OriginalMember(owner = "client!ata", name = "p", descriptor = "()I")
	@Override
	public int method23757() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "k", descriptor = "()Z")
	@Override
	boolean method23751() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3181);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3186 & 0x1 << local5) != 0) {
				this.method23298(local5);
			}
		}
		if ((this.anInt3186 & 0x10) != 0) {
			this.method23299();
		}
		this.anInt3186 = 0;
		return super.method23751();
	}

	@OriginalMember(owner = "client!ata", name = "f", descriptor = "()Z")
	@Override
	boolean method23752() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!ata", name = "a", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3184;
		@Pc(12) int local12 = this.aClass104_Sub2_Sub2_10.method20446((byte) -128).method23749();
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

	@OriginalMember(owner = "client!ata", name = "d", descriptor = "()I")
	@Override
	public int method23747() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		this.method23750();
	}

	@OriginalMember(owner = "client!ata", name = "w", descriptor = "()I")
	@Override
	public int method23764() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "l", descriptor = "()I")
	@Override
	public int method23756() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "u", descriptor = "()I")
	@Override
	public int method23755() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "z", descriptor = "()I")
	@Override
	public int method23753() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "m", descriptor = "()V")
	@Override
	public void method23750() {
		if (this.anInt3181 != 0) {
			this.aClass104_Sub2_Sub2_10.method21318(this.anInt3181);
			this.anInt3181 = 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "s", descriptor = "()Z")
	@Override
	boolean method23761() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!ata", name = "j", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23449(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
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
				this.anInt3184 = local6.method31069();
				this.anInt3183 = local6.method31071();
				this.method23458();
			} else if (this.anInt3183 != local6.method31071() || this.anInt3184 != local6.method31069()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass104_Sub2_Sub2_10.method20446((byte) -10) == this) {
			this.method23298(arg0);
		} else {
			this.anInt3186 |= local3;
		}
	}

	@OriginalMember(owner = "client!ata", name = "h", descriptor = "()Z")
	@Override
	public boolean method23453() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!ata", name = "g", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23444(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
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
				this.anInt3184 = local6.method31069();
				this.anInt3183 = local6.method31071();
				this.method23458();
			} else if (this.anInt3183 != local6.method31071() || this.anInt3184 != local6.method31069()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass104_Sub2_Sub2_10.method20446((byte) -78) == this) {
			this.method23298(arg0);
		} else {
			this.anInt3186 |= local3;
		}
	}

	@OriginalMember(owner = "client!ata", name = "i", descriptor = "(ILclient!dp;)V")
	@Override
	public void method23450(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
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
				this.anInt3184 = local6.method31069();
				this.anInt3183 = local6.method31071();
				this.method23458();
			} else if (this.anInt3183 != local6.method31071() || this.anInt3184 != local6.method31069()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass104_Sub2_Sub2_10.method20446((byte) -41) == this) {
			this.method23298(arg0);
		} else {
			this.anInt3186 |= local3;
		}
	}

	@OriginalMember(owner = "client!ata", name = "ar", descriptor = "()V")
	void method23300() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method31076(36096);
		}
	}

	@OriginalMember(owner = "client!ata", name = "t", descriptor = "(Lclient!dw;)V")
	@Override
	public void method23451(@OriginalArg(0) Interface19 arg0) {
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
				this.anInt3184 = local2.method31069();
				this.anInt3183 = local2.method31071();
				this.method23458();
			} else if (this.anInt3183 != local2.method31071() || this.anInt3184 != local2.method31069()) {
				throw new RuntimeException();
			}
			this.anInt3185 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass104_Sub2_Sub2_10.method20446((byte) -65) == this) {
			this.method23299();
		} else {
			this.anInt3186 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!ata", name = "v", descriptor = "()Z")
	@Override
	boolean method23760() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3181);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3186 & 0x1 << local5) != 0) {
				this.method23298(local5);
			}
		}
		if ((this.anInt3186 & 0x10) != 0) {
			this.method23299();
		}
		this.anInt3186 = 0;
		return super.method23751();
	}

	@OriginalMember(owner = "client!ata", name = "o", descriptor = "()Z")
	@Override
	boolean method23754() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3181);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3186 & 0x1 << local5) != 0) {
				this.method23298(local5);
			}
		}
		if ((this.anInt3186 & 0x10) != 0) {
			this.method23299();
		}
		this.anInt3186 = 0;
		return super.method23751();
	}

	@OriginalMember(owner = "client!ata", name = "am", descriptor = "(I)V")
	void method23301(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method31076(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!ata", name = "ae", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3184;
		@Pc(12) int local12 = this.aClass104_Sub2_Sub2_10.method20446((byte) -12).method23749();
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

	@OriginalMember(owner = "client!ata", name = "ag", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3184;
		@Pc(12) int local12 = this.aClass104_Sub2_Sub2_10.method20446((byte) -88).method23749();
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

	@OriginalMember(owner = "client!ata", name = "y", descriptor = "()V")
	@Override
	public void method23763() {
		if (this.anInt3181 != 0) {
			this.aClass104_Sub2_Sub2_10.method21318(this.anInt3181);
			this.anInt3181 = 0;
		}
	}

	@OriginalMember(owner = "client!ata", name = "hl", descriptor = "()V")
	void method23302() throws Throwable {
		super.finalize();
		this.method23750();
	}

	@OriginalMember(owner = "client!ata", name = "ah", descriptor = "()Z")
	@Override
	public boolean method23454() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!ata", name = "r", descriptor = "()I")
	@Override
	public int method23759() {
		return this.anInt3184;
	}

	@OriginalMember(owner = "client!ata", name = "ad", descriptor = "(I)V")
	void method23303(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method31076(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!ata", name = "e", descriptor = "()I")
	@Override
	public int method23748() {
		return this.anInt3183;
	}

	@OriginalMember(owner = "client!ata", name = "au", descriptor = "()V")
	void method23304() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method31076(36096);
		}
	}

	@OriginalMember(owner = "client!ata", name = "c", descriptor = "()I")
	@Override
	public int method23758() {
		return this.anInt3184;
	}
}
