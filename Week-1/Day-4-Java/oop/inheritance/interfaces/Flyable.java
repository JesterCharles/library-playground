package inheritance.interfaces;

/*
    since only some of our vehicles are able to fly we can use this Flyable interface to
    facilitate the methods associated with flying, which makes it easier to expand our
    list of flying vehicles in the future
 */
public interface Flyable {
    void fly();
}
