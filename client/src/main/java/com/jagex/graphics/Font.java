package com.jagex.graphics;

import com.jagex.core.utils.Cp1252;
import com.jagex.core.utils.StringTools;
import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("eu")
public abstract class Font {

	@ObfuscatedName("eu.e")
	public FontMetrics fontMetrics;

	@ObfuscatedName("eu.n")
	public Toolkit toolkit;

	@ObfuscatedName("eu.w")
	public static int strikethrough = -1;

	@ObfuscatedName("eu.l")
	public static int underline = -1;

	@ObfuscatedName("eu.u")
	public static int originalRgb = 0;

	@ObfuscatedName("eu.z")
	public static int rgb = 0;

	@ObfuscatedName("eu.p")
	public static int originalShadow = 0;

	@ObfuscatedName("eu.d")
	public static int shadow = 0;

	@ObfuscatedName("eu.c")
	public static int field1677 = 0;

	@ObfuscatedName("eu.r")
	public static int field1678 = 0;

	@ObfuscatedName("eu.v")
	public static String[] stringBuilder = new String[100];

	public Font(Toolkit toolkit, FontMetrics fontMetrics) {
		this.toolkit = toolkit;
		this.fontMetrics = fontMetrics;
	}

	@ObfuscatedName("eu.e(Ljava/lang/String;IIIIB)V")
	public void drawString(String str, int x, int y, int rgb, int shadow) {
		if (str != null) {
			this.setStyle(rgb, shadow);
			this.drawChars(str, x, y, null, null, null, 0, 0);
		}
	}

	@ObfuscatedName("eu.n(Ljava/lang/String;IIIII)V")
	public void drawStringRight(String str, int x, int y, int rgb, int shadow) {
		if (str != null) {
			this.setStyle(rgb, shadow);
			this.drawChars(str, x - this.fontMetrics.stringWidth(str), y, null, null, null, 0, 0);
		}
	}

	@ObfuscatedName("eu.m(Ljava/lang/String;IIIII)V")
	public void drawStringCenter(String str, int x, int y, int rgb, int shadow) {
		if (str != null) {
			this.setStyle(rgb, shadow);
			this.drawChars(str, x - this.fontMetrics.stringWidth(str) / 2, y, null, null, null, 0, 0);
		}
	}

	@ObfuscatedName("eu.k(Ljava/lang/String;IIIIIIIII[Lcm;[ILch;IIS)I")
	public int drawStringTaggable(String str, int x, int y, int width, int height, int rgb, int shadow, int arg7, int arg8, int arg9, Sprite[] glyphs, int[] arg11, SpriteRelated arg12, int arg13, int arg14) {
		return this.drawStringTaggable(str, x, y, width, height, rgb, shadow, arg7, arg8, arg9, 0, glyphs, arg11, arg12, arg13, arg14);
	}

	@ObfuscatedName("eu.f(Ljava/lang/String;IIIIIIIIII[Lcm;[ILch;III)I")
	public int drawStringTaggable(String str, int x, int y, int width, int height, int rgb, int shadow, int arg7, int arg8, int arg9, int arg10, Sprite[] glyphs, int[] arg12, SpriteRelated arg13, int arg14, int arg15) {
		if (str == null) {
			return 0;
		}
		this.setStyle(rgb, shadow);
		if (arg9 == 0) {
			arg9 = this.fontMetrics.field8566;
		}
		int[] splitWidth;
		if (height < this.fontMetrics.field8569 + this.fontMetrics.field8562 + arg9 && height < arg9 + arg9) {
			splitWidth = null;
		} else {
			splitWidth = new int[] { width };
		}
		int split = this.fontMetrics.splitInit(str, splitWidth, stringBuilder, glyphs);
		if (arg10 == -1) {
			arg10 = height / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && split >= arg10) {
			stringBuilder[arg10 - 1] = this.fontMetrics.truncString(stringBuilder[arg10 - 1], width, glyphs);
			split = arg10;
		}
		if (arg8 == 3 && split == 1) {
			arg8 = 1;
		}
		int yoff;
		if (arg8 == 0) {
			yoff = this.fontMetrics.field8562 + y;
		} else if (arg8 == 1) {
			yoff = (height - this.fontMetrics.field8562 - this.fontMetrics.field8569 - (split - 1) * arg9) / 2 + this.fontMetrics.field8562 + y;
		} else if (arg8 == 2) {
			yoff = y + height - this.fontMetrics.field8569 - (split - 1) * arg9;
		} else {
			int var20 = (height - this.fontMetrics.field8562 - this.fontMetrics.field8569 - (split - 1) * arg9) / (split + 1);
			if (var20 < 0) {
				var20 = 0;
			}
			yoff = this.fontMetrics.field8562 + y + var20;
			arg9 += var20;
		}
		for (int index = 0; index < split; index++) {
			if (arg7 == 0) {
				this.drawChars(stringBuilder[index], x, yoff, glyphs, arg12, arg13, arg14, arg15);
			} else if (arg7 == 1) {
				this.drawChars(stringBuilder[index], x + (width - this.fontMetrics.stringWidth(stringBuilder[index])) / 2, yoff, glyphs, arg12, arg13, arg14, arg15);
			} else if (arg7 == 2) {
				this.drawChars(stringBuilder[index], x + width - this.fontMetrics.stringWidth(stringBuilder[index]), yoff, glyphs, arg12, arg13, arg14, arg15);
			} else if (split - 1 == index) {
				this.drawChars(stringBuilder[index], x, yoff, glyphs, arg12, arg13, arg14, arg15);
			} else {
				this.method2716(stringBuilder[index], width);
				this.drawChars(stringBuilder[index], x, yoff, glyphs, arg12, arg13, arg14, arg15);
				field1677 = 0;
			}
			yoff += arg9;
		}
		return split;
	}

	@ObfuscatedName("eu.w(Ljava/lang/String;IIIIII)V")
	public void drawCenteredWave(String str, int x, int y, int rgb, int shadow, int phase) {
		if (str == null) {
			return;
		}
		this.setStyle(rgb, shadow);
		int length = str.length();
		int[] wave = new int[length];
		for (int index = 0; index < length; index++) {
			wave[index] = (int) (Math.sin((double) phase / 5.0D + (double) index / 2.0D) * 5.0D);
		}
		this.drawCharsAlpha(str, x - this.fontMetrics.stringWidth(str) / 2, y, null, null, null, wave);
	}

	@ObfuscatedName("eu.l(Ljava/lang/String;IIIIIB)V")
	public void drawCenteredWave2(String str, int x, int y, int rgb, int shadow, int phase) {
		if (str == null) {
			return;
		}
		this.setStyle(rgb, shadow);
		int length = str.length();
		int[] wave1 = new int[length];
		int[] wave2 = new int[length];
		for (int index = 0; index < length; index++) {
			wave1[index] = (int) (Math.sin((double) phase / 5.0D + (double) index / 5.0D) * 5.0D);
			wave2[index] = (int) (Math.sin((double) phase / 5.0D + (double) index / 3.0D) * 5.0D);
		}
		this.drawCharsAlpha(str, x - this.fontMetrics.stringWidth(str) / 2, y, null, null, wave1, wave2);
	}

	@ObfuscatedName("eu.u(Ljava/lang/String;IIIIIII)V")
	public void drawCenteredShake(String str, int x, int y, int rgb, int shadow, int phase, int arg6) {
		if (str == null) {
			return;
		}
		this.setStyle(rgb, shadow);
		double var8 = 7.0D - (double) arg6 / 8.0D;
		if (var8 < 0.0D) {
			var8 = 0.0D;
		}
		int length = str.length();
		int[] pixels = new int[length];
		for (int index = 0; index < length; index++) {
			pixels[index] = (int) (Math.sin((double) phase / 1.0D + (double) index / 1.5D) * var8);
		}
		this.drawCharsAlpha(str, x - this.fontMetrics.stringWidth(str) / 2, y, null, null, null, pixels);
	}

	@ObfuscatedName("eu.z(Ljava/lang/String;IIIILjava/util/Random;I[Lcm;[IB)I")
	public int method2689(String str, int x, int y, int rgb, int shadow, Random random, int seed, Sprite[] arg7, int[] arg8) {
		if (str == null) {
			return 0;
		}
		random.setSeed((long) seed);
		int rand = (random.nextInt() & 0x1F) + 192;
		this.setStyle(rand << 24 | rgb & 0xFFFFFF, rand << 24 | shadow & 0xFFFFFF);
		int length = str.length();
		int[] pixels = new int[length];
		int modified = 0;
		for (int index = 0; index < length; index++) {
			pixels[index] = modified;
			if ((random.nextInt() & 0x3) == 0) {
				modified++;
			}
		}
		this.drawCharsAlpha(str, x, y, arg7, arg8, pixels, null);
		return modified;
	}

	@ObfuscatedName("eu.p(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lcm;[II)I")
	public int drawStringTaggableAntimacro(String str, int x, int y, int width, int height, int rgb, int shadow, int arg7, int arg8, Random random, int seed, int[] arg11, Sprite[] arg12, int[] arg13) {
		if (str == null) {
			return 0;
		}
		random.setSeed((long) seed);
		int rand = (random.nextInt() & 0x1F) + 192;
		this.setStyle(rand << 24 | rgb & 0xFFFFFF, shadow == -1 ? 0 : rand << 24 | shadow & 0xFFFFFF);
		int length = str.length();
		int[] pixels = new int[length];
		int modified = 0;
		for (int var19 = 0; var19 < length; var19++) {
			pixels[var19] = modified;
			if ((random.nextInt() & 0x3) == 0) {
				modified++;
			}
		}
		int offx = x;
		int offy = this.fontMetrics.field8562 + y;
		int offw = -1;
		if (arg8 == 1) {
			offy += (height - this.fontMetrics.field8562 - this.fontMetrics.field8569) / 2;
		} else if (arg8 == 2) {
			offy = y + height - this.fontMetrics.field8569;
		}
		if (arg7 == 1) {
			offw = this.fontMetrics.stringWidth(str) + modified;
			offx = (width - offw) / 2 + x;
		} else if (arg7 == 2) {
			offw = this.fontMetrics.stringWidth(str) + modified;
			offx = width - offw + x;
		}
		this.drawCharsAlpha(str, offx, offy, arg12, arg13, pixels, null);
		if (arg11 != null) {
			if (offw == -1) {
				offw = this.fontMetrics.stringWidth(str) + modified;
			}
			arg11[0] = offx;
			arg11[1] = offy - this.fontMetrics.field8562;
			arg11[2] = offw;
			arg11[3] = this.fontMetrics.field8569 + this.fontMetrics.field8562;
		}
		return modified;
	}

	@ObfuscatedName("eu.d(III)V")
	public void setStyle(int rgb, int shadow) {
		strikethrough = -1;
		underline = -1;
		originalRgb = rgb;
		Font.rgb = rgb;
		field1677 = 0;
		field1678 = 0;
		if (shadow == -1) {
			shadow = 0;
		}
		originalShadow = shadow;
		Font.shadow = shadow;
	}

	@ObfuscatedName("eu.c(Ljava/lang/String;I)V")
	public void evaluateTag(String tag) {
		try {
			if (tag.startsWith("col=")) {
				rgb = rgb & 0xFF000000 | StringTools.method4321(tag.substring(4), 16) & 0xFFFFFF;
			} else if (tag.equals("/col")) {
				rgb = rgb & 0xFF000000 | originalRgb & 0xFFFFFF;
			}
			if (tag.startsWith("argb=")) {
				rgb = StringTools.method4321(tag.substring(5), 16);
			} else if (tag.equals("/argb")) {
				rgb = originalRgb;
			} else if (tag.startsWith("str=")) {
				strikethrough = rgb & 0xFF000000 | StringTools.method4321(tag.substring(4), 16);
			} else if (tag.equals("str")) {
				strikethrough = rgb & 0xFF000000 | 0x800000;
			} else if (tag.equals("/str")) {
				strikethrough = -1;
			} else if (tag.startsWith("u=")) {
				underline = rgb & 0xFF000000 | StringTools.method4321(tag.substring(2), 16);
			} else if (tag.equals("u")) {
				underline = rgb & 0xFF000000;
			} else if (tag.equals("/u")) {
				underline = -1;
			} else if (tag.equalsIgnoreCase("shad=-1")) {
				shadow = 0;
			} else if (tag.startsWith("shad=")) {
				shadow = rgb & 0xFF000000 | StringTools.method4321(tag.substring(5), 16);
			} else if (tag.equals("shad")) {
				shadow = rgb & 0xFF000000;
			} else if (tag.equals("/shad")) {
				shadow = originalShadow;
			} else if (tag.equals("br")) {
				this.setStyle(originalRgb, originalShadow);
			}
		} catch (Exception var3) {
		}
	}

	@ObfuscatedName("eu.r(Ljava/lang/String;II)V")
	public void method2716(String arg0, int arg1) {
		int var3 = 0;
		boolean var4 = false;
		for (int var5 = 0; var5 < arg0.length(); var5++) {
			char var6 = arg0.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				var3++;
			}
		}
		if (var3 > 0) {
			field1677 = (arg1 - this.fontMetrics.stringWidth(arg0) << 8) / var3;
		}
	}

	@ObfuscatedName("eu.v(Ljava/lang/String;II[Lcm;[ILch;III)V")
	public void drawChars(String str, int x, int y, Sprite[] glyphs, int[] arg4, SpriteRelated arg5, int arg6, int arg7) {
		int var9 = y - this.fontMetrics.field8566;
		int var10 = -1;
		int var11 = -1;
		int var12 = str.length();
		for (int index = 0; index < var12; index++) {
			char c = (char) (Cp1252.encode(str.charAt(index)) & 0xFF);
			if (c == '<') {
				var10 = index;
			} else {
				if (c == '>' && var10 != -1) {
					String var15 = str.substring(var10 + 1, index);
					var10 = -1;
					if (var15.equals("lt")) {
						c = '<';
					} else if (var15.equals("gt")) {
						c = '>';
					} else if (var15.equals("nbsp")) {
						c = 160;
					} else if (var15.equals("shy")) {
						c = 173;
					} else if (var15.equals("times")) {
						c = 215;
					} else if (var15.equals("euro")) {
						c = 128;
					} else if (var15.equals("copy")) {
						c = 169;
					} else {
						if (!var15.equals("reg")) {
							if (var15.startsWith("img=")) {
								try {
									int var16 = StringTools.parseInt(var15.substring(4));
									Sprite var17 = glyphs[var16];
									int var18 = arg4 == null ? var17.getY() : arg4[var16];
									if ((rgb & -16777216) == -16777216) {
										var17.drawSprite(x, this.fontMetrics.field8566 + var9 - var18, 1, -1, 1);
									} else {
										var17.drawSprite(x, this.fontMetrics.field8566 + var9 - var18, 0, rgb & 0xFF000000 | 0xFFFFFF, 1);
									}
									x += glyphs[var16].getX();
									var11 = -1;
								} catch (Exception var29) {
								}
							} else if (!var15.startsWith("sprite=")) {
								this.evaluateTag(var15);
							} else if (this.fontMetrics.fontIconProvider != null) {
								try {
									boolean var20 = true;
									int spriteIndex = 0;
									int iconIndex = var15.indexOf(44);
									int iconId;
									if (iconIndex == -1) {
										iconId = StringTools.parseInt(var15.substring(7));
									} else {
										iconId = StringTools.parseInt(var15.substring(7, iconIndex));
										spriteIndex = StringTools.parseInt(var15.substring(iconIndex + 1));
									}
									Sprite[] sprites = this.fontMetrics.fontIconProvider.getIconSprites(this.toolkit, iconId);
									if (sprites != null) {
										int var25 = Math.min(sprites[spriteIndex].getY(), this.fontMetrics.field8569 + this.fontMetrics.field8562);
										if ((rgb & -16777216) == -16777216) {
											sprites[spriteIndex].drawSprite(x, this.fontMetrics.field8566 + var9 + 2 - var25, 1, -1, 1);
										} else {
											sprites[spriteIndex].drawSprite(x, this.fontMetrics.field8566 + var9 + 2 - var25, 0, rgb & 0xFF000000 | 0xFFFFFF, 1);
										}
										x += sprites[spriteIndex].getX();
									}
									var11 = -1;
								} catch (Exception var28) {
								}
							}
							continue;
						}
						c = 174;
					}
				}
				if (var10 == -1) {
					if (var11 != -1) {
						x += this.fontMetrics.method14537(var11, c);
					}
					if (c == ' ') {
						if (field1677 > 0) {
							field1678 += field1677;
							x += field1678 >> 8;
							field1678 &= 0xFF;
						}
					} else if (arg5 == null) {
						if ((shadow & 0xFF000000) != 0) {
							this.drawChar(c, x + 1, var9 + 1, shadow, true);
						}
						this.drawChar(c, x, var9, rgb, false);
					} else {
						if ((shadow & 0xFF000000) != 0) {
							this.drawChar2(c, x + 1, var9 + 1, shadow, true, arg5, arg6, arg7);
						}
						this.drawChar2(c, x, var9, rgb, false, arg5, arg6, arg7);
					}
					int var27 = this.fontMetrics.method14558(c);
					if (strikethrough != -1) {
						this.toolkit.drawHorizontalLine(x, (int) ((double) this.fontMetrics.field8566 * 0.7D) + var9, var27, strikethrough);
					}
					if (underline != -1) {
						this.toolkit.drawHorizontalLine(x, this.fontMetrics.field8566 + var9 + 1, var27, underline);
					}
					x += var27;
					var11 = c;
				}
			}
		}
	}

	@ObfuscatedName("eu.o(Ljava/lang/String;II[Lcm;[I[I[II)V")
	public void drawCharsAlpha(String str, int x, int y, Sprite[] glyphs, int[] arg4, int[] arg5, int[] arg6) {
		int yoff = y - this.fontMetrics.field8566;
		int var9 = -1;
		int var10 = -1;
		int var11 = 0;
		int length = str.length();
		for (int index = 0; index < length; index++) {
			char c = (char) (Cp1252.encode(str.charAt(index)) & 0xFF);
			if (c == '<') {
				var9 = index;
			} else {
				if (c == '>' && var9 != -1) {
					String tag = str.substring(var9 + 1, index);
					var9 = -1;
					if (tag.equals("lt")) {
						c = '<';
					} else if (tag.equals("gt")) {
						c = '>';
					} else if (tag.equals("nbsp")) {
						c = 160;
					} else if (tag.equals("shy")) {
						c = 173;
					} else if (tag.equals("times")) {
						c = 215;
					} else if (tag.equals("euro")) {
						c = 128;
					} else if (tag.equals("copy")) {
						c = 169;
					} else {
						if (!tag.equals("reg")) {
							if (tag.startsWith("img=")) {
								try {
									int var16;
									if (arg5 == null) {
										var16 = 0;
									} else {
										var16 = arg5[var11];
									}
									int var17;
									if (arg6 == null) {
										var17 = 0;
									} else {
										var17 = arg6[var11];
									}
									var11++;
									int var18 = StringTools.parseInt(tag.substring(4));
									Sprite var19 = glyphs[var18];
									int var20 = arg4 == null ? var19.getY() : arg4[var18];
									var19.drawSprite(x + var16, this.fontMetrics.field8566 + yoff - var20 + var17, 1, -1, 1);
									x += glyphs[var18].getX();
									var10 = -1;
								} catch (Exception var35) {
								}
							} else if (!tag.startsWith("sprite=")) {
								this.evaluateTag(tag);
							} else if (this.fontMetrics.fontIconProvider != null) {
								try {
									boolean var22 = true;
									int var23 = 0;
									int var24 = tag.indexOf(44);
									int var25;
									if (var24 == -1) {
										var25 = StringTools.parseInt(tag.substring(7));
									} else {
										var25 = StringTools.parseInt(tag.substring(7, var24));
										var23 = StringTools.parseInt(tag.substring(var24 + 1));
									}
									int var26;
									if (arg5 == null) {
										var26 = 0;
									} else {
										var26 = arg5[var11];
									}
									int var27;
									if (arg6 == null) {
										var27 = 0;
									} else {
										var27 = arg6[var11];
									}
									var11++;
									Sprite[] var28 = this.fontMetrics.fontIconProvider.getIconSprites(this.toolkit, var25);
									if (var28 != null) {
										int var29 = Math.min(var28[var23].getY(), this.fontMetrics.field8569 + this.fontMetrics.field8562);
										var28[var23].drawSprite(x + var26, this.fontMetrics.field8566 + yoff + 3 - var29 + var27, 1, -1, 1);
										x += var28[var23].getX();
									}
									var10 = -1;
								} catch (Exception var34) {
								}
							}
							continue;
						}
						c = 174;
					}
				}
				if (var9 == -1) {
					if (var10 != -1) {
						x += this.fontMetrics.method14537(var10, c);
					}
					int var31;
					if (arg5 == null) {
						var31 = 0;
					} else {
						var31 = arg5[var11];
					}
					int var32;
					if (arg6 == null) {
						var32 = 0;
					} else {
						var32 = arg6[var11];
					}
					var11++;
					if (c != ' ') {
						if ((shadow & 0xFF000000) != 0) {
							this.drawChar(c, x + 1 + var31, yoff + 1 + var32, shadow, true);
						}
						this.drawChar(c, x + var31, yoff + var32, rgb, false);
					} else if (field1677 > 0) {
						field1678 += field1677;
						x += field1678 >> 8;
						field1678 &= 0xFF;
					}
					int var33 = this.fontMetrics.method14558(c);
					if (strikethrough != -1) {
						this.toolkit.drawHorizontalLine(x, (int) ((double) this.fontMetrics.field8566 * 0.7D) + yoff, var33, strikethrough);
					}
					if (underline != -1) {
						this.toolkit.drawHorizontalLine(x, this.fontMetrics.field8566 + yoff, var33, underline);
					}
					x += var33;
					var10 = c;
				}
			}
		}
	}

	@ObfuscatedName("eu.s(CIIIZ)V")
	public abstract void drawChar(char arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("eu.y(CIIIZLch;II)V")
	public abstract void drawChar2(char arg0, int arg1, int arg2, int arg3, boolean arg4, SpriteRelated arg5, int arg6, int arg7);
}
