package uk.ac.ed.inf.s1654170.mrai.exprs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import uk.ac.ed.inf.s1654170.mrai.instance.Table;
import uk.ac.ed.inf.s1654170.mrai.instance.TableOperations;
import uk.ac.ed.inf.s1654170.mrai.schema.BaseSignature;
import uk.ac.ed.inf.s1654170.mrai.schema.Column;
import uk.ac.ed.inf.s1654170.mrai.schema.Database;
import uk.ac.ed.inf.s1654170.mrai.schema.Schema;
import uk.ac.ed.inf.s1654170.mrai.schema.SchemaException;
import uk.ac.ed.inf.s1654170.mrai.schema.Signature;

public class Rename extends RAExpr {
	
	public static final String MAP_SYMBOL = "->";
	
	private Map<String,String> attributes;
	private RAExpr relation;
	
	public Rename(RAExpr relation, Map<String,String> attributes) {
		super(Type.RENAME);
		this.relation = relation;
		this.attributes = new HashMap<String,String>(attributes);
	}
	
	@Override
	public String toString() {
		List<String> subst = new ArrayList<String>();
 		for (String k : attributes.keySet()) {
			subst.add(String.format("%s%s%s", k, MAP_SYMBOL, attributes.get(k)));
		}
 		return String.format("%s[%s](%s)", Type.RENAME.getConnective(), String.join(",",subst), relation);
	}

	@Override
	public Signature signature(Schema s) throws SchemaException {
		Signature sigRel = relation.signature(s);
		
		Set<String> attrSet = new HashSet<>(sigRel.getAttributes());
		List<Column.Type> type = new ArrayList<>(sigRel.getTypes());
		
		if (attrSet.size() != sigRel.getAttributes().size()) {
			//throw error if there are duplicate attribute names
			throw new SchemaException(SchemaException.ErrorMessage.DUPLICATE_ATTR.getErrorMessage());
		}
		
		List<String> oldName = new ArrayList<>(attributes.keySet());
		Set<String> newName = new HashSet<>(attributes.values());

		for (String n : newName) {
			/*
			 * if we are renaming an attribute to the same name as another attribute
			 * that already exists and that attribute itself is not being renamed or
			 * it is being renamed but to the same name then throw error
			 */
			if (attrSet.contains(n) && (!oldName.contains(n) || (oldName.contains(n) && attributes.get(n).equals(n)))) {
				throw new SchemaException(SchemaException.ErrorMessage.RENAME_ERROR.getErrorMessage());
			}
		}
		
		List<String> attrList = new ArrayList<>(sigRel.getAttributes());
		if (!attrList.containsAll(oldName) || oldName.size() != newName.size()) {
			throw new SchemaException(SchemaException.ErrorMessage.RENAME_ERROR.getErrorMessage());
		} else {
			for (int i = 0; i < attrList.size(); i++) {
				if (oldName.contains(attrList.get(i))) {
					String tempVal = attrList.remove(i);
					attrList.add(i, attributes.get(tempVal));
				}
			}
			return new BaseSignature(attrList,type,sigRel.isOrdered());
		}
	}

	@Override
	public Table executeValid(Database db) {
		return TableOperations.Rename(attributes, relation.executeValid(db));
	}
}
