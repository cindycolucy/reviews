package reviews;

public class Review {
	
	//Instance variables
	private long id;
	private String title;
	private String imageUrl;
	private String category;
	private String content;
	private String date;
	private String synopsis;
	private String tag;
	
	//Constructor
	public Review(long id, String title, String imageUrl, String category, String content, String date, String synopsis, String tag){
	 this.id = id;
	 this.title = title;
	 this.imageUrl = imageUrl;
	 this.category = category;
	 this.content = content;
	 this.date = date;
	 this.synopsis = synopsis;
	 this.tag = tag;
	 
	}
	//Getters
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public String getCategory() {
		return category;
	}
	public String getContent() {
		return content;
	}
	public String getDate() {
		return date;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public String getTag() {
		return tag;
	}
	//public String toString() { 
	//	return "Id: "+ id + "Title: " + title;
	//}

}
