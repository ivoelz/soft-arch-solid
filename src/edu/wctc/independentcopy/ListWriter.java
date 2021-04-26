package edu.wctc.independentcopy;

import edu.wctc.independentcopy.writer.Writer;

import java.util.ArrayList;
import java.util.List;

public class ListWriter implements Writer {

    @Override
    public void writeln(String line) {
        List<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);
    }
}
