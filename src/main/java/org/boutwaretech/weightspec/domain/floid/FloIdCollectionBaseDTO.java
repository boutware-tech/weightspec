package org.boutwaretech.weightspec.domain.floid;

import java.util.Map;

import lombok.Data;

/**
 * This is the base Collection DTO for the Flosports Identity project
 */
@Data
public class FloIdCollectionBaseDTO<D extends Object> {
    
    private Map<String, Object> links;
    private Iterable<D> data;
    private Map<String, Object> meta;
    private Map<String, Object> jsonapi;
}
