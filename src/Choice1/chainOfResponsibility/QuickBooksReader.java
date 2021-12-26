package Choice1.chainOfResponsibility;

import Choice1.chainOfResponsibility.DataReader;

public class QuickBooksReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a QuickBooks file.");
    }
}
