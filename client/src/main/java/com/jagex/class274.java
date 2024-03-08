package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.Iterator;

@ObfuscatedName("je")
public abstract class class274 {

	@ObfuscatedName("je.e")
	public final class265 field2848;

	@ObfuscatedName("je.n")
	public class268 field2857;

	@ObfuscatedName("je.m")
	public class269 field2844;

	@ObfuscatedName("je.k")
	public class263 field2845;

	@ObfuscatedName("je.f")
	public class714 field2846;

	@ObfuscatedName("je.w")
	public class266 field2847;

	@ObfuscatedName("je.l")
	public class307 field2863;

	@ObfuscatedName("je.u")
	public final class271 field2874;

	@ObfuscatedName("je.z")
	public class267 field2842;

	@ObfuscatedName("je.p")
	public int field2851;

	@ObfuscatedName("je.d")
	public float field2852;

	@ObfuscatedName("je.c")
	public final class423 field2853 = new class423();

	@ObfuscatedName("je.r")
	public final class423 field2854 = new class423();

	@ObfuscatedName("je.o")
	public final class423 field2856 = new class423();

	@ObfuscatedName("je.s")
	public final class423 field2867 = new class423();

	@ObfuscatedName("je.y")
	public final float field2858 = 5120.0F;

	@ObfuscatedName("je.q")
	public final float field2873 = 10.0F;

	@ObfuscatedName("je.x")
	public final float field2860 = 1.0F;

	@ObfuscatedName("je.b")
	public float field2861 = 5120.0F;

	@ObfuscatedName("je.h")
	public float field2869 = 10.0F;

	@ObfuscatedName("je.a")
	public float field2849 = 1.0F;

	@ObfuscatedName("je.g")
	public final class423 field2864 = new class423();

	@ObfuscatedName("je.i")
	public final class423 field2865 = new class423();

	@ObfuscatedName("je.j")
	public float field2866;

	@ObfuscatedName("je.t")
	public float field2843;

	@ObfuscatedName("je.ae")
	public float field2855;

	@ObfuscatedName("je.ag")
	public float field2859;

	@ObfuscatedName("je.ac")
	public float field2872;

	@ObfuscatedName("je.ai")
	public float field2868;

	@ObfuscatedName("je.aw")
	public boolean field2862;

	@ObfuscatedName("je.as")
	public boolean field2875;

	@ObfuscatedName("je.at")
	public int field2876 = 0;

	@ObfuscatedName("je.ad")
	public float field2877 = 1.0F;

	@ObfuscatedName("je.am")
	public class729 field2878 = new class729(8);

	public class274(class265 arg0, class271 arg1) {
		this.field2848 = arg0;
		this.field2874 = arg1;
		this.method4680(true);
	}

	@ObfuscatedName("je.e(ZB)V")
	public void method4680(boolean arg0) {
		this.field2844 = class269.field2831;
		this.field2845 = null;
		this.field2846 = null;
		this.field2847 = null;
		this.field2863 = null;
		if (class265.field2812 != this.field2848 && arg0) {
			this.field2857 = class268.field2828;
		} else {
			this.field2857 = class268.field2829;
		}
		this.field2842 = class267.field2825;
		this.field2853.method6491(100.0F, 100.0F, 100.0F);
		this.field2854.method6491(100.0F, 100.0F, 100.0F);
		this.field2852 = 0.05F;
		this.field2856.method6491(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.field2867.method6491(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.field2864.method6491(1.0F, 1.0F, 1.0F);
		this.field2865.method6491(1.0F, 1.0F, 1.0F);
		this.field2866 = 1.1F;
		this.field2843 = 1.1F;
		this.field2855 = 50.0F;
		this.field2859 = 10000.0F;
		this.field2868 = 1.5707964F;
		this.field2872 = 1.5707964F;
		this.field2851 = 5;
		this.field2862 = true;
		this.field2875 = true;
		this.field2876 = 0;
		this.field2877 = 1.0F;
		this.field2878.method14499();
	}

	@ObfuscatedName("je.n(F[[[ILqx;III)V")
	public void method4681(float arg0, int[][][] arg1, class451 arg2, int arg3, int arg4) {
		if (this.field2846 != null) {
			this.field2846.method14131(arg0);
		}
		if (this.field2863 != null) {
			this.field2863.method5238(arg0, arg1, arg2, arg3, arg4);
		}
		Iterator var6 = this.field2878.iterator();
		while (var6.hasNext()) {
			class1180 var7 = (class1180) var6.next();
			var7.method19431(arg0);
		}
	}

	@ObfuscatedName("je.m(ZFLox;Lov;Lox;Lox;B)V")
	public void method4807(boolean arg0, float arg1, class423 arg2, class421 arg3, class423 arg4, class423 arg5) {
		if (class267.field2824 == this.field2842) {
			class580.method5205(arg1, arg2, arg4, arg5, arg0 ? this.field2867 : this.field2856, arg0 ? this.field2854 : this.field2853, (float) this.field2876, this.field2877, this.field2861, this.field2869);
		} else if (class267.field2825 == this.field2842) {
			class581.method8144(arg1, arg2, arg3, arg4, arg5, arg0 ? this.field2867 : this.field2856, arg0 ? this.field2854 : this.field2853, (float) this.field2876, this.field2877, this.field2861, this.field2869);
		} else if (class267.field2823 == this.field2842) {
			class579.method14933(arg1, arg2, arg3, arg4, arg5, arg0 ? this.field2865 : this.field2864, arg0 ? this.field2843 : this.field2866, this.field2861, this.field2849);
		}
	}

	@ObfuscatedName("je.k(Ljd;B)V")
	public void method4683(class268 arg0) {
		this.field2857 = arg0;
	}

	@ObfuscatedName("je.f(Lii;ZI)Laax;")
	public class714 method4684(class263 arg0, boolean arg1) throws class1109 {
		if (class268.field2829 == this.field2857 && !arg1) {
			throw new class1109();
		}
		this.field2845 = arg0;
		if (class263.field2788 == arg0) {
			this.field2846 = new class1071(this);
		} else if (class263.field2791 == arg0) {
			this.field2846 = new class1070(this);
		} else if (class263.field2790 == arg0) {
			this.field2846 = new class1069(this);
		} else if (class263.field2789 == arg0) {
			this.field2846 = new class1201(this);
		} else if (class263.field2795 == arg0) {
			this.field2846 = new class1203(this);
		} else if (class263.field2792 == arg0) {
			this.field2846 = new class1073(this);
		} else if (class263.field2787 == arg0) {
			this.field2846 = new class1202(this);
		}
		return this.field2846;
	}

	@ObfuscatedName("je.w(Lim;ZI)Lkl;")
	public class307 method4688(class266 arg0, boolean arg1) throws class1109 {
		if (class268.field2829 == this.field2857 && !arg1) {
			throw new class1109();
		}
		this.field2847 = arg0;
		if (class266.field2815 == arg0) {
			this.field2863 = new class910(this);
		} else if (class266.field2816 == arg0) {
			this.field2863 = new class909(this);
		} else if (class266.field2819 == arg0) {
			this.field2863 = new class1134(this);
		} else if (class266.field2817 == arg0) {
			this.field2863 = new class1136(this);
		} else if (class266.field2818 == arg0) {
			this.field2863 = new class1135(this);
		}
		return this.field2863;
	}

	@ObfuscatedName("je.l(I)Z")
	public boolean method4686() {
		if (class265.field2812 == this.field2848 && class268.field2829 == this.field2857) {
			return true;
		} else {
			return class265.field2813 == this.field2848 && class268.field2828 == this.field2857;
		}
	}

	@ObfuscatedName("je.u(FB)V")
	public void method4712(float arg0) throws class1109 {
		if (!this.method4686()) {
			throw new class1109();
		}
	}

	@ObfuscatedName("je.z(FI)V")
	public void method4766(float arg0) throws class1109 {
		if (!this.method4686()) {
			throw new class1109();
		}
		this.field2852 = arg0;
	}

	@ObfuscatedName("je.p(Lic;I)V")
	public void method4689(class267 arg0) throws class1109 {
		if (!this.method4686()) {
			throw new class1109();
		}
		this.field2842 = arg0;
	}

	@ObfuscatedName("je.d(Lox;I)V")
	public void method4690(class423 arg0) throws class1109 {
		if (!this.method4686() || !this.field2842.field2821) {
			throw new class1109();
		}
		this.field2856.method6492(arg0);
	}

	@ObfuscatedName("je.c(Lox;I)V")
	public void method4814(class423 arg0) throws class1109 {
		if (!this.method4686() || !this.field2842.field2821) {
			throw new class1109();
		}
		this.field2867.method6492(arg0);
	}

	@ObfuscatedName("je.r(FFFB)V")
	public void method4782(float arg0, float arg1, float arg2) throws class1109 {
		if (!this.method4686()) {
			throw new class1109();
		}
		this.field2861 = arg0;
		this.field2869 = arg1;
		this.field2849 = arg2;
	}

	@ObfuscatedName("je.v(I)V")
	public void method4756() throws class1109 {
		if (!this.method4686()) {
			throw new class1109();
		}
		this.field2861 = 5120.0F;
		this.field2869 = 10.0F;
		this.field2849 = 1.0F;
	}

	@ObfuscatedName("je.o(Lox;I)V")
	public void method4832(class423 arg0) throws class1109 {
		if (!this.method4686() || !this.field2842.field2821) {
			throw new class1109();
		}
		this.field2853.method6492(arg0);
	}

	@ObfuscatedName("je.s(Lox;I)V")
	public void method4695(class423 arg0) throws class1109 {
		if (!this.method4686() || !this.field2842.field2821) {
			throw new class1109();
		}
		this.field2854.method6492(arg0);
	}

	@ObfuscatedName("je.y(Lox;FI)V")
	public void method4696(class423 arg0, float arg1) throws class1109 {
		if (!this.method4686() || this.field2842.field2821) {
			throw new class1109();
		}
		this.field2864.method6492(arg0);
		this.field2865.method6492(arg0);
		this.field2866 = arg1;
		this.field2843 = arg1;
	}

	@ObfuscatedName("je.q(Lox;FI)V")
	public void method4699(class423 arg0, float arg1) throws class1109 {
		if (!this.method4686() || this.field2842.field2821) {
			throw new class1109();
		}
		this.field2864.method6492(arg0);
		this.field2866 = arg1;
	}

	@ObfuscatedName("je.x(Lox;FB)V")
	public void method4725(class423 arg0, float arg1) throws class1109 {
		if (!this.method4686() || this.field2842.field2821) {
			throw new class1109();
		}
		this.field2865.method6492(arg0);
		this.field2843 = arg1;
	}

	@ObfuscatedName("je.b(FFB)V")
	public void method4698(float arg0, float arg1) throws class1109 {
		if (!this.method4686()) {
			throw new class1109();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new class1109();
		}
		this.field2855 = arg0;
		this.field2859 = arg1;
	}

	@ObfuscatedName("je.h(FFI)V")
	public void method4828(float arg0, float arg1) throws class1109 {
		if (!this.method4686()) {
			throw new class1109();
		}
		this.field2872 = arg0;
		this.field2868 = arg1;
	}

	@ObfuscatedName("je.a(ZZI)V")
	public void method4700(boolean arg0, boolean arg1) throws class1109 {
		if (!this.method4686()) {
			throw new class1109();
		}
		this.field2862 = arg0;
		this.field2875 = arg1;
	}

	@ObfuscatedName("je.g(IFI)V")
	public void method4701(int arg0, float arg1) throws class1109 {
		if (!this.method4686() || !this.field2842.field2821) {
			throw new class1109();
		}
		this.field2876 = arg0;
		this.field2877 = arg1;
	}

	@ObfuscatedName("je.i(Laso;I)V")
	public void method4702(class1180 arg0) {
		this.field2878.method14501(arg0, (long) arg0.field12341);
	}

	@ObfuscatedName("je.j(II)V")
	public void method4703(int arg0) {
		class1180 var2 = (class1180) this.field2878.method14495((long) arg0);
		if (var2 != null) {
			var2.method8440();
		}
	}

	@ObfuscatedName("je.t(II)Laso;")
	public class1180 method4704(int arg0) {
		return (class1180) this.field2878.method14495((long) arg0);
	}

	@ObfuscatedName("je.ae(B)V")
	public void method4705() {
		this.field2878.method14499();
	}

	@ObfuscatedName("je.ag(B)Z")
	public boolean method4744() {
		if (this.field2846 == null || this.field2863 == null) {
			return false;
		} else if (this.field2846.method14145()) {
			return this.field2863.method5218();
		} else {
			return false;
		}
	}

	@ObfuscatedName("je.ah(Lju;Lou;Lpq;IIB)V")
	public void method4707(class270 arg0, class419 arg1, class426 arg2, int arg3, int arg4) {
		if (!this.method4744()) {
			return;
		}
		this.field2846.method14136(arg0, arg1, arg3, arg4, this.field2863.method5222());
		this.field2863.method5223(arg0, arg3, arg4);
		if (class269.field2831 == this.field2844) {
			arg2.method6618(this.field2855, this.field2859, this.field2872, this.field2868);
		} else {
			arg2.method6601(this.field2855, this.field2859, (float) this.field2851);
		}
		Iterator var6 = this.field2878.iterator();
		while (var6.hasNext()) {
			class1180 var7 = (class1180) var6.next();
			var7.method19440(arg0, arg1, arg2);
		}
	}

	@ObfuscatedName("je.al(I)Ljd;")
	public class268 method4708() {
		return this.field2857;
	}

	@ObfuscatedName("je.ac(B)Lkl;")
	public class307 method4709() {
		return this.field2863;
	}

	@ObfuscatedName("je.ai(I)Laax;")
	public class714 method4797() {
		return this.field2846;
	}

	@ObfuscatedName("je.aw(I)Ljy;")
	public class271 method4697() {
		return this.field2874;
	}

	@ObfuscatedName("je.as(B)Lii;")
	public class263 method4743() {
		return this.field2845;
	}

	@ObfuscatedName("je.at(I)Lim;")
	public class266 method4780() {
		return this.field2847;
	}

	@ObfuscatedName("je.ad(I)Lox;")
	public class423 method4714() {
		return this.field2863 != null && this.field2863.method5218() ? this.field2863.method5219() : null;
	}

	@ObfuscatedName("je.am(I)[D")
	public double[] method4715() {
		return this.field2863 != null && this.field2863.method5218() ? this.field2863.method5230() : null;
	}

	@ObfuscatedName("je.au(I)Lox;")
	public class423 method4711() {
		return this.field2846 != null && this.field2846.method14145() ? this.field2846.method14133() : null;
	}

	@ObfuscatedName("je.ar(I)Lakt;")
	public class994 method4717() {
		return this.field2863 != null && this.field2863.method5218() ? this.field2863.method5221() : null;
	}

	@ObfuscatedName("je.ap(B)F")
	public float method4718() {
		class423 var1 = this.method4714();
		class423 var2 = this.method4711();
		float var3 = 0.0F;
		if (var1 != null && var2 != null) {
			class423 var4 = class423.method6528(var2, var1);
			float var5 = (float) Math.sqrt((double) (var4.field4313 * var4.field4313 + var4.field4308 * var4.field4308));
			var3 = (float) Math.atan2((double) -var4.field4311, (double) var5);
			var1.method6486();
			var2.method6486();
		}
		return var3;
	}

	@ObfuscatedName("je.aq(B)F")
	public float method4719() {
		class423 var1 = this.method4714();
		class423 var2 = this.method4711();
		float var3 = 0.0F;
		if (var1 != null && var2 != null) {
			class423 var4 = class423.method6528(var1, var2);
			var4.field4311 = 0.0F;
			var3 = (float) Math.atan2((double) var4.field4308, (double) var4.field4313);
			var1.method6486();
			var2.method6486();
		}
		return (float) (3.141592653589793D - (double) var3);
	}

	@ObfuscatedName("je.ax(I)F")
	public float method4720() {
		return 0.0F;
	}

	@ObfuscatedName("je.av(I)Lov;")
	public class421 method4721() {
		class421 var1 = class421.method6469();
		var1.method6415(this.method4719(), this.method4718(), this.method4720());
		return var1;
	}

	@ObfuscatedName("je.ao(B)Lox;")
	public class423 method4794() {
		return this.field2856;
	}

	@ObfuscatedName("je.aj(I)Lox;")
	public class423 method4778() {
		return this.field2867;
	}

	@ObfuscatedName("je.ay(S)F")
	public float method4724() {
		return this.field2852;
	}

	@ObfuscatedName("je.ab(B)Lox;")
	public class423 method4728() {
		return this.field2853;
	}

	@ObfuscatedName("je.az(B)Lox;")
	public class423 method4693() {
		return this.field2854;
	}

	@ObfuscatedName("je.aa(I)F")
	public float method4727() {
		return this.field2855;
	}

	@ObfuscatedName("je.af(I)F")
	public float method4785() {
		return this.field2859;
	}

	@ObfuscatedName("je.ak(I)F")
	public float method4784() {
		return this.field2872;
	}

	@ObfuscatedName("je.an(I)Z")
	public boolean method4730() {
		return this.field2862;
	}

	@ObfuscatedName("je.bf(I)Z")
	public boolean method4731() {
		return this.field2875;
	}
}
