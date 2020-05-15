package optionalpractice;

import java.util.ArrayList;

public class MusicDownloads {
    private ArrayList<DownloadInfo> downloadList;
    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo>();
    }

    // Part A
    public DownloadInfo getDownloadInfo(String title) {
        for(DownloadInfo i: downloadList) {
            if(i.getTitle().equals(title)) {
                return i;
            }
        }
        return null;
    }

    // Part B
    public void updateDownloads(ArrayList<String> titles) {
        for(String title: titles) {
            boolean found = false;
            for(DownloadInfo i: downloadList) {
                if(i.getTitle().equals(title)) {
                    i.incrementTimesDownloaded();
                    found = true;
                }
            }
            if(!found) {
                downloadList.add(new DownloadInfo(title));
            }
        }
    }
}
