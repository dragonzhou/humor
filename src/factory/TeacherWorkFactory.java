package factory;

public class TeacherWorkFactory implements IWork {

	public Work getWork() {
		
		return (new TeacherWork());
	}

}
