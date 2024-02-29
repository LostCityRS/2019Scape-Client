package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public class Class203 {

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	static final int anInt3378 = 1;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	static final int anInt3379 = 0;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	static final int anInt3380 = 0;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 13)
	Class203() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(Lclient!py;II)Lclient!de;", line = 18)
	public static Class105 method24648(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method30064(arg1, arg2, (byte) 0);
		return local5 == null ? null : method24660(local5)[0];
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(Lclient!py;II)Lclient!de;", line = 18)
	public static Class105 method24649(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method30064(arg1, arg2, (byte) 0);
		return local5 == null ? null : method24660(local5)[0];
	}

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "(Lclient!py;II)Lclient!de;", line = 18)
	public static Class105 method24650(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method30064(arg1, arg2, (byte) 0);
		return local5 == null ? null : method24660(local5)[0];
	}

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "(Lclient!py;II)Lclient!de;", line = 18)
	public static Class105 method24651(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method30064(arg1, arg2, (byte) 0);
		return local5 == null ? null : method24660(local5)[0];
	}

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "(Lclient!py;II)Lclient!de;", line = 18)
	public static Class105 method24652(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method30064(arg1, arg2, (byte) 0);
		return local5 == null ? null : method24660(local5)[0];
	}

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "(Lclient!py;I)Lclient!de;", line = 24)
	public static Class105 method24653(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method30079(arg1, (byte) 123);
		return local4 == null ? null : method24660(local4)[0];
	}

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "(Lclient!py;I)Lclient!de;", line = 24)
	public static Class105 method24654(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method30079(arg1, (byte) 46);
		return local4 == null ? null : method24660(local4)[0];
	}

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "(Lclient!py;I)Lclient!de;", line = 24)
	public static Class105 method24655(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method30079(arg1, (byte) 114);
		return local4 == null ? null : method24660(local4)[0];
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(Lclient!py;II)[Lclient!de;", line = 30)
	public static Class105[] method24656(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method30064(arg1, arg2, (byte) 0);
		return local5 == null ? null : method24660(local5);
	}

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "(Lclient!py;II)[Lclient!de;", line = 30)
	public static Class105[] method24657(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method30064(arg1, arg2, (byte) 0);
		return local5 == null ? null : method24660(local5);
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(Lclient!py;II)[Lclient!de;", line = 30)
	public static Class105[] method24658(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method30064(arg1, arg2, (byte) 0);
		return local5 == null ? null : method24660(local5);
	}

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "([B)[Lclient!de;", line = 36)
	public static Class105[] method24659(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		local4.anInt3070 = (arg0.length - 2) * -1445626955;
		@Pc(16) int local16 = local4.method22472(-1434290800);
		@Pc(20) int local20 = local16 >> 15;
		@Pc(24) int local24 = local16 & 0x7FFF;
		@Pc(31) int local31;
		@Pc(70) int local70;
		@Pc(72) int local72;
		@Pc(178) int local178;
		@Pc(227) int local227;
		if (local20 == 0) {
			@Pc(29) Class105_Sub2[] local29 = new Class105_Sub2[local24];
			for (local31 = 0; local31 < local24; local31++) {
				local29[local31] = new Class105_Sub2();
			}
			local4.anInt3070 = (arg0.length - 7 - local24 * 8) * -1445626955;
			local31 = local4.method22472(-1434290800);
			@Pc(62) int local62 = local4.method22472(-1434290800);
			local70 = (local4.method22465((short) 16384) & 0xFF) + 1;
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt842 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt844 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt840 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt841 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				@Pc(135) Class105_Sub2 local135 = local29[local72];
				local135.anInt843 = local31 - local135.anInt840 - local135.anInt842;
				local135.anInt845 = local62 - local135.anInt841 - local135.anInt844;
			}
			local4.anInt3070 = (arg0.length - 7 - local24 * 8 - (local70 - 1) * 3) * -1445626955;
			@Pc(176) int[] local176 = new int[local70];
			for (local178 = 1; local178 < local70; local178++) {
				local176[local178] = local4.method22478((short) -8771);
				if (local176[local178] == 0) {
					local176[local178] = 1;
				}
			}
			for (local178 = 0; local178 < local24; local178++) {
				local29[local178].anIntArray82 = local176;
			}
			local4.anInt3070 = 0;
			for (local178 = 0; local178 < local24; local178++) {
				@Pc(221) Class105_Sub2 local221 = local29[local178];
				local227 = local221.anInt840 * local221.anInt841;
				local221.aByteArray25 = new byte[local227];
				@Pc(235) int local235 = local4.method22465((short) 16384);
				@Pc(266) int local266;
				if ((local235 & 0x2) == 0) {
					@Pc(245) int local245;
					if ((local235 & 0x1) == 0) {
						for (local245 = 0; local245 < local227; local245++) {
							local221.aByteArray25[local245] = local4.method22468(2018036499);
						}
					} else {
						for (local245 = 0; local245 < local221.anInt840; local245++) {
							for (local266 = 0; local266 < local221.anInt841; local266++) {
								local221.aByteArray25[local245 + local266 * local221.anInt840] = local4.method22468(767132798);
							}
						}
					}
				} else {
					@Pc(289) boolean local289 = false;
					local221.aByteArray26 = new byte[local227];
					if ((local235 & 0x1) == 0) {
						for (local266 = 0; local266 < local227; local266++) {
							local221.aByteArray25[local266] = local4.method22468(1246065941);
						}
						for (local266 = 0; local266 < local227; local266++) {
							@Pc(325) byte local325 = local221.aByteArray26[local266] = local4.method22468(1217006651);
							local289 |= local325 != -1;
						}
					} else {
						@Pc(345) int local345;
						for (local266 = 0; local266 < local221.anInt840; local266++) {
							for (local345 = 0; local345 < local221.anInt841; local345++) {
								local221.aByteArray25[local266 + local345 * local221.anInt840] = local4.method22468(851589908);
							}
						}
						for (local266 = 0; local266 < local221.anInt840; local266++) {
							for (local345 = 0; local345 < local221.anInt841; local345++) {
								@Pc(391) byte local391 = local221.aByteArray26[local266 + local345 * local221.anInt840] = local4.method22468(810134654);
								local289 |= local391 != -1;
							}
						}
					}
					if (!local289) {
						local221.aByteArray26 = null;
					}
				}
			}
			return local29;
		} else {
			@Pc(416) Class105_Sub1[] local416 = new Class105_Sub1[local24];
			local4.anInt3070 = 0;
			local31 = local4.method22465((short) 16384);
			if (local31 == 0) {
				@Pc(434) boolean local434 = local4.method22465((short) 16384) == 1;
				local70 = local4.method22472(-1434290800);
				local72 = local4.method22472(-1434290800);
				for (local178 = 0; local178 < local24; local178++) {
					@Pc(452) int[] local452 = new int[local70 * local72];
					for (local227 = 0; local227 < local70 * local72; local227++) {
						local452[local227] = local4.method22478((short) 4151) | 0xFF000000;
						if (local452[local227] == -65281) {
							local452[local227] = 0;
						}
					}
					if (local434) {
						for (local227 = 0; local227 < local70 * local72; local227++) {
							local452[local227] &= 0xFFFFFF;
							local452[local227] |= local4.method22465((short) 16384) << 24;
						}
					}
					local416[local178] = new Class105_Sub1(local70, local72, local452);
				}
				return local416;
			} else if (local31 == 1) {
				throw new UnsupportedOperationException();
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "([B)[Lclient!de;", line = 36)
	public static Class105[] method24660(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		local4.anInt3070 = (arg0.length - 2) * -1445626955;
		@Pc(16) int local16 = local4.method22472(-1434290800);
		@Pc(20) int local20 = local16 >> 15;
		@Pc(24) int local24 = local16 & 0x7FFF;
		@Pc(31) int local31;
		@Pc(70) int local70;
		@Pc(72) int local72;
		@Pc(178) int local178;
		@Pc(227) int local227;
		if (local20 == 0) {
			@Pc(29) Class105_Sub2[] local29 = new Class105_Sub2[local24];
			for (local31 = 0; local31 < local24; local31++) {
				local29[local31] = new Class105_Sub2();
			}
			local4.anInt3070 = (arg0.length - 7 - local24 * 8) * -1445626955;
			local31 = local4.method22472(-1434290800);
			@Pc(62) int local62 = local4.method22472(-1434290800);
			local70 = (local4.method22465((short) 16384) & 0xFF) + 1;
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt842 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt844 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt840 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt841 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				@Pc(135) Class105_Sub2 local135 = local29[local72];
				local135.anInt843 = local31 - local135.anInt840 - local135.anInt842;
				local135.anInt845 = local62 - local135.anInt841 - local135.anInt844;
			}
			local4.anInt3070 = (arg0.length - 7 - local24 * 8 - (local70 - 1) * 3) * -1445626955;
			@Pc(176) int[] local176 = new int[local70];
			for (local178 = 1; local178 < local70; local178++) {
				local176[local178] = local4.method22478((short) -2863);
				if (local176[local178] == 0) {
					local176[local178] = 1;
				}
			}
			for (local178 = 0; local178 < local24; local178++) {
				local29[local178].anIntArray82 = local176;
			}
			local4.anInt3070 = 0;
			for (local178 = 0; local178 < local24; local178++) {
				@Pc(221) Class105_Sub2 local221 = local29[local178];
				local227 = local221.anInt840 * local221.anInt841;
				local221.aByteArray25 = new byte[local227];
				@Pc(235) int local235 = local4.method22465((short) 16384);
				@Pc(266) int local266;
				if ((local235 & 0x2) == 0) {
					@Pc(245) int local245;
					if ((local235 & 0x1) == 0) {
						for (local245 = 0; local245 < local227; local245++) {
							local221.aByteArray25[local245] = local4.method22468(1989110394);
						}
					} else {
						for (local245 = 0; local245 < local221.anInt840; local245++) {
							for (local266 = 0; local266 < local221.anInt841; local266++) {
								local221.aByteArray25[local245 + local266 * local221.anInt840] = local4.method22468(485299088);
							}
						}
					}
				} else {
					@Pc(289) boolean local289 = false;
					local221.aByteArray26 = new byte[local227];
					if ((local235 & 0x1) == 0) {
						for (local266 = 0; local266 < local227; local266++) {
							local221.aByteArray25[local266] = local4.method22468(1413311366);
						}
						for (local266 = 0; local266 < local227; local266++) {
							@Pc(325) byte local325 = local221.aByteArray26[local266] = local4.method22468(1170109130);
							local289 |= local325 != -1;
						}
					} else {
						@Pc(345) int local345;
						for (local266 = 0; local266 < local221.anInt840; local266++) {
							for (local345 = 0; local345 < local221.anInt841; local345++) {
								local221.aByteArray25[local266 + local345 * local221.anInt840] = local4.method22468(1409577318);
							}
						}
						for (local266 = 0; local266 < local221.anInt840; local266++) {
							for (local345 = 0; local345 < local221.anInt841; local345++) {
								@Pc(391) byte local391 = local221.aByteArray26[local266 + local345 * local221.anInt840] = local4.method22468(818792899);
								local289 |= local391 != -1;
							}
						}
					}
					if (!local289) {
						local221.aByteArray26 = null;
					}
				}
			}
			return local29;
		} else {
			@Pc(416) Class105_Sub1[] local416 = new Class105_Sub1[local24];
			local4.anInt3070 = 0;
			local31 = local4.method22465((short) 16384);
			if (local31 == 0) {
				@Pc(434) boolean local434 = local4.method22465((short) 16384) == 1;
				local70 = local4.method22472(-1434290800);
				local72 = local4.method22472(-1434290800);
				for (local178 = 0; local178 < local24; local178++) {
					@Pc(452) int[] local452 = new int[local70 * local72];
					for (local227 = 0; local227 < local70 * local72; local227++) {
						local452[local227] = local4.method22478((short) 2544) | 0xFF000000;
						if (local452[local227] == -65281) {
							local452[local227] = 0;
						}
					}
					if (local434) {
						for (local227 = 0; local227 < local70 * local72; local227++) {
							local452[local227] &= 0xFFFFFF;
							local452[local227] |= local4.method22465((short) 16384) << 24;
						}
					}
					local416[local178] = new Class105_Sub1(local70, local72, local452);
				}
				return local416;
			} else if (local31 == 1) {
				throw new UnsupportedOperationException();
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "([B)[Lclient!de;", line = 36)
	public static Class105[] method24661(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class93_Sub41 local4 = new Class93_Sub41(arg0);
		local4.anInt3070 = (arg0.length - 2) * -1445626955;
		@Pc(16) int local16 = local4.method22472(-1434290800);
		@Pc(20) int local20 = local16 >> 15;
		@Pc(24) int local24 = local16 & 0x7FFF;
		@Pc(31) int local31;
		@Pc(70) int local70;
		@Pc(72) int local72;
		@Pc(178) int local178;
		@Pc(227) int local227;
		if (local20 == 0) {
			@Pc(29) Class105_Sub2[] local29 = new Class105_Sub2[local24];
			for (local31 = 0; local31 < local24; local31++) {
				local29[local31] = new Class105_Sub2();
			}
			local4.anInt3070 = (arg0.length - 7 - local24 * 8) * -1445626955;
			local31 = local4.method22472(-1434290800);
			@Pc(62) int local62 = local4.method22472(-1434290800);
			local70 = (local4.method22465((short) 16384) & 0xFF) + 1;
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt842 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt844 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt840 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt841 = local4.method22472(-1434290800);
			}
			for (local72 = 0; local72 < local24; local72++) {
				@Pc(135) Class105_Sub2 local135 = local29[local72];
				local135.anInt843 = local31 - local135.anInt840 - local135.anInt842;
				local135.anInt845 = local62 - local135.anInt841 - local135.anInt844;
			}
			local4.anInt3070 = (arg0.length - 7 - local24 * 8 - (local70 - 1) * 3) * -1445626955;
			@Pc(176) int[] local176 = new int[local70];
			for (local178 = 1; local178 < local70; local178++) {
				local176[local178] = local4.method22478((short) 7396);
				if (local176[local178] == 0) {
					local176[local178] = 1;
				}
			}
			for (local178 = 0; local178 < local24; local178++) {
				local29[local178].anIntArray82 = local176;
			}
			local4.anInt3070 = 0;
			for (local178 = 0; local178 < local24; local178++) {
				@Pc(221) Class105_Sub2 local221 = local29[local178];
				local227 = local221.anInt840 * local221.anInt841;
				local221.aByteArray25 = new byte[local227];
				@Pc(235) int local235 = local4.method22465((short) 16384);
				@Pc(266) int local266;
				if ((local235 & 0x2) == 0) {
					@Pc(245) int local245;
					if ((local235 & 0x1) == 0) {
						for (local245 = 0; local245 < local227; local245++) {
							local221.aByteArray25[local245] = local4.method22468(1064745818);
						}
					} else {
						for (local245 = 0; local245 < local221.anInt840; local245++) {
							for (local266 = 0; local266 < local221.anInt841; local266++) {
								local221.aByteArray25[local245 + local266 * local221.anInt840] = local4.method22468(1996353791);
							}
						}
					}
				} else {
					@Pc(289) boolean local289 = false;
					local221.aByteArray26 = new byte[local227];
					if ((local235 & 0x1) == 0) {
						for (local266 = 0; local266 < local227; local266++) {
							local221.aByteArray25[local266] = local4.method22468(1441773436);
						}
						for (local266 = 0; local266 < local227; local266++) {
							@Pc(325) byte local325 = local221.aByteArray26[local266] = local4.method22468(1527119951);
							local289 |= local325 != -1;
						}
					} else {
						@Pc(345) int local345;
						for (local266 = 0; local266 < local221.anInt840; local266++) {
							for (local345 = 0; local345 < local221.anInt841; local345++) {
								local221.aByteArray25[local266 + local345 * local221.anInt840] = local4.method22468(628839017);
							}
						}
						for (local266 = 0; local266 < local221.anInt840; local266++) {
							for (local345 = 0; local345 < local221.anInt841; local345++) {
								@Pc(391) byte local391 = local221.aByteArray26[local266 + local345 * local221.anInt840] = local4.method22468(1980450593);
								local289 |= local391 != -1;
							}
						}
					}
					if (!local289) {
						local221.aByteArray26 = null;
					}
				}
			}
			return local29;
		} else {
			@Pc(416) Class105_Sub1[] local416 = new Class105_Sub1[local24];
			local4.anInt3070 = 0;
			local31 = local4.method22465((short) 16384);
			if (local31 == 0) {
				@Pc(434) boolean local434 = local4.method22465((short) 16384) == 1;
				local70 = local4.method22472(-1434290800);
				local72 = local4.method22472(-1434290800);
				for (local178 = 0; local178 < local24; local178++) {
					@Pc(452) int[] local452 = new int[local70 * local72];
					for (local227 = 0; local227 < local70 * local72; local227++) {
						local452[local227] = local4.method22478((short) 402) | 0xFF000000;
						if (local452[local227] == -65281) {
							local452[local227] = 0;
						}
					}
					if (local434) {
						for (local227 = 0; local227 < local70 * local72; local227++) {
							local452[local227] &= 0xFFFFFF;
							local452[local227] |= local4.method22465((short) 16384) << 24;
						}
					}
					local416[local178] = new Class105_Sub1(local70, local72, local452);
				}
				return local416;
			} else if (local31 == 1) {
				throw new UnsupportedOperationException();
			} else {
				throw new RuntimeException();
			}
		}
	}
}
