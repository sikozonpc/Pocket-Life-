package md5c56f6fdfba6870db70a3763c37ee79e6;


public class C1ToggleButtonRenderer
	extends md5c56f6fdfba6870db70a3763c37ee79e6.C1ViewRenderer_2
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("C1.Xamarin.Forms.Core.Platform.Android.C1ToggleButtonRenderer, C1.Xamarin.Forms.Core.Platform.Android", C1ToggleButtonRenderer.class, __md_methods);
	}


	public C1ToggleButtonRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == C1ToggleButtonRenderer.class)
			mono.android.TypeManager.Activate ("C1.Xamarin.Forms.Core.Platform.Android.C1ToggleButtonRenderer, C1.Xamarin.Forms.Core.Platform.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public C1ToggleButtonRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == C1ToggleButtonRenderer.class)
			mono.android.TypeManager.Activate ("C1.Xamarin.Forms.Core.Platform.Android.C1ToggleButtonRenderer, C1.Xamarin.Forms.Core.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public C1ToggleButtonRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == C1ToggleButtonRenderer.class)
			mono.android.TypeManager.Activate ("C1.Xamarin.Forms.Core.Platform.Android.C1ToggleButtonRenderer, C1.Xamarin.Forms.Core.Platform.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}

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
