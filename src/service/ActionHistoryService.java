package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.push("Submitted Assignment");
        actions.push("Dropped Course");
        actions.push("Registered Course");
        actions.push("Updated Profile");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if (!actions.isEmpty()) {
            String removed = actions.pop();
            System.out.println("Undone action: " + removed);
        } else {
            System.out.println("No actions to undo.");
        }
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.push("Requested Transcript");
        System.out.println("Action added: Requested Transcript");
    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        if (!actions.isEmpty()) {
            System.out.println("First action: " + actions.peekLast());
            System.out.println("Last action: " + actions.peekFirst());
        } else {
            System.out.println("No actions in history.");
        }
    }

    public void printHistory() {
        // TODO: Iterate through history
        System.out.println("Action History: ");
        Iterator<String> it = actions.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
