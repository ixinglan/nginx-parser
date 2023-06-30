package com.github.nginxparser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class NgxAbstractEntry implements NgxEntry {
    private Collection<NgxToken> tokens = new ArrayList<NgxToken>();

    public NgxAbstractEntry(String... rawValues) {
        for (String val : rawValues) {
            tokens.add(new NgxToken(val));
        }
    }

    public Collection<NgxToken> getTokens() {
        return tokens;
    }

    public void addValue(NgxToken token) {
        tokens.add(token);
    }

    public void addValue(String value) {
        addValue(new NgxToken(value));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (NgxToken value : tokens) {
            builder.append(value).append(" ");
        }
        String s = builder.toString();
        return s.substring(0, s.length() - 1);
    }

    public String getName() {
        if (getTokens().isEmpty())
            return null;

        return getTokens().iterator().next().toString();
    }

    public List<String> getValues() {
        ArrayList<String> values = new ArrayList<String>();
        if (getTokens().size() < 2)
            return values;

        Iterator<NgxToken> it = getTokens().iterator();
        it.next();
        while (it.hasNext()) {
            values.add(it.next().toString());
        }
        return values;
    }

    public String getValue() {
        Iterator<String> iterator = getValues().iterator();
        StringBuilder builder = new StringBuilder();
        while (iterator.hasNext()) {
            builder.append(iterator.next());
            if (iterator.hasNext()) {
                builder.append(' ');
            }
        }
        return builder.toString();
    }

}
