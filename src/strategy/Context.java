package strategy;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	public void doMethod()
	{
		strategy.exceuteStrategy();
	}
}
