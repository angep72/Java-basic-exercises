public class Overloading {
    private String title;
    private String author;
    private int price;
    public Overloading(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // Default constructor
    public Overloading() {
        // Initialize title to "Unknown"
        this.title = "Unknown";
        // Initialize author to "Unknown"
        this.author = "Unknown";
        // Initialize price to 0.0
        this.price = 0;
    }
    public Overloading(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        Overloading o = new Overloading("ThinkBig","Becarson");
        System.out.println(o.title);
        System.out.println(o.author);
        Overloading o2 = new Overloading("ThinkBig","Becarson", 5904);
        System.out.println(o2.title);
        System.out.println(o2.author);
        System.out.println(o2.price);

    }
}
