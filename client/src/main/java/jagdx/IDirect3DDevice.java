package jagdx;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/IDirect3DDevice")
public final class IDirect3DDevice extends IUnknown {

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "Destroy", descriptor = "(J)V")
	public static native void Destroy(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "GetRenderTarget", descriptor = "(JI)J")
	public static native long GetRenderTarget(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "GetRenderTargetData", descriptor = "(JJJ)V")
	public static native void GetRenderTargetData(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderTarget", descriptor = "(JIJ)I")
	public static native int SetRenderTarget(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateRenderTarget", descriptor = "(JIIIIIZ)J")
	public static native long CreateRenderTarget(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "GetSwapChain", descriptor = "(JI)J")
	public static native long GetSwapChain(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateAdditionalSwapChain", descriptor = "(JLclient!jagdx/D3DPRESENT_PARAMETERS;)J")
	public static native long CreateAdditionalSwapChain(@OriginalArg(0) long arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "GetDepthStencilSurface", descriptor = "(J)J")
	public static native long GetDepthStencilSurface(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetDepthStencilSurface", descriptor = "(JJ)I")
	public static native int SetDepthStencilSurface(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateDepthStencilSurface", descriptor = "(JIIIIIZ)J")
	public static native long CreateDepthStencilSurface(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateOffscreenPlainSurface", descriptor = "(JIIII)J")
	public static native long CreateOffscreenPlainSurface(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "GetBackBuffer", descriptor = "(JIII)J")
	public static native long GetBackBuffer(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "StretchRect", descriptor = "(JJIIIIJIIIII)I")
	public static native int StretchRect(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateVertexBuffer", descriptor = "(JIIII)J")
	public static native long CreateVertexBuffer(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateIndexBuffer", descriptor = "(JIIII)J")
	public static native long CreateIndexBuffer(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateVertexDeclaration", descriptor = "(JJ)J")
	public static native long CreateVertexDeclaration(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetStreamSource", descriptor = "(JIJII)I")
	public static native int SetStreamSource(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetVertexDeclaration", descriptor = "(JJ)I")
	public static native int SetVertexDeclaration(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetIndices", descriptor = "(JJ)I")
	public static native int SetIndices(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "DrawIndexedPrimitive", descriptor = "(JIIIIII)I")
	public static native int DrawIndexedPrimitive(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "DrawIndexedPrimitiveIB", descriptor = "(JJIIIIII)I")
	public static native int DrawIndexedPrimitiveIB(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "DrawPrimitive", descriptor = "(JIII)I")
	public static native int DrawPrimitive(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateTexture", descriptor = "(JIIIIII)J")
	public static native long CreateTexture(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateCubeTexture", descriptor = "(JIIIII)J")
	public static native long CreateCubeTexture(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateVolumeTexture", descriptor = "(JIIIIIII)J")
	public static native long CreateVolumeTexture(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetTexture", descriptor = "(JIJ)I")
	public static native int SetTexture(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetTextureStageState", descriptor = "(JIII)I")
	public static native int SetTextureStageState(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetSamplerState", descriptor = "(JIII)I")
	public static native int SetSamplerState(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "UpdateTexture", descriptor = "(JJJ)I")
	public static native int UpdateTexture(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateVertexShader", descriptor = "(J[B)J")
	public static native long CreateVertexShader(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreatePixelShader", descriptor = "(J[B)J")
	public static native long CreatePixelShader(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetPixelShader", descriptor = "(JJ)I")
	public static native int SetPixelShader(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetVertexShader", descriptor = "(JJ)I")
	public static native int SetVertexShader(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetPixelShaderConstantF", descriptor = "(JIJI)I")
	public static native int SetPixelShaderConstantF(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetVertexShaderConstantF", descriptor = "(JIJI)I")
	public static native int SetVertexShaderConstantF(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "CreateEventQuery", descriptor = "(J)J")
	public static native long CreateEventQuery(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "Clear", descriptor = "(JIIFI)I")
	public static native int Clear(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "BeginScene", descriptor = "(J)I")
	public static native int BeginScene(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "EndScene", descriptor = "(J)I")
	public static native int EndScene(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetTransform", descriptor = "(JI[F)I")
	public static native int SetTransform(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetScissorRect", descriptor = "(JIIII)I")
	public static native int SetScissorRect(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetViewport", descriptor = "(JIIIIFF)I")
	public static native int SetViewport(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "e", descriptor = "(JIF)I")
	public static int method27881(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return SetRenderStatef(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "n", descriptor = "(JIZ)I")
	public static int method27882(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return SetRenderStateb(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderState", descriptor = "(JII)I")
	public static native int SetRenderState(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderStatef", descriptor = "(JIF)I")
	private static native int SetRenderStatef(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetRenderStateb", descriptor = "(JIZ)I")
	private static native int SetRenderStateb(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "SetLight", descriptor = "(JIJ)I")
	public static native int SetLight(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "LightEnable", descriptor = "(JIZ)Z")
	public static native boolean LightEnable(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "Reset", descriptor = "(JLclient!jagdx/D3DPRESENT_PARAMETERS;)I")
	public static native int Reset(@OriginalArg(0) long arg0, @OriginalArg(1) D3DPRESENT_PARAMETERS arg1);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "TestCooperativeLevel", descriptor = "(J)I")
	public static native int TestCooperativeLevel(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "m", descriptor = "(JIF)I")
	public static int method27883(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return SetRenderStatef(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "k", descriptor = "(JIF)I")
	public static int method27884(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return SetRenderStatef(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "f", descriptor = "(JIZ)I")
	public static int method27885(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return SetRenderStateb(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "w", descriptor = "(JIZ)I")
	public static int method27886(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return SetRenderStateb(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jagdx/IDirect3DDevice", name = "<init>", descriptor = "()V")
	private IDirect3DDevice() throws Throwable {
		throw new Error();
	}
}
