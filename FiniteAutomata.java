import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class FiniteAutomata {
    Set<String> states;
    Set<String> inputs;
    String initialState;
    Set<String> finalState;
    Map<compoundKey, String> transitions;

    public FiniteAutomata(){
        states = new HashSet<>();
        inputs = new HashSet<>();
        initialState = "";
        finalState = new HashSet<>();
        transitions = new HashMap<>();
        ReadFromFile();
    }

    private void ReadFromFile(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("FA.txt"));

            //the finite set of states
            String line = reader.readLine();
            Collections.addAll(states, line.split(" "));


            //the finite set of inputs
            line = reader.readLine();
            Collections.addAll(inputs, line.split(" "));


            //the initial state
            line= reader.readLine();
            initialState = line;


            //the final state
            line = reader.readLine();
            Collections.addAll(finalState, line.split(" "));

            //the transitions
            line = reader.readLine();
            while(line != null) {
                List<String> transitions1 = List.of(line.split(" "));
                transitions.put(new compoundKey(transitions1.get(0), transitions1.get(1)), transitions1.get(2));
                line = reader.readLine();
            }

            System.out.print("Finite set of states: ");System.out.println(states);
            System.out.print("Finite set of inputs: ");System.out.println(inputs);
            System.out.print("The initial state: ");System.out.println("["+ initialState + "]");
            System.out.print("The final state: ");System.out.println(finalState);
            System.out.print("The transitions: ");System.out.println(transitions);

            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();

        }
    }
}

