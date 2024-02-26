package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atj")
public final class Class108_Sub1_Sub1_Sub1 extends Class108_Sub1_Sub1 {

	@OriginalMember(owner = "client!atj", name = "e", descriptor = "I")
	static final int anInt3233 = 16;

	@OriginalMember(owner = "client!atj", name = "j", descriptor = "Lclient!rn;")
	Interface56 anInterface56_1;

	@OriginalMember(owner = "client!atj", name = "m", descriptor = "I")
	int anInt3228;

	@OriginalMember(owner = "client!atj", name = "g", descriptor = "I")
	int anInt3230;

	@OriginalMember(owner = "client!atj", name = "o", descriptor = "I")
	int anInt3231;

	@OriginalMember(owner = "client!atj", name = "i", descriptor = "I")
	int anInt3232;

	@OriginalMember(owner = "client!atj", name = "a", descriptor = "[Lclient!rn;")
	final Interface56[] anInterface56Array1 = new Interface56[4];

	@OriginalMember(owner = "client!atj", name = "u", descriptor = "Lclient!aqi;")
	final Class102_Sub1_Sub1 aClass102_Sub1_Sub1_10;

	@OriginalMember(owner = "client!atj", name = "l", descriptor = "I")
	int anInt3229;

	@OriginalMember(owner = "client!atj", name = "<init>", descriptor = "(Lclient!aqi;)V")
	Class108_Sub1_Sub1_Sub1(@OriginalArg(0) Class102_Sub1_Sub1 arg0) {
		super(arg0);
		this.aClass102_Sub1_Sub1_10 = arg0;
		@Pc(12) int[] local12 = new int[1];
		if (!this.aClass102_Sub1_Sub1_10.aBoolean529) {
			throw new RuntimeException("");
		}
		OpenGL.glGenFramebuffersEXT(1, local12, 0);
		this.anInt3229 = local12[0];
	}

	@OriginalMember(owner = "client!atj", name = "m", descriptor = "()I")
	@Override
	public int method24035() {
		return this.anInt3230;
	}

	@OriginalMember(owner = "client!atj", name = "t", descriptor = "()I")
	@Override
	public int method24036() {
		return this.anInt3230;
	}

	@OriginalMember(owner = "client!atj", name = "f", descriptor = "()I")
	@Override
	public int method24037() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atj", name = "r", descriptor = "(ILclient!do;)V")
	@Override
	public void method23903(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3228 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3228 == 0) {
				this.anInt3232 = 0;
				this.anInt3230 = 0;
			}
		} else {
			if (this.anInt3228 == 0) {
				this.anInt3232 = local6.method30838();
				this.anInt3230 = local6.method30843();
				this.method23913();
			} else if (this.anInt3230 != local6.method30843() || this.anInt3232 != local6.method30838()) {
				throw new RuntimeException();
			}
			this.anInt3228 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass102_Sub1_Sub1_10.method20677(1730762275) == this) {
			this.method23800(arg0);
		} else {
			this.anInt3231 |= local3;
		}
	}

	@OriginalMember(owner = "client!atj", name = "i", descriptor = "()I")
	@Override
	public int method24042() {
		return this.anInt3230;
	}

	@OriginalMember(owner = "client!atj", name = "v", descriptor = "(Lclient!de;)V")
	@Override
	public void method23902(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3228 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3228 == 0) {
				this.anInt3232 = 0;
				this.anInt3230 = 0;
			}
		} else {
			if (this.anInt3228 == 0) {
				this.anInt3232 = local2.method30838();
				this.anInt3230 = local2.method30843();
				this.method23913();
			} else if (this.anInt3230 != local2.method30843() || this.anInt3232 != local2.method30838()) {
				throw new RuntimeException();
			}
			this.anInt3228 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass102_Sub1_Sub1_10.method20677(1016660011) == this) {
			this.method23797();
		} else {
			this.anInt3231 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!atj", name = "ah", descriptor = "()V")
	void method23795() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30846(36096);
		}
	}

	@OriginalMember(owner = "client!atj", name = "u", descriptor = "()Z")
	@Override
	boolean method24039() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3229);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3231 & 0x1 << local5) != 0) {
				this.method23800(local5);
			}
		}
		if ((this.anInt3231 & 0x10) != 0) {
			this.method23797();
		}
		this.anInt3231 = 0;
		return super.method24039();
	}

	@OriginalMember(owner = "client!atj", name = "l", descriptor = "()Z")
	@Override
	boolean method24044() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!atj", name = "aq", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3232;
		@Pc(12) int local12 = this.aClass102_Sub1_Sub1_10.method20677(1617728187).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3229);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!atj", name = "e", descriptor = "()V")
	@Override
	public void method24046() {
		if (this.anInt3229 != 0) {
			this.aClass102_Sub1_Sub1_10.method20099(this.anInt3229);
			this.anInt3229 = 0;
		}
	}

	@OriginalMember(owner = "client!atj", name = "c", descriptor = "()Z")
	@Override
	public boolean method23906() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!atj", name = "g", descriptor = "()I")
	@Override
	public int method24041() {
		return this.anInt3230;
	}

	@OriginalMember(owner = "client!atj", name = "hj", descriptor = "()V")
	void method23796() throws Throwable {
		super.finalize();
		this.method24046();
	}

	@OriginalMember(owner = "client!atj", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		this.method24046();
	}

	@OriginalMember(owner = "client!atj", name = "o", descriptor = "()I")
	@Override
	public int method24043() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atj", name = "d", descriptor = "(ILclient!do;)V")
	@Override
	public void method23899(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3228 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3228 == 0) {
				this.anInt3232 = 0;
				this.anInt3230 = 0;
			}
		} else {
			if (this.anInt3228 == 0) {
				this.anInt3232 = local6.method30838();
				this.anInt3230 = local6.method30843();
				this.method23913();
			} else if (this.anInt3230 != local6.method30843() || this.anInt3232 != local6.method30838()) {
				throw new RuntimeException();
			}
			this.anInt3228 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass102_Sub1_Sub1_10.method20677(1710822328) == this) {
			this.method23800(arg0);
		} else {
			this.anInt3231 |= local3;
		}
	}

	@OriginalMember(owner = "client!atj", name = "z", descriptor = "(ILclient!do;)V")
	@Override
	public void method23900(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface56 local6 = (Interface56) arg1;
		if (arg1 == null) {
			this.anInt3228 &= ~local3;
			this.anInterface56Array1[arg0] = null;
			if (this.anInt3228 == 0) {
				this.anInt3232 = 0;
				this.anInt3230 = 0;
			}
		} else {
			if (this.anInt3228 == 0) {
				this.anInt3232 = local6.method30838();
				this.anInt3230 = local6.method30843();
				this.method23913();
			} else if (this.anInt3230 != local6.method30843() || this.anInt3232 != local6.method30838()) {
				throw new RuntimeException();
			}
			this.anInt3228 |= local3;
			this.anInterface56Array1[arg0] = local6;
		}
		if (this.aClass102_Sub1_Sub1_10.method20677(1856688090) == this) {
			this.method23800(arg0);
		} else {
			this.anInt3231 |= local3;
		}
	}

	@OriginalMember(owner = "client!atj", name = "ag", descriptor = "()V")
	void method23797() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30846(36096);
		}
	}

	@OriginalMember(owner = "client!atj", name = "w", descriptor = "(Lclient!de;)V")
	@Override
	public void method23905(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3228 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3228 == 0) {
				this.anInt3232 = 0;
				this.anInt3230 = 0;
			}
		} else {
			if (this.anInt3228 == 0) {
				this.anInt3232 = local2.method30838();
				this.anInt3230 = local2.method30843();
				this.method23913();
			} else if (this.anInt3230 != local2.method30843() || this.anInt3232 != local2.method30838()) {
				throw new RuntimeException();
			}
			this.anInt3228 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass102_Sub1_Sub1_10.method20677(1207731169) == this) {
			this.method23797();
		} else {
			this.anInt3231 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!atj", name = "ax", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3232;
		@Pc(12) int local12 = this.aClass102_Sub1_Sub1_10.method20677(1391526686).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3229);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!atj", name = "n", descriptor = "()Z")
	@Override
	public boolean method23908() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!atj", name = "y", descriptor = "()Z")
	@Override
	public boolean method23895() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!atj", name = "b", descriptor = "()Z")
	@Override
	public boolean method23896() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!atj", name = "j", descriptor = "()Z")
	@Override
	boolean method24045() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3229);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3231 & 0x1 << local5) != 0) {
				this.method23800(local5);
			}
		}
		if ((this.anInt3231 & 0x10) != 0) {
			this.method23797();
		}
		this.anInt3231 = 0;
		return super.method24039();
	}

	@OriginalMember(owner = "client!atj", name = "a", descriptor = "()Z")
	@Override
	boolean method24040() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3229);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt3231 & 0x1 << local5) != 0) {
				this.method23800(local5);
			}
		}
		if ((this.anInt3231 & 0x10) != 0) {
			this.method23797();
		}
		this.anInt3231 = 0;
		return super.method24039();
	}

	@OriginalMember(owner = "client!atj", name = "s", descriptor = "()Z")
	@Override
	boolean method24047() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!atj", name = "k", descriptor = "()Z")
	@Override
	boolean method24048() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!atj", name = "q", descriptor = "()Z")
	@Override
	public boolean method23897() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!atj", name = "ay", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3232;
		@Pc(12) int local12 = this.aClass102_Sub1_Sub1_10.method20677(1482491885).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3229);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!atj", name = "ai", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3232;
		@Pc(12) int local12 = this.aClass102_Sub1_Sub1_10.method20677(1320234283).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3229);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!atj", name = "al", descriptor = "()V")
	void method23798() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30846(36096);
		}
	}

	@OriginalMember(owner = "client!atj", name = "x", descriptor = "()V")
	@Override
	public void method24038() {
		if (this.anInt3229 != 0) {
			this.aClass102_Sub1_Sub1_10.method20099(this.anInt3229);
			this.anInt3229 = 0;
		}
	}

	@OriginalMember(owner = "client!atj", name = "hy", descriptor = "()V")
	void method23799() throws Throwable {
		super.finalize();
		this.method24046();
	}

	@OriginalMember(owner = "client!atj", name = "ac", descriptor = "(I)V")
	void method23800(@OriginalArg(0) int arg0) {
		@Pc(4) Interface56 local4 = this.anInterface56Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method30846(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!atj", name = "ht", descriptor = "()V")
	void method23801() throws Throwable {
		super.finalize();
		this.method24046();
	}

	@OriginalMember(owner = "client!atj", name = "ab", descriptor = "()V")
	void method23802() {
		if (this.anInterface56_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface56_1.method30846(36096);
		}
	}

	@OriginalMember(owner = "client!atj", name = "p", descriptor = "(Lclient!de;)V")
	@Override
	public void method23901(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Interface56 local2 = (Interface56) arg0;
		if (arg0 == null) {
			this.anInt3228 &= 0xFFFFFFEF;
			this.anInterface56_1 = null;
			if (this.anInt3228 == 0) {
				this.anInt3232 = 0;
				this.anInt3230 = 0;
			}
		} else {
			if (this.anInt3228 == 0) {
				this.anInt3232 = local2.method30838();
				this.anInt3230 = local2.method30843();
				this.method23913();
			} else if (this.anInt3230 != local2.method30843() || this.anInt3232 != local2.method30838()) {
				throw new RuntimeException();
			}
			this.anInt3228 |= 0x10;
			this.anInterface56_1 = local2;
		}
		if (this.aClass102_Sub1_Sub1_10.method20677(1178726618) == this) {
			this.method23797();
		} else {
			this.anInt3231 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!atj", name = "h", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt3232;
		@Pc(12) int local12 = this.aClass102_Sub1_Sub1_10.method20677(2090901471).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt3229);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}
}
