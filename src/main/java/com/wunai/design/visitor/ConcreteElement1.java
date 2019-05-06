package com.wunai.design.visitor;

public class ConcreteElement1 extends Element {

	public void doSomething() {
		System.out.println("����Ԫ��1");
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
