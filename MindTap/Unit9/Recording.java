package MindTap.Unit9;
public class Recording {
    private String song;
    private String artist;
    private int playTime;

    public void setSong(String title) {
        this.song = title;
    }
    public void setArtist(String name) {
        this.artist = name;
    }
    public void setPlayTime(int time) {
        this.playTime = time;
    }
    public String getSong() {
        return song;
    }
    public String getArtist() {
        return artist;
    }
    public int getPlayTime() {
        return playTime;
    }
}
