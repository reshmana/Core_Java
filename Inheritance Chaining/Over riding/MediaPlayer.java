class MediaPlayer extends StandaloneApplication{

String[] favourites;

MediaPlayer(String name, AppType type) {
        super(name, type);
        System.out.println("running String app arg const in StandaloneApplication");
    }

    void setFavourites(String[] favourites) {
        this.favourites = favourites;
        System.out.println("running list of favourites in MediaPlayer");
        for (int seq = 0; seq < this.favourites.length; seq++) {
            String fev = this.favourites[seq]; 
            System.out.println("supportBrowsers :" + fev);
        }
    }
	
	void show(){
		play();
		delate();
		download();
	}
     
	 void play(){
		 System.out.println("running play in MediaPlayer");
	 }
	 
	 void delate(){
		 System.out.println("running delate in MediaPlayer");
	 }
	 
	 void download(){
		 System.out.println("running download in MediaPlayer");
	 }
}