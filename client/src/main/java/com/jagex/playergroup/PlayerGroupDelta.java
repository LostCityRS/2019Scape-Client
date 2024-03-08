package com.jagex.playergroup;

import com.jagex.*;
import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("gx")
public class PlayerGroupDelta {

	@ObfuscatedName("gx.e")
	public final long field1945;

	@ObfuscatedName("gx.n")
	public final PlayerGroupResourceProvider field1943;

	@ObfuscatedName("gx.m")
	public int field1944 = -1;

	@ObfuscatedName("gx.k")
	public LinkedList field1942 = new LinkedList();

	public PlayerGroupDelta(Packet arg0, PlayerGroupResourceProvider arg1) {
		this.field1943 = arg1;
		this.field1945 = arg0.g8();
		this.field1944 = arg0.g4s();
		for (int var3 = arg0.g1(); var3 != 0; var3 = arg0.g1()) {
			PlayerGroupDeltaEncodingKey var4 = (PlayerGroupDeltaEncodingKey) class686.method1897(PlayerGroupDeltaEncodingKey.method3580(), var3);
			Object var5;
			switch(var4.field1955) {
				case 0:
					var5 = new AddMember(this, arg0);
					break;
				case 1:
					var5 = new SetVarBitValue(this, arg0);
					break;
				case 2:
					var5 = new SetMemberTeam(this, arg0);
					break;
				case 3:
					var5 = new SetVarValue(this, arg0);
					break;
				case 4:
					var5 = new AddBanned(this, arg0);
					break;
				case 5:
					var5 = new SetMemberReady(this);
					break;
				case 6:
					var5 = new SetMemberOffline(this, arg0);
					break;
				case 7:
					var5 = new SetGameLoading(this, arg0);
					break;
				case 8:
					var5 = new DeleteMember(this, arg0);
					break;
				case 9:
					var5 = new SetMemberRank(this, arg0);
					break;
				case 10:
					var5 = new StartGame(this, arg0);
					break;
				case 11:
					var5 = new DeleteBanned(this, arg0);
					break;
				case 12:
					var5 = new UpdateMemberBase(this, arg0);
					break;
				case 13:
					var5 = new SetMemberOnline(this);
					break;
				default:
					throw new IllegalStateException("");
			}
			this.field1942.add(var5);
		}
	}

	@ObfuscatedName("gx.e(Lgq;I)V")
	public void method3555(PlayerGroup arg0) {
		if (this.field1945 != arg0.field1902 || arg0.method3384() != this.field1944) {
			throw new IllegalStateException("");
		}
		Iterator var2 = this.field1942.iterator();
		while (var2.hasNext()) {
			PlayerGroupDeltaEntry var3 = (PlayerGroupDeltaEntry) var2.next();
			var3.method3371(arg0);
		}
		arg0.method3413();
	}
}
