package jagex3;

import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class635 implements Interface70 {

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
	boolean aBoolean861;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "[B")
	byte[] aByteArray113;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	int anInt5888;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!wl;")
	Class639 aClass639_1 = Class639.aClass639_4;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!py;")
	Class497 aClass497_138;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	int anInt5887;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!mt;")
	Class146 aClass146_4;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!wj;")
	Interface68 anInterface68_1;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "Lclient!eb;")
	Class240 aClass240_90;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Z")
	boolean aBoolean862;

	@OriginalMember(owner = "client!we", name = "bv", descriptor = "(Lclient!yf;B)V")
	static void method32620(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 != null) {
			Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1.method32969(local13, local23, (byte) -104);
		}
	}

	@OriginalMember(owner = "client!we", name = "bfe", descriptor = "(Lclient!yf;I)V")
	static void method32621(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 1915061582;
		arg0.anInt6052 -= -1915563430;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!we", name = "ka", descriptor = "(S)V")
	static void method32622(@OriginalArg(0) short arg0) {
		for (@Pc(1) int local1 = 0; local1 < 114; local1++) {
			client.aBooleanArray22[local1] = true;
		}
	}

	@OriginalMember(owner = "client!we", name = "bca", descriptor = "(Lclient!yf;B)V")
	static void method32623(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!py;ILclient!mt;Lclient!wj;Lclient!eb;)V")
	public Class635(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) Interface68 arg3, @OriginalArg(4) Class240 arg4) {
		this.aClass497_138 = arg0;
		this.anInt5887 = arg1 * 263895561;
		this.aClass146_4 = arg2;
		this.anInterface68_1 = arg3;
		this.aClass240_90 = arg4;
		this.aBoolean862 = this.aClass240_90 != null;
		this.aClass639_1 = Class639.aClass639_2;
	}

	@OriginalMember(owner = "client!we", name = "o", descriptor = "(ZB)V")
	@Override
	public void method32719(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -801181660);
		}
		this.aBoolean861 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V")
	@Override
	public void method32707(@OriginalArg(0) byte arg0) {
		if (Class639.aClass639_2 != this.aClass639_1) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass497_138.method30240(this.anInt5887 * -1942162375, (byte) 69);
		if (local12 == null) {
			return;
		}
		this.aByteArray113 = local12;
		this.method32615(-25820427);
		this.aClass639_1 = Class639.aClass639_3;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26332(this, local12.length, this.anInt5887 * -1942162375, false, (byte) 25);
		}
	}

	@OriginalMember(owner = "client!we", name = "w", descriptor = "(II)[B")
	@Override
	public byte[] method32710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -959905654);
		}
		return this.aByteArray113;
	}

	@OriginalMember(owner = "client!we", name = "m", descriptor = "(I)Lclient!wl;")
	@Override
	public Class639 method32748(@OriginalArg(0) int arg0) {
		return this.aClass639_1;
	}

	@OriginalMember(owner = "client!we", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method32708(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
	void method32615(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!we", name = "ac", descriptor = "()Lclient!qk;")
	@Override
	public Class508 method32730() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!we", name = "l", descriptor = "(I)I")
	@Override
	public int method32711(@OriginalArg(0) int arg0) {
		return this.aByteArray113 == null ? 0 : this.aByteArray113.length;
	}

	@OriginalMember(owner = "client!we", name = "u", descriptor = "(I)Lclient!qk;")
	@Override
	public Class508 method32712(@OriginalArg(0) int arg0) {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!we", name = "z", descriptor = "(B)I")
	@Override
	public int method32739(@OriginalArg(0) byte arg0) {
		return this.anInt5887 * -1942162375;
	}

	@OriginalMember(owner = "client!we", name = "p", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method32714(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass240_90 == null) {
			return;
		}
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -1148811700);
		}
		if (this.aBoolean861) {
			throw new RuntimeException("");
		}
		@Pc(23) Class240 local23 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(28) List local28 = this.method32617((short) 17626);
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5888 += arg0.aByteArray58.length * -165190447;
				this.method32616(local28, this.anInt5888 * -635997135, -1054317847);
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()Lclient!rw;")
	@Override
	public Class539 method32724() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30968(this, 1525624453);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method32717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32617((short) 19137);
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "t", descriptor = "(I)[B")
	@Override
	public byte[] method32727(@OriginalArg(0) int arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -485367246);
		}
		return this.aByteArray113;
	}

	@OriginalMember(owner = "client!we", name = "v", descriptor = "(B)I")
	@Override
	public int method32718(@OriginalArg(0) byte arg0) {
		if (this.aClass240_90 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class240 local10 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(15) List local15 = this.method32617((short) 21488);
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(II)Lclient!alw;")
	@Override
	public Class93_Sub41 method32715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, 899549436);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32617((short) 32662);
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "s", descriptor = "(S)Z")
	@Override
	public boolean method32728(@OriginalArg(0) short arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method32617((short) 7701);
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean861 = false;
		}
		return this.aBoolean861;
	}

	@OriginalMember(owner = "client!we", name = "y", descriptor = "(Ljava/util/List;II)V")
	void method32616(@OriginalArg(0) List arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass240_90 == null || arg0 == null || arg1 < 0) {
			return;
		}
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			this.aClass240_90.method25959((long) (this.anInt5887 * -1942162375));
			if (arg1 <= this.aClass240_90.method25927(1769254186)) {
				this.aClass240_90.method25924(arg0, (long) (this.anInt5887 * -1942162375), arg1, -1397003721);
			} else {
				this.aBoolean862 = false;
				this.aBoolean861 = false;
				this.anInt5888 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "q", descriptor = "(S)Ljava/util/List;")
	List method32617(@OriginalArg(0) short arg0) {
		if (this.aClass240_90 == null || !this.aBoolean862) {
			return null;
		}
		@Pc(10) List local10 = null;
		@Pc(14) Class240 local14 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			local10 = (List) this.aClass240_90.method25932((long) (this.anInt5887 * -1942162375));
			if (local10 == null && this.aBoolean862) {
				local10 = new ArrayList();
				this.aClass240_90.method25924(local10, (long) (this.anInt5887 * -1942162375), 0, -1964857712);
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!we", name = "x", descriptor = "()V")
	@Override
	public void method32734() {
		if (Class639.aClass639_2 != this.aClass639_1) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass497_138.method30240(this.anInt5887 * -1942162375, (byte) 127);
		if (local12 == null) {
			return;
		}
		this.aByteArray113 = local12;
		this.method32615(-25820427);
		this.aClass639_1 = Class639.aClass639_3;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26332(this, local12.length, this.anInt5887 * -1942162375, false, (byte) 2);
		}
	}

	@OriginalMember(owner = "client!we", name = "am", descriptor = "(I)Lclient!alw;")
	@Override
	public Class93_Sub41 method32738(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -2071981878);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32617((short) 6573);
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "()Lclient!rw;")
	@Override
	public Class539 method32723() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30968(this, 1424618299);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "al", descriptor = "()Lclient!qk;")
	@Override
	public Class508 method32731() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "()Lclient!rw;")
	@Override
	public Class539 method32725() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30968(this, 1525237172);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "i", descriptor = "()Lclient!rw;")
	@Override
	public Class539 method32726() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30968(this, 2120323682);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "j", descriptor = "()V")
	void method32618() {
	}

	@OriginalMember(owner = "client!we", name = "ae", descriptor = "()I")
	@Override
	public int method32720() {
		return this.aByteArray113 == null ? 0 : this.aByteArray113.length;
	}

	@OriginalMember(owner = "client!we", name = "ar", descriptor = "(I)Lclient!alw;")
	@Override
	public Class93_Sub41 method32709(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, 616551172);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32617((short) 3000);
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "ag", descriptor = "()I")
	@Override
	public int method32729() {
		return this.aByteArray113 == null ? 0 : this.aByteArray113.length;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "()V")
	@Override
	public void method32722() {
		if (Class639.aClass639_2 != this.aClass639_1) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass497_138.method30240(this.anInt5887 * -1942162375, (byte) 27);
		if (local12 == null) {
			return;
		}
		this.aByteArray113 = local12;
		this.method32615(-25820427);
		this.aClass639_1 = Class639.aClass639_3;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26332(this, local12.length, this.anInt5887 * -1942162375, false, (byte) 85);
		}
	}

	@OriginalMember(owner = "client!we", name = "ay", descriptor = "()I")
	@Override
	public int method32747() {
		if (this.aClass240_90 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class240 local10 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(15) List local15 = this.method32617((short) 22073);
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!we", name = "r", descriptor = "(I)Z")
	@Override
	public boolean method32716(@OriginalArg(0) int arg0) {
		return this.aClass240_90 != null && this.aBoolean862;
	}

	@OriginalMember(owner = "client!we", name = "ad", descriptor = "(I)Lclient!alw;")
	@Override
	public Class93_Sub41 method32750(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -1642349166);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32617((short) 30064);
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "aw", descriptor = "()I")
	@Override
	public int method32746() {
		return this.anInt5887 * -1942162375;
	}

	@OriginalMember(owner = "client!we", name = "as", descriptor = "()I")
	@Override
	public int method32735() {
		return this.anInt5887 * -1942162375;
	}

	@OriginalMember(owner = "client!we", name = "ai", descriptor = "()I")
	@Override
	public int method32733() {
		return this.anInt5887 * -1942162375;
	}

	@OriginalMember(owner = "client!we", name = "bi", descriptor = "()Lclient!wl;")
	@Override
	public Class639 method32732() {
		return this.aClass639_1;
	}

	@OriginalMember(owner = "client!we", name = "bc", descriptor = "()Lclient!wl;")
	@Override
	public Class639 method32759() {
		return this.aClass639_1;
	}

	@OriginalMember(owner = "client!we", name = "au", descriptor = "(I)Lclient!alw;")
	@Override
	public Class93_Sub41 method32752(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -1860385616);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32617((short) 18943);
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "n", descriptor = "(B)Lclient!rw;")
	@Override
	public Class539 method32721(@OriginalArg(0) byte arg0) {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30968(this, 1178249081);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "ap", descriptor = "(I)Z")
	@Override
	public boolean method32741(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32617((short) 13443);
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "aq", descriptor = "(I)Z")
	@Override
	public boolean method32742(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32617((short) 30594);
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "bd", descriptor = "()Z")
	@Override
	public boolean method32713() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "av", descriptor = "(I)Z")
	@Override
	public boolean method32744(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32617((short) 32096);
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "ao", descriptor = "()Z")
	@Override
	public boolean method32745() {
		return this.aClass240_90 != null && this.aBoolean862;
	}

	@OriginalMember(owner = "client!we", name = "aj", descriptor = "()Z")
	@Override
	public boolean method32737() {
		return this.aClass240_90 != null && this.aBoolean862;
	}

	@OriginalMember(owner = "client!we", name = "ab", descriptor = "()I")
	@Override
	public int method32706() {
		if (this.aClass240_90 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class240 local10 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(15) List local15 = this.method32617((short) 11802);
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!we", name = "az", descriptor = "()I")
	@Override
	public int method32761() {
		if (this.aClass240_90 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class240 local10 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(15) List local15 = this.method32617((short) 19748);
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!we", name = "ax", descriptor = "(I)Z")
	@Override
	public boolean method32743(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32617((short) 17677);
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "af", descriptor = "(Z)V")
	@Override
	public void method32758(@OriginalArg(0) boolean arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -1131964879);
		}
		this.aBoolean861 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "ak", descriptor = "(Z)V")
	@Override
	public void method32749(@OriginalArg(0) boolean arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, 44831442);
		}
		this.aBoolean861 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "aa", descriptor = "(Z)V")
	@Override
	public void method32760(@OriginalArg(0) boolean arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -1157248156);
		}
		this.aBoolean861 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "bf", descriptor = "()Z")
	@Override
	public boolean method32754() {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method32617((short) 12691);
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean861 = false;
		}
		return this.aBoolean861;
	}

	@OriginalMember(owner = "client!we", name = "ah", descriptor = "()Lclient!qk;")
	@Override
	public Class508 method32740() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!we", name = "bk", descriptor = "()Ljava/util/List;")
	List method32619() {
		if (this.aClass240_90 == null || !this.aBoolean862) {
			return null;
		}
		@Pc(10) List local10 = null;
		@Pc(14) Class240 local14 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			local10 = (List) this.aClass240_90.method25932((long) (this.anInt5887 * -1942162375));
			if (local10 == null && this.aBoolean862) {
				local10 = new ArrayList();
				this.aClass240_90.method25924(local10, (long) (this.anInt5887 * -1942162375), 0, -972207965);
			}
			return local10;
		}
	}

	@OriginalMember(owner = "client!we", name = "bh", descriptor = "()Z")
	@Override
	public boolean method32756() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "bx", descriptor = "()Z")
	@Override
	public boolean method32751() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "an", descriptor = "()Z")
	@Override
	public boolean method32753() {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method32617((short) 18561);
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean861 = false;
		}
		return this.aBoolean861;
	}

	@OriginalMember(owner = "client!we", name = "at", descriptor = "(Lclient!alw;)V")
	@Override
	public void method32736(@OriginalArg(0) Class93_Sub41 arg0) {
		if (this.aClass240_90 == null) {
			return;
		}
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26331(this, -281735146);
		}
		if (this.aBoolean861) {
			throw new RuntimeException("");
		}
		@Pc(23) Class240 local23 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(28) List local28 = this.method32617((short) 5618);
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5888 += arg0.aByteArray58.length * -165190447;
				this.method32616(local28, this.anInt5888 * -635997135, -1054317847);
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "bl", descriptor = "()Z")
	@Override
	public boolean method32755() {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method32617((short) 27150);
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean861 = false;
		}
		return this.aBoolean861;
	}

	@OriginalMember(owner = "client!we", name = "bn", descriptor = "()Lclient!wl;")
	@Override
	public Class639 method32757() {
		return this.aClass639_1;
	}
}
