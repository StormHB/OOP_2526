package inner_loc_cls_final.zadatak_6_1_U;

import java.util.*;

public class CounterService {

    private int value = 0;
    private final List<OnChange> listeners = new ArrayList<>();

    @FunctionalInterface
    public interface OnChange {
        void changed(int newValue);
    }

    public void inc() {
        value++;
        for (OnChange listener : new ArrayList<>(listeners)) {
            listener.changed(value);
        }
    }

    public int getValue() {
        return value;
    }

    public Subscription subscribe(OnChange listener) {
        listeners.add(listener);
        return new Subscription(listener);
    }

    public class Subscription {
        private final OnChange listener;
        private boolean active = true;

        private Subscription(OnChange listener) {
            this.listener = listener;
        }

        public void unsubscribe() {
            if (!active) return;
            listeners.remove(listener);
            active = false;
        }
    }
}