package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class404 {

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "Lclient!mo;")
	Interface42 anInterface42_1;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "Lclient!afq;")
	Class112_Sub1 aClass112_Sub1_4;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "Lclient!mo;")
	Interface42 anInterface42_2;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "Lclient!mo;")
	Interface42 anInterface42_3;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "Lclient!dp;")
	Interface18 anInterface18_2;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "Lclient!dp;")
	Interface18 anInterface18_3;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "Lclient!dp;")
	Interface18 anInterface18_4;

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Lclient!dw;")
	Interface19 anInterface19_1;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "Lclient!dp;")
	Interface18 anInterface18_5;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
	int anInt4847;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "Z")
	boolean aBoolean756;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "Lclient!dw;")
	Interface19 anInterface19_2;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "Lclient!lr;")
	Interface37 anInterface37_20;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "Lclient!lo;")
	Class145 aClass145_24;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "Lclient!afq;")
	Class112_Sub1 aClass112_Sub1_5;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
	int anInt4848 = 0;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "Ljava/util/Vector;")
	Vector aVector1 = new Vector();

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	int anInt4845 = 0;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	int anInt4849 = 0;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "Lclient!afc;")
	Class104_Sub2 aClass104_Sub2_37;

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "Lclient!dg;")
	Class226 aClass226_29;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	int anInt4846;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
	int anInt4844;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!afc;II)V")
	Class404(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass104_Sub2_37 = arg0;
		this.aClass226_29 = Class226.aClass226_22;
		this.anInt4846 = arg1;
		this.anInt4844 = arg2;
	}

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "()V")
	void method28699() {
		this.aClass104_Sub2_37.method21060(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21118(this.aClass145_24);
		this.aClass104_Sub2_37.method21017(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "()V")
	void method28700() {
		if (this.anInterface37_20 != null) {
			return;
		}
		this.anInterface37_20 = this.aClass104_Sub2_37.method21025(false);
		this.anInterface37_20.method29496(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass104_Sub2_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface37_20.method29514(0, local19.position(), this.aClass104_Sub2_37.aLong132);
		this.aClass145_24 = this.aClass104_Sub2_37.method21005(new Class400[] { new Class400(Class399.aClass399_3) });
	}

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "()V")
	void method28701() {
		this.aClass104_Sub2_37.method21060(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21118(this.aClass145_24);
		this.aClass104_Sub2_37.method21017(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "aq", descriptor = "(II)V")
	void method28702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub2_37.method20481(true);
		this.aClass104_Sub2_37.method21020();
		this.aClass104_Sub2_37.method20994(0);
		this.aClass104_Sub2_37.method20931(1);
		this.aClass104_Sub2_37.method20478();
		this.aClass112_Sub1_5.method23448(null);
		this.aClass104_Sub2_37.method20936(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class137) this.aVector1.elementAt(local35)).method11460()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class137) this.aVector1.elementAt(local51)).method11460()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface42_3.method11422();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class137 local89 = (Class137) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method11455();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass112_Sub1_5.method23446(0, this.anInterface18_3);
				} else if (local101) {
					this.aClass104_Sub2_37.method20454(this.aClass112_Sub1_5, -1497248091);
					this.aClass104_Sub2_37.method20479(this.anInt4847, this.anInt4848, this.anInt4847 + arg0, this.anInt4848 + arg1);
				} else {
					local103 = true;
					this.aClass112_Sub1_5.method23446(0, this.anInterface18_5);
				}
				@Pc(155) Interface42 local155 = this.anInterface42_1;
				if (local105 == 0) {
					local155 = this.anInterface42_3;
				}
				local89.method11453(local105, this.aClass112_Sub1_5, local155, this.anInterface19_1, this.anInterface42_3, local101 && local105 == local92 - 1);
				this.method28701();
				local89.method11454(local105);
				if (local103) {
					this.anInterface42_3.method11422();
				}
				@Pc(194) Interface42 local194 = this.anInterface42_1;
				this.anInterface42_1 = this.anInterface42_2;
				this.anInterface42_2 = local194;
				@Pc(204) Interface18 local204 = this.anInterface18_2;
				this.anInterface18_2 = this.anInterface18_3;
				this.anInterface18_3 = local204;
			}
		}
		this.aClass104_Sub2_37.method20994(1);
		this.aClass104_Sub2_37.method20931(0);
		this.aClass104_Sub2_37.method20481(false);
		this.aClass104_Sub2_37.method20478();
		local33 = null;
	}

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "(Lclient!lh;)Z")
	boolean method28703(@OriginalArg(0) Class137 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method11456() < this.method28737(local7).method11456()) {
				local5 = true;
				if (!this.method28708(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28737(local7));
		}
		if (local5 || this.method28708(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "(IIII)Z")
	boolean method28704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aVector1.isEmpty() || this.method28707()) {
			return true;
		}
		if (this.anInt4846 != arg2 || this.anInt4844 != arg3 || this.aClass104_Sub2_37.anInt2951 != this.anInt4849) {
			this.anInt4849 = this.aClass104_Sub2_37.anInt2951;
			this.anInt4846 = arg2;
			this.anInt4844 = arg3;
			this.method28711();
			this.method28712();
		}
		this.aClass112_Sub1_5.method23446(0, this.anInterface18_5);
		if (this.anInterface19_1 != null) {
			this.aClass112_Sub1_5.method23448(this.anInterface19_1);
		}
		if (this.aClass112_Sub1_4 == null) {
			this.aClass104_Sub2_37.method20453(this.aClass112_Sub1_5, (byte) 1);
		} else {
			this.aClass112_Sub1_4.method23446(0, this.anInterface18_4);
			this.aClass112_Sub1_4.method23448(this.anInterface19_2);
			this.aClass104_Sub2_37.method20453(this.aClass112_Sub1_4, (byte) 1);
		}
		if (!this.aClass112_Sub1_5.method23453()) {
			this.aClass104_Sub2_37.method20454(this.aClass112_Sub1_4 == null ? this.aClass112_Sub1_5 : this.aClass112_Sub1_4, -1497248091);
			return false;
		}
		this.anInt4847 = arg0;
		this.anInt4848 = arg1;
		this.aClass104_Sub2_37.method20786(3, -16777216);
		this.aClass104_Sub2_37.method20997(15);
		this.aClass104_Sub2_37.method20995(0);
		this.aBoolean756 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "ag", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z")
	boolean method28705(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4846, this.anInt4844);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4845) {
			this.anInt4845 = local18;
		}
		arg2.aBoolean257 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "ao", descriptor = "()V")
	void method28706() {
		if (this.aClass112_Sub1_4 != null) {
			this.aClass112_Sub1_4.method23750();
			this.aClass112_Sub1_4 = null;
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method31065();
			this.anInterface18_4 = null;
		}
		if (this.anInterface19_2 != null) {
			this.anInterface19_2.method31065();
			this.anInterface19_2 = null;
		}
		if (this.aClass112_Sub1_5 != null) {
			this.aClass112_Sub1_5.method23750();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method31065();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method31065();
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method31065();
		}
		if (this.anInterface42_1 != null) {
			this.anInterface42_1.method31065();
		}
		if (this.anInterface42_2 != null) {
			this.anInterface42_2.method31065();
		}
		if (this.anInterface42_3 != null) {
			this.anInterface42_3.method31065();
		}
		if (this.anInterface19_1 != null) {
			this.anInterface19_1.method31065();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class137 local89 = (Class137) this.aVector1.elementAt(local80);
			local89.method11451();
		}
	}

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "()Z")
	boolean method28707() {
		@Pc(3) int local3 = this.aVector1.size();
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			if (!((Class137) this.aVector1.elementAt(local5)).method11460()) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z")
	boolean method28708(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4846, this.anInt4844);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4845) {
			this.anInt4845 = local18;
		}
		arg2.aBoolean257 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "(II)V")
	void method28709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean756) {
			return;
		}
		if (this.aClass112_Sub1_4 != null) {
			this.aClass104_Sub2_37.method20454(this.aClass112_Sub1_4, -1497248091);
			this.aClass104_Sub2_37.method20453(this.aClass112_Sub1_5, (byte) 1);
			this.aClass112_Sub1_4.method23447(0, 0, this.anInt4846, this.anInt4844, 0, 0, true, this.anInterface19_1 != null);
		}
		this.method28739(arg0, arg1);
		this.aBoolean756 = false;
	}

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "(Lclient!lh;)V")
	void method28710(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean257 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "()V")
	void method28711() {
		if (this.aClass112_Sub1_4 != null) {
			this.aClass112_Sub1_4.method23750();
			this.aClass112_Sub1_4 = null;
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method31065();
			this.anInterface18_4 = null;
		}
		if (this.anInterface19_2 != null) {
			this.anInterface19_2.method31065();
			this.anInterface19_2 = null;
		}
		if (this.aClass112_Sub1_5 != null) {
			this.aClass112_Sub1_5.method23750();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method31065();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method31065();
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method31065();
		}
		if (this.anInterface42_1 != null) {
			this.anInterface42_1.method31065();
		}
		if (this.anInterface42_2 != null) {
			this.anInterface42_2.method31065();
		}
		if (this.anInterface42_3 != null) {
			this.anInterface42_3.method31065();
		}
		if (this.anInterface19_1 != null) {
			this.anInterface19_1.method31065();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class137 local89 = (Class137) this.aVector1.elementAt(local80);
			local89.method11451();
		}
	}

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "()V")
	void method28712() {
		this.method28700();
		switch(this.anInt4845) {
			case 0:
				this.aClass226_29 = Class226.aClass226_22;
				break;
			case 1:
				this.aClass226_29 = Class226.aClass226_24;
				break;
			case 2:
				this.aClass226_29 = Class226.aClass226_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass112_Sub1_5 = this.aClass104_Sub2_37.method20456();
		if (this.aClass104_Sub2_37.anInt2951 > 1 && this.aClass104_Sub2_37.aBoolean474 && this.aClass104_Sub2_37.aBoolean486) {
			this.aClass112_Sub1_4 = this.aClass104_Sub2_37.method20456();
			this.anInterface18_4 = this.aClass104_Sub2_37.method20457(this.anInt4846, this.anInt4844, Class206.aClass206_22, this.aClass226_29, this.aClass104_Sub2_37.anInt2951);
			this.anInterface19_2 = this.aClass104_Sub2_37.method20667(this.anInt4846, this.anInt4844, this.aClass104_Sub2_37.anInt2951);
		}
		this.anInterface42_1 = this.aClass104_Sub2_37.method21029(Class206.aClass206_22, this.aClass226_29, this.anInt4846, this.anInt4844);
		this.anInterface18_2 = this.anInterface42_1.method11381(0);
		this.anInterface42_2 = this.aClass104_Sub2_37.method21029(Class206.aClass206_22, this.aClass226_29, this.anInt4846, this.anInt4844);
		this.anInterface18_3 = this.anInterface42_2.method11381(0);
		this.anInterface42_3 = this.aClass104_Sub2_37.method21029(Class206.aClass206_22, this.aClass226_29, this.anInt4846, this.anInt4844);
		this.anInterface18_5 = this.anInterface42_3.method11381(0);
		this.anInterface19_1 = this.aClass104_Sub2_37.method20432(this.anInterface42_3.method11362(), this.anInterface42_3.method11340());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class137 local149 = (Class137) this.aVector1.elementAt(local140);
			local149.method11463(this.anInt4846, this.anInt4844);
		}
	}

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "()V")
	void method28713() {
		if (this.anInterface37_20 != null) {
			return;
		}
		this.anInterface37_20 = this.aClass104_Sub2_37.method21025(false);
		this.anInterface37_20.method29496(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass104_Sub2_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface37_20.method29514(0, local19.position(), this.aClass104_Sub2_37.aLong132);
		this.aClass145_24 = this.aClass104_Sub2_37.method21005(new Class400[] { new Class400(Class399.aClass399_3) });
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!lh;)Z")
	boolean method28714(@OriginalArg(0) Class137 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method11456() < this.method28737(local7).method11456()) {
				local5 = true;
				if (!this.method28708(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28737(local7));
		}
		if (local5 || this.method28708(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z")
	boolean method28715(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4846, this.anInt4844);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4845) {
			this.anInt4845 = local18;
		}
		arg2.aBoolean257 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "()V")
	void method28716() {
		this.aClass104_Sub2_37.method21060(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21118(this.aClass145_24);
		this.aClass104_Sub2_37.method21017(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "ap", descriptor = "(II)V")
	void method28717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean756) {
			return;
		}
		if (this.aClass112_Sub1_4 != null) {
			this.aClass104_Sub2_37.method20454(this.aClass112_Sub1_4, -1497248091);
			this.aClass104_Sub2_37.method20453(this.aClass112_Sub1_5, (byte) 1);
			this.aClass112_Sub1_4.method23447(0, 0, this.anInt4846, this.anInt4844, 0, 0, true, this.anInterface19_1 != null);
		}
		this.method28739(arg0, arg1);
		this.aBoolean756 = false;
	}

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "()V")
	void method28718() {
		this.method28700();
		switch(this.anInt4845) {
			case 0:
				this.aClass226_29 = Class226.aClass226_22;
				break;
			case 1:
				this.aClass226_29 = Class226.aClass226_24;
				break;
			case 2:
				this.aClass226_29 = Class226.aClass226_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass112_Sub1_5 = this.aClass104_Sub2_37.method20456();
		if (this.aClass104_Sub2_37.anInt2951 > 1 && this.aClass104_Sub2_37.aBoolean474 && this.aClass104_Sub2_37.aBoolean486) {
			this.aClass112_Sub1_4 = this.aClass104_Sub2_37.method20456();
			this.anInterface18_4 = this.aClass104_Sub2_37.method20457(this.anInt4846, this.anInt4844, Class206.aClass206_22, this.aClass226_29, this.aClass104_Sub2_37.anInt2951);
			this.anInterface19_2 = this.aClass104_Sub2_37.method20667(this.anInt4846, this.anInt4844, this.aClass104_Sub2_37.anInt2951);
		}
		this.anInterface42_1 = this.aClass104_Sub2_37.method21029(Class206.aClass206_22, this.aClass226_29, this.anInt4846, this.anInt4844);
		this.anInterface18_2 = this.anInterface42_1.method11381(0);
		this.anInterface42_2 = this.aClass104_Sub2_37.method21029(Class206.aClass206_22, this.aClass226_29, this.anInt4846, this.anInt4844);
		this.anInterface18_3 = this.anInterface42_2.method11381(0);
		this.anInterface42_3 = this.aClass104_Sub2_37.method21029(Class206.aClass206_22, this.aClass226_29, this.anInt4846, this.anInt4844);
		this.anInterface18_5 = this.anInterface42_3.method11381(0);
		this.anInterface19_1 = this.aClass104_Sub2_37.method20432(this.anInterface42_3.method11362(), this.anInterface42_3.method11340());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class137 local149 = (Class137) this.aVector1.elementAt(local140);
			local149.method11463(this.anInt4846, this.anInt4844);
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "()V")
	void method28719() {
		this.method28700();
		switch(this.anInt4845) {
			case 0:
				this.aClass226_29 = Class226.aClass226_22;
				break;
			case 1:
				this.aClass226_29 = Class226.aClass226_24;
				break;
			case 2:
				this.aClass226_29 = Class226.aClass226_19;
				break;
			default:
				throw new RuntimeException();
		}
		this.aClass112_Sub1_5 = this.aClass104_Sub2_37.method20456();
		if (this.aClass104_Sub2_37.anInt2951 > 1 && this.aClass104_Sub2_37.aBoolean474 && this.aClass104_Sub2_37.aBoolean486) {
			this.aClass112_Sub1_4 = this.aClass104_Sub2_37.method20456();
			this.anInterface18_4 = this.aClass104_Sub2_37.method20457(this.anInt4846, this.anInt4844, Class206.aClass206_22, this.aClass226_29, this.aClass104_Sub2_37.anInt2951);
			this.anInterface19_2 = this.aClass104_Sub2_37.method20667(this.anInt4846, this.anInt4844, this.aClass104_Sub2_37.anInt2951);
		}
		this.anInterface42_1 = this.aClass104_Sub2_37.method21029(Class206.aClass206_22, this.aClass226_29, this.anInt4846, this.anInt4844);
		this.anInterface18_2 = this.anInterface42_1.method11381(0);
		this.anInterface42_2 = this.aClass104_Sub2_37.method21029(Class206.aClass206_22, this.aClass226_29, this.anInt4846, this.anInt4844);
		this.anInterface18_3 = this.anInterface42_2.method11381(0);
		this.anInterface42_3 = this.aClass104_Sub2_37.method21029(Class206.aClass206_22, this.aClass226_29, this.anInt4846, this.anInt4844);
		this.anInterface18_5 = this.anInterface42_3.method11381(0);
		this.anInterface19_1 = this.aClass104_Sub2_37.method20432(this.anInterface42_3.method11362(), this.anInterface42_3.method11340());
		@Pc(138) int local138 = this.aVector1.size();
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			@Pc(149) Class137 local149 = (Class137) this.aVector1.elementAt(local140);
			local149.method11463(this.anInt4846, this.anInt4844);
		}
	}

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "(Lclient!lh;)Z")
	boolean method28720(@OriginalArg(0) Class137 arg0) {
		@Pc(3) Vector local3 = new Vector();
		@Pc(5) boolean local5 = false;
		for (@Pc(7) int local7 = 0; local7 < this.aVector1.size(); local7++) {
			if (!local5 && arg0.method11456() < this.method28737(local7).method11456()) {
				local5 = true;
				if (!this.method28708(local3, local3.size(), arg0)) {
					return false;
				}
			}
			local3.addElement(this.method28737(local7));
		}
		if (local5 || this.method28708(local3, local3.size(), arg0)) {
			this.aVector1 = local3;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "()V")
	void method28721() {
		if (this.anInterface37_20 != null) {
			return;
		}
		this.anInterface37_20 = this.aClass104_Sub2_37.method21025(false);
		this.anInterface37_20.method29496(12, 4);
		@Pc(19) ByteBuffer local19 = this.aClass104_Sub2_37.aByteBuffer7;
		local19.clear();
		local19.putFloat(0.0F);
		local19.putFloat(1.0F);
		local19.putFloat(2.0F);
		this.anInterface37_20.method29514(0, local19.position(), this.aClass104_Sub2_37.aLong132);
		this.aClass145_24 = this.aClass104_Sub2_37.method21005(new Class400[] { new Class400(Class399.aClass399_3) });
	}

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z")
	boolean method28722(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4846, this.anInt4844);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4845) {
			this.anInt4845 = local18;
		}
		arg2.aBoolean257 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "()V")
	void method28723() {
		this.aClass104_Sub2_37.method21060(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21118(this.aClass145_24);
		this.aClass104_Sub2_37.method21017(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z")
	boolean method28724(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4846, this.anInt4844);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4845) {
			this.anInt4845 = local18;
		}
		arg2.aBoolean257 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z")
	boolean method28725(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4846, this.anInt4844);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4845) {
			this.anInt4845 = local18;
		}
		arg2.aBoolean257 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "ae", descriptor = "(Ljava/util/Vector;ILclient!lh;)Z")
	boolean method28726(@OriginalArg(0) Vector arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2) {
		if (!arg2.method11448() && !arg2.method11461()) {
			return false;
		}
		arg0.insertElementAt(arg2, arg1);
		arg2.method11463(this.anInt4846, this.anInt4844);
		@Pc(18) int local18 = arg2.method11457();
		if (local18 > this.anInt4845) {
			this.anInt4845 = local18;
		}
		arg2.aBoolean257 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "()V")
	void method28727() {
		this.aClass104_Sub2_37.method21060(0, this.anInterface37_20);
		this.aClass104_Sub2_37.method21118(this.aClass145_24);
		this.aClass104_Sub2_37.method21017(Class424.aClass424_3, 0, 1);
	}

	@OriginalMember(owner = "client!ls", name = "ah", descriptor = "(Lclient!lh;)V")
	void method28728(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean257 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "al", descriptor = "(Lclient!lh;)V")
	void method28729(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean257 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "ac", descriptor = "(Lclient!lh;)V")
	void method28730(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean257 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "ai", descriptor = "(Lclient!lh;)V")
	void method28731(@OriginalArg(0) Class137 arg0) {
		arg0.method11451();
		arg0.aBoolean257 = false;
		this.aVector1.removeElement(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "aw", descriptor = "(I)Lclient!lh;")
	Class137 method28732(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "as", descriptor = "(I)Lclient!lh;")
	Class137 method28733(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "at", descriptor = "(I)Lclient!lh;")
	Class137 method28734(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "ad", descriptor = "(I)Lclient!lh;")
	Class137 method28735(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "am", descriptor = "(I)Lclient!lh;")
	Class137 method28736(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "(I)Lclient!lh;")
	Class137 method28737(@OriginalArg(0) int arg0) {
		return (Class137) this.aVector1.elementAt(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "ar", descriptor = "(II)V")
	void method28738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean756) {
			return;
		}
		if (this.aClass112_Sub1_4 != null) {
			this.aClass104_Sub2_37.method20454(this.aClass112_Sub1_4, -1497248091);
			this.aClass104_Sub2_37.method20453(this.aClass112_Sub1_5, (byte) 1);
			this.aClass112_Sub1_4.method23447(0, 0, this.anInt4846, this.anInt4844, 0, 0, true, this.anInterface19_1 != null);
		}
		this.method28739(arg0, arg1);
		this.aBoolean756 = false;
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(II)V")
	void method28739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub2_37.method20481(true);
		this.aClass104_Sub2_37.method21020();
		this.aClass104_Sub2_37.method20994(0);
		this.aClass104_Sub2_37.method20931(1);
		this.aClass104_Sub2_37.method20478();
		this.aClass112_Sub1_5.method23448(null);
		this.aClass104_Sub2_37.method20936(0, 0);
		@Pc(30) int local30 = this.aVector1.size();
		@Pc(33) Vector local33 = this.aVector1;
		@Pc(35) int local35;
		for (local35 = 0; local35 < local30; local35++) {
			if (((Class137) this.aVector1.elementAt(local35)).method11460()) {
				local33 = new Vector();
				for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
					if (!((Class137) this.aVector1.elementAt(local51)).method11460()) {
						local33.addElement(this.aVector1.elementAt(local51));
					}
				}
				local30 = local33.size();
				break;
			}
		}
		this.anInterface42_3.method11422();
		for (local35 = 0; local35 < local30; local35++) {
			@Pc(89) Class137 local89 = (Class137) local33.elementAt(local35);
			@Pc(92) int local92 = local89.method11455();
			@Pc(101) boolean local101 = local35 == local30 - 1;
			@Pc(103) boolean local103 = false;
			for (@Pc(105) int local105 = 0; local105 < local92; local105++) {
				if (local105 != local92 - 1) {
					this.aClass112_Sub1_5.method23446(0, this.anInterface18_3);
				} else if (local101) {
					this.aClass104_Sub2_37.method20454(this.aClass112_Sub1_5, -1497248091);
					this.aClass104_Sub2_37.method20479(this.anInt4847, this.anInt4848, this.anInt4847 + arg0, this.anInt4848 + arg1);
				} else {
					local103 = true;
					this.aClass112_Sub1_5.method23446(0, this.anInterface18_5);
				}
				@Pc(155) Interface42 local155 = this.anInterface42_1;
				if (local105 == 0) {
					local155 = this.anInterface42_3;
				}
				local89.method11453(local105, this.aClass112_Sub1_5, local155, this.anInterface19_1, this.anInterface42_3, local101 && local105 == local92 - 1);
				this.method28701();
				local89.method11454(local105);
				if (local103) {
					this.anInterface42_3.method11422();
				}
				@Pc(194) Interface42 local194 = this.anInterface42_1;
				this.anInterface42_1 = this.anInterface42_2;
				this.anInterface42_2 = local194;
				@Pc(204) Interface18 local204 = this.anInterface18_2;
				this.anInterface18_2 = this.anInterface18_3;
				this.anInterface18_3 = local204;
			}
		}
		this.aClass104_Sub2_37.method20994(1);
		this.aClass104_Sub2_37.method20931(0);
		this.aClass104_Sub2_37.method20481(false);
		this.aClass104_Sub2_37.method20478();
		local33 = null;
	}

	@OriginalMember(owner = "client!ls", name = "au", descriptor = "(IIII)Z")
	boolean method28740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aVector1.isEmpty() || this.method28707()) {
			return true;
		}
		if (this.anInt4846 != arg2 || this.anInt4844 != arg3 || this.aClass104_Sub2_37.anInt2951 != this.anInt4849) {
			this.anInt4849 = this.aClass104_Sub2_37.anInt2951;
			this.anInt4846 = arg2;
			this.anInt4844 = arg3;
			this.method28711();
			this.method28712();
		}
		this.aClass112_Sub1_5.method23446(0, this.anInterface18_5);
		if (this.anInterface19_1 != null) {
			this.aClass112_Sub1_5.method23448(this.anInterface19_1);
		}
		if (this.aClass112_Sub1_4 == null) {
			this.aClass104_Sub2_37.method20453(this.aClass112_Sub1_5, (byte) 1);
		} else {
			this.aClass112_Sub1_4.method23446(0, this.anInterface18_4);
			this.aClass112_Sub1_4.method23448(this.anInterface19_2);
			this.aClass104_Sub2_37.method20453(this.aClass112_Sub1_4, (byte) 1);
		}
		if (!this.aClass112_Sub1_5.method23453()) {
			this.aClass104_Sub2_37.method20454(this.aClass112_Sub1_4 == null ? this.aClass112_Sub1_5 : this.aClass112_Sub1_4, -1497248091);
			return false;
		}
		this.anInt4847 = arg0;
		this.anInt4848 = arg1;
		this.aClass104_Sub2_37.method20786(3, -16777216);
		this.aClass104_Sub2_37.method20997(15);
		this.aClass104_Sub2_37.method20995(0);
		this.aBoolean756 = true;
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "ax", descriptor = "()V")
	void method28741() {
		if (this.aClass112_Sub1_4 != null) {
			this.aClass112_Sub1_4.method23750();
			this.aClass112_Sub1_4 = null;
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method31065();
			this.anInterface18_4 = null;
		}
		if (this.anInterface19_2 != null) {
			this.anInterface19_2.method31065();
			this.anInterface19_2 = null;
		}
		if (this.aClass112_Sub1_5 != null) {
			this.aClass112_Sub1_5.method23750();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method31065();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method31065();
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method31065();
		}
		if (this.anInterface42_1 != null) {
			this.anInterface42_1.method31065();
		}
		if (this.anInterface42_2 != null) {
			this.anInterface42_2.method31065();
		}
		if (this.anInterface42_3 != null) {
			this.anInterface42_3.method31065();
		}
		if (this.anInterface19_1 != null) {
			this.anInterface19_1.method31065();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class137 local89 = (Class137) this.aVector1.elementAt(local80);
			local89.method11451();
		}
	}

	@OriginalMember(owner = "client!ls", name = "av", descriptor = "()V")
	void method28742() {
		if (this.aClass112_Sub1_4 != null) {
			this.aClass112_Sub1_4.method23750();
			this.aClass112_Sub1_4 = null;
		}
		if (this.anInterface18_4 != null) {
			this.anInterface18_4.method31065();
			this.anInterface18_4 = null;
		}
		if (this.anInterface19_2 != null) {
			this.anInterface19_2.method31065();
			this.anInterface19_2 = null;
		}
		if (this.aClass112_Sub1_5 != null) {
			this.aClass112_Sub1_5.method23750();
		}
		if (this.anInterface18_2 != null) {
			this.anInterface18_2.method31065();
		}
		if (this.anInterface18_3 != null) {
			this.anInterface18_3.method31065();
		}
		if (this.anInterface18_5 != null) {
			this.anInterface18_5.method31065();
		}
		if (this.anInterface42_1 != null) {
			this.anInterface42_1.method31065();
		}
		if (this.anInterface42_2 != null) {
			this.anInterface42_2.method31065();
		}
		if (this.anInterface42_3 != null) {
			this.anInterface42_3.method31065();
		}
		if (this.anInterface19_1 != null) {
			this.anInterface19_1.method31065();
		}
		@Pc(78) int local78 = this.aVector1.size();
		for (@Pc(80) int local80 = 0; local80 < local78; local80++) {
			@Pc(89) Class137 local89 = (Class137) this.aVector1.elementAt(local80);
			local89.method11451();
		}
	}
}
