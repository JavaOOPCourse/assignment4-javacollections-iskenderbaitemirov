package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Failed Exam Appeal", 2));
        issues.add(new Issue("Missing Grades", 1));
        issues.add(new Issue("Scholarship Review", 3));
        issues.add(new Issue("Course Registration Error", 1));
        issues.add(new Issue("Library Fine Dispute", 5));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if (!issues.isEmpty()) {
            System.out.println("Most urgent issue: " + issues.peek());
        } else {
            System.out.println("No issues in the queue.");
        }
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        if (!issues.isEmpty()){
            for (int i = 0; i < 2 ; i++) {
                Issue resolved = issues.poll();
                System.out.println("Resolved: " + resolved);
            }
        }
        else {
            System.out.println("Error, no issues in the queue.");
        }
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        System.out.println("Remaining Issues:\n");
        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------");
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description, urgency));
        System.out.println("New issue added: " + description + " (urgency: " + urgency + ")");
    }
}
