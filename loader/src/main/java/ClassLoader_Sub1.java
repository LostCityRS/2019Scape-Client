import java.io.IOException;
import java.io.InputStream;
import java.security.ProtectionDomain;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!g")
final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "I")
	static int anInt5990;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	static int anInt5991;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "I")
	static int anInt5992;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "I")
	static int anInt5993;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Lloader!e;")
	private Class724 aClass724_6;

	@OriginalMember(owner = "loader!g", name = "findClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 5)
	@Override
	protected final Class findClass(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		@Pc(1) boolean local1 = Class724.aBoolean888;
		anInt5991++;
		@Pc(8) Class724 local8 = this.aClass724_6;
		@Pc(16) Class local16 = (Class) ((Hashtable) ((Class724_Sub1_Sub1) local8).anObject40).get(arg0);
		@Pc(23) Class local23;
		if (local16 != null) {
			local23 = local16;
			if (!local1) {
				return local23;
			}
		}
		@Pc(39) byte[] var5;
		label55: {
			var5 = (byte[]) ((Hashtable) ((Class724_Sub1) local8).anObject39).get(arg0);
			if (var5 == null) {
				@Pc(55) String local55 = arg0.replace('.', '/') + ".class";
				@Pc(62) InputStream local62 = ((ClassLoader) ((Class724_Sub1_Sub1_Sub1_Sub1) local8).anObject42).getResourceAsStream(local55);
				if (local62 == null) {
					local23 = ((ClassLoader_Sub1) ((Class724_Sub1_Sub1_Sub1_Sub1) local8).anObject42).method36957(-406769596, arg0);
					if (!local1) {
						return local23;
					}
				}
				@Pc(77) byte[] local77 = new byte[5242880];
				@Pc(79) int local79 = 0;
				try {
					@Pc(88) int local88 = local62.read(local77, local79, -local79 + 5242880);
					while (local88 != -1) {
						local79 += local88;
						local88 = local62.read(local77, local79, -local79 + 5242880);
						if (local1 || local1) {
							break;
						}
					}
				} catch (@Pc(114) IOException local114) {
				}
				@Pc(117) byte[] local117 = new byte[local79];
				System.arraycopy(local77, 0, local117, 0, local79);
				try {
					var5 = Class727.method36971(local117, (byte) -76, (Class724) ((Class724_Sub1_Sub1_Sub1_Sub1_Sub1) local8).anObject43);
				} catch (@Pc(133) Exception local133) {
					throw new RuntimeException(local133);
				}
				if (!local1) {
					break label55;
				}
			}
			((Hashtable) ((Class724_Sub1) local8).anObject39).remove(arg0);
		}
		if (var5 != null) {
			@Pc(168) Class local168 = ((ClassLoader_Sub1) ((Class724_Sub1_Sub1_Sub1_Sub1) local8).anObject42).method36956(var5.length, 0, (ProtectionDomain) ((Class724_Sub1_Sub1_Sub1) local8).anObject41, 0, var5, arg0);
			((Hashtable) ((Class724_Sub1_Sub1) local8).anObject40).put(arg0, local168);
			local23 = local168;
			if (!local1) {
				return local23;
			}
		}
		local23 = ((ClassLoader_Sub1) ((Class724_Sub1_Sub1_Sub1_Sub1) local8).anObject42).method36957(-406769596, arg0);
		return local23;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "([BILjava/lang/String;B)I", line = 81)
	static final int method36955(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) byte arg3) {
		@Pc(1) boolean local1 = Class724.aBoolean888;
		anInt5993++;
		if (arg3 >= -85) {
			return 68;
		}
		@Pc(12) int local12 = arg1;
		@Pc(20) int local20 = arg2 == null ? 0 : arg2.length();
		@Pc(22) int local22 = 0;
		@Pc(36) int var10000;
		@Pc(39) int var10001;
		while (true) {
			if (local20 > local22) {
				@Pc(35) int local35 = Class724_Sub1_Sub1.method36964(arg2.charAt(local22), -101);
				var10000 = local20;
				var10001 = local22 + 1;
				if (local1) {
					break;
				}
				@Pc(55) int local55 = local20 <= var10001 ? -1 : Class724_Sub1_Sub1.method36964(arg2.charAt(local22 + 1), -71);
				@Pc(75) int local75 = local20 <= local22 + 2 ? -1 : Class724_Sub1_Sub1.method36964(arg2.charAt(local22 + 2), -96);
				@Pc(95) int local95 = local20 <= local22 + 3 ? -1 : Class724_Sub1_Sub1.method36964(arg2.charAt(local22 + 3), -102);
				arg0[arg1++] = (byte) (local55 >>> 4 | local35 << 2);
				if (local75 != -1 || local1) {
					arg0[arg1++] = (byte) (local75 >>> 2 | (local55 & 0xF) << 4);
					if (local95 != -1) {
						arg0[arg1++] = (byte) ((local75 & 0x3) << 6 | local95);
						local22 += 4;
						if (!local1) {
							continue;
						}
					}
				}
			}
			var10000 = -local12;
			var10001 = arg1;
			break;
		}
		return var10000 + var10001;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(IILjava/security/ProtectionDomain;I[BLjava/lang/String;)Ljava/lang/Class;", line = 123)
	private final Class method36956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) ProtectionDomain arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) String arg5) throws ClassFormatError {
		anInt5992++;
		if (arg1 != 0) {
			this.aClass724_6 = null;
		}
		return this.defineClass(arg5, arg4, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Lloader!e;)V", line = 133)
	ClassLoader_Sub1(@OriginalArg(0) Class724 arg0) {
		this.aClass724_6 = arg0;
	}

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 145)
	private final Class method36957(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) throws ClassNotFoundException {
		anInt5990++;
		return arg0 == -406769596 ? super.findSystemClass(arg1) : (Class) null;
	}
}
