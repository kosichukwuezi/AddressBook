import java.util.ArrayList;

/** Contains a collection of BuddyInfo Objects
 *
 */
public class AddressBook {
   private final ArrayList<BuddyInfo> buddies;

   public AddressBook(){
       buddies = new ArrayList<>();
   }

   public void addBuddy(BuddyInfo buddy){
       buddies.add(buddy);
   }

   public void removeBuddy(BuddyInfo buddy){
       buddies.remove(buddy);
   }
   static void main(String[] args) {
       BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
       AddressBook addressBook = new AddressBook();
       addressBook.addBuddy(buddy);
       addressBook.removeBuddy(buddy);
   }

}
