package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public class Class369 implements Interface13 {

	@OriginalMember(owner = "client!jv", name = "ae", descriptor = "I")
	static int anInt4589;

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "[I")
	public static final int[] anIntArray429 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "[I")
	public static final int[] anIntArray431 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "[S")
	short[] aShortArray123;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "[I")
	int[] anIntArray428;

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "[B")
	byte[] aByteArray87;

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "[S")
	short[] aShortArray124;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "[S")
	short[] aShortArray125;

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "[B")
	byte[] aByteArray88;

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "[S")
	short[] aShortArray126;

	@OriginalMember(owner = "client!jv", name = "z", descriptor = "[I")
	int[] anIntArray430 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_106;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(ILclient!py;)V", line = 23)
	Class369(@OriginalArg(0) int arg0, @OriginalArg(1) Class497 arg1) {
		this.aClass497_106 = arg1;
	}

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "(Lclient!alw;B)V", line = 29)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27976(arg0, local3, 530564630);
		}
	}

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "(Lclient!alw;)V", line = 29)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27976(arg0, local3, 718070274);
		}
	}

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "(Lclient!alw;)V", line = 29)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27976(arg0, local3, 648734504);
		}
	}

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "(Lclient!alw;)V", line = 29)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27976(arg0, local3, 1519906489);
		}
	}

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "(Lclient!alw;)V", line = 29)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method27976(arg0, local3, -193977240);
		}
	}

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "(Lclient!alw;II)V", line = 36)
	void method27976(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			arg0.method22465((short) 16384);
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method22465((short) 16384);
			this.anIntArray428 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray428[local20] = arg0.method22542(-124266605);
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method22465((short) 16384);
				this.aShortArray123 = new short[local14];
				this.aShortArray125 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method22472(-1434290800);
					this.aShortArray125[local20] = (short) arg0.method22472(-1434290800);
				}
			} else if (arg1 == 41) {
				local14 = arg0.method22465((short) 16384);
				this.aShortArray126 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray126[local20] = (short) arg0.method22472(-1434290800);
					this.aShortArray124[local20] = (short) arg0.method22472(-1434290800);
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method22472(-1434290800);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray87 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray87[local142] = local140++;
						} else {
							this.aByteArray87[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method22472(-1434290800);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray88 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray88[local142] = local140++;
						} else {
							this.aByteArray88[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray430[arg1 - 60] = arg0.method22542(-1268950914);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "(Lclient!alw;I)V", line = 36)
	void method27977(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22465((short) 16384);
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method22465((short) 16384);
			this.anIntArray428 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray428[local20] = arg0.method22542(-1875909795);
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method22465((short) 16384);
				this.aShortArray123 = new short[local14];
				this.aShortArray125 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method22472(-1434290800);
					this.aShortArray125[local20] = (short) arg0.method22472(-1434290800);
				}
			} else if (arg1 == 41) {
				local14 = arg0.method22465((short) 16384);
				this.aShortArray126 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray126[local20] = (short) arg0.method22472(-1434290800);
					this.aShortArray124[local20] = (short) arg0.method22472(-1434290800);
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method22472(-1434290800);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray87 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray87[local142] = local140++;
						} else {
							this.aByteArray87[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method22472(-1434290800);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray88 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray88[local142] = local140++;
						} else {
							this.aByteArray88[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray430[arg1 - 60] = arg0.method22542(-141543606);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "r", descriptor = "(Lclient!alw;I)V", line = 36)
	void method27978(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22465((short) 16384);
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method22465((short) 16384);
			this.anIntArray428 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray428[local20] = arg0.method22542(-383246284);
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method22465((short) 16384);
				this.aShortArray123 = new short[local14];
				this.aShortArray125 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method22472(-1434290800);
					this.aShortArray125[local20] = (short) arg0.method22472(-1434290800);
				}
			} else if (arg1 == 41) {
				local14 = arg0.method22465((short) 16384);
				this.aShortArray126 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray126[local20] = (short) arg0.method22472(-1434290800);
					this.aShortArray124[local20] = (short) arg0.method22472(-1434290800);
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method22472(-1434290800);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray87 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray87[local142] = local140++;
						} else {
							this.aByteArray87[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method22472(-1434290800);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray88 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray88[local142] = local140++;
						} else {
							this.aByteArray88[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray430[arg1 - 60] = arg0.method22542(-1974216404);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "(Lclient!alw;I)V", line = 36)
	void method27979(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22465((short) 16384);
			return;
		}
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 2) {
			local14 = arg0.method22465((short) 16384);
			this.anIntArray428 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray428[local20] = arg0.method22542(-161455000);
			}
		} else if (arg1 != 3) {
			if (arg1 == 40) {
				local14 = arg0.method22465((short) 16384);
				this.aShortArray123 = new short[local14];
				this.aShortArray125 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray123[local20] = (short) arg0.method22472(-1434290800);
					this.aShortArray125[local20] = (short) arg0.method22472(-1434290800);
				}
			} else if (arg1 == 41) {
				local14 = arg0.method22465((short) 16384);
				this.aShortArray126 = new short[local14];
				this.aShortArray124 = new short[local14];
				for (local20 = 0; local20 < local14; local20++) {
					this.aShortArray126[local20] = (short) arg0.method22472(-1434290800);
					this.aShortArray124[local20] = (short) arg0.method22472(-1434290800);
				}
			} else {
				@Pc(126) int local126;
				@Pc(142) int local142;
				@Pc(140) byte local140;
				if (arg1 == 44) {
					local14 = arg0.method22472(-1434290800);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray87 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray87[local142] = local140++;
						} else {
							this.aByteArray87[local142] = -1;
						}
					}
				} else if (arg1 == 45) {
					local14 = arg0.method22472(-1434290800);
					local20 = 0;
					for (local126 = local14; local126 > 0; local126 >>= 0x1) {
						local20++;
					}
					this.aByteArray88 = new byte[local20];
					local140 = 0;
					for (local142 = 0; local142 < local20; local142++) {
						if ((local14 & 0x1 << local142) > 0) {
							this.aByteArray88[local142] = local140++;
						} else {
							this.aByteArray88[local142] = -1;
						}
					}
				} else if (arg1 >= 60 && arg1 < 70) {
					this.anIntArray430[arg1 - 60] = arg0.method22542(-2083057637);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "(I)V", line = 99)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "()V", line = 99)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!jv", name = "z", descriptor = "(B)Z", line = 102)
	public boolean method27980(@OriginalArg(0) byte arg0) {
		if (this.anIntArray428 == null) {
			return true;
		}
		@Pc(6) boolean local6 = true;
		@Pc(10) Class497 local10 = this.aClass497_106;
		synchronized (this.aClass497_106) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray428.length; local13++) {
				if (!this.aClass497_106.method30069(this.anIntArray428[local13], 0, -893821147)) {
					local6 = false;
				}
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "()Z", line = 102)
	public boolean method27981() {
		if (this.anIntArray428 == null) {
			return true;
		}
		@Pc(6) boolean local6 = true;
		@Pc(10) Class497 local10 = this.aClass497_106;
		synchronized (this.aClass497_106) {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray428.length; local13++) {
				if (!this.aClass497_106.method30069(this.anIntArray428[local13], 0, -771330286)) {
					local6 = false;
				}
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!jv", name = "p", descriptor = "(I)Lclient!dq;", line = 111)
	public Class231 method27982(@OriginalArg(0) int arg0) {
		if (this.anIntArray428 == null) {
			return null;
		}
		@Pc(9) Class231[] local9 = new Class231[this.anIntArray428.length];
		@Pc(13) Class497 local13 = this.aClass497_106;
		@Pc(16) int local16;
		synchronized (this.aClass497_106) {
			local16 = 0;
			while (true) {
				if (local16 >= this.anIntArray428.length) {
					break;
				}
				local9[local16] = Class231.method25655(this.aClass497_106, this.anIntArray428[local16], 0);
				local16++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray428.length; local44++) {
			if (local9[local44].anInt3738 < 13) {
				local9[local44].method25691(2);
			}
		}
		@Pc(70) Class231 local70;
		if (local9.length == 1) {
			local70 = local9[0];
		} else {
			local70 = new Class231(local9, local9.length);
		}
		if (local70 == null) {
			return null;
		}
		if (this.aShortArray123 != null) {
			for (local16 = 0; local16 < this.aShortArray123.length; local16++) {
				local70.method25680(this.aShortArray123[local16], this.aShortArray125[local16]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local16 = 0; local16 < this.aShortArray126.length; local16++) {
				local70.method25683(this.aShortArray126[local16], this.aShortArray124[local16]);
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "()Lclient!dq;", line = 111)
	public Class231 method27983() {
		if (this.anIntArray428 == null) {
			return null;
		}
		@Pc(9) Class231[] local9 = new Class231[this.anIntArray428.length];
		@Pc(13) Class497 local13 = this.aClass497_106;
		@Pc(16) int local16;
		synchronized (this.aClass497_106) {
			local16 = 0;
			while (true) {
				if (local16 >= this.anIntArray428.length) {
					break;
				}
				local9[local16] = Class231.method25655(this.aClass497_106, this.anIntArray428[local16], 0);
				local16++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray428.length; local44++) {
			if (local9[local44].anInt3738 < 13) {
				local9[local44].method25691(2);
			}
		}
		@Pc(70) Class231 local70;
		if (local9.length == 1) {
			local70 = local9[0];
		} else {
			local70 = new Class231(local9, local9.length);
		}
		if (local70 == null) {
			return null;
		}
		if (this.aShortArray123 != null) {
			for (local16 = 0; local16 < this.aShortArray123.length; local16++) {
				local70.method25680(this.aShortArray123[local16], this.aShortArray125[local16]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local16 = 0; local16 < this.aShortArray126.length; local16++) {
				local70.method25683(this.aShortArray126[local16], this.aShortArray124[local16]);
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "()Lclient!dq;", line = 111)
	public Class231 method27984() {
		if (this.anIntArray428 == null) {
			return null;
		}
		@Pc(9) Class231[] local9 = new Class231[this.anIntArray428.length];
		@Pc(13) Class497 local13 = this.aClass497_106;
		@Pc(16) int local16;
		synchronized (this.aClass497_106) {
			local16 = 0;
			while (true) {
				if (local16 >= this.anIntArray428.length) {
					break;
				}
				local9[local16] = Class231.method25655(this.aClass497_106, this.anIntArray428[local16], 0);
				local16++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < this.anIntArray428.length; local44++) {
			if (local9[local44].anInt3738 < 13) {
				local9[local44].method25691(2);
			}
		}
		@Pc(70) Class231 local70;
		if (local9.length == 1) {
			local70 = local9[0];
		} else {
			local70 = new Class231(local9, local9.length);
		}
		if (local70 == null) {
			return null;
		}
		if (this.aShortArray123 != null) {
			for (local16 = 0; local16 < this.aShortArray123.length; local16++) {
				local70.method25680(this.aShortArray123[local16], this.aShortArray125[local16]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local16 = 0; local16 < this.aShortArray126.length; local16++) {
				local70.method25683(this.aShortArray126[local16], this.aShortArray124[local16]);
			}
		}
		return local70;
	}

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "(I)Z", line = 137)
	public boolean method27985(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class497 local5 = this.aClass497_106;
		synchronized (this.aClass497_106) {
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray430[local8] != -1 && !this.aClass497_106.method30069(this.anIntArray430[local8], 0, 137847594)) {
					local1 = false;
				}
			}
			return local1;
		}
	}

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "()Z", line = 137)
	public boolean method27986() {
		@Pc(1) boolean local1 = true;
		@Pc(5) Class497 local5 = this.aClass497_106;
		synchronized (this.aClass497_106) {
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray430[local8] != -1 && !this.aClass497_106.method30069(this.anIntArray430[local8], 0, -6464779)) {
					local1 = false;
				}
			}
			return local1;
		}
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)Lclient!dq;", line = 147)
	public Class231 method27987(@OriginalArg(0) int arg0) {
		@Pc(2) Class231[] local2 = new Class231[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class497 local8 = this.aClass497_106;
		@Pc(11) int local11;
		synchronized (this.aClass497_106) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray430[local11] != -1) {
					local2[local4++] = Class231.method25655(this.aClass497_106, this.anIntArray430[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3738 < 13) {
				local2[local44].method25691(2);
			}
		}
		@Pc(71) Class231 local71 = new Class231(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method25680(this.aShortArray123[local11], this.aShortArray125[local11]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local11 = 0; local11 < this.aShortArray126.length; local11++) {
				local71.method25683(this.aShortArray126[local11], this.aShortArray124[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "()Lclient!dq;", line = 147)
	public Class231 method27988() {
		@Pc(2) Class231[] local2 = new Class231[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class497 local8 = this.aClass497_106;
		@Pc(11) int local11;
		synchronized (this.aClass497_106) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray430[local11] != -1) {
					local2[local4++] = Class231.method25655(this.aClass497_106, this.anIntArray430[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3738 < 13) {
				local2[local44].method25691(2);
			}
		}
		@Pc(71) Class231 local71 = new Class231(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method25680(this.aShortArray123[local11], this.aShortArray125[local11]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local11 = 0; local11 < this.aShortArray126.length; local11++) {
				local71.method25683(this.aShortArray126[local11], this.aShortArray124[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "()Lclient!dq;", line = 147)
	public Class231 method27989() {
		@Pc(2) Class231[] local2 = new Class231[5];
		@Pc(4) int local4 = 0;
		@Pc(8) Class497 local8 = this.aClass497_106;
		@Pc(11) int local11;
		synchronized (this.aClass497_106) {
			local11 = 0;
			while (true) {
				if (local11 >= 5) {
					break;
				}
				if (this.anIntArray430[local11] != -1) {
					local2[local4++] = Class231.method25655(this.aClass497_106, this.anIntArray430[local11], 0);
				}
				local11++;
			}
		}
		for (@Pc(44) int local44 = 0; local44 < 5; local44++) {
			if (local2[local44] != null && local2[local44].anInt3738 < 13) {
				local2[local44].method25691(2);
			}
		}
		@Pc(71) Class231 local71 = new Class231(local2, local4);
		if (this.aShortArray123 != null) {
			for (local11 = 0; local11 < this.aShortArray123.length; local11++) {
				local71.method25680(this.aShortArray123[local11], this.aShortArray125[local11]);
			}
		}
		if (this.aShortArray126 != null) {
			for (local11 = 0; local11 < this.aShortArray126.length; local11++) {
				local71.method25683(this.aShortArray126[local11], this.aShortArray124[local11]);
			}
		}
		return local71;
	}

	@OriginalMember(owner = "client!jv", name = "fg", descriptor = "(Lclient!yf;I)V", line = 5857)
	static final void method27990(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 150840534);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class593.method31719(local16, local22, arg0, 1853295968);
	}

	@OriginalMember(owner = "client!jv", name = "ug", descriptor = "(Lclient!yf;I)V", line = 8607)
	static final void method27991(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1046488611);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt3991 * 1312295363;
	}
}
