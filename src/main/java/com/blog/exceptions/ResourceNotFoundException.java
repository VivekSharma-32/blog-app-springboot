package com.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
    String resourceName;
    String fieldName;
    Integer fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, Integer userId) {
        super(String.format("%s not found with %s : %s", resourceName, fieldName, userId));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = userId;
    }

}
