package com.github.gpor0.jooreoGen;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class JooreoGeneratorStrategy extends DefaultGeneratorStrategy {


    /**
     * Override this method to define how your Java classes and Java files should
     * be named. This example applies no custom setting and uses CamelCase versions
     * instead
     */
    @Override
    public String getJavaClassName(Definition definition, Mode mode) {

        return "Base" + super.getJavaClassName(definition, mode);
    }

    /**
     * Override this method to define the interfaces to be implemented by those
     * artefacts that allow for custom interface implementation
     */
    @Override
    public List<String> getJavaClassImplements(Definition definition, Mode mode) {
        if (Mode.RECORD == mode) {
            return Arrays.asList(Serializable.class.getName(), Cloneable.class.getName(), "com.github.gpor0.jooreo.dao.record.JooreoRecord");
        }

        return Arrays.asList(Serializable.class.getName(), Cloneable.class.getName());
    }

}
