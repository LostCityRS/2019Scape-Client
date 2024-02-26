import java.io.IOException;
import java.io.InputStream;
import java.security.ProtectionDomain;
import java.util.Hashtable;
import javax.crypto.Cipher;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!l")
final class ClassLoader_Sub1 extends ClassLoader {

	@OriginalMember(owner = "loader!l", name = "c", descriptor = "I")
	static int anInt57;

	@OriginalMember(owner = "loader!l", name = "b", descriptor = "I")
	static int anInt58;

	@OriginalMember(owner = "loader!l", name = "a", descriptor = "I")
	static int anInt59;

	@OriginalMember(owner = "loader!l", name = "d", descriptor = "Lloader!d;")
	private Class1 aClass1_6;

	@OriginalMember(owner = "loader!l", name = "<init>", descriptor = "(Lloader!d;)V")
	ClassLoader_Sub1(@OriginalArg(0) Class1 arg0) {
		this.aClass1_6 = arg0;
	}

	@OriginalMember(owner = "loader!l", name = "findClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	@Override
	protected Class findClass(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		anInt58++;
		@Pc(8) Class1 local8 = this.aClass1_6;
		@Pc(16) Class local16 = (Class) ((Hashtable) ((Class1_Sub1_Sub1_Sub1) local8).anObject14).get(arg0);
		@Pc(22) Class local22;
		if (local16 == null) {
			@Pc(33) byte[] local33 = (byte[]) ((Hashtable) ((Class1_Sub1_Sub1_Sub1_Sub1_Sub1) local8).anObject16).get(arg0);
			if (local33 == null) {
				@Pc(50) String local50 = arg0.replace('.', '/') + ".class";
				@Pc(57) InputStream local57 = ((ClassLoader) ((Class1_Sub1_Sub1) local8).anObject13).getResourceAsStream(local50);
				if (local57 == null) {
					local22 = ((ClassLoader_Sub1) ((Class1_Sub1_Sub1) local8).anObject13).method36(5242880, arg0);
					return local22;
				}
				@Pc(72) byte[] local72 = new byte[5242880];
				@Pc(74) int local74 = 0;
				try {
					for (@Pc(83) int local83 = local57.read(local72, local74, -local74 + 5242880); local83 != -1; local83 = local57.read(local72, local74, -local74 + 5242880)) {
						local74 += local83;
					}
				} catch (@Pc(107) IOException local107) {
				}
				@Pc(110) byte[] local110 = new byte[local74];
				System.arraycopy(local72, 0, local110, 0, local74);
				try {
					@Pc(121) Class1 local121 = (Class1) ((Class1_Sub1) local8).anObject12;
					@Pc(128) byte[] local128 = ((Cipher) ((Class1_Sub1) local121).anObject12).doFinal(local110);
					local33 = local128;
				} catch (@Pc(132) Exception local132) {
					throw new RuntimeException(local132);
				}
			} else {
				((Hashtable) ((Class1_Sub1_Sub1_Sub1_Sub1_Sub1) local8).anObject16).remove(arg0);
			}
			if (local33 == null) {
				local22 = ((ClassLoader_Sub1) ((Class1_Sub1_Sub1) local8).anObject13).method36(5242880, arg0);
			} else {
				@Pc(167) Class local167 = ((ClassLoader_Sub1) ((Class1_Sub1_Sub1) local8).anObject13).method37(local33, 0, (byte) -38, (ProtectionDomain) ((Class1_Sub1_Sub1_Sub1_Sub1) local8).anObject15, local33.length, arg0);
				((Hashtable) ((Class1_Sub1_Sub1_Sub1) local8).anObject14).put(arg0, local167);
				local22 = local167;
			}
		} else {
			local22 = local16;
		}
		return local22;
	}

	@OriginalMember(owner = "loader!l", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	private Class method36(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) throws ClassNotFoundException {
		anInt59++;
		if (arg0 != 5242880) {
			this.aClass1_6 = null;
		}
		return super.findSystemClass(arg1);
	}

	@OriginalMember(owner = "loader!l", name = "a", descriptor = "([BIBLjava/security/ProtectionDomain;ILjava/lang/String;)Ljava/lang/Class;")
	private Class method37(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) ProtectionDomain arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5) throws ClassFormatError {
		if (arg2 >= -16) {
			return (Class) null;
		} else {
			anInt57++;
			return this.defineClass(arg5, arg0, arg1, arg4, arg3);
		}
	}
}
