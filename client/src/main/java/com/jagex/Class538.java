package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public class Class538 {

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "[B")
	byte[] aByteArray97;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
	int anInt5278;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Ljava/io/OutputStream;")
	OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
	int anInt5279;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
	int anInt5280 = 0;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "(II)V", line = 13)
	public void method30762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aByteArray97 == null || arg0 != this.anInt5280 * -623853417) {
			this.aByteArray97 = new byte[arg0];
		}
		this.anInt5280 = arg0 * -1211187417;
		this.anInt5278 = 0;
		this.anInt5279 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "(I)V", line = 13)
	public void method30763(@OriginalArg(0) int arg0) {
		if (this.aByteArray97 == null || arg0 != this.anInt5280 * -623853417) {
			this.aByteArray97 = new byte[arg0];
		}
		this.anInt5280 = arg0 * -1211187417;
		this.anInt5278 = 0;
		this.anInt5279 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "(I)V", line = 13)
	public void method30764(@OriginalArg(0) int arg0) {
		if (this.aByteArray97 == null || arg0 != this.anInt5280 * -623853417) {
			this.aByteArray97 = new byte[arg0];
		}
		this.anInt5280 = arg0 * -1211187417;
		this.anInt5278 = 0;
		this.anInt5279 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V", line = 13)
	public void method30765(@OriginalArg(0) int arg0) {
		if (this.aByteArray97 == null || arg0 != this.anInt5280 * -623853417) {
			this.aByteArray97 = new byte[arg0];
		}
		this.anInt5280 = arg0 * -1211187417;
		this.anInt5278 = 0;
		this.anInt5279 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(Ljava/io/OutputStream;)V", line = 20)
	public void method30766(@OriginalArg(0) OutputStream arg0) throws IOException {
		this.method30768((byte) -23);
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "(Ljava/io/OutputStream;S)V", line = 20)
	public void method30767(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) short arg1) throws IOException {
		this.method30768((byte) -101);
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "(B)V", line = 25)
	public void method30768(@OriginalArg(0) byte arg0) throws IOException {
		this.method30773((byte) -99);
		this.anOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "()V", line = 25)
	public void method30769() throws IOException {
		this.method30773((byte) -8);
		this.anOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "(ZI)V", line = 30)
	public void method30770(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0) {
			this.anInt5279 = 0;
			this.anInt5278 = 0;
		}
	}

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "(Z)V", line = 30)
	public void method30771(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt5279 = 0;
			this.anInt5278 = 0;
		}
	}

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "()V", line = 37)
	public void method30772() throws IOException {
		@Pc(9) int local9 = this.anInt5278 * 798090307 - this.anInt5279 * -498353225;
		if (local9 == 0) {
			return;
		}
		this.anOutputStream1.write(this.aByteArray97, this.anInt5279 * -498353225, local9);
		if (this.anInt5278 * 798090307 >= this.anInt5280 * -623853417) {
			this.anInt5278 = 0;
		}
		this.anInt5279 = this.anInt5278 * -677317675;
	}

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "(B)V", line = 37)
	public void method30773(@OriginalArg(0) byte arg0) throws IOException {
		@Pc(9) int local9 = this.anInt5278 * 798090307 - this.anInt5279 * -498353225;
		if (local9 == 0) {
			return;
		}
		this.anOutputStream1.write(this.aByteArray97, this.anInt5279 * -498353225, local9);
		if (this.anInt5278 * 798090307 >= this.anInt5280 * -623853417) {
			this.anInt5278 = 0;
		}
		this.anInt5279 = this.anInt5278 * -677317675;
	}

	@OriginalMember(owner = "client!ru", name = "w", descriptor = "(IIB)V", line = 45)
	public void method30774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws IOException {
		@Pc(8) int local8 = this.anInt5278 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5280 * -623853417;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5280 * -623853417) {
				local8 = 0;
			}
			this.aByteArray97[(this.anInt5278 += -1793685397) * 798090307 - 1] = this.aByteArray97[local8++];
			if (this.anInt5278 * 798090307 >= this.anInt5280 * -623853417) {
				this.method30773((byte) -89);
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "(BB)V", line = 55)
	public void method30775(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1) throws IOException {
		this.aByteArray97[(this.anInt5278 += -1793685397) * 798090307 - 1] = arg0;
		if (this.anInt5278 * 798090307 >= this.anInt5280 * -623853417) {
			this.method30773((byte) -68);
		}
	}

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "(B)V", line = 55)
	public void method30776(@OriginalArg(0) byte arg0) throws IOException {
		this.aByteArray97[(this.anInt5278 += -1793685397) * 798090307 - 1] = arg0;
		if (this.anInt5278 * 798090307 >= this.anInt5280 * -623853417) {
			this.method30773((byte) -46);
		}
	}

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "(II)B", line = 60)
	public byte method30777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt5278 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5280 * -623853417;
		}
		return this.aByteArray97[local8];
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)B", line = 60)
	public byte method30778(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5278 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5280 * -623853417;
		}
		return this.aByteArray97[local8];
	}

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "(I)B", line = 60)
	public byte method30779(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5278 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5280 * -623853417;
		}
		return this.aByteArray97[local8];
	}

	@OriginalMember(owner = "client!ru", name = "y", descriptor = "(I)B", line = 60)
	public byte method30780(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5278 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5280 * -623853417;
		}
		return this.aByteArray97[local8];
	}

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "(I)B", line = 60)
	public byte method30781(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5278 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5280 * -623853417;
		}
		return this.aByteArray97[local8];
	}

	@OriginalMember(owner = "client!ru", name = "db", descriptor = "(Lclient!yf;I)V", line = 5630)
	static final void method30782(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class222.method25582(local11, local14, arg0, (short) 9981);
	}

	@OriginalMember(owner = "client!ru", name = "wf", descriptor = "(Lclient!yf;S)V", line = 9038)
	static final void method30783(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class23.method498(local13, local23, false, -2013899817);
	}

	@OriginalMember(owner = "client!ru", name = "adx", descriptor = "(Lclient!yf;I)V", line = 10188)
	static final void method30784(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(31) int local31 = client.aClass531ArrayArray1[local23][local13].method30429(-729568038);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local31 == 2 ? 1 : 0;
	}
}
