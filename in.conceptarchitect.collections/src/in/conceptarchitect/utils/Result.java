package in.conceptarchitect.utils;

public class Result<T> {

	long timeTaken;
	T result;
	Throwable error;
	
	public long getTimeTaken() {
		return timeTaken;
	}
	
	public T getResult() {
		return result;
	}
	
	public Result(long timeTaken, T result) {
		super();
		this.timeTaken = timeTaken;
		this.result = result;
	}
	
	public Result(long timeTaken, Throwable exception) {
		super();
		this.timeTaken = timeTaken;
		this.error=exception;
	}
	
	public Throwable getError() {
		return error;
	}

	public void setError(Throwable error) {
		this.error = error;
	}
	
	public boolean isSuccess() { return error==null;}
	
	
	
}
