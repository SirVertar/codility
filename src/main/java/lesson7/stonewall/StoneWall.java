package lesson7.stonewall;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StoneWall {
    public int solution(int[] H) {
        int numberOfBlocks = 0;
        int lastHeight = 0;
        List<Integer> theLowestPossibles = new ArrayList<>();
        if (H.length == 1) {
            return 1;
        }
        for (int height : H) {
            if (theLowestPossibles.size() == 0) {
                theLowestPossibles.add(0, height);
                numberOfBlocks++;
                lastHeight = height;
            } else if (height > lastHeight) {
                numberOfBlocks++;
                theLowestPossibles.add(0, height);
                lastHeight = height;
            } else if (height < lastHeight) {
                int a = theLowestPossibles.size();
                boolean isLower = false;
                for (int i = 0; i < a; i++) {
                    if (theLowestPossibles.size() <= i ) {
                        break;
                    }
                    if (height < theLowestPossibles.get(i)) {
                        theLowestPossibles.remove(0);
                        lastHeight = height;
                        i--;
                        isLower = true;
                    } else if (height > theLowestPossibles.get(i)) {
                        lastHeight = height;
                        break;
                    } else if (height == theLowestPossibles.get(i)) {
                        isLower = false;
                    }
                }
                if (isLower) {
                    numberOfBlocks++;
                    theLowestPossibles.add(0, height);
                }
            }
        }
        return numberOfBlocks;
    }
}
