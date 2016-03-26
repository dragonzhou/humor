package factory;

public class StudentWorkFactory implements IWork {

	public Work getWork() {
	
			return (new StudentWork());
	}

}
