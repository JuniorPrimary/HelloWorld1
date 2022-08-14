public class singleton {
    private static singleton instance;
    private int size = 0;

    private singleton ()
    {

    }
    public static singleton getInstance()
    {
        if (instance == null){
            instance = new singleton();

        }
        return instance;
    }
    public void addSize(int value){
        size += value;
    }
    public void incrementSize(int value){
        size -= value;
    }

    public int getSize() {
        return size;
    }
}
