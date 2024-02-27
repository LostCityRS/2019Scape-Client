package com.jagex;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qy")
public final class Class521 {

	@OriginalMember(owner = "client!qy", name = "w", descriptor = "Lclient!qc;")
	final Class502 aClass502_3;

	@OriginalMember(owner = "client!qy", name = "n", descriptor = "Ljava/util/Map;")
	final Map aMap24;

	@OriginalMember(owner = "client!qy", name = "m", descriptor = "Lclient!att;")
	final AbstractQueue_Sub1 anAbstractQueue_Sub1_2;

	@OriginalMember(owner = "client!qy", name = "k", descriptor = "Lclient!att;")
	final AbstractQueue_Sub1 anAbstractQueue_Sub1_3;

	@OriginalMember(owner = "client!qy", name = "e", descriptor = "Ljava/util/Comparator;")
	final Comparator aComparator2;

	@OriginalMember(owner = "client!qy", name = "f", descriptor = "J")
	final long aLong288;

	@OriginalMember(owner = "client!qy", name = "l", descriptor = "I")
	final int anInt5382;

	@OriginalMember(owner = "client!qy", name = "bk", descriptor = "(Lclient!yf;B)V")
	static void method30538(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6055 -= 1566132618;
		if (arg0.aLongArray27[arg0.anInt6055 * -2000995827] > arg0.aLongArray27[arg0.anInt6055 * -2000995827 + 1]) {
			arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!qy", name = "<init>", descriptor = "(ILclient!qc;)V")
	public Class521(@OriginalArg(0) int arg0, @OriginalArg(1) Class502 arg1) {
		this(-1L, arg0, arg1);
	}

	@OriginalMember(owner = "client!qy", name = "<init>", descriptor = "(JILclient!qc;)V")
	Class521(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class502 arg2) {
		this.aComparator2 = new Class506(this);
		this.aLong288 = arg0 * 8140697579669226783L;
		this.anInt5382 = arg1 * -1360816121;
		this.aClass502_3 = arg2;
		if (this.anInt5382 * 176969143 == -1) {
			this.aMap24 = new HashMap(64);
			this.anAbstractQueue_Sub1_2 = new AbstractQueue_Sub1(64, this.aComparator2);
			this.anAbstractQueue_Sub1_3 = null;
		} else if (this.aClass502_3 == null) {
			throw new IllegalArgumentException("");
		} else {
			this.aMap24 = new HashMap(this.anInt5382 * 176969143);
			this.anAbstractQueue_Sub1_2 = new AbstractQueue_Sub1(this.anInt5382 * 176969143, this.aComparator2);
			this.anAbstractQueue_Sub1_3 = new AbstractQueue_Sub1(this.anInt5382 * 176969143);
		}
	}

	@OriginalMember(owner = "client!qy", name = "d", descriptor = "()V")
	void method30525() {
		if (this.aLong288 * -8222533772526471457L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong288 * -8222533772526471457L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class503 local27 = (Class503) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong287 * -2148301208355003327L >= local18) {
				return;
			}
			this.aMap24.remove(local27.anObject20);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method30526((byte) 40)) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qy", name = "e", descriptor = "(B)Z")
	boolean method30526(@OriginalArg(0) byte arg0) {
		return this.anInt5382 * 176969143 != -1;
	}

	@OriginalMember(owner = "client!qy", name = "n", descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method30527(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		synchronized (this) {
			if (this.aLong288 * -8222533772526471457L != -1L) {
				this.method30530(-1643552988);
			}
			@Pc(19) Class503 local19 = (Class503) this.aMap24.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method30535(local19, false, 336274797);
				return local19.anObject21;
			}
		}
	}

	@OriginalMember(owner = "client!qy", name = "m", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method30528(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		synchronized (this) {
			if (this.aLong288 * -8222533772526471457L != -1L) {
				this.method30530(124565619);
			}
			@Pc(19) Class503 local19 = (Class503) this.aMap24.get(arg0);
			if (local19 != null) {
				@Pc(25) Object local25 = local19.anObject21;
				local19.anObject21 = arg1;
				this.method30535(local19, false, 336274797);
				return local25;
			}
			@Pc(54) Class503 local54;
			if (this.method30526((byte) 40) && this.aMap24.size() == this.anInt5382 * 176969143) {
				local54 = (Class503) this.anAbstractQueue_Sub1_3.remove();
				this.aMap24.remove(local54.anObject20);
				this.anAbstractQueue_Sub1_2.remove(local54);
			}
			local54 = new Class503(arg1, arg0);
			this.aMap24.put(arg0, local54);
			this.method30535(local54, true, 336274797);
			return null;
		}
	}

	@OriginalMember(owner = "client!qy", name = "w", descriptor = "()Z")
	boolean method30529() {
		return this.anInt5382 * 176969143 != -1;
	}

	@OriginalMember(owner = "client!qy", name = "f", descriptor = "(I)V")
	void method30530(@OriginalArg(0) int arg0) {
		if (this.aLong288 * -8222533772526471457L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong288 * -8222533772526471457L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class503 local27 = (Class503) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong287 * -2148301208355003327L >= local18) {
				return;
			}
			this.aMap24.remove(local27.anObject20);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method30526((byte) 40)) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qy", name = "l", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30531(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong288 * -8222533772526471457L != -1L) {
				this.method30530(-1757210109);
			}
			@Pc(19) Class503 local19 = (Class503) this.aMap24.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method30535(local19, false, 336274797);
				return local19.anObject21;
			}
		}
	}

	@OriginalMember(owner = "client!qy", name = "u", descriptor = "(Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30532(@OriginalArg(0) Object arg0) {
		synchronized (this) {
			if (this.aLong288 * -8222533772526471457L != -1L) {
				this.method30530(-541816986);
			}
			@Pc(19) Class503 local19 = (Class503) this.aMap24.get(arg0);
			if (local19 == null) {
				return null;
			} else {
				this.method30535(local19, false, 336274797);
				return local19.anObject21;
			}
		}
	}

	@OriginalMember(owner = "client!qy", name = "z", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method30533(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		synchronized (this) {
			if (this.aLong288 * -8222533772526471457L != -1L) {
				this.method30530(886123381);
			}
			@Pc(19) Class503 local19 = (Class503) this.aMap24.get(arg0);
			if (local19 != null) {
				@Pc(25) Object local25 = local19.anObject21;
				local19.anObject21 = arg1;
				this.method30535(local19, false, 336274797);
				return local25;
			}
			@Pc(54) Class503 local54;
			if (this.method30526((byte) 40) && this.aMap24.size() == this.anInt5382 * 176969143) {
				local54 = (Class503) this.anAbstractQueue_Sub1_3.remove();
				this.aMap24.remove(local54.anObject20);
				this.anAbstractQueue_Sub1_2.remove(local54);
			}
			local54 = new Class503(arg1, arg0);
			this.aMap24.put(arg0, local54);
			this.method30535(local54, true, 336274797);
			return null;
		}
	}

	@OriginalMember(owner = "client!qy", name = "p", descriptor = "(Lclient!qd;Z)V")
	void method30534(@OriginalArg(0) Class503 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg1) {
			this.anAbstractQueue_Sub1_2.remove(arg0);
			if (this.method30526((byte) 40) && !this.anAbstractQueue_Sub1_3.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.aLong287 = System.currentTimeMillis() * -1827688235406922815L;
		if (this.method30526((byte) 40)) {
			switch(this.aClass502_3.anInt5361 * -1185501535) {
				case 0:
					arg0.aLong286 = arg0.aLong287 * -7668360122257129615L;
					break;
				case 1:
					arg0.aLong286 += 7680150200786882353L;
			}
			this.anAbstractQueue_Sub1_3.add(arg0);
		}
		this.anAbstractQueue_Sub1_2.add(arg0);
	}

	@OriginalMember(owner = "client!qy", name = "k", descriptor = "(Lclient!qd;ZI)V")
	void method30535(@OriginalArg(0) Class503 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (!arg1) {
			this.anAbstractQueue_Sub1_2.remove(arg0);
			if (this.method30526((byte) 40) && !this.anAbstractQueue_Sub1_3.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.aLong287 = System.currentTimeMillis() * -1827688235406922815L;
		if (this.method30526((byte) 40)) {
			switch(this.aClass502_3.anInt5361 * -1185501535) {
				case 0:
					arg0.aLong286 = arg0.aLong287 * -7668360122257129615L;
					break;
				case 1:
					arg0.aLong286 += 7680150200786882353L;
			}
			this.anAbstractQueue_Sub1_3.add(arg0);
		}
		this.anAbstractQueue_Sub1_2.add(arg0);
	}

	@OriginalMember(owner = "client!qy", name = "c", descriptor = "()V")
	void method30536() {
		if (this.aLong288 * -8222533772526471457L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong288 * -8222533772526471457L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class503 local27 = (Class503) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong287 * -2148301208355003327L >= local18) {
				return;
			}
			this.aMap24.remove(local27.anObject20);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method30526((byte) 40)) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}

	@OriginalMember(owner = "client!qy", name = "r", descriptor = "()V")
	void method30537() {
		if (this.aLong288 * -8222533772526471457L == -1L) {
			throw new IllegalStateException("");
		}
		@Pc(18) long local18 = System.currentTimeMillis() - this.aLong288 * -8222533772526471457L;
		while (!this.anAbstractQueue_Sub1_2.isEmpty()) {
			@Pc(27) Class503 local27 = (Class503) this.anAbstractQueue_Sub1_2.peek();
			if (local27.aLong287 * -2148301208355003327L >= local18) {
				return;
			}
			this.aMap24.remove(local27.anObject20);
			this.anAbstractQueue_Sub1_2.remove(local27);
			if (this.method30526((byte) 40)) {
				this.anAbstractQueue_Sub1_3.remove(local27);
			}
		}
	}
}
