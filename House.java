import java.util.ArrayList; // import array list for java

/*
 * this class is representing a house
 * houses contain dining rooms and certain residents
 */
public class House extends Building { // Library class extends the Building class

  private ArrayList<String> residents; // <String> tells Java what kind of data we plan to store within ArrayList
  private boolean hasDiningRoom; //boolean for true/false if house has a dining room 

    /** constructor for the House class
    * @param String name = building name, String address = building address, int nFloors = number of floors of house, boolean hasDiningRoom = true/false if house has a dining room
    */
    public House(String name, String address, int nFloors, boolean hasDiningRoom) {
      super(name, address, nFloors);
      this.hasDiningRoom = hasDiningRoom;
      this.residents = new ArrayList<String>();
    }
  
     /** accessor for dining room status which is either true or false
      * @return boolean = whether or not the House has a dining room
      */
    public boolean hasDiningRoom(){
      if (hasDiningRoom == true){
        return true;
      } else{
        return false;
      }
    }
  
     /** accessor for the number of House residents
      * @return int size = the number of residents currently in the House when prompted
      */
    public int nResidents(){
      return this.residents.size();
    }
  
    /** adds a resident to the residents arrayList by specified name
     * @param String name = the name of a resident to be added to the house arrayList
     */
    public void moveIn(String name){
      residents.add(name);
    }
  
    /** removes a specified resident from the residents arrayList by name
     * @param String name = the name of a resident to be removed from the house arrayList
     * @return String = the name of the resident that was removed
     */
    public String moveOut(String name){ // returns the name of the person who moved out
      residents.remove(name);
      return name;
    } 
  
    /** checks if a specific name is in list residents
     * @param String person = the name of a person whose residency is being questioned at specific house
     * @return boolean = whether or not that person is in the house
     */
    public boolean isResident(String person){
      if (residents.contains(person)){
        System.out.println("Yes, " + person + " is a resident");
        return true;
      } else{
        System.out.println("No, " + person + " is not a resident");
        return false;
      }
  
    }
  
    public static void main(String[] args) {
      House jordan = new House("Jordan House", "1 Mandelle Road", 5, false);
      //System.out.println(jordan);
      jordan.moveIn("Abbey");
      jordan.moveIn("Mia");
      jordan.moveIn("Phoebe");
      jordan.moveIn("Lizzie");
      jordan.moveOut("Mia");
      jordan.moveOut("Elli"); //doesn't produce anything, not in house
      System.out.println(jordan);
      // jordan.moveOut("Abbey");
      jordan.isResident("Abbey");
      System.out.println(jordan + " in which the current residents are " + jordan.residents);
    }

}