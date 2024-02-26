package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apt")
public final class Class108_Sub1_Sub2 extends Class108_Sub1 {

	@OriginalMember(owner = "client!apt", name = "f", descriptor = "I")
	static final int anInt2605 = 16;

	@OriginalMember(owner = "client!apt", name = "o", descriptor = "Lclient!ct;")
	Interface16 anInterface16_1;

	@OriginalMember(owner = "client!apt", name = "i", descriptor = "I")
	int anInt2603;

	@OriginalMember(owner = "client!apt", name = "g", descriptor = "I")
	int anInt2604;

	@OriginalMember(owner = "client!apt", name = "m", descriptor = "I")
	int anInt2606;

	@OriginalMember(owner = "client!apt", name = "l", descriptor = "I")
	int anInt2607;

	@OriginalMember(owner = "client!apt", name = "j", descriptor = "[Lclient!ct;")
	final Interface16[] anInterface16Array1 = new Interface16[4];

	@OriginalMember(owner = "client!apt", name = "e", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_35;

	@OriginalMember(owner = "client!apt", name = "u", descriptor = "I")
	int anInt2602;

	@OriginalMember(owner = "client!apt", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class108_Sub1_Sub2(@OriginalArg(0) Class102_Sub3 arg0) {
		if (!arg0.aBoolean141) {
			throw new IllegalStateException("");
		}
		this.aClass102_Sub3_35 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenFramebuffersEXT(1, local19, 0);
		this.anInt2602 = local19[0];
	}

	@OriginalMember(owner = "client!apt", name = "j", descriptor = "()Z")
	@Override
	boolean method24045() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2602);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2606 & 0x1 << local5) != 0) {
				this.method18460(local5);
			}
		}
		if ((this.anInt2606 & 0x10) != 0) {
			this.method18463();
		}
		this.anInt2606 = 0;
		this.aClass102_Sub3_35.method6333();
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "m", descriptor = "()I")
	@Override
	public int method24035() {
		return this.anInt2607;
	}

	@OriginalMember(owner = "client!apt", name = "f", descriptor = "()I")
	@Override
	public int method24037() {
		return this.anInt2604;
	}

	@OriginalMember(owner = "client!apt", name = "r", descriptor = "(ILclient!do;)V")
	@Override
	public void method23903(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface16 local6 = (Interface16) arg1;
		if (arg1 == null) {
			this.anInt2603 &= ~local3;
			this.anInterface16Array1[arg0] = null;
			if (this.anInt2603 == 0) {
				this.anInt2604 = 0;
				this.anInt2607 = 0;
			}
		} else {
			if ((this.anInt2603 | local3) == local3) {
				this.anInt2604 = local6.method30838();
				this.anInt2607 = local6.method30843();
				if (this.aClass102_Sub3_35.method20677(1000933363) == this) {
					this.aClass102_Sub3_35.method6334();
				}
			} else if (this.anInt2607 != local6.method30843() || this.anInt2604 != local6.method30838()) {
				throw new RuntimeException();
			}
			this.anInt2603 |= local3;
			this.anInterface16Array1[arg0] = local6;
		}
		if (this.aClass102_Sub3_35.method20677(1696326003) == this) {
			this.method18460(arg0);
		} else {
			this.anInt2606 |= local3;
		}
	}

	@OriginalMember(owner = "client!apt", name = "al", descriptor = "(I)V")
	void method18459(@OriginalArg(0) int arg0) {
		@Pc(4) Interface16 local4 = this.anInterface16Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method25856(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!apt", name = "ao", descriptor = "(I)V")
	void method18460(@OriginalArg(0) int arg0) {
		@Pc(4) Interface16 local4 = this.anInterface16Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method25856(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!apt", name = "h", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2604;
		@Pc(12) int local12 = this.aClass102_Sub3_35.method20677(2086108756).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2602);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!apt", name = "q", descriptor = "()Z")
	@Override
	public boolean method23897() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!apt", name = "u", descriptor = "()Z")
	@Override
	boolean method24039() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2602);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2606 & 0x1 << local5) != 0) {
				this.method18460(local5);
			}
		}
		if ((this.anInt2606 & 0x10) != 0) {
			this.method18463();
		}
		this.anInt2606 = 0;
		this.aClass102_Sub3_35.method6333();
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "e", descriptor = "()V")
	@Override
	public void method24046() {
		if (this.anInt2602 != 0) {
			this.aClass102_Sub3_35.method6412(this.anInt2602);
			this.anInt2602 = 0;
		}
	}

	@OriginalMember(owner = "client!apt", name = "ac", descriptor = "(I)V")
	void method18461(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!apt", name = "w", descriptor = "(Lclient!de;)V")
	@Override
	public void method23905(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Interface16 local2 = (Interface16) arg0;
		if (arg0 == null) {
			this.anInt2603 &= 0xFFFFFFEF;
			this.anInterface16_1 = null;
			if (this.anInt2603 == 0) {
				this.anInt2604 = 0;
				this.anInt2607 = 0;
			}
		} else {
			if ((this.anInt2603 | 0x10) == 16) {
				this.anInt2604 = local2.method30838();
				this.anInt2607 = local2.method30843();
				if (this.aClass102_Sub3_35.method20677(2062646660) == this) {
					this.aClass102_Sub3_35.method6334();
				}
			} else if (this.anInt2607 != local2.method30843() || this.anInt2604 != local2.method30838()) {
				throw new RuntimeException();
			}
			this.anInt2603 |= 0x10;
			this.anInterface16_1 = local2;
		}
		if (this.aClass102_Sub3_35.method20677(1737889095) == this) {
			this.method18463();
		} else {
			this.anInt2606 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!apt", name = "ht", descriptor = "()V")
	void method18462() throws Throwable {
		super.finalize();
		this.method24046();
	}

	@OriginalMember(owner = "client!apt", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		this.method24046();
	}

	@OriginalMember(owner = "client!apt", name = "g", descriptor = "()I")
	@Override
	public int method24041() {
		return this.anInt2607;
	}

	@OriginalMember(owner = "client!apt", name = "i", descriptor = "()I")
	@Override
	public int method24042() {
		return this.anInt2607;
	}

	@OriginalMember(owner = "client!apt", name = "aj", descriptor = "()V")
	void method18463() {
		if (this.anInterface16_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface16_1.method25856(36096);
		}
	}

	@OriginalMember(owner = "client!apt", name = "o", descriptor = "()I")
	@Override
	public int method24043() {
		return this.anInt2604;
	}

	@OriginalMember(owner = "client!apt", name = "d", descriptor = "(ILclient!do;)V")
	@Override
	public void method23899(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface16 local6 = (Interface16) arg1;
		if (arg1 == null) {
			this.anInt2603 &= ~local3;
			this.anInterface16Array1[arg0] = null;
			if (this.anInt2603 == 0) {
				this.anInt2604 = 0;
				this.anInt2607 = 0;
			}
		} else {
			if ((this.anInt2603 | local3) == local3) {
				this.anInt2604 = local6.method30838();
				this.anInt2607 = local6.method30843();
				if (this.aClass102_Sub3_35.method20677(1480957999) == this) {
					this.aClass102_Sub3_35.method6334();
				}
			} else if (this.anInt2607 != local6.method30843() || this.anInt2604 != local6.method30838()) {
				throw new RuntimeException();
			}
			this.anInt2603 |= local3;
			this.anInterface16Array1[arg0] = local6;
		}
		if (this.aClass102_Sub3_35.method20677(1871628570) == this) {
			this.method18460(arg0);
		} else {
			this.anInt2606 |= local3;
		}
	}

	@OriginalMember(owner = "client!apt", name = "z", descriptor = "(ILclient!do;)V")
	@Override
	public void method23900(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1) {
		@Pc(3) int local3 = 0x1 << arg0;
		@Pc(6) Interface16 local6 = (Interface16) arg1;
		if (arg1 == null) {
			this.anInt2603 &= ~local3;
			this.anInterface16Array1[arg0] = null;
			if (this.anInt2603 == 0) {
				this.anInt2604 = 0;
				this.anInt2607 = 0;
			}
		} else {
			if ((this.anInt2603 | local3) == local3) {
				this.anInt2604 = local6.method30838();
				this.anInt2607 = local6.method30843();
				if (this.aClass102_Sub3_35.method20677(1469237170) == this) {
					this.aClass102_Sub3_35.method6334();
				}
			} else if (this.anInt2607 != local6.method30843() || this.anInt2604 != local6.method30838()) {
				throw new RuntimeException();
			}
			this.anInt2603 |= local3;
			this.anInterface16Array1[arg0] = local6;
		}
		if (this.aClass102_Sub3_35.method20677(1266476094) == this) {
			this.method18460(arg0);
		} else {
			this.anInt2606 |= local3;
		}
	}

	@OriginalMember(owner = "client!apt", name = "p", descriptor = "(Lclient!de;)V")
	@Override
	public void method23901(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Interface16 local2 = (Interface16) arg0;
		if (arg0 == null) {
			this.anInt2603 &= 0xFFFFFFEF;
			this.anInterface16_1 = null;
			if (this.anInt2603 == 0) {
				this.anInt2604 = 0;
				this.anInt2607 = 0;
			}
		} else {
			if ((this.anInt2603 | 0x10) == 16) {
				this.anInt2604 = local2.method30838();
				this.anInt2607 = local2.method30843();
				if (this.aClass102_Sub3_35.method20677(1506190554) == this) {
					this.aClass102_Sub3_35.method6334();
				}
			} else if (this.anInt2607 != local2.method30843() || this.anInt2604 != local2.method30838()) {
				throw new RuntimeException();
			}
			this.anInt2603 |= 0x10;
			this.anInterface16_1 = local2;
		}
		if (this.aClass102_Sub3_35.method20677(1177823222) == this) {
			this.method18463();
		} else {
			this.anInt2606 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!apt", name = "v", descriptor = "(Lclient!de;)V")
	@Override
	public void method23902(@OriginalArg(0) Interface17 arg0) {
		@Pc(2) Interface16 local2 = (Interface16) arg0;
		if (arg0 == null) {
			this.anInt2603 &= 0xFFFFFFEF;
			this.anInterface16_1 = null;
			if (this.anInt2603 == 0) {
				this.anInt2604 = 0;
				this.anInt2607 = 0;
			}
		} else {
			if ((this.anInt2603 | 0x10) == 16) {
				this.anInt2604 = local2.method30838();
				this.anInt2607 = local2.method30843();
				if (this.aClass102_Sub3_35.method20677(1303777577) == this) {
					this.aClass102_Sub3_35.method6334();
				}
			} else if (this.anInt2607 != local2.method30843() || this.anInt2604 != local2.method30838()) {
				throw new RuntimeException();
			}
			this.anInt2603 |= 0x10;
			this.anInterface16_1 = local2;
		}
		if (this.aClass102_Sub3_35.method20677(1263367115) == this) {
			this.method18463();
		} else {
			this.anInt2606 |= 0x10;
		}
	}

	@OriginalMember(owner = "client!apt", name = "x", descriptor = "()V")
	@Override
	public void method24038() {
		if (this.anInt2602 != 0) {
			this.aClass102_Sub3_35.method6412(this.anInt2602);
			this.anInt2602 = 0;
		}
	}

	@OriginalMember(owner = "client!apt", name = "n", descriptor = "()Z")
	@Override
	public boolean method23908() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!apt", name = "c", descriptor = "()Z")
	@Override
	public boolean method23906() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!apt", name = "b", descriptor = "()Z")
	@Override
	public boolean method23896() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!apt", name = "t", descriptor = "()I")
	@Override
	public int method24036() {
		return this.anInt2607;
	}

	@OriginalMember(owner = "client!apt", name = "l", descriptor = "()Z")
	@Override
	boolean method24044() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "s", descriptor = "()Z")
	@Override
	boolean method24047() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "k", descriptor = "()Z")
	@Override
	boolean method24048() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "ax", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2604;
		@Pc(12) int local12 = this.aClass102_Sub3_35.method20677(1965897181).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2602);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!apt", name = "ay", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2604;
		@Pc(12) int local12 = this.aClass102_Sub3_35.method20677(1605232220).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2602);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!apt", name = "aq", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2604;
		@Pc(12) int local12 = this.aClass102_Sub3_35.method20677(944091969).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2602);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!apt", name = "ab", descriptor = "(I)V")
	void method18464(@OriginalArg(0) int arg0) {
		@Pc(4) Interface16 local4 = this.anInterface16Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method25856(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!apt", name = "a", descriptor = "()Z")
	@Override
	boolean method24040() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2602);
		for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
			if ((this.anInt2606 & 0x1 << local5) != 0) {
				this.method18460(local5);
			}
		}
		if ((this.anInt2606 & 0x10) != 0) {
			this.method18463();
		}
		this.anInt2606 = 0;
		this.aClass102_Sub3_35.method6333();
		return true;
	}

	@OriginalMember(owner = "client!apt", name = "hy", descriptor = "()V")
	void method18465() throws Throwable {
		super.finalize();
		this.method24046();
	}

	@OriginalMember(owner = "client!apt", name = "hj", descriptor = "()V")
	void method18466() throws Throwable {
		super.finalize();
		this.method24046();
	}

	@OriginalMember(owner = "client!apt", name = "ag", descriptor = "(I)V")
	void method18467(@OriginalArg(0) int arg0) {
		@Pc(4) Interface16 local4 = this.anInterface16Array1[arg0];
		if (local4 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, arg0 + 36064, 36161, 0);
		} else {
			local4.method25856(arg0 + 36064);
		}
	}

	@OriginalMember(owner = "client!apt", name = "y", descriptor = "()Z")
	@Override
	public boolean method23895() {
		@Pc(2) int local2 = OpenGL.glCheckFramebufferStatusEXT(36160);
		return local2 == 36053;
	}

	@OriginalMember(owner = "client!apt", name = "ai", descriptor = "(IIIIIIZZ)V")
	@Override
	public void method23904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		if (!(arg6 | arg7)) {
			return;
		}
		@Pc(6) int local6 = this.anInt2604;
		@Pc(12) int local12 = this.aClass102_Sub3_35.method20677(1474292424).method24037();
		@Pc(14) int local14 = 0;
		if (arg7) {
			local14 |= 0x100;
		}
		if (arg6) {
			local14 |= 0x4000;
		}
		OpenGL.glBindFramebufferEXT(36008, this.anInt2602);
		OpenGL.glBlitFramebufferEXT(arg0, local6 - arg1 - arg3, arg0 + arg2, local6 - arg1, arg4, local12 - arg5 - arg3, arg4 + arg2, local12 - arg5, local14, 9728);
		OpenGL.glBindFramebufferEXT(36008, 0);
	}

	@OriginalMember(owner = "client!apt", name = "ah", descriptor = "()V")
	void method18468() {
		if (this.anInterface16_1 == null) {
			OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
		} else {
			this.anInterface16_1.method25856(36096);
		}
	}

	@OriginalMember(owner = "client!apt", name = "af", descriptor = "(I)V")
	void method18469(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!apt", name = "am", descriptor = "(I)V")
	void method18470(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}

	@OriginalMember(owner = "client!apt", name = "ak", descriptor = "(I)V")
	void method18471(@OriginalArg(0) int arg0) {
		OpenGL.glDrawBuffer(arg0 + 36064);
	}
}
