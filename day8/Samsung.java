package week3.day8;

public class Samsung extends AndroidTV {
	
	public void openApp()
	{
		
		System.out.println("Open APP");
	}
	
	public void playVideo()
	{
		
		System.out.println("Play Video");
	}
	
	public void AndroidTV()
	{
		System.out.println("Android TV");
	}
	
    public void AndroidSetting()
    
    {
    	System.out.println("AndroidSetting");
    }
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Samsung SA = new Samsung();
	SA.AndroidTV();
	SA.openApp();
	SA.playVideo();
	SA.AndroidSetting();
		
		


	}

}
