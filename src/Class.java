public class Class {

    public String spinAround(String[] pole) {
        String whereSpin;
        int spin = 0;
        int fullSpinCount = 0;
        String returnString = "";
        for (int i = 0; i < pole.length; i++) {
            whereSpin = pole[i];
            if (whereSpin.equalsIgnoreCase("left")) {
                spin += 90;
                returnString += "u spun left, ";
            } else if (whereSpin.equalsIgnoreCase("right")) {
                spin -= 90;
                returnString += "u spun right, ";
            }
            if (spin == -360 || spin == 360){
                fullSpinCount++;
                spin -= 360;
            }
        }
        return returnString + "\n360 spins count: " + fullSpinCount;
    }

    public String vowels(String string, int vowelsCount){
        String vowels = "";
        int counter = vowelsCount;
        int vowelCountActual = 0;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            if(counter != 0){
                if(charArray[i] == 'a' || charArray[i] == 'e'|| charArray[i] == 'i'|| charArray[i] == 'o' || charArray[i] == 'u'){
                    vowels += charArray[i] + ", ";
                    vowelCountActual++;
                    counter--;
                }

            }
        }
        if(vowelCountActual > vowelsCount){
            return "invalid";
        }
        return vowels;
    }
}
