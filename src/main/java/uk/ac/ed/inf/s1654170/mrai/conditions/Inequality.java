package uk.ac.ed.inf.s1654170.mrai.conditions;

import java.util.ArrayList;
import java.util.List;

import uk.ac.ed.inf.s1654170.mrai.schema.Signature;

public class Inequality extends Comparison {
	
	private Term left;
	private Term right;

	public Inequality(Term left, Term right) {
		super(Type.INEQUALITY, left, right);
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String getComparisonOperator() {
		return Type.INEQUALITY.getConnective();
	}

	@Override
	public boolean validate(Signature sig) {
		List<String> attr = new ArrayList<>(sig.getAttributes());

		if (left.isConstant() && right.isConstant()) {
			return false;
		}

		if ((!left.isConstant() && !attr.contains(left.toString()))
				|| (!right.isConstant() && !attr.contains(right.toString()))) {
			return false;
		} else {
			return true;
		}
	}
	
}
