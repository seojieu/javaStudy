package l.io.ex3;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		File f = new File(file);
		return fd.checkName(file);
	}
	
	public void fileSave(String file, StringBuilder sb) {
		
	}
	
	public StringBuilder fileOpen(String file) {
		
	}
	
	public void fileEdit(String file, StringBuilder sb) {
		
	}
}
