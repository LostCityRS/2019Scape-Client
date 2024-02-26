package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class212 {

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "I")
	static final int anInt3607 = 0;

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	static final int anInt3608 = 1;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
	static final int anInt3609 = 0;

	@OriginalMember(owner = "client!cq", name = "t", descriptor = "(Lclient!pf;II)Lclient!da;")
	public static Class109 method25822(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : method25825(local5)[0];
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(Lclient!pf;I)Lclient!da;")
	public static Class109 method25823(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method29926(arg1, 1472047355);
		return local4 == null ? null : method25825(local4)[0];
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(Lclient!pf;II)[Lclient!da;")
	public static Class109[] method25824(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : method25825(local5);
	}

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "([B)[Lclient!da;")
	public static Class109[] method25825(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Packet local4 = new Packet(arg0);
		local4.pos = (arg0.length - 2) * 1034180571;
		@Pc(16) int local16 = local4.g2();
		@Pc(20) int local20 = local16 >> 15;
		@Pc(24) int local24 = local16 & 0x7FFF;
		@Pc(31) int local31;
		@Pc(70) int local70;
		@Pc(72) int local72;
		@Pc(178) int local178;
		@Pc(227) int local227;
		if (local20 == 0) {
			@Pc(29) Class109_Sub2[] local29 = new Class109_Sub2[local24];
			for (local31 = 0; local31 < local24; local31++) {
				local29[local31] = new Class109_Sub2();
			}
			local4.pos = (arg0.length - 7 - local24 * 8) * 1034180571;
			local31 = local4.g2();
			@Pc(62) int local62 = local4.g2();
			local70 = (local4.g1() & 0xFF) + 1;
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt857 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt859 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt861 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt856 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				@Pc(135) Class109_Sub2 local135 = local29[local72];
				local135.anInt858 = local31 - local135.anInt861 - local135.anInt857;
				local135.anInt860 = local62 - local135.anInt856 - local135.anInt859;
			}
			local4.pos = (arg0.length - 7 - local24 * 8 - (local70 - 1) * 3) * 1034180571;
			@Pc(176) int[] local176 = new int[local70];
			for (local178 = 1; local178 < local70; local178++) {
				local176[local178] = local4.g3();
				if (local176[local178] == 0) {
					local176[local178] = 1;
				}
			}
			for (local178 = 0; local178 < local24; local178++) {
				local29[local178].anIntArray79 = local176;
			}
			local4.pos = 0;
			for (local178 = 0; local178 < local24; local178++) {
				@Pc(221) Class109_Sub2 local221 = local29[local178];
				local227 = local221.anInt861 * local221.anInt856;
				local221.aByteArray25 = new byte[local227];
				@Pc(235) int local235 = local4.g1();
				@Pc(266) int local266;
				if ((local235 & 0x2) == 0) {
					@Pc(245) int local245;
					if ((local235 & 0x1) == 0) {
						for (local245 = 0; local245 < local227; local245++) {
							local221.aByteArray25[local245] = local4.g1b();
						}
					} else {
						for (local245 = 0; local245 < local221.anInt861; local245++) {
							for (local266 = 0; local266 < local221.anInt856; local266++) {
								local221.aByteArray25[local245 + local266 * local221.anInt861] = local4.g1b();
							}
						}
					}
				} else {
					@Pc(289) boolean local289 = false;
					local221.aByteArray26 = new byte[local227];
					if ((local235 & 0x1) == 0) {
						for (local266 = 0; local266 < local227; local266++) {
							local221.aByteArray25[local266] = local4.g1b();
						}
						for (local266 = 0; local266 < local227; local266++) {
							@Pc(325) byte local325 = local221.aByteArray26[local266] = local4.g1b();
							local289 |= local325 != -1;
						}
					} else {
						@Pc(345) int local345;
						for (local266 = 0; local266 < local221.anInt861; local266++) {
							for (local345 = 0; local345 < local221.anInt856; local345++) {
								local221.aByteArray25[local266 + local345 * local221.anInt861] = local4.g1b();
							}
						}
						for (local266 = 0; local266 < local221.anInt861; local266++) {
							for (local345 = 0; local345 < local221.anInt856; local345++) {
								@Pc(391) byte local391 = local221.aByteArray26[local266 + local345 * local221.anInt861] = local4.g1b();
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
			@Pc(416) Class109_Sub1[] local416 = new Class109_Sub1[local24];
			local4.pos = 0;
			local31 = local4.g1();
			if (local31 == 0) {
				@Pc(434) boolean local434 = local4.g1() == 1;
				local70 = local4.g2();
				local72 = local4.g2();
				for (local178 = 0; local178 < local24; local178++) {
					@Pc(452) int[] local452 = new int[local70 * local72];
					for (local227 = 0; local227 < local70 * local72; local227++) {
						local452[local227] = local4.g3() | 0xFF000000;
						if (local452[local227] == -65281) {
							local452[local227] = 0;
						}
					}
					if (local434) {
						for (local227 = 0; local227 < local70 * local72; local227++) {
							local452[local227] &= 0xFFFFFF;
							local452[local227] |= local4.g1() << 24;
						}
					}
					local416[local178] = new Class109_Sub1(local70, local72, local452);
				}
				return local416;
			} else if (local31 == 1) {
				throw new UnsupportedOperationException();
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "(Lclient!pf;II)Lclient!da;")
	public static Class109 method25826(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : method25825(local5)[0];
	}

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "(Lclient!pf;II)Lclient!da;")
	public static Class109 method25827(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : method25825(local5)[0];
	}

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "(Lclient!pf;II)Lclient!da;")
	public static Class109 method25828(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : method25825(local5)[0];
	}

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "([B)[Lclient!da;")
	public static Class109[] method25829(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Packet local4 = new Packet(arg0);
		local4.pos = (arg0.length - 2) * 1034180571;
		@Pc(16) int local16 = local4.g2();
		@Pc(20) int local20 = local16 >> 15;
		@Pc(24) int local24 = local16 & 0x7FFF;
		@Pc(31) int local31;
		@Pc(70) int local70;
		@Pc(72) int local72;
		@Pc(178) int local178;
		@Pc(227) int local227;
		if (local20 == 0) {
			@Pc(29) Class109_Sub2[] local29 = new Class109_Sub2[local24];
			for (local31 = 0; local31 < local24; local31++) {
				local29[local31] = new Class109_Sub2();
			}
			local4.pos = (arg0.length - 7 - local24 * 8) * 1034180571;
			local31 = local4.g2();
			@Pc(62) int local62 = local4.g2();
			local70 = (local4.g1() & 0xFF) + 1;
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt857 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt859 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt861 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt856 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				@Pc(135) Class109_Sub2 local135 = local29[local72];
				local135.anInt858 = local31 - local135.anInt861 - local135.anInt857;
				local135.anInt860 = local62 - local135.anInt856 - local135.anInt859;
			}
			local4.pos = (arg0.length - 7 - local24 * 8 - (local70 - 1) * 3) * 1034180571;
			@Pc(176) int[] local176 = new int[local70];
			for (local178 = 1; local178 < local70; local178++) {
				local176[local178] = local4.g3();
				if (local176[local178] == 0) {
					local176[local178] = 1;
				}
			}
			for (local178 = 0; local178 < local24; local178++) {
				local29[local178].anIntArray79 = local176;
			}
			local4.pos = 0;
			for (local178 = 0; local178 < local24; local178++) {
				@Pc(221) Class109_Sub2 local221 = local29[local178];
				local227 = local221.anInt861 * local221.anInt856;
				local221.aByteArray25 = new byte[local227];
				@Pc(235) int local235 = local4.g1();
				@Pc(266) int local266;
				if ((local235 & 0x2) == 0) {
					@Pc(245) int local245;
					if ((local235 & 0x1) == 0) {
						for (local245 = 0; local245 < local227; local245++) {
							local221.aByteArray25[local245] = local4.g1b();
						}
					} else {
						for (local245 = 0; local245 < local221.anInt861; local245++) {
							for (local266 = 0; local266 < local221.anInt856; local266++) {
								local221.aByteArray25[local245 + local266 * local221.anInt861] = local4.g1b();
							}
						}
					}
				} else {
					@Pc(289) boolean local289 = false;
					local221.aByteArray26 = new byte[local227];
					if ((local235 & 0x1) == 0) {
						for (local266 = 0; local266 < local227; local266++) {
							local221.aByteArray25[local266] = local4.g1b();
						}
						for (local266 = 0; local266 < local227; local266++) {
							@Pc(325) byte local325 = local221.aByteArray26[local266] = local4.g1b();
							local289 |= local325 != -1;
						}
					} else {
						@Pc(345) int local345;
						for (local266 = 0; local266 < local221.anInt861; local266++) {
							for (local345 = 0; local345 < local221.anInt856; local345++) {
								local221.aByteArray25[local266 + local345 * local221.anInt861] = local4.g1b();
							}
						}
						for (local266 = 0; local266 < local221.anInt861; local266++) {
							for (local345 = 0; local345 < local221.anInt856; local345++) {
								@Pc(391) byte local391 = local221.aByteArray26[local266 + local345 * local221.anInt861] = local4.g1b();
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
			@Pc(416) Class109_Sub1[] local416 = new Class109_Sub1[local24];
			local4.pos = 0;
			local31 = local4.g1();
			if (local31 == 0) {
				@Pc(434) boolean local434 = local4.g1() == 1;
				local70 = local4.g2();
				local72 = local4.g2();
				for (local178 = 0; local178 < local24; local178++) {
					@Pc(452) int[] local452 = new int[local70 * local72];
					for (local227 = 0; local227 < local70 * local72; local227++) {
						local452[local227] = local4.g3() | 0xFF000000;
						if (local452[local227] == -65281) {
							local452[local227] = 0;
						}
					}
					if (local434) {
						for (local227 = 0; local227 < local70 * local72; local227++) {
							local452[local227] &= 0xFFFFFF;
							local452[local227] |= local4.g1() << 24;
						}
					}
					local416[local178] = new Class109_Sub1(local70, local72, local452);
				}
				return local416;
			} else if (local31 == 1) {
				throw new UnsupportedOperationException();
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "(Lclient!pf;I)Lclient!da;")
	public static Class109 method25830(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method29926(arg1, 1472047355);
		return local4 == null ? null : method25825(local4)[0];
	}

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "(Lclient!pf;I)Lclient!da;")
	public static Class109 method25831(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method29926(arg1, 1472047355);
		return local4 == null ? null : method25825(local4)[0];
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!pf;II)[Lclient!da;")
	public static Class109[] method25832(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : method25825(local5);
	}

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "(Lclient!pf;II)[Lclient!da;")
	public static Class109[] method25833(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : method25825(local5);
	}

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "(Lclient!pf;II)[Lclient!da;")
	public static Class109[] method25834(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : method25825(local5);
	}

	@OriginalMember(owner = "client!cq", name = "x", descriptor = "([B)[Lclient!da;")
	public static Class109[] method25835(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Packet local4 = new Packet(arg0);
		local4.pos = (arg0.length - 2) * 1034180571;
		@Pc(16) int local16 = local4.g2();
		@Pc(20) int local20 = local16 >> 15;
		@Pc(24) int local24 = local16 & 0x7FFF;
		@Pc(31) int local31;
		@Pc(70) int local70;
		@Pc(72) int local72;
		@Pc(178) int local178;
		@Pc(227) int local227;
		if (local20 == 0) {
			@Pc(29) Class109_Sub2[] local29 = new Class109_Sub2[local24];
			for (local31 = 0; local31 < local24; local31++) {
				local29[local31] = new Class109_Sub2();
			}
			local4.pos = (arg0.length - 7 - local24 * 8) * 1034180571;
			local31 = local4.g2();
			@Pc(62) int local62 = local4.g2();
			local70 = (local4.g1() & 0xFF) + 1;
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt857 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt859 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt861 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				local29[local72].anInt856 = local4.g2();
			}
			for (local72 = 0; local72 < local24; local72++) {
				@Pc(135) Class109_Sub2 local135 = local29[local72];
				local135.anInt858 = local31 - local135.anInt861 - local135.anInt857;
				local135.anInt860 = local62 - local135.anInt856 - local135.anInt859;
			}
			local4.pos = (arg0.length - 7 - local24 * 8 - (local70 - 1) * 3) * 1034180571;
			@Pc(176) int[] local176 = new int[local70];
			for (local178 = 1; local178 < local70; local178++) {
				local176[local178] = local4.g3();
				if (local176[local178] == 0) {
					local176[local178] = 1;
				}
			}
			for (local178 = 0; local178 < local24; local178++) {
				local29[local178].anIntArray79 = local176;
			}
			local4.pos = 0;
			for (local178 = 0; local178 < local24; local178++) {
				@Pc(221) Class109_Sub2 local221 = local29[local178];
				local227 = local221.anInt861 * local221.anInt856;
				local221.aByteArray25 = new byte[local227];
				@Pc(235) int local235 = local4.g1();
				@Pc(266) int local266;
				if ((local235 & 0x2) == 0) {
					@Pc(245) int local245;
					if ((local235 & 0x1) == 0) {
						for (local245 = 0; local245 < local227; local245++) {
							local221.aByteArray25[local245] = local4.g1b();
						}
					} else {
						for (local245 = 0; local245 < local221.anInt861; local245++) {
							for (local266 = 0; local266 < local221.anInt856; local266++) {
								local221.aByteArray25[local245 + local266 * local221.anInt861] = local4.g1b();
							}
						}
					}
				} else {
					@Pc(289) boolean local289 = false;
					local221.aByteArray26 = new byte[local227];
					if ((local235 & 0x1) == 0) {
						for (local266 = 0; local266 < local227; local266++) {
							local221.aByteArray25[local266] = local4.g1b();
						}
						for (local266 = 0; local266 < local227; local266++) {
							@Pc(325) byte local325 = local221.aByteArray26[local266] = local4.g1b();
							local289 |= local325 != -1;
						}
					} else {
						@Pc(345) int local345;
						for (local266 = 0; local266 < local221.anInt861; local266++) {
							for (local345 = 0; local345 < local221.anInt856; local345++) {
								local221.aByteArray25[local266 + local345 * local221.anInt861] = local4.g1b();
							}
						}
						for (local266 = 0; local266 < local221.anInt861; local266++) {
							for (local345 = 0; local345 < local221.anInt856; local345++) {
								@Pc(391) byte local391 = local221.aByteArray26[local266 + local345 * local221.anInt861] = local4.g1b();
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
			@Pc(416) Class109_Sub1[] local416 = new Class109_Sub1[local24];
			local4.pos = 0;
			local31 = local4.g1();
			if (local31 == 0) {
				@Pc(434) boolean local434 = local4.g1() == 1;
				local70 = local4.g2();
				local72 = local4.g2();
				for (local178 = 0; local178 < local24; local178++) {
					@Pc(452) int[] local452 = new int[local70 * local72];
					for (local227 = 0; local227 < local70 * local72; local227++) {
						local452[local227] = local4.g3() | 0xFF000000;
						if (local452[local227] == -65281) {
							local452[local227] = 0;
						}
					}
					if (local434) {
						for (local227 = 0; local227 < local70 * local72; local227++) {
							local452[local227] &= 0xFFFFFF;
							local452[local227] |= local4.g1() << 24;
						}
					}
					local416[local178] = new Class109_Sub1(local70, local72, local452);
				}
				return local416;
			} else if (local31 == 1) {
				throw new UnsupportedOperationException();
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "(Lclient!pf;II)[Lclient!da;")
	public static Class109[] method25836(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.method29918(arg1, arg2, 1896589581);
		return local5 == null ? null : method25825(local5);
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	Class212() throws Throwable {
		throw new Error();
	}
}
