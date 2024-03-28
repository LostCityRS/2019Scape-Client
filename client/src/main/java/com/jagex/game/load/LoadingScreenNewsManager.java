package com.jagex.game.load;

import com.jagex.game.client.ServerPorts;
import com.jagex.game.client.ServerType;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.login.WorldSwitcher;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

@ObfuscatedName("kf")
public class LoadingScreenNewsManager implements Runnable {

	@ObfuscatedName("kf.e")
	public LoadingScreenNewsEntry[] field3049;

	@ObfuscatedName("kf.n")
	public Thread field3050;

	@ObfuscatedName("kf.m")
	public volatile boolean field3051;

	@ObfuscatedName("kf.e(II)Lke;")
	public LoadingScreenNewsEntry method5160(int arg0) {
		return this.field3049 == null || arg0 < 0 || arg0 >= this.field3049.length ? null : this.field3049[arg0];
	}

	@ObfuscatedName("kf.n(B)Z")
	public boolean method5164() {
		if (this.field3051) {
			return true;
		}
		if (this.field3050 == null) {
			this.field3050 = new Thread(this);
			this.field3050.start();
		}
		return this.field3051;
	}

	public void run() {
		try {
			int var1 = ServerPorts.method14998(Client.modewhere, ServerType.field8347, WorldSwitcher.world.node);
			BufferedReader var2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + WorldSwitcher.world.host + ":" + var1 + "/news.ws?game=" + Client.modegame.game)).openStream())));
			String var3 = var2.readLine();
			ArrayList var4 = new ArrayList();
			while (var3 != null) {
				var4.add(var3);
				var3 = var2.readLine();
			}
			String[] var5 = new String[var4.size()];
			var4.toArray(var5);
			if (var5.length % 3 != 0) {
				return;
			}
			this.field3049 = new LoadingScreenNewsEntry[var5.length / 3];
			for (int var6 = 0; var6 < var5.length; var6 += 3) {
				this.field3049[var6 / 3] = new LoadingScreenNewsEntry(var5[var6], var5[var6 + 1], var5[var6 + 2]);
			}
		} catch (IOException var8) {
		}
		this.field3051 = true;
	}
}
