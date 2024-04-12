package rs2.client.logic;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.utils.JagException;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitOverflowException;
import com.jagex.game.config.vartype.bit.VarBitType;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ars")
public class DelayedStateChange extends SecondaryNode {

	@ObfuscatedName("ars.l")
	public int int0;

	@ObfuscatedName("ars.u")
	public int int1;

	@ObfuscatedName("ars.z")
	public int int2;

	@ObfuscatedName("ars.p")
	public String str0;

	@ObfuscatedName("ars.ac")
	public static SecondaryLinkedList serverQueue = new SecondaryLinkedList();

	@ObfuscatedName("ars.ai")
	public static SecondaryLinkedList clientQueue = new SecondaryLinkedList();

	@ObfuscatedName("ars.aw")
	public static HashTable cache = new HashTable(16);

	@ObfuscatedName("ars.am")
	public static boolean lastPushNew = false;

	@ObfuscatedName("jx.e(IJ)Lars;")
	public static DelayedStateChange cache(int type, long target) {
		lastPushNew = false;
		DelayedStateChange change = (DelayedStateChange) cache.getNode((long) type << 56 | target);
		if (change == null) {
			change = new DelayedStateChange(type, target);
			cache.pushNode(change, change.nodeId);
			lastPushNew = true;
		}
		return change;
	}

	@ObfuscatedName("al.n(I)V")
	public static void removeAll() {
		cache.removeAll();
		clientQueue.removeAll();
		serverQueue.removeAll();
	}

	@ObfuscatedName("kh.m(B)Lars;")
	public static DelayedStateChange poll() {
		DelayedStateChange serverChange = (DelayedStateChange) serverQueue.peekFront();
		if (serverChange != null) {
			serverChange.remove();
			serverChange.secondaryRemove();
			return serverChange;
		}
		DelayedStateChange clientChange;
		do {
			clientChange = (DelayedStateChange) clientQueue.peekFront();
			if (clientChange == null) {
				return null;
			}
			if (clientChange.getTime() > MonotonicTime.get()) {
				return null;
			}
			clientChange.remove();
			clientChange.secondaryRemove();
		} while ((clientChange.secondaryNodeId & Long.MIN_VALUE) == 0L);
		return clientChange;
	}

	@ObfuscatedName("gv.k(Lec;I)V")
	public static void onVarClientInt(VarType arg0) {
		DelayedStateChange var1 = cache(1, (long) arg0.id);
		var1.pushClientQueue();
	}

	@ObfuscatedName("zr.f(Lec;B)V")
	public static void onVarClientString(VarType arg0) {
		DelayedStateChange var1 = cache(2, (long) arg0.id);
		var1.pushClientQueue();
	}

	@ObfuscatedName("agq.w(II)V")
	public static void onClientSetText(int arg0) {
		DelayedStateChange var1 = cache(3, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("wq.l(II)V")
	public static void onClientSetTextAntimacro(int arg0) {
		DelayedStateChange var1 = cache(23, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("aqh.u(II)V")
	public static void onClientSetModel(int arg0) {
		DelayedStateChange var1 = cache(4, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("yg.z(IB)V")
	public static void onClientSetModelAnim(int arg0) {
		DelayedStateChange var1 = cache(5, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("abm.p(IS)V")
	public static void onClientSetColour(int arg0) {
		DelayedStateChange var1 = cache(6, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("xq.d(IS)V")
	public static void onClientSetHide(int arg0) {
		DelayedStateChange var1 = cache(7, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("ea.c(II)V")
	public static void onClientSetModelZoom(int arg0) {
		DelayedStateChange var1 = cache(8, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("pk.r(II)V")
	public static void onClientSetObjectData(int arg0) {
		DelayedStateChange var1 = cache(9, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("abz.v(II)V")
	public static void onClientSetModelAngle(int arg0) {
		DelayedStateChange var1 = cache(10, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("afj.y(IB)V")
	public static void onClientSetPosition(int arg0) {
		DelayedStateChange var1 = cache(11, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("cc.x(II)V")
	public static void onClientSetScrollPos(int arg0) {
		DelayedStateChange var1 = cache(12, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("rz.h(IB)V")
	public static void onClientSetGraphic(int arg0) {
		DelayedStateChange var1 = cache(13, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("qc.a(II)V")
	public static void onClientSetTextFont(int arg0) {
		DelayedStateChange var1 = cache(15, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("ana.g(II)V")
	public static void onClientSetFontMono(int arg0) {
		DelayedStateChange var1 = cache(21, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("fu.i(II)V")
	public static void onClientSetClickMask(int arg0) {
		DelayedStateChange var1 = cache(22, (long) arg0);
		var1.pushClientQueue();
	}

	@ObfuscatedName("zz.j(I)V")
	public static void onClientSetMapFlag() {
		DelayedStateChange var0 = cache(14, 0L);
		var0.pushClientQueue();
	}

	@ObfuscatedName("abo.ae(III)V")
	public static void onClientSetRecol(int arg0, int arg1) {
		DelayedStateChange var2 = cache(17, (long) arg1 << 32 | (long) arg0);
		var2.pushClientQueue();
	}

	@ObfuscatedName("df.ag(III)V")
	public static void onClientSetRetex(int arg0, int arg1) {
		DelayedStateChange var2 = cache(20, (long) arg1 << 32 | (long) arg0);
		var2.pushClientQueue();
	}

	@ObfuscatedName("aqe.ah(III)V")
	public static void onServerVarc(int arg0, int arg1) {
		DelayedStateChange var2 = cache(1, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

	@ObfuscatedName("alv.al(III)V")
	public static void onServerVarcbit(int arg0, int arg1) {
		VarBitType var2 = (VarBitType) Client.varBitTypeList.list(arg0);
		DelayedStateChange var3 = cache(1, (long) var2.baseVar.id);
		try {
			if (lastPushNew) {
				var3.int0 = Client.clientVariableManager.getVarValueInt(var2.baseVar);
			}
			var3.int0 = var2.setVarbitValue(var3.int0, arg1);
			var3.pushServerQueue();
		} catch (VarBitOverflowException var5) {
			JagException.report("" + arg0, var5);
		}
	}

	@ObfuscatedName("zl.ac(ILjava/lang/String;B)V")
	public static void onServerVarcString(int arg0, String arg1) {
		DelayedStateChange var2 = cache(2, (long) arg0);
		var2.pushServerQueue();
		var2.str0 = arg1;
	}

	@ObfuscatedName("ea.ai(ILjava/lang/String;B)V")
	public static void onServerSetText(int arg0, String arg1) {
		DelayedStateChange var2 = cache(3, (long) arg0);
		var2.pushServerQueue();
		var2.str0 = arg1;
	}

	@ObfuscatedName("ww.aw(IZB)V")
	public static void onServerSetTextAntimacro(int arg0, boolean arg1) {
		DelayedStateChange var2 = cache(23, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1 ? 1 : 0;
	}

	@ObfuscatedName("ajz.as(IIIII)V")
	public static void onServerSetModel(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(4, (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg1;
		var4.int1 = arg2;
		var4.int2 = arg3;
	}

	@ObfuscatedName("fi.at(III)V")
	public static void onServerSetModelAnim(int arg0, int arg1) {
		DelayedStateChange var2 = cache(5, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

	@ObfuscatedName("fr.ad(III)V")
	public static void onServerSetColour(int arg0, int arg1) {
		DelayedStateChange var2 = cache(6, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

	@ObfuscatedName("ge.am(III)V")
	public static void onServerSetHide(int arg0, int arg1) {
		DelayedStateChange var2 = cache(7, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

	@ObfuscatedName("ahp.au(IIIII)V")
	public static void onServerSetModelZoom(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(8, (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg1;
		var4.int1 = arg2;
		var4.int2 = arg3;
	}

	@ObfuscatedName("kp.ar(IIIB)V")
	public static void onServerSetObjectData(int arg0, int arg1, int arg2) {
		DelayedStateChange var3 = cache(9, (long) arg0);
		var3.pushServerQueue();
		var3.int0 = arg1;
		var3.int1 = arg2;
	}

	@ObfuscatedName("ub.ap(IIIII)V")
	public static void onServerSetModelAngle(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(10, (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg1;
		var4.int1 = arg2;
		var4.int2 = arg3;
	}

	@ObfuscatedName("iv.aq(IIII)V")
	public static void onServerSetPosition(int arg0, int arg1, int arg2) {
		DelayedStateChange var3 = cache(11, (long) arg0);
		var3.pushServerQueue();
		var3.int0 = arg1;
		var3.int1 = arg2;
	}

	@ObfuscatedName("jh.ax(III)V")
	public static void onServerSetScrollPos(int arg0, int arg1) {
		DelayedStateChange var2 = cache(12, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

	@ObfuscatedName("wu.av(III)V")
	public static void onServerSetGraphic(int arg0, int arg1) {
		DelayedStateChange var2 = cache(13, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

	@ObfuscatedName("aha.ao(IIB)V")
	public static void onServerSetTextFont(int arg0, int arg1) {
		DelayedStateChange var2 = cache(15, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1;
	}

	@ObfuscatedName("sp.aj(IZB)V")
	public static void onServerSetClickMask(int arg0, boolean arg1) {
		DelayedStateChange var2 = cache(22, (long) arg0);
		var2.pushServerQueue();
		var2.int0 = arg1 ? 1 : 0;
	}

	@ObfuscatedName("acx.ay(IIB)V")
	public static void onServerSetMapFlag(int arg0, int arg1) {
		DelayedStateChange var2 = cache(14, 0L);
		var2.pushServerQueue();
		var2.int0 = arg0;
		var2.int1 = arg1;
	}

	@ObfuscatedName("aoa.ab(IIIII)V")
	public static void method18895(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(17, (long) arg1 << 32 | (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg2;
		var4.int1 = arg3;
	}

	@ObfuscatedName("kt.az(IIIIS)V")
	public static void onServerSetRecol(int arg0, int arg1, int arg2, int arg3) {
		DelayedStateChange var4 = cache(20, (long) arg1 << 32 | (long) arg0);
		var4.pushServerQueue();
		var4.int0 = arg2;
		var4.int1 = arg3;
	}

	public DelayedStateChange(int type, long target) {
		this.nodeId = (long) type << 56 | target;
	}

	@ObfuscatedName("ars.aa(I)V")
	public void pushClientQueue() {
		this.secondaryNodeId = this.secondaryNodeId & Long.MIN_VALUE | MonotonicTime.get() + 500L;
		clientQueue.pushBack(this);
	}

	@ObfuscatedName("ars.af(I)V")
	public void pushServerQueue() {
		this.secondaryNodeId |= Long.MIN_VALUE;
		if (this.getTime() == 0L) {
			serverQueue.pushBack(this);
		}
	}

	@ObfuscatedName("ars.ak(I)I")
	public int getType() {
		return (int) (this.nodeId >>> 56 & 0xFFL);
	}

	@ObfuscatedName("ars.an(I)J")
	public long getTarget() {
		return this.nodeId & 0xFFFFFFFFFFFFFFL;
	}

	@ObfuscatedName("ars.bf(B)J")
	public long getTime() {
		return this.secondaryNodeId & Long.MAX_VALUE;
	}
}
