package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("jm")
public class PreLoadingScreen implements LoadingScreen {

	@ObfuscatedName("jm.e")
	public boolean field2895;

	@ObfuscatedName("jm.n")
	public boolean field2891;

	@ObfuscatedName("jm.m")
	public List field2892 = new ArrayList();

	@ObfuscatedName("jm.k")
	public boolean field2894;

	@ObfuscatedName("jm.f")
	public boolean field2893;

	@ObfuscatedName("jm.w")
	public String field2896;

	@ObfuscatedName("jm.l")
	public String field2897;

	@ObfuscatedName("jm.u")
	public AffineTransform field2898 = new AffineTransform();

	@ObfuscatedName("jm.e(II)I")
	public final int method4893(int arg0) {
		return this.field2894 ? (Statics.canvasWid - arg0) / 2 : 0;
	}

	@ObfuscatedName("jm.n(II)I")
	public final int method4887(int arg0) {
		return this.field2893 ? (Statics.canvasHei - arg0) / 2 : 0;
	}

	@ObfuscatedName("jm.m(ZI)V")
	public void method4888(boolean arg0) {
		if (!this.field2895 && !this.field2891) {
			this.field2891 = true;
			try {
				String[] var2 = StringUtils.method17361(client.field11073, '|');
				if (var2.length < 3) {
					this.field2895 = true;
				} else {
					MediaTracker var3 = new MediaTracker(Statics.canvas);
					int var4 = 0;
					for (int var5 = 0; var5 < var2.length; var5++) {
						String[] var6 = StringUtils.method17361(var2[var5].trim(), '=');
						if (var6[0].equals("halign")) {
							this.field2894 = Boolean.parseBoolean(var6[1]);
						} else if (var6[0].equals("valign")) {
							this.field2893 = Boolean.parseBoolean(var6[1]);
						} else if (var6[0].equals("image")) {
							String[] var7 = StringUtils.method17361(var6[1], ',');
							Image var8;
							try {
								var8 = this.method4903(var7[0]);
							} catch (Exception var21) {
								var8 = null;
							}
							if (var8 != null) {
								var3.addImage(var8, var4++);
								this.field2892.add(new PreLoadingImage(this, var8, StringUtils.method9595(var7[1]), StringUtils.method9595(var7[2])));
							}
						} else if (var6[0].equals("rotatingimage")) {
							String[] var10 = StringUtils.method17361(var6[1], ',');
							Image var11;
							try {
								var11 = this.method4903(var10[0]);
							} catch (Exception var20) {
								var11 = null;
							}
							if (var11 != null) {
								var3.addImage(var11, var4++);
								this.field2892.add(new PreLoadingRotatingImage(this, var11, StringUtils.method9595(var10[1]), StringUtils.method9595(var10[2]), Float.parseFloat(var10[3])));
							}
						} else if (var6[0].equals("progress")) {
							String[] var13 = StringUtils.method17361(var6[1], ',');
							this.field2892.add(new PreLoadingProgressImage(this, Boolean.parseBoolean(var13[0]), var13[1], StringUtils.method9595(var13[2]), Integer.decode(var13[3]), StringUtils.method9595(var13[4]), StringUtils.method9595(var13[5])));
						}
					}
					var3.waitForAll();
				}
			} catch (Exception var23) {
				this.field2895 = true;
			}
		}
		if (this.field2895) {
			this.method4890();
			return;
		}
		Graphics var15 = Statics.canvas.getGraphics();
		if (var15 == null) {
			Statics.canvas.repaint();
			return;
		}
		try {
			this.field2896 = "" + Statics.field593.method4851() + "%";
			this.field2897 = Statics.field593.method4852();
			if (Statics.field2575 == null) {
				Statics.field2575 = Statics.canvas.createImage(Statics.canvasWid, Statics.canvasHei);
			}
			Graphics var16 = Statics.field2575.getGraphics();
			var16.setColor(Color.BLACK);
			var16.fillRect(0, 0, Statics.canvasWid, Statics.canvasHei);
			Iterator var17 = this.field2892.iterator();
			while (var17.hasNext()) {
				class282 var18 = (class282) var17.next();
				var18.method4987(var16);
			}
			var15.drawImage(Statics.field2575, 0, 0, null);
		} catch (Exception var22) {
			this.field2895 = true;
		}
	}

	@ObfuscatedName("jm.k(Ljava/lang/String;I)Ljava/awt/Image;")
	public Image method4903(String arg0) throws IOException {
		InputStream var2 = null;
		try {
			var2 = Statics.field11885.getClass().getClassLoader().getResourceAsStream(arg0);
			byte[] var3 = new byte[12000];
			int var4 = 0;
			int var5;
			while ((var5 = var2.read()) != -1) {
				var3[var4++] = (byte) var5;
			}
			Image var6 = Toolkit.getDefaultToolkit().createImage(var3);
			var2.close();
			Image var7 = var6;
			return var7;
		} catch (Exception var12) {
			throw new IOException();
		} finally {
			if (var2 != null) {
				var2.close();
			}
		}
	}

	@ObfuscatedName("jm.f(I)V")
	public void method4890() {
		GameShell.method8913(Statics.field593.method4851(), Statics.field593.method4852(), client.field10824[client.field10773], client.field10825[client.field10773], client.field10826[client.field10773]);
	}

	@ObfuscatedName("jm.w(B)V")
	public void method4891() {
		GameShell.method2901();
	}

	@ObfuscatedName("jm.l(S)V")
	public void method4916() {
	}

	@ObfuscatedName("jm.u(I)I")
	public int method4912() {
		return 100;
	}

	@ObfuscatedName("jm.z(J)Z")
	public boolean method4894(long arg0) {
		return true;
	}

	@ObfuscatedName("jm.p(B)I")
	public int method4895() {
		return 0;
	}
}
