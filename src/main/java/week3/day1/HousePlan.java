package week3.day1;

public interface HousePlan {
int length = 120;
int breadth = 200;
int numberOfBedroom = 3;
/**
 * This is a secondary bedroom in 12 X 12 with attached rest rooms
 * This should be faclitated with 2 lights and 2 fans
 * There should be a provision for AC out
 * There should be a default wardrobe in the instructed interior
 * 
 * @author Balaji
 * @param a -> the bedroom type
 * 
 */
public void buildBedroom(String a) ;
abstract void buildMasterBedroom();
}
