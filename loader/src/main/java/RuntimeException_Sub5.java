import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
final class RuntimeException_Sub5 extends RuntimeException {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "I")
	static int anInt5985;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	static int anInt5986;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "[I")
	static int[] anIntArray529 = new int[128];

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "Ljava/lang/Throwable;")
	Throwable aThrowable2;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "Ljava/lang/String;")
	String aString246;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(CI)B", line = 8)
	static final byte method36950(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = Class724.aBoolean888;
		anInt5985++;
		@Pc(13) int local13 = -15 % ((arg1 - 45) / 41);
		@Pc(47) byte local47;
		if ((arg0 <= '\u0000' || arg0 >= '\u0080') && (arg0 < ' ' || arg0 > 'ÿ')) {
			if (arg0 != '€') {
				if (arg0 == '‚') {
					local47 = -126;
					if (!local1) {
						return local47;
					}
				}
				if (arg0 != 'ƒ') {
					if (arg0 != '„') {
						if (arg0 != '…') {
							if (arg0 == '†') {
								local47 = -122;
								if (!local1) {
									return local47;
								}
							}
							if (arg0 != '‡') {
								if (arg0 == 'ˆ') {
									local47 = -120;
									if (!local1) {
										return local47;
									}
								}
								if (arg0 != '‰') {
									if (arg0 != 'Š') {
										if (arg0 != '‹') {
											if (arg0 != 'Œ') {
												if (arg0 == 'Ž') {
													local47 = -114;
													if (!local1) {
														return local47;
													}
												}
												if (arg0 == '‘') {
													local47 = -111;
													if (!local1) {
														return local47;
													}
												}
												if (arg0 != '’') {
													if (arg0 != '“') {
														if (arg0 != '”') {
															if (arg0 == '•') {
																local47 = -107;
																if (!local1) {
																	return local47;
																}
															}
															if (arg0 != '–') {
																if (arg0 != '—') {
																	if (arg0 == '˜') {
																		local47 = -104;
																		if (!local1) {
																			return local47;
																		}
																	}
																	if (arg0 != '™') {
																		if (arg0 != 'š') {
																			if (arg0 != '›') {
																				if (arg0 != 'œ') {
																					if (arg0 == 'ž') {
																						local47 = -98;
																						if (!local1) {
																							return local47;
																						}
																					}
																					if (arg0 == 'Ÿ') {
																						local47 = -97;
																						if (!local1) {
																							return local47;
																						}
																					}
																					local47 = 63;
																					if (!local1) {
																						return local47;
																					}
																				}
																				local47 = -100;
																				if (!local1) {
																					return local47;
																				}
																			}
																			local47 = -101;
																			if (!local1) {
																				return local47;
																			}
																		}
																		local47 = -102;
																		if (!local1) {
																			return local47;
																		}
																	}
																	local47 = -103;
																	if (!local1) {
																		return local47;
																	}
																}
																local47 = -105;
																if (!local1) {
																	return local47;
																}
															}
															local47 = -106;
															if (!local1) {
																return local47;
															}
														}
														local47 = -108;
														if (!local1) {
															return local47;
														}
													}
													local47 = -109;
													if (!local1) {
														return local47;
													}
												}
												local47 = -110;
												if (!local1) {
													return local47;
												}
											}
											local47 = -116;
											if (!local1) {
												return local47;
											}
										}
										local47 = -117;
										if (!local1) {
											return local47;
										}
									}
									local47 = -118;
									if (!local1) {
										return local47;
									}
								}
								local47 = -119;
								if (!local1) {
									return local47;
								}
							}
							local47 = -121;
							if (!local1) {
								return local47;
							}
						}
						local47 = -123;
						if (!local1) {
							return local47;
						}
					}
					local47 = -124;
					if (!local1) {
						return local47;
					}
				}
				local47 = -125;
				if (!local1) {
					return local47;
				}
			}
			local47 = -128;
			if (!local1) {
				return local47;
			}
		}
		local47 = (byte) arg0;
		return local47;
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 130)
	RuntimeException_Sub5(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable2 = arg0;
		this.aString246 = arg1;
		this.initCause(arg0);
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;ILloader!e;[B)V", line = 141)
	static final void method36951(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class724 arg2, @OriginalArg(3) byte[] arg3) {
		((Hashtable) ((Class724_Sub1) arg2).anObject39).put(arg0, arg3);
		anInt5986++;
		if (arg1 != 63) {
			anIntArray529 = null;
		}
	}

	static {
		@Pc(31) int local31;
		for (local31 = 0; local31 < anIntArray529.length; local31++) {
			anIntArray529[local31] = -1;
		}
		for (local31 = 65; local31 <= 90; local31++) {
			anIntArray529[local31] = local31 - 65;
		}
		for (local31 = 97; local31 <= 122; local31++) {
			anIntArray529[local31] = local31 - 71;
		}
		for (local31 = 48; local31 <= 57; local31++) {
			anIntArray529[local31] = local31 + -48 - -52;
		}
		@Pc(92) int[] local92 = anIntArray529;
		anIntArray529[43] = 62;
		local92[42] = 62;
		@Pc(102) int[] local102 = anIntArray529;
		anIntArray529[47] = 63;
		local102[45] = 63;
	}
}
