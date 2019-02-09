public class SplitPractice {

    public static void main(String[] args) {
        String bigText = "PDF Share your LX0-101 Experience " +
                "LX0-102 CompTIA Linux+ [Powered by LPI] Linux+ Security+ Linux+";


        String[] splittedTextArray = bigText.split(" ");
        System.out.println(splittedTextArray.length);

        int counter = 0;
        for (int i = 0; i < splittedTextArray.length; i++) {

            if (splittedTextArray[i].equals("Linux+")) {
                counter = counter+1;
            }
        }

        System.out.println(counter);

    }
}
