public class Rimcalk {

    static String[] Rome = {"C","XC","L","XL","X","IX","V","IV","I"};
    static int[] Arab =    {100,90,50,40,10,9,5,4,1};

    public static int Acalc(String opera, int n1, int n2){

        int result = 0;

        if (opera.equals("+")) {result=n1+n2;}
        if (opera.equals("-")) {result=n1-n2;}
        if (opera.equals("*")) {result=n1*n2;}
        if (opera.equals("/")) {result=n1/n2;}

        System.out.println(result);
        return result;
    }

    public static String Roman(double input){
        String s = "";
        if (input < 0)
        {
            s = "-" + s;
            input *= -1;
        }
        else if (input == 0)
            return "nulla";

        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }

    public static int RometoArab(String rome) {
        StringBuffer romeNumber = new StringBuffer(rome);
        int arabNumber = 0, i = 0;

        if (romeNumber.length() > 0) {
        while (true) {
        do {

        if (Rome[i].length() <= romeNumber.length()) {

        if (Rome[i].equals(romeNumber.substring(0,
            Rome[i].length()))) {
            arabNumber += Arab[i];
            romeNumber.delete(0, Rome[i].length());
        if (romeNumber.length() == 0)

        return arabNumber;
        } else
        break;
        } else
        break;

        } while (true && romeNumber.length() != 0);
       i++;
  }
}
        return 0;
  }
}





