
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class QuestionTwo {
	public Map<File,String[]> displayFolderContents(String path){
		Map<File,String[]> map = new HashMap<File,String[]>();
		File file = new File(path);
		File[] files = file.listFiles();
		for (File file2 : files) {
			if(file2.isDirectory()){
				map.put(file2, file2.list());
				displayFolderContents(file2.getPath());
			}
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionTwo ref = new QuestionTwo();
		Map<File,String[]> map = 
		ref.displayFolderContents("C:\\");
	
		Collection<File>c = map.keySet();
		 Collection<String[]>f=map.values();
		 for(File r : c){
			 System.out.println(r);
			 System.out.println("--------------------------------------");
			 if(r.isDirectory()){
		 for (String[] files : f) {
			
			for(String ff : files){
				System.out.println(ff);
			}
		}}
		 }
	}

}
