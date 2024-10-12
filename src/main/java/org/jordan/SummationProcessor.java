package org.jordan;

import java.util.List;

public class SummationProcessor extends ListProcessor<Integer, Integer> {
    public SummationProcessor(List<Integer> list) {
        super(list);
    }

    @Override
    public Integer process() {
        return list.stream().reduce(0, Integer::sum);
    }
}
