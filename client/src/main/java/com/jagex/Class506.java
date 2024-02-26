package com.jagex;

import com.jagex.twitchtv.TwitchEventLiveStreams;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class506 {

	@OriginalMember(owner = "client!qh", name = "ag", descriptor = "Lclient!com/jagex/twitchtv/TwitchEventLiveStreams;")
	public static TwitchEventLiveStreams aTwitchEventLiveStreams1;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "Ljava/util/Comparator;")
	final Comparator aComparator2;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "J")
	final long aLong388;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
	final int anInt5044;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "Lclient!qk;")
	final Class509 aClass509_1;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "Ljava/util/Map;")
	final Map aMap21;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!ath;")
	final AbstractQueue_Sub1 anAbstractQueue_Sub1_2;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "Lclient!ath;")
	final AbstractQueue_Sub1 anAbstractQueue_Sub1_3;

	@OriginalMember(owner = "client!qh", name = "bb", descriptor = "(Lclient!yp;I)V")
	static void method30490(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class675.method33585(local11, arg0, -872803847);
	}

	@OriginalMember(owner = "client!qh", name = "cf", descriptor = "(Lclient!yp;I)V")
	static void method30491(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class673.method33568(local11, local14, arg0, (byte) 4);
	}

	@OriginalMember(owner = "client!qh", name = "xl", descriptor = "(Lclient!yp;I)V")
	static void method30492(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3512 * -780671365 >= 2) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3512 * -780671365;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!qh", name = "aal", descriptor = "(Lclient!yp;I)V")
	static void method30493(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class2_Sub1_Sub2.method1853((byte) -19);
	}

	@OriginalMember(owner = "client!qh", name = "kx", descriptor = "(Lclient!yp;I)V")
	static void method30494(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class558.method31400(local11, local14, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "([SILclient!jc;II)I")
	public static int method30495(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class357 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = arg2.method28116(arg0, arg1 + local1, -842074526);
			local1 <<= 0x1;
			local1 += local16;
			local3 |= local16 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!qh", name = "axv", descriptor = "(Lclient!yp;I)V")
	static void method30496(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class115.anInt1015 * -1378374651;
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(JILclient!qk;)V")
	Class506(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class509 arg2) {
		this.aComparator2 = new Class508(this);
		this.aLong388 = arg0 * -595722862001126645L;
		this.anInt5044 = arg1 * 82001009;
		this.aClass509_1 = arg2;
		if (this.anInt5044 * 610862225 == -1) {
			this.aMap21 = new HashMap(64);
			this.anAbstractQueue_Sub1_2 = new AbstractQueue_Sub1(64, this.aComparator2);
			this.anAbstractQueue_Sub1_3 = null;
		} else if (this.aClass509_1 == null) {
			throw new IllegalArgumentException("");
		} else {
			this.aMap21 = new HashMap(this.anInt5044 * 610862225);
			this.anAbstractQueue_Sub1_2 = new AbstractQueue_Sub1(this.anInt5044 * 610862225, this.aComparator2);
			this.anAbstractQueue_Sub1_3 = new AbstractQueue_Sub1(this.anInt5044 * 610862225);
		}
	}

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(ILclient!qk;)V")
	public Class506(@OriginalArg(0) int arg0, @OriginalArg(1) Class509 arg1) {
		this(-1L, arg0, arg1);
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method30472(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		synchronized (this) {
			if (-7978219527568871261L * this.aLong388 != -1L) {
				this.method30477(-1046598172);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject21;
				local19.anObject21 = arg1;
				this.method30476(local19, false, 814492234);
				return local24;
			}
			@Pc(53) Class511 local53;
			if (this.method30473((byte) 33) && this.aMap21.size() == this.anInt5044 * 610862225) {
				local53 = (Class511) this.anAbstractQueue_Sub1_3.remove();
				this.aMap21.remove(local53.anObject20);
				this.anAbstractQueue_Sub1_2.remove(local53);
			}
			local53 = new Class511(arg1, arg0);
			this.aMap21.put(arg0, local53);
			this.method30476(local53, true, 365588826);
			return null;
		}
	}

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "(B)Z")
	boolean method30473(@OriginalArg(0) byte arg0) {
		return this.anInt5044 * 610862225 != -1;
	}

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;")
	public Object method30474(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1) {
		synchronized (this) {
			if (this.aLong388 * -7978219527568871261L != -1L) {
				this.method30477(1740354034);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method30476(local19, false, 1411027676);
				return local19.anObject21;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "()Z")
	boolean method30475() {
		return this.anInt5044 * 610862225 != -1;
	}

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "(Lclient!qm;ZI)V")
	void method30476(@OriginalArg(0) Class511 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (!arg1) {
			this.anAbstractQueue_Sub1_2.remove(arg0);
			if (this.method30473((byte) 106) && !this.anAbstractQueue_Sub1_3.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.aLong390 = System.currentTimeMillis() * 7639845428127848539L;
		if (this.method30473((byte) 103)) {
			switch(this.aClass509_1.anInt5046 * -1576699113) {
				case 0:
					arg0.aLong389 = arg0.aLong390 * 7685740251652488701L;
					break;
				case 1:
					arg0.aLong389 += 2624300378069188847L;
			}
			this.anAbstractQueue_Sub1_3.add(arg0);
		}
		this.anAbstractQueue_Sub1_2.add(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "(I)V")
	void method30477(@OriginalArg(0) int arg0) {
		if (this.aLong388 * -7978219527568871261L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong388 * -7978219527568871261L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class511 local27 = (Class511) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong390 * 3975490113888425939L >= local18) {
				return;
			}
			this.aMap21.remove(local27.anObject20);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method30473((byte) 19)) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30478(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong388 * -7978219527568871261L != -1L) {
				this.method30477(-1672193267);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method30476(local19, false, 1581505442);
				return local19.anObject21;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30479(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong388 * -7978219527568871261L != -1L) {
				this.method30477(140358323);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method30476(local19, false, 1723648552);
				return local19.anObject21;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30480(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong388 * -7978219527568871261L != -1L) {
				this.method30477(-546327120);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method30476(local19, false, 1038929209);
				return local19.anObject21;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "()V")
	void method30481() {
		if (this.aLong388 * -7978219527568871261L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong388 * -7978219527568871261L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class511 local27 = (Class511) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong390 * 3975490113888425939L >= local18) {
				return;
			}
			this.aMap21.remove(local27.anObject20);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method30473((byte) 127)) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30482(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong388 * -7978219527568871261L != -1L) {
				this.method30477(-1753480252);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method30476(local19, false, 703101229);
				return local19.anObject21;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30483(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (-7978219527568871261L * this.aLong388 != -1L) {
				this.method30477(-2137793347);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject21;
				local19.anObject21 = arg1;
				this.method30476(local19, false, 13372082);
				return local24;
			}
			@Pc(53) Class511 local53;
			if (this.method30473((byte) 114) && this.aMap21.size() == this.anInt5044 * 610862225) {
				local53 = (Class511) this.anAbstractQueue_Sub1_3.remove();
				this.aMap21.remove(local53.anObject20);
				this.anAbstractQueue_Sub1_2.remove(local53);
			}
			local53 = new Class511(arg1, arg0);
			this.aMap21.put(arg0, local53);
			this.method30476(local53, true, 505902527);
			return null;
		}
	}

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30484(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong388 * -7978219527568871261L != -1L) {
				this.method30477(722994846);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method30476(local19, false, 85941172);
				return local19.anObject21;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30485(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (-7978219527568871261L * this.aLong388 != -1L) {
				this.method30477(179079580);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject21;
				local19.anObject21 = arg1;
				this.method30476(local19, false, 458908411);
				return local24;
			}
			@Pc(53) Class511 local53;
			if (this.method30473((byte) 101) && this.aMap21.size() == this.anInt5044 * 610862225) {
				local53 = (Class511) this.anAbstractQueue_Sub1_3.remove();
				this.aMap21.remove(local53.anObject20);
				this.anAbstractQueue_Sub1_2.remove(local53);
			}
			local53 = new Class511(arg1, arg0);
			this.aMap21.put(arg0, local53);
			this.method30476(local53, true, 1278721421);
			return null;
		}
	}

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30486(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (-7978219527568871261L * this.aLong388 != -1L) {
				this.method30477(1284873211);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject21;
				local19.anObject21 = arg1;
				this.method30476(local19, false, 766138039);
				return local24;
			}
			@Pc(53) Class511 local53;
			if (this.method30473((byte) 90) && this.aMap21.size() == this.anInt5044 * 610862225) {
				local53 = (Class511) this.anAbstractQueue_Sub1_3.remove();
				this.aMap21.remove(local53.anObject20);
				this.anAbstractQueue_Sub1_2.remove(local53);
			}
			local53 = new Class511(arg1, arg0);
			this.aMap21.put(arg0, local53);
			this.method30476(local53, true, 517888261);
			return null;
		}
	}

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30487(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (-7978219527568871261L * this.aLong388 != -1L) {
				this.method30477(1841128111);
			}
			@Pc(19) Class511 local19 = (Class511) this.aMap21.get(arg0);
			if (local19 != null) {
				@Pc(24) Object local24 = local19.anObject21;
				local19.anObject21 = arg1;
				this.method30476(local19, false, 1257514578);
				return local24;
			}
			@Pc(53) Class511 local53;
			if (this.method30473((byte) 76) && this.aMap21.size() == this.anInt5044 * 610862225) {
				local53 = (Class511) this.anAbstractQueue_Sub1_3.remove();
				this.aMap21.remove(local53.anObject20);
				this.anAbstractQueue_Sub1_2.remove(local53);
			}
			local53 = new Class511(arg1, arg0);
			this.aMap21.put(arg0, local53);
			this.method30476(local53, true, 1129908055);
			return null;
		}
	}

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "(Lclient!qm;Z)V")
	void method30488(@OriginalArg(0) Class511 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.anAbstractQueue_Sub1_2.remove(arg0);
			if (this.method30473((byte) 8) && !this.anAbstractQueue_Sub1_3.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.aLong390 = System.currentTimeMillis() * 7639845428127848539L;
		if (this.method30473((byte) 116)) {
			switch(this.aClass509_1.anInt5046 * -1576699113) {
				case 0:
					arg0.aLong389 = arg0.aLong390 * 7685740251652488701L;
					break;
				case 1:
					arg0.aLong389 += 2624300378069188847L;
			}
			this.anAbstractQueue_Sub1_3.add(arg0);
		}
		this.anAbstractQueue_Sub1_2.add(arg0);
	}

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "()V")
	void method30489() {
		if (this.aLong388 * -7978219527568871261L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong388 * -7978219527568871261L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class511 local27 = (Class511) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong390 * 3975490113888425939L >= local18) {
				return;
			}
			this.aMap21.remove(local27.anObject20);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method30473((byte) 23)) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}
}
