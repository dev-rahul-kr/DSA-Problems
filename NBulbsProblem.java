import java.util.ArrayList;

public class NBulbsProblem {
    public int bulbs(ArrayList<Integer> A) {
        int minFlipCount = 0;
        for(int j = 0 ; j < A.size(); j++){
            if(A.get(j) == 0 && minFlipCount % 2 == 0)
                minFlipCount++;
            else if(A.get(j) == 1 && minFlipCount % 2 != 0)
                minFlipCount++;
            else
                continue;
        }

        return minFlipCount;
    }
}
