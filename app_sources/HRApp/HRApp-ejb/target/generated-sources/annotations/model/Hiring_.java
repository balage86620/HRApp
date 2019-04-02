package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Hiring.class)
public abstract class Hiring_ {

	public static volatile SingularAttribute<Hiring, String> jobName;
	public static volatile ListAttribute<Hiring, Degree2hiring> degree2hiringList;
	public static volatile SingularAttribute<Hiring, Integer> jobId;
	public static volatile SingularAttribute<Hiring, String> salaryCategory;
	public static volatile SingularAttribute<Hiring, Date> addedAt;
	public static volatile SingularAttribute<Hiring, String> jobLocation;
	public static volatile ListAttribute<Hiring, Skill2hiring> skill2hiringList;
	public static volatile SingularAttribute<Hiring, String> jobDescription;
	public static volatile SingularAttribute<Hiring, Integer> id;
	public static volatile ListAttribute<Hiring, Application> applicationList;

}

