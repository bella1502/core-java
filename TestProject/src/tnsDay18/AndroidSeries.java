package tnsDay18;

@SmartTV(os="Android")
public class AndroidSeries {

	String model;
	int screensize;
	
	public AndroidSeries(String model,int screensize)
	{
		this.model=model;
		this.screensize=screensize;
	}
	@Override
	public String toString() {
		return "AndroidSeries [model=" + model + ", screensize=" + screensize + "]";
	}
	
}
