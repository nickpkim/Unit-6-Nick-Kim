public class Album {
    private String title;
    private String artist;
    private int songNum;
    private double duration;
    public Album(String title, String artist, int songNum, double duration){
        this.title = title;
        this.artist = artist;
        this.songNum = songNum;
        this.duration = duration;
    }
    public String toString(){
        String str = "";
        str += title;
        str += "\n"+artist;
        str += "\n"+songNum;
        str += "\n"+duration;
        return str;
    }
}
