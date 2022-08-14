public class Volume {
    private int len;
    private int lon;
    private int height;





    public Volume()
    {}



    public void setLen(int len) {
        this.len = len;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public int getVolume() {
        return (this.len * this.lon * this.height);

    }
}



