package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ago")
public final class Class115_Sub2 extends Class115 {

	@OriginalMember(owner = "client!ago", name = "p", descriptor = "Lclient!agl;")
	Class116_Sub1 aClass116_Sub1_1;

	@OriginalMember(owner = "client!ago", name = "d", descriptor = "I")
	int anInt973;

	@OriginalMember(owner = "client!ago", name = "z", descriptor = "Lclient!aqv;")
	final Class104_Sub2_Sub2 aClass104_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ago", name = "<init>", descriptor = "(Lclient!aqv;Lclient!hj;)V")
	Class115_Sub2(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class314 arg1) {
		super(arg0, arg1);
		this.aClass104_Sub2_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!ago", name = "ds", descriptor = "()Z")
	@Override
	public boolean method8301() {
		return this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 == this.aClass116_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "f", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	@Override
	Class116 method8197(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		return new Class116_Sub1((Class104_Sub2_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ago", name = "m", descriptor = "()Z")
	@Override
	public boolean method8225() {
		return this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 == this.aClass116_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "v", descriptor = "(Lclient!hv;)Lclient!aql;")
	@Override
	Class93_Sub33_Sub1 method8206(@OriginalArg(0) Class325 arg0) {
		return new Class93_Sub33_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!ago", name = "e", descriptor = "()V")
	@Override
	public void method8285() {
		if (this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 == this.aClass116_Sub1_1) {
			return;
		}
		if (this.aClass116_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt973);
		this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 = this.aClass116_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "n", descriptor = "()V")
	@Override
	public void method8255() {
	}

	@OriginalMember(owner = "client!ago", name = "d", descriptor = "(Lclient!hi;)Z")
	@Override
	public boolean method8203(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method8438()) {
			@Pc(13) boolean local13 = this.method8225();
			this.aClass116_Sub1_1 = (Class116_Sub1) arg0;
			this.anInt971 = this.method8241(arg0, 1872239418) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt973 = this.aClass116_Sub1_1.anInt958;
			if (local13) {
				OpenGL.glUseProgram(this.anInt973);
				this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 = this.aClass116_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ago", name = "ap", descriptor = "()V")
	@Override
	void method8232() {
		for (@Pc(1) int local1 = 0; local1 < this.method8199((byte) -18); local1++) {
			((Class116_Sub1) this.method8200(local1, -1748773800)).method31065();
		}
		super.method8232();
	}

	@OriginalMember(owner = "client!ago", name = "hl", descriptor = "()V")
	void method8320() throws Throwable {
		this.method8232();
		super.finalize();
	}

	@OriginalMember(owner = "client!ago", name = "bq", descriptor = "(Lclient!hi;)Z")
	@Override
	public boolean method8290(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method8438()) {
			@Pc(13) boolean local13 = this.method8225();
			this.aClass116_Sub1_1 = (Class116_Sub1) arg0;
			this.anInt971 = this.method8241(arg0, 1619359526) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt973 = this.aClass116_Sub1_1.anInt958;
			if (local13) {
				OpenGL.glUseProgram(this.anInt973);
				this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 = this.aClass116_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ago", name = "aj", descriptor = "()V")
	@Override
	public void method8237() {
	}

	@OriginalMember(owner = "client!ago", name = "bw", descriptor = "(Lclient!hv;)Lclient!aql;")
	@Override
	Class93_Sub33_Sub1 method8261(@OriginalArg(0) Class325 arg0) {
		return new Class93_Sub33_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!ago", name = "ao", descriptor = "()V")
	@Override
	public void method8236() {
	}

	@OriginalMember(owner = "client!ago", name = "ak", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	@Override
	Class116 method8243(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		return new Class116_Sub1((Class104_Sub2_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ago", name = "ay", descriptor = "()V")
	@Override
	public void method8282() {
	}

	@OriginalMember(owner = "client!ago", name = "af", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	@Override
	Class116 method8284(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		return new Class116_Sub1((Class104_Sub2_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ago", name = "df", descriptor = "()V")
	@Override
	void method8211() {
		for (@Pc(1) int local1 = 0; local1 < this.method8199((byte) -28); local1++) {
			((Class116_Sub1) this.method8200(local1, -1332205333)).method31065();
		}
		super.method8232();
	}

	@OriginalMember(owner = "client!ago", name = "bn", descriptor = "(Lclient!hi;)Z")
	@Override
	public boolean method8202(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method8438()) {
			@Pc(13) boolean local13 = this.method8225();
			this.aClass116_Sub1_1 = (Class116_Sub1) arg0;
			this.anInt971 = this.method8241(arg0, 1312252243) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt973 = this.aClass116_Sub1_1.anInt958;
			if (local13) {
				OpenGL.glUseProgram(this.anInt973);
				this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 = this.aClass116_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ago", name = "bt", descriptor = "(Lclient!hi;)Z")
	@Override
	public boolean method8294(@OriginalArg(0) Class116 arg0) {
		if (this.aClass116_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method8438()) {
			@Pc(13) boolean local13 = this.method8225();
			this.aClass116_Sub1_1 = (Class116_Sub1) arg0;
			this.anInt971 = this.method8241(arg0, 1493208526) * 571593063;
			if (this.anInt971 * 1454094935 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt973 = this.aClass116_Sub1_1.anInt958;
			if (local13) {
				OpenGL.glUseProgram(this.anInt973);
				this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 = this.aClass116_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ago", name = "av", descriptor = "()V")
	@Override
	public void method8235() {
	}

	@OriginalMember(owner = "client!ago", name = "bu", descriptor = "(Lclient!hv;)Lclient!aql;")
	@Override
	Class93_Sub33_Sub1 method8260(@OriginalArg(0) Class325 arg0) {
		return new Class93_Sub33_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!ago", name = "ax", descriptor = "()V")
	@Override
	public void method8234() {
		if (this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 == this.aClass116_Sub1_1) {
			return;
		}
		if (this.aClass116_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt973);
		this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 = this.aClass116_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "aq", descriptor = "()V")
	@Override
	public void method8233() {
		if (this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 == this.aClass116_Sub1_1) {
			return;
		}
		if (this.aClass116_Sub1_1 == null) {
			throw new RuntimeException_Sub3();
		}
		OpenGL.glUseProgram(this.anInt973);
		this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 = this.aClass116_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "dw", descriptor = "()Z")
	@Override
	public boolean method8310() {
		return this.aClass104_Sub2_Sub2_2.aClass116_Sub1_2 == this.aClass116_Sub1_1;
	}

	@OriginalMember(owner = "client!ago", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		this.method8232();
		super.finalize();
	}
}
