import java.util.ArrayList;
public class MovieTheater {
    private Movie[] screenArr;

    // Part A
    public ArrayList<Integer> screensWithMovies() {
        ArrayList<Integer> arrl = new ArrayList<>();
        for(int i = 0; i < screenArr.length; i++) {
            if(screenArr[i] != null) {
                arrl.add(i);
            }
        }
        return arrl;
    }

    // Part B
    public void updateScreenArr(ArrayList<Movie> moviesToAssign) {
        for(int i = 0; i < screenArr.length; i++) {
            if(screenArr[i] == null) {
                screenArr[i] = moviesToAssign.remove(0);
            }
            if(moviesToAssign.size() == 0) {
                break;
            }
        }
    }

    /* Part C
    public void removeUnpopular()
    First, in the Movie class, there needs to be a private boolean instance variable, named unpopular.
    In addition, there needs to be a public isUnpopular method in the Movie class which returns the unpopular variable referenced above.
    Also in the Movie class, the constructor would need to be altered to accept a boolean unpopular variable and the value of unpopular would need to be set to that.
    Nothing would need to be altered in the MovieTheater class except for the removeUnpopular method being added.
     */
}
