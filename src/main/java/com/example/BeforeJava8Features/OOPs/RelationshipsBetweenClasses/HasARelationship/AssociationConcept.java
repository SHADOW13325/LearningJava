package com.example.BeforeJava8Features.OOPs.RelationshipsBetweenClasses.HasARelationship;

/**
 * @author saumitra chauhan
 */
public class AssociationConcept {

    public static void main(String[] args) {

        College college = new College("Computer Science");
        college.teach();
        Professor professor = new Professor("Anonymous");
        college.setProfessor(professor);
        college.teach();
    }
}

final class College {

    private Professor professor;

/*
    Aggregation as professor class object will live even after college class object will be destroyed.
    Hence, it is weak association
*/
    void setProfessor(Professor professor){
        this.professor = professor;
    }

    void teach(){
        if(professor != null){
            professor.teach();
        } else {
            System.out.println("Professor is not allocated");
        }
    }

    private Branches branches;

/*
    Composition as there is a dependency of Branches class object on College class object.
    Branches class object lives and dies with College class object. Hence, it is strong association
*/
    public College(String branches) {
            this.branches = new Branches(branches);
        }
}

class Professor {

    private String name;

    public String getName() {
        return name;
    }

    public Professor(String name) {
        this.name = name;
    }

    public void teach(){
        System.out.println("Professor " + this.name + " is teaching the class");
    }
}

class Branches {

    private String branchNames;

    public String getBranchNames() {
        return branchNames;
    }

    public Branches(String branchNames) {
        this.branchNames = branchNames;
    }
}

/*
    In Has-A Relationship there is a relationship between two separate classes established using objects.
    It can be one-one, many-one, many-many. It can be associated through aggregation or composition
*/