package model;

public class Issue implements Comparable<Issue> {

    // TODO: declare fields
    private String description;
    private int urgencyLevel; // 1 = most urgent

    // TODO: create constructor
    public Issue(String descrpipt,int urgency){
        description = descrpipt;
        urgencyLevel = urgency;
    }

    // TODO: implement compareTo()
    @Override
    public int compareTo(Issue other) {
        // TODO: implement priority logic
        if (urgencyLevel <  other.urgencyLevel){
            return -1;
        }
        else if (urgencyLevel > other.urgencyLevel){
            return 1;
        }
        else {
            return 0;
        }
    }

    // TODO: override toString()
    @Override
    public String toString(){
        return "Issue{urgencyLevel = " + urgencyLevel + "\n, description :'" + description + "'}";
    }
}
