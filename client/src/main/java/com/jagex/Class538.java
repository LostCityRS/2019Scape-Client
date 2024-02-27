package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class538 {

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "[B")
	byte[] aByteArray98;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
	int anInt5439;

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Ljava/io/OutputStream;")
	OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
	int anInt5440;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
	int anInt5441 = 0;

	@OriginalMember(owner = "client!ru", name = "db", descriptor = "(Lclient!yf;I)V")
	static void method30963(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class222.method25675(local11, local14, arg0, (short) 9981);
	}

	@OriginalMember(owner = "client!ru", name = "wf", descriptor = "(Lclient!yf;S)V")
	static void method30964(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class23.method503(local13, local23, false, -2013899817);
	}

	@OriginalMember(owner = "client!ru", name = "adx", descriptor = "(Lclient!yf;I)V")
	static void method30965(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(31) int local31 = client.aClass531ArrayArray1[local23][local13].method30607(-729568038);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local31 == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "(II)B")
	public byte method30943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt5439 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5441 * -623853417;
		}
		return this.aByteArray98[local8];
	}

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "(II)V")
	public void method30944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aByteArray98 == null || arg0 != this.anInt5441 * -623853417) {
			this.aByteArray98 = new byte[arg0];
		}
		this.anInt5441 = arg0 * -1211187417;
		this.anInt5439 = 0;
		this.anInt5440 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "(B)V")
	public void method30945(@OriginalArg(0) byte arg0) throws IOException {
		this.method30960((byte) -99);
		this.anOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "(ZI)V")
	public void method30946(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0) {
			this.anInt5440 = 0;
			this.anInt5439 = 0;
		}
	}

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "(Z)V")
	public void method30947(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt5440 = 0;
			this.anInt5439 = 0;
		}
	}

	@OriginalMember(owner = "client!ru", name = "w", descriptor = "(IIB)V")
	public void method30948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) throws IOException {
		@Pc(8) int local8 = this.anInt5439 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5441 * -623853417;
		}
		while (arg1 != 0) {
			if (local8 >= this.anInt5441 * -623853417) {
				local8 = 0;
			}
			this.aByteArray98[(this.anInt5439 += -1793685397) * 798090307 - 1] = this.aByteArray98[local8++];
			if (this.anInt5439 * 798090307 >= this.anInt5441 * -623853417) {
				this.method30960((byte) -89);
			}
			arg1--;
		}
	}

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "(BB)V")
	public void method30949(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1) throws IOException {
		this.aByteArray98[(this.anInt5439 += -1793685397) * 798090307 - 1] = arg0;
		if (this.anInt5439 * 798090307 >= this.anInt5441 * -623853417) {
			this.method30960((byte) -68);
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)B")
	public byte method30950(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5439 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5441 * -623853417;
		}
		return this.aByteArray98[local8];
	}

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "(I)V")
	public void method30951(@OriginalArg(0) int arg0) {
		if (this.aByteArray98 == null || arg0 != this.anInt5441 * -623853417) {
			this.aByteArray98 = new byte[arg0];
		}
		this.anInt5441 = arg0 * -1211187417;
		this.anInt5439 = 0;
		this.anInt5440 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "(I)V")
	public void method30952(@OriginalArg(0) int arg0) {
		if (this.aByteArray98 == null || arg0 != this.anInt5441 * -623853417) {
			this.aByteArray98 = new byte[arg0];
		}
		this.anInt5441 = arg0 * -1211187417;
		this.anInt5439 = 0;
		this.anInt5440 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V")
	public void method30953(@OriginalArg(0) int arg0) {
		if (this.aByteArray98 == null || arg0 != this.anInt5441 * -623853417) {
			this.aByteArray98 = new byte[arg0];
		}
		this.anInt5441 = arg0 * -1211187417;
		this.anInt5439 = 0;
		this.anInt5440 = 0;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(Ljava/io/OutputStream;)V")
	public void method30954(@OriginalArg(0) OutputStream arg0) throws IOException {
		this.method30945((byte) -23);
		this.anOutputStream1 = arg0;
	}

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "()V")
	public void method30955() throws IOException {
		this.method30960((byte) -8);
		this.anOutputStream1 = null;
	}

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "(I)B")
	public byte method30956(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5439 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5441 * -623853417;
		}
		return this.aByteArray98[local8];
	}

	@OriginalMember(owner = "client!ru", name = "o", descriptor = "()V")
	public void method30957() throws IOException {
		@Pc(9) int local9 = this.anInt5439 * 798090307 - this.anInt5440 * -498353225;
		if (local9 == 0) {
			return;
		}
		this.anOutputStream1.write(this.aByteArray98, this.anInt5440 * -498353225, local9);
		if (this.anInt5439 * 798090307 >= this.anInt5441 * -623853417) {
			this.anInt5439 = 0;
		}
		this.anInt5440 = this.anInt5439 * -677317675;
	}

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "(B)V")
	public void method30958(@OriginalArg(0) byte arg0) throws IOException {
		this.aByteArray98[(this.anInt5439 += -1793685397) * 798090307 - 1] = arg0;
		if (this.anInt5439 * 798090307 >= this.anInt5441 * -623853417) {
			this.method30960((byte) -46);
		}
	}

	@OriginalMember(owner = "client!ru", name = "y", descriptor = "(I)B")
	public byte method30959(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5439 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5441 * -623853417;
		}
		return this.aByteArray98[local8];
	}

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "(B)V")
	public void method30960(@OriginalArg(0) byte arg0) throws IOException {
		@Pc(9) int local9 = this.anInt5439 * 798090307 - this.anInt5440 * -498353225;
		if (local9 == 0) {
			return;
		}
		this.anOutputStream1.write(this.aByteArray98, this.anInt5440 * -498353225, local9);
		if (this.anInt5439 * 798090307 >= this.anInt5441 * -623853417) {
			this.anInt5439 = 0;
		}
		this.anInt5440 = this.anInt5439 * -677317675;
	}

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "(I)B")
	public byte method30961(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt5439 * 798090307 - arg0 - 1;
		if (local8 < 0) {
			local8 += this.anInt5441 * -623853417;
		}
		return this.aByteArray98[local8];
	}

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "(Ljava/io/OutputStream;S)V")
	public void method30962(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) short arg1) throws IOException {
		this.method30945((byte) -101);
		this.anOutputStream1 = arg0;
	}
}
