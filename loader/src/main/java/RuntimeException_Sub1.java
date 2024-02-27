import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "I")
	static int anInt17;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "I")
	static int anInt18;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "[I")
	static int[] anIntArray1 = new int[128];

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "Ljava/lang/Throwable;")
	Throwable aThrowable1;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "Ljava/lang/String;")
	String aString1;

	static {
		@Pc(31) int local31;
		for (local31 = 0; local31 < anIntArray1.length; local31++) {
			anIntArray1[local31] = -1;
		}
		for (local31 = 65; local31 <= 90; local31++) {
			anIntArray1[local31] = local31 - 65;
		}
		for (local31 = 97; local31 <= 122; local31++) {
			anIntArray1[local31] = local31 - 71;
		}
		for (local31 = 48; local31 <= 57; local31++) {
			anIntArray1[local31] = local31 + -48 - -52;
		}
		@Pc(92) int[] local92 = anIntArray1;
		anIntArray1[43] = 62;
		local92[42] = 62;
		@Pc(102) int[] local102 = anIntArray1;
		anIntArray1[47] = 63;
		local102[45] = 63;
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(CI)B")
	static byte method7(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = Class1.aBoolean7;
		anInt17++;
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

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/lang/String;ILloader!e;[B)V")
	static void method8(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) byte[] arg3) {
		((Hashtable) ((Class1_Sub1) arg2).anObject12).put(arg0, arg3);
		anInt18++;
		if (arg1 != 63) {
			anIntArray1 = null;
		}
	}

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aThrowable1 = arg0;
		this.aString1 = arg1;
		this.initCause(arg0);
	}
}
