package org.jordan;

import java.util.ArrayList;
import java.util.List;

public abstract class ListProcessor <T, R> {
    protected final List<T> list;

    public ListProcessor(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    public abstract R process();
}
