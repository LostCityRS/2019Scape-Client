package jagdx;

import deob.ObfuscatedName;

public final class IDirect3DDevice extends IUnknown {

	public IDirect3DDevice() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jagdx/IDirect3DDevice.e(JIF)I")
	public static int method42(long arg0, int arg1, float arg2) {
		return SetRenderStatef(arg0, arg1, arg2);
	}

	@ObfuscatedName("jagdx/IDirect3DDevice.n(JIZ)I")
	public static int method43(long arg0, int arg1, boolean arg2) {
		return SetRenderStateb(arg0, arg1, arg2);
	}

	public static native void Destroy(long arg0);

	public static native long GetRenderTarget(long arg0, int arg1);

	public static native void GetRenderTargetData(long arg0, long arg1, long arg2);

	public static native int SetRenderTarget(long arg0, int arg1, long arg2);

	public static native long CreateRenderTarget(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

	public static native long GetSwapChain(long arg0, int arg1);

	public static native long CreateAdditionalSwapChain(long arg0, D3DPRESENT_PARAMETERS arg1);

	public static native long GetDepthStencilSurface(long arg0);

	public static native int SetDepthStencilSurface(long arg0, long arg1);

	public static native long CreateDepthStencilSurface(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

	public static native long CreateOffscreenPlainSurface(long arg0, int arg1, int arg2, int arg3, int arg4);

	public static native long GetBackBuffer(long arg0, int arg1, int arg2, int arg3);

	public static native int StretchRect(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

	public static native long CreateVertexBuffer(long arg0, int arg1, int arg2, int arg3, int arg4);

	public static native long CreateIndexBuffer(long arg0, int arg1, int arg2, int arg3, int arg4);

	public static native long CreateVertexDeclaration(long arg0, long arg1);

	public static native int SetStreamSource(long arg0, int arg1, long arg2, int arg3, int arg4);

	public static native int SetVertexDeclaration(long arg0, long arg1);

	public static native int SetIndices(long arg0, long arg1);

	public static native int DrawIndexedPrimitive(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	public static native int DrawIndexedPrimitiveIB(long arg0, long arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public static native int DrawPrimitive(long arg0, int arg1, int arg2, int arg3);

	public static native long CreateTexture(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

	public static native long CreateCubeTexture(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

	public static native long CreateVolumeTexture(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

	public static native int SetTexture(long arg0, int arg1, long arg2);

	public static native int SetTextureStageState(long arg0, int arg1, int arg2, int arg3);

	public static native int SetSamplerState(long arg0, int arg1, int arg2, int arg3);

	public static native int UpdateTexture(long arg0, long arg1, long arg2);

	public static native long CreateVertexShader(long arg0, byte[] arg1);

	public static native long CreatePixelShader(long arg0, byte[] arg1);

	public static native int SetPixelShader(long arg0, long arg1);

	public static native int SetVertexShader(long arg0, long arg1);

	public static native int SetPixelShaderConstantF(long arg0, int arg1, long arg2, int arg3);

	public static native int SetVertexShaderConstantF(long arg0, int arg1, long arg2, int arg3);

	public static native long CreateEventQuery(long arg0);

	public static native int Clear(long arg0, int arg1, int arg2, float arg3, int arg4);

	public static native int BeginScene(long arg0);

	public static native int EndScene(long arg0);

	public static native int SetTransform(long arg0, int arg1, float[] arg2);

	public static native int SetScissorRect(long arg0, int arg1, int arg2, int arg3, int arg4);

	public static native int SetViewport(long arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6);

	public static native int SetRenderState(long arg0, int arg1, int arg2);

	public static native int SetRenderStatef(long arg0, int arg1, float arg2);

	public static native int SetRenderStateb(long arg0, int arg1, boolean arg2);

	public static native int SetLight(long arg0, int arg1, long arg2);

	public static native boolean LightEnable(long arg0, int arg1, boolean arg2);

	public static native int Reset(long arg0, D3DPRESENT_PARAMETERS arg1);

	public static native int TestCooperativeLevel(long arg0);
}
