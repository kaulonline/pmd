/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

/* Generated By:JJTree: Do not edit this line. ASTOuterJoinType.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */

package net.sourceforge.pmd.lang.plsql.ast;

import net.sourceforge.pmd.annotation.InternalApi;

public class ASTOuterJoinType extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
    private Type type;

    @Deprecated
    @InternalApi
    public ASTOuterJoinType(int id) {
        super(id);
    }

    @Deprecated
    @InternalApi
    public ASTOuterJoinType(PLSQLParser p, int id) {
        super(p, id);
    }

    void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String getImage() {
        return String.valueOf(type);
    }

    public boolean isLeft() {
        return type == Type.LEFT;
    }

    public boolean isRight() {
        return type == Type.RIGHT;
    }

    public boolean isFull() {
        return type == Type.FULL;
    }

    @Override
    public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    public enum Type { FULL, LEFT, RIGHT }
}
