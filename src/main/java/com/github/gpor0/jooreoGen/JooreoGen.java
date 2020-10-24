package com.github.gpor0.jooreoGen;

import org.jooq.codegen.JavaGenerator;
import org.jooq.codegen.JavaWriter;
import org.jooq.meta.TableDefinition;

public class JooreoGen extends JavaGenerator {

    @Override
    protected void generateRecordClassFooter(TableDefinition table, JavaWriter out) {
        out.println();
        out.tab(1).println("protected org.jooq.DSLContext dsl;");
        out.println();
        out.tab(1).println("public void dsl(org.jooq.DSLContext dsl) {");
        out.tab(2).println("this.dsl = dsl;");
        out.tab(1).println("}");
    }
}
