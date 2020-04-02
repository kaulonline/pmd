/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.plsql.ast;

public final class ASTSelectStatement extends AbstractSelectStatement {

    public ASTSelectStatement(int id) {
        super(id);
    }

    @Override
    public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    public ASTFromClause getFromClause() {
        return getFirstChildOfType(ASTFromClause.class);
    }
}