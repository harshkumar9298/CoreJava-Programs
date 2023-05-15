package test;
public interface Transaction {
	public static final Balance b = new Balance();//reference variable
	public abstract void process(int amt);
	}