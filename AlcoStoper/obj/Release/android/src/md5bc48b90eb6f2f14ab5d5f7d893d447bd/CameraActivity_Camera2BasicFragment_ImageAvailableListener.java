package md5bc48b90eb6f2f14ab5d5f7d893d447bd;


public class CameraActivity_Camera2BasicFragment_ImageAvailableListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.ImageReader.OnImageAvailableListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onImageAvailable:(Landroid/media/ImageReader;)V:GetOnImageAvailable_Landroid_media_ImageReader_Handler:Android.Media.ImageReader/IOnImageAvailableListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("AlcoStoper.CameraActivity+Camera2BasicFragment+ImageAvailableListener, AlcoStoper, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CameraActivity_Camera2BasicFragment_ImageAvailableListener.class, __md_methods);
	}


	public CameraActivity_Camera2BasicFragment_ImageAvailableListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CameraActivity_Camera2BasicFragment_ImageAvailableListener.class)
			mono.android.TypeManager.Activate ("AlcoStoper.CameraActivity+Camera2BasicFragment+ImageAvailableListener, AlcoStoper, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onImageAvailable (android.media.ImageReader p0)
	{
		n_onImageAvailable (p0);
	}

	private native void n_onImageAvailable (android.media.ImageReader p0);

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
