package com.jagex.game.client;

import com.jagex.core.utils.StringTools;
import com.jagex.game.load.Loading;
import com.jagex.game.load.LoadingScreen;
import deob.ObfuscatedName;
import rs2.client.Client;

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
		return this.field2894 ? (GameShell.canvasWid - arg0) / 2 : 0;
	}

	@ObfuscatedName("jm.n(II)I")
	public final int method4887(int arg0) {
		return this.field2893 ? (GameShell.canvasHei - arg0) / 2 : 0;
	}

	@ObfuscatedName("jm.m(ZI)V")
	public void method4888(boolean arg0) {
		if (!this.field2895 && !this.field2891) {
			this.field2891 = true;
			try {
				String[] var2 = StringTools.split(Client.loadingBarConfig, '|');
				if (var2.length < 3) {
					this.field2895 = true;
				} else {
					MediaTracker var3 = new MediaTracker(GameShell.canvas);
					int var4 = 0;
					for (int var5 = 0; var5 < var2.length; var5++) {
						String[] var6 = StringTools.split(var2[var5].trim(), '=');
						if (var6[0].equals("halign")) {
							this.field2894 = Boolean.parseBoolean(var6[1]);
						} else if (var6[0].equals("valign")) {
							this.field2893 = Boolean.parseBoolean(var6[1]);
						} else if (var6[0].equals("image")) {
							String[] var7 = StringTools.split(var6[1], ',');
							Image var8;
							try {
								var8 = this.method4903(var7[0]);
							} catch (Exception var21) {
								var8 = null;
							}
							if (var8 != null) {
								var3.addImage(var8, var4++);
								this.field2892.add(new PreLoadingImage(this, var8, StringTools.parseInt(var7[1]), StringTools.parseInt(var7[2])));
							}
						} else if (var6[0].equals("rotatingimage")) {
							String[] var10 = StringTools.split(var6[1], ',');
							Image var11;
							try {
								var11 = this.method4903(var10[0]);
							} catch (Exception var20) {
								var11 = null;
							}
							if (var11 != null) {
								var3.addImage(var11, var4++);
								this.field2892.add(new PreLoadingRotatingImage(this, var11, StringTools.parseInt(var10[1]), StringTools.parseInt(var10[2]), Float.parseFloat(var10[3])));
							}
						} else if (var6[0].equals("progress")) {
							String[] var13 = StringTools.split(var6[1], ',');
							this.field2892.add(new PreLoadingProgressImage(this, Boolean.parseBoolean(var13[0]), var13[1], StringTools.parseInt(var13[2]), Integer.decode(var13[3]), StringTools.parseInt(var13[4]), StringTools.parseInt(var13[5])));
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
		Graphics var15 = GameShell.canvas.getGraphics();
		if (var15 == null) {
			GameShell.canvas.repaint();
			return;
		}
		try {
			this.field2896 = "" + Loading.field593.method4851() + "%";
			this.field2897 = Loading.field593.method4852();
			if (GameShell.field2575 == null) {
				GameShell.field2575 = GameShell.canvas.createImage(GameShell.canvasWid, GameShell.canvasHei);
			}
			Graphics var16 = GameShell.field2575.getGraphics();
			var16.setColor(Color.BLACK);
			var16.fillRect(0, 0, GameShell.canvasWid, GameShell.canvasHei);
			Iterator var17 = this.field2892.iterator();
			while (var17.hasNext()) {
				PreLoadingRelated var18 = (PreLoadingRelated) var17.next();
				var18.method4987(var16);
			}
			var15.drawImage(GameShell.field2575, 0, 0, null);
		} catch (Exception var22) {
			this.field2895 = true;
		}
	}

	@ObfuscatedName("jm.k(Ljava/lang/String;I)Ljava/awt/Image;")
	public Image method4903(String arg0) throws IOException {
		InputStream var2 = null;
		try {
			var2 = GameShell.field11885.getClass().getClassLoader().getResourceAsStream(arg0);
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
		GameShell.method8913(Loading.field593.method4851(), Loading.field593.method4852(), Client.loadingBarFillColour[Client.field10773], Client.loadingBarOutlineColour[Client.field10773], Client.loadingBarTextColour[Client.field10773]);
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

	// line 177
	@ObfuscatedName("jm.p(B)I")
	public int method4895() {
		return 0;
	}

	@ObfuscatedName("jq")
	public abstract static class PreLoadingRelated {

		// $FF: synthetic field
		public final PreLoadingScreen this$0;

		@ObfuscatedName("jq.e")
		public int field2947;

		@ObfuscatedName("jq.n")
		public int field2948;

		// line 184
		public PreLoadingRelated(PreLoadingScreen arg0, int arg1, int arg2) {
			this.this$0 = arg0;
			this.field2947 = arg1;
			this.field2948 = arg2;
		}

		@ObfuscatedName("jq.e(Ljava/awt/Graphics;B)V")
		public abstract void method4987(Graphics arg0);
	}

	@ObfuscatedName("ahw")
	public static class PreLoadingImage extends PreLoadingRelated {

		// $FF: synthetic field
		public final PreLoadingScreen this$0;

		@ObfuscatedName("ahw.m")
		public Image field10470;

		// line 195
		public PreLoadingImage(PreLoadingScreen arg0, Image arg1, int arg2, int arg3) {
			super(arg0, arg2, arg3);
			this.this$0 = arg0;
			this.field10470 = arg1;
		}

		@ObfuscatedName("ahw.e(Ljava/awt/Graphics;B)V")
		public void method4987(Graphics arg0) {
			int var2 = this.this$0.method4893(this.field10470.getWidth(null)) + this.field2947;
			int var3 = this.this$0.method4887(this.field10470.getHeight(null)) + this.field2948;
			arg0.drawImage(this.field10470, var2, var3, null);
		}
	}

	@ObfuscatedName("aqz")
	public static class PreLoadingRotatingImage extends PreLoadingImage {

		// $FF: synthetic field
		public final PreLoadingScreen this$0;

		@ObfuscatedName("aqz.k")
		public float field12091;

		@ObfuscatedName("aqz.f")
		public float field12092;

		// line 211
		public PreLoadingRotatingImage(PreLoadingScreen arg0, Image arg1, int arg2, int arg3, float arg4) {
			super(arg0, arg1, arg2, arg3);
			this.this$0 = arg0;
			this.field12091 = arg4;
			this.field12092 = -this.field12091;
		}

		@ObfuscatedName("aqz.e(Ljava/awt/Graphics;B)V")
		public void method4987(Graphics arg0) {
			this.field12092 += this.field12091;
			if (this.field12092 < 0.0F) {
				this.field12092 += 360.0F;
			}
			this.field12092 %= 360.0F;
			double var2 = Math.toRadians((double) this.field12092);
			int var4 = this.field10470.getWidth(null);
			int var5 = this.field10470.getHeight(null);
			Graphics2D var6 = (Graphics2D) arg0;
			var6.rotate(var2, (double) (this.this$0.method4893(var4) + var4 / 2 + this.field2947), (double) (this.this$0.method4887(var5) + var5 / 2 + this.field2948));
			var6.translate(this.this$0.method4893(var4) + this.field2947, this.this$0.method4887(var5) + this.field2948);
			var6.drawImage(this.field10470, null, null);
			var6.setTransform(this.this$0.field2898);
		}
	}

	@ObfuscatedName("ahj")
	public static class PreLoadingProgressImage extends PreLoadingRelated {

		// $FF: synthetic field
		public final PreLoadingScreen this$0;

		@ObfuscatedName("ahj.m")
		public boolean field10469;

		@ObfuscatedName("ahj.k")
		public java.awt.Font field10467;

		@ObfuscatedName("ahj.f")
		public java.awt.FontMetrics field10468;

		@ObfuscatedName("ahj.w")
		public Color field10466;

		// line 238
		public PreLoadingProgressImage(PreLoadingScreen arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
			super(arg0, arg5, arg6);
			this.this$0 = arg0;
			this.field10469 = arg1;
			this.field10467 = new java.awt.Font(arg2, 0, arg3);
			this.field10468 = GameShell.canvas.getFontMetrics(this.field10467);
			this.field10466 = new Color(arg4);
		}

		@ObfuscatedName("ahj.e(Ljava/awt/Graphics;B)V")
		public void method4987(Graphics arg0) {
			String var2;
			if (this.field10469) {
				var2 = this.this$0.field2896;
			} else {
				var2 = this.this$0.field2897 + " " + this.this$0.field2896;
			}
			arg0.setFont(this.field10467);
			arg0.setColor(this.field10466);
			arg0.drawString(var2, this.this$0.method4893(this.field10468.stringWidth(var2)) + this.field2947, this.this$0.method4887(0) + this.field2948);
		}
	}
}
