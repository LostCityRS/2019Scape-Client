package com.jagex;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alg")
public final class Class158_Sub1 extends Class158 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!alg", name = "dt", descriptor = "I")
	static final int anInt1879 = 128;

	@OriginalMember(owner = "client!alg", name = "da", descriptor = "I")
	static final int anInt1880 = 112;

	@OriginalMember(owner = "client!alg", name = "dq", descriptor = "[I")
	static int[] anIntArray183 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!alg", name = "dm", descriptor = "Ljava/awt/Component;")
	Component aComponent2;

	@OriginalMember(owner = "client!alg", name = "do", descriptor = "Lclient!aat;")
	Class22 aClass22_25 = new Class22();

	@OriginalMember(owner = "client!alg", name = "dz", descriptor = "Lclient!aat;")
	Class22 aClass22_26 = new Class22();

	@OriginalMember(owner = "client!alg", name = "dv", descriptor = "[Z")
	boolean[] aBooleanArray10 = new boolean[112];

	@OriginalMember(owner = "client!alg", name = "g", descriptor = "()V", line = 20)
	static void method14314() {
		anIntArray183[44] = 71;
		anIntArray183[45] = 26;
		anIntArray183[46] = 72;
		anIntArray183[47] = 73;
		anIntArray183[59] = 57;
		anIntArray183[61] = 27;
		anIntArray183[91] = 42;
		anIntArray183[92] = 74;
		anIntArray183[93] = 43;
		anIntArray183[192] = 28;
		anIntArray183[222] = 58;
		anIntArray183[520] = 59;
	}

	@OriginalMember(owner = "client!alg", name = "a", descriptor = "()V", line = 20)
	static void method14315() {
		anIntArray183[44] = 71;
		anIntArray183[45] = 26;
		anIntArray183[46] = 72;
		anIntArray183[47] = 73;
		anIntArray183[59] = 57;
		anIntArray183[61] = 27;
		anIntArray183[91] = 42;
		anIntArray183[92] = 74;
		anIntArray183[93] = 43;
		anIntArray183[192] = 28;
		anIntArray183[222] = 58;
		anIntArray183[520] = 59;
	}

	@OriginalMember(owner = "client!alg", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 34)
	Class158_Sub1(@OriginalArg(0) Component arg0) {
		Class69.method1207(-1247568603);
		this.method14316(arg0, -1494715770);
	}

	@OriginalMember(owner = "client!alg", name = "y", descriptor = "(Ljava/awt/Component;I)V", line = 40)
	void method14316(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1) {
		this.method14320(1533152419);
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!alg", name = "t", descriptor = "(Ljava/awt/Component;)V", line = 40)
	void method14317(@OriginalArg(0) Component arg0) {
		this.method14320(1602256289);
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!alg", name = "j", descriptor = "(Ljava/awt/Component;)V", line = 40)
	void method14318(@OriginalArg(0) Component arg0) {
		this.method14320(1131582053);
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!alg", name = "i", descriptor = "(Ljava/awt/Component;)V", line = 40)
	void method14319(@OriginalArg(0) Component arg0) {
		this.method14320(1051719246);
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!alg", name = "q", descriptor = "(I)V", line = 47)
	void method14320(@OriginalArg(0) int arg0) {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(17) int local17 = 0; local17 < 112; local17++) {
			this.aBooleanArray10[local17] = false;
		}
		this.aClass22_25.method405(-2037259486);
		this.aClass22_26.method405(-2037259486);
	}

	@OriginalMember(owner = "client!alg", name = "ae", descriptor = "()V", line = 47)
	void method14321() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(17) int local17 = 0; local17 < 112; local17++) {
			this.aBooleanArray10[local17] = false;
		}
		this.aClass22_25.method405(-2037259486);
		this.aClass22_26.method405(-2037259486);
	}

	@OriginalMember(owner = "client!alg", name = "x", descriptor = "(ICII)V", line = 57)
	void method14322(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class93_Sub21 local3 = new Class93_Sub21();
		local3.anInt1567 = arg0 * -977824477;
		local3.aChar11 = arg1;
		local3.anInt1566 = arg2 * -1326775711;
		local3.aLong81 = Class305.method26797(1435302449) * -2066611411765807963L;
		this.aClass22_26.method408(local3, 186770632);
	}

	@OriginalMember(owner = "client!alg", name = "ah", descriptor = "(ICI)V", line = 57)
	void method14323(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class93_Sub21 local3 = new Class93_Sub21();
		local3.anInt1567 = arg0 * -977824477;
		local3.aChar11 = arg1;
		local3.anInt1566 = arg2 * -1326775711;
		local3.aLong81 = Class305.method26797(-81025286) * -2066611411765807963L;
		this.aClass22_26.method408(local3, -1373104856);
	}

	@OriginalMember(owner = "client!alg", name = "ag", descriptor = "(ICI)V", line = 57)
	void method14324(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class93_Sub21 local3 = new Class93_Sub21();
		local3.anInt1567 = arg0 * -977824477;
		local3.aChar11 = arg1;
		local3.anInt1566 = arg2 * -1326775711;
		local3.aLong81 = Class305.method26797(1297040953) * -2066611411765807963L;
		this.aClass22_26.method408(local3, -31027565);
	}

	@OriginalMember(owner = "client!alg", name = "k", descriptor = "(I)Lclient!ut;", line = 66)
	@Override
	public Interface66 method14309(@OriginalArg(0) int arg0) {
		return (Interface66) this.aClass22_25.method415(742291621);
	}

	@OriginalMember(owner = "client!alg", name = "w", descriptor = "()Lclient!ut;", line = 66)
	@Override
	public Interface66 method14306() {
		return (Interface66) this.aClass22_25.method415(742291621);
	}

	@OriginalMember(owner = "client!alg", name = "m", descriptor = "(II)Z", line = 70)
	@Override
	public boolean method14313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray10[arg0] : false;
	}

	@OriginalMember(owner = "client!alg", name = "u", descriptor = "(I)Z", line = 70)
	@Override
	public boolean method14308(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray10[arg0] : false;
	}

	@OriginalMember(owner = "client!alg", name = "l", descriptor = "(I)Z", line = 70)
	@Override
	public boolean method14307(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray10[arg0] : false;
	}

	@OriginalMember(owner = "client!alg", name = "n", descriptor = "(I)V", line = 75)
	@Override
	public synchronized void method14304(@OriginalArg(0) int arg0) {
		this.aClass22_25.method405(-2037259486);
		for (@Pc(9) Class93_Sub21 local9 = (Class93_Sub21) this.aClass22_26.method415(742291621); local9 != null; local9 = (Class93_Sub21) this.aClass22_26.method415(742291621)) {
			local9.anInt1568 = this.method14325(1642387235) * -781713471;
			if (local9.anInt1567 * 1729446539 == 0) {
				if (!this.aBooleanArray10[local9.anInt1566 * -2063261279]) {
					@Pc(35) Class93_Sub21 local35 = new Class93_Sub21();
					local35.anInt1567 = 0;
					local35.aChar11 = (char) 65535;
					local35.anInt1566 = local9.anInt1566;
					local35.aLong81 = local9.aLong81;
					local35.anInt1568 = local9.anInt1568;
					this.aClass22_25.method408(local35, -463378261);
					this.aBooleanArray10[local9.anInt1566 * -2063261279] = true;
				}
				local9.anInt1567 = -1955648954;
				this.aClass22_25.method408(local9, 320129205);
			} else if (local9.anInt1567 * 1729446539 == 1) {
				if (this.aBooleanArray10[local9.anInt1566 * -2063261279]) {
					this.aClass22_25.method408(local9, -640690954);
					this.aBooleanArray10[local9.anInt1566 * -2063261279] = false;
				}
			} else if (local9.anInt1567 * 1729446539 == -1) {
				for (@Pc(117) int local117 = 0; local117 < 112; local117++) {
					if (this.aBooleanArray10[local117]) {
						@Pc(129) Class93_Sub21 local129 = new Class93_Sub21();
						local129.anInt1567 = -977824477;
						local129.aChar11 = (char) 65535;
						local129.anInt1566 = local117 * -1326775711;
						local129.aLong81 = local9.aLong81;
						local129.anInt1568 = local9.anInt1568;
						this.aClass22_25.method408(local129, 110433918);
						this.aBooleanArray10[local117] = false;
					}
				}
			} else if (local9.anInt1567 * 1729446539 == 3) {
				this.aClass22_25.method408(local9, -1056137661);
			}
		}
	}

	@OriginalMember(owner = "client!alg", name = "p", descriptor = "()V", line = 75)
	@Override
	public synchronized void method14310() {
		this.aClass22_25.method405(-2037259486);
		for (@Pc(9) Class93_Sub21 local9 = (Class93_Sub21) this.aClass22_26.method415(742291621); local9 != null; local9 = (Class93_Sub21) this.aClass22_26.method415(742291621)) {
			local9.anInt1568 = this.method14325(1823189843) * -781713471;
			if (local9.anInt1567 * 1729446539 == 0) {
				if (!this.aBooleanArray10[local9.anInt1566 * -2063261279]) {
					@Pc(35) Class93_Sub21 local35 = new Class93_Sub21();
					local35.anInt1567 = 0;
					local35.aChar11 = (char) 65535;
					local35.anInt1566 = local9.anInt1566;
					local35.aLong81 = local9.aLong81;
					local35.anInt1568 = local9.anInt1568;
					this.aClass22_25.method408(local35, -572076775);
					this.aBooleanArray10[local9.anInt1566 * -2063261279] = true;
				}
				local9.anInt1567 = -1955648954;
				this.aClass22_25.method408(local9, -1035070605);
			} else if (local9.anInt1567 * 1729446539 == 1) {
				if (this.aBooleanArray10[local9.anInt1566 * -2063261279]) {
					this.aClass22_25.method408(local9, -1373326339);
					this.aBooleanArray10[local9.anInt1566 * -2063261279] = false;
				}
			} else if (local9.anInt1567 * 1729446539 == -1) {
				for (@Pc(117) int local117 = 0; local117 < 112; local117++) {
					if (this.aBooleanArray10[local117]) {
						@Pc(129) Class93_Sub21 local129 = new Class93_Sub21();
						local129.anInt1567 = -977824477;
						local129.aChar11 = (char) 65535;
						local129.anInt1566 = local117 * -1326775711;
						local129.aLong81 = local9.aLong81;
						local129.anInt1568 = local9.anInt1568;
						this.aClass22_25.method408(local129, -548383767);
						this.aBooleanArray10[local117] = false;
					}
				}
			} else if (local9.anInt1567 * 1729446539 == 3) {
				this.aClass22_25.method408(local9, -1878961678);
			}
		}
	}

	@OriginalMember(owner = "client!alg", name = "z", descriptor = "()V", line = 75)
	@Override
	public synchronized void method14311() {
		this.aClass22_25.method405(-2037259486);
		for (@Pc(9) Class93_Sub21 local9 = (Class93_Sub21) this.aClass22_26.method415(742291621); local9 != null; local9 = (Class93_Sub21) this.aClass22_26.method415(742291621)) {
			local9.anInt1568 = this.method14325(1841966690) * -781713471;
			if (local9.anInt1567 * 1729446539 == 0) {
				if (!this.aBooleanArray10[local9.anInt1566 * -2063261279]) {
					@Pc(35) Class93_Sub21 local35 = new Class93_Sub21();
					local35.anInt1567 = 0;
					local35.aChar11 = (char) 65535;
					local35.anInt1566 = local9.anInt1566;
					local35.aLong81 = local9.aLong81;
					local35.anInt1568 = local9.anInt1568;
					this.aClass22_25.method408(local35, -1348725971);
					this.aBooleanArray10[local9.anInt1566 * -2063261279] = true;
				}
				local9.anInt1567 = -1955648954;
				this.aClass22_25.method408(local9, -1715133161);
			} else if (local9.anInt1567 * 1729446539 == 1) {
				if (this.aBooleanArray10[local9.anInt1566 * -2063261279]) {
					this.aClass22_25.method408(local9, -454336721);
					this.aBooleanArray10[local9.anInt1566 * -2063261279] = false;
				}
			} else if (local9.anInt1567 * 1729446539 == -1) {
				for (@Pc(117) int local117 = 0; local117 < 112; local117++) {
					if (this.aBooleanArray10[local117]) {
						@Pc(129) Class93_Sub21 local129 = new Class93_Sub21();
						local129.anInt1567 = -977824477;
						local129.aChar11 = (char) 65535;
						local129.anInt1566 = local117 * -1326775711;
						local129.aLong81 = local9.aLong81;
						local129.anInt1568 = local9.anInt1568;
						this.aClass22_25.method408(local129, -1896930006);
						this.aBooleanArray10[local117] = false;
					}
				}
			} else if (local9.anInt1567 * 1729446539 == 3) {
				this.aClass22_25.method408(local9, -22336585);
			}
		}
	}

	@OriginalMember(owner = "client!alg", name = "b", descriptor = "(I)I", line = 119)
	int method14325(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray10[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray10[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray10[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!alg", name = "al", descriptor = "()I", line = 119)
	int method14326() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray10[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray10[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray10[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!alg", name = "ai", descriptor = "()I", line = 119)
	int method14327() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray10[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray10[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray10[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!alg", name = "aw", descriptor = "()I", line = 119)
	int method14328() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray10[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray10[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray10[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!alg", name = "ac", descriptor = "()I", line = 119)
	int method14329() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray10[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray10[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray10[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!alg", name = "d", descriptor = "()V", line = 127)
	@Override
	public void method14303() {
		this.method14320(1593477463);
	}

	@OriginalMember(owner = "client!alg", name = "f", descriptor = "(I)V", line = 127)
	@Override
	public void method14305(@OriginalArg(0) int arg0) {
		this.method14320(1682380290);
	}

	@OriginalMember(owner = "client!alg", name = "c", descriptor = "()V", line = 127)
	@Override
	public void method14312() {
		this.method14320(1772698729);
	}

	@OriginalMember(owner = "client!alg", name = "h", descriptor = "(Ljava/awt/event/KeyEvent;II)V", line = 131)
	void method14330(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray183.length) {
			local2 = anIntArray183[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method14322(arg1, (char) 65535, local2, 2147329167);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alg", name = "at", descriptor = "(Ljava/awt/event/KeyEvent;I)V", line = 131)
	void method14331(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray183.length) {
			local2 = anIntArray183[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method14322(arg1, (char) 65535, local2, 707332220);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alg", name = "as", descriptor = "(Ljava/awt/event/KeyEvent;I)V", line = 131)
	void method14332(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray183.length) {
			local2 = anIntArray183[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method14322(arg1, (char) 65535, local2, 719931047);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alg", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 147)
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method14330(arg0, 0, -897277832);
	}

	@OriginalMember(owner = "client!alg", name = "ad", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 147)
	public synchronized void method14333(@OriginalArg(0) KeyEvent arg0) {
		this.method14330(arg0, 0, -971320105);
	}

	@OriginalMember(owner = "client!alg", name = "am", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 147)
	public synchronized void method14334(@OriginalArg(0) KeyEvent arg0) {
		this.method14330(arg0, 0, 345070280);
	}

	@OriginalMember(owner = "client!alg", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method14330(arg0, 1, -2061144337);
	}

	@OriginalMember(owner = "client!alg", name = "aq", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	public synchronized void method14335(@OriginalArg(0) KeyEvent arg0) {
		this.method14330(arg0, 1, -1795235997);
	}

	@OriginalMember(owner = "client!alg", name = "ax", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	public synchronized void method14336(@OriginalArg(0) KeyEvent arg0) {
		this.method14330(arg0, 1, -794488357);
	}

	@OriginalMember(owner = "client!alg", name = "ar", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	public synchronized void method14337(@OriginalArg(0) KeyEvent arg0) {
		this.method14330(arg0, 1, -1316477682);
	}

	@OriginalMember(owner = "client!alg", name = "ap", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	public synchronized void method14338(@OriginalArg(0) KeyEvent arg0) {
		this.method14330(arg0, 1, -768203490);
	}

	@OriginalMember(owner = "client!alg", name = "au", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 151)
	public synchronized void method14339(@OriginalArg(0) KeyEvent arg0) {
		this.method14330(arg0, 1, -1395219467);
	}

	@OriginalMember(owner = "client!alg", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != '\uffff' && Class630.method32268(local2, 2007670935)) {
			this.method14322(3, local2, -1, 1628662093);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alg", name = "av", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
	public synchronized void method14340(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != '\uffff' && Class630.method32268(local2, 286857915)) {
			this.method14322(3, local2, -1, 2093158964);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alg", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!alg", name = "cj", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 161)
	public void method14341(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!alg", name = "de", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
	public synchronized void method14342(@OriginalArg(0) FocusEvent arg0) {
		this.method14322(-1, '\u0000', 0, 650060350);
	}

	@OriginalMember(owner = "client!alg", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method14322(-1, '\u0000', 0, 1820834941);
	}

	@OriginalMember(owner = "client!alg", name = "dj", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 164)
	public synchronized void method14343(@OriginalArg(0) FocusEvent arg0) {
		this.method14322(-1, '\u0000', 0, 2065627317);
	}
}
