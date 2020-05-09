package optionalpractice;

public class HorseBarn implements Horse{
    private Horse[] spaces;
    public int getWeight() {
        return 1;
    }
    public String getName() {
        return null;
    }

    // Part A
    public int findHorseSpace(String name) {
        for(int i = 0; i < spaces.length; i++) {
            if(spaces[i] == null) {
                continue;
            }
            if(name.equals(spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    // Part B
    public void consolidate() {
        int j = 0;
        for(int i = 0; i < spaces.length; i++) {
            j = i+1;
            while(spaces[i] == null) {
                if(j == spaces.length) {
                    break;
                }
                if(spaces[j] != null) {
                    spaces[i] = spaces[j];
                    spaces[j] = null;
                    break;
                }
                j++;
            }
        }
    }
}
