public class StrBuilderPractice {


    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder [] mySbArray= {sb1, sb2, sb3};

        Object[] myStrArray = {"10", "188" , "198", "255", "12", 5, 'D', true};

        StringBuilder sb  = new StringBuilder();
        int lengthOfMyArray = myStrArray.length;

        System.out.println(lengthOfMyArray);

        for(int i=0; i<lengthOfMyArray; i++ ) {
            sb.append(myStrArray[i]);
            sb.append("---");
        }

        System.out.println(sb.toString().toLowerCase());
    }


}
