public class MusicLibrary {
    private Album[] albums = new Album[0];
    private int songNum;
    private double duration;
    private String name;
    public MusicLibrary(){
        songNum = 0;
        duration = 0;
    }
    public MusicLibrary(String name){
        this.name = name;
        songNum = 0;
        duration = 0;
    }
    public void add(Album album){
        increaseSize();
        albums[albums.length-1] = album;
        songNum += album.getSongNum();
        duration += album.getDuration();
    }
    public void increaseSize(){
        Album[] temp = new Album[albums.length+1];
        for (int i = 0; i < albums.length; i++){
            temp[i] = albums[i];
        }
        albums = temp;
    }
    public void remove(int indexPlus){
        songNum -= albums[indexPlus-1].getSongNum();
        duration -= albums[indexPlus-1].getDuration();
        Album[] temp = new Album[albums.length-1];
        for (int i = 0; i < indexPlus-1; i++){
            temp[i] = albums[i];
        }
        for (int i = indexPlus-1; i < temp.length; i++){
            temp[i] = albums[i+1];
        }
        albums = temp;
    }
    public void doubleSize(){}



    public String toString(){
        String str = "";
        for (int i = 0; i < albums.length; i++){
            str += albums[i].toString()+"\n";
        }
        str += songNum+" tracks, "+duration;
        return str;
    }
}