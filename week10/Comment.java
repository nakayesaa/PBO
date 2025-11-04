package PBO.week10;

public class Comment{
    private String author;
    private String text;
    private int rating;
    private int votes;
    public Comment(String author, String text, int rating){
        this.author = author;
        this.text = text;
        this.rating = rating;
        votes = 0;
    }
    public void upvote(){ votes++;}
    public void downvote(){votes--;}
    public String getAuthor(){return author;}
    public int getRating() {return rating;}
    public int getVoteCount(){ return votes;}
    public String getFullDetails(){
        String details = "Rating: " + "*****".substring(0,rating) + "    "+ "By: " + author + "\n"+ "    " + text + "\n";details += "(Voted as helpful: " + votes + ")\n";
        return details;
    }
}