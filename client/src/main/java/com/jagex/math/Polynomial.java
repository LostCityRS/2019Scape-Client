package com.jagex.math;

import deob.ObfuscatedName;

@ObfuscatedName("eo")
public class Polynomial {

	@ObfuscatedName("eo.e")
	public float[] p;

	@ObfuscatedName("eo.n")
	public int deg;

	public Polynomial(float[] arg0, int arg1) {
		this.p = arg0;
		this.deg = arg1;
	}

	@ObfuscatedName("vi.e([FIFZFZ[FB)I")
	public static int polyZeroes(float[] poly, int deg, float a, boolean aClosed, float b, boolean bClosed, float[] roots) {
		float f = 0.0F;
		for (int var8 = 0; var8 < deg + 1; var8++) {
			f += Math.abs(poly[var8]);
		}
		float tolerance = (Math.abs(a) + Math.abs(b)) * (float) (deg + 1) * CurveEvaluator.EPSILON;
		if (f <= tolerance) {
			return -1;
		}
		float[] coefficients = new float[deg + 1];
		for (int nr = 0; nr < deg + 1; nr++) {
			coefficients[nr] = 1.0F / f * poly[nr];
		}
		while (Math.abs(coefficients[deg]) < tolerance) {
			deg--;
		}
		int var12 = 0;
		if (deg == 0) {
			return var12;
		} else if (deg == 1) {
			roots[0] = -coefficients[0] / coefficients[1];
			boolean leftOk = aClosed ? a < roots[0] + tolerance : a < roots[0] - tolerance;
			boolean rightOk = bClosed ? b > roots[0] - tolerance : b > roots[0] + tolerance;
			int nr = leftOk && rightOk ? 1 : 0;
			if (nr > 0) {
				if (aClosed && roots[0] < a) {
					roots[0] = a;
				} else if (bClosed && roots[0] > b) {
					roots[0] = b;
				}
			}
			return nr;
		} else {
			Polynomial polynomial = new Polynomial(coefficients, deg);
			float[] d = new float[deg + 1];
			for (int i = 1; i <= deg; i++) {
				d[i - 1] = coefficients[i] * (float) i;
			}
			float[] dr = new float[deg + 1];
			int ndr = polyZeroes(d, deg - 1, a, false, b, false, dr);
			if (ndr == -1) {
				return 0;
			}
			boolean skip = false;
			float pe = 0.0F;
			float ps = 0.0F;
			float end = 0.0F;
			for (int i = 0; i <= ndr; i++) {
				if (var12 > deg) {
					return var12;
				}
				float start;
				float var27;
				if (i == 0) {
					start = a;
					var27 = horner1(coefficients, deg, a);
					if (Math.abs(var27) <= tolerance && aClosed) {
						roots[var12++] = a;
					}
				} else {
					start = end;
					var27 = pe;
				}
				if (ndr == i) {
					end = b;
					skip = false;
				} else {
					end = dr[i];
				}
				pe = horner1(coefficients, deg, end);
				if (skip) {
					skip = false;
				} else if (Math.abs(pe) < tolerance) {
					if (ndr != i || bClosed) {
						roots[var12++] = end;
						skip = true;
					}
				} else if (var27 < 0.0F && pe > 0.0F || var27 > 0.0F && pe < 0.0F) {
					roots[var12++] = zeroin(polynomial, start, end, 0.0F);
					if (var12 > 1 && roots[var12 - 2] >= roots[var12 - 1] - tolerance) {
						roots[var12 - 2] = (roots[var12 - 2] + roots[var12 - 1]) * 0.5F;
						var12--;
					}
				}
			}
			return var12;
		}
	}

	@ObfuscatedName("ju.n([FIFS)F")
	public static float horner1(float[] arg0, int arg1, float arg2) {
		float var3 = arg0[arg1];
		for (int var4 = arg1 - 1; var4 >= 0; var4--) {
			var3 = arg2 * var3 + arg0[var4];
		}
		return var3;
	}

	@ObfuscatedName("adg.m(Leo;FFFI)F")
	public static float zeroin(Polynomial arg0, float arg1, float arg2, float arg3) {
		float var4 = horner1(arg0.p, arg0.deg, arg1);
		if (Math.abs(var4) < CurveEvaluator.EPSILON) {
			return arg1;
		}
		float var5 = horner1(arg0.p, arg0.deg, arg2);
		if (Math.abs(var5) < CurveEvaluator.EPSILON) {
			return arg2;
		}
		float var6 = 0.0F;
		float var7 = 0.0F;
		float var8 = 0.0F;
		float var9 = 0.0F;
		boolean var10 = true;
		boolean var11 = false;
		boolean var12;
		do {
			var12 = false;
			if (var10) {
				var6 = arg1;
				var9 = var4;
				var7 = arg2 - arg1;
				var8 = var7;
				var10 = false;
			}
			if (Math.abs(var9) < Math.abs(var5)) {
				arg1 = arg2;
				arg2 = var6;
				var6 = arg1;
				var4 = var5;
				var5 = var9;
				var9 = var4;
			}
			float var13 = CurveEvaluator.DOUBLE_EPSILON * Math.abs(arg2) + arg3 * 0.5F;
			float var14 = (var6 - arg2) * 0.5F;
			boolean var15 = Math.abs(var14) > var13 && var5 != 0.0F;
			if (var15) {
				if (Math.abs(var8) < var13 || Math.abs(var4) <= Math.abs(var5)) {
					var7 = var14;
					var8 = var14;
				} else {
					float var16 = var5 / var4;
					float var17;
					float var18;
					if (arg1 == var6) {
						var17 = var14 * 2.0F * var16;
						var18 = 1.0F - var16;
					} else {
						float var19 = var4 / var9;
						float var20 = var5 / var9;
						var17 = (var14 * 2.0F * var19 * (var19 - var20) - (arg2 - arg1) * (var20 - 1.0F)) * var16;
						var18 = (var19 - 1.0F) * (var20 - 1.0F) * (var16 - 1.0F);
					}
					if ((double) var17 > 0.0D) {
						var18 = -var18;
					} else {
						var17 = -var17;
					}
					float var21 = var8;
					var8 = var7;
					if (var17 * 2.0F < var14 * 3.0F * var18 - Math.abs(var13 * var18) && var17 < Math.abs(var21 * 0.5F * var18)) {
						var7 = var17 / var18;
					} else {
						var7 = var14;
						var8 = var14;
					}
				}
				arg1 = arg2;
				var4 = var5;
				if (Math.abs(var7) > var13) {
					arg2 += var7;
				} else if ((double) var14 > 0.0D) {
					arg2 += var13;
				} else {
					arg2 -= var13;
				}
				var5 = horner1(arg0.p, arg0.deg, arg2);
				if ((double) (var5 * (var9 / Math.abs(var9))) > 0.0D) {
					var10 = true;
					var12 = true;
				} else {
					var12 = true;
				}
			}
		} while (var12);
		return arg2;
	}
}
