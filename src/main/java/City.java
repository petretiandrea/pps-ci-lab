/**
 * This class is the main class of the project. It represents
 * a small city like Sterpeti.
 */
public class City {
    private final String name;
    private long inhabitants;

    public City(final String name, final long inhabitants) {
        this.name = name;
        this.inhabitants = inhabitants;
    }

    public String getName() {
        return this.name;
    }
    public long getInhabitants(){
        return this.inhabitants;
    }
    public void updateInhabitants(final long inhabitants) {
        if(inhabitants > 1) {
            this.inhabitants = inhabitants;
        }
    }
}
