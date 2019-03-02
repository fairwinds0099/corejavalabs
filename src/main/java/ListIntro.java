import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntro {


    public static void main(String[] args) {


        int[] myFirstArray = {1, 2, 3, 4, 5, 6};
        String[] mySecondArray = {"Venus", "Mars", "Jupiter"};
        Object[] myObjectArray = {1, "Venus", 2, "Mars"};


/*        System.out.println("object hash: " + myFirstArray);
        System.out.println("array length:" + myFirstArray.length);

        for (int i = 0; i < myFirstArray.length; i++) {
            System.out.println(myFirstArray[i]);
        }


        for (int i = 0; i < mySecondArray.length; i++) {
            System.out.println(mySecondArray[i]);
        }

        for (int i = mySecondArray.length - 1; i >= 0; i--) {
            System.out.println(mySecondArray[i]);
        }*/


/*
        for (int i=0; i<myObjectArray.length; i++) {
            System.out.println(myObjectArray[i]);
        }
*/


        //declare a new List with type list of strings
        List<String> myFirstList;
        myFirstList = new ArrayList<String>();
        myFirstList.add("Venus");
        myFirstList.add("Mars");
        myFirstList.add("Jupiter");

        System.out.println(myFirstList.size());

        myFirstList.remove(2);

        System.out.println(myFirstList);
        System.out.println(myFirstList.size());

        for (int i=0; i<myFirstList.size(); i++) {
            String text = "Gezegen = " + myFirstList.get(i);
            System.out.println(text);
        }


        

    }


}
