package com.jagex.graphics.gl;

import com.jagex.game.client.DataType;
import com.jagex.graphics.TextureFormat;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("apr")
public class GlTexture_Sub1_Sub1 extends GlTexture_Sub1 {

	@ObfuscatedName("apr.q")
	public final int field11900;

	@ObfuscatedName("apr.x")
	public final int field11902;

	@ObfuscatedName("apr.b")
	public final float field11898;

	@ObfuscatedName("apr.h")
	public final float field11901;

	@ObfuscatedName("apr.a")
	public final boolean field11899;

	@ObfuscatedName("apr.g")
	public final boolean field11903;

	@ObfuscatedName("apr.bi(Lafa;Lck;Ldg;II)Lapr;")
	public static GlTexture_Sub1_Sub1 method18934(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
		if (arg0.field9998 || IntMath.method4918(arg3) && IntMath.method4918(arg4)) {
			return new GlTexture_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4);
		} else if (arg0.field9965) {
			return new GlTexture_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4);
		} else {
			return new GlTexture_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, IntMath.bitceil(arg3), IntMath.bitceil(arg4));
		}
	}

	@ObfuscatedName("apr.bn(Lafa;IIZ[III)Lapr;")
	public static GlTexture_Sub1_Sub1 method18931(GlToolkit arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
		if (arg0.field9998 || IntMath.method4918(arg1) && IntMath.method4918(arg2)) {
			return new GlTexture_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4, arg5, arg6);
		} else if (arg0.field9965) {
			return new GlTexture_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			return new GlTexture_Sub1_Sub1(arg0, arg1, arg2, IntMath.bitceil(arg1), IntMath.bitceil(arg2), arg4);
		}
	}

	@ObfuscatedName("apr.bt(Lafa;Lck;Ldg;IIZ[BLck;)Lapr;")
	public static GlTexture_Sub1_Sub1 method18932(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, boolean arg5, byte[] arg6, TextureFormat arg7) {
		if (arg0.field9998 || IntMath.method4918(arg3) && IntMath.method4918(arg4)) {
			return new GlTexture_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} else if (arg0.field9965) {
			return new GlTexture_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
		} else {
			return new GlTexture_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, IntMath.bitceil(arg3), IntMath.bitceil(arg4), arg6, arg7);
		}
	}

	@ObfuscatedName("apr.bq(Lafa;IIII)Lapr;")
	public static GlTexture_Sub1_Sub1 method18930(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0.field9998 || IntMath.method4918(arg3) && IntMath.method4918(arg4)) {
			return new GlTexture_Sub1_Sub1(arg0, 3553, arg1, arg2, arg3, arg4, true);
		} else if (arg0.field9965) {
			return new GlTexture_Sub1_Sub1(arg0, 34037, arg1, arg2, arg3, arg4, true);
		} else {
			return new GlTexture_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, IntMath.bitceil(arg3), IntMath.bitceil(arg4), true);
		}
	}

	public GlTexture_Sub1_Sub1(GlToolkit arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4, int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.field11900 = arg4;
		this.field11902 = arg5;
		if (this.field1009 == 34037) {
			this.field11898 = arg5;
			this.field11901 = arg4;
			this.field11899 = false;
		} else {
			this.field11898 = 1.0F;
			this.field11901 = 1.0F;
			this.field11899 = true;
		}
		this.field11903 = false;
	}

	public GlTexture_Sub1_Sub1(GlToolkit arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.field11900 = arg2;
		this.field11902 = arg3;
		if (this.field1009 == 34037) {
			this.field11898 = arg3;
			this.field11901 = arg2;
			this.field11899 = false;
		} else {
			this.field11898 = 1.0F;
			this.field11901 = 1.0F;
			this.field11899 = true;
		}
		this.field11903 = false;
	}

	public GlTexture_Sub1_Sub1(GlToolkit arg0, int arg1, TextureFormat arg2, DataType arg3, int arg4, int arg5, boolean arg6, byte[] arg7, TextureFormat arg8) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, true);
		this.field11900 = arg4;
		this.field11902 = arg5;
		if (this.field1009 == 34037) {
			this.field11898 = arg5;
			this.field11901 = arg4;
			this.field11899 = false;
		} else {
			this.field11898 = 1.0F;
			this.field11901 = 1.0F;
			this.field11899 = true;
		}
		this.field11903 = false;
	}

	public GlTexture_Sub1_Sub1(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.field11900 = arg4;
		this.field11902 = arg5;
		if (this.field1009 == 34037) {
			this.field11898 = arg5;
			this.field11901 = arg4;
			this.field11899 = false;
		} else {
			this.field11898 = 1.0F;
			this.field11901 = 1.0F;
			this.field11899 = true;
		}
		this.field11903 = false;
	}

	public GlTexture_Sub1_Sub1(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.field11900 = arg3;
		this.field11902 = arg4;
		this.field11898 = (float) arg4 / (float) arg6;
		this.field11901 = (float) arg3 / (float) arg5;
		this.field11899 = false;
		this.field11903 = true;
		this.method15312(false, false);
	}

	public GlTexture_Sub1_Sub1(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
		super(arg0, 3553, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, arg3, arg4);
		this.field11900 = arg1;
		this.field11902 = arg2;
		this.method15313(0, arg4 - arg2, arg1, arg2, arg5, 0, 0, true);
		this.field11898 = (float) arg2 / (float) arg4;
		this.field11901 = (float) arg1 / (float) arg3;
		this.field11899 = false;
		this.field11903 = true;
		this.method15312(false, false);
	}

	public GlTexture_Sub1_Sub1(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, TextureFormat arg8) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.field11900 = arg3;
		this.field11902 = arg4;
		this.method15331(0, arg6 - arg4, arg3, arg4, arg7, arg8, 0, 0, true);
		this.field11898 = (float) arg4 / (float) arg6;
		this.field11901 = (float) arg3 / (float) arg5;
		this.field11899 = false;
		this.field11903 = true;
		this.method15312(false, false);
	}

	public GlTexture_Sub1_Sub1(GlToolkit arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.field11900 = arg3;
		this.field11902 = arg4;
		this.field11898 = (float) arg4 / (float) arg6;
		this.field11901 = (float) arg3 / (float) arg5;
		this.field11899 = false;
		this.field11903 = true;
		this.method15312(false, false);
	}

	@ObfuscatedName("apr.e(Z)V")
	public void method1082(boolean arg0) {
		super.method1082(arg0 && !this.field11903);
	}
}
