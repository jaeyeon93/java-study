public class SimpleDotComTestDrive {
    public static void main(String [] args){
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourSelf(userGuess);
    }
}


class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    String checkYourSelf(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int i = 0; i < locationCells.length; i++) {
            if (guess == locationCells[i]){
                result = "hits";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}





