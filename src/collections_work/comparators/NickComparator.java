package collections_work.comparators;

import collections_work.api.INickHandler;

import java.util.Comparator;

public class NickComparator implements Comparator<INickHandler> {
    @Override
    public int compare(INickHandler o1, INickHandler o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
