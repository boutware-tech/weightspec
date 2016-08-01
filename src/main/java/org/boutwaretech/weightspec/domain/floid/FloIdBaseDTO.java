package org.boutwaretech.weightspec.domain.floid;

import java.util.Map;

import lombok.Data;

@Data
public class FloIdBaseDTO<T extends Object, I extends Object> {

    private T data;
    private Iterable<I> included;
    private Map<String, Object> jsonapi;
}
