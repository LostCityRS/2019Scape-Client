package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeo")
public final class Class96_Sub5 extends Class96 {

	@OriginalMember(owner = "client!aeo", name = "f", descriptor = "I")
	static final int anInt361 = 128;

	@OriginalMember(owner = "client!aeo", name = "m", descriptor = "F")
	static final float aFloat1 = 0.0F;

	@OriginalMember(owner = "client!aeo", name = "u", descriptor = "I")
	static final int anInt362 = 128;

	@OriginalMember(owner = "client!aeo", name = "g", descriptor = "F")
	static final float aFloat2 = 26.0F;

	@OriginalMember(owner = "client!aeo", name = "i", descriptor = "F")
	static final float aFloat3 = -12.0F;

	@OriginalMember(owner = "client!aeo", name = "o", descriptor = "C")
	static final char aChar5 = '\u0000';

	@OriginalMember(owner = "client!aeo", name = "l", descriptor = "I")
	static final int anInt363 = 24;

	@OriginalMember(owner = "client!aeo", name = "j", descriptor = "C")
	static final char aChar6 = '\u0001';

	@OriginalMember(owner = "client!aeo", name = "e", descriptor = "I")
	static final int anInt364 = 5;

	@OriginalMember(owner = "client!aeo", name = "a", descriptor = "Lclient!bv;")
	Class197 aClass197_3;

	@OriginalMember(owner = "client!aeo", name = "s", descriptor = "Z")
	boolean aBoolean65;

	@OriginalMember(owner = "client!aeo", name = "k", descriptor = "Z")
	boolean aBoolean66 = false;

	@OriginalMember(owner = "client!aeo", name = "x", descriptor = "[Lclient!adr;")
	Class84_Sub2[] aClass84_Sub2Array1;

	@OriginalMember(owner = "client!aeo", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class96_Sub5(@OriginalArg(0) Class102_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean150) {
			@Pc(12) byte[][] local12 = new byte[6][16384];
			@Pc(16) byte[][] local16 = new byte[6][16384];
			@Pc(20) byte[][] local20 = new byte[6][16384];
			@Pc(22) int local22 = 0;
			@Pc(29) Class463 local29 = new Class463(0.0F, -1.0F, 0.0F);
			for (@Pc(31) int local31 = 0; local31 < 128; local31++) {
				for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
					@Pc(48) float local48 = (float) local36 * 2.0F / 128.0F - 1.0F;
					@Pc(57) float local57 = (float) local31 * 2.0F / 128.0F - 1.0F;
					@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local48 * local48 + 1.0F + local57 * local57)));
					@Pc(76) float local76 = local48 * local72;
					@Pc(80) float local80 = local57 * local72;
					for (@Pc(82) int local82 = 0; local82 < 6; local82++) {
						@Pc(96) Class463 local96;
						if (local82 == 0) {
							local96 = new Class463(-local72, -local76, local80);
						} else if (local82 == 1) {
							local96 = new Class463(local72, local76, local80);
						} else if (local82 == 2) {
							local96 = new Class463(-local76, local80, -local72);
						} else if (local82 == 3) {
							local96 = new Class463(-local76, -local80, local72);
						} else if (local82 == 4) {
							local96 = new Class463(local76, local72, -local80);
						} else {
							local96 = new Class463(local76, -local72, local80);
						}
						@Pc(158) float local158 = local96.method29492(local29);
						@Pc(164) float local164 = Math.max(0.0F, Math.min(1.0F, local158));
						@Pc(178) int local178;
						@Pc(188) int local188;
						@Pc(198) int local198;
						if (local164 > 0.0F) {
							local178 = Math.min(255, (int) (Math.pow((double) local164, 128.0D) * 400.0D));
							local188 = Math.min(255, (int) (Math.pow((double) local164, 24.0D) * 400.0D));
							local198 = Math.min(255, (int) (Math.pow((double) local164, 5.0D) * 400.0D));
						} else {
							local198 = 0;
							local188 = 0;
							local178 = 0;
						}
						local16[local82][local22] = (byte) local178;
						local20[local82][local22] = (byte) local188;
						local12[local82][local22] = (byte) local198;
					}
					local22++;
				}
			}
			this.aClass84_Sub2Array1 = new Class84_Sub2[3];
			this.aClass84_Sub2Array1[0] = new Class84_Sub2(this.aClass102_Sub3_24, Class210.aClass210_17, Class236.aClass236_21, 128, false, local16, Class210.aClass210_17);
			this.aClass84_Sub2Array1[1] = new Class84_Sub2(this.aClass102_Sub3_24, Class210.aClass210_17, Class236.aClass236_21, 128, false, local20, Class210.aClass210_17);
			this.aClass84_Sub2Array1[2] = new Class84_Sub2(this.aClass102_Sub3_24, Class210.aClass210_17, Class236.aClass236_21, 128, false, local12, Class210.aClass210_17);
			this.method2408();
		}
	}

	@OriginalMember(owner = "client!aeo", name = "d", descriptor = "(II)V")
	@Override
	void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean66) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(this.aClass84_Sub2Array1[arg0 - 1]);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aeo", name = "t", descriptor = "()Z")
	@Override
	boolean method2897() {
		return true;
	}

	@OriginalMember(owner = "client!aeo", name = "o", descriptor = "(Z)V")
	@Override
	void method2893(@OriginalArg(0) boolean arg0) {
		if (this.aClass197_3 == null || !arg0) {
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			return;
		}
		if (!this.aBoolean65) {
			this.aClass102_Sub3_24.method6386(2);
			this.aClass102_Sub3_24.method6339(this.aClass102_Sub3_24.aClass84_Sub1_2);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass197_3.method24907('\u0000');
		this.aBoolean66 = true;
	}

	@OriginalMember(owner = "client!aeo", name = "s", descriptor = "(Z)V")
	@Override
	void method2896(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(8448, 7681);
	}

	@OriginalMember(owner = "client!aeo", name = "e", descriptor = "(Z)V")
	@Override
	void method2888(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(8448, 7681);
	}

	@OriginalMember(owner = "client!aeo", name = "m", descriptor = "(Z)V")
	@Override
	void method2892(@OriginalArg(0) boolean arg0) {
		if (this.aClass197_3 == null || !arg0) {
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			return;
		}
		if (!this.aBoolean65) {
			this.aClass102_Sub3_24.method6386(2);
			this.aClass102_Sub3_24.method6339(this.aClass102_Sub3_24.aClass84_Sub1_2);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass197_3.method24907('\u0000');
		this.aBoolean66 = true;
	}

	@OriginalMember(owner = "client!aeo", name = "l", descriptor = "(II)V")
	@Override
	void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean66) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(this.aClass84_Sub2Array1[arg0 - 1]);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aeo", name = "x", descriptor = "()V")
	@Override
	void method2898() {
		if (this.aBoolean66) {
			if (!this.aBoolean65) {
				this.aClass102_Sub3_24.method6386(2);
				this.aClass102_Sub3_24.method6339(null);
			}
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
			this.aClass197_3.method24907('\u0001');
			this.aBoolean66 = false;
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
	}

	@OriginalMember(owner = "client!aeo", name = "i", descriptor = "()Z")
	@Override
	boolean method2894() {
		return true;
	}

	@OriginalMember(owner = "client!aeo", name = "f", descriptor = "(Z)V")
	@Override
	void method2887(@OriginalArg(0) boolean arg0) {
		if (this.aClass197_3 == null || !arg0) {
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			return;
		}
		if (!this.aBoolean65) {
			this.aClass102_Sub3_24.method6386(2);
			this.aClass102_Sub3_24.method6339(this.aClass102_Sub3_24.aClass84_Sub1_2);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass197_3.method24907('\u0000');
		this.aBoolean66 = true;
	}

	@OriginalMember(owner = "client!aeo", name = "w", descriptor = "()V")
	@Override
	void method2899() {
		if (this.aBoolean66) {
			if (!this.aBoolean65) {
				this.aClass102_Sub3_24.method6386(2);
				this.aClass102_Sub3_24.method6339(null);
			}
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
			this.aClass197_3.method24907('\u0001');
			this.aBoolean66 = false;
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
	}

	@OriginalMember(owner = "client!aeo", name = "j", descriptor = "(Z)V")
	@Override
	void method2889(@OriginalArg(0) boolean arg0) {
		if (this.aClass197_3 == null || !arg0) {
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			return;
		}
		if (!this.aBoolean65) {
			this.aClass102_Sub3_24.method6386(2);
			this.aClass102_Sub3_24.method6339(this.aClass102_Sub3_24.aClass84_Sub1_2);
			this.aClass102_Sub3_24.method6386(0);
		}
		this.aClass197_3.method24907('\u0000');
		this.aBoolean66 = true;
	}

	@OriginalMember(owner = "client!aeo", name = "a", descriptor = "(Z)V")
	@Override
	void method2895(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(8448, 7681);
	}

	@OriginalMember(owner = "client!aeo", name = "g", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2891(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aeo", name = "k", descriptor = "(Z)V")
	@Override
	void method2886(@OriginalArg(0) boolean arg0) {
		this.aClass102_Sub3_24.method6389(8448, 7681);
	}

	@OriginalMember(owner = "client!aeo", name = "v", descriptor = "()V")
	void method2408() {
		this.aClass197_3 = new Class197(this.aClass102_Sub3_24, 2);
		this.aClass197_3.method24905(0);
		this.aClass102_Sub3_24.method6386(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(26.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
		OpenGL.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean65) {
			this.aClass102_Sub3_24.method6389(260, 7681);
			this.aClass102_Sub3_24.method6390(0, 5890, 770);
			this.aClass102_Sub3_24.method6391(0, 34167, 770);
		} else {
			this.aClass102_Sub3_24.method6389(7681, 8448);
			this.aClass102_Sub3_24.method6390(0, 34168, 768);
			this.aClass102_Sub3_24.method6386(2);
			this.aClass102_Sub3_24.method6389(260, 7681);
			this.aClass102_Sub3_24.method6390(0, 34168, 768);
			this.aClass102_Sub3_24.method6390(1, 34168, 770);
			this.aClass102_Sub3_24.method6391(0, 34167, 770);
		}
		this.aClass102_Sub3_24.method6386(0);
		this.aClass197_3.method24913();
		this.aClass197_3.method24905(1);
		this.aClass102_Sub3_24.method6386(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean65) {
			this.aClass102_Sub3_24.method6389(8448, 8448);
			this.aClass102_Sub3_24.method6390(0, 5890, 768);
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		} else {
			this.aClass102_Sub3_24.method6389(8448, 8448);
			this.aClass102_Sub3_24.method6390(0, 5890, 768);
			this.aClass102_Sub3_24.method6386(2);
			this.aClass102_Sub3_24.method6389(8448, 8448);
			this.aClass102_Sub3_24.method6390(0, 5890, 768);
			this.aClass102_Sub3_24.method6390(1, 34168, 768);
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6386(0);
		this.aClass197_3.method24913();
	}

	@OriginalMember(owner = "client!aeo", name = "r", descriptor = "()V")
	@Override
	void method2900() {
		if (this.aBoolean66) {
			if (!this.aBoolean65) {
				this.aClass102_Sub3_24.method6386(2);
				this.aClass102_Sub3_24.method6339(null);
			}
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
			this.aClass197_3.method24907('\u0001');
			this.aBoolean66 = false;
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
	}

	@OriginalMember(owner = "client!aeo", name = "q", descriptor = "()V")
	@Override
	void method2901() {
		if (this.aBoolean66) {
			if (!this.aBoolean65) {
				this.aClass102_Sub3_24.method6386(2);
				this.aClass102_Sub3_24.method6339(null);
			}
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
			this.aClass197_3.method24907('\u0001');
			this.aBoolean66 = false;
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
	}

	@OriginalMember(owner = "client!aeo", name = "h", descriptor = "(II)V")
	@Override
	void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean66) {
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(this.aClass84_Sub2Array1[arg0 - 1]);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aeo", name = "p", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2905(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aeo", name = "z", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2904(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aeo", name = "u", descriptor = "()V")
	@Override
	void method2885() {
		if (this.aBoolean66) {
			if (!this.aBoolean65) {
				this.aClass102_Sub3_24.method6386(2);
				this.aClass102_Sub3_24.method6339(null);
			}
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
			this.aClass197_3.method24907('\u0001');
			this.aBoolean66 = false;
		} else {
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
		}
		this.aClass102_Sub3_24.method6389(8448, 8448);
	}
}
