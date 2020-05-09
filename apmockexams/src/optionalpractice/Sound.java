package optionalpractice;

public class Sound {
    private int[] samples;

    // Part A
    public int limitAmplitude(int limit) {
       int changed = 0;
       for(int i: samples) {
           if(i > limit) {
               i = limit;
               changed++;
           }
           if(i < limit) {
               i = limit * -1;
               changed++;
           }
       }
       return changed;
    }

    // Part B
    public void trimSilenceFromBeginning() {
        int index = 0;
        for(int i = 0; i < samples.length; i++) {
            if(samples[i] == 0) {
                continue;
            }
            index = i;
            break;
        }
        int[] nsamples = new int[samples.length - index];
        int nindex = 0;
        for(int i = index; i < samples.length; i++) {
            nsamples[nindex] = samples[i];
            nindex++;
        }
        samples = nsamples;
    }
}
