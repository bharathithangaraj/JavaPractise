import java.io.File;

/**
bharathi.thangaraj
 */
public class FindListOfFile {

	
	public static void main(String[] args) {
		
		//String path= new File("D:/Amigo/PRJ-00000327/UAT_Merged/Obsidian/");
		
		listFiles("C:/Users/bharathi.thangaraj/Desktop/PRJ-00000327/Flex/");
		
		System.out.println("\n");
		listFiles("D:/Amigo/PRJ-00000327/ProdMerge/Flex/");

	}
	
	private static void listFiles(String path)
    {
        File folder = new File(path);
         
        File[] files = folder.listFiles();
         
        for (File file : files) 
        {
            if (file.isFile())
            {
                System.out.println(file.getName());
            }
            else if (file.isDirectory())
            {
                listFiles(file.getAbsolutePath());
            }
        }
    }

}
