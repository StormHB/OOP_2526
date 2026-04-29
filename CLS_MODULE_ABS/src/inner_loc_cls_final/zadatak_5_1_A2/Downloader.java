package inner_loc_cls_final.zadatak_5_1_A2;

public class Downloader {
    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void download(String url) {
        if (listener != null) {
            listener.onStart(url);
        }

        for (int progress = 0; progress <= 100; progress += 50) {
            if (listener != null) {
                listener.onProgress(progress);
            }
        }

        if (listener != null) {
            listener.onDone();
        }
    }

    public class Listener {
        public void onStart(String url) {
        }

        public void onProgress(int percent) {
        }

        public void onDone() {
        }
    }
}