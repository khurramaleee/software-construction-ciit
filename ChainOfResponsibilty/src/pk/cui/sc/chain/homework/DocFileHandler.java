package pk.cui.sc.chain.homework;

public class DocFileHandler extends BaseHandler{

	public DocFileHandler(String name) {
		super(name);
	}
	public void handle(File file) {
		if(file.getType()==FileType.DOC){
			System.out.println("Processing and saving doc file... by "+name);
		}
		else if(next!=null){
			System.out.println(name+" fowards request to "+next.getName());
			next.handle(file);
		}else{
			System.out.println("File not supported");
		}

	}
}
