package jagex3;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aif")
public final class Class135_Sub2 extends Class135 implements Interface44 {

	@OriginalMember(owner = "client!aif", name = "w", descriptor = "I")
	final int anInt1230;

	@OriginalMember(owner = "client!aif", name = "<init>", descriptor = "(Lclient!aqd;IZ[[I)V")
	Class135_Sub2(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Class206.aClass206_22, Class226.aClass226_22, arg2 && arg0.aBoolean434, arg1 * arg1 * 6);
		this.anInt1230 = arg1;
		if (this.aBoolean253) {
			this.aLong47 = IDirect3DDevice.CreateCubeTexture(this.aClass104_Sub2_Sub1_8.aLong121, this.anInt1230, 0, 1024, 21, 1);
		} else {
			this.aLong47 = IDirect3DDevice.CreateCubeTexture(this.aClass104_Sub2_Sub1_8.aLong121, this.anInt1230, 1, 0, 21, 1);
		}
		@Pc(52) ByteBuffer local52 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		this.aClass104_Sub2_Sub1_8.method20901(this.anInt1230 * this.anInt1230 * 4);
		for (@Pc(64) int local64 = 0; local64 < 6; local64++) {
			local52.clear();
			local52.asIntBuffer().put(arg3[local64]);
			IDirect3DCubeTexture.Upload(this.aLong47, local64, 0, 0, 0, this.anInt1230, this.anInt1230, this.anInt1230 * 4, 0, this.aClass104_Sub2_Sub1_8.aLong132);
		}
	}

	@OriginalMember(owner = "client!aif", name = "aj", descriptor = "()V")
	@Override
	public void method11412() {
		this.aClass104_Sub2_Sub1_8.method19536(this);
	}

	@OriginalMember(owner = "client!aif", name = "az", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11416(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aif", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aif", name = "ay", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11414(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aif", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aif", name = "ab", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11415(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aif", name = "aa", descriptor = "()V")
	@Override
	public void method11417() {
		this.aClass104_Sub2_Sub1_8.method19536(this);
	}

	@OriginalMember(owner = "client!aif", name = "af", descriptor = "()V")
	@Override
	public void method11411() {
		this.aClass104_Sub2_Sub1_8.method19536(this);
	}
}
