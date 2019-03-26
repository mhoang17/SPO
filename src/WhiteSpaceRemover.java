import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WhiteSpaceRemover {
    public String remove() {
        // The name of the file to open.
        String fileName = "temp.txt";
        StringBuilder builder = new StringBuilder("");
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                builder.append(line);
            }
            String stringWithSpace = builder.toString();
            stringWithSpace = stringWithSpace.replaceAll("\\s+","");
            // Always close files.
            bufferedReader.close();
            return stringWithSpace;
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }

        throw new IllegalArgumentException();
    }
}
