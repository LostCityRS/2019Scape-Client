package com.jagex.game.script;

import com.jagex.core.io.Packet;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.core.utils.VarValue;
import com.jagex.game.client.ClientMessage;
import com.jagex.game.client.FileOnDisk;
import com.jagex.game.config.vartype.SparseVarDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.constants.VarLifetime;
import com.jagex.game.network.ServerConnection;
import com.jagex.game.network.protocol.ClientProt;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@ObfuscatedName("afu")
public final class ClientVarDomain extends SparseVarDomain {

	@ObfuscatedName("afu.m")
	public boolean field10252 = false;

	@ObfuscatedName("afu.k")
	public long field10253 = -1L;

	@ObfuscatedName("afu.f")
	public boolean field10254 = false;

	@ObfuscatedName("afu.w")
	public Set field10255;

	@ObfuscatedName("afu.l")
	public long field10259 = -1L;

	@ObfuscatedName("afu.u")
	public VarValue[] field10257;

	@ObfuscatedName("afu.z")
	public int field10258 = 0;

	@ObfuscatedName("afu.p")
	public final VarLifetime[] field10251;

	public ClientVarDomain(VarTypeList arg0) {
		super(arg0);
		this.field10251 = new VarLifetime[arg0.length()];
		for (int var2 = 0; var2 < arg0.length(); var2++) {
			this.field10251[var2] = ((VarType) arg0.list(var2)).lifeTime;
		}
		this.field10255 = new HashSet(arg0.length());
	}

	@ObfuscatedName("afu.e(Lec;II)V")
	public void setVarValueInt(VarType arg0, int arg1) {
		if (this.field10251[arg0.id] == VarLifetime.PERMANENT) {
			this.field10252 = true;
		} else if (this.field10251[arg0.id] == VarLifetime.SERVER_PERMANENT && this.getVarValueInt(arg0) != arg1) {
			this.field10254 = true;
			this.field10255.add(arg0.id);
		}
		super.setVarValueInt(arg0, arg1);
	}

	@ObfuscatedName("afu.m(Lec;J)V")
	public void setVarValueLong(VarType arg0, long arg1) {
		if (this.field10251[arg0.id] == VarLifetime.PERMANENT) {
			this.field10252 = true;
		} else if (this.field10251[arg0.id] == VarLifetime.SERVER_PERMANENT && this.getVarValueLong(arg0) != arg1) {
			this.field10254 = true;
			this.field10255.add(arg0.id);
		}
		super.setVarValueLong(arg0, arg1);
	}

	@ObfuscatedName("afu.f(Lec;Ljava/lang/Object;I)V")
	public void setVarValue(VarType arg0, Object arg1) {
		if (this.field10251[arg0.id] == VarLifetime.PERMANENT) {
			this.field10252 = true;
		} else if (this.field10251[arg0.id] == VarLifetime.SERVER_PERMANENT) {
			if (arg1 instanceof String) {
				String var3 = (String) arg1;
				if (var3.length() > 80) {
					arg1 = var3.substring(0, 80);
				}
			}
			Object var4 = this.getVarValue(arg0);
			if (arg1 != null && var4 != null && !arg1.equals(var4)) {
				this.field10254 = true;
				this.field10255.add(arg0.id);
			} else if ((var4 == null) != (arg1 == null)) {
				this.field10254 = true;
				this.field10255.add(arg0.id);
			}
		}
		super.setVarValue(arg0, arg1);
	}

	@ObfuscatedName("afu.i(I)V")
	public void method16415() {
		for (int var1 = 0; var1 < this.field10251.length; var1++) {
			if (this.field10251[var1] == VarLifetime.TEMPORARY || this.field10251[var1] == VarLifetime.SERVER_PERMANENT) {
				this.field1708.method14734(var1);
			}
		}
		this.field10255.clear();
		this.field10254 = false;
		this.field10257 = null;
		this.field10259 = -1L;
	}

	@ObfuscatedName("afu.j(I)V")
	public void method16421() {
		this.field10258 = 0;
	}

	@ObfuscatedName("afu.t(Labl;B)V")
	public void method16420(FileOnDisk arg0) {
		try {
			byte[] var2 = new byte[(int) arg0.length()];
			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = arg0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new EOFException();
				}
			}
			Packet var5 = new Packet(var2);
			if (var5.data.length - var5.pos >= 1) {
				int var7 = var5.g1();
				if (var7 >= 0 && var7 <= 1) {
					if (var5.data.length - var5.pos < 2) {
						return;
					}
					int var10 = var5.g2();
					if (var5.data.length - var5.pos < var10 * 6) {
						return;
					}
					for (int var12 = 0; var12 < var10; var12++) {
						VarValue var13 = Client.varBasicTypeList.decodeVarValue(var5);
						if (this.field10251[var13.var] == VarLifetime.PERMANENT && ((VarType) Client.varBasicTypeList.list(var13.var)).dataType.getVarBaseType().javaClass.isAssignableFrom(var13.value.getClass())) {
							this.field1708.setVarValue(var13.var, var13.value);
						}
					}
					return;
				}
				return;
			}
		} catch (Exception var29) {
			return;
		} finally {
			try {
				arg0.close();
			} catch (Exception var28) {
			}
		}
	}

	@ObfuscatedName("afu.ae(Labl;B)V")
	public void method16418(FileOnDisk arg0) {
		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.field1708.iterator();
			while (var4.hasNext()) {
				VarValue var5 = (VarValue) var4.next();
				if (this.field10251[var5.var] == VarLifetime.PERMANENT) {
					var2 += Client.varBasicTypeList.getValueEncodingLength(var5);
					var3++;
				}
			}
			Packet var6 = new Packet(var2);
			var6.p1(1);
			var6.p2(var3);
			Iterator var7 = this.field1708.iterator();
			while (var7.hasNext()) {
				VarValue var8 = (VarValue) var7.next();
				if (this.field10251[var8.var] == VarLifetime.PERMANENT) {
					Client.varBasicTypeList.encodeVarValue(var6, var8);
				}
			}
			arg0.write(var6.data, 0, var6.pos);
		} catch (Exception var20) {
		} finally {
			try {
				arg0.close();
			} catch (Exception var19) {
			}
		}
		this.field10253 = MonotonicTime.get();
		this.field10252 = false;
	}

	@ObfuscatedName("afu.ag(I)V")
	public void method16414() {
		if (MonotonicTime.get() < this.field10259) {
			return;
		}
		if (this.field10257 == null) {
			if (!this.field10254) {
				return;
			}
			this.field10257 = new VarValue[this.field10255.size()];
			int var1 = 0;
			Iterator var2 = this.field10255.iterator();
			while (var2.hasNext()) {
				int var3 = (Integer) var2.next();
				this.field10257[var1++] = new VarValue(var3, this.field1708.getVarValue(var3));
			}
			this.field10258 = 0;
			this.field10254 = false;
			this.field10255.clear();
		}
		if (this.field10257 == null || this.field10258 >= this.field10257.length) {
			return;
		}
		ServerConnection var4 = Client.getCurrentConnection();
		if (var4.writePos > 1200) {
			return;
		}
		ClientMessage var5 = ClientMessage.createMessage(ClientProt.STORE_SERVERPERM_VARCS, var4.randomOut);
		var5.buf.p2(0);
		int var6 = var5.buf.pos;
		var5.buf.pos++;
		while (this.field10258 < this.field10257.length) {
			VarValue var7 = this.field10257[this.field10258];
			if (var5.buf.pos + var4.writePos + Client.varBasicTypeList.getValueEncodingLength(var7) > 1500) {
				break;
			}
			Client.varBasicTypeList.encodeVarValue(var5.buf, var7);
			this.field10258++;
		}
		var5.buf.psize2(var5.buf.pos - var6);
		if (this.field10258 >= this.field10257.length) {
			var5.buf.data[var6] = 1;
		} else {
			var5.buf.data[var6] = 0;
		}
		var4.queue(var5);
		this.field10259 = MonotonicTime.get() + 1000L;
	}

	@ObfuscatedName("afu.ad(I)V")
	public void method16413() {
		if (this.field10257 != null && this.field10258 >= this.field10257.length) {
			this.field10257 = null;
			this.field10258 = 0;
		}
	}
}
