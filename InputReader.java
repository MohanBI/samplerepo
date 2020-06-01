import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Max\\Desktop\\Git_Repo\\samplerepo\\system.txt");
		FileInputStream ip=new FileInputStream(f);
		FileReader re=new FileReader(f);
		int i;
		while((i=re.read())!=-1)
			System.out.print((char)i);
		re.close();
		
		
		
	}

}
