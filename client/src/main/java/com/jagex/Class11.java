package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aai")
public class Class11 implements Iterator {

	@OriginalMember(owner = "client!aai", name = "m", descriptor = "Lclient!aky;")
	Class93_Sub1 aClass93_Sub1_1 = null;

	@OriginalMember(owner = "client!aai", name = "e", descriptor = "Lclient!aap;")
	Class18 aClass18_1;

	@OriginalMember(owner = "client!aai", name = "n", descriptor = "Lclient!aky;")
	Class93_Sub1 aClass93_Sub1_2;

	@OriginalMember(owner = "client!aai", name = "<init>", descriptor = "(Lclient!aap;)V", line = 11)
	public Class11(@OriginalArg(0) Class18 arg0) {
		this.aClass18_1 = arg0;
		this.aClass93_Sub1_2 = this.aClass18_1.aClass93_Sub1_4.aClass93_Sub1_68;
		this.aClass93_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!aai", name = "l", descriptor = "(B)V", line = 18)
	void method167(@OriginalArg(0) byte arg0) {
		this.aClass93_Sub1_2 = this.aClass18_1.aClass93_Sub1_4.aClass93_Sub1_68;
		this.aClass93_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!aai", name = "z", descriptor = "()V", line = 18)
	void method168() {
		this.aClass93_Sub1_2 = this.aClass18_1.aClass93_Sub1_4.aClass93_Sub1_68;
		this.aClass93_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!aai", name = "p", descriptor = "()V", line = 18)
	void method169() {
		this.aClass93_Sub1_2 = this.aClass18_1.aClass93_Sub1_4.aClass93_Sub1_68;
		this.aClass93_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!aai", name = "u", descriptor = "(I)Lclient!aky;", line = 23)
	public Class93_Sub1 method170(@OriginalArg(0) int arg0) {
		this.method167((byte) 120);
		return (Class93_Sub1) this.next();
	}

	@OriginalMember(owner = "client!aai", name = "c", descriptor = "()Lclient!aky;", line = 23)
	public Class93_Sub1 method171() {
		this.method167((byte) 67);
		return (Class93_Sub1) this.next();
	}

	@OriginalMember(owner = "client!aai", name = "d", descriptor = "()Lclient!aky;", line = 23)
	public Class93_Sub1 method172() {
		this.method167((byte) 24);
		return (Class93_Sub1) this.next();
	}

	@OriginalMember(owner = "client!aai", name = "next", descriptor = "()Ljava/lang/Object;", line = 28)
	@Override
	public Object next() {
		@Pc(2) Class93_Sub1 local2 = this.aClass93_Sub1_2;
		if (this.aClass18_1.aClass93_Sub1_4 == local2) {
			local2 = null;
			this.aClass93_Sub1_2 = null;
		} else {
			this.aClass93_Sub1_2 = local2.aClass93_Sub1_68;
		}
		this.aClass93_Sub1_1 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aai", name = "k", descriptor = "()Ljava/lang/Object;", line = 28)
	public Object method173() {
		@Pc(2) Class93_Sub1 local2 = this.aClass93_Sub1_2;
		if (this.aClass18_1.aClass93_Sub1_4 == local2) {
			local2 = null;
			this.aClass93_Sub1_2 = null;
		} else {
			this.aClass93_Sub1_2 = local2.aClass93_Sub1_68;
		}
		this.aClass93_Sub1_1 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aai", name = "m", descriptor = "()Ljava/lang/Object;", line = 28)
	public Object method174() {
		@Pc(2) Class93_Sub1 local2 = this.aClass93_Sub1_2;
		if (this.aClass18_1.aClass93_Sub1_4 == local2) {
			local2 = null;
			this.aClass93_Sub1_2 = null;
		} else {
			this.aClass93_Sub1_2 = local2.aClass93_Sub1_68;
		}
		this.aClass93_Sub1_1 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aai", name = "e", descriptor = "()Z", line = 39)
	public boolean method175() {
		return this.aClass18_1.aClass93_Sub1_4 != this.aClass93_Sub1_2;
	}

	@OriginalMember(owner = "client!aai", name = "hasNext", descriptor = "()Z", line = 39)
	@Override
	public boolean hasNext() {
		return this.aClass18_1.aClass93_Sub1_4 != this.aClass93_Sub1_2;
	}

	@OriginalMember(owner = "client!aai", name = "n", descriptor = "()Z", line = 39)
	public boolean method176() {
		return this.aClass18_1.aClass93_Sub1_4 != this.aClass93_Sub1_2;
	}

	@OriginalMember(owner = "client!aai", name = "remove", descriptor = "()V", line = 43)
	@Override
	public void remove() {
		if (this.aClass93_Sub1_1 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_Sub1_1.method23976((short) 20839);
		this.aClass93_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!aai", name = "w", descriptor = "()V", line = 43)
	public void method177() {
		if (this.aClass93_Sub1_1 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_Sub1_1.method23976((short) -22759);
		this.aClass93_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!aai", name = "f", descriptor = "()V", line = 43)
	public void method178() {
		if (this.aClass93_Sub1_1 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_Sub1_1.method23976((short) 10919);
		this.aClass93_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!aai", name = "v", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 322)
	static String method179(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) String local1 = null;
		@Pc(5) int local5 = arg0.indexOf("--> ");
		if (local5 >= 0) {
			local1 = arg0.substring(0, local5 + 4);
			arg0 = arg0.substring(local5 + 4);
		}
		@Pc(22) int local22 = -1;
		if (arg0.startsWith("directlogin ")) {
			local22 = arg0.indexOf(" ", "directlogin ".length());
		}
		if (local22 >= 0) {
			@Pc(37) int local37 = arg0.length();
			arg0 = arg0.substring(0, local22) + " ";
			for (@Pc(53) int local53 = local22 + 1; local53 < local37; local53++) {
				arg0 = arg0 + "*";
			}
		}
		return local1 == null ? arg0 : local1 + arg0;
	}

	@OriginalMember(owner = "client!aai", name = "gn", descriptor = "(I)V", line = 3635)
	public static final void method180(@OriginalArg(0) int arg0) {
		if (!client.aBoolean618) {
			client.aFloat255 += (-12.0F - client.aFloat255) / 2.0F;
			client.aBoolean619 = true;
			client.aBoolean618 = true;
		}
	}
}
