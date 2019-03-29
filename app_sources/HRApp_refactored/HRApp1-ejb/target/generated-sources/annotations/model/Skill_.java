package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Skill.class)
public abstract class Skill_ {

	public static volatile ListAttribute<Skill, Skill2person> skill2personList;
	public static volatile ListAttribute<Skill, Skill2hiring> skill2hiringList;
	public static volatile SingularAttribute<Skill, String> name;
	public static volatile SingularAttribute<Skill, Integer> id;
	public static volatile SingularAttribute<Skill, String> type;

}

