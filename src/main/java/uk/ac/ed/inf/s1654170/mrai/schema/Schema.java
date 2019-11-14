package uk.ac.ed.inf.s1654170.mrai.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import uk.ac.ed.inf.s1654170.mrai.schema.Column.Type;

public class Schema {
	
	private Map<String,Signature> relations;
	
	public Schema(String relations) { //Map<String,Signature> relations
		//this.relations = new HashMap<>(relations);
		this.relations = new HashMap<>(formatInput(relations));
	}
	
	private HashMap<String,Signature> formatInput(String rel) {
		HashMap<String,Signature> returnRelations = new HashMap<>();
		
		//remove any whitespace that might be in the input
		rel = rel.replaceAll(" ", "");
		
		String[] relations = rel.split(";");
		for (String relation : relations) {
			List<String> attr = new ArrayList<>();
			List<Type> type = new ArrayList<>();
			
			String[] relAttributes = relation.split(":");
			String relName = relAttributes[0];
			
			String[] attributes = relAttributes[1].split(",");
			for (String attribute : attributes) {
				String[] attributeType = attribute.split("/");
				attr.add(attributeType[0]);
				type.add(Type.valueOf(attributeType[1]));
			}
			
			Signature sig = new BaseSignature(attr, type);
			returnRelations.put(relName, sig);
		}
		
		return returnRelations;
	}
	
	public Set<String> getRelations() {
		return relations.keySet();
	}
	
	public Signature getSignature(String relName) {
		return relations.get(relName);
	}
}