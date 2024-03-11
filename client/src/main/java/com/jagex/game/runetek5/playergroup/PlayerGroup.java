package com.jagex.game.runetek5.playergroup;

import com.jagex.VarValue;
import com.jagex.core.io.Packet;
import com.jagex.game.runetek5.config.vartype.SparseVarDomain;
import com.jagex.game.runetek5.config.vartype.VarContainerSparse;
import com.jagex.game.runetek5.config.vartype.VarDomain;
import com.jagex.game.runetek5.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("gq")
public class PlayerGroup {

	@ObfuscatedName("gq.f")
	public final long field1902;

	@ObfuscatedName("gq.w")
	public final long field1903;

	@ObfuscatedName("gq.l")
	public final String field1904;

	@ObfuscatedName("gq.u")
	public final boolean field1905;

	@ObfuscatedName("gq.z")
	public final int field1906;

	@ObfuscatedName("gq.p")
	public final VarContainerSparse field1899;

	@ObfuscatedName("gq.d")
	public final ArrayList field1908;

	@ObfuscatedName("gq.c")
	public final ArrayList field1912;

	@ObfuscatedName("gq.r")
	public boolean field1910;

	@ObfuscatedName("gq.v")
	public boolean field1911;

	@ObfuscatedName("gq.o")
	public int field1909 = -1;

	@ObfuscatedName("gq.s")
	public int field1913;

	public PlayerGroup(long arg0, Packet arg1, boolean arg2, PlayerGroupResourceProvider arg3) {
		this.field1902 = arg0;
		int var6 = arg1.g1();
		if (var6 <= 0 || var6 > 1) {
			throw new IllegalStateException("");
		}
		int var7 = arg1.g1();
		this.field1905 = (var7 & 0x1) != 0;
		this.field1910 = (var7 & 0x2) != 0;
		this.field1911 = (var7 & 0x4) != 0;
		this.field1913 = arg1.g4s();
		this.field1903 = arg1.g8();
		this.field1904 = arg1.gjstr();
		this.field1906 = arg1.g2s();
		arg1.g4s();
		arg1.g8();
		int var8 = arg1.g2();
		this.field1908 = new ArrayList(var8);
		for (int var9 = 0; var9 < var8; var9++) {
			this.field1908.add(new PlayerGroupMember(arg1, this.field1910, this.field1911, arg3));
		}
		int var10 = arg1.g2();
		this.field1912 = new ArrayList(var10);
		for (int var11 = 0; var11 < var10; var11++) {
			this.field1912.add(new PlayerGroupBanned(arg1, this.field1910, this.field1911));
		}
		this.field1899 = new VarContainerSparse(arg3.method291());
		int var12 = arg1.g2();
		for (int var13 = 0; var13 < var12; var13++) {
			VarValue var14 = arg3.method291().method15284(arg1);
			this.field1899.method14735(var14.field4240, var14.field4239);
		}
		if (!arg2) {
			arg1.g2();
			arg1.g2();
			arg1.g2();
			arg1.g2();
			arg1.g2();
		}
		this.method3383();
	}

	@ObfuscatedName("gq.e(B)Ljava/util/List;")
	public List method3397() {
		return Collections.unmodifiableList(this.field1908);
	}

	@ObfuscatedName("gq.n(B)Ljava/util/List;")
	public List method3429() {
		return Collections.unmodifiableList(this.field1912);
	}

	@ObfuscatedName("gq.m(I)I")
	public int method3384() {
		return this.field1913;
	}

	@ObfuscatedName("gq.k(B)V")
	public void method3413() {
		this.field1913++;
	}

	@ObfuscatedName("gq.f(I)Z")
	public boolean method3441() {
		return this.field1905;
	}

	@ObfuscatedName("gq.w(I)I")
	public int method3387() {
		return this.field1906;
	}

	@ObfuscatedName("gq.l(I)J")
	public long method3388() {
		return this.field1903;
	}

	public int hashCode() {
		return (int) this.field1902;
	}

	@ObfuscatedName("gq.u(I)V")
	public void method3383() {
		int var1 = -1;
		int var2 = -1;
		for (int var3 = 0; var3 < this.field1908.size(); var3++) {
			PlayerGroupMember var4 = (PlayerGroupMember) this.field1908.get(var3);
			int var5 = var4.method3493();
			if (var5 > var1) {
				var1 = var5;
				var2 = var3;
			}
		}
		this.field1909 = var2;
	}

	@ObfuscatedName("gq.z(B)I")
	public int method3390() {
		return this.field1909;
	}

	@ObfuscatedName("gq.p(B)Lgv;")
	public PlayerGroupMemberStatus method3444() {
		if (this.field1908.isEmpty()) {
			return PlayerGroupMemberStatus.field1977;
		}
		PlayerGroupMemberStatus var1 = ((PlayerGroupMember) this.field1908.get(0)).method3495();
		switch(var1.field1979) {
			case 1:
			case 2:
				return var1;
			default:
				Iterator var2 = this.field1908.iterator();
				PlayerGroupMember var3;
				do {
					if (!var2.hasNext()) {
						return PlayerGroupMemberStatus.field1976;
					}
					var3 = (PlayerGroupMember) var2.next();
				} while (var3.method3495() != PlayerGroupMemberStatus.field1977);
				return PlayerGroupMemberStatus.field1977;
		}
	}

	@ObfuscatedName("gq.d(II)Lgy;")
	public PlayerGroupMember method3392(int arg0) {
		return arg0 == -1 ? null : (PlayerGroupMember) this.field1908.get(arg0);
	}

	@ObfuscatedName("gq.c(I)Ljava/lang/String;")
	public String method3386() {
		return this.field1904;
	}

	@ObfuscatedName("gq.r(I)Leh;")
	public VarDomain method3394() {
		return new SparseVarDomain(VarDomainType.PLAYER_GROUP, this.field1899);
	}

	@ObfuscatedName("gq.v(Lgy;B)V")
	public void method3395(PlayerGroupMember arg0) {
		this.field1908.add(arg0);
		this.method3383();
	}

	@ObfuscatedName("gq.o(II)V")
	public void method3430(int arg0) {
		this.field1908.remove(arg0);
		this.method3383();
	}

	@ObfuscatedName("gq.s(Lga;S)V")
	public void method3451(PlayerGroupBanned arg0) {
		this.field1912.add(arg0);
	}

	@ObfuscatedName("gq.y(II)V")
	public void method3398(int arg0) {
		this.field1912.remove(arg0);
	}

	@ObfuscatedName("gq.q(III)V")
	public void method3399(int arg0, int arg1) {
		((PlayerGroupMember) this.field1908.get(arg0)).method3489(arg1);
		this.method3383();
	}

	@ObfuscatedName("gq.x(III)V")
	public void method3400(int arg0, int arg1) {
		PlayerGroupMember var3 = (PlayerGroupMember) this.field1908.get(arg0);
		var3.method3535(arg1);
		var3.method3507(true);
	}

	@ObfuscatedName("gq.b(II)V")
	public void method3401(int arg0) {
		PlayerGroupMember var2 = (PlayerGroupMember) this.field1908.get(arg0);
		var2.method3507(false);
	}

	@ObfuscatedName("gq.h(IZS)V")
	public void method3402(int arg0, boolean arg1) {
		PlayerGroupMember var3 = (PlayerGroupMember) this.field1908.get(arg0);
		var3.method3496(arg1 ? PlayerGroupMemberStatus.field1976 : PlayerGroupMemberStatus.field1977);
	}

	@ObfuscatedName("gq.a(IIB)V")
	public void method3381(int arg0, int arg1) {
		((PlayerGroupMember) this.field1908.get(arg0)).method3498(arg1);
	}

	@ObfuscatedName("gq.g(I)V")
	public void method3463() {
		Iterator var1 = this.field1908.iterator();
		while (var1.hasNext()) {
			PlayerGroupMember var2 = (PlayerGroupMember) var1.next();
			var2.method3496(PlayerGroupMemberStatus.field1978);
		}
	}

	@ObfuscatedName("gq.i(B)V")
	public void method3405() {
		Iterator var1 = this.field1908.iterator();
		while (var1.hasNext()) {
			PlayerGroupMember var2 = (PlayerGroupMember) var1.next();
			var2.method3496(PlayerGroupMemberStatus.field1975);
		}
	}

	@ObfuscatedName("gq.j(ILgy;I)V")
	public void method3403(int arg0, PlayerGroupMember arg1) {
		PlayerGroupMember var3 = (PlayerGroupMember) this.field1908.get(arg0);
		var3.method3502(arg1);
	}
}
