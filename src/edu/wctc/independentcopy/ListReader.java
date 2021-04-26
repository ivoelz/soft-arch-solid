package edu.wctc.independentcopy;

import edu.wctc.independentcopy.reader.Reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader {
    @Override
    public String readln() {
        List<String> output = new ArrayList<String>();
        output.add("Hi");
        output.add("How are you");
        output.add("Good to see you");
        output.add("Have a good day");
        output.add("Bye");
    }
}
