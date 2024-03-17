package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/u")
public class JagDXException extends RuntimeException {

	@OriginalMember(owner = "client!jagdx/u", name = "<init>", descriptor = "()V", line = 8)
	public JagDXException() throws Throwable {
		throw new Error();
	}
}
