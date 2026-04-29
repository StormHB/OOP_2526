package inner_loc_cls_final.zadatak_5_1_A2;

public class Main {
    public static void main(String[] args) {
        Downloader downloader = new Downloader();

        downloader.setListener(downloader.new Listener() {
            @Override
            public void onStart(String url) {
                System.out.println("Download started: " + url);
            }

            @Override
            public void onProgress(int percent) {
                System.out.println("Progress: " + percent + "%");
            }

            @Override
            public void onDone() {
                System.out.println("Download finished.");
            }
        });

        downloader.download("https://example.com/file");
    }
}