package jagex3;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiy")
public class Class135_Sub3 extends Class135 implements Interface38 {

	@OriginalMember(owner = "client!aiy", name = "p", descriptor = "Z")
	boolean aBoolean254;

	@OriginalMember(owner = "client!aiy", name = "d", descriptor = "Z")
	boolean aBoolean255;

	@OriginalMember(owner = "client!aiy", name = "w", descriptor = "I")
	final int anInt1365;

	@OriginalMember(owner = "client!aiy", name = "l", descriptor = "I")
	final int anInt1366;

	@OriginalMember(owner = "client!aiy", name = "u", descriptor = "F")
	final float aFloat137;

	@OriginalMember(owner = "client!aiy", name = "z", descriptor = "F")
	final float aFloat138;

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;Lclient!dg;IIII)V")
	Class135_Sub3(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass104_Sub2_Sub1_8.aBoolean436) {
			this.anInt1365 = arg3;
			this.anInt1366 = arg4;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt1365 = Class134_Sub2.method10212(arg3, (byte) 43);
			this.anInt1366 = Class134_Sub2.method10212(arg4, (byte) 125);
			this.aFloat137 = (float) arg3 / (float) this.anInt1365;
			this.aFloat138 = (float) arg4 / (float) this.anInt1366;
		}
		this.aLong47 = IDirect3DDevice.CreateTexture(this.aClass104_Sub2_Sub1_8.aLong121, this.anInt1365, this.anInt1366, 0, arg5, Class104_Sub2_Sub1.method19546(this.aClass206_14, this.aClass226_15), arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqd;IIZ[III)V")
	Class135_Sub3(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Class206.aClass206_22, Class226.aClass226_22, arg3 && arg0.aBoolean437, arg1 * arg2);
		if (this.aClass104_Sub2_Sub1_8.aBoolean436) {
			this.anInt1365 = arg1;
			this.anInt1366 = arg2;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt1365 = Class134_Sub2.method10212(arg1, (byte) 103);
			this.anInt1366 = Class134_Sub2.method10212(arg2, (byte) 56);
			this.aFloat137 = (float) arg1 / (float) this.anInt1365;
			this.aFloat138 = (float) arg2 / (float) this.anInt1366;
			if (arg1 != this.anInt1365 || arg2 != this.anInt1366) {
				arg4 = this.aClass104_Sub2_Sub1_8.method20561(arg1, arg2, this.anInt1365, this.anInt1366, arg4, arg5, arg6, -527423535);
				arg5 = 0;
				arg6 = this.anInt1365;
			}
		}
		if (arg3) {
			this.aLong47 = IDirect3DDevice.CreateTexture(this.aClass104_Sub2_Sub1_8.aLong121, this.anInt1365, this.anInt1366, 0, 1024, 21, 1);
		} else {
			this.aLong47 = IDirect3DDevice.CreateTexture(this.aClass104_Sub2_Sub1_8.aLong121, this.anInt1365, this.anInt1366, 1, 0, 21, 1);
		}
		if (arg6 == 0) {
			arg6 = this.anInt1365;
		}
		this.aClass104_Sub2_Sub1_8.method20901(arg6 * this.anInt1366 * this.aClass206_14.anInt3389 * -1639868421);
		@Pc(138) ByteBuffer local138 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local138.clear();
		local138.asIntBuffer().put(arg4, arg5, arg6 * this.anInt1366);
		IDirect3DTexture.Upload(this.aLong47, 0, 0, 0, this.anInt1365, this.anInt1366, arg6 * this.aClass206_14.anInt3389 * -1639868421, 0, this.aClass104_Sub2_Sub1_8.aLong132);
	}

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;IIZ[BII)V")
	Class135_Sub3(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Class226.aClass226_22, arg4 && arg0.aBoolean437, arg2 * arg3);
		if (this.aClass104_Sub2_Sub1_8.aBoolean436) {
			this.anInt1365 = arg2;
			this.anInt1366 = arg3;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt1365 = Class134_Sub2.method10212(arg2, (byte) 92);
			this.anInt1366 = Class134_Sub2.method10212(arg3, (byte) 76);
			this.aFloat137 = (float) arg2 / (float) this.anInt1365;
			this.aFloat138 = (float) arg3 / (float) this.anInt1366;
			if (arg2 != this.anInt1365 || arg3 != this.anInt1366) {
				arg5 = this.aClass104_Sub2_Sub1_8.method20567(arg2, arg3, this.anInt1365, this.anInt1366, arg5, arg6, arg7, arg1.anInt3389 * -1639868421, 1298392091);
				arg6 = 0;
				arg7 = this.anInt1365;
			}
		}
		if (arg4) {
			this.aLong47 = IDirect3DDevice.CreateTexture(this.aClass104_Sub2_Sub1_8.aLong121, this.anInt1365, this.anInt1366, 0, 1024, Class104_Sub2_Sub1.method19546(this.aClass206_14, Class226.aClass226_22), 1);
		} else {
			this.aLong47 = IDirect3DDevice.CreateTexture(this.aClass104_Sub2_Sub1_8.aLong121, this.anInt1365, this.anInt1366, 1, 0, Class104_Sub2_Sub1.method19546(this.aClass206_14, Class226.aClass226_22), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt1365;
		}
		this.aClass104_Sub2_Sub1_8.method20901(arg7 * this.anInt1366 * this.aClass206_14.anInt3389 * -1639868421);
		@Pc(148) ByteBuffer local148 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local148.clear();
		if (this.aClass206_14 == Class206.aClass206_25) {
			local148.put(arg5, arg6, this.anInt1366 * this.anInt1365 / 2);
			IDirect3DTexture.Upload(this.aLong47, 0, 0, 0, this.anInt1365, this.anInt1366 / 4, this.anInt1365 / 4 * 8, 0, this.aClass104_Sub2_Sub1_8.aLong132);
		} else if (this.aClass206_14 == Class206.aClass206_26) {
			local148.put(arg5, arg6, this.anInt1366 * this.anInt1365);
			IDirect3DTexture.Upload(this.aLong47, 0, 0, 0, this.anInt1365, this.anInt1366 / 4, this.anInt1365 / 4 * 16, 0, this.aClass104_Sub2_Sub1_8.aLong132);
		} else {
			local148.put(arg5, arg6, arg7 * this.anInt1366);
			IDirect3DTexture.Upload(this.aLong47, 0, 0, 0, this.anInt1365, this.anInt1366, arg7 * this.aClass206_14.anInt3389 * -1639868421, 0, this.aClass104_Sub2_Sub1_8.aLong132);
		}
	}

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;IIZ[FII)V")
	Class135_Sub3(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Class226.aClass226_22, arg4 && arg0.aBoolean437, arg2 * arg3);
		if (this.aClass104_Sub2_Sub1_8.aBoolean436) {
			this.anInt1365 = arg2;
			this.anInt1366 = arg3;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt1365 = Class134_Sub2.method10212(arg2, (byte) 79);
			this.anInt1366 = Class134_Sub2.method10212(arg3, (byte) 53);
			this.aFloat137 = (float) arg2 / (float) this.anInt1365;
			this.aFloat138 = (float) arg3 / (float) this.anInt1366;
			if (arg2 != this.anInt1365 || arg3 != this.anInt1366) {
				arg5 = this.aClass104_Sub2_Sub1_8.method20541(arg2, arg3, this.anInt1365, this.anInt1366, arg5, arg6, arg7, arg1.anInt3389 * -1639868421, -154425365);
				arg6 = 0;
				arg7 = this.anInt1365;
			}
		}
		if (arg4) {
			this.aLong47 = IDirect3DDevice.CreateTexture(this.aClass104_Sub2_Sub1_8.aLong121, this.anInt1365, this.anInt1366, 0, 1024, Class104_Sub2_Sub1.method19546(this.aClass206_14, Class226.aClass226_19), 1);
		} else {
			this.aLong47 = IDirect3DDevice.CreateTexture(this.aClass104_Sub2_Sub1_8.aLong121, this.anInt1365, this.anInt1366, 1, 0, Class104_Sub2_Sub1.method19546(this.aClass206_14, Class226.aClass226_19), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt1365;
		}
		this.aClass104_Sub2_Sub1_8.method20901(arg7 * this.anInt1366 * this.aClass206_14.anInt3389 * -1639868421 * 4);
		@Pc(150) ByteBuffer local150 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local150.clear();
		local150.asFloatBuffer().put(arg5, arg6, arg7 * this.anInt1366 * this.aClass206_14.anInt3389 * -1639868421);
		IDirect3DTexture.Upload(this.aLong47, 0, 0, 0, this.anInt1365, this.anInt1366, arg7 * this.aClass206_14.anInt3389 * -1639868421 * 4, 0, this.aClass104_Sub2_Sub1_8.aLong132);
	}

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;Lclient!dg;II)V")
	Class135_Sub3(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, 0, 1);
	}

	@OriginalMember(owner = "client!aiy", name = "af", descriptor = "()V")
	@Override
	public void method11411() {
		this.aClass104_Sub2_Sub1_8.method19537(this);
	}

	@OriginalMember(owner = "client!aiy", name = "e", descriptor = "()I")
	@Override
	public int method11362() {
		return this.anInt1365;
	}

	@OriginalMember(owner = "client!aiy", name = "n", descriptor = "()I")
	@Override
	public int method11340() {
		return this.anInt1366;
	}

	@OriginalMember(owner = "client!aiy", name = "k", descriptor = "(F)F")
	@Override
	public float method11341(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1365;
	}

	@OriginalMember(owner = "client!aiy", name = "f", descriptor = "(F)F")
	@Override
	public float method11342(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1366;
	}

	@OriginalMember(owner = "client!aiy", name = "v", descriptor = "()F")
	@Override
	public float method11378() {
		return this.aFloat137;
	}

	@OriginalMember(owner = "client!aiy", name = "bh", descriptor = "()J")
	@Override
	final long method11335() {
		return this.aLong47;
	}

	@OriginalMember(owner = "client!aiy", name = "w", descriptor = "()Z")
	@Override
	public boolean method11376() {
		return true;
	}

	@OriginalMember(owner = "client!aiy", name = "bl", descriptor = "()J")
	@Override
	final long method11329() {
		return this.aLong47;
	}

	@OriginalMember(owner = "client!aiy", name = "s", descriptor = "()Z")
	@Override
	public boolean method11422() {
		return false;
	}

	@OriginalMember(owner = "client!aiy", name = "l", descriptor = "(ZZ)V")
	@Override
	public void method11344(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean254 = arg0;
		this.aBoolean255 = arg1;
	}

	@OriginalMember(owner = "client!aiy", name = "z", descriptor = "(IIII[III)V")
	@Override
	public void method11345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass206_14 != Class206.aClass206_22 || this.aClass226_15 != Class226.aClass226_22) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass104_Sub2_Sub1_8.method20901(arg6 * arg3 * this.aClass206_14.anInt3389 * -1639868421);
		@Pc(31) ByteBuffer local31 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong47, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass206_14.anInt3389 * -1639868421, 0, this.aClass104_Sub2_Sub1_8.aLong132);
	}

	@OriginalMember(owner = "client!aiy", name = "p", descriptor = "(IIII[BLclient!ck;II)V")
	@Override
	public void method11356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass206_14 != arg5 || this.aClass226_15 != Class226.aClass226_22) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass104_Sub2_Sub1_8.method20901(arg7 * arg3 * this.aClass206_14.anInt3389 * -1639868421);
		@Pc(31) ByteBuffer local31 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong47, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass206_14.anInt3389 * -1639868421, 0, this.aClass104_Sub2_Sub1_8.aLong132);
	}

	@OriginalMember(owner = "client!aiy", name = "d", descriptor = "(IIII[II)V")
	@Override
	public void method11347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass206_14 != Class206.aClass206_22 || this.aClass226_15 != Class226.aClass226_22) {
			throw new RuntimeException();
		}
		this.aClass104_Sub2_Sub1_8.method20901(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong47, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass104_Sub2_Sub1_8.aLong132);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!aiy", name = "aq", descriptor = "()I")
	@Override
	public int method11377() {
		return this.anInt1366;
	}

	@OriginalMember(owner = "client!aiy", name = "r", descriptor = "(IIIIII)V")
	@Override
	public void method11363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass104_Sub2_Sub1_8.method20460(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method11345(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aiy", name = "aj", descriptor = "()V")
	@Override
	public void method11412() {
		this.aClass104_Sub2_Sub1_8.method19537(this);
	}

	@OriginalMember(owner = "client!aiy", name = "ae", descriptor = "(IIII[BLclient!ck;II)V")
	@Override
	public void method11343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass206_14 != arg5 || this.aClass226_15 != Class226.aClass226_22) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass104_Sub2_Sub1_8.method20901(arg7 * arg3 * this.aClass206_14.anInt3389 * -1639868421);
		@Pc(31) ByteBuffer local31 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong47, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass206_14.anInt3389 * -1639868421, 0, this.aClass104_Sub2_Sub1_8.aLong132);
	}

	@OriginalMember(owner = "client!aiy", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aiy", name = "ag", descriptor = "(IIII[II)V")
	@Override
	public void method11364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass206_14 != Class206.aClass206_22 || this.aClass226_15 != Class226.aClass226_22) {
			throw new RuntimeException();
		}
		this.aClass104_Sub2_Sub1_8.method20901(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong47, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass104_Sub2_Sub1_8.aLong132);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!aiy", name = "y", descriptor = "()I")
	@Override
	public int method11353() {
		return this.anInt1365;
	}

	@OriginalMember(owner = "client!aiy", name = "q", descriptor = "(F)F")
	@Override
	public float method11354(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1365;
	}

	@OriginalMember(owner = "client!aiy", name = "x", descriptor = "(F)F")
	@Override
	public float method11355(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1365;
	}

	@OriginalMember(owner = "client!aiy", name = "b", descriptor = "(F)F")
	@Override
	public float method11350(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1366;
	}

	@OriginalMember(owner = "client!aiy", name = "h", descriptor = "(F)F")
	@Override
	public float method11357(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1366;
	}

	@OriginalMember(owner = "client!aiy", name = "a", descriptor = "(F)F")
	@Override
	public float method11358(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1366;
	}

	@OriginalMember(owner = "client!aiy", name = "ay", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11414(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aiy", name = "i", descriptor = "()Z")
	@Override
	public boolean method11346() {
		return true;
	}

	@OriginalMember(owner = "client!aiy", name = "j", descriptor = "()Z")
	@Override
	public boolean method11361() {
		return true;
	}

	@OriginalMember(owner = "client!aiy", name = "t", descriptor = "(IIII[III)V")
	@Override
	public void method11360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass206_14 != Class206.aClass206_22 || this.aClass226_15 != Class226.aClass226_22) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass104_Sub2_Sub1_8.method20901(arg6 * arg3 * this.aClass206_14.anInt3389 * -1639868421);
		@Pc(31) ByteBuffer local31 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local31.clear();
		local31.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong47, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass206_14.anInt3389 * -1639868421, 0, this.aClass104_Sub2_Sub1_8.aLong132);
	}

	@OriginalMember(owner = "client!aiy", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aiy", name = "g", descriptor = "(F)F")
	@Override
	public float method11339(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1366;
	}

	@OriginalMember(owner = "client!aiy", name = "ah", descriptor = "(IIII[I[II)V")
	@Override
	public void method11365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass206_14 != Class206.aClass206_22 || this.aClass226_15 != Class226.aClass226_22) {
			throw new RuntimeException();
		}
		this.method11348(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "av", descriptor = "(ZZ)V")
	@Override
	public void method11379(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean254 = arg0;
		this.aBoolean255 = arg1;
	}

	@OriginalMember(owner = "client!aiy", name = "ac", descriptor = "(IIIIII)V")
	@Override
	public void method11367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass104_Sub2_Sub1_8.method20460(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method11345(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aiy", name = "al", descriptor = "(IIII[I[II)V")
	@Override
	public void method11366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass206_14 != Class206.aClass206_22 || this.aClass226_15 != Class226.aClass226_22) {
			throw new RuntimeException();
		}
		this.method11348(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "ai", descriptor = "()F")
	@Override
	public float method11368() {
		return this.aFloat137;
	}

	@OriginalMember(owner = "client!aiy", name = "as", descriptor = "()F")
	@Override
	public float method11370() {
		return this.aFloat137;
	}

	@OriginalMember(owner = "client!aiy", name = "at", descriptor = "()F")
	@Override
	public float method11371() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!aiy", name = "am", descriptor = "()F")
	@Override
	public float method11373() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!aiy", name = "ad", descriptor = "()F")
	@Override
	public float method11372() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!aiy", name = "o", descriptor = "()F")
	@Override
	public float method11351() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!aiy", name = "ap", descriptor = "()Z")
	@Override
	public boolean method11431() {
		return false;
	}

	@OriginalMember(owner = "client!aiy", name = "ab", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11415(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aiy", name = "az", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11416(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aiy", name = "au", descriptor = "()Z")
	@Override
	public boolean method11430() {
		return false;
	}

	@OriginalMember(owner = "client!aiy", name = "ar", descriptor = "()Z")
	@Override
	public boolean method11423() {
		return false;
	}

	@OriginalMember(owner = "client!aiy", name = "ax", descriptor = "()I")
	@Override
	public int method11359() {
		return this.anInt1366;
	}

	@OriginalMember(owner = "client!aiy", name = "c", descriptor = "(IIII[I[II)V")
	@Override
	public void method11348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass206_14 != Class206.aClass206_22 || this.aClass226_15 != Class226.aClass226_22) {
			throw new RuntimeException();
		}
		this.method11348(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "ao", descriptor = "(ZZ)V")
	@Override
	public void method11380(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean254 = arg0;
		this.aBoolean255 = arg1;
	}

	@OriginalMember(owner = "client!aiy", name = "aa", descriptor = "()V")
	@Override
	public void method11417() {
		this.aClass104_Sub2_Sub1_8.method19537(this);
	}

	@OriginalMember(owner = "client!aiy", name = "aw", descriptor = "()F")
	@Override
	public float method11369() {
		return this.aFloat137;
	}
}
