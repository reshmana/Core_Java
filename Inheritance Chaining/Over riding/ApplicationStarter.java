class ApplicationStarter{
          
		  public static void main(String... apps){
		   
		   System.out.println("Starting main in ApplicationStarter ");
		   
		   String[] supportedBrowsers=new String[4];
		         supportedBrowsers[0]="explorer";
				 supportedBrowsers[1]="chrome";
				 supportedBrowsers[2]="firfox";
				 supportedBrowsers[3]="edge";
		  
        WebApplication webApplication=new WebApplication		  
		     webApplication.setBrowser(supportedBrowsers);
			 webApplication.Info(true);
			 
		String[] downloads=new String[5];
             		downloads[0]="movie";
					downloads[1]="songs";
					downloads[2]="pdf";
					downloads[3]="appicatuon";
					downloads[4]="image";
					
		String[] browsingHistory=new String[2];
             browsingHistory[0]="oracle";
             browsingHistory[1]="jetbrains"; 

        ChromeBrowser chromeBrowser=new ChromeBrowser("facebook",AppType.ENTERTAINMENT);
            	chromeBrowser.setDownloads(downloads);
                chromeBrowser.setBrowsingHistory(browsingHistory);

        String[] favourites=new String[2];
             		favourites[0]="Wendsday";
					favourites[1]="money hiest";
        
        MediaPlayer mediaPlayer=new MediaPlayer("prime",AppType.ENTERTAINMENT);		
				mediaPlayer.setFavourites(favourites);
				mediaPlayer.show(50,"64 & 32 bit",os.LINUX);
				
		EdgeBrowser edgeBrowser=new EdgeBrowser("instagram",AppType.ENTERTAINMENT);

        FireFoxBrowser	fireFoxBrowser=new FireFoxBrowser("amezone",AppType.SHOPPING);	
		   System.out.println("ending main in ApplicationStarter ");

		  }
}