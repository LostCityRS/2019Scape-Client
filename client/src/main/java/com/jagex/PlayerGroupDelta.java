package com.jagex;

import com.jagex.game.runetek5.config.vartype.VarType;
import com.jagex.game.runetek5.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.runetek5.config.vartype.bit.VarBitType;
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
			PlayerGroupDeltaEncodingKey var4 = (PlayerGroupDeltaEncodingKey) SerializableEnums.decode(PlayerGroupDeltaEncodingKey.method3580(), var3);
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

	// line 76
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

	@ObfuscatedName("gt")
	public static class SetVarBitValue implements PlayerGroupDeltaEntry2 {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gt.e")
		public final PlayerGroupMember field1967;

		// line 131
		public SetVarBitValue(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			boolean var3 = arg1.g1() != 255;
			if (var3) {
				arg1.pos -= 1;
			}
			this.field1967 = new PlayerGroupMember(arg1, var3, true, arg0.field1943);
		}

		@ObfuscatedName("gt.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3395(this.field1967);
		}
	}

	@ObfuscatedName("fk")
	public static class SetMemberRank implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("fk.e")
		public final int field1894;

		// line 145
		public SetMemberRank(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			this.field1894 = arg1.g2();
		}

		@ObfuscatedName("fk.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			PlayerGroupMember var2 = arg0.method3392(this.field1894);
			var2.method3499();
			var2.method3488();
			arg0.method3430(this.field1894);
		}
	}

	@ObfuscatedName("go")
	public static class SetMemberOffline implements PlayerGroupDeltaEntry2 {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("go.e")
		public final PlayerGroupBanned field1917;

		// line 160
		public SetMemberOffline(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			boolean var3 = arg1.g1() != 255;
			if (var3) {
				arg1.pos -= 1;
			}
			this.field1917 = new PlayerGroupBanned(arg1, var3, true);
		}

		@ObfuscatedName("go.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3451(this.field1917);
		}
	}

	@ObfuscatedName("fr")
	public static class StartGame implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("fr.e")
		public final int field1896;

		// line 174
		public StartGame(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			this.field1896 = arg1.g2();
		}

		@ObfuscatedName("fr.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			PlayerGroupBanned var2 = (PlayerGroupBanned) arg0.method3429().get(this.field1896);
			arg0.method3398(this.field1896);
			var2.method3540();
		}
	}

	@ObfuscatedName("gn")
	public static class SetGameLoading implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gn.e")
		public final int field1937;

		@ObfuscatedName("gn.n")
		public final int field1938;

		// line 189
		public SetGameLoading(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			this.field1937 = arg1.g2();
			this.field1938 = arg1.g1();
		}

		@ObfuscatedName("gn.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3399(this.field1937, this.field1938);
			arg0.method3392(this.field1937).method3499();
		}
	}

	@ObfuscatedName("gh")
	public static class SetMemberTeam implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gh.e")
		public final int field1969;

		@ObfuscatedName("gh.n")
		public final int field1968;

		// line 204
		public SetMemberTeam(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			this.field1969 = arg1.g2();
			this.field1968 = arg1.g2();
		}

		@ObfuscatedName("gh.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3400(this.field1969, this.field1968);
			arg0.method3392(this.field1969).method3499();
		}
	}

	@ObfuscatedName("gf")
	public static class DeleteBanned implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gf.e")
		public final int field1941;

		// line 218
		public DeleteBanned(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			this.field1941 = arg1.g2();
		}

		@ObfuscatedName("gf.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3401(this.field1941);
			arg0.method3392(this.field1941);
		}
	}

	@ObfuscatedName("fe")
	public static class AddBanned implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("fe.e")
		public final int field1893;

		@ObfuscatedName("fe.n")
		public final boolean field1892;

		// line 232
		public AddBanned(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			this.field1893 = arg1.g2();
			this.field1892 = arg1.g1() == 1;
		}

		@ObfuscatedName("fe.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3402(this.field1893, this.field1892);
			arg0.method3392(this.field1893).method3499();
		}
	}

	@ObfuscatedName("gm")
	public static class UpdateMemberBase implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gm.e")
		public final int field1974;

		@ObfuscatedName("gm.n")
		public final int field1973;

		// line 247
		public UpdateMemberBase(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			this.field1974 = arg1.g2();
			this.field1973 = arg1.g1();
		}

		@ObfuscatedName("gm.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3381(this.field1974, this.field1973);
			arg0.method3392(this.field1974).method3499();
		}
	}

	@ObfuscatedName("gr")
	public static class SetMemberOnline implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		// line 259
		public SetMemberOnline(PlayerGroupDelta arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("gr.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3463();
		}
	}

	@ObfuscatedName("gk")
	public static class SetMemberReady implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		// line 267
		public SetMemberReady(PlayerGroupDelta arg0) {
			this.this$0 = arg0;
		}

		@ObfuscatedName("gk.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3405();
		}
	}

	@ObfuscatedName("gp")
	public static class AddMember implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gp.e")
		public final int field1918;

		@ObfuscatedName("gp.n")
		public final PlayerGroupMember field1919;

		// line 278
		public AddMember(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			this.field1918 = arg1.g2();
			this.field1919 = new PlayerGroupMember(arg1, false, false, arg0.field1943);
		}

		@ObfuscatedName("gp.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			arg0.method3403(this.field1918, this.field1919);
		}
	}

	@ObfuscatedName("gc")
	public static class DeleteMember implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gc.e")
		public final VarValue field1939;

		// line 291
		public DeleteMember(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			if (arg1.g2() == 65535) {
				this.field1939 = null;
			} else {
				arg1.pos -= 2;
				this.field1939 = arg0.field1943.method291().method15284(arg1);
			}
		}

		@ObfuscatedName("gc.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			if (this.field1939 != null) {
				arg0.method3394().method2802((VarType) this.this$0.field1943.method291().get(this.field1939.field4240), this.field1939.field4239);
			}
		}
	}

	@ObfuscatedName("gl")
	public static class SetVarValue implements PlayerGroupDeltaEntry {

		// $FF: synthetic field
		public final PlayerGroupDelta this$0;

		@ObfuscatedName("gl.e")
		public final int field1916;

		@ObfuscatedName("gl.n")
		public final int field1915;

		// line 309
		public SetVarValue(PlayerGroupDelta arg0, Packet arg1) {
			this.this$0 = arg0;
			int var3 = arg1.g2();
			if (var3 == 65535) {
				this.field1916 = -1;
				this.field1915 = 0;
			} else {
				this.field1916 = var3;
				this.field1915 = arg1.g4s();
			}
		}

		@ObfuscatedName("gl.e(Lgq;B)V")
		public void method3371(PlayerGroup arg0) {
			if (this.field1916 != -1) {
				try {
					arg0.method3394().method2804((VarBitType) this.this$0.field1943.method294().get(this.field1916), this.field1915);
				} catch (VarBitOverflowException var3) {
				}
			}
		}
	}
}
