package org.boutwaretech.weightspec.domain.floid;

import java.util.Map;

import lombok.Data;

/**
 * This is the base Collection DTO for the Flosports Identity project
 */
@Data
public class FloIdCollectionBaseDTO<T extends Object> {
    
    private Map<String, Object> links;
    private Iterable<T> data;
    private Map<String, Object> meta;
    private Map<String, Object> jsonpi;
}
