package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeb")
public final class Class97_Sub1 extends Class97 {

	@OriginalMember(owner = "client!aeb", name = "z", descriptor = "C")
	static final char aChar1 = '\u0000';

	@OriginalMember(owner = "client!aeb", name = "m", descriptor = "I")
	static final int anInt321 = 5;

	@OriginalMember(owner = "client!aeb", name = "k", descriptor = "I")
	static final int anInt322 = 128;

	@OriginalMember(owner = "client!aeb", name = "w", descriptor = "F")
	static final float aFloat4 = 26.0F;

	@OriginalMember(owner = "client!aeb", name = "l", descriptor = "F")
	static final float aFloat5 = -12.0F;

	@OriginalMember(owner = "client!aeb", name = "n", descriptor = "I")
	static final int anInt323 = 128;

	@OriginalMember(owner = "client!aeb", name = "p", descriptor = "C")
	static final char aChar2 = '\u0001';

	@OriginalMember(owner = "client!aeb", name = "u", descriptor = "F")
	static final float aFloat6 = 0.0F;

	@OriginalMember(owner = "client!aeb", name = "f", descriptor = "I")
	static final int anInt324 = 24;

	@OriginalMember(owner = "client!aeb", name = "d", descriptor = "Lclient!be;")
	Class182 aClass182_1;

	@OriginalMember(owner = "client!aeb", name = "c", descriptor = "Z")
	boolean aBoolean44;

	@OriginalMember(owner = "client!aeb", name = "r", descriptor = "Z")
	boolean aBoolean43 = false;

	@OriginalMember(owner = "client!aeb", name = "v", descriptor = "[Lclient!adq;")
	Class88_Sub1[] aClass88_Sub1Array1;

	@OriginalMember(owner = "client!aeb", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class97_Sub1(@OriginalArg(0) Class104_Sub1 arg0) {
		super(arg0);
		if (arg0.aBoolean83) {
			@Pc(12) byte[][] local12 = new byte[6][16384];
			@Pc(16) byte[][] local16 = new byte[6][16384];
			@Pc(20) byte[][] local20 = new byte[6][16384];
			@Pc(22) int local22 = 0;
			@Pc(29) Class472 local29 = new Class472(0.0F, -1.0F, 0.0F);
			for (@Pc(31) int local31 = 0; local31 < 128; local31++) {
				for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
					@Pc(48) float local48 = (float) local36 * 2.0F / 128.0F - 1.0F;
					@Pc(57) float local57 = (float) local31 * 2.0F / 128.0F - 1.0F;
					@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local48 * local48 + 1.0F + local57 * local57)));
					@Pc(76) float local76 = local48 * local72;
					@Pc(80) float local80 = local57 * local72;
					for (@Pc(82) int local82 = 0; local82 < 6; local82++) {
						@Pc(96) Class472 local96;
						if (local82 == 0) {
							local96 = new Class472(-local72, -local76, local80);
						} else if (local82 == 1) {
							local96 = new Class472(local72, local76, local80);
						} else if (local82 == 2) {
							local96 = new Class472(-local76, local80, -local72);
						} else if (local82 == 3) {
							local96 = new Class472(-local76, -local80, local72);
						} else if (local82 == 4) {
							local96 = new Class472(local76, local72, -local80);
						} else {
							local96 = new Class472(local76, -local72, local80);
						}
						@Pc(158) float local158 = local96.method29729(local29);
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
			this.aClass88_Sub1Array1 = new Class88_Sub1[3];
			this.aClass88_Sub1Array1[0] = new Class88_Sub1(this.aClass104_Sub1_25, Class206.aClass206_19, Class226.aClass226_22, 128, false, local16, Class206.aClass206_19);
			this.aClass88_Sub1Array1[1] = new Class88_Sub1(this.aClass104_Sub1_25, Class206.aClass206_19, Class226.aClass226_22, 128, false, local20, Class206.aClass206_19);
			this.aClass88_Sub1Array1[2] = new Class88_Sub1(this.aClass104_Sub1_25, Class206.aClass206_19, Class226.aClass226_22, 128, false, local12, Class206.aClass206_19);
			this.method1853();
		}
	}

	@OriginalMember(owner = "client!aeb", name = "p", descriptor = "()Z")
	@Override
	boolean method2791() {
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "e", descriptor = "()Z")
	@Override
	boolean method2790() {
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "s", descriptor = "(II)V")
	@Override
	void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean43) {
			this.aClass104_Sub1_25.method3803(1);
			this.aClass104_Sub1_25.method3804(this.aClass88_Sub1Array1[arg0 - 1]);
			this.aClass104_Sub1_25.method3803(0);
		}
	}

	@OriginalMember(owner = "client!aeb", name = "n", descriptor = "(Z)V")
	@Override
	void method2801(@OriginalArg(0) boolean arg0) {
		if (this.aClass182_1 == null || !arg0) {
			this.aClass104_Sub1_25.method3808(0, 34168, 770);
			return;
		}
		if (!this.aBoolean44) {
			this.aClass104_Sub1_25.method3803(2);
			this.aClass104_Sub1_25.method3804(this.aClass104_Sub1_25.aClass88_Sub2_2);
			this.aClass104_Sub1_25.method3803(0);
		}
		this.aClass182_1.method24572('\u0000');
		this.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!aeb", name = "m", descriptor = "(Z)V")
	@Override
	void method2792(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_25.method3837(8448, 7681);
	}

	@OriginalMember(owner = "client!aeb", name = "k", descriptor = "()V")
	@Override
	void method2793() {
		if (this.aBoolean43) {
			if (!this.aBoolean44) {
				this.aClass104_Sub1_25.method3803(2);
				this.aClass104_Sub1_25.method3804(null);
			}
			this.aClass104_Sub1_25.method3803(1);
			this.aClass104_Sub1_25.method3804(null);
			this.aClass104_Sub1_25.method3803(0);
			this.aClass182_1.method24572('\u0001');
			this.aBoolean43 = false;
		} else {
			this.aClass104_Sub1_25.method3808(0, 5890, 770);
		}
		this.aClass104_Sub1_25.method3837(8448, 8448);
	}

	@OriginalMember(owner = "client!aeb", name = "o", descriptor = "(II)V")
	@Override
	void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean43) {
			this.aClass104_Sub1_25.method3803(1);
			this.aClass104_Sub1_25.method3804(this.aClass88_Sub1Array1[arg0 - 1]);
			this.aClass104_Sub1_25.method3803(0);
		}
	}

	@OriginalMember(owner = "client!aeb", name = "l", descriptor = "()Z")
	@Override
	boolean method2796() {
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "w", descriptor = "(Lclient!bq;I)V")
	@Override
	void method2789(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3804(arg0);
		this.aClass104_Sub1_25.method3805(arg1);
	}

	@OriginalMember(owner = "client!aeb", name = "z", descriptor = "()Z")
	@Override
	boolean method2798() {
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "q", descriptor = "(Lclient!bq;I)V")
	@Override
	void method2806(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3804(arg0);
		this.aClass104_Sub1_25.method3805(arg1);
	}

	@OriginalMember(owner = "client!aeb", name = "d", descriptor = "()Z")
	@Override
	boolean method2799() {
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "c", descriptor = "(Z)V")
	@Override
	void method2800(@OriginalArg(0) boolean arg0) {
		if (this.aClass182_1 == null || !arg0) {
			this.aClass104_Sub1_25.method3808(0, 34168, 770);
			return;
		}
		if (!this.aBoolean44) {
			this.aClass104_Sub1_25.method3803(2);
			this.aClass104_Sub1_25.method3804(this.aClass104_Sub1_25.aClass88_Sub2_2);
			this.aClass104_Sub1_25.method3803(0);
		}
		this.aClass182_1.method24572('\u0000');
		this.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!aeb", name = "r", descriptor = "(Z)V")
	@Override
	void method2797(@OriginalArg(0) boolean arg0) {
		this.aClass104_Sub1_25.method3837(8448, 7681);
	}

	@OriginalMember(owner = "client!aeb", name = "v", descriptor = "()V")
	@Override
	void method2795() {
		if (this.aBoolean43) {
			if (!this.aBoolean44) {
				this.aClass104_Sub1_25.method3803(2);
				this.aClass104_Sub1_25.method3804(null);
			}
			this.aClass104_Sub1_25.method3803(1);
			this.aClass104_Sub1_25.method3804(null);
			this.aClass104_Sub1_25.method3803(0);
			this.aClass182_1.method24572('\u0001');
			this.aBoolean43 = false;
		} else {
			this.aClass104_Sub1_25.method3808(0, 5890, 770);
		}
		this.aClass104_Sub1_25.method3837(8448, 8448);
	}

	@OriginalMember(owner = "client!aeb", name = "x", descriptor = "(Lclient!bq;I)V")
	@Override
	void method2807(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3804(arg0);
		this.aClass104_Sub1_25.method3805(arg1);
	}

	@OriginalMember(owner = "client!aeb", name = "b", descriptor = "()V")
	void method1853() {
		this.aClass182_1 = new Class182(this.aClass104_Sub1_25, 2);
		this.aClass182_1.method24571(0);
		this.aClass104_Sub1_25.method3803(1);
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
		if (this.aBoolean44) {
			this.aClass104_Sub1_25.method3837(260, 7681);
			this.aClass104_Sub1_25.method3807(0, 5890, 770);
			this.aClass104_Sub1_25.method3808(0, 34167, 770);
		} else {
			this.aClass104_Sub1_25.method3837(7681, 8448);
			this.aClass104_Sub1_25.method3807(0, 34168, 768);
			this.aClass104_Sub1_25.method3803(2);
			this.aClass104_Sub1_25.method3837(260, 7681);
			this.aClass104_Sub1_25.method3807(0, 34168, 768);
			this.aClass104_Sub1_25.method3807(1, 34168, 770);
			this.aClass104_Sub1_25.method3808(0, 34167, 770);
		}
		this.aClass104_Sub1_25.method3803(0);
		this.aClass182_1.method24569();
		this.aClass182_1.method24571(1);
		this.aClass104_Sub1_25.method3803(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean44) {
			this.aClass104_Sub1_25.method3837(8448, 8448);
			this.aClass104_Sub1_25.method3807(0, 5890, 768);
			this.aClass104_Sub1_25.method3808(0, 5890, 770);
		} else {
			this.aClass104_Sub1_25.method3837(8448, 8448);
			this.aClass104_Sub1_25.method3807(0, 5890, 768);
			this.aClass104_Sub1_25.method3803(2);
			this.aClass104_Sub1_25.method3837(8448, 8448);
			this.aClass104_Sub1_25.method3807(0, 5890, 768);
			this.aClass104_Sub1_25.method3807(1, 34168, 768);
			this.aClass104_Sub1_25.method3808(0, 5890, 770);
		}
		this.aClass104_Sub1_25.method3803(0);
		this.aClass182_1.method24569();
	}

	@OriginalMember(owner = "client!aeb", name = "y", descriptor = "(II)V")
	@Override
	void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean43) {
			this.aClass104_Sub1_25.method3803(1);
			this.aClass104_Sub1_25.method3804(this.aClass88_Sub1Array1[arg0 - 1]);
			this.aClass104_Sub1_25.method3803(0);
		}
	}

	@OriginalMember(owner = "client!aeb", name = "u", descriptor = "()Z")
	@Override
	boolean method2802() {
		return true;
	}

	@OriginalMember(owner = "client!aeb", name = "f", descriptor = "(II)V")
	@Override
	void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean43) {
			this.aClass104_Sub1_25.method3803(1);
			this.aClass104_Sub1_25.method3804(this.aClass88_Sub1Array1[arg0 - 1]);
			this.aClass104_Sub1_25.method3803(0);
		}
	}

	@OriginalMember(owner = "client!aeb", name = "h", descriptor = "()V")
	void method1854() {
		this.aClass182_1 = new Class182(this.aClass104_Sub1_25, 2);
		this.aClass182_1.method24571(0);
		this.aClass104_Sub1_25.method3803(1);
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
		if (this.aBoolean44) {
			this.aClass104_Sub1_25.method3837(260, 7681);
			this.aClass104_Sub1_25.method3807(0, 5890, 770);
			this.aClass104_Sub1_25.method3808(0, 34167, 770);
		} else {
			this.aClass104_Sub1_25.method3837(7681, 8448);
			this.aClass104_Sub1_25.method3807(0, 34168, 768);
			this.aClass104_Sub1_25.method3803(2);
			this.aClass104_Sub1_25.method3837(260, 7681);
			this.aClass104_Sub1_25.method3807(0, 34168, 768);
			this.aClass104_Sub1_25.method3807(1, 34168, 770);
			this.aClass104_Sub1_25.method3808(0, 34167, 770);
		}
		this.aClass104_Sub1_25.method3803(0);
		this.aClass182_1.method24569();
		this.aClass182_1.method24571(1);
		this.aClass104_Sub1_25.method3803(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean44) {
			this.aClass104_Sub1_25.method3837(8448, 8448);
			this.aClass104_Sub1_25.method3807(0, 5890, 768);
			this.aClass104_Sub1_25.method3808(0, 5890, 770);
		} else {
			this.aClass104_Sub1_25.method3837(8448, 8448);
			this.aClass104_Sub1_25.method3807(0, 5890, 768);
			this.aClass104_Sub1_25.method3803(2);
			this.aClass104_Sub1_25.method3837(8448, 8448);
			this.aClass104_Sub1_25.method3807(0, 5890, 768);
			this.aClass104_Sub1_25.method3807(1, 34168, 768);
			this.aClass104_Sub1_25.method3808(0, 5890, 770);
		}
		this.aClass104_Sub1_25.method3803(0);
		this.aClass182_1.method24569();
	}
}
