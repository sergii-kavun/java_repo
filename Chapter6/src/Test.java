import java.util.ArrayList;

/**
 * Created by vid4i on 15.11.2016.
 This class is to test read material and to practice
 */
public class Test {

    public static void main(String[] args ) {
        //Make new Array List
        ArrayList<DotCom> MyList = new ArrayList<DotCom>();

        //Put something in it
        DotCom ship22 = new DotCom();  // create new object to put into ArrayList
        MyList.add(ship22);

        //Put another thing to ArrayList

        DotCom ship33 = new DotCom();
        MyList.add(ship33);

        // to find out how many things are in ArrayList
        int ShipSize = MyList.size();
        System.out.println(ShipSize);

        // Find out if List contains something we are interested in
        Boolean x = MyList.contains(ship22);
        System.out.println("If object there it should return true : "+x);  // it should be true if object are there

        //To FInd out where something is (index)
        System.out.println(MyList.indexOf(ship33));
        // it should return index of object or -1 if there no such object

        // Fin out whether List is empty
        boolean isEmpty = MyList.isEmpty();
        System.out.println("Is ArrayList empty ? : "+isEmpty);

        // Try to remove some object from list
        MyList.remove(ship33);

        // Check size again
        int ShipSize2 = MyList.size();
        System.out.println(ShipSize2);


        //----------------Compare ArrayList to regular Array----------



    }

}
