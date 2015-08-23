package zeal.kingdom.vendomeequity.helper;

/**
 * Created by Tonyoh87 on 2015-08-22.
 */
public class Movie {
    public int id;
    public String title;
    public String date;

    public Movie() {
    }

   public Movie(int id, String title, String date) {
       //  public Movie(int id, String title) {
        this.title = title;
        this.date=date;
        this.id = id;
    }
}