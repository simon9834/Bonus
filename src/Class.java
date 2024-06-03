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

    public void vowels(String string, int vowelsCount){
        //char[] toCharArray()
        string.toCharArray();
    }
}
