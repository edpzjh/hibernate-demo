package com.bulain.hibernate.common;

import java.util.List;

public interface PagedMapper<S, T> extends BasicMapper<T> {
    List<T> find(S search);
    Long count(S search);
    List<T> page(S search);
}
