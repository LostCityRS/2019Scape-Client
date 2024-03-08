package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("xu")
public class class636 {

	@ObfuscatedName("xu.e")
	public static int field7859 = -1;

	@ObfuscatedName("xu.k")
	public static int field7835 = 5047;

	@ObfuscatedName("xu.f")
	public final Renderer field7833;

	@ObfuscatedName("xu.w")
	public final class637[][] field7836;

	@ObfuscatedName("xu.l")
	public int field7837 = 0;

	@ObfuscatedName("xu.u")
	public int field7838 = -1;

	@ObfuscatedName("xu.z")
	public long field7839 = 0L;

	@ObfuscatedName("xu.p")
	public boolean field7840 = false;

	@ObfuscatedName("xu.d")
	public final class637 field7856;

	@ObfuscatedName("xu.c")
	public final class637 field7841;

	@ObfuscatedName("xu.r")
	public final class637 field7843;

	@ObfuscatedName("xu.v")
	public final class637 field7844;

	@ObfuscatedName("xu.o")
	public class637 field7854;

	@ObfuscatedName("xu.s")
	public class660 field7831;

	@ObfuscatedName("xu.y")
	public final Vector3 field7847 = new Vector3(-50.0F, -60.0F, -50.0F);

	@ObfuscatedName("xu.q")
	public final WeightedCache field7848 = new WeightedCache(8);

	@ObfuscatedName("xu.x")
	public final WeightedCache field7849 = new WeightedCache(8);

	@ObfuscatedName("xu.b")
	public final WeightedCache field7850 = new WeightedCache(8);

	@ObfuscatedName("xu.h")
	public final class442 field7845;

	@ObfuscatedName("xu.a")
	public boolean field7852 = false;

	@ObfuscatedName("xu.g")
	public int[] field7851 = new int[] { -1, -1, -1 };

	@ObfuscatedName("xu.i")
	public float[] field7834 = new float[] { 0.0F, 0.0F, 0.0F };

	@ObfuscatedName("xu.j")
	public boolean field7855 = false;

	@ObfuscatedName("xu.t")
	public float field7853;

	@ObfuscatedName("xu.ae")
	public float field7857;

	@ObfuscatedName("xu.ag")
	public float field7858;

	@ObfuscatedName("xu.ah")
	public float field7842;

	@ObfuscatedName("xu.al")
	public float field7860;

	public class636(Renderer arg0, class442 arg1, int arg2, int arg3) {
		this.field7833 = arg0;
		this.field7845 = arg1;
		this.field7836 = new class637[arg2][arg3];
		if (field7859 != -1) {
			Statics.field7832 = this.method9985(field7859);
		}
		Statics.field7846 = null;
		this.field7856 = new class637();
		this.field7841 = new class637();
		this.field7843 = new class637();
		this.field7844 = new class637();
		this.method10019();
		this.method10002();
		this.method10000();
	}

	@ObfuscatedName("xu.e(Lrl;B)V")
	public void method10003(class495 arg0) {
		class637 var2 = this.method10049(arg0);
		if (this.field7831 == null) {
			this.method10007(var2, field7835);
		} else {
			this.field7854.method10083(var2);
			this.field7854.method10063(this, this.field7831);
			this.method10007(this.field7854, this.field7831.method10380());
		}
		this.method9990();
		this.method10008();
		this.method9997();
	}

	@ObfuscatedName("xu.n(Lrl;B)V")
	public void method9979(class495 arg0) {
		class637 var2 = this.method10049(arg0);
		if (this.field7831 == null) {
			this.method10007(var2, field7835);
		} else {
			this.field7854.method10083(var2);
			this.field7854.method10063(this, this.field7831);
			this.method10007(this.field7854, this.field7831.method10380());
		}
		this.method9990();
		this.method10054();
		this.method10037();
		this.method10001();
	}

	@ObfuscatedName("xu.m(Lrl;Lyj;II)V")
	public void method9980(class495 arg0, class660 arg1, int arg2) {
		this.field7831 = arg1;
		class637 var4 = this.method10049(arg0);
		if (this.field7831 == null) {
			this.method10007(var4, arg2);
			this.field7854 = null;
			return;
		}
		if (this.field7854 == null) {
			this.field7854 = new class637();
		}
		this.field7854.method10083(var4);
		this.field7854.method10063(this, this.field7831);
		this.method10007(this.field7854, arg2);
	}

	@ObfuscatedName("xu.k(I)Lyj;")
	public class660 method9981() {
		return this.field7831;
	}

	@ObfuscatedName("xu.f(I)Lxv;")
	public class637 method9982() {
		return this.field7841;
	}

	@ObfuscatedName("xu.w(Lxu;I)V")
	public void method9992(class636 arg0) {
		this.field7841.method10083(arg0.field7841);
		this.field7843.method10083(arg0.field7843);
		this.field7844.method10083(arg0.field7844);
		this.field7839 = arg0.field7839;
		this.field7837 = arg0.field7837;
		this.field7838 = arg0.field7838;
	}

	@ObfuscatedName("xu.l(I)V")
	public void method9984() {
		this.field7848.method2924();
		this.field7849.method2924();
		this.field7850.method2924();
	}

	@ObfuscatedName("xu.u(II)Ldz;")
	public class117 method9985(int arg0) {
		class117 var2 = (class117) this.field7848.method2930((long) arg0);
		if (var2 == null) {
			class117 var3 = this.field7833.method2229(arg0);
			this.field7848.method2921(var3, (long) arg0);
			return var3;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("xu.z(IIIII)Lsv;")
	public class502 method9986(int arg0, int arg1, int arg2, int arg3) {
		long var5 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		class502 var7 = (class502) this.field7849.method2930(var5);
		if (var7 == null) {
			var7 = class568.method305(arg0, arg1, arg2, arg3, Statics.field2879, Statics.field687);
			this.field7849.method2921(var7, var5);
		}
		return var7;
	}

	@ObfuscatedName("xu.p(IB)Lcj;")
	public class110 method9987(int arg0) {
		class110 var2 = (class110) this.field7850.method2930((long) arg0);
		if (var2 != null) {
			return var2;
		}
		class136 var3 = class111.method1607(this.field7845, arg0);
		if (var3 != null && var3.method2639() == 256 && var3.method2631() == 16) {
			int[] var4 = var3.method2604(false);
			var2 = this.field7833.method2237(var4);
			if (var2 != null) {
				this.field7850.method2921(var2, (long) arg0);
			}
		}
		return var2;
	}

	@ObfuscatedName("xu.d(IILxv;I)V")
	public void method9999(int arg0, int arg1, class637 arg2) {
		this.field7836[arg0][arg1] = arg2;
	}

	@ObfuscatedName("xu.c(B)V")
	public void method9998() {
		for (int var1 = 0; var1 < this.field7836.length; var1++) {
			for (int var2 = 0; var2 < this.field7836[var1].length; var2++) {
				this.field7836[var1][var2] = this.field7856;
			}
		}
	}

	@ObfuscatedName("xu.r(III)V")
	public void method9991(int arg0, int arg1) {
		class637 var3 = this.field7836[arg0][arg1];
		if (var3 != null) {
			this.field7847.method6492(var3.field7865);
		}
		this.method10008();
	}

	@ObfuscatedName("xu.v(Lrl;I)Lxv;")
	public class637 method10049(class495 arg0) {
		Object var2 = null;
		int var3 = -1;
		int var4 = -1;
		if (Statics.method611(client.field10791) || Statics.method15084(client.field10791)) {
			var3 = Statics.field7956 >> 12;
			var4 = Statics.field1881 >> 12;
		} else {
			if (Statics.field4490 != null) {
				var3 = Statics.field4490.field10450[0] >> 3;
				var4 = Statics.field4490.field10448[0] >> 3;
			}
			if (var3 < 0 || var3 >= arg0.method7728() >> 3 || var4 < 0 || var4 >= arg0.method7758() >> 3) {
				var3 = arg0.method7728() >> 4;
				var4 = arg0.method7758() >> 4;
			}
		}
		class637 var5 = this.field7836[var3][var4];
		if (var5 == null) {
			var5 = this.field7856;
		}
		return var5;
	}

	@ObfuscatedName("xu.o(Lxv;II)V")
	public void method10007(class637 arg0, int arg1) {
		if (this.field7840) {
			this.field7840 = false;
			arg1 = 0;
		}
		if (this.field7844.method10071(arg0)) {
			return;
		}
		this.field7844.method10083(arg0);
		this.field7839 = class213.method3655();
		this.field7837 = this.field7838 = arg1;
		if (this.field7837 == 0) {
			return;
		}
		this.field7843.method10083(this.field7841);
		if (this.field7841.field7863 == null) {
			return;
		}
		if (this.field7841.field7863.method7960()) {
			this.field7841.field7863 = this.field7843.field7863 = this.field7841.field7863.method7942();
		}
		if (this.field7841.field7863 != null && this.field7844.field7863 != this.field7841.field7863) {
			this.field7841.field7863.method7962(this.field7844.field7863);
		}
	}

	@ObfuscatedName("xu.s(I)V")
	public void method9990() {
		if (this.field7838 < 0) {
			return;
		}
		long var1 = class213.method3655();
		this.field7838 = (int) ((long) (this.field7838) - (var1 - this.field7839));
		if (this.field7838 > 0) {
			this.field7841.method10094(this.field7833, this.field7843, this.field7844, (float) (this.field7837 - this.field7838) / (float) this.field7837);
		} else {
			this.field7841.method10083(this.field7844);
			if (this.field7841.field7863 != null) {
				this.field7841.field7863.method7958();
			}
			this.field7838 = -1;
		}
		this.field7839 = var1;
	}

	@ObfuscatedName("xu.y(I)V")
	public void method10019() {
		this.field7840 = true;
	}

	@ObfuscatedName("xu.q(I)V")
	public void method10008() {
		this.field7833.method2222(((float) Statics.field688.field11549.method18408() * 0.1F + 0.7F + client.field10855.method7732()) * this.field7841.field7871);
		this.field7833.method2223(this.field7841.field7877, this.field7841.field7861, this.field7841.field7864, (float) ((int) this.field7847.field4308 << 2), (float) ((int) this.field7847.field4311 << 2), (float) ((int) this.field7847.field4313 << 2));
		this.field7833.method2516(this.field7841.field7868);
	}

	@ObfuscatedName("xu.x(FFFIIIIII)V")
	public void method9996(float arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		this.field7833.method2222(((float) Statics.field688.field11549.method18408() * 0.1F + 0.7F + client.field10855.method7732()) * arg0);
		this.field7833.method2223(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.field7833.method2516(this.method9985(arg7));
	}

	@ObfuscatedName("xu.b(I)V")
	public void method9997() {
		byte var1 = 0;
		int var2 = (this.field7841.field7867 + 256 << 2) + var1;
		this.field7833.method2572(this.field7841.field7866, Statics.field688.field11564.method18434() == 1 ? var2 : -1, 0);
	}

	@ObfuscatedName("xu.h(I)V")
	public void method10054() {
		this.field7833.method2243(this.field7841.field7874, this.field7841.field7862, this.field7841.field7870);
	}

	@ObfuscatedName("xu.a(I)V")
	public void method10037() {
		if (!this.field7833.method2152()) {
			return;
		}
		if (this.field7855) {
			this.field7833.method2236(this.field7853, this.field7857, this.field7858, this.field7842, this.field7860);
		} else {
			this.field7833.method2236(this.field7841.field7873, this.field7841.field7869, this.field7841.field7875, this.field7841.field7876, this.field7841.field7872);
		}
	}

	@ObfuscatedName("xu.g(B)V")
	public void method10000() {
		this.field7855 = false;
		this.field7853 = 1.0F;
		this.field7857 = 0.0F;
		this.field7858 = 1.0F;
		this.field7842 = 0.0F;
		this.field7860 = 1.0F;
	}

	@ObfuscatedName("xu.i(B)V")
	public void method10001() {
		if (!this.field7833.method2238()) {
			return;
		}
		class110 var1 = null;
		class110 var2 = null;
		class110 var3 = null;
		if (!this.field7852) {
			if (this.field7841.field7878[0] > -1) {
				var1 = this.method9987(this.field7841.field7878[0]);
			}
			if (this.field7841.field7878[1] > -1) {
				var2 = this.method9987(this.field7841.field7878[1]);
			}
			if (this.field7841.field7878[2] > -1) {
				var3 = this.method9987(this.field7841.field7878[2]);
			}
			this.field7833.method2239(var1, this.field7841.field7879[0], var2, this.field7841.field7879[1], var3, this.field7841.field7879[2]);
			return;
		}
		if (this.field7851[0] > -1) {
			var1 = this.method9987(this.field7851[0]);
		}
		if (this.field7851[1] > -1) {
			var2 = this.method9987(this.field7851[1]);
		}
		if (this.field7851[2] > -1) {
			var3 = this.method9987(this.field7851[2]);
		}
		this.field7833.method2239(var1, this.field7834[0], var2, this.field7834[1], var3, this.field7834[2]);
	}

	@ObfuscatedName("xu.j(I)V")
	public void method10002() {
		this.field7852 = false;
		int[] var1 = this.field7851;
		int[] var2 = this.field7851;
		this.field7851[2] = -1;
		var2[1] = -1;
		var1[0] = -1;
		float[] var3 = this.field7834;
		float[] var4 = this.field7834;
		this.field7834[2] = 0.0F;
		var4[1] = 0.0F;
		var3[0] = 0.0F;
	}

	@ObfuscatedName("xu.t(I)V")
	public void method9983() {
		this.field7833.method2222(((float) Statics.field688.field11549.method18408() * 0.1F + 0.7F + client.field10855.method7732()) * 1.1523438F);
		this.field7833.method2223(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.field7833.method2572(13156520, -1, 0);
		this.field7833.method2516(Statics.field7832);
	}
}
