class Browser extends StandaloneApplication {

    String[] downloads;
    String[] browsingHistory;

    Browser(String name, AppType type) {
        super(name, type);
        System.out.println("running String app arg const in StandaloneApplication");
    }

    void setDownloads(String[] downloads) {
        this.downloads = downloads;
        System.out.println("running list of downloads");
        for (int seq = 0; seq < this.downloads.length; seq++) {
            String download = this.downloads[seq]; // Fix the variable name here
            System.out.println("supportBrowsers :" + download);
        }
    }

    void setBrowsingHistory(String[] browsingHistory) {
        this.browsingHistory = browsingHistory; 
        System.out.println("running list of browsingHistory");
        for (int seq = 0; seq < this.browsingHistory.length; seq++) {
            String history = this.browsingHistory[seq]; 
            System.out.println("supportBrowsers :" + history);
        }
    }
	
	void show(){
		
		setting();
		displayHistory();
	}
	
	void setting(){
		System.out.println("running setting in browser");
	}
	
	void displayHistory(){
		System.out.println("running displayHistory in browser");
	}
}