package md5bc48b90eb6f2f14ab5d5f7d893d447bd;


public class CameraActivity_Camera2BasicFragment_Camera2BasicSurfaceTextureListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.TextureView.SurfaceTextureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSurfaceTextureAvailable:(Landroid/graphics/SurfaceTexture;II)V:GetOnSurfaceTextureAvailable_Landroid_graphics_SurfaceTexture_IIHandler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onSurfaceTextureDestroyed:(Landroid/graphics/SurfaceTexture;)Z:GetOnSurfaceTextureDestroyed_Landroid_graphics_SurfaceTexture_Handler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onSurfaceTextureSizeChanged:(Landroid/graphics/SurfaceTexture;II)V:GetOnSurfaceTextureSizeChanged_Landroid_graphics_SurfaceTexture_IIHandler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onSurfaceTextureUpdated:(Landroid/graphics/SurfaceTexture;)V:GetOnSurfaceTextureUpdated_Landroid_graphics_SurfaceTexture_Handler:Android.Views.TextureView/ISurfaceTextureListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("AlcoStoper.CameraActivity+Camera2BasicFragment+Camera2BasicSurfaceTextureListener, AlcoStoper, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CameraActivity_Camera2BasicFragment_Camera2BasicSurfaceTextureListener.class, __md_methods);
	}


	public CameraActivity_Camera2BasicFragment_Camera2BasicSurfaceTextureListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CameraActivity_Camera2BasicFragment_Camera2BasicSurfaceTextureListener.class)
			mono.android.TypeManager.Activate ("AlcoStoper.CameraActivity+Camera2BasicFragment+Camera2BasicSurfaceTextureListener, AlcoStoper, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public CameraActivity_Camera2BasicFragment_Camera2BasicSurfaceTextureListener (md5bc48b90eb6f2f14ab5d5f7d893d447bd.CameraActivity_Camera2BasicFragment p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == CameraActivity_Camera2BasicFragment_Camera2BasicSurfaceTextureListener.class)
			mono.android.TypeManager.Activate ("AlcoStoper.CameraActivity+Camera2BasicFragment+Camera2BasicSurfaceTextureListener, AlcoStoper, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "AlcoStoper.CameraActivity+Camera2BasicFragment, AlcoStoper, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onSurfaceTextureAvailable (android.graphics.SurfaceTexture p0, int p1, int p2)
	{
		n_onSurfaceTextureAvailable (p0, p1, p2);
	}

	private native void n_onSurfaceTextureAvailable (android.graphics.SurfaceTexture p0, int p1, int p2);


	public boolean onSurfaceTextureDestroyed (android.graphics.SurfaceTexture p0)
	{
		return n_onSurfaceTextureDestroyed (p0);
	}

	private native boolean n_onSurfaceTextureDestroyed (android.graphics.SurfaceTexture p0);


	public void onSurfaceTextureSizeChanged (android.graphics.SurfaceTexture p0, int p1, int p2)
	{
		n_onSurfaceTextureSizeChanged (p0, p1, p2);
	}

	private native void n_onSurfaceTextureSizeChanged (android.graphics.SurfaceTexture p0, int p1, int p2);


	public void onSurfaceTextureUpdated (android.graphics.SurfaceTexture p0)
	{
		n_onSurfaceTextureUpdated (p0);
	}

	private native void n_onSurfaceTextureUpdated (android.graphics.SurfaceTexture p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
