import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProductRead {

    public static String[] findProductInfo(int targetId){
        try (BufferedReader reader = new BufferedReader(new FileReader("src/product"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());

                if (id == targetId) {
                    return new String[]{parts[1].trim(), parts[2].trim()};
                }
            }
        }
        catch(IOException e){
            System.out.println("Could not read file");
        }


        return null;
    }
}
