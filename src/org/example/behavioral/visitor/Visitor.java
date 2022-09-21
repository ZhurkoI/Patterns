package org.example.behavioral.visitor;

public interface Visitor {

    public void visit(Rice rice);

    public void visit(Pizza pizza);

    public void visit(Meat meat);
}
