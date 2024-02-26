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

@OriginalClass("client!alj")
public final class Class155_Sub1 extends Class155 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!alj", name = "dc", descriptor = "I")
	static final int anInt1940 = 128;

	@OriginalMember(owner = "client!alj", name = "dd", descriptor = "I")
	static final int anInt1941 = 112;

	@OriginalMember(owner = "client!alj", name = "dt", descriptor = "[I")
	static int[] anIntArray196 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!alj", name = "db", descriptor = "Ljava/awt/Component;")
	Component aComponent2;

	@OriginalMember(owner = "client!alj", name = "dn", descriptor = "Lclient!aag;")
	Class8 aClass8_25 = new Class8();

	@OriginalMember(owner = "client!alj", name = "df", descriptor = "Lclient!aag;")
	Class8 aClass8_26 = new Class8();

	@OriginalMember(owner = "client!alj", name = "dl", descriptor = "[Z")
	boolean[] aBooleanArray9 = new boolean[112];

	@OriginalMember(owner = "client!alj", name = "d", descriptor = "()V")
	static void method15073() {
		anIntArray196[44] = 71;
		anIntArray196[45] = 26;
		anIntArray196[46] = 72;
		anIntArray196[47] = 73;
		anIntArray196[59] = 57;
		anIntArray196[61] = 27;
		anIntArray196[91] = 42;
		anIntArray196[92] = 74;
		anIntArray196[93] = 43;
		anIntArray196[192] = 28;
		anIntArray196[222] = 58;
		anIntArray196[520] = 59;
	}

	@OriginalMember(owner = "client!alj", name = "z", descriptor = "()V")
	static void method15074() {
		anIntArray196[44] = 71;
		anIntArray196[45] = 26;
		anIntArray196[46] = 72;
		anIntArray196[47] = 73;
		anIntArray196[59] = 57;
		anIntArray196[61] = 27;
		anIntArray196[91] = 42;
		anIntArray196[92] = 74;
		anIntArray196[93] = 43;
		anIntArray196[192] = 28;
		anIntArray196[222] = 58;
		anIntArray196[520] = 59;
	}

	@OriginalMember(owner = "client!alj", name = "nh", descriptor = "(Lclient!yp;B)V")
	static void method15103(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class325.method27628(local11, local14, arg0, 1789567103);
	}

	@OriginalMember(owner = "client!alj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	Class155_Sub1(@OriginalArg(0) Component arg0) {
		Class138.method11538(1471850439);
		this.method15065(arg0, 2058028570);
	}

	@OriginalMember(owner = "client!alj", name = "ae", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15061(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != '\uffff' && Class449.method29265(local2, -1558390293)) {
			this.method15064(3, local2, -1, 578293528);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "ay", descriptor = "(ICI)V")
	void method15062(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class80_Sub15 local3 = new Class80_Sub15();
		local3.anInt1561 = arg0 * 1858616291;
		local3.aChar11 = arg1;
		local3.anInt1563 = arg2 * 1110445449;
		local3.aLong89 = Class303.method27111((byte) 66) * 4790344457956539703L;
		this.aClass8_26.method232(local3, 1598238085);
	}

	@OriginalMember(owner = "client!alj", name = "w", descriptor = "(B)V")
	void method15063(@OriginalArg(0) byte arg0) {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(16) int local16 = 0; local16 < 112; local16++) {
			this.aBooleanArray9[local16] = false;
		}
		this.aClass8_25.method260(397441719);
		this.aClass8_26.method260(296504004);
	}

	@OriginalMember(owner = "client!alj", name = "r", descriptor = "(ICII)V")
	void method15064(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class80_Sub15 local3 = new Class80_Sub15();
		local3.anInt1561 = arg0 * 1858616291;
		local3.aChar11 = arg1;
		local3.anInt1563 = arg2 * 1110445449;
		local3.aLong89 = Class303.method27111((byte) 92) * 4790344457956539703L;
		this.aClass8_26.method232(local3, 12549465);
	}

	@OriginalMember(owner = "client!alj", name = "u", descriptor = "(I)Lclient!ua;")
	@Override
	public Interface63 method15053(@OriginalArg(0) int arg0) {
		return (Interface63) this.aClass8_25.method233(-31808074);
	}

	@OriginalMember(owner = "client!alj", name = "e", descriptor = "(IS)Z")
	@Override
	public boolean method15048(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!alj", name = "f", descriptor = "(B)V")
	@Override
	public synchronized void method15046(@OriginalArg(0) byte arg0) {
		this.aClass8_25.method260(186910758);
		for (@Pc(9) Class80_Sub15 local9 = (Class80_Sub15) this.aClass8_26.method233(775164963); local9 != null; local9 = (Class80_Sub15) this.aClass8_26.method233(285151163)) {
			local9.anInt1564 = this.method15089((byte) 126) * 1304974345;
			if (local9.anInt1561 * -1695358517 == 0) {
				if (!this.aBooleanArray9[local9.anInt1563 * -1073841991]) {
					@Pc(36) Class80_Sub15 local36 = new Class80_Sub15();
					local36.anInt1561 = 0;
					local36.aChar11 = (char) 65535;
					local36.anInt1563 = local9.anInt1563;
					local36.aLong89 = local9.aLong89;
					local36.anInt1564 = local9.anInt1564;
					this.aClass8_25.method232(local36, 1387390552);
					this.aBooleanArray9[local9.anInt1563 * -1073841991] = true;
				}
				local9.anInt1561 = -577734714;
				this.aClass8_25.method232(local9, 1834324686);
			} else if (local9.anInt1561 * -1695358517 == 1) {
				if (this.aBooleanArray9[local9.anInt1563 * -1073841991]) {
					this.aClass8_25.method232(local9, 325975357);
					this.aBooleanArray9[local9.anInt1563 * -1073841991] = false;
				}
			} else if (local9.anInt1561 * -1695358517 == -1) {
				for (@Pc(118) int local118 = 0; local118 < 112; local118++) {
					if (this.aBooleanArray9[local118]) {
						@Pc(130) Class80_Sub15 local130 = new Class80_Sub15();
						local130.anInt1561 = 1858616291;
						local130.aChar11 = (char) 65535;
						local130.anInt1563 = local118 * 1110445449;
						local130.aLong89 = local9.aLong89;
						local130.anInt1564 = local9.anInt1564;
						this.aClass8_25.method232(local130, 1348382375);
						this.aBooleanArray9[local118] = false;
					}
				}
			} else if (local9.anInt1561 * -1695358517 == 3) {
				this.aClass8_25.method232(local9, 859699292);
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "g", descriptor = "()Lclient!ua;")
	@Override
	public Interface63 method15051() {
		return (Interface63) this.aClass8_25.method233(1107499326);
	}

	@OriginalMember(owner = "client!alj", name = "l", descriptor = "(I)V")
	@Override
	public void method15052(@OriginalArg(0) int arg0) {
		this.method15063((byte) -68);
	}

	@OriginalMember(owner = "client!alj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method15066(arg0, 1, 2086457001);
	}

	@OriginalMember(owner = "client!alj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method15066(arg0, 0, 209569617);
	}

	@OriginalMember(owner = "client!alj", name = "x", descriptor = "(Ljava/awt/Component;I)V")
	void method15065(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1) {
		this.method15063((byte) 79);
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!alj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != '\uffff' && Class449.method29265(local2, -1082533518)) {
			this.method15064(3, local2, -1, -623875225);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "h", descriptor = "(Ljava/awt/event/KeyEvent;II)V")
	void method15066(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray196.length) {
			local2 = anIntArray196[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method15064(arg1, (char) 65535, local2, 599215160);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method15064(-1, '\u0000', 0, -287739638);
	}

	@OriginalMember(owner = "client!alj", name = "df", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public void method15067(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!alj", name = "dl", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public void method15068(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!alj", name = "db", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public void method15069(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!alj", name = "dt", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public synchronized void method15070(@OriginalArg(0) FocusEvent arg0) {
		this.method15064(-1, '\u0000', 0, -1886995690);
	}

	@OriginalMember(owner = "client!alj", name = "du", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public synchronized void method15071(@OriginalArg(0) FocusEvent arg0) {
		this.method15064(-1, '\u0000', 0, -118152408);
	}

	@OriginalMember(owner = "client!alj", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method15050(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!alj", name = "n", descriptor = "()V")
	void method15072() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(16) int local16 = 0; local16 < 112; local16++) {
			this.aBooleanArray9[local16] = false;
		}
		this.aClass8_25.method260(-293111507);
		this.aClass8_26.method260(512141799);
	}

	@OriginalMember(owner = "client!alj", name = "al", descriptor = "(Ljava/awt/event/KeyEvent;I)V")
	void method15075(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray196.length) {
			local2 = anIntArray196[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method15064(arg1, (char) 65535, local2, 277149398);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "dw", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public synchronized void method15076(@OriginalArg(0) FocusEvent arg0) {
		this.method15064(-1, '\u0000', 0, 1918620945);
	}

	@OriginalMember(owner = "client!alj", name = "j", descriptor = "()V")
	@Override
	public synchronized void method15054() {
		this.aClass8_25.method260(616306610);
		for (@Pc(9) Class80_Sub15 local9 = (Class80_Sub15) this.aClass8_26.method233(-373847298); local9 != null; local9 = (Class80_Sub15) this.aClass8_26.method233(-244541996)) {
			local9.anInt1564 = this.method15089((byte) 109) * 1304974345;
			if (local9.anInt1561 * -1695358517 == 0) {
				if (!this.aBooleanArray9[local9.anInt1563 * -1073841991]) {
					@Pc(36) Class80_Sub15 local36 = new Class80_Sub15();
					local36.anInt1561 = 0;
					local36.aChar11 = (char) 65535;
					local36.anInt1563 = local9.anInt1563;
					local36.aLong89 = local9.aLong89;
					local36.anInt1564 = local9.anInt1564;
					this.aClass8_25.method232(local36, 708594254);
					this.aBooleanArray9[local9.anInt1563 * -1073841991] = true;
				}
				local9.anInt1561 = -577734714;
				this.aClass8_25.method232(local9, -156293448);
			} else if (local9.anInt1561 * -1695358517 == 1) {
				if (this.aBooleanArray9[local9.anInt1563 * -1073841991]) {
					this.aClass8_25.method232(local9, 1921511893);
					this.aBooleanArray9[local9.anInt1563 * -1073841991] = false;
				}
			} else if (local9.anInt1561 * -1695358517 == -1) {
				for (@Pc(118) int local118 = 0; local118 < 112; local118++) {
					if (this.aBooleanArray9[local118]) {
						@Pc(130) Class80_Sub15 local130 = new Class80_Sub15();
						local130.anInt1561 = 1858616291;
						local130.aChar11 = (char) 65535;
						local130.anInt1563 = local118 * 1110445449;
						local130.aLong89 = local9.aLong89;
						local130.anInt1564 = local9.anInt1564;
						this.aClass8_25.method232(local130, 271691998);
						this.aBooleanArray9[local118] = false;
					}
				}
			} else if (local9.anInt1561 * -1695358517 == 3) {
				this.aClass8_25.method232(local9, 452893676);
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "c", descriptor = "(ICI)V")
	void method15077(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class80_Sub15 local3 = new Class80_Sub15();
		local3.anInt1561 = arg0 * 1858616291;
		local3.aChar11 = arg1;
		local3.anInt1563 = arg2 * 1110445449;
		local3.aLong89 = Class303.method27111((byte) 106) * 4790344457956539703L;
		this.aClass8_26.method232(local3, 1145182902);
	}

	@OriginalMember(owner = "client!alj", name = "an", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15078(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != '\uffff' && Class449.method29265(local2, -1324859217)) {
			this.method15064(3, local2, -1, -70665454);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "ax", descriptor = "(ICI)V")
	void method15079(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class80_Sub15 local3 = new Class80_Sub15();
		local3.anInt1561 = arg0 * 1858616291;
		local3.aChar11 = arg1;
		local3.anInt1563 = arg2 * 1110445449;
		local3.aLong89 = Class303.method27111((byte) 73) * 4790344457956539703L;
		this.aClass8_26.method232(local3, 1202691488);
	}

	@OriginalMember(owner = "client!alj", name = "v", descriptor = "(Ljava/awt/Component;)V")
	void method15080(@OriginalArg(0) Component arg0) {
		this.method15063((byte) -25);
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!alj", name = "ai", descriptor = "(ICI)V")
	void method15081(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class80_Sub15 local3 = new Class80_Sub15();
		local3.anInt1561 = arg0 * 1858616291;
		local3.aChar11 = arg1;
		local3.anInt1563 = arg2 * 1110445449;
		local3.aLong89 = Class303.method27111((byte) 33) * 4790344457956539703L;
		this.aClass8_26.method232(local3, 1032079003);
	}

	@OriginalMember(owner = "client!alj", name = "aq", descriptor = "(ICI)V")
	void method15082(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class80_Sub15 local3 = new Class80_Sub15();
		local3.anInt1561 = arg0 * 1858616291;
		local3.aChar11 = arg1;
		local3.anInt1563 = arg2 * 1110445449;
		local3.aLong89 = Class303.method27111((byte) 23) * 4790344457956539703L;
		this.aClass8_26.method232(local3, 97455594);
	}

	@OriginalMember(owner = "client!alj", name = "o", descriptor = "()V")
	@Override
	public synchronized void method15049() {
		this.aClass8_25.method260(-519320394);
		for (@Pc(9) Class80_Sub15 local9 = (Class80_Sub15) this.aClass8_26.method233(391214833); local9 != null; local9 = (Class80_Sub15) this.aClass8_26.method233(867239713)) {
			local9.anInt1564 = this.method15089((byte) 27) * 1304974345;
			if (local9.anInt1561 * -1695358517 == 0) {
				if (!this.aBooleanArray9[local9.anInt1563 * -1073841991]) {
					@Pc(36) Class80_Sub15 local36 = new Class80_Sub15();
					local36.anInt1561 = 0;
					local36.aChar11 = (char) 65535;
					local36.anInt1563 = local9.anInt1563;
					local36.aLong89 = local9.aLong89;
					local36.anInt1564 = local9.anInt1564;
					this.aClass8_25.method232(local36, 545624583);
					this.aBooleanArray9[local9.anInt1563 * -1073841991] = true;
				}
				local9.anInt1561 = -577734714;
				this.aClass8_25.method232(local9, 118173458);
			} else if (local9.anInt1561 * -1695358517 == 1) {
				if (this.aBooleanArray9[local9.anInt1563 * -1073841991]) {
					this.aClass8_25.method232(local9, 1644211068);
					this.aBooleanArray9[local9.anInt1563 * -1073841991] = false;
				}
			} else if (local9.anInt1561 * -1695358517 == -1) {
				for (@Pc(118) int local118 = 0; local118 < 112; local118++) {
					if (this.aBooleanArray9[local118]) {
						@Pc(130) Class80_Sub15 local130 = new Class80_Sub15();
						local130.anInt1561 = 1858616291;
						local130.aChar11 = (char) 65535;
						local130.anInt1563 = local118 * 1110445449;
						local130.aLong89 = local9.aLong89;
						local130.anInt1564 = local9.anInt1564;
						this.aClass8_25.method232(local130, 1715091623);
						this.aBooleanArray9[local118] = false;
					}
				}
			} else if (local9.anInt1561 * -1695358517 == 3) {
				this.aClass8_25.method232(local9, 565257802);
			}
		}
	}

	@OriginalMember(owner = "client!alj", name = "y", descriptor = "()V")
	void method15083() {
		if (this.aComponent2 == null) {
			return;
		}
		this.aComponent2.removeKeyListener(this);
		this.aComponent2.removeFocusListener(this);
		this.aComponent2 = null;
		for (@Pc(16) int local16 = 0; local16 < 112; local16++) {
			this.aBooleanArray9[local16] = false;
		}
		this.aClass8_25.method260(1550337792);
		this.aClass8_26.method260(-829874615);
	}

	@OriginalMember(owner = "client!alj", name = "m", descriptor = "(I)Z")
	@Override
	public boolean method15047(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray9[arg0] : false;
	}

	@OriginalMember(owner = "client!alj", name = "ds", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	public synchronized void method15084(@OriginalArg(0) FocusEvent arg0) {
		this.method15064(-1, '\u0000', 0, -22095758);
	}

	@OriginalMember(owner = "client!alj", name = "ag", descriptor = "(Ljava/awt/event/KeyEvent;I)V")
	void method15085(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray196.length) {
			local2 = anIntArray196[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method15064(arg1, (char) 65535, local2, 862428673);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "ao", descriptor = "()I")
	int method15086() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray9[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray9[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray9[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!alj", name = "aj", descriptor = "()I")
	int method15087() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray9[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray9[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray9[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!alj", name = "ac", descriptor = "()I")
	int method15088() {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray9[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray9[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray9[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!alj", name = "q", descriptor = "(B)I")
	int method15089(@OriginalArg(0) byte arg0) {
		@Pc(1) int local1 = 0;
		if (this.aBooleanArray9[81]) {
			local1 |= 0x1;
		}
		if (this.aBooleanArray9[82]) {
			local1 |= 0x4;
		}
		if (this.aBooleanArray9[86]) {
			local1 |= 0x2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!alj", name = "p", descriptor = "(Ljava/awt/Component;)V")
	void method15090(@OriginalArg(0) Component arg0) {
		this.method15063((byte) 11);
		this.aComponent2 = arg0;
		this.aComponent2.addKeyListener(this);
		this.aComponent2.addFocusListener(this);
	}

	@OriginalMember(owner = "client!alj", name = "ab", descriptor = "(Ljava/awt/event/KeyEvent;I)V")
	void method15091(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray196.length) {
			local2 = anIntArray196[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method15064(arg1, (char) 65535, local2, 665608644);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "b", descriptor = "(ICI)V")
	void method15092(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class80_Sub15 local3 = new Class80_Sub15();
		local3.anInt1561 = arg0 * 1858616291;
		local3.aChar11 = arg1;
		local3.anInt1563 = arg2 * 1110445449;
		local3.aLong89 = Class303.method27111((byte) 34) * 4790344457956539703L;
		this.aClass8_26.method232(local3, 78058192);
	}

	@OriginalMember(owner = "client!alj", name = "ah", descriptor = "(Ljava/awt/event/KeyEvent;I)V")
	void method15093(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray196.length) {
			local2 = anIntArray196[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method15064(arg1, (char) 65535, local2, -900796389);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "af", descriptor = "(Ljava/awt/event/KeyEvent;I)V")
	void method15094(@OriginalArg(0) KeyEvent arg0, @OriginalArg(1) int arg1) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (local2 == 0) {
			local2 = 0;
		} else if (local2 >= 0 && local2 < anIntArray196.length) {
			local2 = anIntArray196[local2];
			if (arg1 == 0 && (local2 & 0x80) != 0) {
				local2 = 0;
			} else {
				local2 &= 0xFFFFFF7F;
			}
		} else {
			local2 = 0;
		}
		if (local2 != 0) {
			this.method15064(arg1, (char) 65535, local2, 1614887521);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "a", descriptor = "()V")
	@Override
	public void method15055() {
		this.method15063((byte) -60);
	}

	@OriginalMember(owner = "client!alj", name = "ak", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15095(@OriginalArg(0) KeyEvent arg0) {
		this.method15066(arg0, 0, 1796268777);
	}

	@OriginalMember(owner = "client!alj", name = "at", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15096(@OriginalArg(0) KeyEvent arg0) {
		this.method15066(arg0, 0, -1325374022);
	}

	@OriginalMember(owner = "client!alj", name = "ad", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15097(@OriginalArg(0) KeyEvent arg0) {
		this.method15066(arg0, 0, 1886409518);
	}

	@OriginalMember(owner = "client!alj", name = "av", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15098(@OriginalArg(0) KeyEvent arg0) {
		this.method15066(arg0, 1, -987028584);
	}

	@OriginalMember(owner = "client!alj", name = "am", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15099(@OriginalArg(0) KeyEvent arg0) {
		this.method15066(arg0, 0, 1877855965);
	}

	@OriginalMember(owner = "client!alj", name = "aa", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15100(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != '\uffff' && Class449.method29265(local2, -1820402990)) {
			this.method15064(3, local2, -1, 668366142);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "ap", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15101(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != '\uffff' && Class449.method29265(local2, -2098599104)) {
			this.method15064(3, local2, -1, 1248947975);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!alj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!alj", name = "ar", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	public synchronized void method15102(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) char local2 = arg0.getKeyChar();
		if (local2 != '\uffff' && Class449.method29265(local2, -790529968)) {
			this.method15064(3, local2, -1, 728878182);
			arg0.consume();
		}
	}
}
