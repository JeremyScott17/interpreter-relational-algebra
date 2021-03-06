package uk.ac.ed.inf.s1654170.mrai.conditions;

public class Or extends BinaryCondition {
	
	public Or(Condition left, Condition right) {
		super(left, right, Type.OR);
	}
	
	@Override
	public String getConnective() {
		return Type.OR.getConnective();
	}
}
