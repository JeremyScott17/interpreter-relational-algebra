package uk.ac.ed.inf.s1654170.mrai.instance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import uk.ac.ed.inf.s1654170.mrai.schema.Column;
import uk.ac.ed.inf.s1654170.mrai.schema.Signature;

public class Table extends ArrayList<Record> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2180789515268198297L;
	
	private Signature signature;
	
	public Table(Signature signature) {
		this.signature = signature;
	}
	
	public Signature getSignature() {
		return signature;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Table) {
			Table oTable = new Table(((Table) o).getSignature());
			oTable.addAll((Table) o);
			if (signature.isOrdered() && oTable.getSignature().isOrdered()) {
				//columns are ordered
				boolean sameAttr = signature.getAttributes().equals(oTable.getSignature().getAttributes());
				boolean sameType = signature.getTypes().equals(oTable.getSignature().getTypes());
				if (sameAttr && sameType && this.size() == oTable.size()) {
					//compare records
					for (int i = 0; i < this.size(); i++) {
						if (!this.get(i).equals(oTable.get(i))) {
							//does not equal
							return false;
						}
					}
					return true;
				} else {
					return false;
				}
			} else {
				//columns are unordered
				Set<String> thisSetAttr = new HashSet<>(this.getSignature().getAttributes());
				Set<Column.Type> thisSetType = new HashSet<>(this.getSignature().getTypes());
				Set<String> oTableSetAttr = new HashSet<>(oTable.getSignature().getAttributes());
				Set<Column.Type> oTableSetType = new HashSet<>(oTable.getSignature().getTypes());
				
				boolean sameSetAttr = thisSetAttr.equals(oTableSetAttr);
				boolean sameSetType = thisSetType.equals(oTableSetType);
				
				if (sameSetAttr && sameSetType && this.size() == oTable.size()) {
					//compare records
					for (int i = 0; i < this.size(); i++) {
						Record thisRecord = this.get(i);
						Record oTableRecord = oTable.get(i);
						if (!thisRecord.equals(oTableRecord)) {
							//does not equal
							return false;
						}
					}
					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
	}
}
