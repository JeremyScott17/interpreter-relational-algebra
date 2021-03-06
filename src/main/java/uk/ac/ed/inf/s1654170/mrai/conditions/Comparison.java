package uk.ac.ed.inf.s1654170.mrai.conditions;

import java.util.ArrayList;
import java.util.List;

import uk.ac.ed.inf.s1654170.mrai.schema.Column;
import uk.ac.ed.inf.s1654170.mrai.schema.Signature;

public abstract class Comparison extends Condition {

	private Term left;
	private Term right;
	private Type type;

	public Comparison(Type type, Term left, Term right) {
		super(type);
		this.type = type;
		this.left = left;
		this.right = right;
	}
	
	public List<Term> getTerms() {
		List<Term> terms = new ArrayList<>();
		terms.add(left);
		terms.add(right);
		return terms;
	}

	public abstract String getComparisonOperator();
	
	public List<Condition> getCondition() {
		List<Condition> ans = new ArrayList<>();
		ans.add(this);
		return ans;
	}

	@Override
	public String toString() {
		return String.format("%s%s%s", left, getComparisonOperator(), right);
	}
	
	@Override
	public boolean validate(Signature sig) {
		List<String> attr = new ArrayList<>(sig.getAttributes());
		List<Column.Type> types = new ArrayList<>(sig.getTypes());

		if (left.isConstant() && right.isConstant()) {
			return false;
		}

		if ((!left.isConstant() && !attr.contains(left.toString()))
				|| (!right.isConstant() && !attr.contains(right.toString()))) {
			return false;
		}
		
		if (!left.isConstant() && !right.isConstant() &&
				!types.get(attr.indexOf(left.toString())).equals(types.get(attr.indexOf(right.toString())))) {
			// if left and right are attributes but don't share the same attribute type
			return false;
		}

		if ((type.equals(Type.GREATER) || type.equals(Type.GREATER_EQUAL) ||
				type.equals(Type.LESS) || type.equals(Type.LESS_EQUAL)) &&
				((!left.isConstant() && types.get(attr.indexOf(left.getValue())).equals(Column.Type.STRING)) ||
						(!right.isConstant() && types.get(attr.indexOf(right.getValue())).equals(Column.Type.STRING)))) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public List<Comparison> getComparisons() {
		List<Comparison> comparisons = new ArrayList<>();
		comparisons.add(this);
		return comparisons;
	}
	
	@Override
	public List<Type> getConditionTypes() {
		List<Type> conditionTypes = new ArrayList<>();
		conditionTypes.add(type);
		return conditionTypes;
	}
}
