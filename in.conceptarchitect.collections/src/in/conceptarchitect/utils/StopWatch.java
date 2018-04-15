package in.conceptarchitect.utils;

import java.util.logging.Logger;

public class StopWatch {
	
	public <T> Result<T> run(Function<T> function,String caption) {
		long start=0;
		Logger logger=Logger.getLogger(StopWatch.class.getName());
		Result<T> result=null;
		try {
			
			start=System.currentTimeMillis();
			T r=function.execute();
			result= new Result<T>(diff(start),r);
			
			
		}catch(Exception ex) {
			logger.warning("action threw "+ex);
			result= new Result<T>(diff(start),ex);
		}
		finally {
			logger.info(String.format("%s : Total Time Taken is %d ms",caption, result.getTimeTaken()));
		}
		
		return result;
	}
	
	public long run(Action action, String caption) {
		
		Result<Object> result= run(new Function<Object>() {

			@Override
			public Object execute() {
				// TODO Auto-generated method stub
				action.execute();
				return null;
			}
			
		},caption);
		
		return result.getTimeTaken();
		
	}

	private long diff(long start) {
		// TODO Auto-generated method stub
		return System.currentTimeMillis() - start;
	}

}
