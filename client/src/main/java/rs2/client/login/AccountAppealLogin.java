package rs2.client.login;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.Base64;
import com.jagex.core.utils.WebTools;
import com.jagex.game.client.Browser;
import com.jagex.game.client.GameShell;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("w")
public class AccountAppealLogin {

	@ObfuscatedName("w.f")
	public static final BigInteger field495 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");

	@ObfuscatedName("w.w")
	public static final BigInteger field496 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");

	public AccountAppealLogin() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("abx.e(I)J")
	public static long method14886() {
		try {
			URL var0 = new URL(Client.method4591("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Packet var4 = new Packet(new byte[1000]);
			do {
				int var5 = var3.read(var4.data, var4.pos, 1000 - var4.pos);
				if (var5 == -1) {
					var4.pos = 0;
					return var4.g8();
				}
				var4.pos += var5;
			} while (var4.pos < 1000);
			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("abn.n(JLjava/lang/String;B)I")
	public static final int method14753(long arg0, String arg1) {
		Random var3 = new Random();
		Packet var4 = new Packet(128);
		Packet var5 = new Packet(128);
		int[] var6 = new int[] { var3.nextInt(), var3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		var4.p1(10);
		for (int var7 = 0; var7 < 4; var7++) {
			var4.p4(var3.nextInt());
		}
		var4.p4(var6[0]);
		var4.p4(var6[1]);
		var4.p8(arg0);
		var4.p8(0L);
		for (int var8 = 0; var8 < 4; var8++) {
			var4.p4(var3.nextInt());
		}
		var4.rsaenc(field495, field496);
		var5.p1(10);
		for (int var9 = 0; var9 < 3; var9++) {
			var5.p4(var3.nextInt());
		}
		var5.p8(var3.nextLong());
		var5.p6(var3.nextLong());
		GameShell.pushUID192(var5);
		var5.p8(var3.nextLong());
		var5.rsaenc(field495, field496);
		int var10 = Packet.pjstrlen(arg1);
		if (var10 % 8 != 0) {
			var10 += 8 - var10 % 8;
		}
		Packet var11 = new Packet(var10);
		var11.pjstr(arg1);
		var11.pos = var10;
        var11.tinyenc(var6);
		Packet var12 = new Packet(var11.pos + var5.pos + var4.pos + 5);
		var12.p1(2);
		var12.p1(var4.pos);
		var12.pdata(var4.data, 0, var4.pos);
		var12.p1(var5.pos);
		var12.pdata(var5.data, 0, var5.pos);
		var12.p2(var11.pos);
		var12.pdata(var11.data, 0, var11.pos);
		String var13 = Base64.toBase64(var12.data);
		try {
			URL var14 = new URL(Client.method4591("services", false) + "m=accountappeal/login.ws");
			URLConnection var15 = var14.openConnection();
			var15.setDoInput(true);
			var15.setDoOutput(true);
			var15.setConnectTimeout(5000);
			OutputStreamWriter var16 = new OutputStreamWriter(var15.getOutputStream());
			var16.write("data2=" + WebTools.urlencode(var13) + "&dest=" + WebTools.urlencode("passwordchoice.ws"));
			var16.flush();
			InputStream var17 = var15.getInputStream();
			Packet var18 = new Packet(new byte[1000]);
			do {
				int var19 = var17.read(var18.data, var18.pos, 1000 - var18.pos);
				if (var19 == -1) {
					var16.close();
					var17.close();
					String var20 = new String(var18.data);
					if (var20.startsWith("OFFLINE")) {
						return 4;
					} else if (var20.startsWith("WRONG")) {
						return 7;
					} else if (var20.startsWith("RELOAD")) {
						return 3;
					} else if (var20.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var18.tinydec(var6);
						while (var18.pos > 0 && var18.data[var18.pos - 1] == 0) {
							var18.pos -= 1;
						}
						String var21 = new String(var18.data, 0, var18.pos);
						if (method15242(var21)) {
							Browser.openUrl(var21, true, Client.field10784);
							return 2;
						} else {
							return 5;
						}
					}
				}
				var18.pos += var19;
			} while (var18.pos < 1000);
			return 5;
		} catch (Throwable var23) {
			var23.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("adr.m(Ljava/lang/String;B)Z")
	public static boolean method15242(String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (MalformedURLException var2) {
			return false;
		}
	}
}
