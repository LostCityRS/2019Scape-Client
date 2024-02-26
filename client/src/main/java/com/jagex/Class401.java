package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class401 {

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "Lclient!lx;")
	Interface38 anInterface38_18;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Lclient!afo;")
	Class108_Sub1 aClass108_Sub1_4;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "Lclient!do;")
	Interface18 anInterface18_2;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Lclient!mg;")
	Interface40 anInterface40_1;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!ld;")
	Class135 aClass135_23;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "Lclient!do;")
	Interface18 anInterface18_3;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!do;")
	Interface18 anInterface18_4;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Lclient!afo;")
	Class108_Sub1 aClass108_Sub1_5;

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Lclient!do;")
	Interface18 anInterface18_5;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "Lclient!de;")
	Interface17 anInterface17_1;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "Lclient!de;")
	Interface17 anInterface17_2;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
	int anInt4575;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "Z")
	boolean aBoolean854;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "Lclient!mg;")
	Interface40 anInterface40_2;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "Lclient!mg;")
	Interface40 anInterface40_3;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
	int anInt4576 = 0;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Ljava/util/Vector;")
	Vector aVector1 = new Vector();

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
	int anInt4577 = 0;

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
	int anInt4578 = 0;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "Lclient!afa;")
	Class102_Sub1 aClass102_Sub1_37;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "Lclient!dy;")
	Class236 aClass236_29;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	int anInt4573;

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
	int anInt4574;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!afa;II)V")
	Class401(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass102_Sub1_37 = arg0;
		this.aClass236_29 = Class236.aClass236_21;
		this.anInt4573 = arg1;
		this.anInt4574 = arg2;
	}

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "(Ljava/util/Vector;ILclient!li;)Z")
	boolean method28844(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class136 arg2) {
		if (!arg2.method11183() && !arg2.method11199()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11184(this.anInt4573, this.anInt4574);
		@Pc(18) int local18 = arg2.method11192();
		if (local18 > this.anInt4577) {
			this.anInt4577 = local18;
		}
		arg2.aBoolean236 = true;
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "ay", descriptor = "()Z")
	boolean method28845() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class136) this.aVector1.elementAt(local5)).method11195()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "(Ljava/util/Vector;ILclient!li;)Z")
	boolean method28846(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class136 arg2) {
		if (!arg2.method11183() && !arg2.method11199()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11184(this.anInt4573, this.anInt4574);
		@Pc(18) int local18 = arg2.method11192();
		if (local18 > this.anInt4577) {
			this.anInt4577 = local18;
		}
		arg2.aBoolean236 = true;
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "()V")
	void method28847() {
		this.method28883();
		switch(this.anInt4577) {
			case 0:
				this.aClass236_29 = Class236.aClass236_21;
				break;
			case 1:
				this.aClass236_29 = Class236.aClass236_25;
				break;
			case 2:
				this.aClass236_29 = Class236.aClass236_26;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass108_Sub1_4 = this.aClass102_Sub1_37.method20687();
		if (this.aClass102_Sub1_37.anInt2994 > 1 && this.aClass102_Sub1_37.aBoolean523 && this.aClass102_Sub1_37.aBoolean530) {
			this.aClass108_Sub1_5 = this.aClass102_Sub1_37.method20687();
			this.anInterface18_5 = this.aClass102_Sub1_37.method20688(this.anInt4573, this.anInt4574, Class210.aClass210_24, this.aClass236_29, this.aClass102_Sub1_37.anInt2994);
			this.anInterface17_2 = this.aClass102_Sub1_37.method21115(this.anInt4573, this.anInt4574, this.aClass102_Sub1_37.anInt2994);
		}
		this.anInterface40_3 = this.aClass102_Sub1_37.method21215(Class210.aClass210_24, this.aClass236_29, this.anInt4573, this.anInt4574);
		this.anInterface18_3 = this.anInterface40_3.method11698(0);
		this.anInterface40_1 = this.aClass102_Sub1_37.method21215(Class210.aClass210_24, this.aClass236_29, this.anInt4573, this.anInt4574);
		this.anInterface18_4 = this.anInterface40_1.method11698(0);
		this.anInterface40_2 = this.aClass102_Sub1_37.method21215(Class210.aClass210_24, this.aClass236_29, this.anInt4573, this.anInt4574);
		this.anInterface18_2 = this.anInterface40_2.method11698(0);
		this.anInterface17_1 = this.aClass102_Sub1_37.method20689(this.anInterface40_2.method11688(), this.anInterface40_2.method11652());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class136 local149 = (Class136) this.aVector1.elementAt(local140);
			local149.method11184(this.anInt4573, this.anInt4574);
		}
	}

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "(Lclient!li;)Z")
	boolean method28848(@OriginalArg(0) Class136 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method11221() < this.method28864(local7).method11221()) {
				local5 = true;
				if (!this.method28844(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28864(local7));
		}
		if (local5 || this.method28844(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "()V")
	void method28849() {
		this.aClass102_Sub1_37.method21250(0, this.anInterface38_18);
		this.aClass102_Sub1_37.method21158(this.aClass135_23);
		this.aClass102_Sub1_37.method21257(Class415.aClass415_6, 0, 1);
	}

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "(Lclient!li;)V")
	void method28850(@OriginalArg(0) Class136 arg0) {
		arg0.method11216();
		arg0.aBoolean236 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "()Z")
	boolean method28851() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class136) this.aVector1.elementAt(local5)).method11195()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "(IIII)Z")
	boolean method28852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aVector1.isEmpty() || this.method28851()) {
			return true;
		}
		if (this.anInt4573 != arg2 || this.anInt4574 != arg3 || this.aClass102_Sub1_37.anInt2994 != this.anInt4578) {
			this.anInt4578 = this.aClass102_Sub1_37.anInt2994;
			this.anInt4573 = arg2;
			this.anInt4574 = arg3;
			this.method28855();
			this.method28847();
		}
		this.aClass108_Sub1_4.method23903(0, this.anInterface18_2);
		if (this.anInterface17_1 != null) {
			this.aClass108_Sub1_4.method23905(this.anInterface17_1);
		}
		if (this.aClass108_Sub1_5 == null) {
			this.aClass102_Sub1_37.method20684(this.aClass108_Sub1_4, -107201230);
		} else {
			this.aClass108_Sub1_5.method23903(0, this.anInterface18_5);
			this.aClass108_Sub1_5.method23905(this.anInterface17_2);
			this.aClass102_Sub1_37.method20684(this.aClass108_Sub1_5, 341605584);
		}
		if (!this.aClass108_Sub1_4.method23897()) {
			this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_5 == null ? this.aClass108_Sub1_4 : this.aClass108_Sub1_5, (byte) 1);
			return false;
		}
		this.anInt4575 = arg0;
		this.anInt4576 = arg1;
		this.aClass102_Sub1_37.method20714(3, -16777216);
		this.aClass102_Sub1_37.method21237(15);
		this.aClass102_Sub1_37.method21460(0);
		this.aBoolean854 = true;
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "j", descriptor = "(II)V")
	void method28853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean854) {
			return;
		}
		if (this.aClass108_Sub1_5 != null) {
			this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_5, (byte) 1);
			this.aClass102_Sub1_37.method20684(this.aClass108_Sub1_4, 1990023819);
			this.aClass108_Sub1_5.method23898(0, 0, this.anInt4573, this.anInt4574, 0, 0, true, this.anInterface17_1 != null);
		}
		this.method28854(arg0, arg1);
		this.aBoolean854 = false;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
	void method28854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub1_37.method20712(true);
		this.aClass102_Sub1_37.method21259();
		this.aClass102_Sub1_37.method21235(0);
		this.aClass102_Sub1_37.method21297(1);
		this.aClass102_Sub1_37.method20877();
		this.aClass108_Sub1_4.method23905(null);
		this.aClass102_Sub1_37.method21270(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class136) this.aVector1.elementAt(local35)).method11195()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class136) this.aVector1.elementAt(local51)).method11195()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface40_2.method11713();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class136 local89 = (Class136) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method11190();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_4);
				} else if (local101) {
					this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_4, (byte) 1);
					this.aClass102_Sub1_37.method20986(this.anInt4575, this.anInt4576, this.anInt4575 + arg0, this.anInt4576 + arg1);
				} else {
					local103 = true;
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_2);
				}
				@Pc(155) Interface40 local155 = this.anInterface40_3;
				if (local105 == 0) {
					local155 = this.anInterface40_2;
				}
				local89.method11188(local105, this.aClass108_Sub1_4, local155, this.anInterface17_1, this.anInterface40_2, local101 && local105 == local92 - 1);
				this.method28849();
				local89.method11205(local105);
				if (local103) {
					this.anInterface40_2.method11713();
				}
				@Pc(194) Interface40 local194 = this.anInterface40_3;
				this.anInterface40_3 = this.anInterface40_1;
				this.anInterface40_1 = local194;
				@Pc(204) Interface18 local204 = this.anInterface18_3;
				this.anInterface18_3 = this.anInterface18_4;
				this.anInterface18_4 = local204;
			}
		}
		this.aClass102_Sub1_37.method21235(1);
		this.aClass102_Sub1_37.method21297(0);
		this.aClass102_Sub1_37.method20712(false);
		this.aClass102_Sub1_37.method20877();
		local33 = null;
	}

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "()V")
	void method28855() {
		if (this.aClass108_Sub1_5 != null) {
			this.aClass108_Sub1_5.method24046();
			this.aClass108_Sub1_5 = null;
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method30837();
			this.anInterface18_5 = null;
		}
		if (this.anInterface17_2 != null) {
			this.anInterface17_2.method30837();
			this.anInterface17_2 = null;
		}
		if (this.aClass108_Sub1_4 != null) {
			this.aClass108_Sub1_4.method24046();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method30837();
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method30837();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method30837();
		}
		if (this.anInterface40_3 != null) {
			this.anInterface40_3.method30837();
		}
		if (this.anInterface40_1 != null) {
			this.anInterface40_1.method30837();
		}
		if (this.anInterface40_2 != null) {
			this.anInterface40_2.method30837();
		}
		if (this.anInterface17_1 != null) {
			this.anInterface17_1.method30837();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class136 local89 = (Class136) this.aVector1.elementAt(local80);
			local89.method11216();
		}
	}

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "()V")
	void method28856() {
		if (this.anInterface38_18 != null) {
			return;
		}
		this.anInterface38_18 = this.aClass102_Sub1_37.method21239(false);
		this.anInterface38_18.method29327(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass102_Sub1_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface38_18.method29383(0, local19.position(), this.aClass102_Sub1_37.aLong168);
		this.aClass135_23 = this.aClass102_Sub1_37.method21248(new Class397[] { new Class397(Class400.aClass400_4) });
	}

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "()V")
	void method28857() {
		if (this.anInterface38_18 != null) {
			return;
		}
		this.anInterface38_18 = this.aClass102_Sub1_37.method21239(false);
		this.anInterface38_18.method29327(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass102_Sub1_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface38_18.method29383(0, local19.position(), this.aClass102_Sub1_37.aLong168);
		this.aClass135_23 = this.aClass102_Sub1_37.method21248(new Class397[] { new Class397(Class400.aClass400_4) });
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "()V")
	void method28858() {
		this.method28883();
		switch(this.anInt4577) {
			case 0:
				this.aClass236_29 = Class236.aClass236_21;
				break;
			case 1:
				this.aClass236_29 = Class236.aClass236_25;
				break;
			case 2:
				this.aClass236_29 = Class236.aClass236_26;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass108_Sub1_4 = this.aClass102_Sub1_37.method20687();
		if (this.aClass102_Sub1_37.anInt2994 > 1 && this.aClass102_Sub1_37.aBoolean523 && this.aClass102_Sub1_37.aBoolean530) {
			this.aClass108_Sub1_5 = this.aClass102_Sub1_37.method20687();
			this.anInterface18_5 = this.aClass102_Sub1_37.method20688(this.anInt4573, this.anInt4574, Class210.aClass210_24, this.aClass236_29, this.aClass102_Sub1_37.anInt2994);
			this.anInterface17_2 = this.aClass102_Sub1_37.method21115(this.anInt4573, this.anInt4574, this.aClass102_Sub1_37.anInt2994);
		}
		this.anInterface40_3 = this.aClass102_Sub1_37.method21215(Class210.aClass210_24, this.aClass236_29, this.anInt4573, this.anInt4574);
		this.anInterface18_3 = this.anInterface40_3.method11698(0);
		this.anInterface40_1 = this.aClass102_Sub1_37.method21215(Class210.aClass210_24, this.aClass236_29, this.anInt4573, this.anInt4574);
		this.anInterface18_4 = this.anInterface40_1.method11698(0);
		this.anInterface40_2 = this.aClass102_Sub1_37.method21215(Class210.aClass210_24, this.aClass236_29, this.anInt4573, this.anInt4574);
		this.anInterface18_2 = this.anInterface40_2.method11698(0);
		this.anInterface17_1 = this.aClass102_Sub1_37.method20689(this.anInterface40_2.method11688(), this.anInterface40_2.method11652());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class136 local149 = (Class136) this.aVector1.elementAt(local140);
			local149.method11184(this.anInt4573, this.anInt4574);
		}
	}

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "()V")
	void method28859() {
		this.aClass102_Sub1_37.method21250(0, this.anInterface38_18);
		this.aClass102_Sub1_37.method21158(this.aClass135_23);
		this.aClass102_Sub1_37.method21257(Class415.aClass415_6, 0, 1);
	}

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "()V")
	void method28860() {
		this.aClass102_Sub1_37.method21250(0, this.anInterface38_18);
		this.aClass102_Sub1_37.method21158(this.aClass135_23);
		this.aClass102_Sub1_37.method21257(Class415.aClass415_6, 0, 1);
	}

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "()V")
	void method28861() {
		this.method28883();
		switch(this.anInt4577) {
			case 0:
				this.aClass236_29 = Class236.aClass236_21;
				break;
			case 1:
				this.aClass236_29 = Class236.aClass236_25;
				break;
			case 2:
				this.aClass236_29 = Class236.aClass236_26;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass108_Sub1_4 = this.aClass102_Sub1_37.method20687();
		if (this.aClass102_Sub1_37.anInt2994 > 1 && this.aClass102_Sub1_37.aBoolean523 && this.aClass102_Sub1_37.aBoolean530) {
			this.aClass108_Sub1_5 = this.aClass102_Sub1_37.method20687();
			this.anInterface18_5 = this.aClass102_Sub1_37.method20688(this.anInt4573, this.anInt4574, Class210.aClass210_24, this.aClass236_29, this.aClass102_Sub1_37.anInt2994);
			this.anInterface17_2 = this.aClass102_Sub1_37.method21115(this.anInt4573, this.anInt4574, this.aClass102_Sub1_37.anInt2994);
		}
		this.anInterface40_3 = this.aClass102_Sub1_37.method21215(Class210.aClass210_24, this.aClass236_29, this.anInt4573, this.anInt4574);
		this.anInterface18_3 = this.anInterface40_3.method11698(0);
		this.anInterface40_1 = this.aClass102_Sub1_37.method21215(Class210.aClass210_24, this.aClass236_29, this.anInt4573, this.anInt4574);
		this.anInterface18_4 = this.anInterface40_1.method11698(0);
		this.anInterface40_2 = this.aClass102_Sub1_37.method21215(Class210.aClass210_24, this.aClass236_29, this.anInt4573, this.anInt4574);
		this.anInterface18_2 = this.anInterface40_2.method11698(0);
		this.anInterface17_1 = this.aClass102_Sub1_37.method20689(this.anInterface40_2.method11688(), this.anInterface40_2.method11652());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class136 local149 = (Class136) this.aVector1.elementAt(local140);
			local149.method11184(this.anInt4573, this.anInt4574);
		}
	}

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "(Lclient!li;)V")
	void method28862(@OriginalArg(0) Class136 arg0) {
		arg0.method11216();
		arg0.aBoolean236 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "(Lclient!li;)Z")
	boolean method28863(@OriginalArg(0) Class136 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method11221() < this.method28864(local7).method11221()) {
				local5 = true;
				if (!this.method28844(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28864(local7));
		}
		if (local5 || this.method28844(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "(I)Lclient!li;")
	Class136 method28864(@OriginalArg(0) int arg0) {
		return (Class136) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "aq", descriptor = "()Z")
	boolean method28865() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class136) this.aVector1.elementAt(local5)).method11195()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "ak", descriptor = "()V")
	void method28866() {
		if (this.aClass108_Sub1_5 != null) {
			this.aClass108_Sub1_5.method24046();
			this.aClass108_Sub1_5 = null;
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method30837();
			this.anInterface18_5 = null;
		}
		if (this.anInterface17_2 != null) {
			this.anInterface17_2.method30837();
			this.anInterface17_2 = null;
		}
		if (this.aClass108_Sub1_4 != null) {
			this.aClass108_Sub1_4.method24046();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method30837();
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method30837();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method30837();
		}
		if (this.anInterface40_3 != null) {
			this.anInterface40_3.method30837();
		}
		if (this.anInterface40_1 != null) {
			this.anInterface40_1.method30837();
		}
		if (this.anInterface40_2 != null) {
			this.anInterface40_2.method30837();
		}
		if (this.anInterface17_1 != null) {
			this.anInterface17_1.method30837();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class136 local89 = (Class136) this.aVector1.elementAt(local80);
			local89.method11216();
		}
	}

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "(Ljava/util/Vector;ILclient!li;)Z")
	boolean method28867(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class136 arg2) {
		if (!arg2.method11183() && !arg2.method11199()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11184(this.anInt4573, this.anInt4574);
		@Pc(18) int local18 = arg2.method11192();
		if (local18 > this.anInt4577) {
			this.anInt4577 = local18;
		}
		arg2.aBoolean236 = true;
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(Lclient!li;)V")
	void method28868(@OriginalArg(0) Class136 arg0) {
		arg0.method11216();
		arg0.aBoolean236 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lclient!li;)V")
	void method28869(@OriginalArg(0) Class136 arg0) {
		arg0.method11216();
		arg0.aBoolean236 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "ax", descriptor = "(I)Lclient!li;")
	Class136 method28870(@OriginalArg(0) int arg0) {
		return (Class136) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "(Lclient!li;)V")
	void method28871(@OriginalArg(0) Class136 arg0) {
		arg0.method11216();
		arg0.aBoolean236 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "ai", descriptor = "()Z")
	boolean method28872() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class136) this.aVector1.elementAt(local5)).method11195()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "()V")
	void method28873() {
		if (this.anInterface38_18 != null) {
			return;
		}
		this.anInterface38_18 = this.aClass102_Sub1_37.method21239(false);
		this.anInterface38_18.method29327(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass102_Sub1_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface38_18.method29383(0, local19.position(), this.aClass102_Sub1_37.aLong168);
		this.aClass135_23 = this.aClass102_Sub1_37.method21248(new Class397[] { new Class397(Class400.aClass400_4) });
	}

	@OriginalMember(owner = "client!lp", name = "ao", descriptor = "(IIII)Z")
	boolean method28874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aVector1.isEmpty() || this.method28851()) {
			return true;
		}
		if (this.anInt4573 != arg2 || this.anInt4574 != arg3 || this.aClass102_Sub1_37.anInt2994 != this.anInt4578) {
			this.anInt4578 = this.aClass102_Sub1_37.anInt2994;
			this.anInt4573 = arg2;
			this.anInt4574 = arg3;
			this.method28855();
			this.method28847();
		}
		this.aClass108_Sub1_4.method23903(0, this.anInterface18_2);
		if (this.anInterface17_1 != null) {
			this.aClass108_Sub1_4.method23905(this.anInterface17_1);
		}
		if (this.aClass108_Sub1_5 == null) {
			this.aClass102_Sub1_37.method20684(this.aClass108_Sub1_4, 1043479480);
		} else {
			this.aClass108_Sub1_5.method23903(0, this.anInterface18_5);
			this.aClass108_Sub1_5.method23905(this.anInterface17_2);
			this.aClass102_Sub1_37.method20684(this.aClass108_Sub1_5, 748302235);
		}
		if (!this.aClass108_Sub1_4.method23897()) {
			this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_5 == null ? this.aClass108_Sub1_4 : this.aClass108_Sub1_5, (byte) 1);
			return false;
		}
		this.anInt4575 = arg0;
		this.anInt4576 = arg1;
		this.aClass102_Sub1_37.method20714(3, -16777216);
		this.aClass102_Sub1_37.method21237(15);
		this.aClass102_Sub1_37.method21460(0);
		this.aBoolean854 = true;
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "aj", descriptor = "(II)V")
	void method28875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean854) {
			return;
		}
		if (this.aClass108_Sub1_5 != null) {
			this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_5, (byte) 1);
			this.aClass102_Sub1_37.method20684(this.aClass108_Sub1_4, -497231414);
			this.aClass108_Sub1_5.method23898(0, 0, this.anInt4573, this.anInt4574, 0, 0, true, this.anInterface17_1 != null);
		}
		this.method28854(arg0, arg1);
		this.aBoolean854 = false;
	}

	@OriginalMember(owner = "client!lp", name = "ac", descriptor = "(II)V")
	void method28876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean854) {
			return;
		}
		if (this.aClass108_Sub1_5 != null) {
			this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_5, (byte) 1);
			this.aClass102_Sub1_37.method20684(this.aClass108_Sub1_4, 1305225952);
			this.aClass108_Sub1_5.method23898(0, 0, this.anInt4573, this.anInt4574, 0, 0, true, this.anInterface17_1 != null);
		}
		this.method28854(arg0, arg1);
		this.aBoolean854 = false;
	}

	@OriginalMember(owner = "client!lp", name = "ag", descriptor = "(II)V")
	void method28877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub1_37.method20712(true);
		this.aClass102_Sub1_37.method21259();
		this.aClass102_Sub1_37.method21235(0);
		this.aClass102_Sub1_37.method21297(1);
		this.aClass102_Sub1_37.method20877();
		this.aClass108_Sub1_4.method23905(null);
		this.aClass102_Sub1_37.method21270(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class136) this.aVector1.elementAt(local35)).method11195()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class136) this.aVector1.elementAt(local51)).method11195()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface40_2.method11713();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class136 local89 = (Class136) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method11190();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_4);
				} else if (local101) {
					this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_4, (byte) 1);
					this.aClass102_Sub1_37.method20986(this.anInt4575, this.anInt4576, this.anInt4575 + arg0, this.anInt4576 + arg1);
				} else {
					local103 = true;
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_2);
				}
				@Pc(155) Interface40 local155 = this.anInterface40_3;
				if (local105 == 0) {
					local155 = this.anInterface40_2;
				}
				local89.method11188(local105, this.aClass108_Sub1_4, local155, this.anInterface17_1, this.anInterface40_2, local101 && local105 == local92 - 1);
				this.method28849();
				local89.method11205(local105);
				if (local103) {
					this.anInterface40_2.method11713();
				}
				@Pc(194) Interface40 local194 = this.anInterface40_3;
				this.anInterface40_3 = this.anInterface40_1;
				this.anInterface40_1 = local194;
				@Pc(204) Interface18 local204 = this.anInterface18_3;
				this.anInterface18_3 = this.anInterface18_4;
				this.anInterface18_4 = local204;
			}
		}
		this.aClass102_Sub1_37.method21235(1);
		this.aClass102_Sub1_37.method21297(0);
		this.aClass102_Sub1_37.method20712(false);
		this.aClass102_Sub1_37.method20877();
		local33 = null;
	}

	@OriginalMember(owner = "client!lp", name = "ab", descriptor = "(II)V")
	void method28878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub1_37.method20712(true);
		this.aClass102_Sub1_37.method21259();
		this.aClass102_Sub1_37.method21235(0);
		this.aClass102_Sub1_37.method21297(1);
		this.aClass102_Sub1_37.method20877();
		this.aClass108_Sub1_4.method23905(null);
		this.aClass102_Sub1_37.method21270(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class136) this.aVector1.elementAt(local35)).method11195()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class136) this.aVector1.elementAt(local51)).method11195()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface40_2.method11713();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class136 local89 = (Class136) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method11190();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_4);
				} else if (local101) {
					this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_4, (byte) 1);
					this.aClass102_Sub1_37.method20986(this.anInt4575, this.anInt4576, this.anInt4575 + arg0, this.anInt4576 + arg1);
				} else {
					local103 = true;
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_2);
				}
				@Pc(155) Interface40 local155 = this.anInterface40_3;
				if (local105 == 0) {
					local155 = this.anInterface40_2;
				}
				local89.method11188(local105, this.aClass108_Sub1_4, local155, this.anInterface17_1, this.anInterface40_2, local101 && local105 == local92 - 1);
				this.method28849();
				local89.method11205(local105);
				if (local103) {
					this.anInterface40_2.method11713();
				}
				@Pc(194) Interface40 local194 = this.anInterface40_3;
				this.anInterface40_3 = this.anInterface40_1;
				this.anInterface40_1 = local194;
				@Pc(204) Interface18 local204 = this.anInterface18_3;
				this.anInterface18_3 = this.anInterface18_4;
				this.anInterface18_4 = local204;
			}
		}
		this.aClass102_Sub1_37.method21235(1);
		this.aClass102_Sub1_37.method21297(0);
		this.aClass102_Sub1_37.method20712(false);
		this.aClass102_Sub1_37.method20877();
		local33 = null;
	}

	@OriginalMember(owner = "client!lp", name = "al", descriptor = "(II)V")
	void method28879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub1_37.method20712(true);
		this.aClass102_Sub1_37.method21259();
		this.aClass102_Sub1_37.method21235(0);
		this.aClass102_Sub1_37.method21297(1);
		this.aClass102_Sub1_37.method20877();
		this.aClass108_Sub1_4.method23905(null);
		this.aClass102_Sub1_37.method21270(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class136) this.aVector1.elementAt(local35)).method11195()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class136) this.aVector1.elementAt(local51)).method11195()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface40_2.method11713();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class136 local89 = (Class136) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method11190();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_4);
				} else if (local101) {
					this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_4, (byte) 1);
					this.aClass102_Sub1_37.method20986(this.anInt4575, this.anInt4576, this.anInt4575 + arg0, this.anInt4576 + arg1);
				} else {
					local103 = true;
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_2);
				}
				@Pc(155) Interface40 local155 = this.anInterface40_3;
				if (local105 == 0) {
					local155 = this.anInterface40_2;
				}
				local89.method11188(local105, this.aClass108_Sub1_4, local155, this.anInterface17_1, this.anInterface40_2, local101 && local105 == local92 - 1);
				this.method28849();
				local89.method11205(local105);
				if (local103) {
					this.anInterface40_2.method11713();
				}
				@Pc(194) Interface40 local194 = this.anInterface40_3;
				this.anInterface40_3 = this.anInterface40_1;
				this.anInterface40_1 = local194;
				@Pc(204) Interface18 local204 = this.anInterface18_3;
				this.anInterface18_3 = this.anInterface18_4;
				this.anInterface18_4 = local204;
			}
		}
		this.aClass102_Sub1_37.method21235(1);
		this.aClass102_Sub1_37.method21297(0);
		this.aClass102_Sub1_37.method20712(false);
		this.aClass102_Sub1_37.method20877();
		local33 = null;
	}

	@OriginalMember(owner = "client!lp", name = "ah", descriptor = "(II)V")
	void method28880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub1_37.method20712(true);
		this.aClass102_Sub1_37.method21259();
		this.aClass102_Sub1_37.method21235(0);
		this.aClass102_Sub1_37.method21297(1);
		this.aClass102_Sub1_37.method20877();
		this.aClass108_Sub1_4.method23905(null);
		this.aClass102_Sub1_37.method21270(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class136) this.aVector1.elementAt(local35)).method11195()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class136) this.aVector1.elementAt(local51)).method11195()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface40_2.method11713();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class136 local89 = (Class136) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method11190();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_4);
				} else if (local101) {
					this.aClass102_Sub1_37.method20887(this.aClass108_Sub1_4, (byte) 1);
					this.aClass102_Sub1_37.method20986(this.anInt4575, this.anInt4576, this.anInt4575 + arg0, this.anInt4576 + arg1);
				} else {
					local103 = true;
					this.aClass108_Sub1_4.method23903(0, this.anInterface18_2);
				}
				@Pc(155) Interface40 local155 = this.anInterface40_3;
				if (local105 == 0) {
					local155 = this.anInterface40_2;
				}
				local89.method11188(local105, this.aClass108_Sub1_4, local155, this.anInterface17_1, this.anInterface40_2, local101 && local105 == local92 - 1);
				this.method28849();
				local89.method11205(local105);
				if (local103) {
					this.anInterface40_2.method11713();
				}
				@Pc(194) Interface40 local194 = this.anInterface40_3;
				this.anInterface40_3 = this.anInterface40_1;
				this.anInterface40_1 = local194;
				@Pc(204) Interface18 local204 = this.anInterface18_3;
				this.anInterface18_3 = this.anInterface18_4;
				this.anInterface18_4 = local204;
			}
		}
		this.aClass102_Sub1_37.method21235(1);
		this.aClass102_Sub1_37.method21297(0);
		this.aClass102_Sub1_37.method20712(false);
		this.aClass102_Sub1_37.method20877();
		local33 = null;
	}

	@OriginalMember(owner = "client!lp", name = "af", descriptor = "()V")
	void method28881() {
		if (this.aClass108_Sub1_5 != null) {
			this.aClass108_Sub1_5.method24046();
			this.aClass108_Sub1_5 = null;
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method30837();
			this.anInterface18_5 = null;
		}
		if (this.anInterface17_2 != null) {
			this.anInterface17_2.method30837();
			this.anInterface17_2 = null;
		}
		if (this.aClass108_Sub1_4 != null) {
			this.aClass108_Sub1_4.method24046();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method30837();
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method30837();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method30837();
		}
		if (this.anInterface40_3 != null) {
			this.anInterface40_3.method30837();
		}
		if (this.anInterface40_1 != null) {
			this.anInterface40_1.method30837();
		}
		if (this.anInterface40_2 != null) {
			this.anInterface40_2.method30837();
		}
		if (this.anInterface17_1 != null) {
			this.anInterface17_1.method30837();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class136 local89 = (Class136) this.aVector1.elementAt(local80);
			local89.method11216();
		}
	}

	@OriginalMember(owner = "client!lp", name = "am", descriptor = "()V")
	void method28882() {
		if (this.aClass108_Sub1_5 != null) {
			this.aClass108_Sub1_5.method24046();
			this.aClass108_Sub1_5 = null;
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method30837();
			this.anInterface18_5 = null;
		}
		if (this.anInterface17_2 != null) {
			this.anInterface17_2.method30837();
			this.anInterface17_2 = null;
		}
		if (this.aClass108_Sub1_4 != null) {
			this.aClass108_Sub1_4.method24046();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method30837();
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method30837();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method30837();
		}
		if (this.anInterface40_3 != null) {
			this.anInterface40_3.method30837();
		}
		if (this.anInterface40_1 != null) {
			this.anInterface40_1.method30837();
		}
		if (this.anInterface40_2 != null) {
			this.anInterface40_2.method30837();
		}
		if (this.anInterface17_1 != null) {
			this.anInterface17_1.method30837();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class136 local89 = (Class136) this.aVector1.elementAt(local80);
			local89.method11216();
		}
	}

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "()V")
	void method28883() {
		if (this.anInterface38_18 != null) {
			return;
		}
		this.anInterface38_18 = this.aClass102_Sub1_37.method21239(false);
		this.anInterface38_18.method29327(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass102_Sub1_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface38_18.method29383(0, local19.position(), this.aClass102_Sub1_37.aLong168);
		this.aClass135_23 = this.aClass102_Sub1_37.method21248(new Class397[] { new Class397(Class400.aClass400_4) });
	}
}
