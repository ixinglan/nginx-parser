package com.github.nginxparser;

import java.util.HashMap;
import java.util.Map;

public enum NgxEntryType {
    PARAM(NgxParam.class),
    COMMENT(NgxComment.class),
    IF(NgxIfBlock.class),
    BLOCK(NgxBlock.class);

    private final Class<? extends NgxEntry> clazz;

    Class<? extends NgxEntry> getType() {
        return clazz;
    }

    NgxEntryType(Class<? extends NgxEntry> clazz) {

        this.clazz = clazz;
    }

    private static Map<Class<? extends NgxEntry>, NgxEntryType> types;

    static {
        types = new HashMap<Class<? extends NgxEntry>, NgxEntryType>();
        for (NgxEntryType type : NgxEntryType.values()) {
            types.put(type.clazz, type);
        }
    }

    public static NgxEntryType fromClass(Class<? extends NgxEntry> clazz) {
        return types.get(clazz);
    }
}
