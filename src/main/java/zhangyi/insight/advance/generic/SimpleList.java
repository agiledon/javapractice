package zhangyi.insight.advance.generic;

import java.util.ArrayList;
import java.util.List;
public class SimpleList<T extends Object> {
    private List<T> backingStore;
    public SimpleList() {
        backingStore = new ArrayList<T>();
    }
    public T addItem(T t) {
        if (backingStore.add(t))
            return t;
        else
            return null;
    }
    public int size() {
        return backingStore.size();
    }
    public void clear() {
        backingStore.clear();
    }
}
