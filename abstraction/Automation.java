package abstraction;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {
		Automation a=new Automation();
		a.Selenium();
		a.Java();
		a.Python();
		a.Ruby();
	}

	public void Selenium() 
	{
		System.out.println("selenium supports 3 languages ");
		
		
	}

	public void Java() {
		System.out.println("JAVA");
		
		
	}

	@Override
	public void Ruby()
	{
		System.out.println("RUBY");
		
	}
	
		
	

}
