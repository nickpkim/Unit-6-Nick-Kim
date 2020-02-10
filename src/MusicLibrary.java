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
    public void remove(int index){
        songNum -= albums[index].getSongNum();
        duration -= albums[index].getDuration();
        Album[] temp = new Album[albums.length-1];
        for (int i = 0; i < index; i++){
            temp[i] = albums[i];
        }
        for (int i = index; i < temp.length; i++){
            temp[i] = albums[i+1];
        }
        albums = temp;
    }
    public void doubleSize(){}

    public Album getAlbum(int index){
        if (-1 < index && index < albums.length){
            return albums[index];
        } else {
            System.out.println("Index out of bounds");
            return null;
        }
    }
    public int titleSearchLinear(String target){
        for (int i = 0; i < albums.length; i++){
            if (albums[i] != null && albums[i].getTitle().toLowerCase().contains(target.toLowerCase())){
                return i;
            }
        }
        return -1;
    }
    public int artistSearchLinear(String target){
        for (int i = 0; i < albums.length; i++){
            if (albums[i] != null && albums[i].getArtist().toLowerCase().contains(target.toLowerCase())){
                return i;
            }
        }
        return -1;
    }
    public void titleSortSelection(){
        int min = 0;
        Album temp = albums[0];
        for (int i = 0; i < albums.length-1; i++) {
            for (int j = i + 1; i < albums.length; j++) {
                if (albums[j].getTitle().compareTo(albums[min].getTitle()) == -1) {
                    min = j;
                }
                temp = albums[i];
                albums[min] =
            }
        }
    }
    public int titleSeachBinary(String target){}

    public String toString(){
        String str = "";
        for (int i = 0; i < albums.length; i++){
            str += albums[i].toString()+"\n";
        }
        str += songNum+" tracks, "+duration;
        return str;
    }
}